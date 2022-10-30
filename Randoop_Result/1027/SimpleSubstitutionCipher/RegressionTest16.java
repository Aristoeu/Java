package SimpleSubstitutionCipher;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16 {

    public static boolean debug = false;

    @Test
    public void test08001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08001");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UUNNUUNN!!UUNNUUNN!!UUNNUUNNUUNNUUNN!!UUNNUUNN!!UUNNUUNN!", "UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276nullnull\276\276nullnull!!\276\276nullnull\276\276nullnull!!\276\276nullnull\276\276nullnull\276\276nullnull\276\276nullnull!!\276\276nullnull\276\276nullnull!!\276\276nullnull\276\276nullnull!" + "'", str2, "\276\276nullnull\276\276nullnull!!\276\276nullnull\276\276nullnull!!\276\276nullnull\276\276nullnull\276\276nullnull\276\276nullnull!!\276\276nullnull\276\276nullnull!!\276\276nullnull\276\276nullnull!");
    }

    @Test
    public void test08002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08002");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("lluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUU!", "UELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175!" + "'", str2, "\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175!");
    }

    @Test
    public void test08003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08003");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("}~\200\200}~\200\200nulllulllulllull^nulllulllulllullnulllulllulllullnulllulllulllull^nulllulllulllullnulllulllulllull}~\200\200}~\200\200nulllulllulllull^nulllulllulllullnulllulllulllullnulllulllulllull^nulllulllulllullnulllulllulllull!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08004");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!!", "LL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test08005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08005");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214!", "\275\275\275\275\275\275\275\275LLLLLLLL\275\275\275\275\275\275\275\275LLLLLLLL\275\275\275\275\275\275\275\275LLLLLLLL\275\275\275\275\275\275\275\275LLLLLLLL\275\275\275\275\275\275\275\275LLLLLLLL\275\275\275\275\275\275\275\275LLLLLLLL\275\275\275\275\275\275\275\275LLLLLLLL\275\275\275\275\275\275\275\275LLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275LL\275\275LLL\275LLL\214\214L\275LLL\214\214\275\275LL\275\275LLL\275LLL\214\214L\275LLL\214\214\275\275LL\275\275LLL\275LLL\214\214L\275LLL\214\214\275\275LL\275\275LLL\275LLL\214\214L\275LLL\214\214\275\275LL\275\275LLL\275LLL\214\214L\275LLL\214\214\275\275LL\275\275LLL\275LLL\214\214L\275LLL\214\214\275\275LL\275\275LLL\275LLL\214\214L\275LLL\214\214\275\275LL\275\275LLL\275LLL\214\214L\275LLL\214\214!" + "'", str2, "\275\275LL\275\275LLL\275LLL\214\214L\275LLL\214\214\275\275LL\275\275LLL\275LLL\214\214L\275LLL\214\214\275\275LL\275\275LLL\275LLL\214\214L\275LLL\214\214\275\275LL\275\275LLL\275LLL\214\214L\275LLL\214\214\275\275LL\275\275LLL\275LLL\214\214L\275LLL\214\214\275\275LL\275\275LLL\275LLL\214\214L\275LLL\214\214\275\275LL\275\275LLL\275LLL\214\214L\275LLL\214\214\275\275LL\275\275LLL\275LLL\214\214L\275LLL\214\214!");
    }

    @Test
    public void test08006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08006");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0368\u0368~~!", "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368~~!" + "'", str2, "\u0368\u0368~~!");
    }

    @Test
    public void test08007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08007");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!", "nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``!!nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``!!nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``!!nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``!!nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test08008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08008");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275\u0346\u0348\u0348!");
    }

    @Test
    public void test08009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08009");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!!", "!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!!" + "'", str2, "}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!!");
    }

    @Test
    public void test08010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08010");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0!", "LLUU!!!LLUU!!!LLUU!!!LLUU!!!LLUU!!!LLUU!!!LLUU!!!LLUU!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08011");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!", "\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!" + "'", str2, "LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!");
    }

    @Test
    public void test08012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08012");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\276!~~\276!~~\276!~~\276!~~!", "!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!!!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!!!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!!!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!!!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276!~~\276!~~\276!~~\276!~~!" + "'", str2, "!\276!~~\276!~~\276!~~\276!~~!");
    }

    @Test
    public void test08013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08013");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!", "FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08014");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\200\200\230\230\200\200\230\230!", "\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200\230\230\200\200\230\230!" + "'", str2, "\200\200\230\230\200\200\230\230!");
    }

    @Test
    public void test08015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08015");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d!", "!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08016");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!" + "'", str2, "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!");
    }

    @Test
    public void test08017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08017");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!", "xxxxxxxxxxxxxxxxnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullxxxxxxxxxxxxxxxxnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!" + "'", str2, "XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!");
    }

    @Test
    public void test08018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08018");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!!" + "'", str2, "]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test08019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08019");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "\u0366\u0365\u0368\u0368LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test08020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08020");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da!", "!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da!" + "'", str2, "\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da!");
    }

    @Test
    public void test08021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08021");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!!", "\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!!" + "'", str2, "\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!!");
    }

    @Test
    public void test08022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08022");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull~}}^null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull]]!", "UU!!UU!!!UUU!UUUUU!!UU!!!UUU!UUUUU!!UU!!!UUU!UUUUU!!UU!!!UUU!UUUUU!!UU!!!UUU!UUUUU!!UU!!!UUU!UUUUU!!UU!!!UUU!UUUUU!!UU!!!UUU!UUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUU~}}^UUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUU]]!" + "'", str2, "UUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUU~}}^UUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUUUUUU!UUUUUUUU]]!");
    }

    @Test
    public void test08023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08023");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!", "`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test08024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08024");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("}~\200\200}~\200\200!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]}~\200\200}~\200\200!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!", "\u0346\u0348\u0348\u0348\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]}~\200\200}~\200\200!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!" + "'", str2, "}~\200\200}~\200\200!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]}~\200\200}~\200\200!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!");
    }

    @Test
    public void test08025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08025");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200\336^LL\336^LL}~\200\200}~\200\200\336^LL\336^LL!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200null^nullnullnull^nullnull}~\200\200}~\200\200null^nullnullnull^nullnull!" + "'", str2, "}~\200\200}~\200\200null^nullnullnull^nullnull}~\200\200}~\200\200null^nullnullnull^nullnull!");
    }

    @Test
    public void test08026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08026");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!", "\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276!!\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276!!\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276!!\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276!!\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!" + "'", str2, "]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!");
    }

    @Test
    public void test08027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08027");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnull!!nullnull!!!", "\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test08028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08028");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200\u0348\u0346\u0346!", "]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200]]]]]]]]]]]]]]]]]]]]]]]]]]}~\200\200}~\200\200]]]]]]]]]]]]]]]]]]]]]]]]]]}~\200\200}~\200\200]]]]]]]]]]]]]]]]]]]]]]]]]]}~\200\200}~\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200]]]]]]]]]]]]]]]]]]]]]]]]]]}~\200\200}~\200\200]]]]]]]]]]]]]]]]]]]]]]]]]]}~\200\200}~\200\200]]]]]]]]]]]]]]]]]]]]]]]]]]}~\200\200}~\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test08029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08029");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("OO]]OO]]OO]]OO]]~}}^OO]]OO]]OO]]OO]]]]!", "R!~~R!~~R!~~R!~~R!~~R!~~R!~~R!~~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLR!~~R!~~R!~~R!~~R!~~R!~~R!~~R!~~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~]]~~]]~~]]~~]]~}}^~~]]~~]]~~]]~~]]]]!" + "'", str2, "~~]]~~]]~~]]~~]]~}}^~~]]~~]]~~]]~~]]]]!");
    }

    @Test
    public void test08030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08030");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!!", "nullheenullhee!!``nullheenullhee``nullheenullhee``nullheenullheenullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!``nullheenullhee``nullheenullhee``nullheenullheenullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!!" + "'", str2, "\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!!");
    }

    @Test
    public void test08031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08031");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!", "!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!!!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0260\u0260\u0260\u0260\u0260nullnull!" + "'", str2, "\u0260\u0260\u0260\u0260\u0260nullnull!");
    }

    @Test
    public void test08032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08032");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("HHFFH~~HHFFH~~HHFFH~~HHFFH~~HHFFH~~HHFFH~~HHFFH~~HHFFH~~!", "!!!ll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~!" + "'", str2, "nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~!");
    }

    @Test
    public void test08033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08033");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!T!!!T!!!!!T!!!T!!!!!T!!!T!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!", "`UUUUUUUUUUUU`UUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!" + "'", str2, "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!");
    }

    @Test
    public void test08034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08034");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230\200}}```]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230]]!", "\336!LL\336!LL\336!LL\336!LL\336!LL\336!LL\336!LL\336!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230\200}}```]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230]]!" + "'", str2, "``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230\200}}```]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230]]!");
    }

    @Test
    public void test08035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08035");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300!", "~~!!~~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08036");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullCCCnullCCCnullCCCnullCCC\200}}`nullCCCnullCCCnullCCCnullCCC]]!", "null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212!!null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212!!null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212!!null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212!!null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\210\210LLLLL\210\210LLLLL\210\210LLLLL\210\210LLLLL\200}}`\210\210LLLLL\210\210LLLLL\210\210LLLLL\210\210LLLLL]]!" + "'", str2, "\210\210LLLLL\210\210LLLLL\210\210LLLLL\210\210LLLLL\200}}`\210\210LLLLL\210\210LLLLL\210\210LLLLL\210\210LLLLL]]!");
    }

    @Test
    public void test08037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08037");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("]!null!!!null!!!null!!!null!!!null!!]]!null!!!null!!]]!null!!!null!!]]!null!!!null!!]]]!null!!!null!!!null!!!null!!!null!!]]!null!!!null!!]]!", "Lu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!ll!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200!!]]!" + "'", str2, "\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200!!]]!");
    }

    @Test
    public void test08038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08038");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!!" + "'", str2, "~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!!");
    }

    @Test
    public void test08039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08039");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("````\275````````````\275````````````\275````````````\275````````````\275````````````\275````````````\275````````````\275````````````````````````````````````````````\275````````````\275````````````\275````````````\275````````````\275````````````\275````````````\275````````````\275````````````````````````````````````````!", "\225\225\230\230\225\225\230\230\255\256\260\260\255\256\260\260\225\225\230\230\225\225\230\230\255\256\260\260\255\256\260\260\225\225\230\230\225\225\230\230\255\256\260\260\255\256\260\260\225\225\230\230\225\225\230\230\255\256\260\260\255\256\260\260\225\225\230\230\225\225\230\230\255\256\260\260\255\256\260\260\225\225\230\230\225\225\230\230\255\256\260\260\255\256\260\260\225\225\230\230\225\225\230\230\255\256\260\260\255\256\260\260\225\225\230\230\225\225\230\230\255\256\260\260\255\256\260\260!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````\275````````````\275````````````\275````````````\275````````````\275````````````\275````````````\275````````````\275````````````````````````````````````````````\275````````````\275````````````\275````````````\275````````````\275````````````\275````````````\275````````````\275````````````````````````````````````````!" + "'", str2, "````\275````````````\275````````````\275````````````\275````````````\275````````````\275````````````\275````````````\275````````````````````````````````````````````\275````````````\275````````````\275````````````\275````````````\275````````````\275````````````\275````````````\275````````````````````````````````````````!");
    }

    @Test
    public void test08040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08040");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\u03c0\u03c0\u03c0!]]\275\u03c0\u03c0\u03c0!]]!", "LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226!!LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275null!]]null!]]null!]]\275null!]]null!]]null!]]!" + "'", str2, "\275null!]]null!]]null!]]\275null!]]null!]]null!]]!");
    }

    @Test
    public void test08041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08041");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("F!HHF!HHF!HHF!HHF!HHF!HHF!HHF!HH!", "XXXX\200}}`XXXX]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test08042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08042");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0129\u0129\u0129\u0129nullll!", "!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0315\u0316\u0318\u0318\u0315\u0316\u0318\u0318\u0315\u0316\u0318\u0318\u0315\u0316\u0318\u0318\u0315\u0316\u0318\u0318\u0318\u0318\u0315\u0316\u0318\u0318\u0318\u0318\u0315\u0316\u0318\u0318\u0318\u0318\u0315\u0316\u0318\u0318\u0318\u0318!" + "'", str2, "\u0315\u0316\u0318\u0318\u0315\u0316\u0318\u0318\u0315\u0316\u0318\u0318\u0315\u0316\u0318\u0318\u0315\u0316\u0318\u0318\u0318\u0318\u0315\u0316\u0318\u0318\u0318\u0318\u0315\u0316\u0318\u0318\u0318\u0318\u0315\u0316\u0318\u0318\u0318\u0318!");
    }

    @Test
    public void test08043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08043");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull!", "]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!!" + "'", str2, "\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!!");
    }

    @Test
    public void test08044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08044");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "LIJJLLLLIJJLLLLIJJLLLLIJJLLL\200}}`LIJJLLLLIJJLLLLIJJLLLLIJJLLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08045");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!", "NUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08046");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348\u011e\u011c\u011c\u011c\u0348\u0346\u0346!", "\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test08047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08047");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}}^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test08048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08048");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275\276!\225\225\276!\225\225\200\200\276!\225\225\276!\225\225\200\200\276!\225\225\276!\225\225\200\200\276\276!\225\225\276!\225\225\200\200\275\275!", "\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276!\225\225\276!\225\225\200\200\276!\225\225\276!\225\225\200\200\276!\225\225\276!\225\225\200\200\276\276!\225\225\276!\225\225\200\200\275\275!" + "'", str2, "\275\276!\225\225\276!\225\225\200\200\276!\225\225\276!\225\225\200\200\276!\225\225\276!\225\225\200\200\276\276!\225\225\276!\225\225\200\200\275\275!");
    }

    @Test
    public void test08049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08049");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!]]nullnull!!nullnull!!]]nullnull!!nullnull!!]]nullnull!!nullnull!!]]]nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!]]nullnull!!nullnull!!]]!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!]]nullnull!!nullnull!!!!nullnull!!nullnull!!!!]]nullnull!!nullnull!!!!nullnull!!nullnull!!!!]]nullnull!!nullnull!!!!nullnull!!nullnull!!!!]]]nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!]]nullnull!!nullnull!!!!nullnull!!nullnull!!!!]]!" + "'", str2, "]nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!]]nullnull!!nullnull!!!!nullnull!!nullnull!!!!]]nullnull!!nullnull!!!!nullnull!!nullnull!!!!]]nullnull!!nullnull!!!!nullnull!!nullnull!!!!]]]nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!]]nullnull!!nullnull!!!!nullnull!!nullnull!!!!]]!");
    }

    @Test
    public void test08050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08050");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!", "\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08051");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016enullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08052");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!", "H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226!!H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226!!H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226!!H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226!!H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!" + "'", str2, "!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!");
    }

    @Test
    public void test08053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08053");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test08054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08054");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LLUU\226\230\230LLUULLUULLUULLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUULLUULLUULLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230!", "PNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!!PP!!PPPNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!!PP!!PPPNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!!PP!!PPPNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!!PP!!PPPNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!!PP!!PPPNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!!PP!!PPPNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!!PP!!PPPNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!!PP!!PP!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\226\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230!" + "'", str2, "nullnullnullnull\226\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230!");
    }

    @Test
    public void test08055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08055");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232!", "nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232!" + "'", str2, "~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232!");
    }

    @Test
    public void test08056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08056");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UULLUULLUULLUULLUULL!", "\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08057");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL!", "``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200````````````````````~}\200\200~}\200\200````````````````````~}\200\200~}\200\200````````````````````~}\200\200~}\200\200````````````````````~}\200\200~}\200\200````````````````````~}\200\200~}\200\200````````````````````~}\200\200~}\200\200````````````````````~}\200\200~}\200\200````````````````````!" + "'", str2, "~}\200\200~}\200\200````````````````````~}\200\200~}\200\200````````````````````~}\200\200~}\200\200````````````````````~}\200\200~}\200\200````````````````````~}\200\200~}\200\200````````````````````~}\200\200~}\200\200````````````````````~}\200\200~}\200\200````````````````````~}\200\200~}\200\200````````````````````!");
    }

    @Test
    public void test08058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08058");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]]UU]]UU!!]]UU]]UU!!]]UU]]UU]]UU]]UU!!]]UU]]UU!!]]UU]]UU!", "nullnull!!!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]!!]]!!!!]]!!]]!!!!]]!!]]!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!" + "'", str2, "]]!!]]!!!!]]!!]]!!!!]]!!]]!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!");
    }

    @Test
    public void test08059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08059");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\200\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220]]!", "NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test08060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08060");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08061");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220!", "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220!" + "'", str2, "LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220!");
    }

    @Test
    public void test08062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08062");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!!", "}nullnullnullnullnullnullnullnullnullnullnullnull~}}^}nullnullnullnullnullnullnullnullnullnullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!!" + "'", str2, "!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!!");
    }

    @Test
    public void test08063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08063");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253!", "`UUUUUUUUUUUU`UUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253!" + "'", str2, "\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253!");
    }

    @Test
    public void test08064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08064");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e!", "\u014c\u016e\u016c\u016c\u016e\u016c\u016c\u014c\u016e\u016c\u016c\u016e\u016c\u016c\u014c\u016e\u016c\u016c\u016e\u016c\u016c\u014c\u016e\u016c\u016c\u016e\u016c\u016c\u014c\u016e\u016c\u016c\u016e\u016c\u016c!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08065");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("}!\200\200}!\200\200}!\200\200}!\200\200\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215}!\200\200}!\200\200}!\200\200}!\200\200\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215!", "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031anullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}!\200\200}!\200\200}!\200\200}!\200\200\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215}!\200\200}!\200\200}!\200\200}!\200\200\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215!" + "'", str2, "}!\200\200}!\200\200}!\200\200}!\200\200\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215}!\200\200}!\200\200}!\200\200}!\200\200\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215!");
    }

    @Test
    public void test08066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08066");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e!", "\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!" + "'", str2, "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!");
    }

    @Test
    public void test08067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08067");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8ULLLULLLULLLULLLULLLULLLULLLULLL!", "\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ!" + "'", str2, "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ!");
    }

    @Test
    public void test08068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08068");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!LLNN!", "\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnull!" + "'", str2, "!nullnullnullnull!");
    }

    @Test
    public void test08069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08069");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!", "`!!LL!!LL!!LL`!!LL!!LL!!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!" + "'", str2, "!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!");
    }

    @Test
    public void test08070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08070");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!]]!!]]N!!!N!!!!!]]!!]]N!!!N!!!!", "````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!]]!!]]null!!!null!!!!!]]!!]]null!!!null!!!!" + "'", str2, "!!]]!!]]null!!!null!!!!!]]!!]]null!!!null!!!!");
    }

    @Test
    public void test08071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08071");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "}~\200\200}~\200\200FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF}~\200\200}~\200\200FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08072");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08073");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\260!", "``nullnullnullnull``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\260!" + "'", str2, "!\260!");
    }

    @Test
    public void test08074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08074");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("`]```]``!!`]```]``!!`]```]```]```]``!!`]```]``!!`]```]``!", "nullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`]```]``!!`]```]``!!`]```]```]```]``!!`]```]``!!`]```]``!" + "'", str2, "`]```]``!!`]```]``!!`]```]```]```]``!!`]```]``!!`]```]``!");
    }

    @Test
    public void test08075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08075");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226!!LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226!!!", "\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0220\u0220\u0220\u0220\230\226\226\u0220\u0220\u0220\u0220\230\226\226\u0220\u0220\u0220\u0220\230\226\226\u0220\u0220\u0220\u0220\230\226\226\u0220\u0220\u0220\u0220\230\226\226\u0220\u0220\u0220\u0220\230\226\226\u0220\u0220\u0220\u0220\230\226\226\u0220\u0220\u0220\u0220\230\226\226\u0220\u0220\u0220\u0220\230\226\226\u0220\u0220\u0220\u0220\230\226\226\u0220\u0220\u0220\u0220\230\226\226\u0220\u0220\u0220\u0220\230\226\226\u0220\u0220\u0220\u0220\230\226\226\u0220\u0220\u0220\u0220\230\226\226\u0220\u0220\u0220\u0220\230\226\226\u0220\u0220\u0220\u0220\230\226\226!!!" + "'", str2, "\u0220\u0220\u0220\u0220\230\226\226\u0220\u0220\u0220\u0220\230\226\226\u0220\u0220\u0220\u0220\230\226\226\u0220\u0220\u0220\u0220\230\226\226\u0220\u0220\u0220\u0220\230\226\226\u0220\u0220\u0220\u0220\230\226\226\u0220\u0220\u0220\u0220\230\226\226\u0220\u0220\u0220\u0220\230\226\226\u0220\u0220\u0220\u0220\230\226\226\u0220\u0220\u0220\u0220\230\226\226\u0220\u0220\u0220\u0220\230\226\226\u0220\u0220\u0220\u0220\230\226\226\u0220\u0220\u0220\u0220\230\226\226\u0220\u0220\u0220\u0220\230\226\226\u0220\u0220\u0220\u0220\230\226\226\u0220\u0220\u0220\u0220\230\226\226!!!");
    }

    @Test
    public void test08076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08076");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("ualluallualluallualluall!!!!ualluallualluallualluall!!!!!!ualluallualluallualluall!!!!ualluallualluallualluall!!!!!!ualluallualluallualluall!!!!ualluallualluallualluall!!!!!!ualluallualluallualluall!!!!ualluallualluallualluall!!!!!!ualluallualluallualluall!!!!ualluallualluallualluall!!!!!!ualluallualluallualluall!!!!ualluallualluallualluall!!!!!!ualluallualluallualluall!!!!ualluallualluallualluall!!!!!!ualluallualluallualluall!!!!ualluallualluallualluall!!!!!!!", "\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276!!\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276!!\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276!!\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276!!\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L\335UUL\335UUL\335UUL\335UUL\335UUL\335UU!!!!L\335UUL\335UUL\335UUL\335UUL\335UUL\335UU!!!!!!L\335UUL\335UUL\335UUL\335UUL\335UUL\335UU!!!!L\335UUL\335UUL\335UUL\335UUL\335UUL\335UU!!!!!!L\335UUL\335UUL\335UUL\335UUL\335UUL\335UU!!!!L\335UUL\335UUL\335UUL\335UUL\335UUL\335UU!!!!!!L\335UUL\335UUL\335UUL\335UUL\335UUL\335UU!!!!L\335UUL\335UUL\335UUL\335UUL\335UUL\335UU!!!!!!L\335UUL\335UUL\335UUL\335UUL\335UUL\335UU!!!!L\335UUL\335UUL\335UUL\335UUL\335UUL\335UU!!!!!!L\335UUL\335UUL\335UUL\335UUL\335UUL\335UU!!!!L\335UUL\335UUL\335UUL\335UUL\335UUL\335UU!!!!!!L\335UUL\335UUL\335UUL\335UUL\335UUL\335UU!!!!L\335UUL\335UUL\335UUL\335UUL\335UUL\335UU!!!!!!L\335UUL\335UUL\335UUL\335UUL\335UUL\335UU!!!!L\335UUL\335UUL\335UUL\335UUL\335UUL\335UU!!!!!!!" + "'", str2, "L\335UUL\335UUL\335UUL\335UUL\335UUL\335UU!!!!L\335UUL\335UUL\335UUL\335UUL\335UUL\335UU!!!!!!L\335UUL\335UUL\335UUL\335UUL\335UUL\335UU!!!!L\335UUL\335UUL\335UUL\335UUL\335UUL\335UU!!!!!!L\335UUL\335UUL\335UUL\335UUL\335UUL\335UU!!!!L\335UUL\335UUL\335UUL\335UUL\335UUL\335UU!!!!!!L\335UUL\335UUL\335UUL\335UUL\335UUL\335UU!!!!L\335UUL\335UUL\335UUL\335UUL\335UUL\335UU!!!!!!L\335UUL\335UUL\335UUL\335UUL\335UUL\335UU!!!!L\335UUL\335UUL\335UUL\335UUL\335UUL\335UU!!!!!!L\335UUL\335UUL\335UUL\335UUL\335UUL\335UU!!!!L\335UUL\335UUL\335UUL\335UUL\335UUL\335UU!!!!!!L\335UUL\335UUL\335UUL\335UUL\335UUL\335UU!!!!L\335UUL\335UUL\335UUL\335UUL\335UUL\335UU!!!!!!L\335UUL\335UUL\335UUL\335UUL\335UUL\335UU!!!!L\335UUL\335UUL\335UUL\335UUL\335UUL\335UU!!!!!!!");
    }

    @Test
    public void test08077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08077");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!", "!l!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!" + "'", str2, "}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!");
    }

    @Test
    public void test08078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08078");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("II!!II!!II!!II!!II!!II!!II!!II!!!", "d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test08079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08079");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368LL!!LL!!!!LL!!LL!!!!\200\200\u0346\u0348\u0348!", "nullnullnullnull\226\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u028b\u028b\u028b\u028b\u028b\u028b\u028b\u028b!!!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u028b\u028b\u028b\u028b\u028b\u028b\u028b\u028b!!!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test08080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08080");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214!", "\u011e\u011e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!" + "'", str2, "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!");
    }

    @Test
    public void test08081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08081");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08082");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200nullnullnullnullnullnullnullnull!", "!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}null\200\200}null\200\200}null\200\200}null\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}null\200\200}null\200\200}null\200\200}null\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "}null\200\200}null\200\200}null\200\200}null\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}null\200\200}null\200\200}null\200\200}null\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08083");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214!", "\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214!");
    }

    @Test
    public void test08084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08084");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!", "LL!!````````````LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!````````````LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!\276\276null!\276\276null!\276\276null!\276\276!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!!!" + "'", str2, "!null!\276\276null!\276\276null!\276\276null!\276\276!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!!!");
    }

    @Test
    public void test08085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08085");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368LL!!LL!!!!LL!!LL!!!!\200\200\u0346\u0348\u0348!", "h]hhh]hh!!h]hhh]hh!!h]hhh]hhh]hhh]hh!!h]hhh]hh!!h]hhh]hh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnull!!nullnull!!!!nullnull!!nullnull!!!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnull!!nullnull!!!!nullnull!!nullnull!!!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test08086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08086");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0348\u0348\u0348\u0248\u0246\u0246\u0246\u0348\u0346\u0346!", "porrporrporrporrporrporrporrporrnullporrnullnullnullporrnullnullporrporrporrporrporrporrporrporrnullporrnullnullnullporrnullnullporrporrporrporrporrporrporrporrnullporrnullnullnullporrnullnullporrporrporrporrporrporrporrporrnullporrnullnullnullporrnullnullporrporrporrporrporrporrporrporrnullporrnullnullnullporrnullnullporrporrporrporrporrporrporrporrnullporrnullnullnullporrnullnullporrporrporrporrporrporrporrporrnullporrnullnullnullporrnullnullporrporrporrporrporrporrporrporrnullporrnullnullnullporrnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test08087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08087");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]!", "UUUUUUUUUUUUUUUU\200}}`UUUUUUUUUUUUUUUU]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]!" + "'", str2, "\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]!");
    }

    @Test
    public void test08088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08088");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test08089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08089");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("L\204LLL\204LLL\204LLL\204LLLLLLLLLLLLLLLLLLL\204LLL\204LLL\204LLL\204LLLLLLLLLL!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\204nullnullnull\204nullnullnull\204nullnullnull\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204nullnullnull\204nullnullnull\204nullnullnull\204nullnullnullnullnullnullnullnullnullnull!" + "'", str2, "null\204nullnullnull\204nullnullnull\204nullnullnull\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204nullnullnull\204nullnullnull\204nullnullnull\204nullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08090");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200!!]]!", "LLUULLUULLUULLUULLUULLUULLUULLUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!lluunullnullnull!!!lluunullnullnull!!!lluunullnullnull!!!lluunullnullnull!!!lluunullnullnull!!]]!lluunullnullnull!!!lluunullnullnull!!]]!lluunullnullnull!!!lluunullnullnull!!]]!lluunullnullnull!!!lluunullnullnull!!]]]!lluunullnullnull!!!lluunullnullnull!!!lluunullnullnull!!!lluunullnullnull!!!lluunullnullnull!!]]!lluunullnullnull!!!lluunullnullnull!!]]!" + "'", str2, "]!lluunullnullnull!!!lluunullnullnull!!!lluunullnullnull!!!lluunullnullnull!!!lluunullnullnull!!]]!lluunullnullnull!!!lluunullnullnull!!]]!lluunullnullnull!!!lluunullnullnull!!]]!lluunullnullnull!!!lluunullnullnull!!]]]!lluunullnullnull!!!lluunullnullnull!!!lluunullnullnull!!!lluunullnullnull!!!lluunullnullnull!!]]!lluunullnullnull!!!lluunullnullnull!!]]!");
    }

    @Test
    public void test08091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08091");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253\u0346\u0348\u0348!", "\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!!\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!!\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!!\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!!\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253\u0346\u0348\u0348!");
    }

    @Test
    public void test08092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08092");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!", "F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!!F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!!F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!!F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!!F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!" + "'", str2, "FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!");
    }

    @Test
    public void test08093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08093");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!]]nullnull!!nullnull!!]]nullnull!!nullnull!!]]nullnull!!nullnull!!]]]nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!]]nullnull!!nullnull!!]]!", "\300\300\276\276\300\300\276\276}}\300\300\276\276\300\300\276\276}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]\276!\340\340\276!\340\340!!\276!\340\340\276!\340\340!!\276!\340\340\276!\340\340!!\276!\340\340\276!\340\340!!\276!\340\340\276!\340\340!!]]\276!\340\340\276!\340\340!!\276!\340\340\276!\340\340!!]]\276!\340\340\276!\340\340!!\276!\340\340\276!\340\340!!]]\276!\340\340\276!\340\340!!\276!\340\340\276!\340\340!!]]]\276!\340\340\276!\340\340!!\276!\340\340\276!\340\340!!\276!\340\340\276!\340\340!!\276!\340\340\276!\340\340!!\276!\340\340\276!\340\340!!]]\276!\340\340\276!\340\340!!\276!\340\340\276!\340\340!!]]!" + "'", str2, "]\276!\340\340\276!\340\340!!\276!\340\340\276!\340\340!!\276!\340\340\276!\340\340!!\276!\340\340\276!\340\340!!\276!\340\340\276!\340\340!!]]\276!\340\340\276!\340\340!!\276!\340\340\276!\340\340!!]]\276!\340\340\276!\340\340!!\276!\340\340\276!\340\340!!]]\276!\340\340\276!\340\340!!\276!\340\340\276!\340\340!!]]]\276!\340\340\276!\340\340!!\276!\340\340\276!\340\340!!\276!\340\340\276!\340\340!!\276!\340\340\276!\340\340!!\276!\340\340\276!\340\340!!]]\276!\340\340\276!\340\340!!\276!\340\340\276!\340\340!!]]!");
    }

    @Test
    public void test08094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08094");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0143\u0145\u0145\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0143\u0145\u0145\u0145\u0143\u0145\u0143!!!", "\215}\215\215\215}\215\215nullnullnullnull\215}\215\215\215}\215\215!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnullnull!!nullnull!!nullnull!!nullnull!!null!nullnullnullnull!!nullnull!!!" + "'", str2, "null!nullnullnullnull!!nullnull!!nullnull!!nullnull!!null!nullnullnullnull!!nullnull!!!");
    }

    @Test
    public void test08095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08095");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!", "\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!" + "'", str2, "U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!");
    }

    @Test
    public void test08096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08096");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!!", "!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!!!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!!!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!!!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!!!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!!" + "'", str2, "]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!!");
    }

    @Test
    public void test08097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08097");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!~UU!!!!~UU!!!!!!~UU!!!!~UU!!!!!!~UU!!!!~UU!!!!~UU!!!!~UU!!!!!!~UU!!!!~UU!!!!!!~UU!!!!~UU!!!", "\u0366\u0365\u0368\u0368\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!\200\200\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!" + "'", str2, "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!");
    }

    @Test
    public void test08098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08098");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UNLLnullnullnullUNLLnullnullnullUNLLnullnullnullUNLLnullnullnullUNLLnullnullnullUNLLnullnullnullUNLLnullnullnullUNLLnullnullnull!", "\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u029b\ua7b0\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0!" + "'", str2, "\u029b\ua7b0\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0!");
    }

    @Test
    public void test08099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08099");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08100");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230\200\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230]]!", "LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226!!LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230\200\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230]]!" + "'", str2, "\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230\200\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230]]!");
    }

    @Test
    public void test08101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08101");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!", "\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08102");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200\u02b1\u02b2\u02b4\u02b4\u02b1\u02b2\u02b4\u02b4}~\200\200}~\200\200\u02b1\u02b2\u02b4\u02b4\u02b1\u02b2\u02b4\u02b4!", "FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull!" + "'", str2, "}~\200\200}~\200\200nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08103");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031anullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08104");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\253\256\256\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test08105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08105");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUU!", "UNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0!" + "'", str2, "\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0!");
    }

    @Test
    public void test08106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08106");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!", "LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUUnullnullnullnullLNUULNUULNUULNUULNUULNUUnullnullnullnullLNUULNUULNUULNUULNUULNUUnullnullnullnullLNUULNUULNUULNUULNUULNUUnullnullnullnullLNUULNUULNUULNUULNUULNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!" + "'", str2, "UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!");
    }

    @Test
    public void test08107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08107");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNN!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08108");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLL!!!LLLL!!!!", "`OROOOROOOROO`OROOOROOOROO!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OOOOOOOO!!OOOOOOOO!!OOOOOOOO!!OOOOOOOO!!OOOO!!!OOOO!!!OOOO!!!OOOO!!!OOOOOOOO!!OOOOOOOO!!OOOOOOOO!!OOOOOOOO!!OOOO!!!OOOO!!!!" + "'", str2, "OOOOOOOO!!OOOOOOOO!!OOOOOOOO!!OOOOOOOO!!OOOO!!!OOOO!!!OOOO!!!OOOO!!!OOOOOOOO!!OOOOOOOO!!OOOOOOOO!!OOOOOOOO!!OOOO!!!OOOO!!!!");
    }

    @Test
    public void test08109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08109");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08110");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!", "!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!" + "'", str2, "\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!");
    }

    @Test
    public void test08111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08111");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!\200}}`!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!]]!", "\275nullnull\200\200nullnull\200\200nullnull\200\200\276nullnull\200\200\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!\200}}`!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!]]!" + "'", str2, "!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!\200}}`!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!]]!");
    }

    @Test
    public void test08112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08112");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!", "\u0366\u0365\u0368\u0368\335\340\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN!!``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN!!``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN!!``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN!!``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN!" + "'", str2, "``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN!!``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN!!``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN!!``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN!!``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN!");
    }

    @Test
    public void test08113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08113");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255!", "!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255!" + "'", str2, "\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255!");
    }

    @Test
    public void test08114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08114");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!", "LJ\225\225LJ\225\225LJ\225\225LJ\225\225LJ\225\225LJ\225\225LJ\225\225LJ\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jl\225\225jl\225\225jl\225\225jl\225\225jl\225\225jl\225\225jl\225\225jl\225\225jl\225\225jl\225\225jl\225\225jl\225\225jl\225\225jl\225\225jl\225\225jl\225\225``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!" + "'", str2, "jl\225\225jl\225\225jl\225\225jl\225\225jl\225\225jl\225\225jl\225\225jl\225\225jl\225\225jl\225\225jl\225\225jl\225\225jl\225\225jl\225\225jl\225\225jl\225\225``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!");
    }

    @Test
    public void test08115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08115");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0315\u0316\u0318\u0318\u0315\u0316\u0318\u0318\u0315\u0316\u0318\u0318\u0315\u0316\u0318\u0318\u0315\u0316\u0318\u0318\u0318\u0318\u0315\u0316\u0318\u0318\u0318\u0318\u0315\u0316\u0318\u0318\u0318\u0318\u0315\u0316\u0318\u0318\u0318\u0318!", "UNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0315\u0316\u0318\u0318\u0315\u0316\u0318\u0318\u0315\u0316\u0318\u0318\u0315\u0316\u0318\u0318\260\253\256\256\u0315\u0316\u0318\u0318\u0318\u0318\260\253\256\256\u0315\u0316\u0318\u0318\u0318\u0318\260\253\256\256\u0315\u0316\u0318\u0318\u0318\u0318\260\253\256\256\u0315\u0316\u0318\u0318\u0318\u0318!" + "'", str2, "\u0315\u0316\u0318\u0318\u0315\u0316\u0318\u0318\u0315\u0316\u0318\u0318\u0315\u0316\u0318\u0318\260\253\256\256\u0315\u0316\u0318\u0318\u0318\u0318\260\253\256\256\u0315\u0316\u0318\u0318\u0318\u0318\260\253\256\256\u0315\u0316\u0318\u0318\u0318\u0318\260\253\256\256\u0315\u0316\u0318\u0318\u0318\u0318!");
    }

    @Test
    public void test08116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08116");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}!" + "'", str2, "~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}!");
    }

    @Test
    public void test08117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08117");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368nullnullnullnull!!!", "nullnullnullnull\200}}`nullnullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368unllunllunllunll!!!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368unllunllunllunll!!!");
    }

    @Test
    public void test08118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08118");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test08119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08119");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08120");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214!", "\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNN\214\214LNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNN\214\214LNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNN\214\214LNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNN\214\214LNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNN\214\214LNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNN\214\214LNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNN\214\214LNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNN\214\214!" + "'", str2, "LNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNN\214\214LNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNN\214\214LNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNN\214\214LNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNN\214\214LNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNN\214\214LNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNN\214\214LNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNN\214\214LNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNN\214\214!");
    }

    @Test
    public void test08121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08121");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!", "^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!" + "'", str2, "!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!");
    }

    @Test
    public void test08122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08122");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!", "!\275nullnull!\275nullnull!\275nullnull!\275nullnull!\275nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08123");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("`E]EEE]EEE]EE`E]EEE]EEE]EE!", "HH!!HH!!HHHH!!HH!!HH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`null]nullnullnull]nullnullnull]nullnull`null]nullnullnull]nullnullnull]nullnull!" + "'", str2, "`null]nullnullnull]nullnullnull]nullnull`null]nullnullnull]nullnullnull]nullnull!");
    }

    @Test
    public void test08124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08124");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214!", "\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!" + "'", str2, "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!");
    }

    @Test
    public void test08125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08125");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnull!", "\u0366\u0365\u0368\u0368ULLLULLL!!ULLLULLL!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!" + "'", str2, "!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!");
    }

    @Test
    public void test08126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08126");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "NLLLNLLLNLLLNLLL\200}}`NLLLNLLLNLLLNLLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test08127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08127");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!\276!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276!" + "'", str2, "!\276!");
    }

    @Test
    public void test08128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08128");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!", "\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!" + "'", str2, "NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!");
    }

    @Test
    public void test08129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08129");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test08130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08130");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275NULLNULLNULL\276NULL\275\275!", "\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\215\216\220\220\215\216\220\220\215\216\220\220\276\215\216\220\220\275\275!" + "'", str2, "\275\215\216\220\220\215\216\220\220\215\216\220\220\276\215\216\220\220\275\275!");
    }

    @Test
    public void test08131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08131");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\200unll\220\220\200unll\220\220\200unll\220\220\200unll\220\220\200unll\220\220\200unll\220\220\200unll\220\220\200unll\220\220!", "NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\u01f8\u01fb\u01fb\220\220\200\u01f8\u01fb\u01fb\220\220\200\u01f8\u01fb\u01fb\220\220\200\u01f8\u01fb\u01fb\220\220\200\u01f8\u01fb\u01fb\220\220\200\u01f8\u01fb\u01fb\220\220\200\u01f8\u01fb\u01fb\220\220\200\u01f8\u01fb\u01fb\220\220!" + "'", str2, "\200\u01f8\u01fb\u01fb\220\220\200\u01f8\u01fb\u01fb\220\220\200\u01f8\u01fb\u01fb\220\220\200\u01f8\u01fb\u01fb\220\220\200\u01f8\u01fb\u01fb\220\220\200\u01f8\u01fb\u01fb\220\220\200\u01f8\u01fb\u01fb\220\220\200\u01f8\u01fb\u01fb\220\220!");
    }

    @Test
    public void test08132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08132");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de!!!", "`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test08133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08133");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!", "!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test08134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08134");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!", "!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test08135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08135");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!" + "'", str2, "\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!");
    }

    @Test
    public void test08136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08136");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test08137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08137");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368!U\276\276\230U\215\215\230U\215\215\230U\215\215!U\276\276\230U\215\215\230U\215\215\230U\215\215!!!U\276\276\230U\215\215\230U\215\215\230U\215\215!U\276\276\230U\215\215\230U\215\215\230U\215\215!!!U\276\276\230U\215\215\230U\215\215\230U\215\215!U\276\276\230U\215\215\230U\215\215\230U\215\215!!!U\276\276\230U\215\215\230U\215\215\230U\215\215!U\276\276\230U\215\215\230U\215\215\230U\215\215\u0346\u0348\u0348!", "}null\200\200}null\200\200}null\200\200}null\200\200\u029e\u029e\u029e\u029enullnullnull}null\200\200}null\200\200}null\200\200}null\200\200\u029e\u029enullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!\200\276\276\230\200\215\215\230\200\215\215\230\200\215\215!\200\276\276\230\200\215\215\230\200\215\215\230\200\215\215!!!\200\276\276\230\200\215\215\230\200\215\215\230\200\215\215!\200\276\276\230\200\215\215\230\200\215\215\230\200\215\215!!!\200\276\276\230\200\215\215\230\200\215\215\230\200\215\215!\200\276\276\230\200\215\215\230\200\215\215\230\200\215\215!!!\200\276\276\230\200\215\215\230\200\215\215\230\200\215\215!\200\276\276\230\200\215\215\230\200\215\215\230\200\215\215\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!\200\276\276\230\200\215\215\230\200\215\215\230\200\215\215!\200\276\276\230\200\215\215\230\200\215\215\230\200\215\215!!!\200\276\276\230\200\215\215\230\200\215\215\230\200\215\215!\200\276\276\230\200\215\215\230\200\215\215\230\200\215\215!!!\200\276\276\230\200\215\215\230\200\215\215\230\200\215\215!\200\276\276\230\200\215\215\230\200\215\215\230\200\215\215!!!\200\276\276\230\200\215\215\230\200\215\215\230\200\215\215!\200\276\276\230\200\215\215\230\200\215\215\230\200\215\215\u0346\u0348\u0348!");
    }

    @Test
    public void test08138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08138");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220!", "]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL!!]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL!!]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL!!]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL!!]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\220\220\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\220\220\220\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\220\220\220\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\220\220\220\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\220\220\220\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\220\220\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\220\220\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\220\220!" + "'", str2, "\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\220\220\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\220\220\220\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\220\220\220\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\220\220\220\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\220\220\220\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\220\220\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\220\220\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\220\220!");
    }

    @Test
    public void test08139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08139");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!", "!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!" + "'", str2, "!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!");
    }

    @Test
    public void test08140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08140");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\253\256\256\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test08141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08141");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200\u0348\u0346\u0346!", "`ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL`ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test08142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08142");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("ULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLL!", "\275null!]]null!]]null!]]\275null!]]null!]]null!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "giiigiiiiigiiigiiiiigiiigiiiiigiiigiiiiigiiigiiiiigiiigiiiiigiiigiiiiigiiigiiiii!" + "'", str2, "giiigiiiiigiiigiiiiigiiigiiiiigiiigiiiiigiiigiiiiigiiigiiiiigiiigiiiiigiiigiiiii!");
    }

    @Test
    public void test08143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08143");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08144");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!\200\200\u0346\u0348\u0348!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214!!\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214!!!!\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214!!\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214!!!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214!!\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214!!!!\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214!!\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214\211\212\214\214!!!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test08145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08145");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``!" + "'", str2, "\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``!");
    }

    @Test
    public void test08146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08146");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test08147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08147");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a!!!", "F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullF!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!!" + "'", str2, "UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!!");
    }

    @Test
    public void test08148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08148");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!\200}}`!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!]]!", "nullnullnullnullabddabddabddabddnullnullnullnullabddabdd!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!\200}}`!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!]]!" + "'", str2, "!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!\200}}`!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!]]!");
    }

    @Test
    public void test08149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08149");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08150");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\300\300\275\275\300\300\275\275\300\300\275\275\300\300\275\275\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\300\300\275\275\300\300\275\275!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275LLL\275LLL\275LLL\275LLLLL\275\275LL\275\275LL\275\275LL\275\275\275LLL\275LLL\275LLL\275LLLLL\275\275LL\275\275!" + "'", str2, "\275LLL\275LLL\275LLL\275LLLLL\275\275LL\275\275LL\275\275LL\275\275\275LLL\275LLL\275LLL\275LLLLL\275\275LL\275\275!");
    }

    @Test
    public void test08151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08151");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02faLNNNLNNNLNNN!", "oprroprroprroprroprroprroprroprr!!!!!!!!oprroprroprroprroprroprroprroprr!!!!!!!!oprroprroprroprroprroprroprroprr!!!!!!!!oprroprroprroprroprroprroprroprr!!!!!!!!oprroprroprroprroprroprroprroprr!!!!!!!!oprroprroprroprroprroprroprroprr!!!!!!!!oprroprroprroprroprroprroprroprr!!!!!!!!oprroprroprroprroprroprroprroprr!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fanullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fanullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08152");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("hfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHH!", "}null\200\200}null\200\200}null\200\200}null\200\200L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~}null\200\200}null\200\200}null\200\200}null\200\200L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08153");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!" + "'", str2, "UNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
    }

    @Test
    public void test08154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08154");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll\200}}`ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll]]!", "I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!II\200}}`I!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!II]]!" + "'", str2, "I!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!II\200}}`I!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!II]]!");
    }

    @Test
    public void test08155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08155");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]!", "OO]]OO]]OO]]OO]]~}}^OO]]OO]]OO]]OO]]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]!" + "'", str2, "]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]!");
    }

    @Test
    public void test08156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08156");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302!", "\u03c0\u03c0\u03be\u03be\u03c0\u03c0\u03be\u03be\u03c0\u03c0\u03be\u03be\u03c0\u03c0\u03be\u03be}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302!" + "'", str2, "\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302!");
    }

    @Test
    public void test08157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08157");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0109\u0107\u0107\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0109\u0107\u0107\u0346\u0348\u0348!");
    }

    @Test
    public void test08158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08158");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348LNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!" + "'", str2, "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!");
    }

    @Test
    public void test08159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08159");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LUUULUUU\254\254LUUULUUU\254\254]]LUUULUUU\254\254LUUULUUU\254\254]]\214LUUULUUU\254\254LUUULUUU\254\254LUUULUUU\254\254\214LUUULUUU\254\254LUUULUUU\254\254LUUULUUU\254\254LUUULUUU\254\254LUUULUUU\254\254]]LUUULUUU\254\254LUUULUUU\254\254]]\214LUUULUUU\254\254LUUULUUU\254\254LUUULUUU\254\254\214LUUULUUU\254\254LUUULUUU\254\254LUUULUUU\254\254!", "\276!!!\276!!!\276!!!\276!!!\200}}`\276!!!\276!!!\276!!!\276!!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254]]!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254]]\214!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254\214!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254]]!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254]]\214!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254\214!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254!" + "'", str2, "!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254]]!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254]]\214!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254\214!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254]]!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254]]\214!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254\214!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254!");
    }

    @Test
    public void test08160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08160");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!!", "nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU!!\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU!!\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU!!\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU!!\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU!!\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU!!\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU!!\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU!!!" + "'", str2, "\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU!!\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU!!\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU!!\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU!!\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU!!\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU!!\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU!!\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU!!!");
    }

    @Test
    public void test08161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08161");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\253\254\256\256!JJJ!JJJ!JJJ!JJJ\253\254\256\256!JJJ!JJJ!", "\u0317\u031a\u0317\u031a\u0317\u031a\u0317\u031aU`UUU`UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256!nullnullnull!nullnullnull!nullnullnull!nullnullnull\253\254\256\256!nullnullnull!nullnullnull!" + "'", str2, "\253\254\256\256!nullnullnull!nullnullnull!nullnullnull!nullnullnull\253\254\256\256!nullnullnull!nullnullnull!");
    }

    @Test
    public void test08162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08162");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUU!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380!" + "'", str2, "\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380!");
    }

    @Test
    public void test08163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08163");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd!", "N!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03aenullnull!" + "'", str2, "\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03ae\u03b0\u03ae\u03aenullnull!");
    }

    @Test
    public void test08164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08164");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200!", "NN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200!" + "'", str2, "nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200!");
    }

    @Test
    public void test08165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08165");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0nullnull!", "\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038enullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUU!" + "'", str2, "LNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUU!");
    }

    @Test
    public void test08166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08166");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230!", "\336\300\300\300\300\336\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230!" + "'", str2, "~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230!");
    }

    @Test
    public void test08167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08167");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200!!!!", "}~\200\200}~\200\200FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF}~\200\200}~\200\200FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnull!!!nullnullnullnull!!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnull!!!nullnullnullnull!!!!");
    }

    @Test
    public void test08168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08168");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!", "!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!" + "'", str2, "!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!");
    }

    @Test
    public void test08169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08169");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!", "!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!" + "'", str2, "!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!");
    }

    @Test
    public void test08170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08170");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!\260!", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\260!" + "'", str2, "!\260!");
    }

    @Test
    public void test08171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08171");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!!\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!!\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!!\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!!\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!", "\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!!\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!!\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!!\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!!\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!" + "'", str2, "\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!!\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!!\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!!\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!!\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!");
    }

    @Test
    public void test08172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08172");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!", "NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356!" + "'", str2, "\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356!");
    }

    @Test
    public void test08173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08173");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("N!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LL!!N!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LL!!N!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LL!!N!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LL!!N!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LL!", "\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120!" + "'", str2, "\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120!");
    }

    @Test
    public void test08174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08174");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u016e\u016e\u016e\u016e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u016e\u016e\u016e\u016e!", "u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0153\u0153\u0153\u0153\u0153\u0153\u0153\u0153\u0153\u0153\u0153\u0153nullnullnullnull!" + "'", str2, "\u0153\u0153\u0153\u0153\u0153\u0153\u0153\u0153\u0153\u0153\u0153\u0153nullnullnullnull!");
    }

    @Test
    public void test08175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08175");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test08176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08176");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!", "UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161nullnull!!!!!" + "'", str2, "\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161nullnull!!!!!");
    }

    @Test
    public void test08177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08177");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!!", "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test08178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08178");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246!!!", "NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN\200}}`NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!");
    }

    @Test
    public void test08179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08179");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnullnullnullnullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnullnullnullnullnull\204\204nullnull\204\204!", "\275nullnull\230\230\u0366nullnull\230\230nullnull\230\230nullnull\230\230\u0366nullnull\230\230nullnull\230\230\200\200nullnull\230\230\u0366nullnull\230\230nullnull\230\230nullnull\230\230\u0366nullnull\230\230nullnull\230\230\200\200nullnull\230\230\u0366nullnull\230\230nullnull\230\230nullnull\230\230\u0366nullnull\230\230nullnull\230\230\200\200\276nullnull\230\230\u0366nullnull\230\230nullnull\230\230nullnull\230\230\u0366nullnull\230\230nullnull\230\230\200\200\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\204\204\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\204\204\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\204\204\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\204\204\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\204\204\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\204\204!" + "'", str2, "\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\204\204\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\204\204\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\204\204\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\204\204\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\204\204\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\204\204!");
    }

    @Test
    public void test08180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08180");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e!!!", "``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0nullnullnullnull!!!" + "'", str2, "\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0nullnullnullnull!!!");
    }

    @Test
    public void test08181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08181");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "!!nullnullnull!!!!nullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08182");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("FF]]FF]]FF]]FF]]~}}^FF]]FF]]FF]]FF]]]]!", "null\225\230\230null\225\230\230null\225\230\230null\225\230\230\200}}`null\225\230\230null\225\230\230null\225\230\230null\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull]]nullnull]]nullnull]]nullnull]]~}}^nullnull]]nullnull]]nullnull]]nullnull]]]]!" + "'", str2, "nullnull]]nullnull]]nullnull]]nullnull]]~}}^nullnull]]nullnull]]nullnull]]nullnull]]]]!");
    }

    @Test
    public void test08183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08183");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!nullnull!!nullnull!", "\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198nullnullnull~~~~~~~!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!NLLLNLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!!NLLLNLLL!!NLLLNLLL!" + "'", str2, "!NLLLNLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!!NLLLNLLL!!NLLLNLLL!");
    }

    @Test
    public void test08184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08184");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("hh!!hh!!!", "^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test08185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08185");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("U!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNN!!U!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNN!!U!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNN!!U!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNN!!U!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNN!", "~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUU!!L!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUU!!L!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUU!!L!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUU!!L!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUU!" + "'", str2, "L!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUU!!L!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUU!!L!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUU!!L!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUU!!L!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUUL!LLL!LLLLUULLUU!");
    }

    @Test
    public void test08186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08186");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~!", "uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~!" + "'", str2, "\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~!");
    }

    @Test
    public void test08187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08187");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201!" + "'", str2, "\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201!");
    }

    @Test
    public void test08188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08188");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII!", "\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!" + "'", str2, "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
    }

    @Test
    public void test08189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08189");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08190");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!" + "'", str2, "\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!");
    }

    @Test
    public void test08191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08191");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}N\200\200}N\200\200}N\200\200}N\200\200ULLLULLLULLLULLL}N\200\200}N\200\200}N\200\200}N\200\200ULLLULLL!", "}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}U\200\200}U\200\200}U\200\200}U\200\200NLLLNLLLNLLLNLLL}U\200\200}U\200\200}U\200\200}U\200\200NLLLNLLL!" + "'", str2, "}U\200\200}U\200\200}U\200\200}U\200\200NLLLNLLLNLLLNLLL}U\200\200}U\200\200}U\200\200}U\200\200NLLLNLLL!");
    }

    @Test
    public void test08192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08192");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230\200}}`~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230]]!", "N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~!~~\225\230\230~!~~\225\230\230~!~~\225\230\230~!~~\225\230\230\200}}`~!~~\225\230\230~!~~\225\230\230~!~~\225\230\230~!~~\225\230\230]]!" + "'", str2, "~!~~\225\230\230~!~~\225\230\230~!~~\225\230\230~!~~\225\230\230\200}}`~!~~\225\230\230~!~~\225\230\230~!~~\225\230\230~!~~\225\230\230]]!");
    }

    @Test
    public void test08193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08193");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!" + "'", str2, "\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!");
    }

    @Test
    public void test08194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08194");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("]]!!]]!!!!]]!!]]!!!!]]!!]]!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!", "}~\200\200}~\200\200NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL}~\200\200}~\200\200NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]!!]]!!!!]]!!]]!!!!]]!!]]!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!" + "'", str2, "]]!!]]!!!!]]!!]]!!!!]]!!]]!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!");
    }

    @Test
    public void test08195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08195");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276!", "\u014b!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!" + "'", str2, "nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!");
    }

    @Test
    public void test08196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08196");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!", "U!LLU!LL!!U!LLU!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!O!!!O!!nullorrnullorrnullorrnullorrnullorrnullorrnullorrnullorr!O!!!O!!nullorrnullorrnullorrnullorrnullorrnullorrnullorrnullorr!O!!!O!!nullorrnullorrnullorrnullorrnullorrnullorrnullorrnullorr!O!!!O!!nullorrnullorrnullorrnullorrnullorrnullorrnullorrnullorr!O!!!O!!nullorrnullorrnullorrnullorrnullorrnullorrnullorrnullorr!O!!!O!!nullorrnullorrnullorrnullorrnullorrnullorrnullorrnullorr!O!!!O!!nullorrnullorrnullorrnullorrnullorrnullorrnullorrnullorr!O!!!O!!nullorrnullorrnullorrnullorrnullorrnullorrnullorrnullorr!" + "'", str2, "!O!!!O!!nullorrnullorrnullorrnullorrnullorrnullorrnullorrnullorr!O!!!O!!nullorrnullorrnullorrnullorrnullorrnullorrnullorrnullorr!O!!!O!!nullorrnullorrnullorrnullorrnullorrnullorrnullorrnullorr!O!!!O!!nullorrnullorrnullorrnullorrnullorrnullorrnullorrnullorr!O!!!O!!nullorrnullorrnullorrnullorrnullorrnullorrnullorrnullorr!O!!!O!!nullorrnullorrnullorrnullorrnullorrnullorrnullorrnullorr!O!!!O!!nullorrnullorrnullorrnullorrnullorrnullorrnullorrnullorr!O!!!O!!nullorrnullorrnullorrnullorrnullorrnullorrnullorrnullorr!");
    }

    @Test
    public void test08197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08197");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248!", "LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JJLL\275JJLLJJLLJJLL\275JJLLJJLLJJLL\275JJLLJJLLJJLL\275JJLLJJLLJJLL\275JJLLJJLLJJLL\275JJLLJJLLJJLL\275JJLLJJLLJJLL\275JJLLJJLLnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullJJLL\275JJLLJJLLJJLL\275JJLLJJLLJJLL\275JJLLJJLLJJLL\275JJLLJJLLJJLL\275JJLLJJLLJJLL\275JJLLJJLLJJLL\275JJLLJJLLJJLL\275JJLLJJLLnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "JJLL\275JJLLJJLLJJLL\275JJLLJJLLJJLL\275JJLLJJLLJJLL\275JJLLJJLLJJLL\275JJLLJJLLJJLL\275JJLLJJLLJJLL\275JJLLJJLLJJLL\275JJLLJJLLnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullJJLL\275JJLLJJLLJJLL\275JJLLJJLLJJLL\275JJLLJJLLJJLL\275JJLLJJLLJJLL\275JJLLJJLLJJLL\275JJLLJJLLJJLL\275JJLLJJLLJJLL\275JJLLJJLLnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08198");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220!", "\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220!" + "'", str2, "\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220!");
    }

    @Test
    public void test08199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08199");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("FF!!FF!!!", "\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test08200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08200");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull\200}}`!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull]]!", "\275null!]]null!]]null!]]\275null!]]null!]]null!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]\200}}`!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]]]!" + "'", str2, "!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]\200}}`!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]]]!");
    }

    @Test
    public void test08201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08201");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```!", "!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```!" + "'", str2, "\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```!");
    }

    @Test
    public void test08202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08202");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "\u0366\u0365\u0368\u0368!\200\276\276\230\200\215\215\230\200\215\215\230\200\215\215!\200\276\276\230\200\215\215\230\200\215\215\230\200\215\215!!!\200\276\276\230\200\215\215\230\200\215\215\230\200\215\215!\200\276\276\230\200\215\215\230\200\215\215\230\200\215\215!!!\200\276\276\230\200\215\215\230\200\215\215\230\200\215\215!\200\276\276\230\200\215\215\230\200\215\215\230\200\215\215!!!\200\276\276\230\200\215\215\230\200\215\215\230\200\215\215!\200\276\276\230\200\215\215\230\200\215\215\230\200\215\215\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test08203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08203");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0406\u0406!", "\u0346\u0348\u0348\u0348\275\275\275\275\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!" + "'", str2, "nullnull!");
    }

    @Test
    public void test08204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08204");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346~~!!!" + "'", str2, "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346~~!!!");
    }

    @Test
    public void test08205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08205");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("`oprroprroprr`oprroprroprr!", "!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`N!!!N!!!N!!!`N!!!N!!!N!!!!" + "'", str2, "`N!!!N!!!N!!!`N!!!N!!!N!!!!");
    }

    @Test
    public void test08206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08206");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!", "!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08207");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!", "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!" + "'", str2, "!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!");
    }

    @Test
    public void test08208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08208");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!!" + "'", str2, "\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!!");
    }

    @Test
    public void test08209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08209");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!u!", "null!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0186!" + "'", str2, "\u0186!");
    }

    @Test
    public void test08210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08210");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!!", "LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!!" + "'", str2, "\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!!");
    }

    @Test
    public void test08211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08211");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test08212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08212");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UNLLUNLL!!UNLLUNLL!!!", "\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254nullx]]nullx]]nullx]]nullx]]nullx]]nullx]]nullx]]nullx]]\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254nullx]]nullx]]nullx]]nullx]]nullx]]nullx]]nullx]]nullx]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\275\254\254\254\275\254\254!!\254\275\254\254\254\275\254\254!!!" + "'", str2, "\254\275\254\254\254\275\254\254!!\254\275\254\254\254\275\254\254!!!");
    }

    @Test
    public void test08213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08213");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!", "^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!" + "'", str2, "]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!");
    }

    @Test
    public void test08214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08214");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!", "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200!!NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200!!NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200!!NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200!!NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!" + "'", str2, "\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!");
    }

    @Test
    public void test08215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08215");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0420\u0420\u0420\u0420!!!", "HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test08216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08216");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NL!!NL!!!", "UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UU!!UU!!!" + "'", str2, "UU!!UU!!!");
    }

    @Test
    public void test08217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08217");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u0346\u0348\u0348!", "fehhfehhnullnullfehhfehhnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test08218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08218");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "nullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08219");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UUUUUUUUUUUUUUUU\200}}`UUUUUUUUUUUUUUUU]]!", "}null\200\200}null\200\200}null\200\200}null\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}null\200\200}null\200\200}null\200\200}null\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\200\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6]]!" + "'", str2, "\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\200\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6]]!");
    }

    @Test
    public void test08220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08220");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256!", "UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256!" + "'", str2, "\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256!");
    }

    @Test
    public void test08221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08221");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214!", "]!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]]!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214!" + "'", str2, "\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214!");
    }

    @Test
    public void test08222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08222");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!U!", "\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0226!" + "'", str2, "\u0226!");
    }

    @Test
    public void test08223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08223");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("ss!!ss!!!", "~}\200\200~}\200\200LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230~}\200\200~}\200\200LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230~}\200\200~}\200\200LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230~}\200\200~}\200\200LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230~}\200\200~}\200\200LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230~}\200\200~}\200\200LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230~}\200\200~}\200\200LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230~}\200\200~}\200\200LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test08224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08224");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLL!", "hnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FLLLFLLLLLFLLLFLLLLL!!FLLLFLLLLLFLLLFLLLLL!!FLLLFLLLLLFLLLFLLLLLFLLLFLLLLLFLLLFLLLLL!!FLLLFLLLLLFLLLFLLLLL!!FLLLFLLLLLFLLLFLLLLL!" + "'", str2, "FLLLFLLLLLFLLLFLLLLL!!FLLLFLLLLLFLLLFLLLLL!!FLLLFLLLLLFLLLFLLLLLFLLLFLLLLLFLLLFLLLLL!!FLLLFLLLLLFLLLFLLLLL!!FLLLFLLLLLFLLLFLLLLL!");
    }

    @Test
    public void test08225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08225");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!", "null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!" + "'", str2, "!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!");
    }

    @Test
    public void test08226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08226");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\200}}`\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254]]!", "!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\200}}`\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254]]!" + "'", str2, "\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\200}}`\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254]]!");
    }

    @Test
    public void test08227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08227");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!", "\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226\226!!\226\226!!\226\226!!\226\226!!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!!" + "'", str2, "\226\226!!\226\226!!\226\226!!\226\226!!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!!");
    }

    @Test
    public void test08228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08228");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!!", "xmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxx!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254!!!" + "'", str2, "\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254!!!");
    }

    @Test
    public void test08229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08229");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!", "FH!!FH!!FH!!FH!!FH!!FH!!FH!!FH!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!" + "'", str2, "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!");
    }

    @Test
    public void test08230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08230");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!", "\275\u010c\u010c\275\u010c\u010c!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test08231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08231");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!", "\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08232");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UNLLnullnullnullUNLLnullnullnullUNLLnullnullnullUNLLnullnullnullUNLLnullnullnullUNLLnullnullnullUNLLnullnullnullUNLLnullnullnull!", "~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "X!XXXWWWXWWWXWWWX!XXXWWWXWWWXWWWX!XXXWWWXWWWXWWWX!XXXWWWXWWWXWWWX!XXXWWWXWWWXWWWX!XXXWWWXWWWXWWWX!XXXWWWXWWWXWWWX!XXXWWWXWWWXWWW!" + "'", str2, "X!XXXWWWXWWWXWWWX!XXXWWWXWWWXWWWX!XXXWWWXWWWXWWWX!XXXWWWXWWWXWWWX!XXXWWWXWWWXWWWX!XXXWWWXWWWXWWWX!XXXWWWXWWWXWWWX!XXXWWWXWWWXWWW!");
    }

    @Test
    public void test08233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08233");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d!", "null~}}^null]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08234");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!UUU!UUU!UUU!UUU\200}}`!UUU!UUU!UUU!UUU]]!", "\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\200\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7]]!" + "'", str2, "\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\200\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7]]!");
    }

    @Test
    public void test08235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08235");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u03dd\u03de\u03e0\u03e0nullnullnullnull!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullUNLLUNLLUNLLUNLL!" + "'", str2, "nullnullnullnullUNLLUNLLUNLLUNLL!");
    }

    @Test
    public void test08236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08236");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~}\200\200~}\200\200LLLLLLLL~}\200\200~}\200\200LLLLLLLL~}\200\200~}\200\200LLLLLLLL~}\200\200~}\200\200LLLLLLLL~}\200\200~}\200\200LLLLLLLL~}\200\200~}\200\200LLLLLLLL~}\200\200~}\200\200LLLLLLLL~}\200\200~}\200\200LLLLLLLL!", "\276\276\300\300\276\276\300\300!!\276\276\300\300\276\276\300\300!!\276\276\300\300\276\276\300\300\276\276\300\300\276\276\300\300!!\276\276\300\300\276\276\300\300!!\276\276\300\300\276\276\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull!" + "'", str2, "~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08237");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("ELLLELLLELLLELLL\200}}`ELLLELLLELLLELLL]]!", "!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254]]!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254]]\214!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254\214!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254]]!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254]]\214!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254\214!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276\276\276!\276\276\276!\276\276\276!\276\276\276\200}}`!\276\276\276!\276\276\276!\276\276\276!\276\276\276]]!" + "'", str2, "!\276\276\276!\276\276\276!\276\276\276!\276\276\276\200}}`!\276\276\276!\276\276\276!\276\276\276!\276\276\276]]!");
    }

    @Test
    public void test08238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08238");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276!", "vvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276!" + "'", str2, "nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276!");
    }

    @Test
    public void test08239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08239");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340!", "HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FHHHFHHHHHFHHHFHHHHHFHHHFHHHHHFHHHFHHHHHFHHHFHHHHHFHHHFHHHHHFHHHFHHHHHFHHHFHHHHHFHHHFHHHHHFHHHFHHHHHFHHHFHHHHHFHHHFHHHHHFHHHFHHHHHFHHHFHHHHH!" + "'", str2, "FHHHFHHHHHFHHHFHHHHHFHHHFHHHHHFHHHFHHHHHFHHHFHHHHHFHHHFHHHHHFHHHFHHHHHFHHHFHHHHHFHHHFHHHHHFHHHFHHHHHFHHHFHHHHHFHHHFHHHHHFHHHFHHHHHFHHHFHHHHH!");
    }

    @Test
    public void test08240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08240");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\300\335\335\335\u0346\u0348\u0348!", "N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test08241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08241");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\u0174\u0174\u0174\275\u0174\u0174\u0174!", "UNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnull\275nullnullnull!" + "'", str2, "\275nullnullnull\275nullnullnull!");
    }

    @Test
    public void test08242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08242");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL\200}}`!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0244\u0244\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0244\u0244\u0346\u0348\u0348!");
    }

    @Test
    public void test08243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08243");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!", "\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!" + "'", str2, "!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!");
    }

    @Test
    public void test08244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08244");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!", "fehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!HH!!!HH!!HH!!HH!!!HH!!HH!!HH!!!HH!!HH!!HH!!!HH!!HH!!HH!!!HH!!HH!!HH!!!HH!!HH!!HH!!!HH!!HH!!HH!!!HH!!HH!!HH!!!HH!!HH!!HH!!!HH!!HH!!HH!!!HH!!HH!!HH!!!HH!!HH!!HH!!!HH!!HH!!HH!!!HH!!HH!!HH!!!HH!!HH!!HH!!!HH!!HH!!HH!!!HH!!HH!!HH!!!HH!!HH!!HH!!!HH!!HH!!HH!!!HH!!HH!" + "'", str2, "!!HH!!!HH!!HH!!HH!!!HH!!HH!!HH!!!HH!!HH!!HH!!!HH!!HH!!HH!!!HH!!HH!!HH!!!HH!!HH!!HH!!!HH!!HH!!HH!!!HH!!HH!!HH!!!HH!!HH!!HH!!!HH!!HH!!HH!!!HH!!HH!!HH!!!HH!!HH!!HH!!!HH!!HH!!HH!!!HH!!HH!!HH!!!HH!!HH!!HH!!!HH!!HH!!HH!!!HH!!HH!!HH!!!HH!!HH!!HH!!!HH!!HH!!HH!!!HH!!HH!");
    }

    @Test
    public void test08245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08245");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08246");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("null!nullnull!!!null!nullnull!!!null!nullnull!!!null!nullnull!!!null!nullnull!!!null!nullnull!!!null!nullnull!!!null!nullnull!!!!", "null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\274\275\277\277!\274\275\277\277\274\275\277\277!!!\274\275\277\277!\274\275\277\277\274\275\277\277!!!\274\275\277\277!\274\275\277\277\274\275\277\277!!!\274\275\277\277!\274\275\277\277\274\275\277\277!!!\274\275\277\277!\274\275\277\277\274\275\277\277!!!\274\275\277\277!\274\275\277\277\274\275\277\277!!!\274\275\277\277!\274\275\277\277\274\275\277\277!!!\274\275\277\277!\274\275\277\277\274\275\277\277!!!!" + "'", str2, "\274\275\277\277!\274\275\277\277\274\275\277\277!!!\274\275\277\277!\274\275\277\277\274\275\277\277!!!\274\275\277\277!\274\275\277\277\274\275\277\277!!!\274\275\277\277!\274\275\277\277\274\275\277\277!!!\274\275\277\277!\274\275\277\277\274\275\277\277!!!\274\275\277\277!\274\275\277\277\274\275\277\277!!!\274\275\277\277!\274\275\277\277\274\275\277\277!!!\274\275\277\277!\274\275\277\277\274\275\277\277!!!!");
    }

    @Test
    public void test08247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08247");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\253\254\256\256\253\254\256\256!!\253\254\256\256\253\254\256\256!!!", "!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256\253\254\256\256!!\253\254\256\256\253\254\256\256!!!" + "'", str2, "\253\254\256\256\253\254\256\256!!\253\254\256\256\253\254\256\256!!!");
    }

    @Test
    public void test08248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08248");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08249");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!!" + "'", str2, "\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test08250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08250");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!", "!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN\200}}`!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0264\u0262\u0264\u0262\u0264\u0262\u0264\u0262\u0264\u0262\u0264\u0262\u0264\u0262\u0264\u0262\u0264\u0262\u0264\u0262\u0264\u0262\u0264\u0262nullnull!" + "'", str2, "\u0264\u0262\u0264\u0262\u0264\u0262\u0264\u0262\u0264\u0262\u0264\u0262\u0264\u0262\u0264\u0262\u0264\u0262\u0264\u0262\u0264\u0262\u0264\u0262nullnull!");
    }

    @Test
    public void test08251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08251");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!~U!UUU!UU!~U!UUU!UU!~U!UUU!UU!~U!UUU!UU!~U!UUU!UU!~U!UUU!UU!~U!UUU!UU!~U!UUU!UU!!!~U!UUU!UU!~U!UUU!UU!~U!UUU!UU!~U!UUU!UU!~U!UUU!UU!~U!UUU!UU!~U!UUU!UU!~U!UUU!UU!!!", "EHHHEnullHHEnullHHEnullHHEnullHHEHHHEnullHHEnullHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!!!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!!!" + "'", str2, "!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!!!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!!!");
    }

    @Test
    public void test08252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08252");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366!!!", "null!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366!!!" + "'", str2, "\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366!!!");
    }

    @Test
    public void test08253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08253");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!!", "}}}}}}}}!!!!}}}}}}}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!!" + "'", str2, "^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!!");
    }

    @Test
    public void test08254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08254");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!", "\253\254\256\256``^^``^^``^^``^^\253\254\256\256``^^``^^!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08255");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e!!!", "\u0346\u0348\u0348\u0348\u0345\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test08256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08256");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("bnullnullnullbnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnull!", "!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199!" + "'", str2, "\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199!");
    }

    @Test
    public void test08257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08257");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!!", "`nullhffnullhffnullhff`nullhffnullhffnullhff!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\206\207\211\211\206\207\211\211\211\211\206\207\211\211\206\207\211\211\211\211!!\206\207\211\211\206\207\211\211\211\211\206\207\211\211\206\207\211\211\211\211!!\206\207\211\211\206\207\211\211\211\211\206\207\211\211\206\207\211\211\211\211!!\206\207\211\211\206\207\211\211\211\211\206\207\211\211\206\207\211\211\211\211!!\206\207\211\211\206\207\211\211\211\211\206\207\211\211\206\207\211\211\211\211!!\206\207\211\211\206\207\211\211\211\211\206\207\211\211\206\207\211\211\211\211!!\206\207\211\211\206\207\211\211\211\211\206\207\211\211\206\207\211\211\211\211!!\206\207\211\211\206\207\211\211\211\211\206\207\211\211\206\207\211\211\211\211!!!" + "'", str2, "\206\207\211\211\206\207\211\211\211\211\206\207\211\211\206\207\211\211\211\211!!\206\207\211\211\206\207\211\211\211\211\206\207\211\211\206\207\211\211\211\211!!\206\207\211\211\206\207\211\211\211\211\206\207\211\211\206\207\211\211\211\211!!\206\207\211\211\206\207\211\211\211\211\206\207\211\211\206\207\211\211\211\211!!\206\207\211\211\206\207\211\211\211\211\206\207\211\211\206\207\211\211\211\211!!\206\207\211\211\206\207\211\211\211\211\206\207\211\211\206\207\211\211\211\211!!\206\207\211\211\206\207\211\211\211\211\206\207\211\211\206\207\211\211\211\211!!\206\207\211\211\206\207\211\211\211\211\206\207\211\211\206\207\211\211\211\211!!!");
    }

    @Test
    public void test08258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08258");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("null\260\255\255\225\230\230null\260\255\255\225\230\230null\260\255\255\225\230\230null\260\255\255\225\230\230\200}}`null\260\255\255\225\230\230null\260\255\255\225\230\230null\260\255\255\225\230\230null\260\255\255\225\230\230]]!", "!!!!!!!!\276!!!\276!!!!!!!!!!!\276!!!\276!!!!!!!!!!!\276!!!\276!!!!!!!!!!!\276!!!\276!!!!!!!!!!!\276!!!\276!!!!!!!!!!!\276!!!\276!!!!!!!!!!!\276!!!\276!!!!!!!!!!!\276!!!\276!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230\200}}`nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230]]!" + "'", str2, "nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230\200}}`nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230]]!");
    }

    @Test
    public void test08259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08259");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220!!!", "\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!" + "'", str2, "null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!");
    }

    @Test
    public void test08260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08260");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!\200}}`!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!]]!", "}~\200\200}~\200\200!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335}~\200\200}~\200\200!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!\200}}`!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!]]!" + "'", str2, "!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!\200}}`!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!]]!");
    }

    @Test
    public void test08261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08261");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae!", "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08262");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0225\u0228\u0228\u0228\200\u0225\u0228\u0228\u0228]]!", "N~LLN~LL!!N~LLN~LL!!N~LLN~LLN~LLN~LL!!N~LLN~LL!!N~LLN~LL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\200}}`nullnullnullnull]]!" + "'", str2, "nullnullnullnull\200}}`nullnullnullnull]]!");
    }

    @Test
    public void test08263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08263");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300!", "\u014b\u014c\u014e\u014e\u014b\u014c\u014e\u014e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300!" + "'", str2, "\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300!");
    }

    @Test
    public void test08264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08264");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\ua7ad\ua7ad\ua7ad\ua7ad\200\ua7ad\ua7ad\ua7ad\ua7ad]]!", "!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\200}}`nullnullnullnull]]!" + "'", str2, "nullnullnullnull\200}}`nullnullnullnull]]!");
    }

    @Test
    public void test08265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08265");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!!!!\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a!\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a!\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a!\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a!!!!!\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a!\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a!", "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a!" + "'", str2, "\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a!");
    }

    @Test
    public void test08266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08266");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0!", "fehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehh!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test08267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08267");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\215}\215\215\215}\215\215\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\215}\215\215\215}\215\215!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\215}\215\215\215}\215\215!");
    }

    @Test
    public void test08268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08268");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test08269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08269");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!", "LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230\200}}`LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!" + "'", str2, "!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test08270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08270");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!", "nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUULLUULLUULLUULLUULLUULLUULLUU}}LLUULLUULLUULLUULLUULLUULLUULLUU}}!" + "'", str2, "LLUULLUULLUULLUULLUULLUULLUULLUU}}LLUULLUULLUULLUULLUULLUULLUULLUU}}!");
    }

    @Test
    public void test08271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08271");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!NULLNULL!!NULLNULL!!!!NULLNULL!!NULLNULL!!!!NULLNULL!!NULLNULL!!!!NULLNULL!!NULLNULL!!!!NULLNULL!!NULLNULL!!!!NULLNULL!!NULLNULL!!!!NULLNULL!!NULLNULL!!!!NULLNULL!!NULLNULL!!!", "NNLLLNLLLNLLLNNLLLNLLLNLLLNNLLLNLLLNLLLNNLLLNLLLNLLL\200}}`NNLLLNLLLNLLLNNLLLNLLLNLLLNNLLLNLLLNLLLNNLLLNLLLNLLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!NLLLNLLL!!NLLLNLLL!!!!NLLLNLLL!!NLLLNLLL!!!!NLLLNLLL!!NLLLNLLL!!!!NLLLNLLL!!NLLLNLLL!!!!NLLLNLLL!!NLLLNLLL!!!!NLLLNLLL!!NLLLNLLL!!!!NLLLNLLL!!NLLLNLLL!!!!NLLLNLLL!!NLLLNLLL!!!" + "'", str2, "!!NLLLNLLL!!NLLLNLLL!!!!NLLLNLLL!!NLLLNLLL!!!!NLLLNLLL!!NLLLNLLL!!!!NLLLNLLL!!NLLLNLLL!!!!NLLLNLLL!!NLLLNLLL!!!!NLLLNLLL!!NLLLNLLL!!!!NLLLNLLL!!NLLLNLLL!!!!NLLLNLLL!!NLLLNLLL!!!");
    }

    @Test
    public void test08272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08272");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("x~nullnullx~nullnull!!x~nullnullx~nullnull!!x~nullnullx~nullnullx~nullnullx~nullnull!!x~nullnullx~nullnull!!x~nullnullx~nullnull!", "\u0366\u0365\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368!" + "'", str2, "\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368!");
    }

    @Test
    public void test08273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08273");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!l!", "null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!!null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!!null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!!null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!!null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u03ad!" + "'", str2, "\u03ad!");
    }

    @Test
    public void test08274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08274");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!!", "\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test08275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08275");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!", "\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08276");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!!LL!", "null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u011d\u011d!" + "'", str2, "\u011d\u011d!");
    }

    @Test
    public void test08277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08277");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!!", "\u0366\u0365\u0368\u0368\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!!" + "'", str2, "\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!!");
    }

    @Test
    public void test08278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08278");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8]]!", "nullnull\276\276nullnull\276\276}}nullnull\276\276nullnull\276\276}}!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}nullnullnullnullnullnullnullnullnullnullnullnull~}}^}nullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "}nullnullnullnullnullnullnullnullnullnullnullnull~}}^}nullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test08279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08279");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0348\u0348\u0348\u031a\u031a\u0318\u0318\u0348\u0346\u0346!", "nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!!nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!!nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!!nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!!nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u031a\u031a\u0318\u0318\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u031a\u031a\u0318\u0318\u0348\u0346\u0346!");
    }

    @Test
    public void test08280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08280");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275``UU``UU``UU\276``UU\275\275!", "\200\200!!\200~~\200\200!!\200~~\200\200!!\200~~\200\200!!\200~~\200\200!!\200~~\200\200!!\200~~\200\200!!\200~~\200\200!!\200~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275``~~``~~``~~\276``~~\275\275!" + "'", str2, "\275``~~``~~``~~\276``~~\275\275!");
    }

    @Test
    public void test08281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08281");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnull\214\214nullnull\214\214nullnullnullnullnullnullnullnullnullnull\214\214nullnull\214\214nullnullnullnullnullnullnullnullnullnull\214\214nullnull\214\214nullnullnullnullnullnullnullnullnullnull\214\214nullnull\214\214nullnullnullnullnullnullnullnullnullnull\214\214nullnull\214\214nullnullnullnullnullnullnullnullnullnull\214\214nullnull\214\214nullnullnullnullnullnullnullnullnullnull\214\214nullnull\214\214nullnullnullnullnullnullnullnullnullnull\214\214nullnull\214\214!" + "'", str2, "nullnullnullnullnullnullnullnullnullnull\214\214nullnull\214\214nullnullnullnullnullnullnullnullnullnull\214\214nullnull\214\214nullnullnullnullnullnullnullnullnullnull\214\214nullnull\214\214nullnullnullnullnullnullnullnullnullnull\214\214nullnull\214\214nullnullnullnullnullnullnullnullnullnull\214\214nullnull\214\214nullnullnullnullnullnullnullnullnullnull\214\214nullnull\214\214nullnullnullnullnullnullnullnullnullnull\214\214nullnull\214\214nullnullnullnullnullnullnullnullnullnull\214\214nullnull\214\214!");
    }

    @Test
    public void test08282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08282");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260!!!\255\256\260\260!!!!", "\u0366\u0365\u0368\u0368LL!!LL!!!!LL!!LL!!!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260!!!\255\256\260\260!!!!" + "'", str2, "\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260!!!\255\256\260\260!!!!");
    }

    @Test
    public void test08283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08283");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\236\240\240\240\u0346\u0348\u0348!", "LL!!!!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\236\240\240\240\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\236\240\240\240\u0346\u0348\u0348!");
    }

    @Test
    public void test08284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08284");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220\220\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220\220\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220\220\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220\220\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220\220\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220\220\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220\220\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220\220!" + "'", str2, "\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220\220\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220\220\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220\220\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220\220\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220\220\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220\220\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220\220\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220\220!");
    }

    @Test
    public void test08285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08285");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u020c\u020e\u020e\u020e\u020c\u020e\u020e\u020e\u020c\u020e\u020e\u020e\u020c\u020e\u020e\u020e!!\200\200\u0346\u0348\u0348!", "~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230\200}}`~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test08286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08286");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!", "\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253!!\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253!!\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253!!\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253!!\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!" + "'", str2, "!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!");
    }

    @Test
    public void test08287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08287");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\344\344\344\275\344\344\344\275\344\344\344\275\344\344\344\344\344\275\275\344\344\275\275\344\344\275\275\344\344\275\275\275\344\344\344\275\344\344\344\275\344\344\344\275\344\344\344\344\344\275\275\344\344\275\275!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275!" + "'", str2, "\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275!");
    }

    @Test
    public void test08288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08288");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!", "\214!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!" + "'", str2, "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!");
    }

    @Test
    public void test08289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08289");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("``nullnullnullnull``!", "LIJJLLLLIJJLLLLIJJLLLLIJJLLL\200}}`LIJJLLLLIJJLLLLIJJLLLLIJJLLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``nullnull\234\234nullnull\234\234nullnull\234\234nullnull\234\234``!" + "'", str2, "``nullnull\234\234nullnull\234\234nullnull\234\234nullnull\234\234``!");
    }

    @Test
    public void test08290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08290");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~!" + "'", str2, "}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~!");
    }

    @Test
    public void test08291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08291");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dcnullnull!", "\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHHHHHHHHHH\275\275HHHHHHHH\275\275HHHHHHHH\275\275HHHHHHHH\275\275\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHHHHHHHHHH\275\275HHHHHHHH\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHH!!HHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHH!!HHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHH!!HHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHH!!HHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHH!" + "'", str2, "HHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHH!!HHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHH!!HHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHH!!HHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHH!!HHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHH!");
    }

    @Test
    public void test08292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08292");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("FF]]FF]]FF]]FF]]~}}^FF]]FF]]FF]]FF]]]]!", "ULUUULUULUUULUUUULUUULUULUUULUUUULUUULUULUUULUUUULUUULUULUUULUUUULUUULUULUUULUUUULUUULUULUUULUUUULUUULUULUUULUUUULUUULUULUUULUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull]]nullnull]]nullnull]]nullnull]]~}}^nullnull]]nullnull]]nullnull]]nullnull]]]]!" + "'", str2, "nullnull]]nullnull]]nullnull]]nullnull]]~}}^nullnull]]nullnull]]nullnull]]nullnull]]]]!");
    }

    @Test
    public void test08293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08293");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230\200}}`nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230]]!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230]]!");
    }

    @Test
    public void test08294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08294");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("porrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnull!", "UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLLLNNLLNNNULLNULLLLNNLLNNNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLLLNNLLNNNULLNULLLLNNLLNNNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLLLNNLLNNNULLNULLLLNNLLNNNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLLLNNLLNNNULLNULLLLNNLLNNNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLLLNNLLNNNULLNULLLLNNLLNNNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLLLNNLLNNNULLNULLLLNNLLNNNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLLLNNLLNNNULLNULLLLNNLLNNNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLLLNNLLNNNULLNULLLLNNLLNN!" + "'", str2, "NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLLLNNLLNNNULLNULLLLNNLLNNNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLLLNNLLNNNULLNULLLLNNLLNNNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLLLNNLLNNNULLNULLLLNNLLNNNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLLLNNLLNNNULLNULLLLNNLLNNNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLLLNNLLNNNULLNULLLLNNLLNNNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLLLNNLLNNNULLNULLLLNNLLNNNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLLLNNLLNNNULLNULLLLNNLLNNNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLLLNNLLNNNULLNULLLLNNLLNN!");
    }

    @Test
    public void test08295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08295");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnull\256nullnullnullnullnullnullnullnullnullnullnullnull!", "!!nullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l!uul!uul!uul!uu\256l!uul!uul!uul!uul!uul!uul!uul!uul!uul!uul!uul!uu!" + "'", str2, "l!uul!uul!uul!uu\256l!uul!uul!uul!uul!uul!uul!uul!uul!uul!uul!uul!uu!");
    }

    @Test
    public void test08296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08296");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\u0200\u0200\u0200\u0200nullnull\276\227\227\u0200\u0200\u0200\u0200nullnull\276\227\227\276\276\u0200\u0200\u0200\u0200nullnull\276\227\227\u0200\u0200\u0200\u0200nullnull\276\227\227\276\276\u0200\u0200\u0200\u0200nullnull\276\227\227\u0200\u0200\u0200\u0200nullnull\276\227\227\276\276\u0200\u0200\u0200\u0200nullnull\276\227\227\u0200\u0200\u0200\u0200nullnull\276\227\227\276\276\u0200\u0200\u0200\u0200nullnull\276\227\227\u0200\u0200\u0200\u0200nullnull\276\227\227\276\276\u0200\u0200\u0200\u0200nullnull\276\227\227\u0200\u0200\u0200\u0200nullnull\276\227\227\276\276\u0200\u0200\u0200\u0200nullnull\276\227\227\u0200\u0200\u0200\u0200nullnull\276\227\227\276\276\u0200\u0200\u0200\u0200nullnull\276\227\227\u0200\u0200\u0200\u0200nullnull\276\227\227!" + "'", str2, "\276\276\u0200\u0200\u0200\u0200nullnull\276\227\227\u0200\u0200\u0200\u0200nullnull\276\227\227\276\276\u0200\u0200\u0200\u0200nullnull\276\227\227\u0200\u0200\u0200\u0200nullnull\276\227\227\276\276\u0200\u0200\u0200\u0200nullnull\276\227\227\u0200\u0200\u0200\u0200nullnull\276\227\227\276\276\u0200\u0200\u0200\u0200nullnull\276\227\227\u0200\u0200\u0200\u0200nullnull\276\227\227\276\276\u0200\u0200\u0200\u0200nullnull\276\227\227\u0200\u0200\u0200\u0200nullnull\276\227\227\276\276\u0200\u0200\u0200\u0200nullnull\276\227\227\u0200\u0200\u0200\u0200nullnull\276\227\227\276\276\u0200\u0200\u0200\u0200nullnull\276\227\227\u0200\u0200\u0200\u0200nullnull\276\227\227\276\276\u0200\u0200\u0200\u0200nullnull\276\227\227\u0200\u0200\u0200\u0200nullnull\276\227\227!");
    }

    @Test
    public void test08297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08297");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!", "\u035e\u035e\u035e\u035e\u035e\u035e\u035e\u035e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!" + "'", str2, "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!");
    }

    @Test
    public void test08298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08298");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200!", "EHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200!" + "'", str2, "}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200!");
    }

    @Test
    public void test08299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08299");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231}~\200\200}~\200\200nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231}~\200\200}~\200\200nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231}~\200\200}~\200\200nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231\u0348\u0346\u0346!", "nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200LLUULLUULLUULLUU\226\227\231\231\226\227\231\231\226\227\231\231LLUULLUULLUULLUU\226\227\231\231\226\227\231\231\226\227\231\231}~\200\200}~\200\200LLUULLUULLUULLUU\226\227\231\231\226\227\231\231\226\227\231\231LLUULLUULLUULLUU\226\227\231\231\226\227\231\231\226\227\231\231}~\200\200}~\200\200LLUULLUULLUULLUU\226\227\231\231\226\227\231\231\226\227\231\231LLUULLUULLUULLUU\226\227\231\231\226\227\231\231\226\227\231\231}~\200\200}~\200\200LLUULLUULLUULLUU\226\227\231\231\226\227\231\231\226\227\231\231LLUULLUULLUULLUU\226\227\231\231\226\227\231\231\226\227\231\231\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200LLUULLUULLUULLUU\226\227\231\231\226\227\231\231\226\227\231\231LLUULLUULLUULLUU\226\227\231\231\226\227\231\231\226\227\231\231}~\200\200}~\200\200LLUULLUULLUULLUU\226\227\231\231\226\227\231\231\226\227\231\231LLUULLUULLUULLUU\226\227\231\231\226\227\231\231\226\227\231\231}~\200\200}~\200\200LLUULLUULLUULLUU\226\227\231\231\226\227\231\231\226\227\231\231LLUULLUULLUULLUU\226\227\231\231\226\227\231\231\226\227\231\231}~\200\200}~\200\200LLUULLUULLUULLUU\226\227\231\231\226\227\231\231\226\227\231\231LLUULLUULLUULLUU\226\227\231\231\226\227\231\231\226\227\231\231\u0348\u0346\u0346!");
    }

    @Test
    public void test08300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08300");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III\200}}`!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III]]!", "]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]\200}}`!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]]]!" + "'", str2, "!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]\200}}`!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]]]!");
    }

    @Test
    public void test08301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08301");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08302");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225!", "]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225!" + "'", str2, "nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225!");
    }

    @Test
    public void test08303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08303");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\300\300!!\300\300!!\300\300!!\300\300\u0346\u0348\u0348!", "EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test08304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08304");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("]HHH\200}}`]HHH]]!", "\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]nullnullnull\200}}`]nullnullnull]]!" + "'", str2, "]nullnullnull\200}}`]nullnullnull]]!");
    }

    @Test
    public void test08305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08305");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test08306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08306");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX!", "nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276R\266\266~RR\276R\266\266~RR!!\276R\266\266~RR\276R\266\266~RR!!\276R\266\266~RR\276R\266\266~RR\276R\266\266~RR\276R\266\266~RR!!\276R\266\266~RR\276R\266\266~RR!!\276R\266\266~RR\276R\266\266~RR!" + "'", str2, "\276R\266\266~RR\276R\266\266~RR!!\276R\266\266~RR\276R\266\266~RR!!\276R\266\266~RR\276R\266\266~RR\276R\266\266~RR\276R\266\266~RR!!\276R\266\266~RR\276R\266\266~RR!!\276R\266\266~RR\276R\266\266~RR!");
    }

    @Test
    public void test08307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08307");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0!", "LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08308");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]!", "NULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]!" + "'", str2, "]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]!");
    }

    @Test
    public void test08309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08309");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\266!!!!null\266\266!null\266\266!!!!\266!!!!null\266\266!null\266\266!!!!!!\266!!!!null\266\266!null\266\266!!!!\266!!!!null\266\266!null\266\266!!!!!!\266!!!!null\266\266!null\266\266!!!!\266!!!!null\266\266!null\266\266!!!!!!\266!!!!null\266\266!null\266\266!!!!\266!!!!null\266\266!null\266\266!!!!!!\266!!!!null\266\266!null\266\266!!!!\266!!!!null\266\266!null\266\266!!!!!!\266!!!!null\266\266!null\266\266!!!!\266!!!!null\266\266!null\266\266!!!!!!\266!!!!null\266\266!null\266\266!!!!\266!!!!null\266\266!null\266\266!!!!!!\266!!!!null\266\266!null\266\266!!!!\266!!!!null\266\266!null\266\266!!!!!!!", "FHHHnullnullnullnullFHHHnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!!" + "'", str2, "\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!!");
    }

    @Test
    public void test08310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08310");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226!", "null!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226!");
    }

    @Test
    public void test08311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08311");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "!!!!\300\300!!\300\300!!\300\300!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\300\300!!\300\300!!\300\300!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08312");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!!", "\u0346\u0348\u0348\u0348\253\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!!" + "'", str2, "nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!!");
    }

    @Test
    public void test08313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08313");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull!", "FEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHH!!FEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHH!!FEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHH!!FEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHH!!FEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!!" + "'", str2, "\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!!");
    }

    @Test
    public void test08314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08314");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!", "nullnullnullnullUNLLUNLLUNLLUNLLnullnullnullnullUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!" + "'", str2, "NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!");
    }

    @Test
    public void test08315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08315");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!!", "NNLLLNLLLNLLLNNLLLNLLLNLLLNNLLLNLLLNLLLNNLLLNLLLNLLL\200}}`NNLLLNLLLNLLLNNLLLNLLLNLLLNNLLLNLLLNLLLNNLLLNLLLNLLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL!!\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL!!\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL!!\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL!!\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL!!\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL!!\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL!!\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL!!!" + "'", str2, "\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL!!\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL!!\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL!!\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL!!\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL!!\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL!!\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL!!\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL!!!");
    }

    @Test
    public void test08316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08316");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!!", "!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!!" + "'", str2, "\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!!");
    }

    @Test
    public void test08317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08317");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!", "LUUULUUULUUULUUULUUULUUULUUULUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!");
    }

    @Test
    public void test08318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08318");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("}L\200\200}L\200\200}L\200\200}L\200\200LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL}L\200\200}L\200\200}L\200\200}L\200\200LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL!", "\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}null\200\200}null\200\200}null\200\200}null\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}null\200\200}null\200\200}null\200\200}null\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "}null\200\200}null\200\200}null\200\200}null\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}null\200\200}null\200\200}null\200\200}null\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08319");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!!", "LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!\256\254\254!!!" + "'", str2, "!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!\256\254\254!!!");
    }

    @Test
    public void test08320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08320");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!", "\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dcnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6!" + "'", str2, "\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6!");
    }

    @Test
    public void test08321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08321");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242!!!", "\275\u01ae\u01ad\u01b0\u01b0\u01ae\u01ad\u01b0\u01b0\u01ae\u01ad\u01b0\u01b0\276\u01ae\u01ad\u01b0\u01b0\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test08322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08322");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!!L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!!L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!!L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!!L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!", "!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!" + "'", str2, "!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!~~~!~~~!!!");
    }

    @Test
    public void test08323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08323");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!", "NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!" + "'", str2, "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!");
    }

    @Test
    public void test08324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08324");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u014e\u014e\u014e\u014e!!!", "\305\305\305\305\305\305\305\305\305\305\305\305\305\305\305\305\200}}`\305\305\305\305\305\305\305\305\305\305\305\305\305\305\305\305]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test08325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08325");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\204\204\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\204\204\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\204\204\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\204\204\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\204\204\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\204\204!", "LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!\204\204!!!!!!!!\204\204!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!\204\204!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!\204\204!!!!!!!!\204\204!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!\204\204!");
    }

    @Test
    public void test08326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08326");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~!", "\u0366\u0365\u0368\u0368N!!!N!!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!!!\200null!!\200null!!\200null!!\200null!!~~\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!!!\200null!!\200null!!\200null!!\200null!!~~\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!!!\200null!!\200null!!\200null!!\200null!!~~\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!!!\200null!!\200null!!\200null!!\200null!!~~\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!!!\200null!!\200null!!\200null!!\200null!!~~\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!!!\200null!!\200null!!\200null!!\200null!!~~\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!!!\200null!!\200null!!\200null!!\200null!!~~\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!!!\200null!!\200null!!\200null!!\200null!!~~!" + "'", str2, "\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!!!\200null!!\200null!!\200null!!\200null!!~~\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!!!\200null!!\200null!!\200null!!\200null!!~~\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!!!\200null!!\200null!!\200null!!\200null!!~~\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!!!\200null!!\200null!!\200null!!\200null!!~~\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!!!\200null!!\200null!!\200null!!\200null!!~~\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!!!\200null!!\200null!!\200null!!\200null!!~~\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!!!\200null!!\200null!!\200null!!\200null!!~~\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!!!\200null!!\200null!!\200null!!\200null!!~~!");
    }

    @Test
    public void test08327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08327");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!\204\204!!!!!!!!\204\204!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!\204\204!", "~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!\204\204!!!!!!!!\204\204!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!\204\204!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!\204\204!!!!!!!!\204\204!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!\204\204!");
    }

    @Test
    public void test08328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08328");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08329");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll!", "\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170nullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218!" + "'", str2, "\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218!");
    }

    @Test
    public void test08330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08330");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8]]!", "!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}nullnullnullnullnullnullnullnullnullnullnullnull~}}^}nullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "}nullnullnullnullnullnullnullnullnullnullnullnull~}}^}nullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test08331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08331");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!\271\271!!\271\271\271\271!!\271\271!!!!\271\271!!\271\271\271\271!!\271\271!!!", "!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\271\271!!\271\271\271\271!!\271\271!!!!\271\271!!\271\271\271\271!!\271\271!!!" + "'", str2, "!!\271\271!!\271\271\271\271!!\271\271!!!!\271\271!!\271\271\271\271!!\271\271!!!");
    }

    @Test
    public void test08332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08332");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!" + "'", str2, "!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!");
    }

    @Test
    public void test08333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08333");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248nullnullnull!", "\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!" + "'", str2, "!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!");
    }

    @Test
    public void test08334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08334");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266!", "nullnullnullnull~N\200\200~N\200\200!!!!nullnullnullnull~N\200\200~N\200\200!!!!!!nullnullnullnull~N\200\200~N\200\200!!!!nullnullnullnull~N\200\200~N\200\200!!!!!!nullnullnullnull~N\200\200~N\200\200!!!!nullnullnullnull~N\200\200~N\200\200!!!!!!nullnullnullnull~N\200\200~N\200\200!!!!nullnullnullnull~N\200\200~N\200\200!!!!!!nullnullnullnull~N\200\200~N\200\200!!!!nullnullnullnull~N\200\200~N\200\200!!!!!!nullnullnullnull~N\200\200~N\200\200!!!!nullnullnullnull~N\200\200~N\200\200!!!!!!nullnullnullnull~N\200\200~N\200\200!!!!nullnullnullnull~N\200\200~N\200\200!!!!!!nullnullnullnull~N\200\200~N\200\200!!!!nullnullnullnull~N\200\200~N\200\200!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266!" + "'", str2, "L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266!");
    }

    @Test
    public void test08335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08335");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LULLLULL!!LULLLULL!!LULLLULLLULLLULL!!LULLLULL!!LULLLULL!", "\u02eb\u02ec\u02ee\u02ee\u02cc\u02cb\u02ce\u02ce!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08336");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\u02ee\u02eb\u02ec\u02ecnullnullnull\200\u02ee\u02eb\u02ec\u02ecnullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08337");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NNLLLNLLLNLLLNNLLLNLLLNLLLNNLLLNLLLNLLLNNLLLNLLLNLLL\200}}`NNLLLNLLLNLLLNNLLLNLLLNLLLNNLLLNLLLNLLLNNLLLNLLLNLLL]]!", "\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0}}!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01a7\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\200\u01a7\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa]]!" + "'", str2, "\u01a7\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\200\u01a7\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa]]!");
    }

    @Test
    public void test08338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08338");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08339");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnulljjnullnulljj!!nullnulljjnullnulljj!!nullnulljjnullnulljjnullnulljjnullnulljj!!nullnulljjnullnulljj!!nullnulljjnullnulljj!", "!\253\256\256]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0nullnull!" + "'", str2, "\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0nullnull!");
    }

    @Test
    public void test08340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08340");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230\200}}`LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230]]!", "\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\200}}`\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230]]!" + "'", str2, "\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\200}}`\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230]]!");
    }

    @Test
    public void test08341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08341");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226!!null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test08342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08342");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("null\200\200\200null\200\200\200]]null\200\200\200null\200\200\200]]null\200\200\200null\200\200\200]]null\200\200\200null\200\200\200]]~}}^null\200\200\200null\200\200\200]]null\200\200\200null\200\200\200]]null\200\200\200null\200\200\200]]null\200\200\200null\200\200\200]]]]!", "!~\200\276\276\276\276~~\200\276\276\276\276~~!~\200\276\276\276\276~~\200\276\276\276\276~~!!!~\200\276\276\276\276~~\200\276\276\276\276~~!~\200\276\276\276\276~~\200\276\276\276\276~~!!!~\200\276\276\276\276~~\200\276\276\276\276~~!~\200\276\276\276\276~~\200\276\276\276\276~~!~\200\276\276\276\276~~\200\276\276\276\276~~!~\200\276\276\276\276~~\200\276\276\276\276~~!!!~\200\276\276\276\276~~\200\276\276\276\276~~!~\200\276\276\276\276~~\200\276\276\276\276~~!!!~\200\276\276\276\276~~\200\276\276\276\276~~!~\200\276\276\276\276~~\200\276\276\276\276~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\200\200\200nullnullnullnull\200\200\200]]nullnullnullnull\200\200\200nullnullnullnull\200\200\200]]nullnullnullnull\200\200\200nullnullnullnull\200\200\200]]nullnullnullnull\200\200\200nullnullnullnull\200\200\200]]~}}^nullnullnullnull\200\200\200nullnullnullnull\200\200\200]]nullnullnullnull\200\200\200nullnullnullnull\200\200\200]]nullnullnullnull\200\200\200nullnullnullnull\200\200\200]]nullnullnullnull\200\200\200nullnullnullnull\200\200\200]]]]!" + "'", str2, "nullnullnullnull\200\200\200nullnullnullnull\200\200\200]]nullnullnullnull\200\200\200nullnullnullnull\200\200\200]]nullnullnullnull\200\200\200nullnullnullnull\200\200\200]]nullnullnullnull\200\200\200nullnullnullnull\200\200\200]]~}}^nullnullnullnull\200\200\200nullnullnullnull\200\200\200]]nullnullnullnull\200\200\200nullnullnullnull\200\200\200]]nullnullnullnull\200\200\200nullnullnullnull\200\200\200]]nullnullnullnull\200\200\200nullnullnullnull\200\200\200]]]]!");
    }

    @Test
    public void test08343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08343");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!", "}]}}}]}}!!}]}}}]}}!!}]}}}]}}}]}}}]}}!!}]}}}]}}!!}]}}}]}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!" + "'", str2, "!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!");
    }

    @Test
    public void test08344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08344");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!]]!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!]]!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!]]!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!]]]!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!]]!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!]]!", "\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!````````````````!!!````````````````!!!````````````````!!!````````````````!!!````````````````!!]]!````````````````!!!````````````````!!]]!````````````````!!!````````````````!!]]!````````````````!!!````````````````!!]]]!````````````````!!!````````````````!!!````````````````!!!````````````````!!!````````````````!!]]!````````````````!!!````````````````!!]]!" + "'", str2, "]!````````````````!!!````````````````!!!````````````````!!!````````````````!!!````````````````!!]]!````````````````!!!````````````````!!]]!````````````````!!!````````````````!!]]!````````````````!!!````````````````!!]]]!````````````````!!!````````````````!!!````````````````!!!````````````````!!!````````````````!!]]!````````````````!!!````````````````!!]]!");
    }

    @Test
    public void test08345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08345");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230\200}}`~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230]]!", "}~\200\200}~\200\200L^\214\214L^\214\214}~\200\200}~\200\200L^\214\214L^\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230\200}}`~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230]]!" + "'", str2, "~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230\200}}`~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230]]!");
    }

    @Test
    public void test08346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08346");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\276\336\266\266\276\336\266\266\200\200\276\336\266\266\276\336\266\266\200\200\276\336\266\266\276\336\266\266\200\200\276\276\336\266\266\276\336\266\266\200\200\275\275!", "!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU\200}}`!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276L\266\266\276L\266\266\200\200\276L\266\266\276L\266\266\200\200\276L\266\266\276L\266\266\200\200\276\276L\266\266\276L\266\266\200\200\275\275!" + "'", str2, "\275\276L\266\266\276L\266\266\200\200\276L\266\266\276L\266\266\200\200\276L\266\266\276L\266\266\200\200\276\276L\266\266\276L\266\266\200\200\275\275!");
    }

    @Test
    public void test08347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08347");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!~\200null~~\200null~~!~\200null~~\200null~~!!!~\200null~~\200null~~!~\200null~~\200null~~!!!~\200null~~\200null~~!~\200null~~\200null~~!~\200null~~\200null~~!~\200null~~\200null~~!!!~\200null~~\200null~~!~\200null~~\200null~~!!!~\200null~~\200null~~!~\200null~~\200null~~!", "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~\200\327\330\332\332~~\200\327\330\332\332~~!~\200\327\330\332\332~~\200\327\330\332\332~~!!!~\200\327\330\332\332~~\200\327\330\332\332~~!~\200\327\330\332\332~~\200\327\330\332\332~~!!!~\200\327\330\332\332~~\200\327\330\332\332~~!~\200\327\330\332\332~~\200\327\330\332\332~~!~\200\327\330\332\332~~\200\327\330\332\332~~!~\200\327\330\332\332~~\200\327\330\332\332~~!!!~\200\327\330\332\332~~\200\327\330\332\332~~!~\200\327\330\332\332~~\200\327\330\332\332~~!!!~\200\327\330\332\332~~\200\327\330\332\332~~!~\200\327\330\332\332~~\200\327\330\332\332~~!" + "'", str2, "!~\200\327\330\332\332~~\200\327\330\332\332~~!~\200\327\330\332\332~~\200\327\330\332\332~~!!!~\200\327\330\332\332~~\200\327\330\332\332~~!~\200\327\330\332\332~~\200\327\330\332\332~~!!!~\200\327\330\332\332~~\200\327\330\332\332~~!~\200\327\330\332\332~~\200\327\330\332\332~~!~\200\327\330\332\332~~\200\327\330\332\332~~!~\200\327\330\332\332~~\200\327\330\332\332~~!!!~\200\327\330\332\332~~\200\327\330\332\332~~!~\200\327\330\332\332~~\200\327\330\332\332~~!!!~\200\327\330\332\332~~\200\327\330\332\332~~!~\200\327\330\332\332~~\200\327\330\332\332~~!");
    }

    @Test
    public void test08348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08348");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!efhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhh!", "eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LLEE!U!!LLEELLEELLEE!U!!LLEELLEE!!LLEE!U!!LLEELLEELLEE!U!!LLEELLEELLEE!U!!LLEELLEELLEE!U!!LLEELLEE!!LLEE!U!!LLEELLEELLEE!U!!LLEELLEE!!LLEE!U!!LLEELLEELLEE!U!!LLEELLEELLEE!U!!LLEELLEELLEE!U!!LLEELLEE!!LLEE!U!!LLEELLEELLEE!U!!LLEELLEE!!LLEE!U!!LLEELLEELLEE!U!!LLEELLEELLEE!U!!LLEELLEELLEE!U!!LLEELLEE!!LLEE!U!!LLEELLEELLEE!U!!LLEELLEE!!LLEE!U!!LLEELLEELLEE!U!!LLEELLEELLEE!U!!LLEELLEELLEE!U!!LLEELLEE!!LLEE!U!!LLEELLEELLEE!U!!LLEELLEE!!LLEE!U!!LLEELLEELLEE!U!!LLEELLEELLEE!U!!LLEELLEELLEE!U!!LLEELLEE!!LLEE!U!!LLEELLEELLEE!U!!LLEELLEE!!LLEE!U!!LLEELLEELLEE!U!!LLEELLEELLEE!U!!LLEELLEELLEE!U!!LLEELLEE!!LLEE!U!!LLEELLEELLEE!U!!LLEELLEE!!LLEE!U!!LLEELLEELLEE!U!!LLEELLEELLEE!U!!LLEELLEELLEE!U!!LLEELLEE!!LLEE!U!!LLEELLEELLEE!U!!LLEELLEE!!LLEE!U!!LLEELLEELLEE!U!!LLEELLEELLEE!U!!LLEELLEELLEE!U!!LLEELLEE!" + "'", str2, "!!LLEE!U!!LLEELLEELLEE!U!!LLEELLEE!!LLEE!U!!LLEELLEELLEE!U!!LLEELLEELLEE!U!!LLEELLEELLEE!U!!LLEELLEE!!LLEE!U!!LLEELLEELLEE!U!!LLEELLEE!!LLEE!U!!LLEELLEELLEE!U!!LLEELLEELLEE!U!!LLEELLEELLEE!U!!LLEELLEE!!LLEE!U!!LLEELLEELLEE!U!!LLEELLEE!!LLEE!U!!LLEELLEELLEE!U!!LLEELLEELLEE!U!!LLEELLEELLEE!U!!LLEELLEE!!LLEE!U!!LLEELLEELLEE!U!!LLEELLEE!!LLEE!U!!LLEELLEELLEE!U!!LLEELLEELLEE!U!!LLEELLEELLEE!U!!LLEELLEE!!LLEE!U!!LLEELLEELLEE!U!!LLEELLEE!!LLEE!U!!LLEELLEELLEE!U!!LLEELLEELLEE!U!!LLEELLEELLEE!U!!LLEELLEE!!LLEE!U!!LLEELLEELLEE!U!!LLEELLEE!!LLEE!U!!LLEELLEELLEE!U!!LLEELLEELLEE!U!!LLEELLEELLEE!U!!LLEELLEE!!LLEE!U!!LLEELLEELLEE!U!!LLEELLEE!!LLEE!U!!LLEELLEELLEE!U!!LLEELLEELLEE!U!!LLEELLEELLEE!U!!LLEELLEE!!LLEE!U!!LLEELLEELLEE!U!!LLEELLEE!!LLEE!U!!LLEELLEELLEE!U!!LLEELLEELLEE!U!!LLEELLEELLEE!U!!LLEELLEE!");
    }

    @Test
    public void test08349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08349");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]LNLLLNLLLNLLLNLLLNLL]]LNLLLNLL]]LNLLLNLL]]LNLLLNLL]]]LNLLLNLLLNLLLNLLLNLL]]LNLLLNLL]]!", "NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]NNNNNNNNNNNNNNNNNNNN]]NNNNNNNN]]NNNNNNNN]]NNNNNNNN]]]NNNNNNNNNNNNNNNNNNNN]]NNNNNNNN]]!" + "'", str2, "]NNNNNNNNNNNNNNNNNNNN]]NNNNNNNN]]NNNNNNNN]]NNNNNNNN]]]NNNNNNNNNNNNNNNNNNNN]]NNNNNNNN]]!");
    }

    @Test
    public void test08350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08350");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368!U\276\276\230U\215\215\230U\215\215\230U\215\215!U\276\276\230U\215\215\230U\215\215\230U\215\215!!!U\276\276\230U\215\215\230U\215\215\230U\215\215!U\276\276\230U\215\215\230U\215\215\230U\215\215!!!U\276\276\230U\215\215\230U\215\215\230U\215\215!U\276\276\230U\215\215\230U\215\215\230U\215\215!!!U\276\276\230U\215\215\230U\215\215\230U\215\215!U\276\276\230U\215\215\230U\215\215\230U\215\215\u0346\u0348\u0348!", "\276\276nullnull\276\276nullnull!!\276\276nullnull\276\276nullnull!!\276\276nullnull\276\276nullnull\276\276nullnull\276\276nullnull!!\276\276nullnull\276\276nullnull!!\276\276nullnull\276\276nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!!\276\276\230!\215\215\230!\215\215\230!\215\215!!\276\276\230!\215\215\230!\215\215\230!\215\215!!!!\276\276\230!\215\215\230!\215\215\230!\215\215!!\276\276\230!\215\215\230!\215\215\230!\215\215!!!!\276\276\230!\215\215\230!\215\215\230!\215\215!!\276\276\230!\215\215\230!\215\215\230!\215\215!!!!\276\276\230!\215\215\230!\215\215\230!\215\215!!\276\276\230!\215\215\230!\215\215\230!\215\215\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!!\276\276\230!\215\215\230!\215\215\230!\215\215!!\276\276\230!\215\215\230!\215\215\230!\215\215!!!!\276\276\230!\215\215\230!\215\215\230!\215\215!!\276\276\230!\215\215\230!\215\215\230!\215\215!!!!\276\276\230!\215\215\230!\215\215\230!\215\215!!\276\276\230!\215\215\230!\215\215\230!\215\215!!!!\276\276\230!\215\215\230!\215\215\230!\215\215!!\276\276\230!\215\215\230!\215\215\230!\215\215\u0346\u0348\u0348!");
    }

    @Test
    public void test08351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08351");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346~~!!!", "\u013d\u013e\u0140\u0140\u013d\u013e\u0140\u0140nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346~~!!!" + "'", str2, "\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346~~!!!");
    }

    @Test
    public void test08352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08352");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0420\u0420\u0420\u0420!!!", "\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test08353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08353");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("xxxxxxxxxxxxxxxxnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullxxxxxxxxxxxxxxxxnullnullnullnullnullnullnullnull!", "!!!!\300\300!!\300\300!!\300\300!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\300\300!!\300\300!!\300\300!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08354");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\u0366\u0365\u0368\u0368L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08355");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!", "TT!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!" + "'", str2, "!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!");
    }

    @Test
    public void test08356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08356");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!nullnullHH!!nullnullnullHH!!nullnull!nullnullHH!!nullnullnullHH!!nullnull!nullnullHH!!nullnullnullHH!!nullnull!nullnullHH!!nullnullnullHH!!nullnull!nullnullHH!!nullnullnullHH!!nullnull!", "\255\256\260\260\255\256\260\260!!!!!\255\256\260\260\255\256\260\260!!!!!!!\255\256\260\260\255\256\260\260!!!!!\255\256\260\260\255\256\260\260!!!!!!!\255\256\260\260\255\256\260\260!!!!!\255\256\260\260\255\256\260\260!!!!!!!\255\256\260\260\255\256\260\260!!!!!\255\256\260\260\255\256\260\260!!!!!!!\255\256\260\260\255\256\260\260!!!!!\255\256\260\260\255\256\260\260!!!!!!!\255\256\260\260\255\256\260\260!!!!!\255\256\260\260\255\256\260\260!!!!!!!\255\256\260\260\255\256\260\260!!!!!\255\256\260\260\255\256\260\260!!!!!!!\255\256\260\260\255\256\260\260!!!!!\255\256\260\260\255\256\260\260!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260!\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260!\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260!\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260!\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260!" + "'", str2, "!\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260!\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260!\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260!\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260!\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260!");
    }

    @Test
    public void test08357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08357");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!nullnullnullnull!", "\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013dnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LNNNLNNNLNNNLNNN!" + "'", str2, "!LNNNLNNNLNNNLNNN!");
    }

    @Test
    public void test08358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08358");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("llllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLL!", "\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!" + "'", str2, "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!");
    }

    @Test
    public void test08359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08359");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!!", "\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150!!!" + "'", str2, "\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150!!!");
    }

    @Test
    public void test08360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08360");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!", "\u0346\u0348\u0348\u0348\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\334\220\333\333\200~~\334\220\333\333\200~~\334\220\333\333\334\220\333\333\334\220\333\333\200~~\334\220\333\333\200~~\334\220\333\333\334\220\333\333!!\334\220\333\333\200~~\334\220\333\333\200~~\334\220\333\333\334\220\333\333\334\220\333\333\200~~\334\220\333\333\200~~\334\220\333\333\334\220\333\333!!\334\220\333\333\200~~\334\220\333\333\200~~\334\220\333\333\334\220\333\333\334\220\333\333\200~~\334\220\333\333\200~~\334\220\333\333\334\220\333\333\334\220\333\333\200~~\334\220\333\333\200~~\334\220\333\333\334\220\333\333\334\220\333\333\200~~\334\220\333\333\200~~\334\220\333\333\334\220\333\333!!\334\220\333\333\200~~\334\220\333\333\200~~\334\220\333\333\334\220\333\333\334\220\333\333\200~~\334\220\333\333\200~~\334\220\333\333\334\220\333\333!!\334\220\333\333\200~~\334\220\333\333\200~~\334\220\333\333\334\220\333\333\334\220\333\333\200~~\334\220\333\333\200~~\334\220\333\333\334\220\333\333!" + "'", str2, "\334\220\333\333\200~~\334\220\333\333\200~~\334\220\333\333\334\220\333\333\334\220\333\333\200~~\334\220\333\333\200~~\334\220\333\333\334\220\333\333!!\334\220\333\333\200~~\334\220\333\333\200~~\334\220\333\333\334\220\333\333\334\220\333\333\200~~\334\220\333\333\200~~\334\220\333\333\334\220\333\333!!\334\220\333\333\200~~\334\220\333\333\200~~\334\220\333\333\334\220\333\333\334\220\333\333\200~~\334\220\333\333\200~~\334\220\333\333\334\220\333\333\334\220\333\333\200~~\334\220\333\333\200~~\334\220\333\333\334\220\333\333\334\220\333\333\200~~\334\220\333\333\200~~\334\220\333\333\334\220\333\333!!\334\220\333\333\200~~\334\220\333\333\200~~\334\220\333\333\334\220\333\333\334\220\333\333\200~~\334\220\333\333\200~~\334\220\333\333\334\220\333\333!!\334\220\333\333\200~~\334\220\333\333\200~~\334\220\333\333\334\220\333\333\334\220\333\333\200~~\334\220\333\333\200~~\334\220\333\333\334\220\333\333!");
    }

    @Test
    public void test08361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08361");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\u0104\u0104\u0104\u0104\u0104\u0104\276\u0104\u0104\275\275!", "\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\u0104\u0104\u0104\u0104\u0104\u0104\276\u0104\u0104\275\275!" + "'", str2, "\275\u0104\u0104\u0104\u0104\u0104\u0104\276\u0104\u0104\275\275!");
    }

    @Test
    public void test08362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08362");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\311null\314\314!\311null\314\314\311null\314\314\311null\314\314!\311null\314\314\311null\314\314\311null\314\314!\311null\314\314\311null\314\314\311null\314\314!\311null\314\314\311null\314\314\200}}`\311null\314\314!\311null\314\314\311null\314\314\311null\314\314!\311null\314\314\311null\314\314\311null\314\314!\311null\314\314\311null\314\314\311null\314\314!\311null\314\314\311null\314\314]]!", "\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145!!!!!\200\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145!!!!!]]!" + "'", str2, "\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145!!!!!\200\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145!!!!!]]!");
    }

    @Test
    public void test08363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08363");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!", "!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!" + "'", str2, "!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!");
    }

    @Test
    public void test08364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08364");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u0348\u0346\u0346!", "\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u0348\u0346\u0346!");
    }

    @Test
    public void test08365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08365");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!", "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!" + "'", str2, "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!");
    }

    @Test
    public void test08366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08366");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!", "U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!" + "'", str2, "!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!");
    }

    @Test
    public void test08367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08367");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!", "LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!" + "'", str2, "!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!");
    }

    @Test
    public void test08368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08368");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\ua7b0\ua7b0\ua7b0\ua7b0\ua7b0\ua7b0~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!", "nullnull]]nullnull]]nullnull]]nullnull]]~}}^nullnull]]nullnull]]nullnull]]nullnull]]]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!" + "'", str2, "~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
    }

    @Test
    public void test08369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08369");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!\200}}`!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!]]!", "~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!\200}}`!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!]]!" + "'", str2, "!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!\200}}`!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!]]!");
    }

    @Test
    public void test08370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08370");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!", "fehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!!EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!!!!EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!!EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!!!!EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!!EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!!!!EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!!EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!!!!EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!!EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!!!!EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!!EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!!!!EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!!EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!!!!EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!!EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!!!" + "'", str2, "!!EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!!EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!!!!EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!!EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!!!!EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!!EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!!!!EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!!EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!!!!EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!!EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!!!!EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!!EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!!!!EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!!EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!!!!EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!!EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!!!");
    }

    @Test
    public void test08371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08371");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!~HH!~HH!!!~HH!~HH!!!~HH!~HH!~HH!~HH!!!~HH!~HH!!!~HH!~HH!", "null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!!null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!!null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!!null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!!null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!" + "'", str2, "!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!");
    }

    @Test
    public void test08372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08372");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!!", "!!!!!!!!!!!!!!!!\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!" + "'", str2, "!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
    }

    @Test
    public void test08373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08373");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!!", "!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!!");
    }

    @Test
    public void test08374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08374");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null~ssnull~ss!!null~ssnull~ss!!null~ssnull~ssnull~ssnull~ss!!null~ssnull~ss!!null~ssnull~ss!", "NLUUNLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull~nullnullnullnullnullnull~nullnull!!nullnullnullnull~nullnullnullnullnullnull~nullnull!!nullnullnullnull~nullnullnullnullnullnull~nullnullnullnullnullnull~nullnullnullnullnullnull~nullnull!!nullnullnullnull~nullnullnullnullnullnull~nullnull!!nullnullnullnull~nullnullnullnullnullnull~nullnull!" + "'", str2, "nullnullnullnull~nullnullnullnullnullnull~nullnull!!nullnullnullnull~nullnullnullnullnullnull~nullnull!!nullnullnullnull~nullnullnullnullnullnull~nullnullnullnullnullnull~nullnullnullnullnullnull~nullnull!!nullnullnullnull~nullnullnullnullnullnull~nullnull!!nullnullnullnull~nullnullnullnullnullnull~nullnull!");
    }

    @Test
    public void test08375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08375");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!U!!!U!!!U!!!U!!U!U!!!!U!U!!!!U!U!!!!U!U!!!!!", "\275LLL\275LLL\275LLL\275LLLLL\275\275LL\275\275LL\275\275LL\275\275\275LLL\275LLL\275LLL\275LLLLL\275\275LL\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!null!!!null!!null!null!!!!null!null!!!!null!null!!!!null!null!!!!!" + "'", str2, "!null!!!null!!!null!!!null!!null!null!!!!null!null!!!!null!null!!!!null!null!!!!!");
    }

    @Test
    public void test08376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08376");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314!", "L\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08377");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0345\u0346\u0348\u0348!", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test08378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08378");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~!", "d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~!" + "'", str2, "}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~!");
    }

    @Test
    public void test08379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08379");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275LLL\275LLL\275LLL\275LLLLL\275\275LL\275\275LL\275\275LL\275\275\275LLL\275LLL\275LLL\275LLLLL\275\275LL\275\275!", "\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\u0180\u0180\u0180\275\u0180\u0180\u0180\275\u0180\u0180\u0180\275\u0180\u0180\u0180\u0180\u0180\275\275\u0180\u0180\275\275\u0180\u0180\275\275\u0180\u0180\275\275\275\u0180\u0180\u0180\275\u0180\u0180\u0180\275\u0180\u0180\u0180\275\u0180\u0180\u0180\u0180\u0180\275\275\u0180\u0180\275\275!" + "'", str2, "\275\u0180\u0180\u0180\275\u0180\u0180\u0180\275\u0180\u0180\u0180\275\u0180\u0180\u0180\u0180\u0180\275\275\u0180\u0180\275\275\u0180\u0180\275\275\u0180\u0180\275\275\275\u0180\u0180\u0180\275\u0180\u0180\u0180\275\u0180\u0180\u0180\275\u0180\u0180\u0180\u0180\u0180\275\275\u0180\u0180\275\275!");
    }

    @Test
    public void test08380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08380");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!", "~}\200\200~}\200\200LLLLLLLL~}\200\200~}\200\200LLLLLLLL~}\200\200~}\200\200LLLLLLLL~}\200\200~}\200\200LLLLLLLL~}\200\200~}\200\200LLLLLLLL~}\200\200~}\200\200LLLLLLLL~}\200\200~}\200\200LLLLLLLL~}\200\200~}\200\200LLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340!nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340!nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340!nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340!nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340!" + "'", str2, "!nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340!nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340!nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340!nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340!nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340!");
    }

    @Test
    public void test08381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08381");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218\276\u0218\u0218!", "AA]]AA]]nullnullAA]]AA]]nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull!" + "'", str2, "\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull!");
    }

    @Test
    public void test08382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08382");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!", "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!" + "'", str2, "!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!");
    }

    @Test
    public void test08383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08383");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\255\256\260\260\255\256\260\260!!!!!\255\256\260\260\255\256\260\260!!!!!!!\255\256\260\260\255\256\260\260!!!!!\255\256\260\260\255\256\260\260!!!!!!!\255\256\260\260\255\256\260\260!!!!!\255\256\260\260\255\256\260\260!!!!!!!\255\256\260\260\255\256\260\260!!!!!\255\256\260\260\255\256\260\260!!!!!!!\255\256\260\260\255\256\260\260!!!!!\255\256\260\260\255\256\260\260!!!!!!!\255\256\260\260\255\256\260\260!!!!!\255\256\260\260\255\256\260\260!!!!!!!\255\256\260\260\255\256\260\260!!!!!\255\256\260\260\255\256\260\260!!!!!!!\255\256\260\260\255\256\260\260!!!!!\255\256\260\260\255\256\260\260!!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\260\260\260\260\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\260\260\260\260\u0346\u0348\u0348!");
    }

    @Test
    public void test08384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08384");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248!", "!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246nullnullnullnullnullnullnullnull!" + "'", str2, "\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08385");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test08386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08386");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\200\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e]]!", "]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]]]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]]]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]]]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]]]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~LLNNNLLLLNNNLLLLNNNLL\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~LLNNNLLLLNNNLLLLNNNLL]]!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~LLNNNLLLLNNNLLLLNNNLL\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~LLNNNLLLLNNNLLLLNNNLL]]!");
    }

    @Test
    public void test08387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08387");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u01de\u01db\u01db\u01db\u01de\u01db\u01db\u01db\u01de\u01db\u01db\u01db\u01de\u01db\u01db\u01db\u01de\u01db\u01db\u01db\u01de\u01db\u01db\u01db]]!", "!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}`!!!`!!!`!!!~}}^}`!!!`!!!`!!!]]!" + "'", str2, "}`!!!`!!!`!!!~}}^}`!!!`!!!`!!!]]!");
    }

    @Test
    public void test08388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08388");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\260\260NN\260\260NN}}\260\260NN\260\260NN}}!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\260nullnull\260\260nullnull}}\260\260nullnull\260\260nullnull}}!" + "'", str2, "\260\260nullnull\260\260nullnull}}\260\260nullnull\260\260nullnull}}!");
    }

    @Test
    public void test08389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08389");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\ua7ad\ua7ad\ua7ad\ua7ad!!!", "\276N\266\266~NN\276N\266\266~NN!!\276N\266\266~NN\276N\266\266~NN!!\276N\266\266~NN\276N\266\266~NN\276N\266\266~NN\276N\266\266~NN!!\276N\266\266~NN\276N\266\266~NN!!\276N\266\266~NN\276N\266\266~NN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test08390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08390");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260!!!\255\256\260\260!!!!", "NLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260!!!\255\256\260\260!!!!" + "'", str2, "\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260!!!\255\256\260\260!!!!");
    }

    @Test
    public void test08391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08391");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("EEEEEEEE!", "LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226!!LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08392");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!", "porrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporr!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08393");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!!!!" + "'", str2, "UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!!!!");
    }

    @Test
    public void test08394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08394");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!", "\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test08395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08395");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08396");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108UU!", "U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!" + "'", str2, "!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!!!nullUU!nullUU!");
    }

    @Test
    public void test08397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08397");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~~]]~~]]~~]]~~]]~}}^~~]]~~]]~~]]~~]]]]!", "\351\354\354\354\351\354\354\354\351\354\354\354\351\354\354\354\200}}`\351\354\354\354\351\354\354\354\351\354\354\354\351\354\354\354]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~]]~~]]~~]]~~]]~}}^~~]]~~]]~~]]~~]]]]!" + "'", str2, "~~]]~~]]~~]]~~]]~}}^~~]]~~]]~~]]~~]]]]!");
    }

    @Test
    public void test08398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08398");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275UUU\275UUU\275UUU\275UUUUU\275\275UU\275\275UU\275\275UU\275\275\275UUU\275UUU\275UUU\275UUUUU\275\275UU\275\275!", "fehhfehhnullnullfehhfehhnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275^^^\275^^^\275^^^\275^^^^^\275\275^^\275\275^^\275\275^^\275\275\275^^^\275^^^\275^^^\275^^^^^\275\275^^\275\275!" + "'", str2, "\275^^^\275^^^\275^^^\275^^^^^\275\275^^\275\275^^\275\275^^\275\275\275^^^\275^^^\275^^^\275^^^^^\275\275^^\275\275!");
    }

    @Test
    public void test08399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08399");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!!", "U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~!!U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~!!U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~!!U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~!!U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!!" + "'", str2, "U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!!");
    }

    @Test
    public void test08400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08400");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276!!\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276!!\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276!!\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276!!\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276!", "null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!" + "'", str2, "\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!");
    }

    @Test
    public void test08401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08401");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230!", "\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230!" + "'", str2, "~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230!");
    }

    @Test
    public void test08402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08402");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!!!!" + "'", str2, "\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!!!!");
    }

    @Test
    public void test08403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08403");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!", "}!\200\200}!\200\200}!\200\200}!\200\200!!!!!!!!!!!!!!!!}!\200\200}!\200\200}!\200\200}!\200\200!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!" + "'", str2, "!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!");
    }

    @Test
    public void test08404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08404");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0245\u0246\u0248\u0248\u0346\u0348\u0348!", "!````!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test08405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08405");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!\200\200\u0346\u0348\u0348!", "UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test08406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08406");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu!", "null\276\276\276null\276\276\276null\276\276\276null\276\276\276null\276\276\276null\276\276\276null\276\276\276null\276\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]\223\225\223\223\223\225\223\223]]\223\225\223\223\223\225\223\223!!]]\223\225\223\223\223\225\223\223]]\223\225\223\223\223\225\223\223!!]]\223\225\223\223\223\225\223\223]]\223\225\223\223\223\225\223\223]]\223\225\223\223\223\225\223\223]]\223\225\223\223\223\225\223\223!!]]\223\225\223\223\223\225\223\223]]\223\225\223\223\223\225\223\223!!]]\223\225\223\223\223\225\223\223]]\223\225\223\223\223\225\223\223!" + "'", str2, "]]\223\225\223\223\223\225\223\223]]\223\225\223\223\223\225\223\223!!]]\223\225\223\223\223\225\223\223]]\223\225\223\223\223\225\223\223!!]]\223\225\223\223\223\225\223\223]]\223\225\223\223\223\225\223\223]]\223\225\223\223\223\225\223\223]]\223\225\223\223\223\225\223\223!!]]\223\225\223\223\223\225\223\223]]\223\225\223\223\223\225\223\223!!]]\223\225\223\223\223\225\223\223]]\223\225\223\223\223\225\223\223!");
    }

    @Test
    public void test08407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08407");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!!!!", "nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!!" + "'", str2, "U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!!");
    }

    @Test
    public void test08408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08408");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!!" + "'", str2, "\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!!");
    }

    @Test
    public void test08409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08409");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "!NLLLNLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!!NLLLNLLL!!NLLLNLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08410");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!", "!\253\256\256\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!" + "'", str2, "\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!");
    }

    @Test
    public void test08411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08411");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08412");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b!", "\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276!!\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276!!\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276!!\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276!!\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08413");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null\340nullnullnull\340nullnullnullnullnull\340nullnullnull\340nullnullnullnull!!null\340nullnullnull\340nullnullnullnullnull\340nullnullnull\340nullnullnullnull!!null\340nullnullnull\340nullnullnullnullnull\340nullnullnull\340nullnullnullnull!!null\340nullnullnull\340nullnullnullnullnull\340nullnullnull\340nullnullnullnull!!null\340nullnullnull\340nullnullnullnullnull\340nullnullnull\340nullnullnullnull!!null\340nullnullnull\340nullnullnullnullnull\340nullnullnull\340nullnullnullnull!!null\340nullnullnull\340nullnullnullnullnull\340nullnullnull\340nullnullnullnull!!null\340nullnullnull\340nullnullnullnullnull\340nullnullnull\340nullnullnullnull!!!", "~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276~!!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!\276~!!!!\276~!!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!\276~!!!!\276~!!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!\276~!!!!\276~!!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!\276~!!!!\276~!!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!\276~!!!!\276~!!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!\276~!!!!\276~!!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!\276~!!!!\276~!!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!\276~!!!!!" + "'", str2, "\276~!!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!\276~!!!!\276~!!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!\276~!!!!\276~!!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!\276~!!!!\276~!!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!\276~!!!!\276~!!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!\276~!!!!\276~!!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!\276~!!!!\276~!!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!\276~!!!!\276~!!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!!\276~!!\276~!!\276~!!\276~!!!!!");
    }

    @Test
    public void test08414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08414");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("P\220NN\200}}`P\220NN]]!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220nullnull\200}}`null\220nullnull]]!" + "'", str2, "null\220nullnull\200}}`null\220nullnull]]!");
    }

    @Test
    public void test08415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08415");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```!", "\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\200\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```!" + "'", str2, "\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```!");
    }

    @Test
    public void test08416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08416");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!nullnullnull!nullnullnull!nullnullnull!nullnullnull~}}^!nullnullnull!nullnullnull!nullnullnull!nullnullnull]]!", "\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LNUULNUULNUU!LNUULNUULNUU!LNUULNUULNUU!LNUULNUULNUU~}}^!LNUULNUULNUU!LNUULNUULNUU!LNUULNUULNUU!LNUULNUULNUU]]!" + "'", str2, "!LNUULNUULNUU!LNUULNUULNUU!LNUULNUULNUU!LNUULNUULNUU~}}^!LNUULNUULNUU!LNUULNUULNUU!LNUULNUULNUU!LNUULNUULNUU]]!");
    }

    @Test
    public void test08417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08417");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\260\260nullnull\260\260nullnull}}\260\260nullnull\260\260nullnull}}!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\260nullnullnullnullnullnullnullnull\260\260nullnullnullnullnullnullnullnull}}\260\260nullnullnullnullnullnullnullnull\260\260nullnullnullnullnullnullnullnull}}!" + "'", str2, "\260\260nullnullnullnullnullnullnullnull\260\260nullnullnullnullnullnullnullnull}}\260\260nullnullnullnullnullnullnullnull\260\260nullnullnullnullnullnullnullnull}}!");
    }

    @Test
    public void test08418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08418");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!", "\u0346\u0348\u0348\u0348`\230\230\230\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!" + "'", str2, "!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!");
    }

    @Test
    public void test08419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08419");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!", "\275\276L\266\266\276L\266\266\200\200\276L\266\266\276L\266\266\200\200\276L\266\266\276L\266\266\200\200\276\276L\266\266\276L\266\266\200\200\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!!" + "'", str2, "null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!!");
    }

    @Test
    public void test08420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08420");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246!!!", "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!");
    }

    @Test
    public void test08421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08421");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200XX~~XX~~}~\200\200}~\200\200XX~~XX~~}~\200\200}~\200\200XX~~XX~~}~\200\200}~\200\200\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!X}\200\200X}\200\200X}\200\200X}\200\200!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!!!" + "'", str2, "!X}\200\200X}\200\200X}\200\200X}\200\200!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!!!");
    }

    @Test
    public void test08422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08422");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366!", "!P!!!P!!!P!!!P!!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366!" + "'", str2, "\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366!");
    }

    @Test
    public void test08423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08423");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\200\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0]]!", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test08424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08424");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull!", "\u0346\u0348\u0348\u0348\u014e\u014b\u014b\u014b\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08425");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200UNLLNUNLLUNLLUNLLNUNLLUNLL}~\200\200}~\200\200UNLLNUNLLUNLLUNLLNUNLLUNLL}~\200\200}~\200\200UNLLNUNLLUNLLUNLLNUNLLUNLL}~\200\200}~\200\200\u0348\u0346\u0346!", "LL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\275null\300\300null\275null\300\300\275null\300\300\275null\300\300null\275null\300\300\275null\300\300}~\200\200}~\200\200\275null\300\300null\275null\300\300\275null\300\300\275null\300\300null\275null\300\300\275null\300\300}~\200\200}~\200\200\275null\300\300null\275null\300\300\275null\300\300\275null\300\300null\275null\300\300\275null\300\300}~\200\200}~\200\200\275null\300\300null\275null\300\300\275null\300\300\275null\300\300null\275null\300\300\275null\300\300\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\275null\300\300null\275null\300\300\275null\300\300\275null\300\300null\275null\300\300\275null\300\300}~\200\200}~\200\200\275null\300\300null\275null\300\300\275null\300\300\275null\300\300null\275null\300\300\275null\300\300}~\200\200}~\200\200\275null\300\300null\275null\300\300\275null\300\300\275null\300\300null\275null\300\300\275null\300\300}~\200\200}~\200\200\275null\300\300null\275null\300\300\275null\300\300\275null\300\300null\275null\300\300\275null\300\300\u0348\u0346\u0346!");
    }

    @Test
    public void test08426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08426");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "`UUUUUUUUUUUU`UUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08427");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u019d\u01a0\u019d\u019d\200\u019d\u01a0\u019d\u019d\200\u019d\u01a0\u019d\u019d\200\u019d\u01a0\u019d\u019d\200\u019d\u01a0\u019d\u019d\200\u019d\u01a0\u019d\u019d\200\u019d\u01a0\u019d\u019d\200\u019d\u01a0\u019d\u019d\200}}!", "UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}!" + "'", str2, "nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}!");
    }

    @Test
    public void test08428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08428");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!!", "\u0366\u0365\u0368\u0368\u0220\u021d\u021d\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!!" + "'", str2, "nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!!");
    }

    @Test
    public void test08429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08429");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!X}\200\200X}\200\200X}\200\200X}\200\200!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!X}\200\200X}\200\200X}\200\200X}\200\200!!!!!", "L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null}\200\200null}\200\200null}\200\200null}\200\200!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!!!" + "'", str2, "!null}\200\200null}\200\200null}\200\200null}\200\200!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!!!");
    }

    @Test
    public void test08430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08430");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnull!!``nullnull``nullnull``nullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!``nullnull``nullnull``nullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLUNLL!!``UNLLUNLL``UNLLUNLL``UNLLUNLLUNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!``UNLLUNLL``UNLLUNLL``UNLLUNLLUNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!!" + "'", str2, "UNLLUNLL!!``UNLLUNLL``UNLLUNLL``UNLLUNLLUNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!``UNLLUNLL``UNLLUNLL``UNLLUNLLUNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!!");
    }

    @Test
    public void test08431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08431");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!!", "\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253!!!\253!!!\253\253\253!!!\253!!!\253\253!!\253!!!\253!!!\253\253\253!!!\253!!!\253\253!!\253!!!\253!!!\253\253\253!!!\253!!!\253\253!!\253!!!\253!!!\253\253\253!!!\253!!!\253\253!!\253!!!\253!!!\253\253\253!!!\253!!!\253\253!!\253!!!\253!!!\253\253\253!!!\253!!!\253\253!!\253!!!\253!!!\253\253\253!!!\253!!!\253\253!!\253!!!\253!!!\253\253\253!!!\253!!!\253\253!!!" + "'", str2, "\253!!!\253!!!\253\253\253!!!\253!!!\253\253!!\253!!!\253!!!\253\253\253!!!\253!!!\253\253!!\253!!!\253!!!\253\253\253!!!\253!!!\253\253!!\253!!!\253!!!\253\253\253!!!\253!!!\253\253!!\253!!!\253!!!\253\253\253!!!\253!!!\253\253!!\253!!!\253!!!\253\253\253!!!\253!!!\253\253!!\253!!!\253!!!\253\253\253!!!\253!!!\253\253!!\253!!!\253!!!\253\253\253!!!\253!!!\253\253!!!");
    }

    @Test
    public void test08432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08432");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230\200}}`!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230]]!", "F]]]F]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230\200}}`!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230]]!" + "'", str2, "!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230\200}}`!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230]]!");
    }

    @Test
    public void test08433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08433");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\215}\215\215\215}\215\215]]]]]]]]]]]]]]]]\215}\215\215\215}\215\215!", "\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215]]]]]]]]]]]]]]]]\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215]]]]]]]]]]]]]]]]\215}\215\215\215}\215\215!");
    }

    @Test
    public void test08434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08434");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254!!!", "]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]AAAnullnullnull\256\254\254]AAAnullnullnull\256\254\254!!]AAAnullnullnull\256\254\254]AAAnullnullnull\256\254\254!!]AAAnullnullnull\256\254\254]AAAnullnullnull\256\254\254!!]AAAnullnullnull\256\254\254]AAAnullnullnull\256\254\254!!]AAAnullnullnull\256\254\254]AAAnullnullnull\256\254\254!!]AAAnullnullnull\256\254\254]AAAnullnullnull\256\254\254!!]AAAnullnullnull\256\254\254]AAAnullnullnull\256\254\254!!]AAAnullnullnull\256\254\254]AAAnullnullnull\256\254\254!!!" + "'", str2, "]AAAnullnullnull\256\254\254]AAAnullnullnull\256\254\254!!]AAAnullnullnull\256\254\254]AAAnullnullnull\256\254\254!!]AAAnullnullnull\256\254\254]AAAnullnullnull\256\254\254!!]AAAnullnullnull\256\254\254]AAAnullnullnull\256\254\254!!]AAAnullnullnull\256\254\254]AAAnullnullnull\256\254\254!!]AAAnullnullnull\256\254\254]AAAnullnullnull\256\254\254!!]AAAnullnullnull\256\254\254]AAAnullnullnull\256\254\254!!]AAAnullnullnull\256\254\254]AAAnullnullnull\256\254\254!!!");
    }

    @Test
    public void test08435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08435");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!", "\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126UUU!" + "'", str2, "\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126UUU!");
    }

    @Test
    public void test08436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08436");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08437");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275}~\200\200}~\200\200}~\200\200\276}~\200\200\275\275!", "NN!!NN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275}~\200\200}~\200\200}~\200\200\276}~\200\200\275\275!" + "'", str2, "\275}~\200\200}~\200\200}~\200\200\276}~\200\200\275\275!");
    }

    @Test
    public void test08438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08438");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("EEEEEEEE!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~NNN\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~NNN]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNN!" + "'", str2, "NNNNNNNN!");
    }

    @Test
    public void test08439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08439");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnullnullnullnullnullnull!", "mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNN!" + "'", str2, "PPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNN!");
    }

    @Test
    public void test08440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08440");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!", "!\253\256\256\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08441");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223hfhhhfhhhfhh}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223hfhhhfhhhfhh}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223hfhhhfhhhfhh}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223\u0348\u0346\u0346!", "{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223\u0348\u0346\u0346!");
    }

    @Test
    public void test08442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08442");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\276\275LL\276\275LL\214\214\276\275LL\276\275LL\214\214\276\275LL\276\275LL\214\214\276\275LL\276\275LL\214\214\276\275LL\276\275LL\214\214\276\275LL\276\275LL\214\214\276\275LL\276\275LL\214\214\276\275LL\276\275LL\214\214!", "UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\275UU\276\275UU\214\214\276\275UU\276\275UU\214\214\276\275UU\276\275UU\214\214\276\275UU\276\275UU\214\214\276\275UU\276\275UU\214\214\276\275UU\276\275UU\214\214\276\275UU\276\275UU\214\214\276\275UU\276\275UU\214\214!" + "'", str2, "\276\275UU\276\275UU\214\214\276\275UU\276\275UU\214\214\276\275UU\276\275UU\214\214\276\275UU\276\275UU\214\214\276\275UU\276\275UU\214\214\276\275UU\276\275UU\214\214\276\275UU\276\275UU\214\214\276\275UU\276\275UU\214\214!");
    }

    @Test
    public void test08443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08443");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnullnullnull\253\253\253\200}}`nullnullnullnull\253\253\253]]!", "}LLUULLUULLUU}LLUULLUULLUULLUULLUU}LLUULLUULLUU}LLUULLUULLUULLUULLUU\225\225}LLUULLUULLUU}LLUULLUULLUULLUULLUU}LLUULLUULLUU}LLUULLUULLUULLUULLUU\225\225}LLUULLUULLUU}LLUULLUULLUULLUULLUU}LLUULLUULLUU}LLUULLUULLUULLUULLUU\225\225}LLUULLUULLUU}LLUULLUULLUULLUULLUU}LLUULLUULLUU}LLUULLUULLUULLUULLUU\225\225}LLUULLUULLUU}LLUULLUULLUULLUULLUU}LLUULLUULLUU}LLUULLUULLUULLUULLUU\225\225}LLUULLUULLUU}LLUULLUULLUULLUULLUU}LLUULLUULLUU}LLUULLUULLUULLUULLUU\225\225}LLUULLUULLUU}LLUULLUULLUULLUULLUU}LLUULLUULLUU}LLUULLUULLUULLUULLUU\225\225}LLUULLUULLUU}LLUULLUULLUULLUULLUU}LLUULLUULLUU}LLUULLUULLUULLUULLUU\225\225!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\253\253\253\200\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\253\253\253]]!" + "'", str2, "\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\253\253\253\200\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\253\253\253]]!");
    }

    @Test
    public void test08444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08444");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226!!!", "``nullnull``nullnull!!``nullnull``nullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull\230\226\226!nullnullnull\230\226\226!nullnullnull\230\226\226!nullnullnull\230\226\226!nullnullnull\230\226\226!nullnullnull\230\226\226!nullnullnull\230\226\226!nullnullnull\230\226\226!!!nullnullnull\230\226\226!nullnullnull\230\226\226!nullnullnull\230\226\226!nullnullnull\230\226\226!nullnullnull\230\226\226!nullnullnull\230\226\226!nullnullnull\230\226\226!nullnullnull\230\226\226!!!" + "'", str2, "!nullnullnull\230\226\226!nullnullnull\230\226\226!nullnullnull\230\226\226!nullnullnull\230\226\226!nullnullnull\230\226\226!nullnullnull\230\226\226!nullnullnull\230\226\226!nullnullnull\230\226\226!!!nullnullnull\230\226\226!nullnullnull\230\226\226!nullnullnull\230\226\226!nullnullnull\230\226\226!nullnullnull\230\226\226!nullnullnull\230\226\226!nullnullnull\230\226\226!nullnullnull\230\226\226!!!");
    }

    @Test
    public void test08445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08445");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\342null\342\342\342null\342\342\253\253\342null\342\342\342null\342\342\253\253\342null\342\342\342null\342\342\253\253\342null\342\342\342null\342\342\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\342null\342\342\342null\342\342\253\253\342null\342\342\342null\342\342\253\253!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253!");
    }

    @Test
    public void test08446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08446");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08447");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc!", "!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!!!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!!!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!!!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!!!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!" + "'", str2, "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!");
    }

    @Test
    public void test08448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08448");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}!", "]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]]]]]]]]]]]]]\200}}]]]]]]]]]]]]]]]]\200}}]]]]]]]]]]]]]]]]\200}}]]]]]]]]]]]]]]]]\200}}]]]]]]]]]]]]]]]]\200}}]]]]]]]]]]]]]]]]\200}}]]]]]]]]]]]]]]]]\200}}]]]]]]]]]]]]]]]]\200}}!" + "'", str2, "]]]]]]]]]]]]]]]]\200}}]]]]]]]]]]]]]]]]\200}}]]]]]]]]]]]]]]]]\200}}]]]]]]]]]]]]]]]]\200}}]]]]]]]]]]]]]]]]\200}}]]]]]]]]]]]]]]]]\200}}]]]]]]]]]]]]]]]]\200}}]]]]]]]]]]]]]]]]\200}}!");
    }

    @Test
    public void test08449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08449");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!", "~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
    }

    @Test
    public void test08450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08450");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!!EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!!EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!!EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!!EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!", "UUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!!LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!!LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!!LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!!LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!" + "'", str2, "LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!!LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!!LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!!LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!!LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!");
    }

    @Test
    public void test08451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08451");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "]!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]]!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08452");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!", "!LNUULNUULNUU!LNUULNUULNUU!LNUULNUULNUU!LNUULNUULNUU~}}^!LNUULNUULNUU!LNUULNUULNUU!LNUULNUULNUU!LNUULNUULNUU]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251!" + "'", str2, "\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251!");
    }

    @Test
    public void test08453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08453");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!" + "'", str2, "!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!");
    }

    @Test
    public void test08454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08454");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!", "!~!!!~!!!!!~!!!~!!!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!");
    }

    @Test
    public void test08455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08455");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0346\u0348\u0348!", "\276\276\u016c\u016c\u016c\u016cLL\276\u016c\u016c\u016c\u016c\u016c\u016cLL\276\u016c\u016cLL\276\276\u016c\u016c\u016c\u016cLL\276\u016c\u016c\u016c\u016c\u016c\u016cLL\276\u016c\u016cLL\276\276\u016c\u016c\u016c\u016cLL\276\u016c\u016c\u016c\u016c\u016c\u016cLL\276\u016c\u016cLL\276\276\u016c\u016c\u016c\u016cLL\276\u016c\u016c\u016c\u016c\u016c\u016cLL\276\u016c\u016cLL\276\276\u016c\u016c\u016c\u016cLL\276\u016c\u016c\u016c\u016c\u016c\u016cLL\276\u016c\u016cLL\276\276\u016c\u016c\u016c\u016cLL\276\u016c\u016c\u016c\u016c\u016c\u016cLL\276\u016c\u016cLL\276\276\u016c\u016c\u016c\u016cLL\276\u016c\u016c\u016c\u016c\u016c\u016cLL\276\u016c\u016cLL\276\276\u016c\u016c\u016c\u016cLL\276\u016c\u016c\u016c\u016c\u016c\u016cLL\276\u016c\u016cLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test08456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08456");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!", "XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!" + "'", str2, "!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!");
    }

    @Test
    public void test08457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08457");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u020d\u020e\u0210\u0210\u020d\u020e\u0210\u0210\u020d\u020e\u0210\u0210\u020d\u020e\u0210\u0210\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u020d\u020e\u0210\u0210\u020d\u020e\u0210\u0210\u020d\u020e\u0210\u0210\u020d\u020e\u0210\u0210\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360!" + "'", str2, "\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360!");
    }

    @Test
    public void test08458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08458");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!!", "L\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnullL\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnull!!L\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnullL\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnull!!L\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnullL\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnullL\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnullL\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnull!!L\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnullL\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnull!!L\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnullL\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU!!`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU!!`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU!!`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU!!`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU!!`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU!!`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU!!`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU!!!" + "'", str2, "`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU!!`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU!!`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU!!`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU!!`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU!!`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU!!`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU!!`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU!!!");
    }

    @Test
    public void test08459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08459");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!", "d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!" + "'", str2, "\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!");
    }

    @Test
    public void test08460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08460");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!", "UNLLnullnullnullUNLLnullnullnullUNLLnullnullnullUNLLnullnullnullUNLLnullnullnullUNLLnullnullnullUNLLnullnullnullUNLLnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08461");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02faLNNNLNNNLNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08462");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108!", "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\200\200\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08463");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!nullnull!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!nullnull!!!!!", "!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025enullnull!!!!!" + "'", str2, "\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025enullnull!!!!!");
    }

    @Test
    public void test08464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08464");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230\200}}`~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230]]!", "XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~\225\230\230~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~\225\230\230~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~\225\230\230~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~\225\230\230\200}}`~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~\225\230\230~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~\225\230\230~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~\225\230\230~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~\225\230\230]]!" + "'", str2, "~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~\225\230\230~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~\225\230\230~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~\225\230\230~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~\225\230\230\200}}`~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~\225\230\230~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~\225\230\230~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~\225\230\230~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~\225\230\230]]!");
    }

    @Test
    public void test08465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08465");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN}~\200\200}~\200\200NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!", "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~}~\200\200}~\200\200~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!" + "'", str2, "}~\200\200}~\200\200~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~}~\200\200}~\200\200~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!");
    }

    @Test
    public void test08466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08466");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!", "!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d!!!!" + "'", str2, "\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d!!!!");
    }

    @Test
    public void test08467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08467");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UULLUULL!!UULLUULL!!UULLUULLUULLUULL!!UULLUULL!!UULLUULL!", "!]]]!]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08468");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226!", "\u029e\u0346\u0346\ua7b0!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226!" + "'", str2, "\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226!");
    }

    @Test
    public void test08469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08469");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230\200}}`U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230]]!", "lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LL\225\230\230N!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LL\225\230\230N!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LL\225\230\230N!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LL\225\230\230\200}}`N!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LL\225\230\230N!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LL\225\230\230N!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LL\225\230\230N!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LL\225\230\230]]!" + "'", str2, "N!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LL\225\230\230N!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LL\225\230\230N!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LL\225\230\230N!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LL\225\230\230\200}}`N!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LL\225\230\230N!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LL\225\230\230N!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LL\225\230\230N!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LL\225\230\230]]!");
    }

    @Test
    public void test08470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08470");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
    }

    @Test
    public void test08471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08471");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!", "~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test08472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08472");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220!", "`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220!" + "'", str2, "nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220!");
    }

    @Test
    public void test08473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08473");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275``~~``~~``~~\276``~~\275\275!", "OOOOOOOO\214\214OOOOOOOO\214\214OOOOOOOO\214\214OOOOOOOO\214\214OOOOOOOO\214\214OOOOOOOO\214\214OOOOOOOO\214\214OOOOOOOO\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275``~~``~~``~~\276``~~\275\275!" + "'", str2, "\275``~~``~~``~~\276``~~\275\275!");
    }

    @Test
    public void test08474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08474");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a!", "LLUUUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a!" + "'", str2, "\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a!");
    }

    @Test
    public void test08475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08475");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!l!", "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u038a!" + "'", str2, "\u038a!");
    }

    @Test
    public void test08476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08476");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LLUUUULL!", "]\256!\254\254\256!\254\254\256!\254\254\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]]\256!\254\254\256!\254\254\256!\254\254\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08477");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!l!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!" + "'", str2, "!null!");
    }

    @Test
    public void test08478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08478");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\253\254\256\256\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\253\254\256\256\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246!", "E\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UU!!E\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UU!!E\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UU!!E\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UU!!E\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnullnullnull!" + "'", str2, "\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08479");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0240\u0240!", "NNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLL!!NNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLL!!NNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLL!!NNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLL!!NNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!" + "'", str2, "nullnull!");
    }

    @Test
    public void test08480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08480");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\325nullnullnull\325nullnullnull\275\275\325nullnullnull\325nullnullnull\275\275\325nullnullnull\325nullnullnull\275\275\325nullnullnull\325nullnullnull\275\275\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\325nullnullnull\325nullnullnull\275\275\325nullnullnull\325nullnullnull\275\275!", "\u0366\u0365\u0368\u0368ULLLULLL!!ULLLULLL!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvv\275nullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvv\275nullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvv\275nullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvv\275\275nullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvv\275\275nullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvv\275\275nullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvv\275\275\275nullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvv\275nullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvv\275nullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvv\275nullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvv\275\275nullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvv\275\275!" + "'", str2, "\275nullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvv\275nullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvv\275nullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvv\275nullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvv\275\275nullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvv\275\275nullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvv\275\275nullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvv\275\275\275nullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvv\275nullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvv\275nullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvv\275nullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvv\275\275nullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvv\275\275!");
    }

    @Test
    public void test08481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08481");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "LLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAA!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08482");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275``uuuuuuuu``uuuuuuuu``uuuuuuuu\276``uuuuuuuu\275\275!", "LNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull\276``nullnullnullnullnullnullnullnull\275\275!" + "'", str2, "\275``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull\276``nullnullnullnullnullnullnullnull\275\275!");
    }

    @Test
    public void test08483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08483");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn!", "\u01a0!!!\200\u01a0!!!]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``]]]]]]]]``]]]]]]]]``]]]]]]]]``]]]]]]]]``]]]]]]]]``]]]]]]]]``]]]]]]]]``]]]]]]]]!" + "'", str2, "``]]]]]]]]``]]]]]]]]``]]]]]]]]``]]]]]]]]``]]]]]]]]``]]]]]]]]``]]]]]]]]``]]]]]]]]!");
    }

    @Test
    public void test08484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08484");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX!!`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX!!`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX!!`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX!!`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX!", "`!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull`!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull!!`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull!!`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull!!`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull!!`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull!" + "'", str2, "`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull!!`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull!!`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull!!`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull!!`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull!");
    }

    @Test
    public void test08485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08485");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230\200}}`~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230]]!", "\276\276!!nullnull\276\276nullnull\276\276nullnull\276\276\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!nullnull\276\276nullnull\276\276nullnull\276\276\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230\200}}`~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230]]!" + "'", str2, "~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230\200}}`~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230]]!");
    }

    @Test
    public void test08486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08486");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200LUUULUUULUUULUUULUUULUUULUUULUUU}~\200\200}~\200\200LUUULUUULUUULUUULUUULUUULUUULUUU!", "nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200ULLLULLLULLLULLLULLLULLLULLLULLL}~\200\200}~\200\200ULLLULLLULLLULLLULLLULLLULLLULLL!" + "'", str2, "}~\200\200}~\200\200ULLLULLLULLLULLLULLLULLLULLLULLL}~\200\200}~\200\200ULLLULLLULLLULLLULLLULLLULLLULLL!");
    }

    @Test
    public void test08487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08487");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("llllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLL!", "\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08488");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLUU\275\275\275LLUU\275\275\275!!LLUU\275\275\275LLUU\275\275\275!!LLUU\275\275\275LLUU\275\275\275LLUU\275\275\275LLUU\275\275\275!!LLUU\275\275\275LLUU\275\275\275!!LLUU\275\275\275LLUU\275\275\275!", "\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u020e\u020e!!\275\275\275\u020e\u020e!!\275\275\275\u020e\u020e!!\275\275\275\u020e\u020e!!\275\275\275\u020e\u020e!!\275\275\275\u020e\u020e!!\275\275\275\u020e\u020e!!\275\275\275\u020e\u020e!!\275\275\275\u020e\u020e!!\275\275\275\u020e\u020e!!\275\275\275\u020e\u020e!!\275\275\275\u020e\u020e!!\275\275\275!" + "'", str2, "\u020e\u020e!!\275\275\275\u020e\u020e!!\275\275\275\u020e\u020e!!\275\275\275\u020e\u020e!!\275\275\275\u020e\u020e!!\275\275\275\u020e\u020e!!\275\275\275\u020e\u020e!!\275\275\275\u020e\u020e!!\275\275\275\u020e\u020e!!\275\275\275\u020e\u020e!!\275\275\275\u020e\u020e!!\275\275\275\u020e\u020e!!\275\275\275!");
    }

    @Test
    public void test08489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08489");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08490");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348!" + "'", str2, "\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348!");
    }

    @Test
    public void test08491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08491");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!", "\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!" + "'", str2, "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!");
    }

    @Test
    public void test08492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08492");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("ijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnullijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnull!!ijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnullijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnull!!ijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnullijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnullijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnullijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnull!!ijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnullijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnull!!ijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnullijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnull!", "]nullnullnullnullnull]]nullnull]]nullnull]]nullnull]]]nullnullnullnullnull]]nullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NNL]NN\220L]NNL]NNL]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NNL]NN\220L]NNL]NN!!L]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NNL]NN\220L]NNL]NNL]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NNL]NN\220L]NNL]NN!!L]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NNL]NN\220L]NNL]NNL]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NNL]NN\220L]NNL]NNL]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NNL]NN\220L]NNL]NNL]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NNL]NN\220L]NNL]NN!!L]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NNL]NN\220L]NNL]NNL]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NNL]NN\220L]NNL]NN!!L]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NNL]NN\220L]NNL]NNL]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NNL]NN\220L]NNL]NN!" + "'", str2, "L]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NNL]NN\220L]NNL]NNL]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NNL]NN\220L]NNL]NN!!L]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NNL]NN\220L]NNL]NNL]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NNL]NN\220L]NNL]NN!!L]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NNL]NN\220L]NNL]NNL]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NNL]NN\220L]NNL]NNL]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NNL]NN\220L]NNL]NNL]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NNL]NN\220L]NNL]NN!!L]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NNL]NN\220L]NNL]NNL]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NNL]NN\220L]NNL]NN!!L]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NNL]NN\220L]NNL]NNL]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NN\200~~L]NN\220L]NNL]NNL]NN\220L]NNL]NN!");
    }

    @Test
    public void test08493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08493");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253!", "porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200!!porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200!!porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200!!porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200!!porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!");
    }

    @Test
    public void test08494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08494");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("II!!II!!II!!II!!II!!II!!II!!II!!!", "]!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!]]!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!]]!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!]]!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!]]]!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!]]!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!" + "'", str2, "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
    }

    @Test
    public void test08495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08495");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("ELLLELLLELLLELLL\200}}`ELLLELLLELLLELLL]]!", "\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\200}}`\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266]]!" + "'", str2, "\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\200}}`\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266]]!");
    }

    @Test
    public void test08496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08496");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08497");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("XXXXXXXXXXXXXXXX\200}}`XXXXXXXXXXXXXXXX]]!", "\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test08498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08498");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200!", "unulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200!" + "'", str2, "\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200!");
    }

    @Test
    public void test08499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08499");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6\u02b6!", "\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!" + "'", str2, "!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!");
    }

    @Test
    public void test08500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08500");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u01a8\u01a8\u01a6\u01a6\u01a8\u01a8\u01a6\u01a6\u01a8\u01a8\u01a6\u01a6\u01a8\u01a8\u01a6\u01a6}}!", "\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150nullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!" + "'", str2, "nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!");
    }
}
