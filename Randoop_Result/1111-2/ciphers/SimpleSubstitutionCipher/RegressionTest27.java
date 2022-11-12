package ciphers.SimpleSubstitutionCipher;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest27 {

    public static boolean debug = false;

    @Test
    public void test13501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13501");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!", "NLLLNLLLNLLLNLLL\200}}`NLLLNLLLNLLLNLLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13502");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````!", "\250\250\250\250\250\250\250\250\250\246~~\250\246~~\250\250\250\250\250\250\250\250\250\246~~\250\246~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````!" + "'", str2, "````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````!");
    }

    @Test
    public void test13503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13503");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~!", "!\253\256\256\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01bc\u01bc\u01ba\u01ba\u01bc\u01bc\u01bc\u01ba\u01ba\u01bc\u01bc\u01bc\u01ba\u01ba\u01bc\u01bc\u01bc\u01ba\u01ba\u01bc\u01bc\u01bc\u01ba\u01ba\u01bc\u01bc\u01bc\u01ba\u01ba\u01bc\u01bc\u01bc\u01ba\u01ba\u01bc\u01bc\u01bc\u01ba\u01ba\u01bc~~!" + "'", str2, "\u01bc\u01bc\u01ba\u01ba\u01bc\u01bc\u01bc\u01ba\u01ba\u01bc\u01bc\u01bc\u01ba\u01ba\u01bc\u01bc\u01bc\u01ba\u01ba\u01bc\u01bc\u01bc\u01ba\u01ba\u01bc\u01bc\u01bc\u01ba\u01ba\u01bc\u01bc\u01bc\u01ba\u01ba\u01bc\u01bc\u01bc\u01ba\u01ba\u01bc~~!");
    }

    @Test
    public void test13504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13504");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254!!!", "!nullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!!" + "'", str2, "nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!!");
    }

    @Test
    public void test13505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13505");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~!", "NNNNNNNNNNNNNNNN\200}}`NNNNNNNNNNNNNNNN]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230N!~~N!~~N!~~\215\216\230\230N!~~N!~~N!~~\215\216\230\230N!~~N!~~N!~~\215\216\230\230N!~~N!~~N!~~\215\216\230\230N!~~N!~~N!~~\215\216\230\230N!~~N!~~N!~~\215\216\230\230N!~~N!~~N!~~\215\216\230\230N!~~N!~~N!~~!" + "'", str2, "\215\216\230\230N!~~N!~~N!~~\215\216\230\230N!~~N!~~N!~~\215\216\230\230N!~~N!~~N!~~\215\216\230\230N!~~N!~~N!~~\215\216\230\230N!~~N!~~N!~~\215\216\230\230N!~~N!~~N!~~\215\216\230\230N!~~N!~~N!~~\215\216\230\230N!~~N!~~N!~~!");
    }

    @Test
    public void test13506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13506");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200!", "_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200!" + "'", str2, "~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200!");
    }

    @Test
    public void test13507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13507");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!", "LLUULLUU}}LLUULLUU}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullrpp!!!nullrpp!!!!!nullrpp!!!nullrpp!!!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!!!nullrpp!!!nullrpp!!!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!!!nullrpp!!!nullrpp!!!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!!!nullrpp!!!nullrpp!!!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!!!nullrpp!!!nullrpp!!!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!!!nullrpp!!!nullrpp!!!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!!!nullrpp!!!nullrpp!!!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!!!nullrpp!!!nullrpp!!!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!!" + "'", str2, "nullrpp!!!nullrpp!!!!!nullrpp!!!nullrpp!!!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!!!nullrpp!!!nullrpp!!!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!!!nullrpp!!!nullrpp!!!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!!!nullrpp!!!nullrpp!!!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!!!nullrpp!!!nullrpp!!!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!!!nullrpp!!!nullrpp!!!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!!!nullrpp!!!nullrpp!!!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!!!nullrpp!!!nullrpp!!!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!nullrpp!!!!");
    }

    @Test
    public void test13508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13508");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0346\u0346\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0346\u0346\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0346\u0346\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0346\u0346\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0346\u0346\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0346\u0346\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0346\u0346\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0346\u0346!", "nullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqll!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!" + "'", str2, "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!");
    }

    @Test
    public void test13509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13509");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test13510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13510");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275\ua7ab\ua7ab\ua7ab\ua7ab\230\230\u0366\ua7ab\ua7ab\ua7ab\ua7ab\230\230\ua7ab\ua7ab\ua7ab\ua7ab\230\230\ua7ab\ua7ab\ua7ab\ua7ab\230\230\u0366\ua7ab\ua7ab\ua7ab\ua7ab\230\230\ua7ab\ua7ab\ua7ab\ua7ab\230\230\200\200\ua7ab\ua7ab\ua7ab\ua7ab\230\230\u0366\ua7ab\ua7ab\ua7ab\ua7ab\230\230\ua7ab\ua7ab\ua7ab\ua7ab\230\230\ua7ab\ua7ab\ua7ab\ua7ab\230\230\u0366\ua7ab\ua7ab\ua7ab\ua7ab\230\230\ua7ab\ua7ab\ua7ab\ua7ab\230\230\200\200\ua7ab\ua7ab\ua7ab\ua7ab\230\230\u0366\ua7ab\ua7ab\ua7ab\ua7ab\230\230\ua7ab\ua7ab\ua7ab\ua7ab\230\230\ua7ab\ua7ab\ua7ab\ua7ab\230\230\u0366\ua7ab\ua7ab\ua7ab\ua7ab\230\230\ua7ab\ua7ab\ua7ab\ua7ab\230\230\200\200\276\ua7ab\ua7ab\ua7ab\ua7ab\230\230\u0366\ua7ab\ua7ab\ua7ab\ua7ab\230\230\ua7ab\ua7ab\ua7ab\ua7ab\230\230\ua7ab\ua7ab\ua7ab\ua7ab\230\230\u0366\ua7ab\ua7ab\ua7ab\ua7ab\230\230\ua7ab\ua7ab\ua7ab\ua7ab\230\230\200\200\275\275!", "!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!!nullnull!!nullnull\230\230\u0366!!nullnull!!nullnull\230\230!!nullnull!!nullnull\230\230!!nullnull!!nullnull\230\230\u0366!!nullnull!!nullnull\230\230!!nullnull!!nullnull\230\230\200\200!!nullnull!!nullnull\230\230\u0366!!nullnull!!nullnull\230\230!!nullnull!!nullnull\230\230!!nullnull!!nullnull\230\230\u0366!!nullnull!!nullnull\230\230!!nullnull!!nullnull\230\230\200\200!!nullnull!!nullnull\230\230\u0366!!nullnull!!nullnull\230\230!!nullnull!!nullnull\230\230!!nullnull!!nullnull\230\230\u0366!!nullnull!!nullnull\230\230!!nullnull!!nullnull\230\230\200\200\276!!nullnull!!nullnull\230\230\u0366!!nullnull!!nullnull\230\230!!nullnull!!nullnull\230\230!!nullnull!!nullnull\230\230\u0366!!nullnull!!nullnull\230\230!!nullnull!!nullnull\230\230\200\200\275\275!" + "'", str2, "\275!!nullnull!!nullnull\230\230\u0366!!nullnull!!nullnull\230\230!!nullnull!!nullnull\230\230!!nullnull!!nullnull\230\230\u0366!!nullnull!!nullnull\230\230!!nullnull!!nullnull\230\230\200\200!!nullnull!!nullnull\230\230\u0366!!nullnull!!nullnull\230\230!!nullnull!!nullnull\230\230!!nullnull!!nullnull\230\230\u0366!!nullnull!!nullnull\230\230!!nullnull!!nullnull\230\230\200\200!!nullnull!!nullnull\230\230\u0366!!nullnull!!nullnull\230\230!!nullnull!!nullnull\230\230!!nullnull!!nullnull\230\230\u0366!!nullnull!!nullnull\230\230!!nullnull!!nullnull\230\230\200\200\276!!nullnull!!nullnull\230\230\u0366!!nullnull!!nullnull\230\230!!nullnull!!nullnull\230\230!!nullnull!!nullnull\230\230\u0366!!nullnull!!nullnull\230\230!!nullnull!!nullnull\230\230\200\200\275\275!");
    }

    @Test
    public void test13511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13511");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275}~\200\200}~\200\200}~\200\200\276}~\200\200\275\275!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275}~\200\200}~\200\200}~\200\200\276}~\200\200\275\275!" + "'", str2, "\275}~\200\200}~\200\200}~\200\200\276}~\200\200\275\275!");
    }

    @Test
    public void test13512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13512");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("}}`\275\275}`\275\275!!!!!\200\200}}`\275\275}`\275\275!!!!!\200\200}}`\275\275}`\275\275!!!!!\200\200}}`\275\275}`\275\275!!!!!\200\200}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}}`\275\275}`\275\275!!!!!\200\200}}`\275\275}`\275\275!!!!!\200\200}}`\275\275}`\275\275!!!!!\200\200}}`\275\275}`\275\275!!!!!\200\200}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~!", "nullnullnullnullnullnullnullnullnull~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~nullnullnullnullnullnullnullnullnull~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~nullnullnullnullnullnullnullnullnull~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~nullnullnullnullnullnullnullnullnull~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~nullnullnullnullnullnullnullnullnull~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~nullnullnullnullnullnullnullnullnull~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~nullnullnullnullnullnullnullnullnull~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~nullnullnullnullnullnullnullnullnull~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}}`\275\275}`\275\275!!!!!\200\200}}`\275\275}`\275\275!!!!!\200\200}}`\275\275}`\275\275!!!!!\200\200}}`\275\275}`\275\275!!!!!\200\200}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}}`\275\275}`\275\275!!!!!\200\200}}`\275\275}`\275\275!!!!!\200\200}}`\275\275}`\275\275!!!!!\200\200}}`\275\275}`\275\275!!!!!\200\200}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~!" + "'", str2, "}}`\275\275}`\275\275!!!!!\200\200}}`\275\275}`\275\275!!!!!\200\200}}`\275\275}`\275\275!!!!!\200\200}}`\275\275}`\275\275!!!!!\200\200}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}}`\275\275}`\275\275!!!!!\200\200}}`\275\275}`\275\275!!!!!\200\200}}`\275\275}`\275\275!!!!!\200\200}}`\275\275}`\275\275!!!!!\200\200}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~!");
    }

    @Test
    public void test13513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13513");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348LL!", "NLLL\220NN\200}}`NLLL\220NN]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348NN!" + "'", str2, "\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348\u0348NN\276\u0348\u0348NN!");
    }

    @Test
    public void test13514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13514");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!", "!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!NNN!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!" + "'", str2, "!NNN!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!");
    }

    @Test
    public void test13515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13515");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266!", "}~\200\200}~\200\200!I!!!I!!!I!!!I!!^!I!!!I!!!I!!!I!!!I!!!I!!!I!!!I!!!I!!!I!!!I!!!I!!^!I!!!I!!!I!!!I!!!I!!!I!!!I!!!I!!}~\200\200}~\200\200!I!!!I!!!I!!!I!!^!I!!!I!!!I!!!I!!!I!!!I!!!I!!!I!!!I!!!I!!!I!!!I!!^!I!!!I!!!I!!!I!!!I!!!I!!!I!!!I!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!\276\276\266\266\276\276\266\266!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!\276\276\266\266\276\276\266\266!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!\276\276\266\266\276\276\266\266!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!\276\276\266\266\276\276\266\266!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!\276\276\266\266\276\276\266\266!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!\276\276\266\266\276\276\266\266!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!\276\276\266\266\276\276\266\266!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!\276\276\266\266\276\276\266\266!" + "'", str2, "!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!\276\276\266\266\276\276\266\266!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!\276\276\266\266\276\276\266\266!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!\276\276\266\266\276\276\266\266!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!\276\276\266\266\276\276\266\266!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!\276\276\266\266\276\276\266\266!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!\276\276\266\266\276\276\266\266!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!\276\276\266\266\276\276\266\266!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!\276\276\266\266\276\276\266\266!");
    }

    @Test
    public void test13516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13516");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13517");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!!\300\300!", "\253\254\256\256\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128nullnull\253\254\256\256\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!nullnull!" + "'", str2, "!!!nullnull!");
    }

    @Test
    public void test13518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13518");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230!", "!NL!!\230NL!!NL!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\u0245\u0246\u0246\u0245\u0246\u0246\230\230\u0245\u0246\u0246\u0245\u0246\u0246\230\230~}\200\200~}\200\200\u0245\u0246\u0246\u0245\u0246\u0246\230\230\u0245\u0246\u0246\u0245\u0246\u0246\230\230~}\200\200~}\200\200\u0245\u0246\u0246\u0245\u0246\u0246\230\230\u0245\u0246\u0246\u0245\u0246\u0246\230\230~}\200\200~}\200\200\u0245\u0246\u0246\u0245\u0246\u0246\230\230\u0245\u0246\u0246\u0245\u0246\u0246\230\230~}\200\200~}\200\200\u0245\u0246\u0246\u0245\u0246\u0246\230\230\u0245\u0246\u0246\u0245\u0246\u0246\230\230~}\200\200~}\200\200\u0245\u0246\u0246\u0245\u0246\u0246\230\230\u0245\u0246\u0246\u0245\u0246\u0246\230\230~}\200\200~}\200\200\u0245\u0246\u0246\u0245\u0246\u0246\230\230\u0245\u0246\u0246\u0245\u0246\u0246\230\230~}\200\200~}\200\200\u0245\u0246\u0246\u0245\u0246\u0246\230\230\u0245\u0246\u0246\u0245\u0246\u0246\230\230!" + "'", str2, "~}\200\200~}\200\200\u0245\u0246\u0246\u0245\u0246\u0246\230\230\u0245\u0246\u0246\u0245\u0246\u0246\230\230~}\200\200~}\200\200\u0245\u0246\u0246\u0245\u0246\u0246\230\230\u0245\u0246\u0246\u0245\u0246\u0246\230\230~}\200\200~}\200\200\u0245\u0246\u0246\u0245\u0246\u0246\230\230\u0245\u0246\u0246\u0245\u0246\u0246\230\230~}\200\200~}\200\200\u0245\u0246\u0246\u0245\u0246\u0246\230\230\u0245\u0246\u0246\u0245\u0246\u0246\230\230~}\200\200~}\200\200\u0245\u0246\u0246\u0245\u0246\u0246\230\230\u0245\u0246\u0246\u0245\u0246\u0246\230\230~}\200\200~}\200\200\u0245\u0246\u0246\u0245\u0246\u0246\230\230\u0245\u0246\u0246\u0245\u0246\u0246\230\230~}\200\200~}\200\200\u0245\u0246\u0246\u0245\u0246\u0246\230\230\u0245\u0246\u0246\u0245\u0246\u0246\230\230~}\200\200~}\200\200\u0245\u0246\u0246\u0245\u0246\u0246\230\230\u0245\u0246\u0246\u0245\u0246\u0246\230\230!");
    }

    @Test
    public void test13519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13519");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13520");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!!", "\275PPP!!!!PPP!!!!\200\200PPP!!!!PPP!!!!\200\200PPP!!!!PPP!!!!\200\200\276PPP!!!!PPP!!!!\200\200\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!!" + "'", str2, "\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!!");
    }

    @Test
    public void test13521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13521");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUU!", "!{!!!{!!!{!!!{!!!{!!!{!!!{!!!{!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!{!!!!{!!!{!!!{!!!!{!!!{!!!{!!!!{!!!{!!!{!!!!{!!!{!!!{!!!!{!!!{!!!{!!!!{!!!{!!!{!!!!{!!!{!!!{!!!!{!!!{!!!{!!!!{!!!{!!!{!!!!{!!!{!!!{!!!!{!!!{!!!{!!!!{!!!{!!!{!!!!{!!!{!!!{!!!!{!!!{!!!{!!!!{!!!{!!!{!!!!{!!!{!!!{!!!!{!!!{!!!{!!!!{!!!{!!!{!!!!{!!!{!!!{!!!!{!!!{!!!" + "'", str2, "!{!!!!{!!!{!!!{!!!!{!!!{!!!{!!!!{!!!{!!!{!!!!{!!!{!!!{!!!!{!!!{!!!{!!!!{!!!{!!!{!!!!{!!!{!!!{!!!!{!!!{!!!{!!!!{!!!{!!!{!!!!{!!!{!!!{!!!!{!!!{!!!{!!!!{!!!{!!!{!!!!{!!!{!!!{!!!!{!!!{!!!{!!!!{!!!{!!!{!!!!{!!!{!!!{!!!!{!!!{!!!{!!!!{!!!{!!!{!!!!{!!!{!!!{!!!!{!!!{!!!");
    }

    @Test
    public void test13522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13522");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LLLLLLLL!!LLLLLLLL!!!", "nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226!!!" + "'", str2, "\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226!!!");
    }

    @Test
    public void test13523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13523");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!", "!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test13524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13524");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!u!!!u!!!u!!!u!!\256\254\254!u!!!u!!!u!!!u!!\256\254\254!!!u!!!u!!!u!!!u!!\256\254\254!u!!!u!!!u!!!u!!\256\254\254!!!u!!!u!!!u!!!u!!\256\254\254!u!!!u!!!u!!!u!!\256\254\254!!!u!!!u!!!u!!!u!!\256\254\254!u!!!u!!!u!!!u!!\256\254\254!!!u!!!u!!!u!!!u!!\256\254\254!u!!!u!!!u!!!u!!\256\254\254!!!u!!!u!!!u!!!u!!\256\254\254!u!!!u!!!u!!!u!!\256\254\254!!!u!!!u!!!u!!!u!!\256\254\254!u!!!u!!!u!!!u!!\256\254\254!!!u!!!u!!!u!!!u!!\256\254\254!u!!!u!!!u!!!u!!\256\254\254!!!", "!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!null!!!null!!\256\254\254!null!!!null!!!null!!!null!!\256\254\254!!!null!!!null!!!null!!!null!!\256\254\254!null!!!null!!!null!!!null!!\256\254\254!!!null!!!null!!!null!!!null!!\256\254\254!null!!!null!!!null!!!null!!\256\254\254!!!null!!!null!!!null!!!null!!\256\254\254!null!!!null!!!null!!!null!!\256\254\254!!!null!!!null!!!null!!!null!!\256\254\254!null!!!null!!!null!!!null!!\256\254\254!!!null!!!null!!!null!!!null!!\256\254\254!null!!!null!!!null!!!null!!\256\254\254!!!null!!!null!!!null!!!null!!\256\254\254!null!!!null!!!null!!!null!!\256\254\254!!!null!!!null!!!null!!!null!!\256\254\254!null!!!null!!!null!!!null!!\256\254\254!!!" + "'", str2, "!null!!!null!!!null!!!null!!\256\254\254!null!!!null!!!null!!!null!!\256\254\254!!!null!!!null!!!null!!!null!!\256\254\254!null!!!null!!!null!!!null!!\256\254\254!!!null!!!null!!!null!!!null!!\256\254\254!null!!!null!!!null!!!null!!\256\254\254!!!null!!!null!!!null!!!null!!\256\254\254!null!!!null!!!null!!!null!!\256\254\254!!!null!!!null!!!null!!!null!!\256\254\254!null!!!null!!!null!!!null!!\256\254\254!!!null!!!null!!!null!!!null!!\256\254\254!null!!!null!!!null!!!null!!\256\254\254!!!null!!!null!!!null!!!null!!\256\254\254!null!!!null!!!null!!!null!!\256\254\254!!!null!!!null!!!null!!!null!!\256\254\254!null!!!null!!!null!!!null!!\256\254\254!!!");
    }

    @Test
    public void test13525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13525");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\340null\335\335\256\254\254\340null\335\335\256\254\254!!\340null\335\335\256\254\254\340null\335\335\256\254\254!!\340null\335\335\256\254\254\340null\335\335\256\254\254!!\340null\335\335\256\254\254\340null\335\335\256\254\254!!\340null\335\335\256\254\254\340null\335\335\256\254\254!!\340null\335\335\256\254\254\340null\335\335\256\254\254!!\340null\335\335\256\254\254\340null\335\335\256\254\254!!\340null\335\335\256\254\254\340null\335\335\256\254\254!!!", "``!!!!!!!!``!!!!!!!!``!!!!!!!!``!!!!!!!!``!!!!!!!!``!!!!!!!!``!!!!!!!!``!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!!nullnull\256\254\254null!!!!nullnull\256\254\254!!null!!!!nullnull\256\254\254null!!!!nullnull\256\254\254!!null!!!!nullnull\256\254\254null!!!!nullnull\256\254\254!!null!!!!nullnull\256\254\254null!!!!nullnull\256\254\254!!null!!!!nullnull\256\254\254null!!!!nullnull\256\254\254!!null!!!!nullnull\256\254\254null!!!!nullnull\256\254\254!!null!!!!nullnull\256\254\254null!!!!nullnull\256\254\254!!null!!!!nullnull\256\254\254null!!!!nullnull\256\254\254!!!" + "'", str2, "null!!!!nullnull\256\254\254null!!!!nullnull\256\254\254!!null!!!!nullnull\256\254\254null!!!!nullnull\256\254\254!!null!!!!nullnull\256\254\254null!!!!nullnull\256\254\254!!null!!!!nullnull\256\254\254null!!!!nullnull\256\254\254!!null!!!!nullnull\256\254\254null!!!!nullnull\256\254\254!!null!!!!nullnull\256\254\254null!!!!nullnull\256\254\254!!null!!!!nullnull\256\254\254null!!!!nullnull\256\254\254!!null!!!!nullnull\256\254\254null!!!!nullnull\256\254\254!!!");
    }

    @Test
    public void test13526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13526");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200!", "\275\276!\225\225\276!\225\225\200\200\276!\225\225\276!\225\225\200\200\276!\225\225\276!\225\225\200\200\276\276!\225\225\276!\225\225\200\200\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\225\276\225\225\225\276\225\225\200\200\225\276\225\225\225\276\225\225\200\200\225\276\225\225\225\276\225\225\200\200\225\276\225\225\225\276\225\225\200\200\225\276\225\225\225\276\225\225\200\200\225\276\225\225\225\276\225\225\200\200\225\276\225\225\225\276\225\225\200\200\225\276\225\225\225\276\225\225\200\200!" + "'", str2, "\225\276\225\225\225\276\225\225\200\200\225\276\225\225\225\276\225\225\200\200\225\276\225\225\225\276\225\225\200\200\225\276\225\225\225\276\225\225\200\200\225\276\225\225\225\276\225\225\200\200\225\276\225\225\225\276\225\225\200\200\225\276\225\225\225\276\225\225\200\200\225\276\225\225\225\276\225\225\200\200!");
    }

    @Test
    public void test13527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13527");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!\275\275\275!!\275\275\275!\275\275\275!\275\275\275!!\275\275\275!\275\275\275!!!\275\275\275!!\275\275\275!\275\275\275!\275\275\275!!\275\275\275!\275\275\275!!!", "null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\275\275\275!!\275\275\275!\275\275\275!\275\275\275!!\275\275\275!\275\275\275!!!\275\275\275!!\275\275\275!\275\275\275!\275\275\275!!\275\275\275!\275\275\275!!!" + "'", str2, "!\275\275\275!!\275\275\275!\275\275\275!\275\275\275!!\275\275\275!\275\275\275!!!\275\275\275!!\275\275\275!\275\275\275!\275\275\275!!\275\275\275!\275\275\275!!!");
    }

    @Test
    public void test13528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13528");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "}~\200\200}~\200\200\350^\214\214\350^\214\214}~\200\200}~\200\200\350^\214\214\350^\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test13529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13529");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253````````\253\253````````\253\253````````\253\253````````\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253````````\253\253````````\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!!!" + "'", str2, "!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!!!");
    }

    @Test
    public void test13530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13530");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\335LLL\335nullLL\335nullLL\335nullLL\335nullLL\335LLL\335nullLL\335nullLL!", "~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13531");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!", "\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\200\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test13532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13532");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull!", "LJ!!LJ!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\254\200nullnulleenullnulleenullnullee\200nullnulleenullnulleenullnullee\254\254\200nullnulleenullnulleenullnullee\200nullnulleenullnulleenullnullee\254\254\200nullnulleenullnulleenullnullee\200nullnulleenullnulleenullnullee\254\254\200nullnulleenullnulleenullnullee\200nullnulleenullnulleenullnullee\254\254\200nullnulleenullnulleenullnullee\200nullnulleenullnulleenullnullee\254\254\200nullnulleenullnulleenullnullee\200nullnulleenullnulleenullnullee\254\254\200nullnulleenullnulleenullnullee\200nullnulleenullnulleenullnullee\254\254\200nullnulleenullnulleenullnullee\200nullnulleenullnulleenullnullee!" + "'", str2, "\254\254\200nullnulleenullnulleenullnullee\200nullnulleenullnulleenullnullee\254\254\200nullnulleenullnulleenullnullee\200nullnulleenullnulleenullnullee\254\254\200nullnulleenullnulleenullnullee\200nullnulleenullnulleenullnullee\254\254\200nullnulleenullnulleenullnullee\200nullnulleenullnulleenullnullee\254\254\200nullnulleenullnulleenullnullee\200nullnulleenullnulleenullnullee\254\254\200nullnulleenullnulleenullnullee\200nullnulleenullnulleenullnullee\254\254\200nullnulleenullnulleenullnullee\200nullnulleenullnulleenullnullee\254\254\200nullnulleenullnulleenullnullee\200nullnulleenullnulleenullnullee!");
    }

    @Test
    public void test13533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13533");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}null!!!\200\200}null!!!\200\200}null!!!\200\200}null!!!\200\200null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~}null!!!\200\200}null!!!\200\200}null!!!\200\200}null!!!\200\200null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~!", "\u0317\u031a\u0317\u031a\u0317\u031a\u0317\u031anull`nullnullnull`nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}UN``!!!\200\200}UN``!!!\200\200}UN``!!!\200\200}UN``!!!\200\200UN``!~~UN``!~~UN``!~~UN``!~~UN``!~~UN``!~~UN``!~~UN``!~~UN``!~~UN``!~~UN``!~~UN``!~~UN``!~~UN``!~~UN``!~~UN``!~~}UN``!!!\200\200}UN``!!!\200\200}UN``!!!\200\200}UN``!!!\200\200UN``!~~UN``!~~UN``!~~UN``!~~UN``!~~UN``!~~UN``!~~UN``!~~!" + "'", str2, "}UN``!!!\200\200}UN``!!!\200\200}UN``!!!\200\200}UN``!!!\200\200UN``!~~UN``!~~UN``!~~UN``!~~UN``!~~UN``!~~UN``!~~UN``!~~UN``!~~UN``!~~UN``!~~UN``!~~UN``!~~UN``!~~UN``!~~UN``!~~}UN``!!!\200\200}UN``!!!\200\200}UN``!!!\200\200}UN``!!!\200\200UN``!~~UN``!~~UN``!~~UN``!~~UN``!~~UN``!~~UN``!~~UN``!~~!");
    }

    @Test
    public void test13534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13534");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("null\335nullnullnull\335\u035e\u035enull\335nullnullnull\335\u035e\u035e!!!!null\335nullnullnull\335\u035e\u035enull\335nullnullnull\335\u035e\u035e!", "N!UUN!UUUUN!UUN!UUUUN!UUN!UUUUN!UUN!UUUUN!UUN!UUUUN!UUN!UUUUN!UUN!UUUUN!UUN!UUUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\260nullnullnull\253\260nullnull\253\260nullnull\253\260nullnullnull\253\260nullnull\253\260\u035e\u035e\253\260nullnullnull\253\260nullnull\253\260nullnull\253\260nullnullnull\253\260nullnull\253\260\u035e\u035e!!!!\253\260nullnullnull\253\260nullnull\253\260nullnull\253\260nullnullnull\253\260nullnull\253\260\u035e\u035e\253\260nullnullnull\253\260nullnull\253\260nullnull\253\260nullnullnull\253\260nullnull\253\260\u035e\u035e!" + "'", str2, "\253\260nullnullnull\253\260nullnull\253\260nullnull\253\260nullnullnull\253\260nullnull\253\260\u035e\u035e\253\260nullnullnull\253\260nullnull\253\260nullnull\253\260nullnullnull\253\260nullnull\253\260\u035e\u035e!!!!\253\260nullnullnull\253\260nullnull\253\260nullnull\253\260nullnullnull\253\260nullnull\253\260\u035e\u035e\253\260nullnullnull\253\260nullnull\253\260nullnull\253\260nullnullnull\253\260nullnull\253\260\u035e\u035e!");
    }

    @Test
    public void test13535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13535");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~~!!~~!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~!!~~!!!" + "'", str2, "~~!!~~!!!");
    }

    @Test
    public void test13536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13536");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull!", "\226F\230\230\226F\230\230\226F\230\230\226F\230\230\226F\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``f!\230\230f!\230\230``f!\230\230f!\230\230``f!\230\230f!\230\230``f!\230\230f!\230\230``f!\230\230f!\230\230``f!\230\230f!\230\230``f!\230\230f!\230\230``f!\230\230f!\230\230!" + "'", str2, "``f!\230\230f!\230\230``f!\230\230f!\230\230``f!\230\230f!\230\230``f!\230\230f!\230\230``f!\230\230f!\230\230``f!\230\230f!\230\230``f!\230\230f!\230\230``f!\230\230f!\230\230!");
    }

    @Test
    public void test13537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13537");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("L\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLL!", "null\276\276\276null\276\276\276null\276\276\276null\276\276\276null\276\276\276null\276\276\276null\276\276\276null\276\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u\200uuuuuu\200uuuuuu\200uuuuuu\200uuuuuu\200uuuuuu\200uuuuuu\200uuuuuu\200uuuuu!" + "'", str2, "u\200uuuuuu\200uuuuuu\200uuuuuu\200uuuuuu\200uuuuuu\200uuuuuu\200uuuuuu\200uuuuu!");
    }

    @Test
    public void test13538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13538");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\220\220NN]]NN]]\253\253\253\200}}`\220\220NN]]NN]]\253\253\253]]!", "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\200}}}\200}}}\200\u02fa\200}}}\200}}}\200\u02fa\200}}}\200}}}\200\u02fa\200}}}\200}}}\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\200}}}\200}}}\200\u02fa\200}}}\200}}}\200}}}!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\u02f7\u02f7\u02f7\u02f7]]\253\253\253\200}}`\220\220\u02f7\u02f7\u02f7\u02f7]]\253\253\253]]!" + "'", str2, "\220\220\u02f7\u02f7\u02f7\u02f7]]\253\253\253\200}}`\220\220\u02f7\u02f7\u02f7\u02f7]]\253\253\253]]!");
    }

    @Test
    public void test13539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13539");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UNLLUNLLUNLLUNLLUNLL!", "\u0366\u0365\u0368\u0368\335\336\340\340nullnullnull\335\336\340\340nullnullnull!!\335\336\340\340nullnullnull\335\336\340\340nullnullnull!!\335\336\340\340nullnullnull\335\336\340\340nullnullnull!!\335\336\340\340nullnullnull\335\336\340\340\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\310\307\312\312\310\307\312\312\310\307\312\312\310\307\312\312\310\307\312\312!" + "'", str2, "\310\307\312\312\310\307\312\312\310\307\312\312\310\307\312\312\310\307\312\312!");
    }

    @Test
    public void test13540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13540");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298!", "\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13541");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNL!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!", "}N\200\200}N\200\200}N\200\200}N\200\200ULLLULLLULLLULLL}N\200\200}N\200\200}N\200\200}N\200\200ULLLULLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x!~~x!~~x!~~x!~~x!~~x!~~x!~~x!~~xxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnx!~~x!~~x!~~x!~~x!~~x!~~x!~~x!~~xxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnn!" + "'", str2, "x!~~x!~~x!~~x!~~x!~~x!~~x!~~x!~~xxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnx!~~x!~~x!~~x!~~x!~~x!~~x!~~x!~~xxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnnxxnn!");
    }

    @Test
    public void test13542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13542");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNN!!!NNNN!!!NNNN!!!NNNN!!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNN!!!NNNN!!!!", "RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]!!RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]!!RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]!!RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]!!RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]!!RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]!!RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]!!RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnull!!!nullnullnullnull!!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnull!!!nullnullnullnull!!!!");
    }

    @Test
    public void test13543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13543");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da!!!!!!!!", "\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da!!!!!!!!" + "'", str2, "\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da!!!!!!!!");
    }

    @Test
    public void test13544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13544");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HH!", "!L!!\216\254\254!L!!\216\254\254!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!\216\254\254!L!!\216\254\254!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!\216\254\254!L!!\216\254\254!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!\216\254\254!L!!\216\254\254!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!\216\254\254!L!!\216\254\254!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!\216\254\254!L!!\216\254\254!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!\216\254\254!L!!\216\254\254!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!\216\254\254!L!!\216\254\254!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!" + "'", str2, "!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!");
    }

    @Test
    public void test13545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13545");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]!" + "'", str2, "\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]!");
    }

    @Test
    public void test13546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13546");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\374!\376\376\374!\376\376\374!\376\376\374!\376\376!!!\374!\376\376\374!\376\376\374!\376\376\374!\376\376!!!!!\374!\376\376\374!\376\376\374!\376\376\374!\376\376!!!\374!\376\376\374!\376\376\374!\376\376\374!\376\376!!!!!\374!\376\376\374!\376\376\374!\376\376\374!\376\376!!!\374!\376\376\374!\376\376\374!\376\376\374!\376\376!!!!!\374!\376\376\374!\376\376\374!\376\376\374!\376\376!!!\374!\376\376\374!\376\376\374!\376\376\374!\376\376!!!!!\374!\376\376\374!\376\376\374!\376\376\374!\376\376!!!\374!\376\376\374!\376\376\374!\376\376\374!\376\376!!!!!\374!\376\376\374!\376\376\374!\376\376\374!\376\376!!!\374!\376\376\374!\376\376\374!\376\376\374!\376\376!!!!!\374!\376\376\374!\376\376\374!\376\376\374!\376\376!!!\374!\376\376\374!\376\376\374!\376\376\374!\376\376!!!!!\374!\376\376\374!\376\376\374!\376\376\374!\376\376!!!\374!\376\376\374!\376\376\374!\376\376\374!\376\376!!!!!", "\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!!!" + "'", str2, "!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!!!");
    }

    @Test
    public void test13547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13547");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\200}}`\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\227!\227\227\227!\227\227\227!\227\227\227!\227\227\227!\227\227\227!\227\227\227!\227\227\227!\227\227\227!\227\227\227!\227\227\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\227!\227\227\227!\227\227\227!\227\227\227!\227\227\227!\227\227\227!\227\227\227!\227\227\227!\227\227\227!\227\227\227!\227\227\u0346\u0348\u0348!");
    }

    @Test
    public void test13548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13548");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!", "}nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!~}}^}nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!" + "'", str2, "!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!");
    }

    @Test
    public void test13549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13549");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13550");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test13551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13551");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\300\300\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\300\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\300\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\300\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\300\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\300\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\300\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\300\300\300\300\335\300\300\300\335\300\300\300\335\300\300!", "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test13552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13552");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!!", "LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!!!LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!!!LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!!!LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!!!LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!" + "'", str2, "!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!!LL!!LL!!!");
    }

    @Test
    public void test13553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13553");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\276~~~\276~~~\276~~~\276~~~\276~~~\276~~~\276~~~\276~~~!", "!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276~~~\276~~~\276~~~\276~~~\276~~~\276~~~\276~~~\276~~~!" + "'", str2, "\276~~~\276~~~\276~~~\276~~~\276~~~\276~~~\276~~~\276~~~!");
    }

    @Test
    public void test13554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13554");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\300\300\300\275\300\300\300\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\300\300\300\275\300\300\300!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\342null\342\342\342null\342\342\253\253\342null\342\342\342null\342\342\253\253\342null\342\342\342null\342\342\253\253\342null\342\342\342null\342\342\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\342null\342\342\342null\342\342\253\253\342null\342\342\342null\342\342\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\253\253\253\275\253\253\253\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\253\253\253\275\253\253\253!" + "'", str2, "\275\253\253\253\275\253\253\253\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\253\253\253\275\253\253\253!");
    }

    @Test
    public void test13555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13555");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\200\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348]]!", "\u0366\u0365\u0368\u0368\245\245\245\245\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\200\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348]]!" + "'", str2, "\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\200\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348]]!");
    }

    @Test
    public void test13556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13556");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~\200}}~\200}}~\200}}~\200}}nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~\200}}~\200}}~\200}}~\200}}nullnullnullnullnullnullnullnull!", "U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230\200}}`U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~\200}}~\200}}~\200}}~\200}}!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL~\200}}~\200}}~\200}}~\200}}!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!" + "'", str2, "~\200}}~\200}}~\200}}~\200}}!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL~\200}}~\200}}~\200}}~\200}}!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!");
    }

    @Test
    public void test13557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13557");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!", "nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!" + "'", str2, "!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!");
    }

    @Test
    public void test13558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13558");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\325nullnullnull\325nullnullnull\275\275\325nullnullnull\325nullnullnull\275\275\325nullnullnull\325nullnullnull\275\275\325nullnullnull\325nullnullnull\275\275\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\325nullnullnull\325nullnullnull\275\275\325nullnullnull\325nullnullnull\275\275!", "~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275LLLUULLUULLUULLLUULLUULLUULLLUULLUULLUU\275LLLUULLUULLUULLLUULLUULLUULLLUULLUULLUU\275LLLUULLUULLUULLLUULLUULLUULLLUULLUULLUU\275LLLUULLUULLUULLLUULLUULLUULLLUULLUULLUULLLUULLUULLUULLLUULLUULLUU\275\275LLLUULLUULLUULLLUULLUULLUU\275\275LLLUULLUULLUULLLUULLUULLUU\275\275LLLUULLUULLUULLLUULLUULLUU\275\275\275LLLUULLUULLUULLLUULLUULLUULLLUULLUULLUU\275LLLUULLUULLUULLLUULLUULLUULLLUULLUULLUU\275LLLUULLUULLUULLLUULLUULLUULLLUULLUULLUU\275LLLUULLUULLUULLLUULLUULLUULLLUULLUULLUULLLUULLUULLUULLLUULLUULLUU\275\275LLLUULLUULLUULLLUULLUULLUU\275\275!" + "'", str2, "\275LLLUULLUULLUULLLUULLUULLUULLLUULLUULLUU\275LLLUULLUULLUULLLUULLUULLUULLLUULLUULLUU\275LLLUULLUULLUULLLUULLUULLUULLLUULLUULLUU\275LLLUULLUULLUULLLUULLUULLUULLLUULLUULLUULLLUULLUULLUULLLUULLUULLUU\275\275LLLUULLUULLUULLLUULLUULLUU\275\275LLLUULLUULLUULLLUULLUULLUU\275\275LLLUULLUULLUULLLUULLUULLUU\275\275\275LLLUULLUULLUULLLUULLUULLUULLLUULLUULLUU\275LLLUULLUULLUULLLUULLUULLUULLLUULLUULLUU\275LLLUULLUULLUULLLUULLUULLUULLLUULLUULLUU\275LLLUULLUULLUULLLUULLUULLUULLLUULLUULLUULLLUULLUULLUULLLUULLUULLUU\275\275LLLUULLUULLUULLLUULLUULLUU\275\275!");
    }

    @Test
    public void test13559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13559");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullL\225!!L\225!!L\225!!L\225!!L\225!!L\225!!L\225!!L\225!!L\225!!L\225!!L\225!!L\225!!L\225!!L\225!!L\225!!L\225!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullL\225!!L\225!!L\225!!L\225!!L\225!!L\225!!L\225!!L\225!!!", "L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNL!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN~\225!!~\225!!~\225!!~\225!!~\225!!~\225!!~\225!!~\225!!~\225!!~\225!!~\225!!~\225!!~\225!!~\225!!~\225!!~\225!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN~\225!!~\225!!~\225!!~\225!!~\225!!~\225!!~\225!!~\225!!!" + "'", str2, "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN~\225!!~\225!!~\225!!~\225!!~\225!!~\225!!~\225!!~\225!!~\225!!~\225!!~\225!!~\225!!~\225!!~\225!!~\225!!~\225!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN~\225!!~\225!!~\225!!~\225!!~\225!!~\225!!~\225!!~\225!!!");
    }

    @Test
    public void test13560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13560");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!", "!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!" + "'", str2, "!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!");
    }

    @Test
    public void test13561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13561");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test13562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13562");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!" + "'", str2, "\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!");
    }

    @Test
    public void test13563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13563");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!\256LNLL\254\254\256LNLL\254\254!!\256LNLL\254\254\256LNLL\254\254!!\256LNLL\254\254\256LNLL\254\254!!\256LNLL\254\254\256LNLL\254\254!!\256LNLL\254\254\256LNLL\254\254!!\256LNLL\254\254\256LNLL\254\254!!\256LNLL\254\254\256LNLL\254\254!!\256LNLL\254\254\256LNLL\254\254!", "\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\256\u020e\u020e\u020e\254\254\256\u020e\u020e\u020e\254\254!!\256\u020e\u020e\u020e\254\254\256\u020e\u020e\u020e\254\254!!\256\u020e\u020e\u020e\254\254\256\u020e\u020e\u020e\254\254!!\256\u020e\u020e\u020e\254\254\256\u020e\u020e\u020e\254\254!!\256\u020e\u020e\u020e\254\254\256\u020e\u020e\u020e\254\254!!\256\u020e\u020e\u020e\254\254\256\u020e\u020e\u020e\254\254!!\256\u020e\u020e\u020e\254\254\256\u020e\u020e\u020e\254\254!!\256\u020e\u020e\u020e\254\254\256\u020e\u020e\u020e\254\254!" + "'", str2, "!!\256\u020e\u020e\u020e\254\254\256\u020e\u020e\u020e\254\254!!\256\u020e\u020e\u020e\254\254\256\u020e\u020e\u020e\254\254!!\256\u020e\u020e\u020e\254\254\256\u020e\u020e\u020e\254\254!!\256\u020e\u020e\u020e\254\254\256\u020e\u020e\u020e\254\254!!\256\u020e\u020e\u020e\254\254\256\u020e\u020e\u020e\254\254!!\256\u020e\u020e\u020e\254\254\256\u020e\u020e\u020e\254\254!!\256\u020e\u020e\u020e\254\254\256\u020e\u020e\u020e\254\254!!\256\u020e\u020e\u020e\254\254\256\u020e\u020e\u020e\254\254!");
    }

    @Test
    public void test13564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13564");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230\200}}`UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230]]!", "~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u029c\u029c^^\225\230\230\u029c\u029c^^\225\230\230\u029c\u029c^^\225\230\230\u029c\u029c^^\225\230\230\200\u029c\u029c^^\225\230\230\u029c\u029c^^\225\230\230\u029c\u029c^^\225\230\230\u029c\u029c^^\225\230\230]]!" + "'", str2, "\u029c\u029c^^\225\230\230\u029c\u029c^^\225\230\230\u029c\u029c^^\225\230\230\u029c\u029c^^\225\230\230\200\u029c\u029c^^\225\230\230\u029c\u029c^^\225\230\230\u029c\u029c^^\225\230\230\u029c\u029c^^\225\230\230]]!");
    }

    @Test
    public void test13565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13565");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7!", "\u017d\u017d\u017d\u017d\260\255\255\225\230\230\u017d\u017d\u017d\u017d\260\255\255\225\230\230\u017d\u017d\u017d\u017d\260\255\255\225\230\230\u017d\u017d\u017d\u017d\260\255\255\225\230\230\200\u017d\u017d\u017d\u017d\260\255\255\225\230\230\u017d\u017d\u017d\u017d\260\255\255\225\230\230\u017d\u017d\u017d\u017d\260\255\255\225\230\230\u017d\u017d\u017d\u017d\260\255\255\225\230\230]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test13566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13566");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\276!\276\276nullnullnullnullnullnullnullnullnullnullnullnull\276!\276\276nullnullnullnullnullnullnullnullnullnullnullnull!!\276!\276\276nullnullnullnullnullnullnullnullnullnullnullnull\276!\276\276nullnullnullnullnullnullnullnullnullnullnullnull!!\200\200\u0346\u0348\u0348!", "!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\276!\276\276nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\276!\276\276nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!\276!\276\276nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\276!\276\276nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\276!\276\276nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\276!\276\276nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!\276!\276\276nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\276!\276\276nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test13567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13567");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\215}\215\215\215}\215\215ULLLULLLULLLULLL\215}\215\215\215}\215\215!", "LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215LUUULUUULUUULUUU\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215LUUULUUULUUULUUU\215}\215\215\215}\215\215!");
    }

    @Test
    public void test13568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13568");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230\200}}`nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230]]!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230]]!");
    }

    @Test
    public void test13569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13569");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368!U\276\276\230U\215\215\230U\215\215\230U\215\215!U\276\276\230U\215\215\230U\215\215\230U\215\215!!!U\276\276\230U\215\215\230U\215\215\230U\215\215!U\276\276\230U\215\215\230U\215\215\230U\215\215!!!U\276\276\230U\215\215\230U\215\215\230U\215\215!U\276\276\230U\215\215\230U\215\215\230U\215\215!!!U\276\276\230U\215\215\230U\215\215\230U\215\215!U\276\276\230U\215\215\230U\215\215\230U\215\215\u0346\u0348\u0348!", "}~\200\200}~\200\200nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!N\276\276\230N\215\215\230N\215\215\230N\215\215!N\276\276\230N\215\215\230N\215\215\230N\215\215!!!N\276\276\230N\215\215\230N\215\215\230N\215\215!N\276\276\230N\215\215\230N\215\215\230N\215\215!!!N\276\276\230N\215\215\230N\215\215\230N\215\215!N\276\276\230N\215\215\230N\215\215\230N\215\215!!!N\276\276\230N\215\215\230N\215\215\230N\215\215!N\276\276\230N\215\215\230N\215\215\230N\215\215\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!N\276\276\230N\215\215\230N\215\215\230N\215\215!N\276\276\230N\215\215\230N\215\215\230N\215\215!!!N\276\276\230N\215\215\230N\215\215\230N\215\215!N\276\276\230N\215\215\230N\215\215\230N\215\215!!!N\276\276\230N\215\215\230N\215\215\230N\215\215!N\276\276\230N\215\215\230N\215\215\230N\215\215!!!N\276\276\230N\215\215\230N\215\215\230N\215\215!N\276\276\230N\215\215\230N\215\215\230N\215\215\u0346\u0348\u0348!");
    }

    @Test
    public void test13570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13570");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~L\276\276\276L\276\276\276L\276\276\276~L\276\276\276L\276\276\276L\276\276\276~L\276\276\276L\276\276\276L\276\276\276~L\276\276\276L\276\276\276L\276\276\276\200}}`~L\276\276\276L\276\276\276L\276\276\276~L\276\276\276L\276\276\276L\276\276\276~L\276\276\276L\276\276\276L\276\276\276~L\276\276\276L\276\276\276L\276\276\276]]!", "\275\200!!\275\200!!!!\275\200!!\275\200!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~null\276\276\276null\276\276\276null\276\276\276~null\276\276\276null\276\276\276null\276\276\276~null\276\276\276null\276\276\276null\276\276\276~null\276\276\276null\276\276\276null\276\276\276\200}}`~null\276\276\276null\276\276\276null\276\276\276~null\276\276\276null\276\276\276null\276\276\276~null\276\276\276null\276\276\276null\276\276\276~null\276\276\276null\276\276\276null\276\276\276]]!" + "'", str2, "~null\276\276\276null\276\276\276null\276\276\276~null\276\276\276null\276\276\276null\276\276\276~null\276\276\276null\276\276\276null\276\276\276~null\276\276\276null\276\276\276null\276\276\276\200}}`~null\276\276\276null\276\276\276null\276\276\276~null\276\276\276null\276\276\276null\276\276\276~null\276\276\276null\276\276\276null\276\276\276~null\276\276\276null\276\276\276null\276\276\276]]!");
    }

    @Test
    public void test13571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13571");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200\u0348\u0346\u0346!", "``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!~}}^``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200``!!```!!``!!``!!```!!``!!}~\200\200}~\200\200``!!```!!``!!``!!```!!``!!}~\200\200}~\200\200``!!```!!``!!``!!```!!``!!}~\200\200}~\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200``!!```!!``!!``!!```!!``!!}~\200\200}~\200\200``!!```!!``!!``!!```!!``!!}~\200\200}~\200\200``!!```!!``!!``!!```!!``!!}~\200\200}~\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test13572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13572");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!]nullnullnullnullnullnullnullnull!]nullnullnullnullnullnullnullnull!]nullnullnullnullnullnullnullnull!]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!]nullnullnullnullnullnullnullnull!]nullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c!" + "'", str2, "\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c\u018c!");
    }

    @Test
    public void test13573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13573");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256!", "\342\344\344\344\342\344\344\256\254\254\342\344\344\344\342\344\344\256\254\254!!\342\344\344\344\342\344\344\256\254\254\342\344\344\344\342\344\344\256\254\254!!\342\344\344\344\342\344\344\256\254\254\342\344\344\344\342\344\344\256\254\254!!\342\344\344\344\342\344\344\256\254\254\342\344\344\344\342\344\344\256\254\254!!\342\344\344\344\342\344\344\256\254\254\342\344\344\344\342\344\344\256\254\254!!\342\344\344\344\342\344\344\256\254\254\342\344\344\344\342\344\344\256\254\254!!\342\344\344\344\342\344\344\256\254\254\342\344\344\344\342\344\344\256\254\254!!\342\344\344\344\342\344\344\256\254\254\342\344\344\344\342\344\344\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256!" + "'", str2, "~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256!");
    }

    @Test
    public void test13574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13574");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!", "nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!!nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!!nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!!nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!!nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!" + "'", str2, "\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!");
    }

    @Test
    public void test13575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13575");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276!!\253\253\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276!!\253\253\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276!!\253\253\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276!!\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276!!\253\253\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276!!\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test13576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13576");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!!", "}~\200\200}~\200\200FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF}~\200\200}~\200\200FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FFFFFFFFFFFFFFFF\256\254\254FFFFFFFFFFFFFFFF\256\254\254!!FFFFFFFFFFFFFFFF\256\254\254FFFFFFFFFFFFFFFF\256\254\254!!FFFFFFFFFFFFFFFF\256\254\254FFFFFFFFFFFFFFFF\256\254\254!!FFFFFFFFFFFFFFFF\256\254\254FFFFFFFFFFFFFFFF\256\254\254!!FFFFFFFFFFFFFFFF\256\254\254FFFFFFFFFFFFFFFF\256\254\254!!FFFFFFFFFFFFFFFF\256\254\254FFFFFFFFFFFFFFFF\256\254\254!!FFFFFFFFFFFFFFFF\256\254\254FFFFFFFFFFFFFFFF\256\254\254!!FFFFFFFFFFFFFFFF\256\254\254FFFFFFFFFFFFFFFF\256\254\254!!!" + "'", str2, "FFFFFFFFFFFFFFFF\256\254\254FFFFFFFFFFFFFFFF\256\254\254!!FFFFFFFFFFFFFFFF\256\254\254FFFFFFFFFFFFFFFF\256\254\254!!FFFFFFFFFFFFFFFF\256\254\254FFFFFFFFFFFFFFFF\256\254\254!!FFFFFFFFFFFFFFFF\256\254\254FFFFFFFFFFFFFFFF\256\254\254!!FFFFFFFFFFFFFFFF\256\254\254FFFFFFFFFFFFFFFF\256\254\254!!FFFFFFFFFFFFFFFF\256\254\254FFFFFFFFFFFFFFFF\256\254\254!!FFFFFFFFFFFFFFFF\256\254\254FFFFFFFFFFFFFFFF\256\254\254!!FFFFFFFFFFFFFFFF\256\254\254FFFFFFFFFFFFFFFF\256\254\254!!!");
    }

    @Test
    public void test13577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13577");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368!\253\256\256\u0346\u0348\u0348!", "]!]]!!!]!]]!!!!!]!]]!!!]!]]!!!!!]!]]!!!]!]]!!!!!]!]]!!!]!]]!!!!!]!]]!!!]!]]!!!!!]!]]!!!]!]]!!!!!]!]]!!!]!]]!!!!!]!]]!!!]!]]!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!\253\256\256\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!\253\256\256\u0346\u0348\u0348!");
    }

    @Test
    public void test13578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13578");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13579");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````\200}}`````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````]]!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````\200}}`````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````]]!" + "'", str2, "````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````\200}}`````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````]]!");
    }

    @Test
    public void test13580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13580");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!", "null]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!" + "'", str2, "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
    }

    @Test
    public void test13581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13581");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}!\200\200}!\200\200}!\200\200}!\200\200\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215}!\200\200}!\200\200}!\200\200}!\200\200\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215!", "\215}\215\215\215}\215\215RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR\215}\215\215\215}\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}!\200\200}!\200\200}!\200\200}!\200\200\230R\215\215\230R\215\215\230R\215\215\230R\215\215\230R\215\215\230R\215\215\230R\215\215\230R\215\215\230R\215\215\230R\215\215\230R\215\215\230R\215\215\230R\215\215\230R\215\215\230R\215\215\230R\215\215}!\200\200}!\200\200}!\200\200}!\200\200\230R\215\215\230R\215\215\230R\215\215\230R\215\215\230R\215\215\230R\215\215\230R\215\215\230R\215\215!" + "'", str2, "}!\200\200}!\200\200}!\200\200}!\200\200\230R\215\215\230R\215\215\230R\215\215\230R\215\215\230R\215\215\230R\215\215\230R\215\215\230R\215\215\230R\215\215\230R\215\215\230R\215\215\230R\215\215\230R\215\215\230R\215\215\230R\215\215\230R\215\215}!\200\200}!\200\200}!\200\200}!\200\200\230R\215\215\230R\215\215\230R\215\215\230R\215\215\230R\215\215\230R\215\215\230R\215\215\230R\215\215!");
    }

    @Test
    public void test13582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13582");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!!" + "'", str2, "~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!!");
    }

    @Test
    public void test13583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13583");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!", "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LUUUUU!LUUUUU!LUUUUU!LUUUUU!!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!" + "'", str2, "!LUUUUU!LUUUUU!LUUUUU!LUUUUU!!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!LUUUUU!");
    }

    @Test
    public void test13584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13584");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNN!", "\260\260nullnull\260\260nullnull}}\260\260nullnull\260\260nullnull}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gggggggggggggggggggg!!gggggggggggggggggggg!!gggggggggggggggggggggggggggggggggggggggg!!gggggggggggggggggggg!!gggggggggggggggggggg!" + "'", str2, "gggggggggggggggggggg!!gggggggggggggggggggg!!gggggggggggggggggggggggggggggggggggggggg!!gggggggggggggggggggg!!gggggggggggggggggggg!");
    }

    @Test
    public void test13585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13585");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0153\u0153\u0153\u0153\u0153\u0153\u0153\u0153\u0153\u0153\u0153\u0153nullnullnullnull!", "\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac^^!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13586");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!!", "\253\254\256\256!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!!" + "'", str2, "`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!!");
    }

    @Test
    public void test13587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13587");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0348\u0348\u0348\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200\u0348\u0346\u0346!", "!E!!!E!!!E!!!E!!!E!!!E!!!E!!```!E!!!E!!!E!!!E!!!E!!!E!!!E!!```!E!!!E!!!E!!!E!!!E!!!E!!!E!!```!E!!!E!!!E!!!E!!!E!!!E!!!E!!```!E!!!E!!!E!!!E!!!E!!!E!!!E!!```!E!!!E!!!E!!!E!!!E!!!E!!!E!!```!E!!!E!!!E!!!E!!!E!!!E!!!E!!```!E!!!E!!!E!!!E!!!E!!!E!!!E!!```!E!!!E!!!E!!!E!!!E!!!E!!!E!!```!E!!!E!!!E!!!E!!!E!!!E!!!E!!```!E!!!E!!!E!!!E!!!E!!!E!!!E!!```!E!!!E!!!E!!!E!!!E!!!E!!!E!!```!E!!!E!!!E!!!E!!!E!!!E!!!E!!```!E!!!E!!!E!!!E!!!E!!!E!!!E!!```!E!!!E!!!E!!!E!!!E!!!E!!!E!!```!E!!!E!!!E!!!E!!!E!!!E!!!E!!```!E!!!E!!!E!!!E!!!E!!!E!!!E!!```!E!!!E!!!E!!!E!!!E!!!E!!!E!!```!E!!!E!!!E!!!E!!!E!!!E!!!E!!```!E!!!E!!!E!!!E!!!E!!!E!!!E!!```!E!!!E!!!E!!!E!!!E!!!E!!!E!!```!E!!!E!!!E!!!E!!!E!!!E!!!E!!```!E!!!E!!!E!!!E!!!E!!!E!!!E!!```!E!!!E!!!E!!!E!!!E!!!E!!!E!!```!E!!!E!!!E!!!E!!!E!!!E!!!E!!```!E!!!E!!!E!!!E!!!E!!!E!!!E!!```!E!!!E!!!E!!!E!!!E!!!E!!!E!!```!E!!!E!!!E!!!E!!!E!!!E!!!E!!```!E!!!E!!!E!!!E!!!E!!!E!!!E!!```!E!!!E!!!E!!!E!!!E!!!E!!!E!!```!E!!!E!!!E!!!E!!!E!!!E!!!E!!```!E!!!E!!!E!!!E!!!E!!!E!!!E!!```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test13588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13588");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!" + "'", str2, "!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!");
    }

    @Test
    public void test13589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13589");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!", "nullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnull!!nullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnull!!nullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnull!!nullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnull!!nullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!" + "'", str2, "!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!");
    }

    @Test
    public void test13590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13590");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!", "!\231\231\231\231!\231\231\231!\231\231\231!\231\231\231!\231\231!\231\231\231\231!\231\231\231!\231\231!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!" + "'", str2, "!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!!\231\231!");
    }

    @Test
    public void test13591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13591");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0346\u0348\u0348!", "\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test13592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13592");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!!!!", "\275!!!!!!!!!!!!\275!!!!!!!!!!!!\275!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!!!!\275\275!!!!!!!!\275\275!!!!!!!!\275\275!!!!!!!!\275\275\275!!!!!!!!!!!!\275!!!!!!!!!!!!\275!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!!!!\275\275!!!!!!!!\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!!!!!null!!!!!!null!!!!!!null!!!!!!!null!!!!!!null!!!!!!null!!!!!!null!!!!!!null!!!!!!!null!!!!!!null!!!!!!null!!!!!!!null!!!!!!null!!!!!!null!!!!!!null!!!!!!null!!!!!!!null!!!!!!null!!!!!!null!!!!!!!null!!!!!!null!!!!!!null!!!!!!null!!!!!!null!!!!!!!null!!!!!!null!!!!!!null!!!!!!!null!!!!!!null!!!!!!null!!!!!!null!!!!!!null!!!!!!!null!!!!!!null!!!!!!null!!!!!!!null!!!!!!null!!!!!!null!!!!!!null!!!!!!null!!!!!!!null!!!!!!null!!!!!!null!!!!!!!null!!!!!!null!!!!!!null!!!!!!null!!!!!!null!!!!!!!null!!!!!!null!!!!!!null!!!!!!!null!!!!!!null!!!!!!null!!!!!!null!!!!!!null!!!!!!!null!!!!!!null!!!!!!null!!!!!!!null!!!!!!null!!!!!!null!!!!!!null!!!!!!" + "'", str2, "!null!!!!!!!null!!!!!!null!!!!!!null!!!!!!!null!!!!!!null!!!!!!null!!!!!!null!!!!!!null!!!!!!!null!!!!!!null!!!!!!null!!!!!!!null!!!!!!null!!!!!!null!!!!!!null!!!!!!null!!!!!!!null!!!!!!null!!!!!!null!!!!!!!null!!!!!!null!!!!!!null!!!!!!null!!!!!!null!!!!!!!null!!!!!!null!!!!!!null!!!!!!!null!!!!!!null!!!!!!null!!!!!!null!!!!!!null!!!!!!!null!!!!!!null!!!!!!null!!!!!!!null!!!!!!null!!!!!!null!!!!!!null!!!!!!null!!!!!!!null!!!!!!null!!!!!!null!!!!!!!null!!!!!!null!!!!!!null!!!!!!null!!!!!!null!!!!!!!null!!!!!!null!!!!!!null!!!!!!!null!!!!!!null!!!!!!null!!!!!!null!!!!!!null!!!!!!!null!!!!!!null!!!!!!null!!!!!!!null!!!!!!null!!!!!!null!!!!!!null!!!!!!");
    }

    @Test
    public void test13593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13593");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13594");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!", "LLUULLUU}}LLUULLUU}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!" + "'", str2, "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!");
    }

    @Test
    public void test13595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13595");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c!", "NLLL!!!NLLL!!!NLLL!!!NLLL!!!\200}}`NLLL!!!NLLL!!!NLLL!!!NLLL!!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13596");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]~}}^nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]]]!", "[[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!![[!![[!![[!![[!![[!![[!![[!![[]]!![[!![[!![[!![[!![[!![[!![[!![[]]!![[!![[!![[!![[!![[!![[!![[!![[]]!![[!![[!![[!![[!![[!![[!![[!![[]]~}}^!![[!![[!![[!![[!![[!![[!![[!![[]]!![[!![[!![[!![[!![[!![[!![[!![[]]!![[!![[!![[!![[!![[!![[!![[!![[]]!![[!![[!![[!![[!![[!![[!![[!![[]]]]!" + "'", str2, "!![[!![[!![[!![[!![[!![[!![[!![[]]!![[!![[!![[!![[!![[!![[!![[!![[]]!![[!![[!![[!![[!![[!![[!![[!![[]]!![[!![[!![[!![[!![[!![[!![[!![[]]~}}^!![[!![[!![[!![[!![[!![[!![[!![[]]!![[!![[!![[!![[!![[!![[!![[!![[]]!![[!![[!![[!![[!![[!![[!![[!![[]]!![[!![[!![[!![[!![[!![[!![[!![[]]]]!");
    }

    @Test
    public void test13597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13597");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!\200}}`!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!]]!", "\253\254\256\256L\367LLL\367LLL\367LLL\367LL\253\254\256\256L\367LLL\367LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!\200}}`!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!]]!" + "'", str2, "!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!\200}}`!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!]]!");
    }

    @Test
    public void test13598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13598");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\225N]]\225N]]\225N]]\225N]]\225N]]\225N]]\225N]]\225\u0317\u031a\225N]]\225\u0317\u031a\225N]]\225N]]\225N]]\225N]]\225N]]\225N]]\225N]]\225N]]\225N]]\225\u0317\u031a\225N]]\225\u0317\u031a\225N]]\225N]]!", "\276\276!nullPP!nullPP!nullPP!nullPP\276!nullPP!nullPP!nullPP!nullPP!nullPP!nullPP\276!nullPP!nullPP\276\276!nullPP!nullPP!nullPP!nullPP\276!nullPP!nullPP!nullPP!nullPP!nullPP!nullPP\276!nullPP!nullPP\276\276!nullPP!nullPP!nullPP!nullPP\276!nullPP!nullPP!nullPP!nullPP!nullPP!nullPP\276!nullPP!nullPP\276\276!nullPP!nullPP!nullPP!nullPP\276!nullPP!nullPP!nullPP!nullPP!nullPP!nullPP\276!nullPP!nullPP\276\276!nullPP!nullPP!nullPP!nullPP\276!nullPP!nullPP!nullPP!nullPP!nullPP!nullPP\276!nullPP!nullPP\276\276!nullPP!nullPP!nullPP!nullPP\276!nullPP!nullPP!nullPP!nullPP!nullPP!nullPP\276!nullPP!nullPP\276\276!nullPP!nullPP!nullPP!nullPP\276!nullPP!nullPP!nullPP!nullPP!nullPP!nullPP\276!nullPP!nullPP\276\276!nullPP!nullPP!nullPP!nullPP\276!nullPP!nullPP!nullPP!nullPP!nullPP!nullPP\276!nullPP!nullPP!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\225\u02fb]]\225\u02fb]]\225\u02fb]]\225\u02fb]]\225\u02fb]]\225\u02fb]]\225\u02fb]]\225\u02fb\u0317\u031a\225\u02fb]]\225\u02fb\u0317\u031a\225\u02fb]]\225\u02fb]]\225\u02fb]]\225\u02fb]]\225\u02fb]]\225\u02fb]]\225\u02fb]]\225\u02fb]]\225\u02fb]]\225\u02fb\u0317\u031a\225\u02fb]]\225\u02fb\u0317\u031a\225\u02fb]]\225\u02fb]]!" + "'", str2, "\225\u02fb]]\225\u02fb]]\225\u02fb]]\225\u02fb]]\225\u02fb]]\225\u02fb]]\225\u02fb]]\225\u02fb\u0317\u031a\225\u02fb]]\225\u02fb\u0317\u031a\225\u02fb]]\225\u02fb]]\225\u02fb]]\225\u02fb]]\225\u02fb]]\225\u02fb]]\225\u02fb]]\225\u02fb]]\225\u02fb]]\225\u02fb\u0317\u031a\225\u02fb]]\225\u02fb\u0317\u031a\225\u02fb]]\225\u02fb]]!");
    }

    @Test
    public void test13599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13599");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!", "\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!" + "'", str2, "]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!");
    }

    @Test
    public void test13600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13600");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\276LUUULUUU\275\276LUUULUUU\225\225\275\276LUUULUUU\275\276LUUULUUU\225\225\275\276LUUULUUU\275\276LUUULUUU\225\225\275\276LUUULUUU\275\276LUUULUUU\225\225\275\276LUUULUUU\275\276LUUULUUU\225\225\275\276LUUULUUU\275\276LUUULUUU\225\225\275\276LUUULUUU\275\276LUUULUUU\225\225\275\276LUUULUUU\275\276LUUULUUU\225\225!", "\201\202\204\204\u0209\u020a\u020c\u020c\u0209\u020a\u020c\u020c\u0209\u020a\u020c\u020c\201\202\204\204\201\202\204\204\201\202\204\204\201\202\204\204\201\202\204\204\201\202\204\204\201\202\204\204\201\202\204\204\201\202\204\204\201\202\204\204\201\202\204\204\201\202\204\204\201\202\204\204\201\202\204\204\201\202\204\204\201\202\204\204\201\202\204\204\u0209\u020a\u020c\u020c\u0209\u020a\u020c\u020c\u0209\u020a\u020c\u020c\201\202\204\204\201\202\204\204\201\202\204\204\201\202\204\204\201\202\204\204\201\202\204\204\201\202\204\204\201\202\204\204!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276\u020c\201\201\201\u020c\201\201\201\275\276\u020c\201\201\201\u020c\201\201\201\225\225\275\276\u020c\201\201\201\u020c\201\201\201\275\276\u020c\201\201\201\u020c\201\201\201\225\225\275\276\u020c\201\201\201\u020c\201\201\201\275\276\u020c\201\201\201\u020c\201\201\201\225\225\275\276\u020c\201\201\201\u020c\201\201\201\275\276\u020c\201\201\201\u020c\201\201\201\225\225\275\276\u020c\201\201\201\u020c\201\201\201\275\276\u020c\201\201\201\u020c\201\201\201\225\225\275\276\u020c\201\201\201\u020c\201\201\201\275\276\u020c\201\201\201\u020c\201\201\201\225\225\275\276\u020c\201\201\201\u020c\201\201\201\275\276\u020c\201\201\201\u020c\201\201\201\225\225\275\276\u020c\201\201\201\u020c\201\201\201\275\276\u020c\201\201\201\u020c\201\201\201\225\225!" + "'", str2, "\275\276\u020c\201\201\201\u020c\201\201\201\275\276\u020c\201\201\201\u020c\201\201\201\225\225\275\276\u020c\201\201\201\u020c\201\201\201\275\276\u020c\201\201\201\u020c\201\201\201\225\225\275\276\u020c\201\201\201\u020c\201\201\201\275\276\u020c\201\201\201\u020c\201\201\201\225\225\275\276\u020c\201\201\201\u020c\201\201\201\275\276\u020c\201\201\201\u020c\201\201\201\225\225\275\276\u020c\201\201\201\u020c\201\201\201\275\276\u020c\201\201\201\u020c\201\201\201\225\225\275\276\u020c\201\201\201\u020c\201\201\201\275\276\u020c\201\201\201\u020c\201\201\201\225\225\275\276\u020c\201\201\201\u020c\201\201\201\275\276\u020c\201\201\201\u020c\201\201\201\225\225\275\276\u020c\201\201\201\u020c\201\201\201\275\276\u020c\201\201\201\u020c\201\201\201\225\225!");
    }

    @Test
    public void test13601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13601");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!!", "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!" + "'", str2, "LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!");
    }

    @Test
    public void test13602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13602");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NLNNNLNNnullN\214\214nullN\214\214NLNNNLNNnullN\214\214nullN\214\214NLNNNLNNnullN\214\214nullN\214\214NLNNNLNNnullN\214\214nullN\214\214NLNNNLNNnullN\214\214nullN\214\214NLNNNLNNnullN\214\214nullN\214\214NLNNNLNNnullN\214\214nullN\214\214NLNNNLNNnullN\214\214nullN\214\214!", "]]]]]]]]!!]]]]]]]]!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]]]]]]!]]]\214\214]!]]]\214\214]]]]]]]]]!]]]\214\214]!]]]\214\214]]]]]]]]]!]]]\214\214]!]]]\214\214]]]]]]]]]!]]]\214\214]!]]]\214\214]]]]]]]]]!]]]\214\214]!]]]\214\214]]]]]]]]]!]]]\214\214]!]]]\214\214]]]]]]]]]!]]]\214\214]!]]]\214\214]]]]]]]]]!]]]\214\214]!]]]\214\214!" + "'", str2, "]]]]]]]]]!]]]\214\214]!]]]\214\214]]]]]]]]]!]]]\214\214]!]]]\214\214]]]]]]]]]!]]]\214\214]!]]]\214\214]]]]]]]]]!]]]\214\214]!]]]\214\214]]]]]]]]]!]]]\214\214]!]]]\214\214]]]]]]]]]!]]]\214\214]!]]]\214\214]]]]]]]]]!]]]\214\214]!]]]\214\214]]]]]]]]]!]]]\214\214]!]]]\214\214!");
    }

    @Test
    public void test13603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13603");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275``~~``~~``~~\276``~~\275\275!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275``~~``~~``~~\276``~~\275\275!" + "'", str2, "\275``~~``~~``~~\276``~~\275\275!");
    }

    @Test
    public void test13604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13604");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\253\256\256]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "\u0390\u0390\u0390\u0390\u0390\u0390\u0390\u0390\u0390\u0390\u0390\u0390\u0390\u0390\u0390\u0390\u0390\u0390\u0390\u0390\u0390\u0390\u0390\u0390\u0390\u0390\u0390\u0390\u0390\u0390\u0390\u0390\u0390\u0390\u0390\u0390!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!]!\225\225\225!!!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test13605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13605");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "]LNLLLNLLLNLLLNLLLNLL]]LNLLLNLL]]LNLLLNLL]]LNLLLNLL]]]LNLLLNLLLNLLLNLLLNLL]]LNLLLNLL]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\224\224\222\222\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\224\224\222\222\u0348\u0346\u0346!");
    }

    @Test
    public void test13606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13606");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnullnullnullnullnull!nullnullnull!nullnullnull!", "\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\275LL\200\275LL\200\275LL\200\275LL!\200\275LL\200\275LL\200\275LL!\200\275LL\200\275LL\200\275LL!\200\275LL\200\275LL\200\275LL!\200\275LL\200\275LL\200\275LL\200\275LL\200\275LL\200\275LL\200\275LL!\200\275LL\200\275LL\200\275LL!\200\275LL\200\275LL\200\275LL!" + "'", str2, "\200\275LL\200\275LL\200\275LL\200\275LL!\200\275LL\200\275LL\200\275LL!\200\275LL\200\275LL\200\275LL!\200\275LL\200\275LL\200\275LL!\200\275LL\200\275LL\200\275LL\200\275LL\200\275LL\200\275LL\200\275LL!\200\275LL\200\275LL\200\275LL!\200\275LL\200\275LL\200\275LL!");
    }

    @Test
    public void test13607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13607");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NN!", "U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!" + "'", str2, "!!!");
    }

    @Test
    public void test13608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13608");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!!", "\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161nullnull!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!!" + "'", str2, "`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!!");
    }

    @Test
    public void test13609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13609");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!", "!\264\214\214\264\264\264!\264\214\214\264\264\264!\264\214\214\264\264\264!\264\214\214\264\264\264\200}}`!\264\214\214\264\264\264!\264\214\214\264\264\264!\264\214\214\264\264\264!\264\214\214\264\264\264]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!!!!" + "'", str2, "!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!!!!");
    }

    @Test
    public void test13610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13610");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\236\240\240\240\u0346\u0348\u0348!", "LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\236\240\240\240\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\236\240\240\240\u0346\u0348\u0348!");
    }

    @Test
    public void test13611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13611");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]!", "\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]!" + "'", str2, "]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]!");
    }

    @Test
    public void test13612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13612");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!nullnull!!nullnull!", "\275!!!\275!!!\275!!!\275!!!!!\275\275!!\275\275!!\275\275!!\275\275\275!!!\275!!!\275!!!\275!!!!!\275\275!!\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test13613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13613");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNN!", "\253\254\256\256||||||||||||||||\253\254\256\256||||||||!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13614");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL!!\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL!!\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL!!\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL!!\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL!", "}~\200\200}~\200\200\220^nullnull\220^nullnull}~\200\200}~\200\200\220^nullnull\220^nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx!!\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx!!\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx!!\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx!!\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx!" + "'", str2, "\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx!!\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx!!\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx!!\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx!!\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx\275xxx\275xxxxx!");
    }

    @Test
    public void test13615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13615");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300!", "]nullnullnullnullnull]]nullnull]]nullnull]]nullnull]]]nullnullnullnullnull]]nullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull!" + "'", str2, "\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull\200\200nullnull!");
    }

    @Test
    public void test13616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13616");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!", "!U!!!U!!!U!!!U!!U!U!!!!U!U!!!!U!U!!!!U!U!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!" + "'", str2, "!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!");
    }

    @Test
    public void test13617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13617");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u028b\u028b\u028b\u028b\u028b\u028b\u028b\u028b!!!!\200\200\u0346\u0348\u0348!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnull!!nullnull!!!!nullnull!!nullnull!!!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnull!!nullnull!!!!nullnull!!nullnull!!!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test13618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13618");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!!!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!!!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!!!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!!!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!", "\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016enullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!" + "'", str2, "!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!");
    }

    @Test
    public void test13619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13619");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f!nullnull!", "!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!!]]!!]]!!]]!!]]]]!!]]!!]]]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]!" + "'", str2, "nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]nullnullnullnull!]]]]]]]]!");
    }

    @Test
    public void test13620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13620");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e!", "!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13621");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("`UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU`UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!", "\276\276XX\276\276XXXX\276\276XX\276\276\276\276XX\276\276XXXX\276\276XX\276\276\276\276XX\276\276XXXX\276\276XX\276\276\276\276XX\276\276XXXX\276\276XX\276\276\276\276XX\276\276XXXX\276\276XX\276\276\276\276XX\276\276XXXX\276\276XX\276\276\276\276XX\276\276XXXX\276\276XX\276\276\276\276XX\276\276XXXX\276\276XX\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276`\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!" + "'", str2, "`\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276`\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!");
    }

    @Test
    public void test13622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13622");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!!", "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\253LL\253\253LL\253\253LL\253\253\253LL\253\253LL\253\253LL\253\253\253LL\253\253LL\253\253LL\253\253\u02fa\253LL\253\253LL\253\253LL\253\253\253LL\253\253LL\253\253LL\253\253\253LL\253\253LL\253\253LL\253\253\u02fa\253LL\253\253LL\253\253LL\253\253\253LL\253\253LL\253\253LL\253\253\253LL\253\253LL\253\253LL\253\253\u02fa\253LL\253\253LL\253\253LL\253\253\253LL\253\253LL\253\253LL\253\253\253LL\253\253LL\253\253LL\253\253\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\253LL\253\253LL\253\253LL\253\253\253LL\253\253LL\253\253LL\253\253\253LL\253\253LL\253\253LL\253\253\u02fa\253LL\253\253LL\253\253LL\253\253\253LL\253\253LL\253\253LL\253\253\253LL\253\253LL\253\253LL\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\200\200\200\200\200\200\200\200\200\200\200!!!!\253\200\200\200\200\200\200\200\200\200\200\200!!!!!!\253\200\200\200\200\200\200\200\200\200\200\200!!!!\253\200\200\200\200\200\200\200\200\200\200\200!!!!!!\253\200\200\200\200\200\200\200\200\200\200\200!!!!\253\200\200\200\200\200\200\200\200\200\200\200!!!!!!\253\200\200\200\200\200\200\200\200\200\200\200!!!!\253\200\200\200\200\200\200\200\200\200\200\200!!!!!!\253\200\200\200\200\200\200\200\200\200\200\200!!!!\253\200\200\200\200\200\200\200\200\200\200\200!!!!!!\253\200\200\200\200\200\200\200\200\200\200\200!!!!\253\200\200\200\200\200\200\200\200\200\200\200!!!!!!\253\200\200\200\200\200\200\200\200\200\200\200!!!!\253\200\200\200\200\200\200\200\200\200\200\200!!!!!!\253\200\200\200\200\200\200\200\200\200\200\200!!!!\253\200\200\200\200\200\200\200\200\200\200\200!!!!!!!" + "'", str2, "\253\200\200\200\200\200\200\200\200\200\200\200!!!!\253\200\200\200\200\200\200\200\200\200\200\200!!!!!!\253\200\200\200\200\200\200\200\200\200\200\200!!!!\253\200\200\200\200\200\200\200\200\200\200\200!!!!!!\253\200\200\200\200\200\200\200\200\200\200\200!!!!\253\200\200\200\200\200\200\200\200\200\200\200!!!!!!\253\200\200\200\200\200\200\200\200\200\200\200!!!!\253\200\200\200\200\200\200\200\200\200\200\200!!!!!!\253\200\200\200\200\200\200\200\200\200\200\200!!!!\253\200\200\200\200\200\200\200\200\200\200\200!!!!!!\253\200\200\200\200\200\200\200\200\200\200\200!!!!\253\200\200\200\200\200\200\200\200\200\200\200!!!!!!\253\200\200\200\200\200\200\200\200\200\200\200!!!!\253\200\200\200\200\200\200\200\200\200\200\200!!!!!!\253\200\200\200\200\200\200\200\200\200\200\200!!!!\253\200\200\200\200\200\200\200\200\200\200\200!!!!!!!");
    }

    @Test
    public void test13623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13623");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnull~N\200\200~N\200\200!!!!nullnullnullnull~N\200\200~N\200\200!!!!!!nullnullnullnull~N\200\200~N\200\200!!!!nullnullnullnull~N\200\200~N\200\200!!!!!!nullnullnullnull~N\200\200~N\200\200!!!!nullnullnullnull~N\200\200~N\200\200!!!!!!nullnullnullnull~N\200\200~N\200\200!!!!nullnullnullnull~N\200\200~N\200\200!!!!!!nullnullnullnull~N\200\200~N\200\200!!!!nullnullnullnull~N\200\200~N\200\200!!!!!!nullnullnullnull~N\200\200~N\200\200!!!!nullnullnullnull~N\200\200~N\200\200!!!!!!nullnullnullnull~N\200\200~N\200\200!!!!nullnullnullnull~N\200\200~N\200\200!!!!!!nullnullnullnull~N\200\200~N\200\200!!!!nullnullnullnull~N\200\200~N\200\200!!!!!!!", "QTTTQTTT~~~~~QTTTQTTT~~~~~~~QTTTQTTT~~~~~QTTTQTTT~~~~~~~QTTTQTTT~~~~~QTTTQTTT~~~~~~~QTTTQTTT~~~~~QTTTQTTT~~~~~~~QTTTQTTT~~~~~QTTTQTTT~~~~~~~QTTTQTTT~~~~~QTTTQTTT~~~~~~~QTTTQTTT~~~~~QTTTQTTT~~~~~~~QTTTQTTT~~~~~QTTTQTTT~~~~~~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!!!!" + "'", str2, "Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!!!!");
    }

    @Test
    public void test13624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13624");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e!", "LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull!" + "'", str2, "\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13625");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull!!\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull!!\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull!!\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull!!\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull!", "!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL!!\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL!!\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL!!\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL!!\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL!" + "'", str2, "\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL!!\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL!!\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL!!\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL!!\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL\204\204L!LLL!LL!");
    }

    @Test
    public void test13626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13626");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c!", "LXLLLXLLX~~~X~~~X~~~X~~~X~~~X~~~X~~~X~~~LXLLLXLLX~~~X~~~X~~~X~~~X~~~X~~~X~~~X~~~LXLLLXLLX~~~X~~~X~~~X~~~X~~~X~~~X~~~X~~~LXLLLXLLX~~~X~~~X~~~X~~~X~~~X~~~X~~~X~~~LXLLLXLLX~~~X~~~X~~~X~~~X~~~X~~~X~~~X~~~LXLLLXLLX~~~X~~~X~~~X~~~X~~~X~~~X~~~X~~~LXLLLXLLX~~~X~~~X~~~X~~~X~~~X~~~X~~~X~~~LXLLLXLLX~~~X~~~X~~~X~~~X~~~X~~~X~~~X~~~!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!" + "'", str2, "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!");
    }

    @Test
    public void test13627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13627");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200LUUULUUULUUULUUULUUULUUULUUULUUU}~\200\200}~\200\200LUUULUUULUUULUUULUUULUUULUUULUUU!", "`!!\210\210UU\210\210UU!!\210\210UU\210\210UU!!\210\210UU\210\210UU`!!\210\210UU\210\210UU!!\210\210UU\210\210UU!!\210\210UU\210\210UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU}~\200\200}~\200\200!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!" + "'", str2, "}~\200\200}~\200\200!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU}~\200\200}~\200\200!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!");
    }

    @Test
    public void test13628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13628");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LNLLLNLL\253\253LNLLLNLL\253\253LNLLLNLL\253\253LNLLLNLL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LNLLLNLL\253\253LNLLLNLL\253\253!", "xx!!nullnullnullxx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!nullnullnullxx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LULLLULL\253\253LULLLULL\253\253LULLLULL\253\253LULLLULL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LULLLULL\253\253LULLLULL\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LULLLULL\253\253LULLLULL\253\253LULLLULL\253\253LULLLULL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LULLLULL\253\253LULLLULL\253\253!");
    }

    @Test
    public void test13629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13629");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("PP]]PP]]PPPPPPPPPP]]PP]]PPPPPPPP!", "\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull]]nullnull]]nullnullnullnullnullnullnullnullnullnull]]nullnull]]nullnullnullnullnullnullnullnull!" + "'", str2, "nullnull]]nullnull]]nullnullnullnullnullnullnullnullnullnull]]nullnull]]nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13630");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!!", "\250\250\246\246\250\250\246\246!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!!" + "'", str2, "`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!!");
    }

    @Test
    public void test13631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13631");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!\253\256\256]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!L]UUL]UUU!!!U!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d]!\225\225\225\u033d\u033d!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test13632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13632");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!hikkhikk!!hikkhikk!", "^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!`\200\200\200`\200\200\200!!`\200\200\200`\200\200\200!" + "'", str2, "!!`\200\200\200`\200\200\200!!`\200\200\200`\200\200\200!");
    }

    @Test
    public void test13633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13633");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!", "N~~~N~~~N~~~N~~~N~~~N~~~N~~~N~~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13634");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!", "\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\275\275\214\214\214\214\214\214\214\214\275\275\214\214\214\214\214\214\214\214\275\275\214\214\214\214\214\214\214\214\275\275\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\275\275\214\214\214\214\214\214\214\214\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!" + "'", str2, "!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!");
    }

    @Test
    public void test13635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13635");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test13636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13636");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f!!!", "XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!!!!!!!!!!!!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "!!!!!!!!!!!!!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!!!!!!!!!!!!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test13637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13637");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!!", "llllllll!!llllllll!!llllllll!!llllllll!!llllllll!!llllllll!!llllllll!!llllllll!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test13638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13638");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NN!!NN!!NN!!NN!!\200}}`NN!!NN!!NN!!NN!!]]!", "~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!\200}}`nullnull!!nullnull!!nullnull!!nullnull!!]]!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!\200}}`nullnull!!nullnull!!nullnull!!nullnull!!]]!");
    }

    @Test
    public void test13639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13639");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!", "\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037eLLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!" + "'", str2, "!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!");
    }

    @Test
    public void test13640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13640");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13641");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\253\254\256\256````````````````````````````````````````````````````````````````\253\254\256\256````````````````````````````````!", "NLLL!!!NLLL!!!NLLL!!!NLLL!!!\200}}`NLLL!!!NLLL!!!NLLL!!!NLLL!!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256````````````````````````````````````````````````````````````````\253\254\256\256````````````````````````````````!" + "'", str2, "\253\254\256\256````````````````````````````````````````````````````````````````\253\254\256\256````````````````````````````````!");
    }

    @Test
    public void test13642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13642");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13643");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!!!!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!!!!!!!!", "!nullnullnull!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!!!!!!!!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!!!!!!!!!!" + "'", str2, "NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!!!!!!!!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!!!!!!!!!!");
    }

    @Test
    public void test13644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13644");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0nullnull!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullULLLULLLnullnullnullnullnullnullnullnullULLLULLL!!nullnullnullnullnullnullnullnullULLLULLLnullnullnullnullnullnullnullnullULLLULLL!!nullnullnullnullnullnullnullnullULLLULLLnullnullnullnullnullnullnullnullULLLULLLnullnullnullnullnullnullnullnullULLLULLLnullnullnullnullnullnullnullnullULLLULLL!!nullnullnullnullnullnullnullnullULLLULLLnullnullnullnullnullnullnullnullULLLULLL!!nullnullnullnullnullnullnullnullULLLULLLnullnullnullnullnullnullnullnullULLLULLL!" + "'", str2, "nullnullnullnullnullnullnullnullULLLULLLnullnullnullnullnullnullnullnullULLLULLL!!nullnullnullnullnullnullnullnullULLLULLLnullnullnullnullnullnullnullnullULLLULLL!!nullnullnullnullnullnullnullnullULLLULLLnullnullnullnullnullnullnullnullULLLULLLnullnullnullnullnullnullnullnullULLLULLLnullnullnullnullnullnullnullnullULLLULLL!!nullnullnullnullnullnullnullnullULLLULLLnullnullnullnullnullnullnullnullULLLULLL!!nullnullnullnullnullnullnullnullULLLULLLnullnullnullnullnullnullnullnullULLLULLL!");
    }

    @Test
    public void test13645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13645");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UU~~L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UU~~L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UU~~L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UU~~L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UU~~L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UU~~L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UU~~L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UU~~!", "LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU\200}}`LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LL~~U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LL~~U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LL~~U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LL~~U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LL~~U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LL~~U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LL~~U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LL~~!" + "'", str2, "U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LL~~U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LL~~U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LL~~U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LL~~U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LL~~U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LL~~U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LL~~U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LL~~!");
    }

    @Test
    public void test13646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13646");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!nullnullnullnull!", "JILLJILLJILLJILLJILLJILLJILLJILL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ijllijllijllijll!" + "'", str2, "!ijllijllijllijll!");
    }

    @Test
    public void test13647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13647");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~}\200\200~}\200\200\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016eUU~}\200\200~}\200\200\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016eUU~}\200\200~}\200\200\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016eUU~}\200\200~}\200\200\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016eUU~}\200\200~}\200\200\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016eUU~}\200\200~}\200\200\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016eUU~}\200\200~}\200\200\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016eUU~}\200\200~}\200\200\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016eUU!", "\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\u019e\u019e\u019f\u019f\u019e\u019e\u019f\u019f~}\200\200~}\200\200\u019e\u019e\u019f\u019f\u019e\u019e\u019f\u019f~}\200\200~}\200\200\u019e\u019e\u019f\u019f\u019e\u019e\u019f\u019f~}\200\200~}\200\200\u019e\u019e\u019f\u019f\u019e\u019e\u019f\u019f~}\200\200~}\200\200\u019e\u019e\u019f\u019f\u019e\u019e\u019f\u019f~}\200\200~}\200\200\u019e\u019e\u019f\u019f\u019e\u019e\u019f\u019f~}\200\200~}\200\200\u019e\u019e\u019f\u019f\u019e\u019e\u019f\u019f~}\200\200~}\200\200\u019e\u019e\u019f\u019f\u019e\u019e\u019f\u019f!" + "'", str2, "~}\200\200~}\200\200\u019e\u019e\u019f\u019f\u019e\u019e\u019f\u019f~}\200\200~}\200\200\u019e\u019e\u019f\u019f\u019e\u019e\u019f\u019f~}\200\200~}\200\200\u019e\u019e\u019f\u019f\u019e\u019e\u019f\u019f~}\200\200~}\200\200\u019e\u019e\u019f\u019f\u019e\u019e\u019f\u019f~}\200\200~}\200\200\u019e\u019e\u019f\u019f\u019e\u019e\u019f\u019f~}\200\200~}\200\200\u019e\u019e\u019f\u019f\u019e\u019e\u019f\u019f~}\200\200~}\200\200\u019e\u019e\u019f\u019f\u019e\u019e\u019f\u019f~}\200\200~}\200\200\u019e\u019e\u019f\u019f\u019e\u019e\u019f\u019f!");
    }

    @Test
    public void test13648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13648");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\253\254\256\256!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!" + "'", str2, "\253\254\256\256!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!");
    }

    @Test
    public void test13649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13649");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "HFFFHFFF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13650");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "NNNN!NNNNNNNNNNNN!NNNNNNNN\225\225NNNN!NNNNNNNNNNNN!NNNNNNNN\225\225NNNN!NNNNNNNNNNNN!NNNNNNNN\225\225NNNN!NNNNNNNNNNNN!NNNNNNNN\225\225NNNN!NNNNNNNNNNNN!NNNNNNNN\225\225NNNN!NNNNNNNNNNNN!NNNNNNNN\225\225NNNN!NNNNNNNNNNNN!NNNNNNNN\225\225NNNN!NNNNNNNNNNNN!NNNNNNNN\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13651");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!", "~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!" + "'", str2, "\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!");
    }

    @Test
    public void test13652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13652");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnullnullnull\220nullnullnullnullnullnullnullnull\200}}`nullnullnullnull\220nullnullnullnullnullnullnullnull]]!", "\u0346\u0348\u0348\u0348\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u037e\u037e\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test13653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13653");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\201!!!\201!!!!", "nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\201!!!\201!!!!" + "'", str2, "\201!!!\201!!!!");
    }

    @Test
    public void test13654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13654");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!", "NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256nullnullnull\256nullnullnull!!\256nullnullnull\256nullnullnull!!\256nullnullnull\256nullnullnull\256nullnullnull\256nullnullnull!!\256nullnullnull\256nullnullnull!!\256nullnullnull\256nullnullnull!" + "'", str2, "\256nullnullnull\256nullnullnull!!\256nullnullnull\256nullnullnull!!\256nullnullnull\256nullnullnull\256nullnullnull\256nullnullnull!!\256nullnullnull\256nullnullnull!!\256nullnullnull\256nullnullnull!");
    }

    @Test
    public void test13655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13655");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\250\250\250\250\250\250\250\250\250\246~~\250\246~~\250\250\250\250\250\250\250\250\250\246~~\250\246~~!", "}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\250\250\250\250\250\250\250\246~~\250\246~~\250\250\250\250\250\250\250\250\250\246~~\250\246~~!" + "'", str2, "\250\250\250\250\250\250\250\250\250\246~~\250\246~~\250\250\250\250\250\250\250\250\250\246~~\250\246~~!");
    }

    @Test
    public void test13656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13656");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("ULLL!LLL!LLL!LLL!LLLULLL!LLL!LLL!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnullnullnullnullnull!nullnullnull!nullnullnull!" + "'", str2, "nullnullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnullnullnullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test13657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13657");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UNLLUNLLUNLLUNLLNUNLLnullnullNUNLLnullnullNUNLLnullnullNUNLLnullnullUNLLUNLLUNLLUNLLNUNLLnullnullNUNLLnullnull!", "]\256!\254\254\256!\254\254\256!\254\254\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]]\256!\254\254\256!\254\254\256!\254\254\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13658");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a!", "!!UUU!!!U!!!U!!!U!!!!!UUU!!!U!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!]]!!!!!!!!]]!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!]]!!!!!!!!]]!!!!!!!!nullnull!!!!!!!!nullnull!" + "'", str2, "!!!!!!!!]]!!!!!!!!]]!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!]]!!!!!!!!]]!!!!!!!!nullnull!!!!!!!!nullnull!");
    }

    @Test
    public void test13659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13659");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL!", "\u0366\u0365\u0368\u0368\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull!" + "'", str2, "~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13660");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\253\254\256\256L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\253\254\256\256L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!", "nullnullnull\200\200nullnullnullnullnull\200\200nullnull!!nullnullnull\200\200nullnullnullnullnull\200\200nullnull!!nullnullnull\200\200nullnullnullnullnull\200\200nullnull!!nullnullnull\200\200nullnullnullnullnull\200\200nullnull!!nullnullnull\200\200nullnullnullnullnull\200\200nullnull!!nullnullnull\200\200nullnullnullnullnull\200\200nullnull!!nullnullnull\200\200nullnullnullnullnull\200\200nullnull!!nullnullnull\200\200nullnullnullnullnull\200\200nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\253\254\256\256L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!" + "'", str2, "\253\254\256\256L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\253\254\256\256L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!");
    }

    @Test
    public void test13661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13661");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!!", "hhhhhhhhhhhhhhhhhhhhhhhh\204\204hhhhhhhh\204\204hhhhhhhh\204\204hhhhhhhh\204\204hhhhhhhhhhhhhhhhhhhhhhhh\204\204hhhhhhhh\204\204!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\266!!!!HHHH\266\266!HHHH\266\266!!!!\266!!!!HHHH\266\266!HHHH\266\266!!!!!!\266!!!!HHHH\266\266!HHHH\266\266!!!!\266!!!!HHHH\266\266!HHHH\266\266!!!!!!\266!!!!HHHH\266\266!HHHH\266\266!!!!\266!!!!HHHH\266\266!HHHH\266\266!!!!!!\266!!!!HHHH\266\266!HHHH\266\266!!!!\266!!!!HHHH\266\266!HHHH\266\266!!!!!!\266!!!!HHHH\266\266!HHHH\266\266!!!!\266!!!!HHHH\266\266!HHHH\266\266!!!!!!\266!!!!HHHH\266\266!HHHH\266\266!!!!\266!!!!HHHH\266\266!HHHH\266\266!!!!!!\266!!!!HHHH\266\266!HHHH\266\266!!!!\266!!!!HHHH\266\266!HHHH\266\266!!!!!!\266!!!!HHHH\266\266!HHHH\266\266!!!!\266!!!!HHHH\266\266!HHHH\266\266!!!!!!!" + "'", str2, "\266!!!!HHHH\266\266!HHHH\266\266!!!!\266!!!!HHHH\266\266!HHHH\266\266!!!!!!\266!!!!HHHH\266\266!HHHH\266\266!!!!\266!!!!HHHH\266\266!HHHH\266\266!!!!!!\266!!!!HHHH\266\266!HHHH\266\266!!!!\266!!!!HHHH\266\266!HHHH\266\266!!!!!!\266!!!!HHHH\266\266!HHHH\266\266!!!!\266!!!!HHHH\266\266!HHHH\266\266!!!!!!\266!!!!HHHH\266\266!HHHH\266\266!!!!\266!!!!HHHH\266\266!HHHH\266\266!!!!!!\266!!!!HHHH\266\266!HHHH\266\266!!!!\266!!!!HHHH\266\266!HHHH\266\266!!!!!!\266!!!!HHHH\266\266!HHHH\266\266!!!!\266!!!!HHHH\266\266!HHHH\266\266!!!!!!\266!!!!HHHH\266\266!HHHH\266\266!!!!\266!!!!HHHH\266\266!HHHH\266\266!!!!!!!");
    }

    @Test
    public void test13662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13662");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366!", "\u0366\u0365\u0368\u0368nullnull!!\213\213\213\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366!" + "'", str2, "\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366!");
    }

    @Test
    public void test13663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13663");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UPPP\200}}`UPPP]]!", "U!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNN!!U!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNN!!U!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNN!!U!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNN!!U!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNNN\200}}`UNNN]]!" + "'", str2, "UNNN\200}}`UNNN]]!");
    }

    @Test
    public void test13664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13664");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128!", "NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``NN!N``NN``N``NN````NN!N``NN``N``NN``!!``NN!N``NN``N``NN````NN!N``NN``N``NN``!!``NN!N``NN``N``NN````NN!N``NN``N``NN````NN!N``NN``N``NN````NN!N``NN``N``NN``!!``NN!N``NN``N``NN````NN!N``NN``N``NN``!!``NN!N``NN``N``NN````NN!N``NN``N``NN``!" + "'", str2, "``NN!N``NN``N``NN````NN!N``NN``N``NN``!!``NN!N``NN``N``NN````NN!N``NN``N``NN``!!``NN!N``NN``N``NN````NN!N``NN``N``NN````NN!N``NN``N``NN````NN!N``NN``N``NN``!!``NN!N``NN``N``NN````NN!N``NN``N``NN``!!``NN!N``NN``N``NN````NN!N``NN``N``NN``!");
    }

    @Test
    public void test13665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13665");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241!!\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241!!\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241!!\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\u0346\u0348\u0348!", "\u0128\u0129\u012b\u012b!!!\200\200\u0128\u0129\u012b\u012b!!!\200\200\u0128\u0129\u012b\u012b!!!\200\200\u0128\u0129\u012b\u012b!!!\200\200\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b!!!\200\200\u0128\u0129\u012b\u012b!!!\200\200\u0128\u0129\u012b\u012b!!!\200\200\u0128\u0129\u012b\u012b!!!\200\200\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b!~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241!!\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241!!\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241!!\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241!!\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241!!\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241!!\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\u0346\u0348\u0348!");
    }

    @Test
    public void test13666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13666");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "NLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test13667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13667");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\253\254\256\256null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!\253\254\256\256null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\253\254\256\256nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!" + "'", str2, "\253\254\256\256nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\253\254\256\256nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!");
    }

    @Test
    public void test13668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13668");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LUNN\200~~LUNN\200~~LUNNLUNNLUNN\200~~LUNN\200~~LUNNLUNN!!LUNN\200~~LUNN\200~~LUNNLUNNLUNN\200~~LUNN\200~~LUNNLUNN!!LUNN\200~~LUNN\200~~LUNNLUNNLUNN\200~~LUNN\200~~LUNNLUNNLUNN\200~~LUNN\200~~LUNNLUNNLUNN\200~~LUNN\200~~LUNNLUNN!!LUNN\200~~LUNN\200~~LUNNLUNNLUNN\200~~LUNN\200~~LUNNLUNN!!LUNN\200~~LUNN\200~~LUNNLUNNLUNN\200~~LUNN\200~~LUNNLUNN!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull!!nullnull!!\253\253nullnull!!nullnull!!\253\253nullnull!!nullnull!!\253\253nullnull!!nullnull!!\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull!!nullnull!!\253\253nullnull!!nullnull!!\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\340\336\335\335\200~~\340\336\335\335\200~~\340\336\335\335\340\336\335\335\340\336\335\335\200~~\340\336\335\335\200~~\340\336\335\335\340\336\335\335!!\340\336\335\335\200~~\340\336\335\335\200~~\340\336\335\335\340\336\335\335\340\336\335\335\200~~\340\336\335\335\200~~\340\336\335\335\340\336\335\335!!\340\336\335\335\200~~\340\336\335\335\200~~\340\336\335\335\340\336\335\335\340\336\335\335\200~~\340\336\335\335\200~~\340\336\335\335\340\336\335\335\340\336\335\335\200~~\340\336\335\335\200~~\340\336\335\335\340\336\335\335\340\336\335\335\200~~\340\336\335\335\200~~\340\336\335\335\340\336\335\335!!\340\336\335\335\200~~\340\336\335\335\200~~\340\336\335\335\340\336\335\335\340\336\335\335\200~~\340\336\335\335\200~~\340\336\335\335\340\336\335\335!!\340\336\335\335\200~~\340\336\335\335\200~~\340\336\335\335\340\336\335\335\340\336\335\335\200~~\340\336\335\335\200~~\340\336\335\335\340\336\335\335!" + "'", str2, "\340\336\335\335\200~~\340\336\335\335\200~~\340\336\335\335\340\336\335\335\340\336\335\335\200~~\340\336\335\335\200~~\340\336\335\335\340\336\335\335!!\340\336\335\335\200~~\340\336\335\335\200~~\340\336\335\335\340\336\335\335\340\336\335\335\200~~\340\336\335\335\200~~\340\336\335\335\340\336\335\335!!\340\336\335\335\200~~\340\336\335\335\200~~\340\336\335\335\340\336\335\335\340\336\335\335\200~~\340\336\335\335\200~~\340\336\335\335\340\336\335\335\340\336\335\335\200~~\340\336\335\335\200~~\340\336\335\335\340\336\335\335\340\336\335\335\200~~\340\336\335\335\200~~\340\336\335\335\340\336\335\335!!\340\336\335\335\200~~\340\336\335\335\200~~\340\336\335\335\340\336\335\335\340\336\335\335\200~~\340\336\335\335\200~~\340\336\335\335\340\336\335\335!!\340\336\335\335\200~~\340\336\335\335\200~~\340\336\335\335\340\336\335\335\340\336\335\335\200~~\340\336\335\335\200~~\340\336\335\335\340\336\335\335!");
    }

    @Test
    public void test13669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13669");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("]\204]]]\204]]]\204]]]\204]]]]]]]]]]]]]]]]]]]\204]]]\204]]]\204]]]\204]]]]]]]]]]!", "\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]\204]]]\204]]]\204]]]\204]]]]]]]]]]]]]]]]]]]\204]]]\204]]]\204]]]\204]]]]]]]]]]!" + "'", str2, "]\204]]]\204]]]\204]]]\204]]]]]]]]]]]]]]]]]]]\204]]]\204]]]\204]]]\204]]]]]]]]]]!");
    }

    @Test
    public void test13670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13670");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275``nullnull``nullnull``nullnull\276``nullnull\275\275!", "\u0366\u0365\u0368\u0368\u0128\u0128\u0128\u0128\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275``nullnull!!nullnull!!``nullnull!!nullnull!!``nullnull!!nullnull!!\276``nullnull!!nullnull!!\275\275!" + "'", str2, "\275``nullnull!!nullnull!!``nullnull!!nullnull!!``nullnull!!nullnull!!\276``nullnull!!nullnull!!\275\275!");
    }

    @Test
    public void test13671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13671");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnullnullnullnullnull\266nullnullnullnullnullnull\266nullnullnullnullnullnull\266nullnullnullnullnullnull\266nullnullnullnullnullnullnullnullnullnull\266nullnullnullnullnullnull\266nullnullnullnull!", "\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\266nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\266nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\266nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\266nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\266nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\266nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\266nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\266nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\266nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\266nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\266nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\266nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13672");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\200}}`\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276]]!", "!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN\200}}`!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\200}}`\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276]]!" + "'", str2, "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\200}}`\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276]]!");
    }

    @Test
    public void test13673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13673");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!", "\226\226!!\226\226!!\226\226!!\226\226!!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!\226\226!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!" + "'", str2, "!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!");
    }

    @Test
    public void test13674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13674");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a!!!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test13675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13675");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253\253\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253\253]]!", "||||||||!!||||||||!!||||||||!!||||||||!!||||!!!||||!!!||||!!!||||!!!||||||||!!||||||||!!||||||||!!||||||||!!||||!!!||||!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||\253\253\253\200}}`!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||\253\253\253]]!" + "'", str2, "!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||\253\253\253\200}}`!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||!!||\253\253\253]]!");
    }

    @Test
    public void test13676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13676");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLUU!!!LLUU!!!LLUU!!!LLUU!!!LLUU!!!LLUU!!!LLUU!!!LLUU!!!!", "!\276!nullnull\276!nullnull\276!nullnull\276!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276LL!!!\276\276LL!!!\276\276LL!!!\276\276LL!!!\276\276LL!!!\276\276LL!!!\276\276LL!!!\276\276LL!!!!" + "'", str2, "\276\276LL!!!\276\276LL!!!\276\276LL!!!\276\276LL!!!\276\276LL!!!\276\276LL!!!\276\276LL!!!\276\276LL!!!!");
    }

    @Test
    public void test13677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13677");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u02af\u02b0\u02b2\u02b2\u02af\u02b0\u02b2\u02b2\u02af\u02b0\u02b2\u02b2\u02af\u02b0\u02b2\u02b2\u02af\u02b0\u02b2\u02b2\u02af\u02b0\u02b2\u02b2\u02af\u02b0\u02b2\u02b2\u02af\u02b0\u02b2\u02b2!!!", "!\276!nullnull\276!nullnull\276!nullnull\276!nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull!!``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull!!!" + "'", str2, "``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull!!``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test13678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13678");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\u0264\u0262\u0264\u0262\u0264\u0262\u0264\u0262\u0264\u0262\u0264\u0262\u0264\u0262\u0264\u0262\u0264\u0262\u0264\u0262\u0264\u0262\u0264\u0262nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13679");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "\275\275!!\275\275!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13680");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```!", "\215}\215\215\215}\215\215nullnullnullnull\215}\215\215\215}\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```!" + "'", str2, "VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```VVVV```!");
    }

    @Test
    public void test13681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13681");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!UUU!UUU!UUU!UUU\200}}`!UUU!UUU!UUU!UUU]]!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull\200}}`!nullnullnull!nullnullnull!nullnullnull!nullnullnull]]!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull\200}}`!nullnullnull!nullnullnull!nullnullnull!nullnullnull]]!");
    }

    @Test
    public void test13682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13682");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253!LL\253\253LL\253\253LL\253\253!LL\253\253LL\253\253LL\253\253!LL\253\253LL\253\253LL\253\253!LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253!LL\253\253LL\253\253LL\253\253!LL\253\253LL\253\253LL\253\253!", "null\200}}`null]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253!LL\253\253LL\253\253LL\253\253!LL\253\253LL\253\253LL\253\253!LL\253\253LL\253\253LL\253\253!LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253!LL\253\253LL\253\253LL\253\253!LL\253\253LL\253\253LL\253\253!" + "'", str2, "LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253!LL\253\253LL\253\253LL\253\253!LL\253\253LL\253\253LL\253\253!LL\253\253LL\253\253LL\253\253!LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253!LL\253\253LL\253\253LL\253\253!LL\253\253LL\253\253LL\253\253!");
    }

    @Test
    public void test13683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13683");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNN!", "!!!!\220\220!!\220\220!!\220\220!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\220\220!!\220\220!!\220\220!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13684");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLLLLLLLLLLLLLLLLLLLLLLL\204\204LLLLLLLL\204\204LLLLLLLL\204\204LLLLLLLL\204\204LLLLLLLLLLLLLLLLLLLLLLLL\204\204LLLLLLLL\204\204!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204!");
    }

    @Test
    public void test13685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13685");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test13686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13686");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\335\300\336\336\335\300\336\336\335\300\336\336\335\300\336\336\335\300\336\336\335\300\336\336\335\300\336\336\335\300\336\336!", "\276N\266\266~NN\276N\266\266~NN!!\276N\266\266~NN\276N\266\266~NN!!\276N\266\266~NN\276N\266\266~NN\276N\266\266~NN\276N\266\266~NN!!\276N\266\266~NN\276N\266\266~NN!!\276N\266\266~NN\276N\266\266~NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13687");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\200}}`\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276]]!", "!NLLLNLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\200}}`\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276]]!" + "'", str2, "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\200}}`\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276]]!");
    }

    @Test
    public void test13688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13688");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356!", "!!~LLLLLLLL!!!!~LLLLLLLL!!!!!!~LLLLLLLL!!!!~LLLLLLLL!!!!!!~LLLLLLLL!!!!~LLLLLLLL!!!!~LLLLLLLL!!!!~LLLLLLLL!!!!!!~LLLLLLLL!!!!~LLLLLLLL!!!!!!~LLLLLLLL!!!!~LLLLLLLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!" + "'", str2, "!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!");
    }

    @Test
    public void test13689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13689");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13690");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\275!!!\275\275!!\275\275!!\275\275!!\275\275!!\275!!!\275\275!!\275\275!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13691");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!", "N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!NNN!NN!NNN!NN!NNN!NN!!NNN!NN!NNN!NN!NNN!NN!!NNN!NN!NNN!NN!NNN!NN!!NNN!NN!NNN!NN!NNN!NN!!NNN!NN!NNN!NN!NNN!NN!!NNN!NN!NNN!NN!NNN!NN!!NNN!NN!NNN!NN!NNN!NN!!NNN!NN!NNN!NN!NNN!NN!!NNN!NN!NNN!NN!NNN!NN!!NNN!NN!NNN!NN!NNN!NN!!NNN!NN!NNN!NN!NNN!NN!!NNN!NN!NNN!NN!NNN!NN!!NNN!NN!NNN!NN!NNN!NN!!NNN!NN!NNN!NN!NNN!NN!" + "'", str2, "!!NNN!NN!NNN!NN!NNN!NN!!NNN!NN!NNN!NN!NNN!NN!!NNN!NN!NNN!NN!NNN!NN!!NNN!NN!NNN!NN!NNN!NN!!NNN!NN!NNN!NN!NNN!NN!!NNN!NN!NNN!NN!NNN!NN!!NNN!NN!NNN!NN!NNN!NN!!NNN!NN!NNN!NN!NNN!NN!!NNN!NN!NNN!NN!NNN!NN!!NNN!NN!NNN!NN!NNN!NN!!NNN!NN!NNN!NN!NNN!NN!!NNN!NN!NNN!NN!NNN!NN!!NNN!NN!NNN!NN!NNN!NN!!NNN!NN!NNN!NN!NNN!NN!");
    }

    @Test
    public void test13692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13692");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!", "\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!");
    }

    @Test
    public void test13693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13693");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204\u0346\u0348\u0348!", "EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204\u0346\u0348\u0348!");
    }

    @Test
    public void test13694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13694");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("XW\275\275XW\275\275!", "\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\275\275!!\275\275!" + "'", str2, "!!\275\275!!\275\275!");
    }

    @Test
    public void test13695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13695");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!", "null\253nullnullnull\253\u035e\u035enull\253nullnullnull\253\u035e\u035e!!!!null\253nullnullnull\253\u035e\u035enull\253nullnullnull\253\u035e\u035e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!" + "'", str2, "\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!");
    }

    @Test
    public void test13696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13696");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!!", "LL``LL``LL``LL``LL``LL``LL``LL``!!LL``LL``LL``LL``LL``LL``LL``LL``!!LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``!!LL``LL``LL``LL``LL``LL``LL``LL``!!LL``LL``LL``LL``LL``LL``LL``LL``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL``LL````LL``LL````!!LL``LL````LL``LL````!!LL``LL````LL``LL````!!LL``LL````LL``LL````!!LL``LL````LL``LL````!!LL``LL````LL``LL````!!LL``LL````LL``LL````!!LL``LL````LL``LL````!!!" + "'", str2, "LL``LL````LL``LL````!!LL``LL````LL``LL````!!LL``LL````LL``LL````!!LL``LL````LL``LL````!!LL``LL````LL``LL````!!LL``LL````LL``LL````!!LL``LL````LL``LL````!!LL``LL````LL``LL````!!!");
    }

    @Test
    public void test13697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13697");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!", "\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!" + "'", str2, "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!");
    }

    @Test
    public void test13698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13698");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```!", "ULNNULNNULNNULNNULNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```!" + "'", str2, "Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```Q!!!!!!```!");
    }

    @Test
    public void test13699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13699");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\230null\225\225\230null\225\225\230null\225\225\230null\225\225\230null\225\225\230null\225\225\230null\225\225\230null\225\225!!!!\230null\225\225\230null\225\225\230null\225\225\230null\225\225\230null\225\225\230null\225\225\230null\225\225\230null\225\225!", "\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230UNLL\225\225\230UNLL\225\225\230UNLL\225\225\230UNLL\225\225\230UNLL\225\225\230UNLL\225\225\230UNLL\225\225\230UNLL\225\225!!!!\230UNLL\225\225\230UNLL\225\225\230UNLL\225\225\230UNLL\225\225\230UNLL\225\225\230UNLL\225\225\230UNLL\225\225\230UNLL\225\225!" + "'", str2, "\230UNLL\225\225\230UNLL\225\225\230UNLL\225\225\230UNLL\225\225\230UNLL\225\225\230UNLL\225\225\230UNLL\225\225\230UNLL\225\225!!!!\230UNLL\225\225\230UNLL\225\225\230UNLL\225\225\230UNLL\225\225\230UNLL\225\225\230UNLL\225\225\230UNLL\225\225\230UNLL\225\225!");
    }

    @Test
    public void test13700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13700");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "~}\200\200~}\200\200UUNNUUNNNNUUNNUUNNNN~}\200\200~}\200\200UUNNUUNNNNUUNNUUNNNN~}\200\200~}\200\200UUNNUUNNNNUUNNUUNNNN~}\200\200~}\200\200UUNNUUNNNNUUNNUUNNNN~}\200\200~}\200\200UUNNUUNNNNUUNNUUNNNN~}\200\200~}\200\200UUNNUUNNNNUUNNUUNNNN~}\200\200~}\200\200UUNNUUNNNNUUNNUUNNNN~}\200\200~}\200\200UUNNUUNNNNUUNNUUNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test13701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13701");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!LLL!LLL!LLL!LLL!LLL!", "LIJJLLLLIJJLLLLIJJLLLLIJJLLL\200}}`LIJJLLLLIJJLLLLIJJLLLLIJJLLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!|||!|||!|||!|||!|||!" + "'", str2, "!|||!|||!|||!|||!|||!");
    }

    @Test
    public void test13702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13702");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260!!!!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnull!!!nullnullnullnull!!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnull!!!nullnullnullnull!!!!");
    }

    @Test
    public void test13703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13703");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\200\u01ca\u01ca\u01ca\220\220\200\u01ca\u01ca\u01ca\220\220\200\u01ca\u01ca\u01ca\220\220\200\u01ca\u01ca\u01ca\220\220\200\u01ca\u01ca\u01ca\220\220\200\u01ca\u01ca\u01ca\220\220\200\u01ca\u01ca\u01ca\220\220\200\u01ca\u01ca\u01ca\220\220!", "TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200null!nullnull\220\220\200null!nullnull\220\220\200null!nullnull\220\220\200null!nullnull\220\220\200null!nullnull\220\220\200null!nullnull\220\220\200null!nullnull\220\220\200null!nullnull\220\220!" + "'", str2, "\200null!nullnull\220\220\200null!nullnull\220\220\200null!nullnull\220\220\200null!nullnull\220\220\200null!nullnull\220\220\200null!nullnull\220\220\200null!nullnull\220\220\200null!nullnull\220\220!");
    }

    @Test
    public void test13704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13704");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\376\377\u0101\u0101\213\213\213\u0346\u0348\u0348!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200NN\215\215LNN\215\215NN\215\215NN\215\215LNN\215\215NN\215\215}~\200\200}~\200\200NN\215\215LNN\215\215NN\215\215NN\215\215LNN\215\215NN\215\215}~\200\200}~\200\200NN\215\215LNN\215\215NN\215\215NN\215\215LNN\215\215NN\215\215}~\200\200}~\200\200NN\215\215LNN\215\215NN\215\215NN\215\215LNN\215\215NN\215\215\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnullnullnull\213\213\213\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnullnullnull\213\213\213\u0346\u0348\u0348!");
    }

    @Test
    public void test13705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13705");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("}~\200\200}~\200\200\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120}~\200\200}~\200\200\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120!", "JLLL\236\276\276JLLL\236\276\276!!JLLL\236\276\276JLLL\236\276\276!!JLLL\236\276\276JLLL\236\276\276JLLL\236\276\276JLLL\236\276\276!!JLLL\236\276\276JLLL\236\276\276!!JLLL\236\276\276JLLL\236\276\276!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200nullnull\271\271nullnullnullnullnull\271\271nullnullnullnullnull\271\271nullnullnullnullnull\271\271nullnullnullnullnull\271\271nullnullnullnullnull\271\271nullnullnullnullnull\271\271nullnullnullnullnull\271\271nullnullnull}~\200\200}~\200\200nullnull\271\271nullnullnullnullnull\271\271nullnullnullnullnull\271\271nullnullnullnullnull\271\271nullnullnullnullnull\271\271nullnullnullnullnull\271\271nullnullnullnullnull\271\271nullnullnullnullnull\271\271nullnullnull!" + "'", str2, "}~\200\200}~\200\200nullnull\271\271nullnullnullnullnull\271\271nullnullnullnullnull\271\271nullnullnullnullnull\271\271nullnullnullnullnull\271\271nullnullnullnullnull\271\271nullnullnullnullnull\271\271nullnullnullnullnull\271\271nullnullnull}~\200\200}~\200\200nullnull\271\271nullnullnullnullnull\271\271nullnullnullnullnull\271\271nullnullnullnullnull\271\271nullnullnullnullnull\271\271nullnullnullnullnull\271\271nullnullnullnullnull\271\271nullnullnullnullnull\271\271nullnullnull!");
    }

    @Test
    public void test13706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13706");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0346\u0348\u0348!", "\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test13707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13707");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!!!\242null\237\237\242null\237\237!!\242null\237\237\242null\237\237!!!!\242null\237\237\242null\237\237!!\242null\237\237\242null\237\237!!!!\242null\237\237\242null\237\237!!\242null\237\237\242null\237\237!!!!\242null\237\237\242null\237\237!!\242null\237\237\242null\237\237!!!!\242null\237\237\242null\237\237!!\242null\237\237\242null\237\237!!!!\242null\237\237\242null\237\237!!\242null\237\237\242null\237\237!!!!\242null\237\237\242null\237\237!!\242null\237\237\242null\237\237!!!!\242null\237\237\242null\237\237!!\242null\237\237\242null\237\237!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!\242fnullhh\237\237\242fnullhh\237\237!!\242fnullhh\237\237\242fnullhh\237\237!!!!\242fnullhh\237\237\242fnullhh\237\237!!\242fnullhh\237\237\242fnullhh\237\237!!!!\242fnullhh\237\237\242fnullhh\237\237!!\242fnullhh\237\237\242fnullhh\237\237!!!!\242fnullhh\237\237\242fnullhh\237\237!!\242fnullhh\237\237\242fnullhh\237\237!!!!\242fnullhh\237\237\242fnullhh\237\237!!\242fnullhh\237\237\242fnullhh\237\237!!!!\242fnullhh\237\237\242fnullhh\237\237!!\242fnullhh\237\237\242fnullhh\237\237!!!!\242fnullhh\237\237\242fnullhh\237\237!!\242fnullhh\237\237\242fnullhh\237\237!!!!\242fnullhh\237\237\242fnullhh\237\237!!\242fnullhh\237\237\242fnullhh\237\237!" + "'", str2, "!!!!\242fnullhh\237\237\242fnullhh\237\237!!\242fnullhh\237\237\242fnullhh\237\237!!!!\242fnullhh\237\237\242fnullhh\237\237!!\242fnullhh\237\237\242fnullhh\237\237!!!!\242fnullhh\237\237\242fnullhh\237\237!!\242fnullhh\237\237\242fnullhh\237\237!!!!\242fnullhh\237\237\242fnullhh\237\237!!\242fnullhh\237\237\242fnullhh\237\237!!!!\242fnullhh\237\237\242fnullhh\237\237!!\242fnullhh\237\237\242fnullhh\237\237!!!!\242fnullhh\237\237\242fnullhh\237\237!!\242fnullhh\237\237\242fnullhh\237\237!!!!\242fnullhh\237\237\242fnullhh\237\237!!\242fnullhh\237\237\242fnullhh\237\237!!!!\242fnullhh\237\237\242fnullhh\237\237!!\242fnullhh\237\237\242fnullhh\237\237!");
    }

    @Test
    public void test13708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13708");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("EEEEEEEEEEEEEEEE!EEE!EEE!EEE!EEEEEEEEEEEEEEEEEEE!EEE!EEE!", "}~\200\200}~\200\200UUUU^UUUUUUUUUUUU^UUUUUUUU}~\200\200}~\200\200UUUU^UUUUUUUUUUUU^UUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}}}}}}}}}}}}}}}}!}}}!}}}!}}}!}}}}}}}}}}}}}}}}}}}!}}}!}}}!" + "'", str2, "}}}}}}}}}}}}}}}}!}}}!}}}!}}}!}}}}}}}}}}}}}}}}}}}!}}}!}}}!");
    }

    @Test
    public void test13709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13709");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\253\u0128\u0128\u0128\u0348\u0348\253\u0128\u0128\u0128\u0348\u0348!!\253\u0128\u0128\u0128\u0348\u0348\253\u0128\u0128\u0128\u0348\u0348!!\253\u0128\u0128\u0128\u0348\u0348\253\u0128\u0128\u0128\u0348\u0348\253\u0128\u0128\u0128\u0348\u0348\253\u0128\u0128\u0128\u0348\u0348!!\253\u0128\u0128\u0128\u0348\u0348\253\u0128\u0128\u0128\u0348\u0348!!\253\u0128\u0128\u0128\u0348\u0348\253\u0128\u0128\u0128\u0348\u0348!", "nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!" + "'", str2, "\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!");
    }

    @Test
    public void test13710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13710");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256!", "]]\275!\275\275\275!\275\275]]\275!\275\275\275!\275\275!!]]\275!\275\275\275!\275\275]]\275!\275\275\275!\275\275!!]]\275!\275\275\275!\275\275]]\275!\275\275\275!\275\275]]\275!\275\275\275!\275\275]]\275!\275\275\275!\275\275!!]]\275!\275\275\275!\275\275]]\275!\275\275\275!\275\275!!]]\275!\275\275\275!\275\275]]\275!\275\275\275!\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256!" + "'", str2, "nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256!");
    }

    @Test
    public void test13711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13711");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "U!!!U!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13712");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u014e\u014e!", "UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!" + "'", str2, "nullnull!");
    }

    @Test
    public void test13713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13713");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLNNNNLL!", "\u0346\u0348\u0348\u0348\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\336\336\334\334\334\334\336\336!" + "'", str2, "\336\336\334\334\334\334\336\336!");
    }

    @Test
    public void test13714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13714");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!", "TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13715");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu!!uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu!!uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu!!uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu!!uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test13716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13716");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!!", "lulllulllulllull!lulllulllulllulllulllulllulllulllulllulllulllull!lulllulllulllulllulllulllulllulllulllulllulllull!lulllulllulllulllulllulllulllulllulllulllulllull!lulllulllulllulllulllulllulllulllulllulllulllull!lulllulllulllulllulllulllulllulllulllulllulllull!lulllulllulllulllulllulllulllulllulllulllulllull!lulllulllulllulllulllulllulllulllulllulllulllull!lulllulllulllulllulllulllulllull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!" + "'", str2, "UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!");
    }

    @Test
    public void test13717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13717");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]HHH\200}}`]HHH]]!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368unllunllunllunll!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]LLL\200}}`]LLL]]!" + "'", str2, "]LLL\200}}`]LLL]]!");
    }

    @Test
    public void test13718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13718");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("U}}}U}}}U}}}U}}}~U}}}U}}}U}}}U}}}U}}}U}}}~U}}}U}}}!!U}}}U}}}U}}}U}}}~U}}}U}}}U}}}U}}}U}}}U}}}~U}}}U}}}!!U}}}U}}}U}}}U}}}~U}}}U}}}U}}}U}}}U}}}U}}}~U}}}U}}}U}}}U}}}U}}}U}}}~U}}}U}}}U}}}U}}}U}}}U}}}~U}}}U}}}!!U}}}U}}}U}}}U}}}~U}}}U}}}U}}}U}}}U}}}U}}}~U}}}U}}}!!U}}}U}}}U}}}U}}}~U}}}U}}}U}}}U}}}U}}}U}}}~U}}}U}}}!", "}nullnull\340\340\200\200}nullnull\340\340\200\200}nullnull\340\340\200\200}nullnull\340\340\200\200\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~}nullnull\340\340\200\200}nullnull\340\340\200\200}nullnull\340\340\200\200}nullnull\340\340\200\200\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L}}}L}}}L}}}L}}}~L}}}L}}}L}}}L}}}L}}}L}}}~L}}}L}}}!!L}}}L}}}L}}}L}}}~L}}}L}}}L}}}L}}}L}}}L}}}~L}}}L}}}!!L}}}L}}}L}}}L}}}~L}}}L}}}L}}}L}}}L}}}L}}}~L}}}L}}}L}}}L}}}L}}}L}}}~L}}}L}}}L}}}L}}}L}}}L}}}~L}}}L}}}!!L}}}L}}}L}}}L}}}~L}}}L}}}L}}}L}}}L}}}L}}}~L}}}L}}}!!L}}}L}}}L}}}L}}}~L}}}L}}}L}}}L}}}L}}}L}}}~L}}}L}}}!" + "'", str2, "L}}}L}}}L}}}L}}}~L}}}L}}}L}}}L}}}L}}}L}}}~L}}}L}}}!!L}}}L}}}L}}}L}}}~L}}}L}}}L}}}L}}}L}}}L}}}~L}}}L}}}!!L}}}L}}}L}}}L}}}~L}}}L}}}L}}}L}}}L}}}L}}}~L}}}L}}}L}}}L}}}L}}}L}}}~L}}}L}}}L}}}L}}}L}}}L}}}~L}}}L}}}!!L}}}L}}}L}}}L}}}~L}}}L}}}L}}}L}}}L}}}L}}}~L}}}L}}}!!L}}}L}}}L}}}L}}}~L}}}L}}}L}}}L}}}L}}}L}}}~L}}}L}}}!");
    }

    @Test
    public void test13719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13719");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnull!!nullnull!!!", "}~\200\200}~\200\200U^LLU^LL}~\200\200}~\200\200U^LLU^LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null}\200\200null}\200\200!!null}\200\200null}\200\200!!!" + "'", str2, "null}\200\200null}\200\200!!null}\200\200null}\200\200!!!");
    }

    @Test
    public void test13720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13720");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!", "ULLLnullnullnullULLLnullnullnullULLLnullnullnullULLLnullnullnullULLLnullnullnullULLLnullnullnullULLLnullnullnullULLLnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!" + "'", str2, "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!");
    }

    @Test
    public void test13721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13721");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!HHHH!", "RRUURRUURRUURRUURRUURRUURRUURRUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnull!" + "'", str2, "!nullnullnullnull!");
    }

    @Test
    public void test13722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13722");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275~~~\275~~~\275~~~\275~~~~~\275\275~~\275\275~~\275\275~~\275\275\275~~~\275~~~\275~~~\275~~~~~\275\275~~\275\275!", "]nullnn]nullnn]nullnn]nullnn]nullnn]nullnn]nullnn]nullnn]nullnn]nullnn]nullnn]nullnn]nullnn]nullnn]nullnn]nullnn\200\200!!\200\200!!\200\200!!\200\200!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275~~~\275~~~\275~~~\275~~~~~\275\275~~\275\275~~\275\275~~\275\275\275~~~\275~~~\275~~~\275~~~~~\275\275~~\275\275!" + "'", str2, "\275~~~\275~~~\275~~~\275~~~~~\275\275~~\275\275~~\275\275~~\275\275\275~~~\275~~~\275~~~\275~~~~~\275\275~~\275\275!");
    }

    @Test
    public void test13723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13723");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!\200}}`!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test13724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13724");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200UL``LUL``UL``UL``LUL``UL``}~\200\200}~\200\200UL``LUL``UL``UL``LUL``UL``}~\200\200}~\200\200UL``LUL``UL``UL``LUL``UL``}~\200\200}~\200\200\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!" + "'", str2, "!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!");
    }

    @Test
    public void test13725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13725");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\340null\335\335\340null\335\335!!\340null\335\335\340null\335\335!!\340null\335\335\340null\335\335\340null\335\335\340null\335\335!!\340null\335\335\340null\335\335!!\340null\335\335\340null\335\335!", "nullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HUNLLFFHUNLLFF!!HUNLLFFHUNLLFF!!HUNLLFFHUNLLFFHUNLLFFHUNLLFF!!HUNLLFFHUNLLFF!!HUNLLFFHUNLLFF!" + "'", str2, "HUNLLFFHUNLLFF!!HUNLLFFHUNLLFF!!HUNLLFFHUNLLFFHUNLLFFHUNLLFF!!HUNLLFFHUNLLFF!!HUNLLFFHUNLLFF!");
    }

    @Test
    public void test13726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13726");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("JILLJILLJILLJILLJILLJILLJILLJILL!", "!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275L!!\275L!!\275L!!\275L!!\275L!!\275L!!\275L!!\275L!!!" + "'", str2, "\275L!!\275L!!\275L!!\275L!!\275L!!\275L!!\275L!!\275L!!!");
    }

    @Test
    public void test13727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13727");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!!", "TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TQQQQQTTTQQQQTTTQQ!!!!TQQQQQTTTQQQQTTTQQ!!!!!!TQQQQQTTTQQQQTTTQQ!!!!TQQQQQTTTQQQQTTTQQ!!!!!!TQQQQQTTTQQQQTTTQQ!!!!TQQQQQTTTQQQQTTTQQ!!!!!!TQQQQQTTTQQQQTTTQQ!!!!TQQQQQTTTQQQQTTTQQ!!!!!!TQQQQQTTTQQQQTTTQQ!!!!TQQQQQTTTQQQQTTTQQ!!!!!!TQQQQQTTTQQQQTTTQQ!!!!TQQQQQTTTQQQQTTTQQ!!!!!!TQQQQQTTTQQQQTTTQQ!!!!TQQQQQTTTQQQQTTTQQ!!!!!!TQQQQQTTTQQQQTTTQQ!!!!TQQQQQTTTQQQQTTTQQ!!!!!!!" + "'", str2, "TQQQQQTTTQQQQTTTQQ!!!!TQQQQQTTTQQQQTTTQQ!!!!!!TQQQQQTTTQQQQTTTQQ!!!!TQQQQQTTTQQQQTTTQQ!!!!!!TQQQQQTTTQQQQTTTQQ!!!!TQQQQQTTTQQQQTTTQQ!!!!!!TQQQQQTTTQQQQTTTQQ!!!!TQQQQQTTTQQQQTTTQQ!!!!!!TQQQQQTTTQQQQTTTQQ!!!!TQQQQQTTTQQQQTTTQQ!!!!!!TQQQQQTTTQQQQTTTQQ!!!!TQQQQQTTTQQQQTTTQQ!!!!!!TQQQQQTTTQQQQTTTQQ!!!!TQQQQQTTTQQQQTTTQQ!!!!!!TQQQQQTTTQQQQTTTQQ!!!!TQQQQQTTTQQQQTTTQQ!!!!!!!");
    }

    @Test
    public void test13728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13728");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\253\254\256\256``^^``^^``^^``^^\253\254\256\256``^^``^^!", "\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256``^^``^^``^^``^^\253\254\256\256``^^``^^!" + "'", str2, "\253\254\256\256``^^``^^``^^``^^\253\254\256\256``^^``^^!");
    }

    @Test
    public void test13729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13729");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]\200}}`!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]]]!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]\200}}`!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]]]!" + "'", str2, "!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]\200}}`!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]]]!");
    }

    @Test
    public void test13730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13730");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test13731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13731");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnull\200}}`nullnullnullnull]]!", "\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0187\u0187\u0187\u0187\u0187\u0187\u0187\u0187\u0187\u0187\u0187\u0187\u0187\u0187\u0187\u0187\200\u0187\u0187\u0187\u0187\u0187\u0187\u0187\u0187\u0187\u0187\u0187\u0187\u0187\u0187\u0187\u0187]]!" + "'", str2, "\u0187\u0187\u0187\u0187\u0187\u0187\u0187\u0187\u0187\u0187\u0187\u0187\u0187\u0187\u0187\u0187\200\u0187\u0187\u0187\u0187\u0187\u0187\u0187\u0187\u0187\u0187\u0187\u0187\u0187\u0187\u0187\u0187]]!");
    }

    @Test
    public void test13732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13732");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!", "!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!" + "'", str2, "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
    }

    @Test
    public void test13733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13733");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!", "\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346~~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!" + "'", str2, "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!");
    }

    @Test
    public void test13734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13734");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\226\230~~\226\230~~\226\230~~\226\230~~]!]]]!]]]!]]\226\230~~\226\230~~\226\230~~\226\230~~]!]]]!]]]!]]!", "!\275nullnull!\275nullnull!\275nullnull!\275nullnull!\275nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226\230~~\226\230~~\226\230~~\226\230~~]!]]]!]]]!]]\226\230~~\226\230~~\226\230~~\226\230~~]!]]]!]]]!]]!" + "'", str2, "\226\230~~\226\230~~\226\230~~\226\230~~]!]]]!]]]!]]\226\230~~\226\230~~\226\230~~\226\230~~]!]]]!]]]!]]!");
    }

    @Test
    public void test13735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13735");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null\225\223\223\275\275\275null\225\223\223\275\275\275!!null\225\223\223\275\275\275null\225\223\223\275\275\275!!null\225\223\223\275\275\275null\225\223\223\275\275\275null\225\223\223\275\275\275null\225\223\223\275\275\275!!null\225\223\223\275\275\275null\225\223\223\275\275\275!!null\225\223\223\275\275\275null\225\223\223\275\275\275!", "\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\230\230\230\225\223\223\275\275\275\215\230\230\230\225\223\223\275\275\275!!\215\230\230\230\225\223\223\275\275\275\215\230\230\230\225\223\223\275\275\275!!\215\230\230\230\225\223\223\275\275\275\215\230\230\230\225\223\223\275\275\275\215\230\230\230\225\223\223\275\275\275\215\230\230\230\225\223\223\275\275\275!!\215\230\230\230\225\223\223\275\275\275\215\230\230\230\225\223\223\275\275\275!!\215\230\230\230\225\223\223\275\275\275\215\230\230\230\225\223\223\275\275\275!" + "'", str2, "\215\230\230\230\225\223\223\275\275\275\215\230\230\230\225\223\223\275\275\275!!\215\230\230\230\225\223\223\275\275\275\215\230\230\230\225\223\223\275\275\275!!\215\230\230\230\225\223\223\275\275\275\215\230\230\230\225\223\223\275\275\275\215\230\230\230\225\223\223\275\275\275\215\230\230\230\225\223\223\275\275\275!!\215\230\230\230\225\223\223\275\275\275\215\230\230\230\225\223\223\275\275\275!!\215\230\230\230\225\223\223\275\275\275\215\230\230\230\225\223\223\275\275\275!");
    }

    @Test
    public void test13736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13736");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!", "\u016e\u016e\200\u016e\u016e\200\u016e\u016e\u016e\u016e\u016e\u016e\200\u016e\u016e\200\u016e\u016e\u016e\u016e\u016e\u016e\200\u016e\u016e\200\u016e\u016e\u016e\u016e\u016e\u016e\200\u016e\u016e\200\u016e\u016e\u016e\u016e\u016e\u016e\200\u016e\u016e\200\u016e\u016e\u016e\u016e\u016e\u016e\200\u016e\u016e\200\u016e\u016e\u016e\u016e\u016e\u016e\200\u016e\u016e\200\u016e\u016e\u016e\u016e\u016e\u016e\200\u016e\u016e\200\u016e\u016e\u016e\u016e\u016e\u016e\200\u016e\u016e\200\u016e\u016e\u016e\u016e\u016e\u016e\200\u016e\u016e\200\u016e\u016e\u016e\u016e\u016e\u016e\200\u016e\u016e\200\u016e\u016e\u016e\u016e\u016e\u016e\200\u016e\u016e\200\u016e\u016e\u016e\u016e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de!" + "'", str2, "\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de!");
    }

    @Test
    public void test13737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13737");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!!!!", "\230nullnullnull\230nullnullnull\230nullnullnull\230nullnullnull\230nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!!");
    }

    @Test
    public void test13738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13738");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225!", "\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220\u01b3\220\220!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\220!!!\220!!!!!\220!!!\220!!!!\225\225!\220!!!\220!!!!!\220!!!\220!!!!\225\225!\220!!!\220!!!!!\220!!!\220!!!!\225\225!\220!!!\220!!!!!\220!!!\220!!!!\225\225!\220!!!\220!!!!!\220!!!\220!!!!\225\225!\220!!!\220!!!!!\220!!!\220!!!!\225\225!\220!!!\220!!!!!\220!!!\220!!!!\225\225!\220!!!\220!!!!!\220!!!\220!!!!\225\225!" + "'", str2, "!\220!!!\220!!!!!\220!!!\220!!!!\225\225!\220!!!\220!!!!!\220!!!\220!!!!\225\225!\220!!!\220!!!!!\220!!!\220!!!!\225\225!\220!!!\220!!!!!\220!!!\220!!!!\225\225!\220!!!\220!!!!!\220!!!\220!!!!\225\225!\220!!!\220!!!!!\220!!!\220!!!!\225\225!\220!!!\220!!!!!\220!!!\220!!!!\225\225!\220!!!\220!!!!!\220!!!\220!!!!\225\225!");
    }

    @Test
    public void test13739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13739");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\215\216\230\230L!~~L!~~L!~~\215\216\230\230L!~~L!~~L!~~\215\216\230\230L!~~L!~~L!~~\215\216\230\230L!~~L!~~L!~~\215\216\230\230L!~~L!~~L!~~\215\216\230\230L!~~L!~~L!~~\215\216\230\230L!~~L!~~L!~~\215\216\230\230L!~~L!~~L!~~!", "NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230null!~~null!~~null!~~\215\216\230\230null!~~null!~~null!~~\215\216\230\230null!~~null!~~null!~~\215\216\230\230null!~~null!~~null!~~\215\216\230\230null!~~null!~~null!~~\215\216\230\230null!~~null!~~null!~~\215\216\230\230null!~~null!~~null!~~\215\216\230\230null!~~null!~~null!~~!" + "'", str2, "\215\216\230\230null!~~null!~~null!~~\215\216\230\230null!~~null!~~null!~~\215\216\230\230null!~~null!~~null!~~\215\216\230\230null!~~null!~~null!~~\215\216\230\230null!~~null!~~null!~~\215\216\230\230null!~~null!~~null!~~\215\216\230\230null!~~null!~~null!~~\215\216\230\230null!~~null!~~null!~~!");
    }

    @Test
    public void test13740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13740");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!", "\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!" + "'", str2, "!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!");
    }

    @Test
    public void test13741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13741");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!", "nullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!" + "'", str2, "\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!");
    }

    @Test
    public void test13742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13742");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\216\216\216!\216\216\216!", "\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\216\216\216!\216\216\216!" + "'", str2, "!\216\216\216!\216\216\216!");
    }

    @Test
    public void test13743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13743");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!]]!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!]]!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!]]!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!]]]!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!]]!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!]]!", "\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!!!\275!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!]]!!!\275!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!]]!!!\275!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!]]!!!\275!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!]]]!!!\275!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!]]!!!\275!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!]]!" + "'", str2, "]!!!\275!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!]]!!!\275!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!]]!!!\275!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!]]!!!\275!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!]]]!!!\275!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!]]!!!\275!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!\275!!!!!!]]!");
    }

    @Test
    public void test13744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13744");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test13745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13745");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!" + "'", str2, "\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!");
    }

    @Test
    public void test13746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13746");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271!", "\220\220\216\216\220\220\216\216LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\220\220\216\216\220\220\216\216LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\220\220\216\216\220\220\216\216LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\220\220\216\216\220\220\216\216LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\220\220\216\216\220\220\216\216LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\220\220\216\216\220\220\216\216LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\220\220\216\216\220\220\216\216LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\220\220\216\216\220\220\216\216LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271!" + "'", str2, "\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271!");
    }

    @Test
    public void test13747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13747");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!!\276\276!", "null\220~~null\220~~!!null\220~~null\220~~!!null\220~~null\220~~!!null\220~~null\220~~!!null\220~~null\220~~!!null\220~~null\220~~!!null\220~~null\220~~!!null\220~~null\220~~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!\276\276!" + "'", str2, "!!!\276\276!");
    }

    @Test
    public void test13748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13748");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!", "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!" + "'", str2, "!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!");
    }

    @Test
    public void test13749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13749");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!", "\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!" + "'", str2, "!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!");
    }

    @Test
    public void test13750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13750");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll!", "\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull!" + "'", str2, "\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull!");
    }

    @Test
    public void test13751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13751");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010enullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13752");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!" + "'", str2, "`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!");
    }

    @Test
    public void test13753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13753");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("P\220NN\200}}`P\220NN]]!", "rrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPP!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P\220RR\200}}`P\220RR]]!" + "'", str2, "P\220RR\200}}`P\220RR]]!");
    }

    @Test
    public void test13754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13754");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126ULL!", "\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038enullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e!" + "'", str2, "\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e!");
    }

    @Test
    public void test13755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13755");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLLL!!!LLLL!!!!!LLLL!!!LLLL!!!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!!!LLLL!!!LLLL!!!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!!!LLLL!!!LLLL!!!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!!!LLLL!!!LLLL!!!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!!!LLLL!!!LLLL!!!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!!!LLLL!!!LLLL!!!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!!!LLLL!!!LLLL!!!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!!!LLLL!!!LLLL!!!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!!", "nullnull\244\244nullnull\244\244nullnull\244\244nullnull\244\244\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUU!!!UUUU!!!!!UUUU!!!UUUU!!!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!!!UUUU!!!UUUU!!!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!!!UUUU!!!UUUU!!!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!!!UUUU!!!UUUU!!!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!!!UUUU!!!UUUU!!!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!!!UUUU!!!UUUU!!!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!!!UUUU!!!UUUU!!!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!!!UUUU!!!UUUU!!!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!!" + "'", str2, "UUUU!!!UUUU!!!!!UUUU!!!UUUU!!!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!!!UUUU!!!UUUU!!!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!!!UUUU!!!UUUU!!!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!!!UUUU!!!UUUU!!!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!!!UUUU!!!UUUU!!!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!!!UUUU!!!UUUU!!!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!!!UUUU!!!UUUU!!!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!!!UUUU!!!UUUU!!!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!!");
    }

    @Test
    public void test13756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13756");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13757");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!!", "!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200NNN\200NNN\276\276\200NNN\200NNN\276\276!!\256\254\254\200NNN\200NNN\276\276\200NNN\200NNN\276\276!!\256\254\254!!\200NNN\200NNN\276\276\200NNN\200NNN\276\276!!\256\254\254\200NNN\200NNN\276\276\200NNN\200NNN\276\276!!\256\254\254!!\200NNN\200NNN\276\276\200NNN\200NNN\276\276!!\256\254\254\200NNN\200NNN\276\276\200NNN\200NNN\276\276!!\256\254\254!!\200NNN\200NNN\276\276\200NNN\200NNN\276\276!!\256\254\254\200NNN\200NNN\276\276\200NNN\200NNN\276\276!!\256\254\254!!\200NNN\200NNN\276\276\200NNN\200NNN\276\276!!\256\254\254\200NNN\200NNN\276\276\200NNN\200NNN\276\276!!\256\254\254!!\200NNN\200NNN\276\276\200NNN\200NNN\276\276!!\256\254\254\200NNN\200NNN\276\276\200NNN\200NNN\276\276!!\256\254\254!!\200NNN\200NNN\276\276\200NNN\200NNN\276\276!!\256\254\254\200NNN\200NNN\276\276\200NNN\200NNN\276\276!!\256\254\254!!\200NNN\200NNN\276\276\200NNN\200NNN\276\276!!\256\254\254\200NNN\200NNN\276\276\200NNN\200NNN\276\276!!\256\254\254!!!" + "'", str2, "\200NNN\200NNN\276\276\200NNN\200NNN\276\276!!\256\254\254\200NNN\200NNN\276\276\200NNN\200NNN\276\276!!\256\254\254!!\200NNN\200NNN\276\276\200NNN\200NNN\276\276!!\256\254\254\200NNN\200NNN\276\276\200NNN\200NNN\276\276!!\256\254\254!!\200NNN\200NNN\276\276\200NNN\200NNN\276\276!!\256\254\254\200NNN\200NNN\276\276\200NNN\200NNN\276\276!!\256\254\254!!\200NNN\200NNN\276\276\200NNN\200NNN\276\276!!\256\254\254\200NNN\200NNN\276\276\200NNN\200NNN\276\276!!\256\254\254!!\200NNN\200NNN\276\276\200NNN\200NNN\276\276!!\256\254\254\200NNN\200NNN\276\276\200NNN\200NNN\276\276!!\256\254\254!!\200NNN\200NNN\276\276\200NNN\200NNN\276\276!!\256\254\254\200NNN\200NNN\276\276\200NNN\200NNN\276\276!!\256\254\254!!\200NNN\200NNN\276\276\200NNN\200NNN\276\276!!\256\254\254\200NNN\200NNN\276\276\200NNN\200NNN\276\276!!\256\254\254!!\200NNN\200NNN\276\276\200NNN\200NNN\276\276!!\256\254\254\200NNN\200NNN\276\276\200NNN\200NNN\276\276!!\256\254\254!!!");
    }

    @Test
    public void test13758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13758");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("EEEEEEEEEEEEEEEE!EEE!EEE!EEE!EEEEEEEEEEEEEEEEEEE!EEE!EEE!", "\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0!" + "'", str2, "\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0!");
    }

    @Test
    public void test13759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13759");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275UUU\276\276\276U\276\275UUU\275UUU!!\275UUU\276\276\276U\276\275UUU\275UUU!!!", "nullnullHHnullnullHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275PPP\276\276\276P\276\275PPP\275PPP!!\275PPP\276\276\276P\276\275PPP\275PPP!!!" + "'", str2, "\275PPP\276\276\276P\276\275PPP\275PPP!!\275PPP\276\276\276P\276\275PPP\275PPP!!!");
    }

    @Test
    public void test13760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13760");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198nullnullnullnullnullnullnullnull!", "}U\200\200}U\200\200}U\200\200}U\200\200NLLLNLLLNLLLNLLL}U\200\200}U\200\200}U\200\200}U\200\200NLLLNLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullUN\200\200UN\200\200UN\200\200UN\200\200UN\200\200UN\200\200UN\200\200UN\200\200UN\200\200UN\200\200UN\200\200UN\200\200UN\200\200UN\200\200UN\200\200UN\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullUN\200\200UN\200\200UN\200\200UN\200\200UN\200\200UN\200\200UN\200\200UN\200\200!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullUN\200\200UN\200\200UN\200\200UN\200\200UN\200\200UN\200\200UN\200\200UN\200\200UN\200\200UN\200\200UN\200\200UN\200\200UN\200\200UN\200\200UN\200\200UN\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullUN\200\200UN\200\200UN\200\200UN\200\200UN\200\200UN\200\200UN\200\200UN\200\200!");
    }

    @Test
    public void test13761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13761");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LL\225\225LL\225\225LL\225\225LL\225\225LL\225\225LL\225\225LL\225\225LL\225\225!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200\225\225\200\200\225\225\200\200\225\225\200\200\225\225\200\200\225\225\200\200\225\225\200\200\225\225\200\200\225\225!" + "'", str2, "\200\200\225\225\200\200\225\225\200\200\225\225\200\200\225\225\200\200\225\225\200\200\225\225\200\200\225\225\200\200\225\225!");
    }

    @Test
    public void test13762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13762");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("RR^^\225\230\230RR^^\225\230\230RR^^\225\230\230RR^^\225\230\230\200}}`RR^^\225\230\230RR^^\225\230\230RR^^\225\230\230RR^^\225\230\230]]!", "\200\200UU\200\200UU!!\200\200UU\200\200UU!!\200\200UU\200\200UU!!\200\200UU\200\200UU!!\200\200UU\200\200UU!!\200\200UU\200\200UU!!\200\200UU\200\200UU!!\200\200UU\200\200UU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230\200}}`UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230]]!" + "'", str2, "UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230\200}}`UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230]]!");
    }

    @Test
    public void test13763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13763");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LLUU!!!LLUU!!!LLUU!!!LLUU!!!LLUU!!!LLUU!!!LLUU!!!LLUU!!!!", "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0236\u0236\u023d\u023d\u0236\u0236\u023d\u023d\u0236\u0236\u023d\u023d\u0236\u0236\u023d\u023d\u0236\u0236\u023d\u023d\u0236\u0236\u023d\u023d\u0236\u0236\u023d\u023d\u0236\u0236\u023d\u023d!!!!" + "'", str2, "\u0236\u0236\u023d\u023d\u0236\u0236\u023d\u023d\u0236\u0236\u023d\u023d\u0236\u0236\u023d\u023d\u0236\u0236\u023d\u023d\u0236\u0236\u023d\u023d\u0236\u0236\u023d\u023d\u0236\u0236\u023d\u023d!!!!");
    }

    @Test
    public void test13764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13764");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\231\u0346\u0348\u0348!", "]!LL!!!]!LL!!!]!LL!!!]!LL!!!]!LL!!!]!LL!!!]!LL!!!]!LL!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\231\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\231\u0346\u0348\u0348!");
    }

    @Test
    public void test13765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13765");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174nullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0198\u0348\u0348\u0198\u0348\u0348\u0198\u0348\u0348\u0198\u0348\u0348\u0198\u0348\u0348\u0198\u0348\u0348\u0198\u0348\u0348\u0198\u0348\u0348\u0198\u0348\u0348\u0198\u0348\u0348\u0198\u0348\u0348\u0198\u0348\u0348!" + "'", str2, "\u0198\u0348\u0348\u0198\u0348\u0348\u0198\u0348\u0348\u0198\u0348\u0348\u0198\u0348\u0348\u0198\u0348\u0348\u0198\u0348\u0348\u0198\u0348\u0348\u0198\u0348\u0348\u0198\u0348\u0348\u0198\u0348\u0348\u0198\u0348\u0348!");
    }

    @Test
    public void test13766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13766");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("H!HHHHHHHHHHHHHHH!HHHHHHHHHHHHHHH!HHHHHHHHHHHHHHH!HHHHHHHHHHHHHHH!HHHHHHHHHHHHHHH!HHHHHHHHHHHHHHH!HHHHHHHHHHHHHHH!HHHHHHHHHHHHHH!", "!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N!NNNNNNNNNNNNNNN!NNNNNNNNNNNNNNN!NNNNNNNNNNNNNNN!NNNNNNNNNNNNNNN!NNNNNNNNNNNNNNN!NNNNNNNNNNNNNNN!NNNNNNNNNNNNNNN!NNNNNNNNNNNNNN!" + "'", str2, "N!NNNNNNNNNNNNNNN!NNNNNNNNNNNNNNN!NNNNNNNNNNNNNNN!NNNNNNNNNNNNNNN!NNNNNNNNNNNNNNN!NNNNNNNNNNNNNNN!NNNNNNNNNNNNNNN!NNNNNNNNNNNNNN!");
    }

    @Test
    public void test13767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13767");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174nullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0174\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0174\u0348\u0346\u0346!");
    }

    @Test
    public void test13768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13768");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!!", "null!nullnullnull!nullnullnullnullnullnullnullnullnullnullnull!nullnullnull!nullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\261\262\264\264\321\322\324\324\321\322\324\324!!!!\261\262\264\264\321\322\324\324\321\322\324\324!!!!!!\261\262\264\264\321\322\324\324\321\322\324\324!!!!\261\262\264\264\321\322\324\324\321\322\324\324!!!!!!\261\262\264\264\321\322\324\324\321\322\324\324!!!!\261\262\264\264\321\322\324\324\321\322\324\324!!!!!!\261\262\264\264\321\322\324\324\321\322\324\324!!!!\261\262\264\264\321\322\324\324\321\322\324\324!!!!!!\261\262\264\264\321\322\324\324\321\322\324\324!!!!\261\262\264\264\321\322\324\324\321\322\324\324!!!!!!\261\262\264\264\321\322\324\324\321\322\324\324!!!!\261\262\264\264\321\322\324\324\321\322\324\324!!!!!!\261\262\264\264\321\322\324\324\321\322\324\324!!!!\261\262\264\264\321\322\324\324\321\322\324\324!!!!!!\261\262\264\264\321\322\324\324\321\322\324\324!!!!\261\262\264\264\321\322\324\324\321\322\324\324!!!!!!!" + "'", str2, "\261\262\264\264\321\322\324\324\321\322\324\324!!!!\261\262\264\264\321\322\324\324\321\322\324\324!!!!!!\261\262\264\264\321\322\324\324\321\322\324\324!!!!\261\262\264\264\321\322\324\324\321\322\324\324!!!!!!\261\262\264\264\321\322\324\324\321\322\324\324!!!!\261\262\264\264\321\322\324\324\321\322\324\324!!!!!!\261\262\264\264\321\322\324\324\321\322\324\324!!!!\261\262\264\264\321\322\324\324\321\322\324\324!!!!!!\261\262\264\264\321\322\324\324\321\322\324\324!!!!\261\262\264\264\321\322\324\324\321\322\324\324!!!!!!\261\262\264\264\321\322\324\324\321\322\324\324!!!!\261\262\264\264\321\322\324\324\321\322\324\324!!!!!!\261\262\264\264\321\322\324\324\321\322\324\324!!!!\261\262\264\264\321\322\324\324\321\322\324\324!!!!!!\261\262\264\264\321\322\324\324\321\322\324\324!!!!\261\262\264\264\321\322\324\324\321\322\324\324!!!!!!!");
    }

    @Test
    public void test13769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13769");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275LLL\275LLL!", "}~\200\200}~\200\200\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e}~\200\200}~\200\200\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\u023e\u023e\u023e\275\u023e\u023e\u023e!" + "'", str2, "\275\u023e\u023e\u023e\275\u023e\u023e\u023e!");
    }

    @Test
    public void test13770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13770");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269!", "\335nullnullnull!\276\276\335nullnullnull!\276\276\335nullnullnull!\276\276\335nullnullnull!\276\276\335nullnullnull!\276\276\335nullnullnull!\276\276\335nullnullnull!\276\276\335nullnullnull!\276\276!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test13771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13771");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0147\u014a\u014a\u0147\u014a\u014a\u0147\u014a\u014a\u0147\u014a\u014a!!!", "!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200!!!\200!!!!!\200!!!\200!!!!!!" + "'", str2, "\200!!!\200!!!!!\200!!!\200!!!!!!");
    }

    @Test
    public void test13772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13772");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\254!LL\254!LL!LLL!LLL\254!LL\254!LL!LLL!LLL!!\254!LL\254!LL!LLL!LLL\254!LL\254!LL!LLL!LLL!!\254!LL\254!LL!LLL!LLL\254!LL\254!LL!LLL!LLL\254!LL\254!LL!LLL!LLL\254!LL\254!LL!LLL!LLL!!\254!LL\254!LL!LLL!LLL\254!LL\254!LL!LLL!LLL!!\254!LL\254!LL!LLL!LLL\254!LL\254!LL!LLL!LLL!", "^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\u029e\u029e\254\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\254\u029e\u029e\254\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\254\u029e\u029e\254\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\254\u029e\u029e\254\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\254\u029e\u029e\254\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\254\u029e\u029e\254\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\254\u029e\u029e\254\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\254\u029e\u029e\254\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\254\u029e\u029e\254\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\254\u029e\u029e\254\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\254\u029e\u029e\254\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\254\u029e\u029e\254\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!" + "'", str2, "\254\u029e\u029e\254\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\254\u029e\u029e\254\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\254\u029e\u029e\254\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\254\u029e\u029e\254\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\254\u029e\u029e\254\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\254\u029e\u029e\254\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\254\u029e\u029e\254\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\254\u029e\u029e\254\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\254\u029e\u029e\254\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\254\u029e\u029e\254\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\254\u029e\u029e\254\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\254\u029e\u029e\254\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!");
    }

    @Test
    public void test13773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13773");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!!", "\275\ua7ab\ua7ab\ua7ab\ua7ab\230\230\u0366\ua7ab\ua7ab\ua7ab\ua7ab\230\230\ua7ab\ua7ab\ua7ab\ua7ab\230\230\ua7ab\ua7ab\ua7ab\ua7ab\230\230\u0366\ua7ab\ua7ab\ua7ab\ua7ab\230\230\ua7ab\ua7ab\ua7ab\ua7ab\230\230\200\200\ua7ab\ua7ab\ua7ab\ua7ab\230\230\u0366\ua7ab\ua7ab\ua7ab\ua7ab\230\230\ua7ab\ua7ab\ua7ab\ua7ab\230\230\ua7ab\ua7ab\ua7ab\ua7ab\230\230\u0366\ua7ab\ua7ab\ua7ab\ua7ab\230\230\ua7ab\ua7ab\ua7ab\ua7ab\230\230\200\200\ua7ab\ua7ab\ua7ab\ua7ab\230\230\u0366\ua7ab\ua7ab\ua7ab\ua7ab\230\230\ua7ab\ua7ab\ua7ab\ua7ab\230\230\ua7ab\ua7ab\ua7ab\ua7ab\230\230\u0366\ua7ab\ua7ab\ua7ab\ua7ab\230\230\ua7ab\ua7ab\ua7ab\ua7ab\230\230\200\200\276\ua7ab\ua7ab\ua7ab\ua7ab\230\230\u0366\ua7ab\ua7ab\ua7ab\ua7ab\230\230\ua7ab\ua7ab\ua7ab\ua7ab\230\230\ua7ab\ua7ab\ua7ab\ua7ab\230\230\u0366\ua7ab\ua7ab\ua7ab\ua7ab\230\230\ua7ab\ua7ab\ua7ab\ua7ab\230\230\200\200\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!!" + "'", str2, "\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!!");
    }

    @Test
    public void test13774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13774");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!", "\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13775");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be}~\200\200}~\200\200\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be!", "~}\200\200~}\200\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!~}\200\200~}\200\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!~}\200\200~}\200\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!~}\200\200~}\200\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!~}\200\200~}\200\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!~}\200\200~}\200\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!~}\200\200~}\200\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!~}\200\200~}\200\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200\u0348\u0348\u0348\u0348}~\200\200}~\200\200\u0348\u0348\u0348\u0348!" + "'", str2, "}~\200\200}~\200\200\u0348\u0348\u0348\u0348}~\200\200}~\200\200\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test13776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13776");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380}~\200\200}~\200\200\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380}~\200\200}~\200\200\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380}~\200\200}~\200\200\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u0348\u0346\u0346!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380}~\200\200}~\200\200\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380}~\200\200}~\200\200\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380}~\200\200}~\200\200\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380}~\200\200}~\200\200\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380}~\200\200}~\200\200\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380}~\200\200}~\200\200\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u0348\u0346\u0346!");
    }

    @Test
    public void test13777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13777");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\246\246\246\246\246\246\246\246!!\246\246\246\246\246\246\246\246!!\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246!!\246\246\246\246\246\246\246\246!!\246\246\246\246\246\246\246\246!", "\275\u038a\u038a\u038a\276\u038a\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\246\246\246\246\246\246\246\246!!\246\246\246\246\246\246\246\246!!\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246!!\246\246\246\246\246\246\246\246!!\246\246\246\246\246\246\246\246!" + "'", str2, "\246\246\246\246\246\246\246\246!!\246\246\246\246\246\246\246\246!!\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246!!\246\246\246\246\246\246\246\246!!\246\246\246\246\246\246\246\246!");
    }

    @Test
    public void test13778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13778");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\276\u031d\u031dTT\275\276\u031d\u031dTT\225\225\275\276\u031d\u031dTT\275\276\u031d\u031dTT\225\225\275\276\u031d\u031dTT\275\276\u031d\u031dTT\225\225\275\276\u031d\u031dTT\275\276\u031d\u031dTT\225\225\275\276\u031d\u031dTT\275\276\u031d\u031dTT\225\225\275\276\u031d\u031dTT\275\276\u031d\u031dTT\225\225\275\276\u031d\u031dTT\275\276\u031d\u031dTT\225\225\275\276\u031d\u031dTT\275\276\u031d\u031dTT\225\225!", "!\253\256\256]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276XX\225\225\u031d!!XX\225\225\u031d!!\275\276XX\225\225\u031d!!XX\225\225\u031d!!\225\225\275\276XX\225\225\u031d!!XX\225\225\u031d!!\275\276XX\225\225\u031d!!XX\225\225\u031d!!\225\225\275\276XX\225\225\u031d!!XX\225\225\u031d!!\275\276XX\225\225\u031d!!XX\225\225\u031d!!\225\225\275\276XX\225\225\u031d!!XX\225\225\u031d!!\275\276XX\225\225\u031d!!XX\225\225\u031d!!\225\225\275\276XX\225\225\u031d!!XX\225\225\u031d!!\275\276XX\225\225\u031d!!XX\225\225\u031d!!\225\225\275\276XX\225\225\u031d!!XX\225\225\u031d!!\275\276XX\225\225\u031d!!XX\225\225\u031d!!\225\225\275\276XX\225\225\u031d!!XX\225\225\u031d!!\275\276XX\225\225\u031d!!XX\225\225\u031d!!\225\225\275\276XX\225\225\u031d!!XX\225\225\u031d!!\275\276XX\225\225\u031d!!XX\225\225\u031d!!\225\225!" + "'", str2, "\275\276XX\225\225\u031d!!XX\225\225\u031d!!\275\276XX\225\225\u031d!!XX\225\225\u031d!!\225\225\275\276XX\225\225\u031d!!XX\225\225\u031d!!\275\276XX\225\225\u031d!!XX\225\225\u031d!!\225\225\275\276XX\225\225\u031d!!XX\225\225\u031d!!\275\276XX\225\225\u031d!!XX\225\225\u031d!!\225\225\275\276XX\225\225\u031d!!XX\225\225\u031d!!\275\276XX\225\225\u031d!!XX\225\225\u031d!!\225\225\275\276XX\225\225\u031d!!XX\225\225\u031d!!\275\276XX\225\225\u031d!!XX\225\225\u031d!!\225\225\275\276XX\225\225\u031d!!XX\225\225\u031d!!\275\276XX\225\225\u031d!!XX\225\225\u031d!!\225\225\275\276XX\225\225\u031d!!XX\225\225\u031d!!\275\276XX\225\225\u031d!!XX\225\225\u031d!!\225\225\275\276XX\225\225\u031d!!XX\225\225\u031d!!\275\276XX\225\225\u031d!!XX\225\225\u031d!!\225\225!");
    }

    @Test
    public void test13779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13779");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\215}\215\215\215}\215\215\u017d\u0180\u0180\u0180\u017d\u0180\u0180\u0180\u017d\u0180\u0180\u0180\u017d\u0180\u0180\u0180\215}\215\215\215}\215\215!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\215}\215\215\215}\215\215!");
    }

    @Test
    public void test13780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13780");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\253\254\256\256````````````````````````````````````````````````````````````````\253\254\256\256````````````````````````````````!", "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\200}}`\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256````````````````````````````````````````````````````````````````\253\254\256\256````````````````````````````````!" + "'", str2, "\253\254\256\256````````````````````````````````````````````````````````````````\253\254\256\256````````````````````````````````!");
    }

    @Test
    public void test13781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13781");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!!", "!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!!" + "'", str2, "\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!!");
    }

    @Test
    public void test13782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13782");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLL!", "!]\223\223]]\223\223]]!]\223\223]]\223\223]]!]\223\223]]\223\223]]!]\223\223]]\223\223]]!]\223\223]]\223\223]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13783");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``!" + "'", str2, "\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``!");
    }

    @Test
    public void test13784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13784");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "!\226\226\226!\226\226\226!\226\226\226!\226\226\226!\226\226\226!\226\226\226!\226\226\226!\226\226\226!!!\226\226\226!\226\226\226!\226\226\226!\226\226\226!\226\226\226!\226\226\226!\226\226\226!\226\226\226!!!\226\226\226!\226\226\226!\226\226\226!\226\226\226!\226\226\226!\226\226\226!\226\226\226!\226\226\226!\226\226\226!\226\226\226!\226\226\226!\226\226\226!\226\226\226!\226\226\226!\226\226\226!\226\226\226!!!\226\226\226!\226\226\226!\226\226\226!\226\226\226!\226\226\226!\226\226\226!\226\226\226!\226\226\226!!!\226\226\226!\226\226\226!\226\226\226!\226\226\226!\226\226\226!\226\226\226!\226\226\226!\226\226\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13785");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275U!!\275U!!!!\275U!!\275U!!!!\275U!!\275U!!\275U!!\275U!!!!\275U!!\275U!!!!\275U!!\275U!!!", "\u035d\u035d\u035d\u035d\u035d\u035d\u035d\u035d!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275null!!\275null!!!!\275null!!\275null!!!!\275null!!\275null!!\275null!!\275null!!!!\275null!!\275null!!!!\275null!!\275null!!!" + "'", str2, "\275null!!\275null!!!!\275null!!\275null!!!!\275null!!\275null!!\275null!!\275null!!!!\275null!!\275null!!!!\275null!!\275null!!!");
    }

    @Test
    public void test13786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13786");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null!ijllijllnull!ijllijllnull!ijllijllnull!ijllijllnull!ijllijllnull!ijllijllnull!ijllijllnull!ijllijll!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "URRR!LLRRLLRRURRR!LLRRLLRRURRR!LLRRLLRRURRR!LLRRLLRRURRR!LLRRLLRRURRR!LLRRLLRRURRR!LLRRLLRRURRR!LLRRLLRR!" + "'", str2, "URRR!LLRRLLRRURRR!LLRRLLRRURRR!LLRRLLRRURRR!LLRRLLRRURRR!LLRRLLRRURRR!LLRRLLRRURRR!LLRRLLRRURRR!LLRRLLRR!");
    }

    @Test
    public void test13787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13787");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!", "!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!!!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!" + "'", str2, "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!");
    }

    @Test
    public void test13788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13788");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!tttnullnullnullnull!tttnullnull!", "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\200}}`\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!```\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!```\214\214\214\214\214\214\214\214!" + "'", str2, "!```\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!```\214\214\214\214\214\214\214\214!");
    }

    @Test
    public void test13789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13789");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULL!", "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test13790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13790");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u01d4\u01d4\u01d4\u01d4\220\220\u01d4\u01d4\u01d4\u01d4\220\220\220\u01d4\u01d4\220\220\220\u01d4\u01d4\220\220\220\u01d4\u01d4\220\220\220\u01d4\u01d4\220\220\u01d4\u01d4\u01d4\u01d4\220\220\u01d4\u01d4\u01d4\u01d4\220\220!", "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220!" + "'", str2, "!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220!");
    }

    @Test
    public void test13791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13791");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!!\300\300!", "!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!nullnull!" + "'", str2, "!!!nullnull!");
    }

    @Test
    public void test13792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13792");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226!!nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226!!!", "!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~NLL~NLL!!\230\226\226~NLL~NLL!!\230\226\226~NLL~NLL!!\230\226\226~NLL~NLL!!\230\226\226~NLL~NLL!!\230\226\226~NLL~NLL!!\230\226\226~NLL~NLL!!\230\226\226~NLL~NLL!!\230\226\226!!~NLL~NLL!!\230\226\226~NLL~NLL!!\230\226\226~NLL~NLL!!\230\226\226~NLL~NLL!!\230\226\226~NLL~NLL!!\230\226\226~NLL~NLL!!\230\226\226~NLL~NLL!!\230\226\226~NLL~NLL!!\230\226\226!!!" + "'", str2, "~NLL~NLL!!\230\226\226~NLL~NLL!!\230\226\226~NLL~NLL!!\230\226\226~NLL~NLL!!\230\226\226~NLL~NLL!!\230\226\226~NLL~NLL!!\230\226\226~NLL~NLL!!\230\226\226~NLL~NLL!!\230\226\226!!~NLL~NLL!!\230\226\226~NLL~NLL!!\230\226\226~NLL~NLL!!\230\226\226~NLL~NLL!!\230\226\226~NLL~NLL!!\230\226\226~NLL~NLL!!\230\226\226~NLL~NLL!!\230\226\226~NLL~NLL!!\230\226\226!!!");
    }

    @Test
    public void test13793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13793");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200!", "\270UU!!\270\270\270UU!!\270\270!!\270UU!!\270\270\270UU!!\270\270!!\270UU!!\270\270\270UU!!\270\270!!\270UU!!\270\270\270UU!!\270\270!!\270UU!!\270\270\270UU!!\270\270!!\270UU!!\270\270\270UU!!\270\270!!\270UU!!\270\270\270UU!!\270\270!!\270UU!!\270\270\270UU!!\270\270!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnull}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnull}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200!" + "'", str2, "null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnull}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnull}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200!");
    }

    @Test
    public void test13794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13794");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!!!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!!!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!!!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!!!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!!!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!!!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!!!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!!!", "nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!!!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!!!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!!!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!!!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!!!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!!!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!!!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!!!" + "'", str2, "!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!!!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!!!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!!!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!!!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!!!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!!!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!!!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!!!");
    }

    @Test
    public void test13795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13795");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204\u0346\u0348\u0348!", "\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204\u0346\u0348\u0348!");
    }

    @Test
    public void test13796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13796");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!\256\u0104\u0102\u0102\254\254\256\u0104\u0102\u0102\254\254!!\256\u0104\u0102\u0102\254\254\256\u0104\u0102\u0102\254\254!!\256\u0104\u0102\u0102\254\254\256\u0104\u0102\u0102\254\254!!\256\u0104\u0102\u0102\254\254\256\u0104\u0102\u0102\254\254!!\256\u0104\u0102\u0102\254\254\256\u0104\u0102\u0102\254\254!!\256\u0104\u0102\u0102\254\254\256\u0104\u0102\u0102\254\254!!\256\u0104\u0102\u0102\254\254\256\u0104\u0102\u0102\254\254!!\256\u0104\u0102\u0102\254\254\256\u0104\u0102\u0102\254\254!", "LNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\256LLNNnullnullnull\254\254\256LLNNnullnullnull\254\254!!\256LLNNnullnullnull\254\254\256LLNNnullnullnull\254\254!!\256LLNNnullnullnull\254\254\256LLNNnullnullnull\254\254!!\256LLNNnullnullnull\254\254\256LLNNnullnullnull\254\254!!\256LLNNnullnullnull\254\254\256LLNNnullnullnull\254\254!!\256LLNNnullnullnull\254\254\256LLNNnullnullnull\254\254!!\256LLNNnullnullnull\254\254\256LLNNnullnullnull\254\254!!\256LLNNnullnullnull\254\254\256LLNNnullnullnull\254\254!" + "'", str2, "!!\256LLNNnullnullnull\254\254\256LLNNnullnullnull\254\254!!\256LLNNnullnullnull\254\254\256LLNNnullnullnull\254\254!!\256LLNNnullnullnull\254\254\256LLNNnullnullnull\254\254!!\256LLNNnullnullnull\254\254\256LLNNnullnullnull\254\254!!\256LLNNnullnullnull\254\254\256LLNNnullnullnull\254\254!!\256LLNNnullnullnull\254\254\256LLNNnullnullnull\254\254!!\256LLNNnullnullnull\254\254\256LLNNnullnullnull\254\254!!\256LLNNnullnullnull\254\254\256LLNNnullnullnull\254\254!");
    }

    @Test
    public void test13797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13797");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null\230\225\226\226nullnull\230\225\226\226nullnullnull\230\225\226\226nullnull\230\225\226\226nullnullnull\230\225\226\226nullnull\230\225\226\226nullnullnull\230\225\226\226nullnull\230\225\226\226nullnullnull\230\225\226\226nullnull\230\225\226\226nullnullnull\230\225\226\226nullnull\230\225\226\226nullnullnull\230\225\226\226nullnull\230\225\226\226nullnullnull\230\225\226\226nullnull\230\225\226\226nullnull!", "\u0366\u0365\u0368\u0368N\254!!!!!N\254!!!!!\200\200\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346nn\230\225\226\226\u0346\u0346nn\230\225\226\226\u0346\u0346\u0346nn\230\225\226\226\u0346\u0346nn\230\225\226\226\u0346\u0346\u0346nn\230\225\226\226\u0346\u0346nn\230\225\226\226\u0346\u0346\u0346nn\230\225\226\226\u0346\u0346nn\230\225\226\226\u0346\u0346\u0346nn\230\225\226\226\u0346\u0346nn\230\225\226\226\u0346\u0346\u0346nn\230\225\226\226\u0346\u0346nn\230\225\226\226\u0346\u0346\u0346nn\230\225\226\226\u0346\u0346nn\230\225\226\226\u0346\u0346\u0346nn\230\225\226\226\u0346\u0346nn\230\225\226\226\u0346\u0346nn!" + "'", str2, "\u0346nn\230\225\226\226\u0346\u0346nn\230\225\226\226\u0346\u0346\u0346nn\230\225\226\226\u0346\u0346nn\230\225\226\226\u0346\u0346\u0346nn\230\225\226\226\u0346\u0346nn\230\225\226\226\u0346\u0346\u0346nn\230\225\226\226\u0346\u0346nn\230\225\226\226\u0346\u0346\u0346nn\230\225\226\226\u0346\u0346nn\230\225\226\226\u0346\u0346\u0346nn\230\225\226\226\u0346\u0346nn\230\225\226\226\u0346\u0346\u0346nn\230\225\226\226\u0346\u0346nn\230\225\226\226\u0346\u0346\u0346nn\230\225\226\226\u0346\u0346nn\230\225\226\226\u0346\u0346nn!");
    }

    @Test
    public void test13798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13798");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!!", "}~\200\200}~\200\200\u0170\u0170\u0170\u0170\u0170\u0170nullnullnull}~\200\200}~\200\200\u0170\u0170\u0170\u0170\u0170\u0170nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!!" + "'", str2, "\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!!");
    }

    @Test
    public void test13799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13799");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200!!!!", "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULL!!!NULL!!!NULL!!!NULL!!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULL!!!NULL!!!!" + "'", str2, "NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULL!!!NULL!!!NULL!!!NULL!!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULL!!!NULL!!!!");
    }

    @Test
    public void test13800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13800");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\215\216\230\230\u019d\u019d\u019d!~~\215\216\230\230\u019d\u019d\u019d!~~\215\216\230\230\u019d\u019d\u019d!~~\215\216\230\230\u019d\u019d\u019d!~~\215\216\230\230\u019d\u019d\u019d!~~\215\216\230\230\u019d\u019d\u019d!~~\215\216\230\230\u019d\u019d\u019d!~~\215\216\230\230\u019d\u019d\u019d!~~!", "}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}}\275\275}}}}}\275\275}}}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}}\275\275}}}}}\275\275}}}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}}\275\275}}}}}\275\275}}}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}}\275\275}}}}}\275\275}}}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}}\275\275}}}}}\275\275}}}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}}\275\275}}}}}\275\275}}}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}}\275\275}}}}}\275\275}}}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}}\275\275}}}}}\275\275}}!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230\275!~~\275!~~\275!~~\215\216\230\230\275!~~\275!~~\275!~~\215\216\230\230\275!~~\275!~~\275!~~\215\216\230\230\275!~~\275!~~\275!~~\215\216\230\230\275!~~\275!~~\275!~~\215\216\230\230\275!~~\275!~~\275!~~\215\216\230\230\275!~~\275!~~\275!~~\215\216\230\230\275!~~\275!~~\275!~~!" + "'", str2, "\215\216\230\230\275!~~\275!~~\275!~~\215\216\230\230\275!~~\275!~~\275!~~\215\216\230\230\275!~~\275!~~\275!~~\215\216\230\230\275!~~\275!~~\275!~~\215\216\230\230\275!~~\275!~~\275!~~\215\216\230\230\275!~~\275!~~\275!~~\215\216\230\230\275!~~\275!~~\275!~~\215\216\230\230\275!~~\275!~~\275!~~!");
    }

    @Test
    public void test13801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13801");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0306\u0306\u0306\u0306\u0306\u0306\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0306\u0306\u0306\u0306\u0306\u0306\u0346\u0348\u0348!");
    }

    @Test
    public void test13802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13802");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!!!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!!!", "\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!!!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!!!" + "'", str2, "!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!!!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!!!");
    }

    @Test
    public void test13803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13803");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!]nullnullnullnullnullnullnullnull!]nullnullnullnullnullnullnullnull!]nullnullnullnullnullnullnullnull!]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!]nullnullnullnullnullnullnullnull!]nullnullnullnullnullnullnullnull!", "!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!]U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!]U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!]U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!]U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!]U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!]U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!" + "'", str2, "U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!]U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!]U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!]U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!]U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!]U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!]U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!");
    }

    @Test
    public void test13804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13804");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!", "``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!L!!!L!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!L!!!L!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!L!!!L!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!L!!!L!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!L!!!L!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!L!!!L!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!L!!!L!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!L!!!L!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!" + "'", str2, "!L!!!L!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!L!!!L!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!L!!!L!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!L!!!L!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!L!!!L!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!L!!!L!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!L!!!L!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!L!!!L!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
    }

    @Test
    public void test13805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13805");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~}\200\200~}\200\200FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEEFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEE~}\200\200~}\200\200FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEEFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEE~}\200\200~}\200\200FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEEFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEE~}\200\200~}\200\200FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEEFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEE~}\200\200~}\200\200FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEEFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEE~}\200\200~}\200\200FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEEFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEE~}\200\200~}\200\200FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEEFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEE~}\200\200~}\200\200FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEEFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHEE!", "\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL!" + "'", str2, "~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL!");
    }

    @Test
    public void test13806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13806");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\260\260\260\260\u0346\u0348\u0348!", "nullnullnullnullnullnullnullnullLN]]LN]]nullnullnullnullnullnullnullnullLN]]LN]]nullnullnullnullnullnullnullnullLN]]LN]]nullnullnullnullnullnullnullnullLN]]LN]]nullnullnullnullnullnullnullnullLN]]LN]]nullnullnullnullnullnullnullnullLN]]LN]]nullnullnullnullnullnullnullnullLN]]LN]]nullnullnullnullnullnullnullnullLN]]LN]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\260\260\260\260\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\260\260\260\260\u0346\u0348\u0348!");
    }

    @Test
    public void test13807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13807");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!nullnullnullnullnullnullnullnull!", "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!ULLLULLLULLLULLLULLLULLLULLLULLL!" + "'", str2, "!!!ULLLULLLULLLULLLULLLULLLULLLULLL!");
    }

    @Test
    public void test13808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13808");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230\200}}`!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230]]!", "!\253\256\256\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230\200}}`!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230]]!" + "'", str2, "!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230\200}}`!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230]]!");
    }

    @Test
    public void test13809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13809");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUU!!UU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUU!!UU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUU!!UU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUU!!UU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUU!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNN!!NN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNN!!NN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNN!!NN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNN!!NN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNN!" + "'", str2, "NN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNN!!NN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNN!!NN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNN!!NN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNN!!NN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNNNN`NNN`NNN!");
    }

    @Test
    public void test13810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13810");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!!U^LLU^LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13811");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("`\275```\275```\275```\275```\275```\275```\275```\275\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368`\275```\275```\275```\275```\275```\275```\275```\275\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368!", "!!!!\236\276\276!!!!\236\276\276!!!!!!\236\276\276!!!!\236\276\276!!!!!!\236\276\276!!!!\236\276\276!!!!\236\276\276!!!!\236\276\276!!!!!!\236\276\276!!!!\236\276\276!!!!!!\236\276\276!!!!\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`\275```\275```\275```\275```\275```\275```\275```\275\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368`\275```\275```\275```\275```\275```\275```\275```\275\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368!" + "'", str2, "`\275```\275```\275```\275```\275```\275```\275```\275\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368`\275```\275```\275```\275```\275```\275```\275```\275\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368!");
    }

    @Test
    public void test13812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13812");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ}~\200\200}~\200\200JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ!", "IJJJIJJJIJJJIJJJIJJJIJJJIJJJIJJJ!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ}~\200\200}~\200\200JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ!" + "'", str2, "}~\200\200}~\200\200JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ}~\200\200}~\200\200JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ!");
    }

    @Test
    public void test13813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13813");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnullnullnull`nullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!", "\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH!!\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH!!\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH!!\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH!!\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13814");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275HHH\275HHH\275HHH\275HHH\275HHH\275HHH\275HHH\275HHH!", "\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276!!\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276!!\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276!!\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276!!\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull!" + "'", str2, "\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull!");
    }

    @Test
    public void test13815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13815");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388!", "\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnullnull!");
    }

    @Test
    public void test13816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13816");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll!", "}L!!!\200\200}L!!!\200\200}L!!!\200\200}L!!!\200\200L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~}L!!!\200\200}L!!!\200\200}L!!!\200\200}L!!!\200\200L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365!" + "'", str2, "\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365\276!\365\365!");
    }

    @Test
    public void test13817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13817");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\u033c\u033d\u033f\u033f\u033c\u033d\u033f\u033f\253\253\u033c\u033d\u033f\u033f\u033c\u033d\u033f\u033f\253\253\u033c\u033d\u033f\u033f\u033c\u033d\u033f\u033f\253\253\u033c\u033d\u033f\u033f\u033c\u033d\u033f\u033f\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\u033c\u033d\u033f\u033f\u033c\u033d\u033f\u033f\253\253\u033c\u033d\u033f\u033f\u033c\u033d\u033f\u033f\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!" + "'", str2, "!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!");
    }

    @Test
    public void test13818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13818");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLNNNNLL!", "!ULL!ULL!ULL!ULL!ULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUUUULL!" + "'", str2, "LLUUUULL!");
    }

    @Test
    public void test13819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13819");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!NLLLNLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!!NLLLNLLL!!NLLLNLLL!", "UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LUUULUUULUUU!LUUULUUULUUU!LUUULUUULUUU!LUUULUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!LUUULUUULUUU!LUUULUUULUUU!LUUULUUULUUU!LUUULUUULUUU!!LUUULUUU!!LUUULUUU!" + "'", str2, "!LUUULUUULUUU!LUUULUUULUUU!LUUULUUULUUU!LUUULUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!LUUULUUULUUU!LUUULUUULUUU!LUUULUUULUUU!LUUULUUULUUU!!LUUULUUU!!LUUULUUU!");
    }

    @Test
    public void test13820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13820");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\300\300!!\300\300!!!", "UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test13821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13821");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u013a\u013b\u013d\u013d\u013a\u013b\u013d\u013d\u013a\u013b\u013d\u013d\u013a\u013b\u013d\u013d\u013a\u013b\u013d\u013d\u013a\u013b\u013d\u013d\u013a\u013b\u013d\u013d\u013a\u013b\u013d\u013d\u013a\u013b\u013d\u013d\u013a\u013b\u013d\u013d\u013a\u013b\u013d\u013d\u013a\u013b\u013d\u013d\u013a\u013b\u013d\u013d\u013a\u013b\u013d\u013d\u013a\u013b\u013d\u013d\u013a\u013b\u013d\u013d\u013a\u013b\u013d\u013d\u013a\u013b\u013d\u013d\u013a\u013b\u013d\u013d\u013a\u013b\u013d\u013d\u013a\u013b\u013d\u013d\u013a\u013b\u013d\u013d\u013a\u013b\u013d\u013d\u013a\u013b\u013d\u013d\u013a\u013b\u013d\u013d\u013a\u013b\u013d\u013d\u013a\u013b\u013d\u013d\u013a\u013b\u013d\u013d\u013a\u013b\u013d\u013d\u013a\u013b\u013d\u013d\u013a\u013b\u013d\u013d\u013a\u013b\u013d\u013d]!]]]!]]]!]]!", "!NNN\200}}`!NNN]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]!]]]!]]]!]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]!]]]!]]]!]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]!]]]!]]]!]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]!]]]!]]]!]]!");
    }

    @Test
    public void test13822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13822");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~}\200\200~}\200\200`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!~}\200\200~}\200\200`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!~}\200\200~}\200\200`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!~}\200\200~}\200\200`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!~}\200\200~}\200\200`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!~}\200\200~}\200\200`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!~}\200\200~}\200\200`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!~}\200\200~}\200\200`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200UL``LUL``UL``UL``LUL``UL``}~\200\200}~\200\200UL``LUL``UL``UL``LUL``UL``}~\200\200}~\200\200UL``LUL``UL``UL``LUL``UL``}~\200\200}~\200\200\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!~}\200\200~}\200\200`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!~}\200\200~}\200\200`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!~}\200\200~}\200\200`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!~}\200\200~}\200\200`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!~}\200\200~}\200\200`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!~}\200\200~}\200\200`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!~}\200\200~}\200\200`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!!" + "'", str2, "~}\200\200~}\200\200`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!~}\200\200~}\200\200`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!~}\200\200~}\200\200`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!~}\200\200~}\200\200`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!~}\200\200~}\200\200`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!~}\200\200~}\200\200`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!~}\200\200~}\200\200`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!~}\200\200~}\200\200`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!`!!!!`!!!`!!!`!!!!`!!!`!!!!`!!!`!!!");
    }

    @Test
    public void test13823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13823");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!LNUULNUULNUU!LNUULNUULNUU!!!LNUULNUULNUU!LNUULNUULNUU!!!LNUULNUULNUU!LNUULNUULNUU!!!LNUULNUULNUU!LNUULNUULNUU!!!LNUULNUULNUU!LNUULNUULNUU!!!LNUULNUULNUU!LNUULNUULNUU!!!LNUULNUULNUU!LNUULNUULNUU!!!LNUULNUULNUU!LNUULNUULNUU!!!LNUULNUULNUU!LNUULNUULNUU!!!LNUULNUULNUU!LNUULNUULNUU!!!LNUULNUULNUU!LNUULNUULNUU!!!LNUULNUULNUU!LNUULNUULNUU!!!LNUULNUULNUU!LNUULNUULNUU!!!LNUULNUULNUU!LNUULNUULNUU!!!LNUULNUULNUU!LNUULNUULNUU!!!LNUULNUULNUU!LNUULNUULNUU!!!LNUULNUULNUU!LNUULNUULNUU!!!LNUULNUULNUU!LNUULNUULNUU!!!LNUULNUULNUU!LNUULNUULNUU!!!LNUULNUULNUU!LNUULNUULNUU!!!LNUULNUULNUU!LNUULNUULNUU!!!LNUULNUULNUU!LNUULNUULNUU!!!LNUULNUULNUU!LNUULNUULNUU!!!LNUULNUULNUU!LNUULNUULNUU!!!LNUULNUULNUU!LNUULNUULNUU!!!LNUULNUULNUU!LNUULNUULNUU!!!LNUULNUULNUU!LNUULNUULNUU!!!LNUULNUULNUU!LNUULNUULNUU!!!LNUULNUULNUU!LNUULNUULNUU!!!LNUULNUULNUU!LNUULNUULNUU!!!LNUULNUULNUU!LNUULNUULNUU!!!LNUULNUULNUU!LNUULNUULNUU!!!", "\215}\215\215\215}\215\215~LLL~LLL~LLL~LLL\215}\215\215\215}\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!" + "'", str2, "!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!LL~~LL~~LL~~!LL~~LL~~LL~~!!!");
    }

    @Test
    public void test13824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13824");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!nullnullnull\303\304\306\306\303\304\306\306\303\304\306\306\303\304\306\306!nullnullnull\303\304\306\306\303\304\306\306!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13825");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226!!!", "\u014e!\275\275\u014e!\275\275\u014e\u014e\u014e!\275\275\u014e!\275\275\u014e\u014e\u014e!\275\275\u014e!\275\275\u014e\u014e\u014e!\275\275\u014e!\275\275\u014e\u014e\u014e!\275\275\u014e!\275\275\u014e\u014e\u014e!\275\275\u014e!\275\275\u014e\u014e\u014e!\275\275\u014e!\275\275\u014e\u014e\u014e!\275\275\u014e!\275\275\u014e\u014e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test13826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13826");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!", "Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!Q~TTQ~TTQ~TTQ~TT~Q\200\200~Q\200\200!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!!" + "'", str2, "!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!!");
    }

    @Test
    public void test13827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13827");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!!!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!!!", "!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!~!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!~!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!~!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!~!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!~!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!~!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!~!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!!!~!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!~!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!~!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!~!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!~!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!~!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!~!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!~!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!!!" + "'", str2, "!~!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!~!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!~!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!~!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!~!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!~!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!~!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!~!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!!!~!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!~!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!~!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!~!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!~!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!~!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!~!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!~!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!!!");
    }

    @Test
    public void test13828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13828");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\276\342\266\266\276\342\266\266\200\200\276\342\266\266\276\342\266\266\200\200\276\342\266\266\276\342\266\266\200\200\276\276\342\266\266\276\342\266\266\200\200\275\275!", "\u0366\u0365\u0368\u0368ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226!!ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226!!ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226!!ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276\226\266\266\276\226\266\266\200\200\276\226\266\266\276\226\266\266\200\200\276\226\266\266\276\226\266\266\200\200\276\276\226\266\266\276\226\266\266\200\200\275\275!" + "'", str2, "\275\276\226\266\266\276\226\266\266\200\200\276\226\266\266\276\226\266\266\200\200\276\226\266\266\276\226\266\266\200\200\276\276\226\266\266\276\226\266\266\200\200\275\275!");
    }

    @Test
    public void test13829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13829");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}H\200\200}H\200\200}H\200\200}H\200\200!HHH!HHH!HHH!HHH}H\200\200}H\200\200}H\200\200}H\200\200!HHH!HHH!", "U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}U\200\200}U\200\200}U\200\200}U\200\200!UUU!UUU!UUU!UUU}U\200\200}U\200\200}U\200\200}U\200\200!UUU!UUU!" + "'", str2, "}U\200\200}U\200\200}U\200\200}U\200\200!UUU!UUU!UUU!UUU}U\200\200}U\200\200}U\200\200}U\200\200!UUU!UUU!");
    }

    @Test
    public void test13830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13830");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn!", "}L\200\200}L\200\200}L\200\200}L\200\200LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL}L\200\200}L\200\200}L\200\200}L\200\200LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``NNNNNNNN``NNNNNNNN``NNNNNNNN``NNNNNNNN``NNNNNNNN``NNNNNNNN``NNNNNNNN``NNNNNNNN!" + "'", str2, "``NNNNNNNN``NNNNNNNN``NNNNNNNN``NNNNNNNN``NNNNNNNN``NNNNNNNN``NNNNNNNN``NNNNNNNN!");
    }

    @Test
    public void test13831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13831");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!", "NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!" + "'", str2, "!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!");
    }

    @Test
    public void test13832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13832");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200UUUU\214UUUUUUUUUUUU\214UUUUUUUU}~\200\200}~\200\200UUUU\214UUUUUUUUUUUU\214UUUUUUUU}~\200\200}~\200\200UUUU\214UUUUUUUUUUUU\214UUUUUUUU}~\200\200}~\200\200UUUU\214UUUUUUUUUUUU\214\u0348\u0346\u0346!", "`}LVUULVUU`}LVUULVUU`}LVUULVUU`}LVUULVUU`}LVUULVUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200rrrr\214rrrrrrrrrrrr\214rrrrrrrr}~\200\200}~\200\200rrrr\214rrrrrrrrrrrr\214rrrrrrrr}~\200\200}~\200\200rrrr\214rrrrrrrrrrrr\214rrrrrrrr}~\200\200}~\200\200rrrr\214rrrrrrrrrrrr\214\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200rrrr\214rrrrrrrrrrrr\214rrrrrrrr}~\200\200}~\200\200rrrr\214rrrrrrrrrrrr\214rrrrrrrr}~\200\200}~\200\200rrrr\214rrrrrrrrrrrr\214rrrrrrrr}~\200\200}~\200\200rrrr\214rrrrrrrrrrrr\214\u0348\u0346\u0346!");
    }

    @Test
    public void test13833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13833");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnulleenullnulleenullnull\220nullnulleenullnullee\200}}`nullnulleenullnulleenullnull\220nullnulleenullnullee]]!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test13834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13834");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\215}\215\215\215}\215\215null]]]null]]]null]]]null]]]\215}\215\215\215}\215\215!", "!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259]]]\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259]]]\215}\215\215\215}\215\215!");
    }

    @Test
    public void test13835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13835");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!", "\220\220\216\216\220\220\216\216LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\220\220\216\216\220\220\216\216LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\220\220\216\216\220\220\216\216LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\220\220\216\216\220\220\216\216LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\220\220\216\216\220\220\216\216LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\220\220\216\216\220\220\216\216LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\220\220\216\216\220\220\216\216LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\220\220\216\216\220\220\216\216LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u017e\u017e\u0348\u017e\u017e\u0348\u0348\u0348\u0348\u0348\u017e\u017e\u0348\u017e\u017e\u0348\u0348\u0348\u0348\u0348\u017e\u017e\u0348\u017e\u017e\u0348\u0348\u0348\u0348\u0348\u017e\u017e\u0348\u017e\u017e\u0348\u0348\u0348\u0348\u0348\u017e\u017e\u0348\u017e\u017e\u0348\u0348\u0348\u0348\u0348\u017e\u017e\u0348\u017e\u017e\u0348\u0348\u0348\u0348\u0348\u017e\u017e\u0348\u017e\u017e\u0348\u0348\u0348\u0348\u0348\u017e\u017e\u0348\u017e\u017e\u0348\u0348\u0348\u0348~~!" + "'", str2, "\u0348\u017e\u017e\u0348\u017e\u017e\u0348\u0348\u0348\u0348\u0348\u017e\u017e\u0348\u017e\u017e\u0348\u0348\u0348\u0348\u0348\u017e\u017e\u0348\u017e\u017e\u0348\u0348\u0348\u0348\u0348\u017e\u017e\u0348\u017e\u017e\u0348\u0348\u0348\u0348\u0348\u017e\u017e\u0348\u017e\u017e\u0348\u0348\u0348\u0348\u0348\u017e\u017e\u0348\u017e\u017e\u0348\u0348\u0348\u0348\u0348\u017e\u017e\u0348\u017e\u017e\u0348\u0348\u0348\u0348\u0348\u017e\u017e\u0348\u017e\u017e\u0348\u0348\u0348\u0348~~!");
    }

    @Test
    public void test13836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13836");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!", "]!H!!!H!!!H!!!H!!!H!!]]!H!!!H!!]]!H!!!H!!]]!H!!!H!!]]]!H!!!H!!!H!!!H!!!H!!]]!H!!!H!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!" + "'", str2, "!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!");
    }

    @Test
    public void test13837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13837");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225!", "]!]]!]]!]]]]]]!]]]]]!]]!]]!]]]]]]!]]]]!!]!]]!]]!]]]]]]!]]]]]!]]!]]!]]]]]]!]]]]!!]!]]!]]!]]]]]]!]]]]]!]]!]]!]]]]]]!]]]]]!]]!]]!]]]]]]!]]]]]!]]!]]!]]]]]]!]]]]!!]!]]!]]!]]]]]]!]]]]]!]]!]]!]]]]]]!]]]]!!]!]]!]]!]]]]]]!]]]]]!]]!]]!]]]]]]!]]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]!]]]]!]!]]]]\225\225!]!]]]]!]!]]]]\225\225!]!]]]]!]!]]]]\225\225!]!]]]]!]!]]]]\225\225!]!]]]]!]!]]]]\225\225!]!]]]]!]!]]]]\225\225!]!]]]]!]!]]]]\225\225!]!]]]]!]!]]]]\225\225!" + "'", str2, "!]!]]]]!]!]]]]\225\225!]!]]]]!]!]]]]\225\225!]!]]]]!]!]]]]\225\225!]!]]]]!]!]]]]\225\225!]!]]]]!]!]]]]\225\225!]!]]]]!]!]]]]\225\225!]!]]]]!]!]]]]\225\225!]!]]]]!]!]]]]\225\225!");
    }

    @Test
    public void test13838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13838");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("^^^^]HHnullnull^^]HHnullnull^^]HHnullnull^^]HHnullnull^^^^^^]HHnullnull^^]HHnullnull^^!", "\230\230\225\225\230\230\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^^^^]nullnullnullnullnullnullnullnullnullnull^^]nullnullnullnullnullnullnullnullnullnull^^]nullnullnullnullnullnullnullnullnullnull^^]nullnullnullnullnullnullnullnullnullnull^^^^^^]nullnullnullnullnullnullnullnullnullnull^^]nullnullnullnullnullnullnullnullnullnull^^!" + "'", str2, "^^^^]nullnullnullnullnullnullnullnullnullnull^^]nullnullnullnullnullnullnullnullnullnull^^]nullnullnullnullnullnullnullnullnullnull^^]nullnullnullnullnullnullnullnullnullnull^^^^^^]nullnullnullnullnullnullnullnullnullnull^^]nullnullnullnullnullnullnullnullnullnull^^!");
    }

    @Test
    public void test13839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13839");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!``nullnull!", "!~LL!~LL!!!~LL!~LL!!!~LL!~LL!~LL!~LL!!!~LL!~LL!!!~LL!~LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!``nullnull\230\230nullnull\230\230!" + "'", str2, "!``nullnull\230\230nullnull\230\230!");
    }

    @Test
    public void test13840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13840");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!", "\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198!!!!" + "'", str2, "\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198!!!!");
    }

    @Test
    public void test13841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13841");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0348\u0348\u0348\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\u037e\u037e\u0348\u0346\u0346!", "``!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\u037e\u037e\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\u037e\u037e\u0348\u0346\u0346!");
    }

    @Test
    public void test13842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13842");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("}~\200\200}~\200\200\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be}~\200\200}~\200\200\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be!", "LNNNLNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull!" + "'", str2, "}~\200\200}~\200\200nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13843");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!", "\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\256\u01dc\u01df\u01dc\u01dc\254\254\256\u01dc\u01df\u01dc\u01dc\254\254!!\256\u01dc\u01df\u01dc\u01dc\254\254\256\u01dc\u01df\u01dc\u01dc\254\254!!\256\u01dc\u01df\u01dc\u01dc\254\254\256\u01dc\u01df\u01dc\u01dc\254\254!!\256\u01dc\u01df\u01dc\u01dc\254\254\256\u01dc\u01df\u01dc\u01dc\254\254!!\256\u01dc\u01df\u01dc\u01dc\254\254\256\u01dc\u01df\u01dc\u01dc\254\254!!\256\u01dc\u01df\u01dc\u01dc\254\254\256\u01dc\u01df\u01dc\u01dc\254\254!!\256\u01dc\u01df\u01dc\u01dc\254\254\256\u01dc\u01df\u01dc\u01dc\254\254!!\256\u01dc\u01df\u01dc\u01dc\254\254\256\u01dc\u01df\u01dc\u01dc\254\254!" + "'", str2, "!!\256\u01dc\u01df\u01dc\u01dc\254\254\256\u01dc\u01df\u01dc\u01dc\254\254!!\256\u01dc\u01df\u01dc\u01dc\254\254\256\u01dc\u01df\u01dc\u01dc\254\254!!\256\u01dc\u01df\u01dc\u01dc\254\254\256\u01dc\u01df\u01dc\u01dc\254\254!!\256\u01dc\u01df\u01dc\u01dc\254\254\256\u01dc\u01df\u01dc\u01dc\254\254!!\256\u01dc\u01df\u01dc\u01dc\254\254\256\u01dc\u01df\u01dc\u01dc\254\254!!\256\u01dc\u01df\u01dc\u01dc\254\254\256\u01dc\u01df\u01dc\u01dc\254\254!!\256\u01dc\u01df\u01dc\u01dc\254\254\256\u01dc\u01df\u01dc\u01dc\254\254!!\256\u01dc\u01df\u01dc\u01dc\254\254\256\u01dc\u01df\u01dc\u01dc\254\254!");
    }

    @Test
    public void test13844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13844");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!!!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!!!", "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~null\242\225\225null\242\225\225!~null\242\225\225null\242\225\225!~null\242\225\225null\242\225\225!~null\242\225\225null\242\225\225!~null\242\225\225null\242\225\225!~null\242\225\225null\242\225\225!~null\242\225\225null\242\225\225!~null\242\225\225null\242\225\225!!!~null\242\225\225null\242\225\225!~null\242\225\225null\242\225\225!~null\242\225\225null\242\225\225!~null\242\225\225null\242\225\225!~null\242\225\225null\242\225\225!~null\242\225\225null\242\225\225!~null\242\225\225null\242\225\225!~null\242\225\225null\242\225\225!!!" + "'", str2, "!~null\242\225\225null\242\225\225!~null\242\225\225null\242\225\225!~null\242\225\225null\242\225\225!~null\242\225\225null\242\225\225!~null\242\225\225null\242\225\225!~null\242\225\225null\242\225\225!~null\242\225\225null\242\225\225!~null\242\225\225null\242\225\225!!!~null\242\225\225null\242\225\225!~null\242\225\225null\242\225\225!~null\242\225\225null\242\225\225!~null\242\225\225null\242\225\225!~null\242\225\225null\242\225\225!~null\242\225\225null\242\225\225!~null\242\225\225null\242\225\225!~null\242\225\225null\242\225\225!!!");
    }

    @Test
    public void test13845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13845");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0nullnull!", "~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13846");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!", "\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!" + "'", str2, "\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!");
    }

    @Test
    public void test13847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13847");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NLUUNLUU!", "]`^^]`^^!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13848");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!\200}}`!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!!!!LL!!LL!!!!!!!LL!!LL!!!!!]]!", "\215}\215\215\215}\215\215]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]\215}\215\215\215}\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!!!!nullnull!!nullnull!!!!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!!!!nullnull!!nullnull!!!!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!!!!nullnull!!nullnull!!!!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!!!!nullnull!!nullnull!!!!!\200}}`!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!!!!nullnull!!nullnull!!!!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!!!!nullnull!!nullnull!!!!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!!!!nullnull!!nullnull!!!!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!!!!nullnull!!nullnull!!!!!]]!" + "'", str2, "!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!!!!nullnull!!nullnull!!!!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!!!!nullnull!!nullnull!!!!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!!!!nullnull!!nullnull!!!!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!!!!nullnull!!nullnull!!!!!\200}}`!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!!!!nullnull!!nullnull!!!!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!!!!nullnull!!nullnull!!!!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!!!!nullnull!!nullnull!!!!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!!!!nullnull!!nullnull!!!!!]]!");
    }

    @Test
    public void test13849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13849");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!!L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!!L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!!L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!!L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!", "\u0366\u0365\u0368\u0368\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!!N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!!N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!!N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!!N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!" + "'", str2, "N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!!N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!!N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!!N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!!N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!");
    }

    @Test
    public void test13850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13850");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\216\216\216!\216\216\216!", "`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\216\216\216!\216\216\216!" + "'", str2, "!\216\216\216!\216\216\216!");
    }

    @Test
    public void test13851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13851");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!\254\254!!\254\254!!!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!!!\254\254!!\254\254!", "\230\u01e0\u01e0\u01e0!\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0!!\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0!!\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0!!\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0!!\230\u01e0\u01e0\u01e0!\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0!!\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\254\254!!\254\254!!!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!!!\254\254!!\254\254!" + "'", str2, "!!\254\254!!\254\254!!!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!!!\254\254!!\254\254!");
    }

    @Test
    public void test13852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13852");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254]]\214\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\214\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254]]\214\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\214\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254!", "nullOOOoinullnull!!nullOOOoinullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254]]\214\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\214\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254]]\214\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\214\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254!" + "'", str2, "\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254]]\214\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\214\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254]]\214\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\214\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254!");
    }

    @Test
    public void test13853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13853");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275L!!\275L!!\275L!!\275L!!\275L!!\275L!!\275L!!\275L!!!", "]!\253\253]!\253\253!!]!\253\253]!\253\253!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275null!!\275null!!\275null!!\275null!!\275null!!\275null!!\275null!!\275null!!!" + "'", str2, "\275null!!\275null!!\275null!!\275null!!\275null!!\275null!!\275null!!\275null!!!");
    }

    @Test
    public void test13854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13854");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!", "NNLL~NNLLNNLLNNLL~NNLLNNLL!!NNLL~NNLLNNLLNNLL~NNLLNNLL!!NNLL~NNLLNNLLNNLL~NNLLNNLLNNLL~NNLLNNLLNNLL~NNLLNNLL!!NNLL~NNLLNNLLNNLL~NNLLNNLL!!NNLL~NNLLNNLLNNLL~NNLLNNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL!!\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL!!\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL!!\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL!!\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL!" + "'", str2, "\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL!!\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL!!\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL!!\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL!!\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL\216\216~LLL~LLL!");
    }

    @Test
    public void test13855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13855");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("null\225\223\223\275\275\275null\225\223\223\275\275\275!!null\225\223\223\275\275\275null\225\223\223\275\275\275!!null\225\223\223\275\275\275null\225\223\223\275\275\275null\225\223\223\275\275\275null\225\223\223\275\275\275!!null\225\223\223\275\275\275null\225\223\223\275\275\275!!null\225\223\223\275\275\275null\225\223\223\275\275\275!", "\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275!!nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275!!nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275!!nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275!!nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275!" + "'", str2, "nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275!!nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275!!nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275!!nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275!!nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275!");
    }

    @Test
    public void test13856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13856");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!~\200\327\330\332\332~~\200\327\330\332\332~~!~\200\327\330\332\332~~\200\327\330\332\332~~!!!~\200\327\330\332\332~~\200\327\330\332\332~~!~\200\327\330\332\332~~\200\327\330\332\332~~!!!~\200\327\330\332\332~~\200\327\330\332\332~~!~\200\327\330\332\332~~\200\327\330\332\332~~!~\200\327\330\332\332~~\200\327\330\332\332~~!~\200\327\330\332\332~~\200\327\330\332\332~~!!!~\200\327\330\332\332~~\200\327\330\332\332~~!~\200\327\330\332\332~~\200\327\330\332\332~~!!!~\200\327\330\332\332~~\200\327\330\332\332~~!~\200\327\330\332\332~~\200\327\330\332\332~~!", "nullFHHnullFHH!!nullFHHnullFHH!!nullFHHnullFHH!!nullFHHnullFHH!!nullFHHnullFHH!!nullFHHnullFHH!!nullFHHnullFHH!!nullFHHnullFHH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~\200\327nullnullnull~~\200\327nullnullnull~~!~\200\327nullnullnull~~\200\327nullnullnull~~!!!~\200\327nullnullnull~~\200\327nullnullnull~~!~\200\327nullnullnull~~\200\327nullnullnull~~!!!~\200\327nullnullnull~~\200\327nullnullnull~~!~\200\327nullnullnull~~\200\327nullnullnull~~!~\200\327nullnullnull~~\200\327nullnullnull~~!~\200\327nullnullnull~~\200\327nullnullnull~~!!!~\200\327nullnullnull~~\200\327nullnullnull~~!~\200\327nullnullnull~~\200\327nullnullnull~~!!!~\200\327nullnullnull~~\200\327nullnullnull~~!~\200\327nullnullnull~~\200\327nullnullnull~~!" + "'", str2, "!~\200\327nullnullnull~~\200\327nullnullnull~~!~\200\327nullnullnull~~\200\327nullnullnull~~!!!~\200\327nullnullnull~~\200\327nullnullnull~~!~\200\327nullnullnull~~\200\327nullnullnull~~!!!~\200\327nullnullnull~~\200\327nullnullnull~~!~\200\327nullnullnull~~\200\327nullnullnull~~!~\200\327nullnullnull~~\200\327nullnullnull~~!~\200\327nullnullnull~~\200\327nullnullnull~~!!!~\200\327nullnullnull~~\200\327nullnullnull~~!~\200\327nullnullnull~~\200\327nullnullnull~~!!!~\200\327nullnullnull~~\200\327nullnullnull~~!~\200\327nullnullnull~~\200\327nullnullnull~~!");
    }

    @Test
    public void test13857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13857");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!\276\u02eb\u02ebnullnullnull\276\u02eb\u02ebnullnullnull\276\u02eb\u02ebnullnullnull\276\u02eb\u02ebnullnullnull!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276\u02eb\u02ebnullnullnullnullnullnullnullnullnullnullnullnull\276\u02eb\u02ebnullnullnullnullnullnullnullnullnullnullnullnull\276\u02eb\u02ebnullnullnullnullnullnullnullnullnullnullnullnull\276\u02eb\u02ebnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!\276\u02eb\u02ebnullnullnullnullnullnullnullnullnullnullnullnull\276\u02eb\u02ebnullnullnullnullnullnullnullnullnullnullnullnull\276\u02eb\u02ebnullnullnullnullnullnullnullnullnullnullnullnull\276\u02eb\u02ebnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13858");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368N!!!N!!!\200\200\u0346\u0348\u0348!", "\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\353!!!\353!!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\353!!!\353!!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test13859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13859");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u029c\u029b\u029c\u029c\u029c\u029b\u029c\u029c\u029c\u029b\u029c\u029c\u029c\u029b\u029c\u029c\u029c\u029b\u029c\u029c\u029c\u029b\u029c\u029c!", "null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnull\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnull\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13860");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\253\253\253!\253\253\253!\253\253\253!\253\253\253\200}}`!\253\253\253!\253\253\253!\253\253\253!\253\253\253]]!", "HHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHH!!HHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHH!!HHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHH!!HHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHH!!HHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHHHHHHnullHHHHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\253\253!\253\253\253!\253\253\253!\253\253\253\200}}`!\253\253\253!\253\253\253!\253\253\253!\253\253\253]]!" + "'", str2, "!\253\253\253!\253\253\253!\253\253\253!\253\253\253\200}}`!\253\253\253!\253\253\253!\253\253\253!\253\253\253]]!");
    }

    @Test
    public void test13861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13861");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!", "\214!!!\214!!!\214!!!\214!!!!!!\214!!!\214!!!\214!!!\214!!!!!!\214!!!\214!!!\214!!!\214!!!!!!\214!!!\214!!!\214!!!\214!!!!!!\214!!!\214!!!\214!!!\214!!!!!!\214!!!\214!!!\214!!!\214!!!!!!\214!!!\214!!!\214!!!\214!!!!!!\214!!!\214!!!\214!!!\214!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!" + "'", str2, "]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!");
    }

    @Test
    public void test13862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13862");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13863");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUU!", "XXXX!!!XXXX!!!XXXX!!!XXXX!!!XXXX!!!XXXX!!!XXXX!!!XXXX!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!XXXX!!!!!!!!!!!!XXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!XXXX!!!!!!!!!!!!XXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!XXXX!!!!!!!!!!!!XXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!XXXX!!!!!!!!!!!!XXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!XXXX!!!!!!!!!!!!XXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!XXXX!!!!!!!!!!!!XXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!XXXX!!!!!!!!!!!!XXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!XXXX!!!!!!!!!!!!XXXX!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!XXXX!!!!!!!!!!!!XXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!XXXX!!!!!!!!!!!!XXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!XXXX!!!!!!!!!!!!XXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!XXXX!!!!!!!!!!!!XXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!XXXX!!!!!!!!!!!!XXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!XXXX!!!!!!!!!!!!XXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!XXXX!!!!!!!!!!!!XXXX!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!XXXX!!!!!!!!!!!!XXXX!!!!!!!!!");
    }

    @Test
    public void test13864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13864");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214!", "LNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214!" + "'", str2, "\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214!");
    }

    @Test
    public void test13865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13865");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``!", "U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``!" + "'", str2, "\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``!");
    }

    @Test
    public void test13866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13866");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276!!\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276!!\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276!!\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276!!\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276!", "xxxxxxxxxxxxxxxxnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullxxxxxxxxxxxxxxxxnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\226XXUUXXUU\236\276\276\230\226XXUUXXUU\236\276\276!!\230\226XXUUXXUU\236\276\276\230\226XXUUXXUU\236\276\276!!\230\226XXUUXXUU\236\276\276\230\226XXUUXXUU\236\276\276\230\226XXUUXXUU\236\276\276\230\226XXUUXXUU\236\276\276!!\230\226XXUUXXUU\236\276\276\230\226XXUUXXUU\236\276\276!!\230\226XXUUXXUU\236\276\276\230\226XXUUXXUU\236\276\276!" + "'", str2, "\230\226XXUUXXUU\236\276\276\230\226XXUUXXUU\236\276\276!!\230\226XXUUXXUU\236\276\276\230\226XXUUXXUU\236\276\276!!\230\226XXUUXXUU\236\276\276\230\226XXUUXXUU\236\276\276\230\226XXUUXXUU\236\276\276\230\226XXUUXXUU\236\276\276!!\230\226XXUUXXUU\236\276\276\230\226XXUUXXUU\236\276\276!!\230\226XXUUXXUU\236\276\276\230\226XXUUXXUU\236\276\276!");
    }

    @Test
    public void test13867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13867");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("fehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehh!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!!");
    }

    @Test
    public void test13868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13868");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU!", "\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0nullnullnullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU!" + "'", str2, "\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU!");
    }

    @Test
    public void test13869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13869");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\220\220\215\215\u0346\u0348\u0348!", "!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!\204\204!!!!!!!!\204\204!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!\204\204!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\220\220\215\215\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\220\220\215\215\u0346\u0348\u0348!");
    }

    @Test
    public void test13870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13870");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420!!!", "!\236\236\236\236\236\236\236\236\236\236\236\236\236\236\236\236!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\236null\236\236nullnullnullnullnullnull\236null\236\236nullnullnullnullnullnull!!\236null\236\236nullnullnullnullnullnull\236null\236\236nullnullnullnullnullnull!!\236null\236\236nullnullnullnullnullnull\236null\236\236nullnullnullnullnullnull!!\236null\236\236nullnullnullnullnullnull\236null\236\236nullnullnullnullnullnull!!\236null\236\236nullnullnullnullnullnull\236null\236\236nullnullnullnullnullnull!!\236null\236\236nullnullnullnullnullnull\236null\236\236nullnullnullnullnullnull!!\236null\236\236nullnullnullnullnullnull\236null\236\236nullnullnullnullnullnull!!\236null\236\236nullnullnullnullnullnull\236null\236\236nullnullnullnullnullnull!!!" + "'", str2, "\236null\236\236nullnullnullnullnullnull\236null\236\236nullnullnullnullnullnull!!\236null\236\236nullnullnullnullnullnull\236null\236\236nullnullnullnullnullnull!!\236null\236\236nullnullnullnullnullnull\236null\236\236nullnullnullnullnullnull!!\236null\236\236nullnullnullnullnullnull\236null\236\236nullnullnullnullnullnull!!\236null\236\236nullnullnullnullnullnull\236null\236\236nullnullnullnullnullnull!!\236null\236\236nullnullnullnullnullnull\236null\236\236nullnullnullnullnullnull!!\236null\236\236nullnullnullnullnullnull\236null\236\236nullnullnullnullnullnull!!\236null\236\236nullnullnullnullnullnull\236null\236\236nullnullnullnullnullnull!!!");
    }

    @Test
    public void test13871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13871");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0348\u0348\u0348\u0345\u0348\u0346\u0346!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test13872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13872");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("EHHHHEFFHEFFHEFFEHHHHEFFHEFFHEFFEHHHHEFFHEFFHEFFEHHHHEFFHEFFHEFFEHHHHEFFHEFFHEFFEHHHHEFFHEFFHEFFEHHHHEFFHEFFHEFFEHHHHEFFHEFFHEFF!", "\336\300\300\300\300\336\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13873");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!", "\275nmppnmppnmpp\275nmppnmppnmpp\275nmppnmppnmpp\275nmppnmppnmppnmppnmpp\275\275nmppnmpp\275\275nmppnmpp\275\275nmppnmpp\275\275\275nmppnmppnmpp\275nmppnmppnmpp\275nmppnmppnmpp\275nmppnmppnmppnmppnmpp\275\275nmppnmpp\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!" + "'", str2, "!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
    }

    @Test
    public void test13874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13874");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!", "\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW!!]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW!!]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW!!]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW!!]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW!" + "'", str2, "]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW!!]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW!!]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW!!]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW!!]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW!");
    }

    @Test
    public void test13875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13875");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!", "UNNN\200}}`UNNN]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullNNNnullNNNnullNNNnullNNNnullNNNnullNNNnullNNNnullNNNnullNNNnullNNNnullNNNnullNNNnullNNNnullNNN!" + "'", str2, "nullNNNnullNNNnullNNNnullNNNnullNNNnullNNNnullNNNnullNNNnullNNNnullNNNnullNNNnullNNNnullNNNnullNNN!");
    }

    @Test
    public void test13876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13876");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!", "UUXXUUXXXXUUXXUUXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test13877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13877");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13878");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!", "}~\200\200}~\200\200\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338}~\200\200}~\200\200\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!" + "'", str2, "````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!");
    }

    @Test
    public void test13879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13879");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u02cc\u02cc\u02cc\u02cc\u02cc\u02cc\u0346\u0348\u0348!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test13880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13880");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "\276\275\275\275\276\275\275\275\276\275\275\275\276\275\275\275\276\275\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13881");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!!", "!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test13882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13882");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e!", "````````````````\200}}`````````````````]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13883");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\276\300\266\266~\300\300\276\300\266\266~\300\300!!\276\300\266\266~\300\300\276\300\266\266~\300\300!!\276\300\266\266~\300\300\276\300\266\266~\300\300\276\300\266\266~\300\300\276\300\266\266~\300\300!!\276\300\266\266~\300\300\276\300\266\266~\300\300!!\276\300\266\266~\300\300\276\300\266\266~\300\300!", "L!LULLLULLL!LULLLULLL!LULLLULLL!LULLLULLL!LULLLULLL!LULLLULLL!LULLLULLL!LULLLULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!" + "'", str2, "\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!");
    }

    @Test
    public void test13884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13884");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!!!!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!!!!!!!!", "\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a\u034b\u034c\u034e\u034e\u0318\u031a\u031a!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1!!!!!!!!!!!" + "'", str2, "\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1\u01be\u01bf\u01c1\u01c1!!!!!!!!!!!");
    }

    @Test
    public void test13885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13885");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~nll\200~~~nll\200~~~nll~nll~nll\200~~~nll\200~~~nll~nll!!~nll\200~~~nll\200~~~nll~nll~nll\200~~~nll\200~~~nll~nll!!~nll\200~~~nll\200~~~nll~nll~nll\200~~~nll\200~~~nll~nll~nll\200~~~nll\200~~~nll~nll~nll\200~~~nll\200~~~nll~nll!!~nll\200~~~nll\200~~~nll~nll~nll\200~~~nll\200~~~nll~nll!!~nll\200~~~nll\200~~~nll~nll~nll\200~~~nll\200~~~nll~nll!", "nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u028b\u028e\u028e\200\u028b\u028e\u028e\200\u028b\u028e\u028e\u028b\u028e\u028e\u028b\u028e\u028e\200\u028b\u028e\u028e\200\u028b\u028e\u028e\u028b\u028e\u028e\u028b\u028e\u028e\200\u028b\u028e\u028e\200\u028b\u028e\u028e\u028b\u028e\u028e\u028b\u028e\u028e\200\u028b\u028e\u028e\200\u028b\u028e\u028e\u028b\u028e\u028e\u028b\u028e\u028e\200\u028b\u028e\u028e\200\u028b\u028e\u028e\u028b\u028e\u028e\u028b\u028e\u028e\200\u028b\u028e\u028e\200\u028b\u028e\u028e\u028b\u028e\u028e\u028b\u028e\u028e\200\u028b\u028e\u028e\200\u028b\u028e\u028e\u028b\u028e\u028e\u028b\u028e\u028e\200\u028b\u028e\u028e\200\u028b\u028e\u028e\u028b\u028e\u028e\u028b\u028e\u028e\200\u028b\u028e\u028e\200\u028b\u028e\u028e\u028b\u028e\u028e\u028b\u028e\u028e\200\u028b\u028e\u028e\200\u028b\u028e\u028e\u028b\u028e\u028e\u028b\u028e\u028e\200\u028b\u028e\u028e\200\u028b\u028e\u028e\u028b\u028e\u028e\u028b\u028e\u028e\200\u028b\u028e\u028e\200\u028b\u028e\u028e\u028b\u028e\u028e!" + "'", str2, "\u028b\u028e\u028e\200\u028b\u028e\u028e\200\u028b\u028e\u028e\u028b\u028e\u028e\u028b\u028e\u028e\200\u028b\u028e\u028e\200\u028b\u028e\u028e\u028b\u028e\u028e\u028b\u028e\u028e\200\u028b\u028e\u028e\200\u028b\u028e\u028e\u028b\u028e\u028e\u028b\u028e\u028e\200\u028b\u028e\u028e\200\u028b\u028e\u028e\u028b\u028e\u028e\u028b\u028e\u028e\200\u028b\u028e\u028e\200\u028b\u028e\u028e\u028b\u028e\u028e\u028b\u028e\u028e\200\u028b\u028e\u028e\200\u028b\u028e\u028e\u028b\u028e\u028e\u028b\u028e\u028e\200\u028b\u028e\u028e\200\u028b\u028e\u028e\u028b\u028e\u028e\u028b\u028e\u028e\200\u028b\u028e\u028e\200\u028b\u028e\u028e\u028b\u028e\u028e\u028b\u028e\u028e\200\u028b\u028e\u028e\200\u028b\u028e\u028e\u028b\u028e\u028e\u028b\u028e\u028e\200\u028b\u028e\u028e\200\u028b\u028e\u028e\u028b\u028e\u028e\u028b\u028e\u028e\200\u028b\u028e\u028e\200\u028b\u028e\u028e\u028b\u028e\u028e\u028b\u028e\u028e\200\u028b\u028e\u028e\200\u028b\u028e\u028e\u028b\u028e\u028e!");
    }

    @Test
    public void test13886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13886");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13887");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0108\u0108!!!", "\226\230LL\226\230LL\226\230LL\226\230LL]!]]]!]]]!]]\226\230LL\226\230LL\226\230LL\226\230LL]!]]]!]]]!]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnull!!!" + "'", str2, "!nullnull!!!");
    }

    @Test
    public void test13888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13888");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!", "NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!!!!!!!!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!" + "'", str2, "`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!");
    }

    @Test
    public void test13889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13889");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!", "null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!" + "'", str2, "\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!");
    }

    @Test
    public void test13890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13890");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!!", "``\253```\253```\200\200\253```\253```\200\200``\253```\253```\200\200\253```\253```\200\200``\253```\253```\200\200\253```\253```\200\200``\253```\253```\200\200\253```\253```\200\200``\253```\253```\200\200\253```\253```\200\200``\253```\253```\200\200\253```\253```\200\200``\253```\253```\200\200\253```\253```\200\200``\253```\253```\200\200\253```\253```\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!!" + "'", str2, "]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!!");
    }

    @Test
    public void test13891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13891");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!\216\216UN!!UN!!!", "!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!!" + "'", str2, "\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!\216\216RQ!!RQ!!!");
    }

    @Test
    public void test13892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13892");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!", "XW\275\275XW\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!" + "'", str2, "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!");
    }

    @Test
    public void test13893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13893");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13894");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\200}}`\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231]]!", "]\276!LL\276!LL!!\276!LL\276!LL!!\276!LL\276!LL!!\276!LL\276!LL!!\276!LL\276!LL!!]]\276!LL\276!LL!!\276!LL\276!LL!!]]\276!LL\276!LL!!\276!LL\276!LL!!]]\276!LL\276!LL!!\276!LL\276!LL!!]]]\276!LL\276!LL!!\276!LL\276!LL!!\276!LL\276!LL!!\276!LL\276!LL!!\276!LL\276!LL!!]]\276!LL\276!LL!!\276!LL\276!LL!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\200}}`\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231]]!" + "'", str2, "\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\200}}`\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231]]!");
    }

    @Test
    public void test13895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13895");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u02e8\u02e3\u02e3\u02e3\u02e8\u02e3\u02e3\u02e8\u02e3\u02e3\u02e8\u02e3\u02e3\u02e8\u02e3\u02e3\u02e8\u02e3\u02e3\u02e3\u02e8\u02e3\u02e3\u02e8\u02e3\u02e3!", "\275nmppnmppnmpp\275nmppnmppnmpp\275nmppnmppnmpp\275nmppnmppnmppnmppnmpp\275\275nmppnmpp\275\275nmppnmpp\275\275nmppnmpp\275\275\275nmppnmppnmpp\275nmppnmppnmpp\275nmppnmppnmpp\275nmppnmppnmppnmppnmpp\275\275nmppnmpp\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02e8\u02e8\u02e8\u02e8\u02e8\u02e8\u02e8\u02e8MNPPnullnull!" + "'", str2, "\u02e8\u02e8\u02e8\u02e8\u02e8\u02e8\u02e8\u02e8MNPPnullnull!");
    }

    @Test
    public void test13896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13896");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("``~``````~````!!``~``````~````!!``~``````~````!!``~``````~````!!``~``````~````!!``~``````~````!!``~``````~````!!``~``````~````!!!", "!\253\256\256\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``~``````~````!!``~``````~````!!``~``````~````!!``~``````~````!!``~``````~````!!``~``````~````!!``~``````~````!!``~``````~````!!!" + "'", str2, "``~``````~````!!``~``````~````!!``~``````~````!!``~``````~````!!``~``````~````!!``~``````~````!!``~``````~````!!``~``````~````!!!");
    }

    @Test
    public void test13897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13897");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\215}\215\215\215}\215\215\u026e\u026e\u026e\u026e\u026e\u026e\u026e\u026e\u026e\u026e\u026e\u026e\215}\215\215\215}\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test13898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13898");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!!!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!!!", "oprroprr!!oprroprr!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~r!pp!r!ppr!ppr!pp!r!ppr!pp!~r!pp!r!ppr!ppr!pp!r!ppr!pp!~r!pp!r!ppr!ppr!pp!r!ppr!pp!~r!pp!r!ppr!ppr!pp!r!ppr!pp!~r!pp!r!ppr!ppr!pp!r!ppr!pp!~r!pp!r!ppr!ppr!pp!r!ppr!pp!~r!pp!r!ppr!ppr!pp!r!ppr!pp!~r!pp!r!ppr!ppr!pp!r!ppr!pp!!!~r!pp!r!ppr!ppr!pp!r!ppr!pp!~r!pp!r!ppr!ppr!pp!r!ppr!pp!~r!pp!r!ppr!ppr!pp!r!ppr!pp!~r!pp!r!ppr!ppr!pp!r!ppr!pp!~r!pp!r!ppr!ppr!pp!r!ppr!pp!~r!pp!r!ppr!ppr!pp!r!ppr!pp!~r!pp!r!ppr!ppr!pp!r!ppr!pp!~r!pp!r!ppr!ppr!pp!r!ppr!pp!!!" + "'", str2, "!~r!pp!r!ppr!ppr!pp!r!ppr!pp!~r!pp!r!ppr!ppr!pp!r!ppr!pp!~r!pp!r!ppr!ppr!pp!r!ppr!pp!~r!pp!r!ppr!ppr!pp!r!ppr!pp!~r!pp!r!ppr!ppr!pp!r!ppr!pp!~r!pp!r!ppr!ppr!pp!r!ppr!pp!~r!pp!r!ppr!ppr!pp!r!ppr!pp!~r!pp!r!ppr!ppr!pp!r!ppr!pp!!!~r!pp!r!ppr!ppr!pp!r!ppr!pp!~r!pp!r!ppr!ppr!pp!r!ppr!pp!~r!pp!r!ppr!ppr!pp!r!ppr!pp!~r!pp!r!ppr!ppr!pp!r!ppr!pp!~r!pp!r!ppr!ppr!pp!r!ppr!pp!~r!pp!r!ppr!ppr!pp!r!ppr!pp!~r!pp!r!ppr!ppr!pp!r!ppr!pp!~r!pp!r!ppr!ppr!pp!r!ppr!pp!!!");
    }

    @Test
    public void test13899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13899");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NNLL\226\230\230NNLLNNLLNNLLNNLL\226\230\230NNLL\226\230\230NNLL\226\230\230NNLL\226\230\230NNLL\226\230\230NNLL\226\230\230NNLL\226\230\230NNLL\226\230\230NNLL\226\230\230NNLL\226\230\230NNLL\226\230\230NNLL\226\230\230NNLL\226\230\230NNLL\226\230\230NNLL\226\230\230NNLL\226\230\230NNLL\226\230\230NNLLNNLLNNLLNNLL\226\230\230NNLL\226\230\230NNLL\226\230\230NNLL\226\230\230NNLL\226\230\230NNLL\226\230\230NNLL\226\230\230NNLL\226\230\230!", "ULNNULNNULNNULNNULNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLNN\226\230\230LLNNLLNNLLNNLLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNNLLNNLLNNLLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230!" + "'", str2, "LLNN\226\230\230LLNNLLNNLLNNLLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNNLLNNLLNNLLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230LLNN\226\230\230!");
    }

    @Test
    public void test13900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13900");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126UUU!", "\215\216\230\230L!~~L!~~L!~~\215\216\230\230L!~~L!~~L!~~\215\216\230\230L!~~L!~~L!~~\215\216\230\230L!~~L!~~L!~~\215\216\230\230L!~~L!~~L!~~\215\216\230\230L!~~L!~~L!~~\215\216\230\230L!~~L!~~L!~~\215\216\230\230L!~~L!~~L!~~!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullLLLnullLLLnullLLLnullLLLnullLLLnullLLLnullLLLnullLLL!" + "'", str2, "nullLLLnullLLLnullLLLnullLLLnullLLLnullLLLnullLLLnullLLL!");
    }

    @Test
    public void test13901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13901");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\225\225\225\225\225\225\225\225!!\225\225\225\225\225\225\225\225!!\225\225\225\225\225\225\225\225\225\225\225\225\225\225\225\225!!\225\225\225\225\225\225\225\225!!\225\225\225\225\225\225\225\225!", "\253!LLL\260\260\253!LLL\260\260!!\253!LLL\260\260\253!LLL\260\260!!!!\253!LLL\260\260\253!LLL\260\260!!\253!LLL\260\260\253!LLL\260\260!!!!\253!LLL\260\260\253!LLL\260\260!!\253!LLL\260\260\253!LLL\260\260!!!!\253!LLL\260\260\253!LLL\260\260!!\253!LLL\260\260\253!LLL\260\260!!!!\253!LLL\260\260\253!LLL\260\260!!\253!LLL\260\260\253!LLL\260\260!!!!\253!LLL\260\260\253!LLL\260\260!!\253!LLL\260\260\253!LLL\260\260!!!!\253!LLL\260\260\253!LLL\260\260!!\253!LLL\260\260\253!LLL\260\260!!!!\253!LLL\260\260\253!LLL\260\260!!\253!LLL\260\260\253!LLL\260\260!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\225\225\225\225\225\225\225\225!!\225\225\225\225\225\225\225\225!!\225\225\225\225\225\225\225\225\225\225\225\225\225\225\225\225!!\225\225\225\225\225\225\225\225!!\225\225\225\225\225\225\225\225!" + "'", str2, "\225\225\225\225\225\225\225\225!!\225\225\225\225\225\225\225\225!!\225\225\225\225\225\225\225\225\225\225\225\225\225\225\225\225!!\225\225\225\225\225\225\225\225!!\225\225\225\225\225\225\225\225!");
    }

    @Test
    public void test13902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13902");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256}}\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256}}!", "TTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256}}\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256}}!" + "'", str2, "\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256}}\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256}}!");
    }

    @Test
    public void test13903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13903");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UUUUUUUUUUUUUUUUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUUUUUUUUUUUUUUUUUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!", "\275\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\276\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c!" + "'", str2, "\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c\u015c!");
    }

    @Test
    public void test13904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13904");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!!!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!!!", "~~!!NN\256\256NN\256\256NN\256\256NN\256\256~~~NN\256\256NN\256\256NN\256\256NN\256\256~~~NN\256\256NN\256\256NN\256\256NN\256\256~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!NN\256\256NN\256\256NN\256\256NN\256\256~~~NN\256\256NN\256\256NN\256\256NN\256\256~~~NN\256\256NN\256\256NN\256\256NN\256\256~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!!!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!!!" + "'", str2, "!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!!!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!!!");
    }

    @Test
    public void test13905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13905");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016dnullnullnullnullnullnullnullnull!", "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13906");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!", "!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
    }

    @Test
    public void test13907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13907");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!!", "nullnull!!``nullnull``nullnull``nullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!``nullnull``nullnull``nullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`\220~~`\220~~!!`\220~~`\220~~!!`\220~~`\220~~!!`\220~~`\220~~!!`\220~~`\220~~!!`\220~~`\220~~!!`\220~~`\220~~!!`\220~~`\220~~!!!" + "'", str2, "`\220~~`\220~~!!`\220~~`\220~~!!`\220~~`\220~~!!`\220~~`\220~~!!`\220~~`\220~~!!`\220~~`\220~~!!`\220~~`\220~~!!`\220~~`\220~~!!!");
    }

    @Test
    public void test13908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13908");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126!", "null!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13909");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\227!\227\227\227!\227\227\227!\227\227\227!\227\227\227!\227\227\227!\227\227\227!\227\227\227!\227\227\227!\227\227\227!\227\227\u0346\u0348\u0348!", "!\220!!!\220!!!!!\220!!!\220!!!!\225\225!\220!!!\220!!!!!\220!!!\220!!!!\225\225!\220!!!\220!!!!!\220!!!\220!!!!\225\225!\220!!!\220!!!!!\220!!!\220!!!!\225\225!\220!!!\220!!!!!\220!!!\220!!!!\225\225!\220!!!\220!!!!!\220!!!\220!!!!\225\225!\220!!!\220!!!!!\220!!!\220!!!!\225\225!\220!!!\220!!!!!\220!!!\220!!!!\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\227!\227\227\227!\227\227\227!\227\227\227!\227\227\227!\227\227\227!\227\227\227!\227\227\227!\227\227\227!\227\227\227!\227\227\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\227!\227\227\227!\227\227\227!\227\227\227!\227\227\227!\227\227\227!\227\227\227!\227\227\227!\227\227\227!\227\227\227!\227\227\u0346\u0348\u0348!");
    }

    @Test
    public void test13910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13910");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de!", "!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13911");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null]]]null]]]!", "\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\240\240\236\236]]]\240\240\236\236]]]!" + "'", str2, "\240\240\236\236]]]\240\240\236\236]]]!");
    }

    @Test
    public void test13912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13912");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010bnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u010a\u010a\u010a\u010a\u010a\u010a\u010a\u010a\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u010a\u010a\u010a\u010a\u010a\u010a\u010a\u010a\u0348\u0346\u0346!");
    }

    @Test
    public void test13913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13913");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!", "\275HHH\275HHH\275HHH\275HHH\275HHH\275HHH\275HHH\275HHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!!" + "'", str2, "HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!HH\275\275HH\275\275!!!");
    }

    @Test
    public void test13914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13914");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\253\254\256\256L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\253\254\256\256L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!", "\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\253\254\256\256\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!!" + "'", str2, "\253\254\256\256\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\253\254\256\256\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!!");
    }

    @Test
    public void test13915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13915");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!", "X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13916");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!LIJJLIJJ!!LIJJLIJJ!!LIJJLIJJ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LIJJLIJJ!!LIJJLIJJ!!LIJJLIJJ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230\200}}`nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test13917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13917");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("HL\226\226\275HL\226\226HL\226\226HL\226\226\275HL\226\226HL\226\226HL\226\226\275HL\226\226HL\226\226HL\226\226\275HL\226\226HL\226\226HL\226\226\275HL\226\226HL\226\226HL\226\226\275HL\226\226HL\226\226HL\226\226\275HL\226\226HL\226\226HL\226\226\275HL\226\226HL\226\226\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!HL\226\226\275HL\226\226HL\226\226HL\226\226\275HL\226\226HL\226\226HL\226\226\275HL\226\226HL\226\226HL\226\226\275HL\226\226HL\226\226HL\226\226\275HL\226\226HL\226\226HL\226\226\275HL\226\226HL\226\226HL\226\226\275HL\226\226HL\226\226HL\226\226\275HL\226\226HL\226\226\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!", "\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull\226\226\275nullnull\226\226nullnull\226\226nullnull\226\226\275nullnull\226\226nullnull\226\226nullnull\226\226\275nullnull\226\226nullnull\226\226nullnull\226\226\275nullnull\226\226nullnull\226\226nullnull\226\226\275nullnull\226\226nullnull\226\226nullnull\226\226\275nullnull\226\226nullnull\226\226nullnull\226\226\275nullnull\226\226nullnull\226\226nullnull\226\226\275nullnull\226\226nullnull\226\226\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!nullnull\226\226\275nullnull\226\226nullnull\226\226nullnull\226\226\275nullnull\226\226nullnull\226\226nullnull\226\226\275nullnull\226\226nullnull\226\226nullnull\226\226\275nullnull\226\226nullnull\226\226nullnull\226\226\275nullnull\226\226nullnull\226\226nullnull\226\226\275nullnull\226\226nullnull\226\226nullnull\226\226\275nullnull\226\226nullnull\226\226nullnull\226\226\275nullnull\226\226nullnull\226\226\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!" + "'", str2, "nullnull\226\226\275nullnull\226\226nullnull\226\226nullnull\226\226\275nullnull\226\226nullnull\226\226nullnull\226\226\275nullnull\226\226nullnull\226\226nullnull\226\226\275nullnull\226\226nullnull\226\226nullnull\226\226\275nullnull\226\226nullnull\226\226nullnull\226\226\275nullnull\226\226nullnull\226\226nullnull\226\226\275nullnull\226\226nullnull\226\226nullnull\226\226\275nullnull\226\226nullnull\226\226\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!nullnull\226\226\275nullnull\226\226nullnull\226\226nullnull\226\226\275nullnull\226\226nullnull\226\226nullnull\226\226\275nullnull\226\226nullnull\226\226nullnull\226\226\275nullnull\226\226nullnull\226\226nullnull\226\226\275nullnull\226\226nullnull\226\226nullnull\226\226\275nullnull\226\226nullnull\226\226nullnull\226\226\275nullnull\226\226nullnull\226\226nullnull\226\226\275nullnull\226\226nullnull\226\226\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!");
    }

    @Test
    public void test13918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13918");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!]]]!]!!!", "rrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPP!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]]]!]!!!" + "'", str2, "!]]]!]!!!");
    }

    @Test
    public void test13919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13919");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LL!!````````````LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!````````````LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!", "\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test13920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13920");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ\200}}`ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ]]!", "!!!R!LLR!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test13921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13921");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnull!!````````````nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!````````````nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!", "`\216\216!!\216\216!!\216\216!!`\216\216!!\216\216!!\216\216!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`````````````!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`````````````!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!" + "'", str2, "`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`````````````!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`````````````!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!");
    }

    @Test
    public void test13922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13922");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204\u0346\u0348\u0348!", "!~\275!\275\275\275!\275\275!~\275!\275\275\275!\275\275!~\275!\275\275\275!\275\275!~\275!\275\275\275!\275\275!~\275!\275\275\275!\275\275!~\275!\275\275\275!\275\275!~\275!\275\275\275!\275\275!~\275!\275\275\275!\275\275!!!~\275!\275\275\275!\275\275!~\275!\275\275\275!\275\275!~\275!\275\275\275!\275\275!~\275!\275\275\275!\275\275!~\275!\275\275\275!\275\275!~\275!\275\275\275!\275\275!~\275!\275\275\275!\275\275!~\275!\275\275\275!\275\275!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\275\275!!\275\275!!\204\204\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\204\204\275\275!!\275\275!!\275\275!!!!\275\275!!\275\275!!\204\204\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\204\204\275\275!!\275\275!!\275\275!!!!\275\275!!\275\275!!\204\204\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\204\204\275\275!!\275\275!!\275\275!!!!\275\275!!\275\275!!\204\204\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\204\204\275\275!!\275\275!!\275\275\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\275\275!!\275\275!!\204\204\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\204\204\275\275!!\275\275!!\275\275!!!!\275\275!!\275\275!!\204\204\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\204\204\275\275!!\275\275!!\275\275!!!!\275\275!!\275\275!!\204\204\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\204\204\275\275!!\275\275!!\275\275!!!!\275\275!!\275\275!!\204\204\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\204\204\275\275!!\275\275!!\275\275\u0346\u0348\u0348!");
    }

    @Test
    public void test13923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13923");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!!", "\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!!" + "'", str2, "nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!!");
    }

    @Test
    public void test13924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13924");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull\253\253nullnull\253\253!", "!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\u01fe\u01fenullnull\253\253\u01fe\u01fenullnull\253\253\u01fe\u01fenullnull\253\253\u01fe\u01fenullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\u01fe\u01fenullnull\253\253\u01fe\u01fenullnull\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\u01fe\u01fenullnull\253\253\u01fe\u01fenullnull\253\253\u01fe\u01fenullnull\253\253\u01fe\u01fenullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\u01fe\u01fenullnull\253\253\u01fe\u01fenullnull\253\253!");
    }

    @Test
    public void test13925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13925");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!!!NNNNNNNN!!NNNNNNNN!!!!NNNNNNNN!!NNNNNNNN!!!!NNNNNNNN!!NNNNNNNN!!!!NNNNNNNN!!NNNNNNNN!!!!NNNNNNNN!!NNNNNNNN!!!!NNNNNNNN!!NNNNNNNN!!!!NNNNNNNN!!NNNNNNNN!!!!NNNNNNNN!!NNNNNNNN!", "}\200\200\200}~\200\200}~\200\200}~\200\200}~\200\200}\200\200\200}~\200\200}~\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13926");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!", "NN!!NN!!!NNN!NNNNN!!NN!!!NNN!NNNNN!!NN!!!NNN!NNNNN!!NN!!!NNN!NNNNN!!NN!!!NNN!NNNNN!!NN!!!NNN!NNNNN!!NN!!!NNN!NNNNN!!NN!!!NNN!NNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!" + "'", str2, "!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!");
    }

    @Test
    public void test13927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13927");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test13928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13928");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!", "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200null\250\250\250\u0348\u0348\200null\250\250\250\u0348\u0348!!\200null\250\250\250\u0348\u0348\200null\250\250\250\u0348\u0348!!\200null\250\250\250\u0348\u0348\200null\250\250\250\u0348\u0348\200null\250\250\250\u0348\u0348\200null\250\250\250\u0348\u0348!!\200null\250\250\250\u0348\u0348\200null\250\250\250\u0348\u0348!!\200null\250\250\250\u0348\u0348\200null\250\250\250\u0348\u0348!" + "'", str2, "\200null\250\250\250\u0348\u0348\200null\250\250\250\u0348\u0348!!\200null\250\250\250\u0348\u0348\200null\250\250\250\u0348\u0348!!\200null\250\250\250\u0348\u0348\200null\250\250\250\u0348\u0348\200null\250\250\250\u0348\u0348\200null\250\250\250\u0348\u0348!!\200null\250\250\250\u0348\u0348\200null\250\250\250\u0348\u0348!!\200null\250\250\250\u0348\u0348\200null\250\250\250\u0348\u0348!");
    }

    @Test
    public void test13929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13929");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLUU!!!LLUU!!!LLUU!!!LLUU!!!LLUU!!!LLUU!!!LLUU!!!LLUU!!!!", "VV\275\275VV\275\275!!VV\275\275VV\275\275!!VV\275\275VV\275\275VV\275\275VV\275\275!!VV\275\275VV\275\275!!VV\275\275VV\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "VVVV!!!VVVV!!!VVVV!!!VVVV!!!VVVV!!!VVVV!!!VVVV!!!VVVV!!!!" + "'", str2, "VVVV!!!VVVV!!!VVVV!!!VVVV!!!VVVV!!!VVVV!!!VVVV!!!VVVV!!!!");
    }

    @Test
    public void test13930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13930");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!~LUNNLUNN!!!!~LUNNLUNN!!!!!!~LUNNLUNN!!!!~LUNNLUNN!!!!!!~LUNNLUNN!!!!~LUNNLUNN!!!!~LUNNLUNN!!!!~LUNNLUNN!!!!!!~LUNNLUNN!!!!~LUNNLUNN!!!!!!~LUNNLUNN!!!!~LUNNLUNN!!!", "U!!!U!!!\254\254U!!!U!!!\254\254]]U!!!U!!!\254\254U!!!U!!!\254\254]]\214U!!!U!!!\254\254U!!!U!!!\254\254U!!!U!!!\254\254\214U!!!U!!!\254\254U!!!U!!!\254\254U!!!U!!!\254\254U!!!U!!!\254\254U!!!U!!!\254\254]]U!!!U!!!\254\254U!!!U!!!\254\254]]\214U!!!U!!!\254\254U!!!U!!!\254\254U!!!U!!!\254\254\214U!!!U!!!\254\254U!!!U!!!\254\254U!!!U!!!\254\254!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u010f\u010f\u010f\u010f\u010f\u010f\u010f\u010f\u010f\u010f\u010f\u010f\u010f\u010f\u010f\u010f\u010f\u010f\u010f\u010f\u010f\u010f\u010f\u010fnullnull!!!" + "'", str2, "\u010f\u010f\u010f\u010f\u010f\u010f\u010f\u010f\u010f\u010f\u010f\u010f\u010f\u010f\u010f\u010f\u010f\u010f\u010f\u010f\u010f\u010f\u010f\u010fnullnull!!!");
    }

    @Test
    public void test13931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13931");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!!!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!~null\300\300\300\300nullnullnull\300\300\300\300nullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348UN\300\300UN\300\300UN\300\300UN\300\300UN\300\300UN\300\300UN\300\300UN\300\300LL!!LL!!UN\300\300UN\300\300UN\300\300UN\300\300UN\300\300UN\300\300UN\300\300UN\300\300LL!!LL!!UN\300\300UN\300\300UN\300\300UN\300\300UN\300\300UN\300\300UN\300\300UN\300\300LL!!LL!!UN\300\300UN\300\300UN\300\300UN\300\300UN\300\300UN\300\300UN\300\300UN\300\300\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348UN\300\300UN\300\300UN\300\300UN\300\300UN\300\300UN\300\300UN\300\300UN\300\300LL!!LL!!UN\300\300UN\300\300UN\300\300UN\300\300UN\300\300UN\300\300UN\300\300UN\300\300LL!!LL!!UN\300\300UN\300\300UN\300\300UN\300\300UN\300\300UN\300\300UN\300\300UN\300\300LL!!LL!!UN\300\300UN\300\300UN\300\300UN\300\300UN\300\300UN\300\300UN\300\300UN\300\300\u0348\u0346\u0346!");
    }

    @Test
    public void test13932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13932");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "!!!LL!!!!!LL!!!!LL!!LL!!!LL!!!!!LL!!!!LL!!LL!!!!!LL!!!!!LL!!!!LL!!LL!!!LL!!!!!LL!!!!LL!!LL!!!!!LL!!!!!LL!!!!LL!!LL!!!LL!!!!!LL!!!!LL!!LL!!!LL!!!!!LL!!!!LL!!LL!!!LL!!!!!LL!!!!LL!!LL!!!!!LL!!!!!LL!!!!LL!!LL!!!LL!!!!!LL!!!!LL!!LL!!!!!LL!!!!!LL!!!!LL!!LL!!!LL!!!!!LL!!!!LL!!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13933");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!!", "!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test13934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13934");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null\254\256\256null\254\256\256nullnullnullnullnullnullnullnullnull\254\256\256null\254\256\256nullnullnullnullnullnullnullnullnull\254\256\256null\254\256\256nullnullnullnullnullnullnullnullnull\254\256\256null\254\256\256nullnullnullnullnullnullnullnullnull\254\256\256null\254\256\256nullnullnullnullnullnullnullnullnull\254\256\256null\254\256\256nullnullnullnullnullnullnullnullnull\254\256\256null\254\256\256nullnullnullnullnullnullnullnullnull\254\256\256null\254\256\256nullnullnullnullnullnullnullnull!", "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNLL\254\256\256LNLL\254\256\256LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL\254\256\256LNLL\254\256\256LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL\254\256\256LNLL\254\256\256LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL\254\256\256LNLL\254\256\256LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL\254\256\256LNLL\254\256\256LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL\254\256\256LNLL\254\256\256LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL\254\256\256LNLL\254\256\256LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL\254\256\256LNLL\254\256\256LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL!" + "'", str2, "LNLL\254\256\256LNLL\254\256\256LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL\254\256\256LNLL\254\256\256LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL\254\256\256LNLL\254\256\256LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL\254\256\256LNLL\254\256\256LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL\254\256\256LNLL\254\256\256LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL\254\256\256LNLL\254\256\256LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL\254\256\256LNLL\254\256\256LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL\254\256\256LNLL\254\256\256LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL!");
    }

    @Test
    public void test13935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13935");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\220\220nullnull\253\253\253\200}}`\220\220nullnull\253\253\253]]!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220nullnullnullnullnullnullnullnull\253\253\253\200}}`\220\220nullnullnullnullnullnullnullnull\253\253\253]]!" + "'", str2, "\220\220nullnullnullnullnullnullnullnull\253\253\253\200}}`\220\220nullnullnullnullnullnullnullnull\253\253\253]]!");
    }

    @Test
    public void test13936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13936");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200!", "\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200!" + "'", str2, "}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200!");
    }

    @Test
    public void test13937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13937");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test13938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13938");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13939");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull!", "\253\254\256\256\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\253\254\256\256\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!\336!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull!" + "'", str2, "}~\200\200}~\200\200nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13940");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("}unll!!!\200\200}unll!!!\200\200}unll!!!\200\200}unll!!!\200\200unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~}unll!!!\200\200}unll!!!\200\200}unll!!!\200\200}unll!!!\200\200unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~!", "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02b0\u02af\u02b2\u02b2!!!\200\200\u02b0\u02af\u02b2\u02b2!!!\200\200\u02b0\u02af\u02b2\u02b2!!!\200\200\u02b0\u02af\u02b2\u02b2!!!\200\200\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2!!!\200\200\u02b0\u02af\u02b2\u02b2!!!\200\200\u02b0\u02af\u02b2\u02b2!!!\200\200\u02b0\u02af\u02b2\u02b2!!!\200\200\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2!~~!" + "'", str2, "\u02b0\u02af\u02b2\u02b2!!!\200\200\u02b0\u02af\u02b2\u02b2!!!\200\200\u02b0\u02af\u02b2\u02b2!!!\200\200\u02b0\u02af\u02b2\u02b2!!!\200\200\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2!!!\200\200\u02b0\u02af\u02b2\u02b2!!!\200\200\u02b0\u02af\u02b2\u02b2!!!\200\200\u02b0\u02af\u02b2\u02b2!!!\200\200\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2\u02b0\u02af\u02b2\u02b2!~~!");
    }

    @Test
    public void test13941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13941");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "!\275\275\275!!\275\275\275!\275\275\275!\275\275\275!!\275\275\275!\275\275\275!!!\275\275\275!!\275\275\275!\275\275\275!\275\275\275!!\275\275\275!\275\275\275!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13942");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!", "LULLLULL\200\200LULLLULL\200\200LULLLULL\200\200LULLLULL\200\200LULLLULL\200\200LULLLULL\200\200LULLLULL\200\200LULLLULL\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214!" + "'", str2, "\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214\216\216\214\214!");
    }

    @Test
    public void test13943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13943");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("}UN``UN``UN``~}}^}UN``UN``UN``]]!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0127\u0126\u0127\u0126\u0127\u0126\u0127\u0126\u0127\u0126\u0127\u0126``]]!" + "'", str2, "\u0127\u0126\u0127\u0126\u0127\u0126\u0127\u0126\u0127\u0126\u0127\u0126``]]!");
    }

    @Test
    public void test13944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13944");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("}~\200\200}~\200\200!U!!!!!^!U!!!!!!U!!!!!!U!!!!!^!U!!!!!!U!!!!!}~\200\200}~\200\200!U!!!!!^!U!!!!!!U!!!!!!U!!!!!^!U!!!!!!U!!!!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200!null!!!!!^!null!!!!!!null!!!!!!null!!!!!^!null!!!!!!null!!!!!}~\200\200}~\200\200!null!!!!!^!null!!!!!!null!!!!!!null!!!!!^!null!!!!!!null!!!!!!" + "'", str2, "}~\200\200}~\200\200!null!!!!!^!null!!!!!!null!!!!!!null!!!!!^!null!!!!!!null!!!!!}~\200\200}~\200\200!null!!!!!^!null!!!!!!null!!!!!!null!!!!!^!null!!!!!!null!!!!!!");
    }

    @Test
    public void test13945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13945");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UNLLUNLL!!UNLLUNLL!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\340\337\342\342\340\337\342\342!!\340\337\342\342\340\337\342\342!!!" + "'", str2, "\340\337\342\342\340\337\342\342!!\340\337\342\342\340\337\342\342!!!");
    }

    @Test
    public void test13946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13946");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\335\340\u0346\u0348\u0348!", "\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010dnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test13947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13947");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("EEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEE!", "\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d!" + "'", str2, "\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d\u025d!");
    }

    @Test
    public void test13948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13948");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0170null!", "!``NNUUNNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnull!!!" + "'", str2, "nullnullnull!!!");
    }

    @Test
    public void test13949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13949");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!\200\200\u0346\u0348\u0348!", "\255\256\260\260\236\276\276\255\256\260\260\236\276\276!!\255\256\260\260\236\276\276\255\256\260\260\236\276\276!!\255\256\260\260\236\276\276\255\256\260\260\236\276\276\255\256\260\260\236\276\276\255\256\260\260\236\276\276!!\255\256\260\260\236\276\276\255\256\260\260\236\276\276!!\255\256\260\260\236\276\276\255\256\260\260\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!\276\276\236\236\276\276\236\236\276\276\236\236!\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236!\276\276\236\236\276\276\236\236\276\276\236\236!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!\276\276\236\236\276\276\236\236\276\276\236\236!\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236!\276\276\236\236\276\276\236\236\276\276\236\236!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test13950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13950");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\200\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7]]!", "EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HHEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HHEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HHEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HHEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HHEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HHEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HHEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HH!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull\200}}`!nullnullnull!nullnullnull!nullnullnull!nullnullnull]]!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull\200}}`!nullnullnull!nullnullnull!nullnullnull!nullnullnull]]!");
    }

    @Test
    public void test13951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13951");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!", "u\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluu!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\u014e\u014e\u014e\u0348\u0348\253\u014e\u014e\u014e\u0348\u0348!!\253\u014e\u014e\u014e\u0348\u0348\253\u014e\u014e\u014e\u0348\u0348!!\253\u014e\u014e\u014e\u0348\u0348\253\u014e\u014e\u014e\u0348\u0348\253\u014e\u014e\u014e\u0348\u0348\253\u014e\u014e\u014e\u0348\u0348!!\253\u014e\u014e\u014e\u0348\u0348\253\u014e\u014e\u014e\u0348\u0348!!\253\u014e\u014e\u014e\u0348\u0348\253\u014e\u014e\u014e\u0348\u0348!" + "'", str2, "\253\u014e\u014e\u014e\u0348\u0348\253\u014e\u014e\u014e\u0348\u0348!!\253\u014e\u014e\u014e\u0348\u0348\253\u014e\u014e\u014e\u0348\u0348!!\253\u014e\u014e\u014e\u0348\u0348\253\u014e\u014e\u014e\u0348\u0348\253\u014e\u014e\u014e\u0348\u0348\253\u014e\u014e\u014e\u0348\u0348!!\253\u014e\u014e\u014e\u0348\u0348\253\u014e\u014e\u014e\u0348\u0348!!\253\u014e\u014e\u014e\u0348\u0348\253\u014e\u014e\u014e\u0348\u0348!");
    }

    @Test
    public void test13952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13952");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UUUUUUUU\253\253UUUUUUUU\253\253UUUUUUUU\253\253UUUUUUUU\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UUUUUUUU\253\253UUUUUUUU\253\253!", "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253NNNNNNNN\253\253NNNNNNNN\253\253NNNNNNNN\253\253NNNNNNNN\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253NNNNNNNN\253\253NNNNNNNN\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253NNNNNNNN\253\253NNNNNNNN\253\253NNNNNNNN\253\253NNNNNNNN\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253NNNNNNNN\253\253NNNNNNNN\253\253!");
    }

    @Test
    public void test13953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13953");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!" + "'", str2, "!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!");
    }

    @Test
    public void test13954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13954");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("llllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLL!", "`nullnullnull`nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "llllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLL!" + "'", str2, "llllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLL!");
    }

    @Test
    public void test13955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13955");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~}\200\200~}\200\200NNNNNNNN~}\200\200~}\200\200NNNNNNNN~}\200\200~}\200\200NNNNNNNN~}\200\200~}\200\200NNNNNNNN~}\200\200~}\200\200NNNNNNNN~}\200\200~}\200\200NNNNNNNN~}\200\200~}\200\200NNNNNNNN~}\200\200~}\200\200NNNNNNNN!", "\200!LLL!LLL!!\220\220\200!LLL!LLL!!\220\220\200!LLL!LLL!!\220\220\200!LLL!LLL!!\220\220\200!LLL!LLL!!\220\220\200!LLL!LLL!!\220\220\200!LLL!LLL!!\220\220\200!LLL!LLL!!\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull!" + "'", str2, "~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13956");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!!\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a!\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a!\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a!\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a!!!!!\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a!\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a!", "\275```\275```\275```\275`````\275\275``\275\275``\275\275``\275\275\275```\275```\275```\275`````\275\275``\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a!" + "'", str2, "\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a!");
    }

    @Test
    public void test13957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13957");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~}\200\200~}\200\200\u019e\u019e\u019f\u019f\u019e\u019e\u019f\u019f~}\200\200~}\200\200\u019e\u019e\u019f\u019f\u019e\u019e\u019f\u019f~}\200\200~}\200\200\u019e\u019e\u019f\u019f\u019e\u019e\u019f\u019f~}\200\200~}\200\200\u019e\u019e\u019f\u019f\u019e\u019e\u019f\u019f~}\200\200~}\200\200\u019e\u019e\u019f\u019f\u019e\u019e\u019f\u019f~}\200\200~}\200\200\u019e\u019e\u019f\u019f\u019e\u019e\u019f\u019f~}\200\200~}\200\200\u019e\u019e\u019f\u019f\u019e\u019e\u019f\u019f~}\200\200~}\200\200\u019e\u019e\u019f\u019f\u019e\u019e\u019f\u019f!", "LLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUU!!LLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUU!!LLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUU!!LLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUU!!LLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200UNLLLUNLLUNLLUNLLLUNLLUNLLUUUNLLLUNLLUNLLUNLLLUNLLUNLLUU~}\200\200~}\200\200UNLLLUNLLUNLLUNLLLUNLLUNLLUUUNLLLUNLLUNLLUNLLLUNLLUNLLUU~}\200\200~}\200\200UNLLLUNLLUNLLUNLLLUNLLUNLLUUUNLLLUNLLUNLLUNLLLUNLLUNLLUU~}\200\200~}\200\200UNLLLUNLLUNLLUNLLLUNLLUNLLUUUNLLLUNLLUNLLUNLLLUNLLUNLLUU~}\200\200~}\200\200UNLLLUNLLUNLLUNLLLUNLLUNLLUUUNLLLUNLLUNLLUNLLLUNLLUNLLUU~}\200\200~}\200\200UNLLLUNLLUNLLUNLLLUNLLUNLLUUUNLLLUNLLUNLLUNLLLUNLLUNLLUU~}\200\200~}\200\200UNLLLUNLLUNLLUNLLLUNLLUNLLUUUNLLLUNLLUNLLUNLLLUNLLUNLLUU~}\200\200~}\200\200UNLLLUNLLUNLLUNLLLUNLLUNLLUUUNLLLUNLLUNLLUNLLLUNLLUNLLUU!" + "'", str2, "~}\200\200~}\200\200UNLLLUNLLUNLLUNLLLUNLLUNLLUUUNLLLUNLLUNLLUNLLLUNLLUNLLUU~}\200\200~}\200\200UNLLLUNLLUNLLUNLLLUNLLUNLLUUUNLLLUNLLUNLLUNLLLUNLLUNLLUU~}\200\200~}\200\200UNLLLUNLLUNLLUNLLLUNLLUNLLUUUNLLLUNLLUNLLUNLLLUNLLUNLLUU~}\200\200~}\200\200UNLLLUNLLUNLLUNLLLUNLLUNLLUUUNLLLUNLLUNLLUNLLLUNLLUNLLUU~}\200\200~}\200\200UNLLLUNLLUNLLUNLLLUNLLUNLLUUUNLLLUNLLUNLLUNLLLUNLLUNLLUU~}\200\200~}\200\200UNLLLUNLLUNLLUNLLLUNLLUNLLUUUNLLLUNLLUNLLUNLLLUNLLUNLLUU~}\200\200~}\200\200UNLLLUNLLUNLLUNLLLUNLLUNLLUUUNLLLUNLLUNLLUNLLLUNLLUNLLUU~}\200\200~}\200\200UNLLLUNLLUNLLUNLLLUNLLUNLLUUUNLLLUNLLUNLLUNLLLUNLLUNLLUU!");
    }

    @Test
    public void test13958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13958");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\215\216\230\230null!~~null!~~null!~~\215\216\230\230null!~~null!~~null!~~\215\216\230\230null!~~null!~~null!~~\215\216\230\230null!~~null!~~null!~~\215\216\230\230null!~~null!~~null!~~\215\216\230\230null!~~null!~~null!~~\215\216\230\230null!~~null!~~null!~~\215\216\230\230null!~~null!~~null!~~!", "LLLLLLLLLLLLLLLLLLLLLLLL\204\204LLLLLLLL\204\204LLLLLLLL\204\204LLLLLLLL\204\204LLLLLLLLLLLLLLLLLLLLLLLL\204\204LLLLLLLL\204\204!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230\204LLL!~~\204LLL!~~\204LLL!~~\215\216\230\230\204LLL!~~\204LLL!~~\204LLL!~~\215\216\230\230\204LLL!~~\204LLL!~~\204LLL!~~\215\216\230\230\204LLL!~~\204LLL!~~\204LLL!~~\215\216\230\230\204LLL!~~\204LLL!~~\204LLL!~~\215\216\230\230\204LLL!~~\204LLL!~~\204LLL!~~\215\216\230\230\204LLL!~~\204LLL!~~\204LLL!~~\215\216\230\230\204LLL!~~\204LLL!~~\204LLL!~~!" + "'", str2, "\215\216\230\230\204LLL!~~\204LLL!~~\204LLL!~~\215\216\230\230\204LLL!~~\204LLL!~~\204LLL!~~\215\216\230\230\204LLL!~~\204LLL!~~\204LLL!~~\215\216\230\230\204LLL!~~\204LLL!~~\204LLL!~~\215\216\230\230\204LLL!~~\204LLL!~~\204LLL!~~\215\216\230\230\204LLL!~~\204LLL!~~\204LLL!~~\215\216\230\230\204LLL!~~\204LLL!~~\204LLL!~~\215\216\230\230\204LLL!~~\204LLL!~~\204LLL!~~!");
    }

    @Test
    public void test13959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13959");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264!!!", "U]^^nullnullnullU]^^nullnullnullU]^^nullnullnullU]^^nullnullnull\253\253\253\200}}`U]^^nullnullnullU]^^nullnullnullU]^^nullnullnullU]^^nullnullnull\253\253\253]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\344\345\347\347\344\345\347\347nullnull!\344\345\347\347\344\345\347\347nullnull\344\345\347\347\344\345\347\347nullnull\344\345\347\347\344\345\347\347nullnull\344\345\347\347\344\345\347\347nullnull!!\344\345\347\347\344\345\347\347nullnull\344\345\347\347\344\345\347\347nullnull!!\344\345\347\347\344\345\347\347nullnull\344\345\347\347\344\345\347\347nullnull!!\344\345\347\347\344\345\347\347nullnull\344\345\347\347\344\345\347\347nullnull!!\344\345\347\347\344\345\347\347nullnull!\344\345\347\347\344\345\347\347nullnull\344\345\347\347\344\345\347\347nullnull\344\345\347\347\344\345\347\347nullnull\344\345\347\347\344\345\347\347nullnull!!\344\345\347\347\344\345\347\347nullnull\344\345\347\347\344\345\347\347nullnull!!!" + "'", str2, "\344\345\347\347\344\345\347\347nullnull!\344\345\347\347\344\345\347\347nullnull\344\345\347\347\344\345\347\347nullnull\344\345\347\347\344\345\347\347nullnull\344\345\347\347\344\345\347\347nullnull!!\344\345\347\347\344\345\347\347nullnull\344\345\347\347\344\345\347\347nullnull!!\344\345\347\347\344\345\347\347nullnull\344\345\347\347\344\345\347\347nullnull!!\344\345\347\347\344\345\347\347nullnull\344\345\347\347\344\345\347\347nullnull!!\344\345\347\347\344\345\347\347nullnull!\344\345\347\347\344\345\347\347nullnull\344\345\347\347\344\345\347\347nullnull\344\345\347\347\344\345\347\347nullnull\344\345\347\347\344\345\347\347nullnull!!\344\345\347\347\344\345\347\347nullnull\344\345\347\347\344\345\347\347nullnull!!!");
    }

    @Test
    public void test13960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13960");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!", "UUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!" + "'", str2, "!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!");
    }

    @Test
    public void test13961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13961");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!!", "\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!!" + "'", str2, "nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!!");
    }

    @Test
    public void test13962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13962");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!", "\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253!!\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253!!\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253!!\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253!!\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253!!\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253!!\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253!!\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253!!!" + "'", str2, "\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253!!\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253!!\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253!!\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253!!\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253!!\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253!!\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253!!\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253\256~\253\253!!!");
    }

    @Test
    public void test13963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13963");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!!\230nullnullnull\230nullnullnull\230nullnullnull!\230nullnullnull\230nullnullnull\230nullnullnull!\230nullnullnull\230nullnullnull\230nullnullnull!\230nullnullnull\230nullnullnull\230nullnullnull!!!!!\230nullnullnull\230nullnullnull\230nullnullnull!\230nullnullnull\230nullnullnull\230nullnullnull!", "!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!\230}}}}}}}}}}}}\230}}}}}}}}}}}}\230}}}}}}}}}}}}!\230}}}}}}}}}}}}\230}}}}}}}}}}}}\230}}}}}}}}}}}}!\230}}}}}}}}}}}}\230}}}}}}}}}}}}\230}}}}}}}}}}}}!\230}}}}}}}}}}}}\230}}}}}}}}}}}}\230}}}}}}}}}}}}!!!!!\230}}}}}}}}}}}}\230}}}}}}}}}}}}\230}}}}}}}}}}}}!\230}}}}}}}}}}}}\230}}}}}}}}}}}}\230}}}}}}}}}}}}!" + "'", str2, "!!!!!\230}}}}}}}}}}}}\230}}}}}}}}}}}}\230}}}}}}}}}}}}!\230}}}}}}}}}}}}\230}}}}}}}}}}}}\230}}}}}}}}}}}}!\230}}}}}}}}}}}}\230}}}}}}}}}}}}\230}}}}}}}}}}}}!\230}}}}}}}}}}}}\230}}}}}}}}}}}}\230}}}}}}}}}}}}!!!!!\230}}}}}}}}}}}}\230}}}}}}}}}}}}\230}}}}}}}}}}}}!\230}}}}}}}}}}}}\230}}}}}}}}}}}}\230}}}}}}}}}}}}!");
    }

    @Test
    public void test13964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13964");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0!", "nullnullnullffnullnullffnullnullffnullnullnullffnullnullffnullnullffnullnullnullffnullnullffnullnullffnullnullnullffnullnullffnullnullff\200}}`nullnullnullffnullnullffnullnullffnullnullnullffnullnullffnullnullffnullnullnullffnullnullffnullnullffnullnullnullffnullnullffnullnullff]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172nullnull!" + "'", str2, "\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172\u016f\u0170\u0172\u0172nullnull!");
    }

    @Test
    public void test13965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13965");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!" + "'", str2, "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!");
    }

    @Test
    public void test13966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13966");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225!", "\336\300\300\336\336\300\300\336\336\300\300\336\336\336\300\300\336\336\300\300\336\336\300\300\336\336\336\300\300\336\336\300\300\336\336\300\300\336\336\336\300\300\336\336\300\300\336\336\300\300\336\336\200}}`\336\300\300\336\336\300\300\336\336\300\300\336\336\336\300\300\336\336\300\300\336\336\300\300\336\336\336\300\300\336\336\300\300\336\336\300\300\336\336\336\300\300\336\336\300\300\336\336\300\300\336\336]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\336\336\336\336\336\336\336\336\336\336\336\336\336\336\225\225\336\336\336\336\336\336\336\336\336\336\336\336\336\336\225\225\336\336\336\336\336\336\336\336\336\336\336\336\336\336\225\225\336\336\336\336\336\336\336\336\336\336\336\336\336\336\225\225\336\336\336\336\336\336\336\336\336\336\336\336\336\336\225\225\336\336\336\336\336\336\336\336\336\336\336\336\336\336\225\225\336\336\336\336\336\336\336\336\336\336\336\336\336\336\225\225\336\336\336\336\336\336\336\336\336\336\336\336\336\336\225\225!" + "'", str2, "\336\336\336\336\336\336\336\336\336\336\336\336\336\336\225\225\336\336\336\336\336\336\336\336\336\336\336\336\336\336\225\225\336\336\336\336\336\336\336\336\336\336\336\336\336\336\225\225\336\336\336\336\336\336\336\336\336\336\336\336\336\336\225\225\336\336\336\336\336\336\336\336\336\336\336\336\336\336\225\225\336\336\336\336\336\336\336\336\336\336\336\336\336\336\225\225\336\336\336\336\336\336\336\336\336\336\336\336\336\336\225\225\336\336\336\336\336\336\336\336\336\336\336\336\336\336\225\225!");
    }

    @Test
    public void test13967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13967");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360!", "!\276\u02eb\u02ebnullnullnull\276\u02eb\u02ebnullnullnull\276\u02eb\u02ebnullnullnull\276\u02eb\u02ebnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360!" + "'", str2, "\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\316\317\321\321\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360!");
    }

    @Test
    public void test13968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13968");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!", "\253\254\256\256``^^``^^``^^``^^\253\254\256\256``^^``^^!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!" + "'", str2, "!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!null!!!null!!!null!!!null!!```!");
    }

    @Test
    public void test13969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13969");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\276\276XX\276\276XXXX\276\276XX\276\276\276\276XX\276\276XXXX\276\276XX\276\276\276\276XX\276\276XXXX\276\276XX\276\276\276\276XX\276\276XXXX\276\276XX\276\276\276\276XX\276\276XXXX\276\276XX\276\276\276\276XX\276\276XXXX\276\276XX\276\276\276\276XX\276\276XXXX\276\276XX\276\276\276\276XX\276\276XXXX\276\276XX\276\276!", "\275\276NN\275\276NN\275\276NN\275\276NN\275\276NN\275\276NN\275\276NN\275\276NN\275\276NN\275\276NN\275\276NN\275\276NN\275\276NN\275\276NN\275\276NN\275\276NN\275\276NN\275\276NN\275\276NN\275\276NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276!" + "'", str2, "\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276!");
    }

    @Test
    public void test13970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13970");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LIIILIII!", "RTRRRTRR!!RTRRRTRR!!RTRRRTRRRTRRRTRR!!RTRRRTRR!!RTRRRTRR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "T!!!T!!!!" + "'", str2, "T!!!T!!!!");
    }

    @Test
    public void test13971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13971");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u035e\u035e\u035e\u035e\u035e\u035e\u035e\u035e!", "nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u035e\u035e\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u035e\u035e\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u035e\u035e\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u035e\u035e!" + "'", str2, "\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u035e\u035e\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u035e\u035e\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u035e\u035e\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u035e\u035e!");
    }

    @Test
    public void test13972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13972");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!\200\200\u0346\u0348\u0348!", "\275u\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uu\276u\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uu\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test13973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13973");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null~\352null\354\354\352null\354\354null~\352null\354\354\352null\354\354!!null~\352null\354\354\352null\354\354null~\352null\354\354\352null\354\354!!null~\352null\354\354\352null\354\354null~\352null\354\354\352null\354\354null~\352null\354\354\352null\354\354null~\352null\354\354\352null\354\354!!null~\352null\354\354\352null\354\354null~\352null\354\354\352null\354\354!!null~\352null\354\354\352null\354\354null~\352null\354\354\352null\354\354!", "]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}]]]~null}]]]nullnullnull}]]]nullnull}]]]~null}]]]nullnullnull}]]]nullnull!!}]]]~null}]]]nullnullnull}]]]nullnull}]]]~null}]]]nullnullnull}]]]nullnull!!}]]]~null}]]]nullnullnull}]]]nullnull}]]]~null}]]]nullnullnull}]]]nullnull}]]]~null}]]]nullnullnull}]]]nullnull}]]]~null}]]]nullnullnull}]]]nullnull!!}]]]~null}]]]nullnullnull}]]]nullnull}]]]~null}]]]nullnullnull}]]]nullnull!!}]]]~null}]]]nullnullnull}]]]nullnull}]]]~null}]]]nullnullnull}]]]nullnull!" + "'", str2, "}]]]~null}]]]nullnullnull}]]]nullnull}]]]~null}]]]nullnullnull}]]]nullnull!!}]]]~null}]]]nullnullnull}]]]nullnull}]]]~null}]]]nullnullnull}]]]nullnull!!}]]]~null}]]]nullnullnull}]]]nullnull}]]]~null}]]]nullnullnull}]]]nullnull}]]]~null}]]]nullnullnull}]]]nullnull}]]]~null}]]]nullnullnull}]]]nullnull!!}]]]~null}]]]nullnullnull}]]]nullnull}]]]~null}]]]nullnullnull}]]]nullnull!!}]]]~null}]]]nullnullnull}]]]nullnull}]]]~null}]]]nullnullnull}]]]nullnull!");
    }

    @Test
    public void test13974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13974");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "!!\275\275!!\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13975");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!U!!!U!!!U!!!U!!U!U!!!!U!U!!!!U!U!!!!U!U!!!!!", "!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!null!!!null!!null!null!!!!null!null!!!!null!null!!!!null!null!!!!!" + "'", str2, "!null!!!null!!!null!!!null!!null!null!!!!null!null!!!!null!null!!!!null!null!!!!!");
    }

    @Test
    public void test13976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13976");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!!\254\254!", "nullnull!!NN]]NN]]NN]]nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!NN]]NN]]NN]]nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!\254\254!" + "'", str2, "!!!\254\254!");
    }

    @Test
    public void test13977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13977");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!LLUULLUULLUU!LLUULLUULLUU!!!LLUULLUULLUU!LLUULLUULLUU!!!LLUULLUULLUU!LLUULLUULLUU!LLUULLUULLUU!LLUULLUULLUU!!!LLUULLUULLUU!LLUULLUULLUU!!!LLUULLUULLUU!LLUULLUULLUU!", "}L\200\200}L\200\200}L\200\200}L\200\200LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL}L\200\200}L\200\200}L\200\200}L\200\200LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\200\200LL\200\200LL\200\200LL!\200\200LL\200\200LL\200\200LL!!!\200\200LL\200\200LL\200\200LL!\200\200LL\200\200LL\200\200LL!!!\200\200LL\200\200LL\200\200LL!\200\200LL\200\200LL\200\200LL!\200\200LL\200\200LL\200\200LL!\200\200LL\200\200LL\200\200LL!!!\200\200LL\200\200LL\200\200LL!\200\200LL\200\200LL\200\200LL!!!\200\200LL\200\200LL\200\200LL!\200\200LL\200\200LL\200\200LL!" + "'", str2, "!\200\200LL\200\200LL\200\200LL!\200\200LL\200\200LL\200\200LL!!!\200\200LL\200\200LL\200\200LL!\200\200LL\200\200LL\200\200LL!!!\200\200LL\200\200LL\200\200LL!\200\200LL\200\200LL\200\200LL!\200\200LL\200\200LL\200\200LL!\200\200LL\200\200LL\200\200LL!!!\200\200LL\200\200LL\200\200LL!\200\200LL\200\200LL\200\200LL!!!\200\200LL\200\200LL\200\200LL!\200\200LL\200\200LL\200\200LL!");
    }

    @Test
    public void test13978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13978");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab!", "!!!!\242fnullhh\237\237\242fnullhh\237\237!!\242fnullhh\237\237\242fnullhh\237\237!!!!\242fnullhh\237\237\242fnullhh\237\237!!\242fnullhh\237\237\242fnullhh\237\237!!!!\242fnullhh\237\237\242fnullhh\237\237!!\242fnullhh\237\237\242fnullhh\237\237!!!!\242fnullhh\237\237\242fnullhh\237\237!!\242fnullhh\237\237\242fnullhh\237\237!!!!\242fnullhh\237\237\242fnullhh\237\237!!\242fnullhh\237\237\242fnullhh\237\237!!!!\242fnullhh\237\237\242fnullhh\237\237!!\242fnullhh\237\237\242fnullhh\237\237!!!!\242fnullhh\237\237\242fnullhh\237\237!!\242fnullhh\237\237\242fnullhh\237\237!!!!\242fnullhh\237\237\242fnullhh\237\237!!\242fnullhh\237\237\242fnullhh\237\237!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01c9\u01ca\u01cc\u01cc\u01c9\u01ca\u01cc\u01cc\u01c9\u01ca\u01cc\u01cc\u01c9\u01ca\u01cc\u01cc\u01c9\u01ca\u01cc\u01cc\u01c9\u01ca\u01cc\u01cc\u01c9\u01ca\u01cc\u01cc\u01c9\u01ca\u01cc\u01cc\u01c9\u01ca\u01cc\u01cc\u01c9\u01ca\u01cc\u01cc\u01c9\u01ca\u01cc\u01cc\u01c9\u01ca\u01cc\u01ccnullnull!" + "'", str2, "\u01c9\u01ca\u01cc\u01cc\u01c9\u01ca\u01cc\u01cc\u01c9\u01ca\u01cc\u01cc\u01c9\u01ca\u01cc\u01cc\u01c9\u01ca\u01cc\u01cc\u01c9\u01ca\u01cc\u01cc\u01c9\u01ca\u01cc\u01cc\u01c9\u01ca\u01cc\u01cc\u01c9\u01ca\u01cc\u01cc\u01c9\u01ca\u01cc\u01cc\u01c9\u01ca\u01cc\u01cc\u01c9\u01ca\u01cc\u01ccnullnull!");
    }

    @Test
    public void test13979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13979");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!!" + "'", str2, "\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!\260!H!!!H!!!H!!!");
    }

    @Test
    public void test13980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13980");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!", "NLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!" + "'", str2, "!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!");
    }

    @Test
    public void test13981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13981");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "UULLUULLUULLUULLUULLUULLUULLUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13982");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!HHHHHHHH!!HHHHHHHH!!!!HHHHHHHH!!HHHHHHHH!!!!HHHHHHHH!!HHHHHHHH!!!!HHHHHHHH!!HHHHHHHH!!!!HHHHHHHH!!HHHHHHHH!!!!HHHHHHHH!!HHHHHHHH!!!!HHHHHHHH!!HHHHHHHH!!!!HHHHHHHH!!HHHHHHHH!!!", "\275nullnullnull\276null\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test13983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13983");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!\225!", "\u0228\u0228\u0228\u0228nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\225!" + "'", str2, "!\225!");
    }

    @Test
    public void test13984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13984");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275PPP!!!!PPP!!!!\200\200PPP!!!!PPP!!!!\200\200PPP!!!!PPP!!!!\200\200\276PPP!!!!PPP!!!!\200\200\275\275!", "XNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMM!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275NNN!!!!NNN!!!!\200\200NNN!!!!NNN!!!!\200\200NNN!!!!NNN!!!!\200\200\276NNN!!!!NNN!!!!\200\200\275\275!" + "'", str2, "\275NNN!!!!NNN!!!!\200\200NNN!!!!NNN!!!!\200\200NNN!!!!NNN!!!!\200\200\276NNN!!!!NNN!!!!\200\200\275\275!");
    }

    @Test
    public void test13985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13985");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225!", "``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM\225\230\230``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM\225\230\230``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM\225\230\230``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM\225\230\230\200}}```MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM\225\230\230``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM\225\230\230``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM\225\230\230``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276``MM``MM``MM``MM``MM``MM``MM``MM\275\276``MM``MM``MM``MM``MM``MM``MM``MM\225\225\275\276``MM``MM``MM``MM``MM``MM``MM``MM\275\276``MM``MM``MM``MM``MM``MM``MM``MM\225\225\275\276``MM``MM``MM``MM``MM``MM``MM``MM\275\276``MM``MM``MM``MM``MM``MM``MM``MM\225\225\275\276``MM``MM``MM``MM``MM``MM``MM``MM\275\276``MM``MM``MM``MM``MM``MM``MM``MM\225\225\275\276``MM``MM``MM``MM``MM``MM``MM``MM\275\276``MM``MM``MM``MM``MM``MM``MM``MM\225\225\275\276``MM``MM``MM``MM``MM``MM``MM``MM\275\276``MM``MM``MM``MM``MM``MM``MM``MM\225\225\275\276``MM``MM``MM``MM``MM``MM``MM``MM\275\276``MM``MM``MM``MM``MM``MM``MM``MM\225\225\275\276``MM``MM``MM``MM``MM``MM``MM``MM\275\276``MM``MM``MM``MM``MM``MM``MM``MM\225\225!" + "'", str2, "\275\276``MM``MM``MM``MM``MM``MM``MM``MM\275\276``MM``MM``MM``MM``MM``MM``MM``MM\225\225\275\276``MM``MM``MM``MM``MM``MM``MM``MM\275\276``MM``MM``MM``MM``MM``MM``MM``MM\225\225\275\276``MM``MM``MM``MM``MM``MM``MM``MM\275\276``MM``MM``MM``MM``MM``MM``MM``MM\225\225\275\276``MM``MM``MM``MM``MM``MM``MM``MM\275\276``MM``MM``MM``MM``MM``MM``MM``MM\225\225\275\276``MM``MM``MM``MM``MM``MM``MM``MM\275\276``MM``MM``MM``MM``MM``MM``MM``MM\225\225\275\276``MM``MM``MM``MM``MM``MM``MM``MM\275\276``MM``MM``MM``MM``MM``MM``MM``MM\225\225\275\276``MM``MM``MM``MM``MM``MM``MM``MM\275\276``MM``MM``MM``MM``MM``MM``MM``MM\225\225\275\276``MM``MM``MM``MM``MM``MM``MM``MM\275\276``MM``MM``MM``MM``MM``MM``MM``MM\225\225!");
    }

    @Test
    public void test13986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13986");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL!", "!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~!" + "'", str2, "\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~!");
    }

    @Test
    public void test13987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13987");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!", "ULLLULLLULLLULLL\200}}`ULLLULLLULLLULLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!" + "'", str2, "ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!");
    }

    @Test
    public void test13988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13988");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0199\u0199\u0199\u0199\u0199\u0199\u0199\u0199uu!", "\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u010e\u010e\u010e\u010e\u010e\u010e\u010e\u010e!" + "'", str2, "\u010e\u010e\u010e\u010e\u010e\u010e\u010e\u010e!");
    }

    @Test
    public void test13989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13989");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13990");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104!", "]]]]!!!]]]]!!!]]]]!!!]]]]!!!\256\254\254]]]]!!!]]]]!!!]]]]!!!]]]]!!!\256\254\254!!]]]]!!!]]]]!!!]]]]!!!]]]]!!!\256\254\254]]]]!!!]]]]!!!]]]]!!!]]]]!!!\256\254\254!!]]]]!!!]]]]!!!]]]]!!!]]]]!!!\256\254\254]]]]!!!]]]]!!!]]]]!!!]]]]!!!\256\254\254!!]]]]!!!]]]]!!!]]]]!!!]]]]!!!\256\254\254]]]]!!!]]]]!!!]]]]!!!]]]]!!!\256\254\254!!]]]]!!!]]]]!!!]]]]!!!]]]]!!!\256\254\254]]]]!!!]]]]!!!]]]]!!!]]]]!!!\256\254\254!!]]]]!!!]]]]!!!]]]]!!!]]]]!!!\256\254\254]]]]!!!]]]]!!!]]]]!!!]]]]!!!\256\254\254!!]]]]!!!]]]]!!!]]]]!!!]]]]!!!\256\254\254]]]]!!!]]]]!!!]]]]!!!]]]]!!!\256\254\254!!]]]]!!!]]]]!!!]]]]!!!]]]]!!!\256\254\254]]]]!!!]]]]!!!]]]]!!!]]]]!!!\256\254\254!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200]]!!!]]!!]]!!]]!!!]]!!]]!!]]]]]]]]]]!!!]]!!]]!!]]!!!]]!!]]!!]]]]]]]]~}\200\200~}\200\200]]!!!]]!!]]!!]]!!!]]!!]]!!]]]]]]]]]]!!!]]!!]]!!]]!!!]]!!]]!!]]]]]]]]~}\200\200~}\200\200]]!!!]]!!]]!!]]!!!]]!!]]!!]]]]]]]]]]!!!]]!!]]!!]]!!!]]!!]]!!]]]]]]]]~}\200\200~}\200\200]]!!!]]!!]]!!]]!!!]]!!]]!!]]]]]]]]]]!!!]]!!]]!!]]!!!]]!!]]!!]]]]]]]]~}\200\200~}\200\200]]!!!]]!!]]!!]]!!!]]!!]]!!]]]]]]]]]]!!!]]!!]]!!]]!!!]]!!]]!!]]]]]]]]~}\200\200~}\200\200]]!!!]]!!]]!!]]!!!]]!!]]!!]]]]]]]]]]!!!]]!!]]!!]]!!!]]!!]]!!]]]]]]]]~}\200\200~}\200\200]]!!!]]!!]]!!]]!!!]]!!]]!!]]]]]]]]]]!!!]]!!]]!!]]!!!]]!!]]!!]]]]]]]]~}\200\200~}\200\200]]!!!]]!!]]!!]]!!!]]!!]]!!]]]]]]]]]]!!!]]!!]]!!]]!!!]]!!]]!!]]]]]]]]!" + "'", str2, "~}\200\200~}\200\200]]!!!]]!!]]!!]]!!!]]!!]]!!]]]]]]]]]]!!!]]!!]]!!]]!!!]]!!]]!!]]]]]]]]~}\200\200~}\200\200]]!!!]]!!]]!!]]!!!]]!!]]!!]]]]]]]]]]!!!]]!!]]!!]]!!!]]!!]]!!]]]]]]]]~}\200\200~}\200\200]]!!!]]!!]]!!]]!!!]]!!]]!!]]]]]]]]]]!!!]]!!]]!!]]!!!]]!!]]!!]]]]]]]]~}\200\200~}\200\200]]!!!]]!!]]!!]]!!!]]!!]]!!]]]]]]]]]]!!!]]!!]]!!]]!!!]]!!]]!!]]]]]]]]~}\200\200~}\200\200]]!!!]]!!]]!!]]!!!]]!!]]!!]]]]]]]]]]!!!]]!!]]!!]]!!!]]!!]]!!]]]]]]]]~}\200\200~}\200\200]]!!!]]!!]]!!]]!!!]]!!]]!!]]]]]]]]]]!!!]]!!]]!!]]!!!]]!!]]!!]]]]]]]]~}\200\200~}\200\200]]!!!]]!!]]!!]]!!!]]!!]]!!]]]]]]]]]]!!!]]!!]]!!]]!!!]]!!]]!!]]]]]]]]~}\200\200~}\200\200]]!!!]]!!]]!!]]!!!]]!!]]!!]]]]]]]]]]!!!]]!!]]!!]]!!!]]!!]]!!]]]]]]]]!");
    }

    @Test
    public void test13991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13991");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e!!!", "\275PPP\276P\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnullnull!!!!nullnullnull!!!" + "'", str2, "!!nullnullnull!!!!nullnullnull!!!");
    }

    @Test
    public void test13992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13992");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!LLUU!", "LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!NNLL!" + "'", str2, "!NNLL!");
    }

    @Test
    public void test13993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13993");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!!", "!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\200!!!\200!!!!!\200!!!\200!!!!!!!\200!!!\200!!!!!\200!!!\200!!!!!!!\200!!!\200!!!!!\200!!!\200!!!!!!!\200!!!\200!!!!!\200!!!\200!!!!!!!\200!!!\200!!!!!\200!!!\200!!!!!!!\200!!!\200!!!!!\200!!!\200!!!!!!!\200!!!\200!!!!!\200!!!\200!!!!!!!\200!!!\200!!!!!\200!!!\200!!!!!!!" + "'", str2, "!\200!!!\200!!!!!\200!!!\200!!!!!!!\200!!!\200!!!!!\200!!!\200!!!!!!!\200!!!\200!!!!!\200!!!\200!!!!!!!\200!!!\200!!!!!\200!!!\200!!!!!!!\200!!!\200!!!!!\200!!!\200!!!!!!!\200!!!\200!!!!!\200!!!\200!!!!!!!\200!!!\200!!!!!\200!!!\200!!!!!!!\200!!!\200!!!!!\200!!!\200!!!!!!!");
    }

    @Test
    public void test13994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13994");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368lnulluulnulluulnulluulnulluulnulluulnulluulnulluulnulluu!!lnulluulnulluulnulluulnulluulnulluulnulluulnulluulnulluu!!\200\200\u0346\u0348\u0348!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!nullnull!!nullnull!nullnull!!nullnull!nullnull!!nullnull!nullnull!!nullnull!nullnull!!nullnull!nullnull!!nullnull!nullnull!!nullnull!nullnull!!nullnull!!!nullnull!!nullnull!nullnull!!nullnull!nullnull!!nullnull!nullnull!!nullnull!nullnull!!nullnull!nullnull!!nullnull!nullnull!!nullnull!nullnull!!nullnull!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!nullnull!!nullnull!nullnull!!nullnull!nullnull!!nullnull!nullnull!!nullnull!nullnull!!nullnull!nullnull!!nullnull!nullnull!!nullnull!nullnull!!nullnull!!!nullnull!!nullnull!nullnull!!nullnull!nullnull!!nullnull!nullnull!!nullnull!nullnull!!nullnull!nullnull!!nullnull!nullnull!!nullnull!nullnull!!nullnull!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test13995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13995");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!", "!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]]]]]]]]]!!]]!!]]]]]]]]]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]]]]]]]]]!!]]!!]]]]]]]]]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]]]]]]]]]!!]]!!]]]]]]]]]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]]]]]]]]]!!]]!!]]]]]]]]]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]]]]]]]]]!!]]!!]]]]]]]]]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]]]]]]]]]!!]]!!]]]]]]]]]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]]]]]]]]]!!]]!!]]]]]]]]]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]]]]]]]]]!!]]!!]]]]]]]]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]]]!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!" + "'", str2, "!]]]!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!");
    }

    @Test
    public void test13996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13996");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("`nullnullnull`nullnullnull!", "\335\335\335\335\335\335\335\335\214\214\335\335\335\335\335\335\335\335\214\214\335\335\335\335\335\335\335\335\214\214\335\335\335\335\335\335\335\335\214\214\335\335\335\335\335\335\335\335\214\214\335\335\335\335\335\335\335\335\214\214\335\335\335\335\335\335\335\335\214\214\335\335\335\335\335\335\335\335\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`\335\335\335\335\335\335\335\335\335\335\335\335`\335\335\335\335\335\335\335\335\335\335\335\335!" + "'", str2, "`\335\335\335\335\335\335\335\335\335\335\335\335`\335\335\335\335\335\335\335\335\335\335\335\335!");
    }

    @Test
    public void test13997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13997");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!!", "\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u037e\u037e\u037enull~~\256\254\254\u037e\u037e\u037enull~~\256\254\254\u037e\u037e\u037enull~~\256\254\254\u037e\u037e\u037enull~~\256\254\254\u037e\u037e\u037enull~~\256\254\254\u037e\u037e\u037enull~~\256\254\254\u037e\u037e\u037enull~~\256\254\254\u037e\u037e\u037enull~~\256\254\254\u037e\u037e\u037enull~~\256\254\254\u037e\u037e\u037enull~~\256\254\254\u037e\u037e\u037enull~~\256\254\254\u037e\u037e\u037enull~~\256\254\254\u037e\u037e\u037enull~~\256\254\254\u037e\u037e\u037enull~~\256\254\254\u037e\u037e\u037enull~~\256\254\254\u037e\u037e\u037enull~~\256\254\254!!!" + "'", str2, "\u037e\u037e\u037enull~~\256\254\254\u037e\u037e\u037enull~~\256\254\254\u037e\u037e\u037enull~~\256\254\254\u037e\u037e\u037enull~~\256\254\254\u037e\u037e\u037enull~~\256\254\254\u037e\u037e\u037enull~~\256\254\254\u037e\u037e\u037enull~~\256\254\254\u037e\u037e\u037enull~~\256\254\254\u037e\u037e\u037enull~~\256\254\254\u037e\u037e\u037enull~~\256\254\254\u037e\u037e\u037enull~~\256\254\254\u037e\u037e\u037enull~~\256\254\254\u037e\u037e\u037enull~~\256\254\254\u037e\u037e\u037enull~~\256\254\254\u037e\u037e\u037enull~~\256\254\254\u037e\u037e\u037enull~~\256\254\254!!!");
    }

    @Test
    public void test13998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13998");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("````````````````````````````````!!````````````````````````````````!!````````````````````````````````````````````````````````````````!!````````````````````````````````!!````````````````````````````````!", "\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````````````````````!!````````````````````````````````!!````````````````````````````````````````````````````````````````!!````````````````````````````````!!````````````````````````````````!" + "'", str2, "````````````````````````````````!!````````````````````````````````!!````````````````````````````````````````````````````````````````!!````````````````````````````````!!````````````````````````````````!");
    }

    @Test
    public void test13999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13999");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!", "!\276\u02eb\u02ebnullnullnullnullnullnullnullnullnullnullnullnull\276\u02eb\u02ebnullnullnullnullnullnullnullnullnullnullnullnull\276\u02eb\u02ebnullnullnullnullnullnullnullnullnullnullnullnull\276\u02eb\u02ebnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test14000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test14000");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!!!!!!!!!!!!!!!!!!", "~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!");
    }
}
