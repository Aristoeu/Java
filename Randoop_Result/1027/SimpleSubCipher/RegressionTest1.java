package SimpleSubCipher;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00501");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!", "nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\200!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\200!" + "'", str2, "!\200!");
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214!", "lluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214!" + "'", str2, "LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214!");
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLL!", "\200\200!!\200\200!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0107\u0105\u0109\u0109\u0107\u0105\u0109\u0109!", "nullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!", "\u0170null!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198nullnull!", "EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!!", "\246\250\250\250\246\250\250\250!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!", "\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnull!", "\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200}}`\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LNNNLNNN!", "\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225!", "\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225!" + "'", str2, "\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225!");
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256!", "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256!" + "'", str2, "~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256!");
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!", "FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!" + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0170null!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnull!" + "'", str2, "nullnullnullnullnull!");
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\300\336\336\335\300\336\336\335\300\336\336\335\300\336\336\335\300\336\336\335\300\336\336\335\300\336\336\335\300\336\336!", "\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106nullLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256!", "\246\246!!\246\246!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256!" + "'", str2, "\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256!");
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!", "\276\276!!\276\276!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNUULNUU!!LNUULNUU!!LNUULNUULNUULNUU!!LNUULNUU!!LNUULNUU!", "LLUULLUULLUULLUULLUULLUULLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULLLULLL!!ULLLULLL!!ULLLULLLULLLULLL!!ULLLULLL!!ULLLULLL!" + "'", str2, "ULLLULLL!!ULLLULLL!!ULLLULLLULLLULLL!!ULLLULLL!!ULLLULLL!");
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!", "\336\335\340\340\336\335\340\340!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300!" + "'", str2, "\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300!");
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\254\256\256\253\254\256\256!!\253\254\256\256\253\254\256\256!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256\253\254\256\256!!\253\254\256\256\253\254\256\256!!!" + "'", str2, "\253\254\256\256\253\254\256\256!!\253\254\256\256\253\254\256\256!!!");
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336!", "TT!!TT!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!", "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!!" + "'", str2, "HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!!");
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "EHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!" + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014e\u014e\u014e!!!", "`nullnullnull`nullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!!", "!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!" + "'", str2, "!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!");
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!", "]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!" + "'", str2, "``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!");
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ULLLULLLULLLULLLULLLULLLULLLULLL!", "~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256!" + "'", str2, "~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256!");
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!!", "FHHHnullnullnullnullFHHHnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!!", "XXXXXXXXXXXXXXXX\200}}`XXXXXXXXXXXXXXXX]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]!!]]!!}}]]!!]]!!}}!" + "'", str2, "]]!!]]!!}}]]!!]]!!}}!");
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!", "\u014f!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106!", "ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!!", "\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126!!!" + "'", str2, "\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126!!!");
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!", "\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!" + "'", str2, "\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!");
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHH!", "~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!" + "'", str2, "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!");
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!", "hfhhhfhh!!hfhhhfhh!!hfhhhfhhhfhhhfhh!!hfhhhfhh!!hfhhhfhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340!", "\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340!", "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128nullnull!" + "'", str2, "\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128nullnull!");
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\250\250\246\246\250\250\246\246!", "~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\246\246\250\250\246\246!" + "'", str2, "\250\250\246\246\250\250\246\246!");
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0345\u0346\u0348\u0348!", "nullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhh!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!", "nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!" + "'", str2, "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!");
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("lluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUU!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("lluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUU!", "nullnullnullnullabddabddabddabddnullnullnullnullabddabdd!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn!" + "'", str2, "\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn!");
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`nullnullnull`nullnullnull!", "LULLLULL!!LULLLULL!!LULLLULLLULLLULL!!LULLLULL!!LULLLULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`LLUULLUULLUU`LLUULLUULLUU!" + "'", str2, "`LLUULLUULLUU`LLUULLUULLUU!");
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0345\u0346\u0348\u0348!", "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!", "HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNNNLNNN!", "efhhefhhefhhefhhefhhefhhefhhefhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HFFFHFFF!" + "'", str2, "HFFFHFFF!");
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!", "HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHH!" + "'", str2, "HHHHHHHH!");
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!", "xxvvxxvvxxvvxxvv!xxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvv!xxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvv!xxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvv!xxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvv!xxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvv!xxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvv!xxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvv!xxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvv!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!", "`nullnullnull`nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "wxzzwxzz!!wxzzwxzz!!wxzzwxzzwxzzwxzz!!wxzzwxzz!!wxzzwxzz!" + "'", str2, "wxzzwxzz!!wxzzwxzz!!wxzzwxzzwxzzwxzz!!wxzzwxzz!!wxzzwxzz!");
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullUNLL!", "UNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLLULNN!" + "'", str2, "NLLLULNN!");
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!", "~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!" + "'", str2, "NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!");
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!!" + "'", str2, "NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!!");
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull!", "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336!" + "'", str2, "nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336!");
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!", "\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!" + "'", str2, "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!");
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!nullnull!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!", "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!" + "'", str2, "~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!");
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108!", "!\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLL!", "efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300!" + "'", str2, "\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300!");
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFF!", "nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("hfhhhfhh!!hfhhhfhh!!hfhhhfhhhfhhhfhh!!hfhhhfhh!!hfhhhfhh!", "\u01a0\u0196\u019d\u019dnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!", "\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("hfhhhfhh!!hfhhhfhh!!hfhhhfhhhfhhhfhh!!hfhhhfhh!!hfhhhfhh!", "nullnullnullnull\200}}`nullnullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l]lll]ll!!l]lll]ll!!l]lll]lll]lll]ll!!l]lll]ll!!l]lll]ll!" + "'", str2, "l]lll]ll!!l]lll]ll!!l]lll]lll]lll]ll!!l]lll]ll!!l]lll]ll!");
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300!", "~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300!", "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUULLUULLUULLUULLUULLUULLUULLUU!" + "'", str2, "LLUULLUULLUULLUULLUULLUULLUULLUU!");
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!", "nullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!" + "'", str2, "U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!");
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!", "U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!" + "'", str2, "!!!");
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ULLLULLLULLLULLL\200}}`ULLLULLLULLLULLL]]!", "LLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUU\200}}`UUUUUUUUUUUUUUUU]]!" + "'", str2, "UUUUUUUUUUUUUUUU\200}}`UUUUUUUUUUUUUUUU]]!");
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNNNLNNN!", "\u0107\u0105\u0109\u0109\u0107\u0105\u0109\u0109!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!" + "'", str2, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("wxzzwxzz!!wxzzwxzz!!wxzzwxzzwxzzwxzz!!wxzzwxzz!!wxzzwxzz!", "lluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UULLUULL!!UULLUULL!!UULLUULLUULLUULL!!UULLUULL!!UULLUULL!" + "'", str2, "UULLUULL!!UULLUULL!!UULLUULLUULLUULL!!UULLUULL!!UULLUULL!");
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "JILLJILLJILLJILLJILLJILLJILLJILL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnull\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnull\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("efhhefhhefhhefhhefhhefhhefhhefhh!", "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!!" + "'", str2, "UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!!");
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300!", "\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLL!", "null\200}}`null]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLL!" + "'", str2, "IILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLL!");
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLL!", "UNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHH!" + "'", str2, "FFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHH!");
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\225\230\230null\225\230\230null\225\230\230null\225\230\230\200}}`null\225\230\230null\225\230\230null\225\230\230null\225\230\230]]!", "ab!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230\200}}`nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230]]!" + "'", str2, "nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230\200}}`nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230]]!");
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!", "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nulloprr!", "lluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUUUULL!" + "'", str2, "LLUUUULL!");
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NULLNULLNULLNULLNULLNULLNULLNULL!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!" + "'", str2, "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!");
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336!", "]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull!");
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("l]lll]ll!!l]lll]ll!!l]lll]lll]lll]ll!!l]lll]ll!!l]lll]ll!", "unllNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h]hhh]hh!!h]hhh]hh!!h]hhh]hhh]hhh]hh!!h]hhh]hh!!h]hhh]hh!" + "'", str2, "h]hhh]hh!!h]hhh]hh!!h]hhh]hhh]hhh]hh!!h]hhh]hh!!h]hhh]hh!");
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!", "\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!!" + "'", str2, "\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!!");
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300!", "!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014enullnull!" + "'", str2, "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014enullnull!");
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!", "hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nulloprr!", "LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AALLLLAA!" + "'", str2, "AALLLLAA!");
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!", "UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!" + "'", str2, "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!");
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]!!]]!!}}]]!!]]!!}}!", "\200\200!!\200\200!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]!!]]!!}}]]!!]]!!}}!" + "'", str2, "]]!!]]!!}}]]!!]]!!}}!");
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e!", "nullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBB!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLULNN!", "NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\300\300\300\276\300\275\275!" + "'", str2, "\275\300\300\300\276\300\275\275!");
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!!", "NNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!!" + "'", str2, "~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!!");
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("h]hhh]hh!!h]hhh]hh!!h]hhh]hhh]hhh]hh!!h]hhh]hh!!h]hhh]hh!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a]aaa]aa!!a]aaa]aa!!a]aaa]aaa]aaa]aa!!a]aaa]aa!!a]aaa]aa!" + "'", str2, "a]aaa]aa!!a]aaa]aa!!a]aaa]aaa]aaa]aa!!a]aaa]aa!!a]aaa]aa!");
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ULLLULLLULLLULLL\200}}`ULLLULLLULLLULLL]]!", "\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\200}}`\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300]]!" + "'", str2, "\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\200}}`\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300]]!");
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!", "nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300!", "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnull!" + "'", str2, "nullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnull!");
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!!", "XXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxx!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("lluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUU!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e!" + "'", str2, "\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e!");
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("RRPPRRPPRRPPRRPPRRPPRRPPRRPPRRPP!", "LULLLULL!!LULLLULL!!LULLLULLLULLLULL!!LULLLULL!!LULLLULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUULLUULLUULLUULLUULLUULLUULLUU!" + "'", str2, "LLUULLUULLUULLUULLUULLUULLUULLUU!");
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("FHHHnullnullnullnullFHHHnullnull!", "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u017e\u017e\u017e\u017e\u017e\u017enullnullnullnullnullnullnullnull!" + "'", str2, "\u017e\u017e\u017e\u017e\u017e\u017enullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\230\230\225\225\230\230\225\225!", "\u0128\u0126\u0126\u0108\u0106\u0106!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\230\225\225\230\230\225\225!" + "'", str2, "\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!", "LNNNLNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!" + "'", str2, "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!");
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("IILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLL!", "nullnull\336\336nullnull\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRR!" + "'", str2, "nullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRR!");
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!!", "\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!!" + "'", str2, "~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!!");
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!!", "FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!!" + "'", str2, "hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!!");
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108!!!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNN!" + "'", str2, "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNN!");
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\200!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\200!" + "'", str2, "!\200!");
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull!", "nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246!" + "'", str2, "\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246!");
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!", "LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!" + "'", str2, "NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!");
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLLUNLL!!UNLLUNLL!!!", "\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!" + "'", str2, "\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!");
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!!", "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!" + "'", str2, "nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!");
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "unllunllunllunllunllunllunllunll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!", "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!" + "'", str2, "\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!");
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!!", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!" + "'", str2, "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!");
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!", "unllNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLULNN!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0345\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0345\u0348\u0346\u0346!");
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "EHHHEHHHEHHHEHHHEHHHEHHHEHHHEHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!", "!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HHHHHHHH!", "UUUUUUUUUUUUUUUU\200}}`UUUUUUUUUUUUUUUU]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUU!" + "'", str2, "UUUUUUUU!");
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!", "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!" + "'", str2, "UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!");
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d!", "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!" + "'", str2, "NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!");
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\276!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276!" + "'", str2, "!\276!");
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!", "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUU!" + "'", str2, "NUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUU!");
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!", "nullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LULLLULL!!LULLLULL!!LULLLULLLULLLULL!!LULLLULL!!LULLLULL!", "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNLLLNLL!!LNLLLNLL!!LNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!" + "'", str2, "LNLLLNLL!!LNLLLNLL!!LNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!");
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!!", "a]aaa]aa!!a]aaa]aa!!a]aaa]aaa]aaa]aa!!a]aaa]aa!!a]aaa]aa!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!", "\u014e\u014e\u014e\u014e!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!" + "'", str2, "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!");
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!", "\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!" + "'", str2, "!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!");
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d!", "!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!!!H!!!H!!!H!!!H!!!H!!!H!!!H!!!!" + "'", str2, "H!!!H!!!H!!!H!!!H!!!H!!!H!!!H!!!!");
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\200}}`\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300]]!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!", "EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\246\250\250\250\246\250\250\250!", "LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\246\250\250\250\246\250\250\250!" + "'", str2, "\246\250\250\250\246\250\250\250!");
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!" + "'", str2, "!!!");
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!" + "'", str2, "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!");
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "nullnullnullnull\200}}`nullnullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!!", "nullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBB!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!" + "'", str2, "NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!");
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("l!uul!uul!uul!uul!uul!uul!uul!uu!", "LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!" + "'", str2, "L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!");
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("lluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUU!", "\u0170null!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull!", "\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\200}}`\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\200}}`null]]!", "fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EHHH\200}}`EHHH]]!" + "'", str2, "EHHH\200}}`EHHH]]!");
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnull!", "fehhfehhfehhfehhfehhfehhfehhfehh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "efhhefhhefhhefhhefhhefhhefhhefhh!" + "'", str2, "efhhefhhefhhefhhefhhefhhefhhefhh!");
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\305\306\310\310\305\306\310\310!!\305\306\310\310\305\306\310\310!!!", "LNNNLNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!", "TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!");
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnullnull\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!", "~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!" + "'", str2, "}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!");
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUU!", "LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!" + "'", str2, "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!");
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198nullnull!", "wxzzwxzz!!wxzzwxzz!!wxzzwxzzwxzzwxzz!!wxzzwxzz!!wxzzwxzz!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullZWXXZWXXZWXXZWXXnullnullnullnullZWXXZWXX!" + "'", str2, "nullnullnullnullZWXXZWXXZWXXZWXXnullnullnullnullZWXXZWXX!");
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUU!", "nullnullaanullnullaanullnullaanullnullaanullnullaanullnullaanullnullaanullnullaa!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!" + "'", str2, "LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!");
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!!", "\275\300\300\300\276\300\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!!" + "'", str2, "\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!!");
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!", "LNNNLNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!", "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\336\335\340\340\336\335\340\340!", "nullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("JILLJILLJILLJILLJILLJILLJILLJILL!", "null\225\230\230null\225\230\230null\225\230\230null\225\230\230\200}}`null\225\230\230null\225\230\230null\225\230\230null\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225!" + "'", str2, "LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225!");
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!", "\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("RRPPRRPPRRPPRRPPRRPPRRPPRRPPRRPP!", "\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!" + "'", str2, "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "FEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!" + "'", str2, "EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!");
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!", "EHHHEHHHEHHHEHHHEHHHEHHHEHHHEHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LULLLULL!!LULLLULL!!LULLLULLLULLLULL!!LULLLULL!!LULLLULL!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNLLLNLL!!LNLLLNLL!!LNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!" + "'", str2, "LNLLLNLL!!LNLLLNLL!!LNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!");
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!", "UUUUUUUUUUUUUUUU\200}}`UUUUUUUUUUUUUUUU]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UUUUUUUUUUUUUUUU\200}}`UUUUUUUUUUUUUUUU]]!", "AALLLLAA!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u017e\u017e\u017e\u017e\u017e\u017enullnullnullnullnullnullnullnull!", "\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\340\340!!nullnullnull\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!nullnullnull\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!!" + "'", str2, "\340\340!!nullnullnull\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!nullnullnull\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!!");
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx!", "HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!" + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!", "efhhefhhefhhefhhefhhefhhefhhefhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!", "nullnullnullnullabddabddabddabddnullnullnullnullabddabdd!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullZWXXZWXXZWXXZWXXnullnullnullnullZWXXZWXX!", "!\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\246\250\250\250\246\250\250\250!", "nullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\246\250\250\250\246\250\250\250!" + "'", str2, "\246\250\250\250\246\250\250\250!");
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullabddabddabddabddnullnullnullnullabddabdd!", "\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullZWXXZWXXZWXXZWXXnullnullnullnullZWXXZWXX!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLUNLLUNLLUNLLULLLULLLULLLULLLUNLLUNLLUNLLUNLLULLLULLL!" + "'", str2, "UNLLUNLLUNLLUNLLULLLULLLULLLULLLUNLLUNLLUNLLUNLLULLLULLL!");
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!", "LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!" + "'", str2, "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!");
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!!", "~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!!" + "'", str2, "\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!!");
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("EHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHH!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108!!!", "\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016enullnull!" + "'", str2, "\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016enullnull!");
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!", "\305\306\310\310\305\306\310\310!!\305\306\310\310\305\306\310\310!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!");
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullUNLL!", "\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!", "\200\200!!\200\200!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106nullLL!!!", "\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!!" + "'", str2, "null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!!");
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!!", "UNLLUNLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!" + "'", str2, "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\200!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\200!" + "'", str2, "!\200!");
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!", "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!" + "'", str2, "!!!");
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!" + "'", str2, "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!u!", "fehhfehh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!" + "'", str2, "!null!");
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUU!", "U~LLU~LL!!U~LLU~LL!!U~LLU~LLU~LLU~LL!!U~LLU~LL!!U~LLU~LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!" + "'", str2, "xxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!");
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("wxzzwxzz!!wxzzwxzz!!wxzzwxzzwxzzwxzz!!wxzzwxzz!!wxzzwxzz!", "ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IJLLIJLL!!IJLLIJLL!!IJLLIJLLIJLLIJLL!!IJLLIJLL!!IJLLIJLL!" + "'", str2, "IJLLIJLL!!IJLLIJLL!!IJLLIJLLIJLLIJLL!!IJLLIJLL!!IJLLIJLL!");
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHH!" + "'", str2, "hhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHH!");
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull!", "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!" + "'", str2, "!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!");
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246!", "]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!", "\u0366\u0365\u0368\u0368\u0345\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216!" + "'", str2, "\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216!");
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "HFFFHFFF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!", "lluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\276!", "NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276!" + "'", str2, "!\276!");
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!", "\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnull!" + "'", str2, "null\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!", "efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!" + "'", str2, "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!");
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!!\216\216\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!!\216\216\u0346\u0348\u0348!");
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!!", "\u014f!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\340\340!!nullnullnull\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!nullnullnull\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!!", "\u014b\u014c\u014e\u014e\u014b\u014c\u014e\u014e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014e\u014e\u014e!!!", "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNNNLNNN!", "JILLJILLJILLJILLJILLJILLJILLJILL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LIIILIII!" + "'", str2, "LIIILIII!");
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!", "}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!", "null\200}}`null]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!" + "'", str2, "LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!");
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FHHHnullnullnullnullFHHHnullnull!", "a]aaa]aa!!a]aaa]aa!!a]aaa]aaa]aaa]aa!!a]aaa]aa!!a]aaa]aa!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]AAAAA]]AA]]AA]]AA]]]AAAAA]]AA]]!" + "'", str2, "]AAAAA]]AA]]AA]]AA]]]AAAAA]]AA]]!");
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226!", "nullnull\336\336nullnull\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226!" + "'", str2, "\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226!");
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!", "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!!" + "'", str2, "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!!");
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\200\200!!\200\200!!!", "UNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200!!\200\200!!!" + "'", str2, "\200\200!!\200\200!!!");
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!", "FEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!" + "'", str2, "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!");
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0345\u0346\u0348\u0348!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!", "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!" + "'", str2, "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!");
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300!", "~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336!", "!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e!" + "'", str2, "~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e!");
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("h]hhh]hh!!h]hhh]hh!!h]hhh]hhh]hhh]hh!!h]hhh]hh!!h]hhh]hh!", "LLUUUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l]lll]ll!!l]lll]ll!!l]lll]lll]lll]ll!!l]lll]ll!!l]lll]ll!" + "'", str2, "l]lll]ll!!l]lll]ll!!l]lll]lll]lll]ll!!l]lll]ll!!l]lll]ll!");
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!", "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e!" + "'", str2, "\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e!");
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!", "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!" + "'", str2, "\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!");
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullabddabddabddabddnullnullnullnullabddabdd!", "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLLNLLLNLLLNLLLLLNNLLNNLLNNLLNNNLLLNLLLNLLLNLLLLLNNLLNN!" + "'", str2, "NLLLNLLLNLLLNLLLLLNNLLNNLLNNLLNNNLLLNLLLNLLLNLLLLLNNLLNN!");
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!!", "\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!" + "'", str2, "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!", "\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!" + "'", str2, "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!");
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFF!", "UNLLUNLL!!UNLLUNLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!", "~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!" + "'", str2, "\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!");
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!", "\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016enullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108!" + "'", str2, "\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108!");
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!", "null\200}}`null]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!!ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!!ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!!ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!!ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!" + "'", str2, "ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!!ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!!ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!!ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!!ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!");
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!", "NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!", "\u01a0\u0196\u019d\u019dnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!!" + "'", str2, "RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!!");
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull\336\336nullnull\336\336!", "~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUULLUU}}LLUULLUU}}!" + "'", str2, "LLUULLUU}}LLUULLUU}}!");
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "EHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u017e\u017e\u017e\u017e\u017e\u017enullnullnullnullnullnullnullnull!", "lluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\340\336\336nullnullnullnull\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336nullnullnullnull\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336!" + "'", str2, "null\340\336\336nullnullnullnull\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336nullnullnullnull\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336!");
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "nullnullnullnullZWXXZWXXZWXXZWXXnullnullnullnullZWXXZWXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "XXXXXXXXXXXXXXXX\200}}`XXXXXXXXXXXXXXXX]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("hhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHH!", "`nullnullnull`nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "llllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLL!" + "'", str2, "llllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLL!");
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!!", "\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("U~LLU~LL!!U~LLU~LL!!U~LLU~LLU~LLU~LL!!U~LLU~LL!!U~LLU~LL!", "LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106!" + "'", str2, "\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106!");
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!!", "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!!" + "'", str2, "~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!!");
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!", "nullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!" + "'", str2, "~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!");
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336!", "TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!tt!" + "'", str2, "TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!tt!");
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!" + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("FHHHnullnullnullnullFHHHnullnull!", "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e!" + "'", str2, "\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e!");
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108!!!", "null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!!" + "'", str2, "nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!!");
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!", "LULLLULL!!LULLLULL!!LULLLULLLULLLULL!!LULLLULL!!LULLLULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!" + "'", str2, "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!");
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLUUUULL!", "\230\230\225\225\230\230\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230\200}}`nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230]]!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230\200}}`LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230]]!" + "'", str2, "LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230\200}}`LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230]]!");
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!", "\253\254\256\256nullnullnullnull\253\254\256\256nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!" + "'", str2, "!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!");
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LNNNLNNN!", "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01c8\u01c5\u01c5\u01c5\u01c8\u01c5\u01c5\u01c5!" + "'", str2, "\u01c8\u01c5\u01c5\u01c5\u01c8\u01c5\u01c5\u01c5!");
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!", "LNNNLNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!" + "'", str2, "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!" + "'", str2, "\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!");
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!!", "\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108nullnull!!!!!!!" + "'", str2, "\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108nullnull!!!!!!!");
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!", "AALLLLAA!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\246\246!!\246\246!!!", "NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\246\246!!\246\246!!!" + "'", str2, "\246\246!!\246\246!!!");
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!!", "nullnullnullnull\200}}`nullnullnullnull]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!" + "'", str2, "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214!" + "'", str2, "\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214!");
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("XXXXXXXXXXXXXXXX\200}}`XXXXXXXXXXXXXXXX]]!", "nullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBB!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLL]]!" + "'", str2, "LLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLL]]!");
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0345\u0346\u0348\u0348!", "IILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!", "nullnullaanullnullaanullnullaanullnullaanullnullaanullnullaanullnullaanullnullaa!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!" + "'", str2, "NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!");
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\250\250\246\246\250\250\246\246!", "\250\250\246\246\250\250\246\246!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\246\246\250\250\246\246!" + "'", str2, "\250\250\246\246\250\250\246\246!");
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\200}}`null]]!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\200}}`nullnullnullnull]]!" + "'", str2, "nullnullnullnull\200}}`nullnullnullnull]]!");
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!", "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8!" + "'", str2, "\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8!");
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!", "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!", "\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226!" + "'", str2, "\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226!");
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("EHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHH!", "\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e!", "UULLUULL!!UULLUULL!!UULLUULLUULLUULL!!UULLUULL!!UULLUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LULLLULL!!LULLLULL!!LULLLULLLULLLULL!!LULLLULL!!LULLLULL!", "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e!" + "'", str2, "\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e!");
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!", "EHHHEHHHEHHHEHHHEHHHEHHHEHHHEHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!" + "'", str2, "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!");
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ULNNULNNULNNULNNULNNULNNULNNULNN!!ULNNULNNULNNULNNULNNULNNULNNULNN!!ULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNN!!ULNNULNNULNNULNNULNNULNNULNNULNN!!ULNNULNNULNNULNNULNNULNNULNNULNN!", "\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!" + "'", str2, "!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!");
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256!", "LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256!" + "'", str2, "\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256!");
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!!", "\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106!!!" + "'", str2, "\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106!!!");
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\200\200!!\200\200!!!", "~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200!!\200\200!!!" + "'", str2, "\200\200!!\200\200!!!");
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!!", "\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200}}`\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!!" + "'", str2, "\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!!");
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LNLLLNLL!!LNLLLNLL!!LNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!", "hehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256!" + "'", str2, "\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256!");
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!", "`LLUULLUULLUU`LLUULLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!!" + "'", str2, "`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!!");
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!", "LLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLLUNLLUNLLUNLLULLLULLLULLLULLLUNLLUNLLUNLLUNLLULLLULLL!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!null!!!null!!!null!!!null!!!nullnull!!nullnull!!nullnull!!nullnull!!null!!!null!!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!null!!!null!!!null!!!null!!!nullnull!!nullnull!!nullnull!!nullnull!!null!!!null!!!!");
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLL]]!", "!u!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e!", "LNNNLNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\226!", "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\226!" + "'", str2, "!\226!");
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("unllNULL!", "`LLUULLUULLUU`LLUULLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u`uu`UUU!" + "'", str2, "u`uu`UUU!");
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("unllunllunllunllunllunllunllunll!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!", "\230\230\225\225\230\230\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("TT!!TT!!!", "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200!!\200\200!!!" + "'", str2, "\200\200!!\200\200!!!");
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256!" + "'", str2, "\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256!");
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!", "LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!!" + "'", str2, "null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!!");
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNN!", "\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!", "EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!", "\335\300\336\336\335\300\336\336\335\300\336\336\335\300\336\336\335\300\336\336\335\300\336\336\335\300\336\336\335\300\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\230\230\225\225\230\230\225\225!", "NLLLULNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\230\225\225\230\230\225\225!" + "'", str2, "\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!" + "'", str2, "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!");
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106!", "L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnullnull~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnull!" + "'", str2, "null~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnullnull~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnull!");
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "a]aaa]aa!!a]aaa]aa!!a]aaa]aaa]aaa]aa!!a]aaa]aa!!a]aaa]aa!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014f!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!" + "'", str2, "!null!");
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!!", "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!!" + "'", str2, "LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!!");
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!", "\u01a0\u0196\u019d\u019dnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\300\300\300\276\300\275\275!", "NULLNULLNULLNULLNULLNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnull\276null\275\275!" + "'", str2, "\275nullnullnull\276null\275\275!");
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!", "TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!tt!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("``!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!", "nullUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!" + "'", str2, "``!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!");
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnullnull\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!", "\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!" + "'", str2, "P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!");
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!!", "\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!!" + "'", str2, "\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!!");
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!", "\253\254\256\256\253\254\256\256!!\253\254\256\256\253\254\256\256!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!", "\246\246!!\246\246!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!" + "'", str2, "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226!", "]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226!" + "'", str2, "\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226!");
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "\253\254\256\256\253\254\256\256!!\253\254\256\256\253\254\256\256!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "]AAAAA]]AA]]AA]]AA]]]AAAAA]]AA]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108!", "NLLLNLLLNLLLNLLLLLNNLLNNLLNNLLNNNLLLNLLLNLLLNLLLLLNNLLNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014enullnull!", "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e!", "LLUULLUULLUULLUULLUULLUULLUULLUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnullnull~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnull!" + "'", str2, "null~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnullnull~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnull!");
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!", "fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHH!" + "'", str2, "FEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHH!");
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!!", "LLUUUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!!" + "'", str2, "~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!!");
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull!!nullnull!!nullnull!!nullnull!!null!!!null!!!null!!!null!!!nullnull!!nullnull!!nullnull!!nullnull!!null!!!null!!!!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnull!!!nullnullnullnull!!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnull!!!nullnullnullnull!!!!");
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014b\u014c\u014e\u014e\u014b\u014c\u014e\u014e!", "\u014f!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullBBnullnullBB!" + "'", str2, "nullnullBBnullnullBB!");
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!" + "'", str2, "!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!");
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNN!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUU!" + "'", str2, "LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUU!");
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!", "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!");
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("JILLJILLJILLJILLJILLJILLJILLJILL!", "\u0346\u0348\u0348\u0348\u0345\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300!", "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnull!", "}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx!", "\u0366\u0365\u0368\u0368\u0345\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("XXXXXXXXXXXXXXXX\200}}`XXXXXXXXXXXXXXXX]]!", "unllunllunllunllunllunllunllunll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "]]!!]]!!}}]]!!]]!!}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140!" + "'", str2, "\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140!");
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u0345\u0348\u0346\u0346!", "FHHHnullnullnullnullFHHHnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\336\335\340\340\336\335\340\340!", "AALLLLAA!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```!", "nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```!" + "'", str2, "ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```!");
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!", "\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!", "LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!" + "'", str2, "!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!");
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLL!", "``!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("fehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehh!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!" + "'", str2, "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\200!", "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\200!" + "'", str2, "!\200!");
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300!", "nullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUU!" + "'", str2, "NUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUU!");
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!", "NULLNULLNULLNULLNULLNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!");
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e!", "XXXXXXXXXXXXXXXX\200}}`XXXXXXXXXXXXXXXX]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xxxxxxxxxxxxxxxxnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullxxxxxxxxxxxxxxxxnullnullnullnullnullnullnullnull!" + "'", str2, "xxxxxxxxxxxxxxxxnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullxxxxxxxxxxxxxxxxnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!", "F!HHF!HHF!HHF!HHF!HHF!HHF!HHF!HH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhh!" + "'", str2, "nullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhh!");
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullaanullnullaanullnullaanullnullaanullnullaanullnullaanullnullaanullnullaa!", "!\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!!", "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!!" + "'", str2, "nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!!");
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHH!", "fehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!" + "'", str2, "EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!");
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UNLLUNLLUNLLUNLLULLLULLLULLLULLLUNLLUNLLUNLLUNLLULLLULLL!", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!!", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!!" + "'", str2, "~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!!");
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!", "\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!" + "'", str2, "L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!");
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!", "\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!" + "'", str2, "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!" + "'", str2, "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!", "\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!", "h]hhh]hh!!h]hhh]hh!!h]hhh]hhh]hhh]hh!!h]hhh]hh!!h]hhh]hh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!" + "'", str2, "!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!");
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198nullnull!", "JILLJILLJILLJILLJILLJILLJILLJILL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullijllijllijllijllnullnullnullnullijllijll!" + "'", str2, "nullnullnullnullijllijllijllijllnullnullnullnullijllijll!");
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLUUUULL!", "LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0106\u0106\u0106\u0106!" + "'", str2, "\u0106\u0106\u0106\u0106!");
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8!", "NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!", "\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108nullnull!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!" + "'", str2, "!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!");
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNNNLNNN!", "P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200~~~\200~~~!" + "'", str2, "\200~~~\200~~~!");
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhh!", "`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016enullnullnullnull!" + "'", str2, "\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016enullnullnullnull!");
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("TT!!TT!!!", "UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!!" + "'", str2, "LL!!LL!!!");
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0106\u0106\u0106\u0106!", "\u0346\u0348\u0348\u0348\u0345\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u0345\u0348\u0346\u0346!", "NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLUULLUULLUULLUULLUULLUULLUULLUU!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!!", "!\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!!" + "'", str2, "\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!!");
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0108\u0106\u0106\u0106\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0108\u0106\u0106\u0106\u0348\u0346\u0346!");
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nulloprr!", "^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u03dd\u03de\u03e0\u03e0nullnullnullnull!" + "'", str2, "\u03dd\u03de\u03e0\u03e0nullnullnullnull!");
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014b\u014c\u014e\u014e\u014b\u014c\u014e\u014e!", "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\226!", "\u0346\u0348\u0348\u0348\u0108\u0106\u0106\u0106\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\226!" + "'", str2, "!\226!");
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!", "\276\276!!\276\276!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!", "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("JILLJILLJILLJILLJILLJILLJILLJILL!", "UNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!" + "'", str2, "nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!");
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!", "!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!!" + "'", str2, "H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!!");
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLL]]!", "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214!", "RRPPRRPPRRPPRRPPRRPPRRPPRRPPRRPP!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!" + "'", str2, "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!");
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e!", "H!!!H!!!H!!!H!!!H!!!H!!!H!!!H!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!u!", "ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!L!" + "'", str2, "!L!");
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!", "l!uul!uul!uul!uul!uul!uul!uul!uu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!" + "'", str2, "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!");
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\200}}`\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300]]!", "NULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225!", "\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225!" + "'", str2, "nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225!");
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106nullLL!!!", "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420!!!" + "'", str2, "\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420!!!");
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("U~LLU~LL!!U~LLU~LL!!U~LLU~LLU~LLU~LL!!U~LLU~LL!!U~LLU~LL!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348!" + "'", str2, "\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348!");
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!", "\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("unllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunll!", "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!" + "'", str2, "LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!");
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ULLLULLLULLLULLLULLLULLLULLLULLL!", "\u0128\u0126\u0126\u0108\u0106\u0106!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JLLLJLLLJLLLJLLLJLLLJLLLJLLLJLLL!" + "'", str2, "JLLLJLLLJLLLJLLLJLLLJLLLJLLLJLLL!");
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!!", "LULLLULL!!LULLLULL!!LULLLULLLULLLULL!!LULLLULL!!LULLLULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!" + "'", str2, "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!");
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!", "UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108nullnull!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0346\u0348\u0348!");
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!", "nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!" + "'", str2, "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!");
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\200\200!!\200\200!!!", "nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200!!\200\200!!!" + "'", str2, "\200\200!!\200\200!!!");
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!" + "'", str2, "\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!");
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLUUUULL!", "ULLLULLLULLLULLLULLLULLLULLLULLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUUUULL!" + "'", str2, "LLUUUULL!");
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!!", "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!!" + "'", str2, "UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!!");
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106nullLL!!!", "!null!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200}}`\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230]]!", "NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200}}`\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230]]!" + "'", str2, "\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200}}`\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230]]!");
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull!", "LNLLLNLL!!LNLLLNLL!!LNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230!");
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("h]hhh]hh!!h]hhh]hh!!h]hhh]hhh]hhh]hh!!h]hhh]hh!!h]hhh]hh!", "\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!" + "'", str2, "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!");
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014f!", "\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!" + "'", str2, "!null!");
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108!", "\253\254\256\256\253\254\256\256!!\253\254\256\256\253\254\256\256!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e!", "JLLLJLLLJLLLJLLLJLLLJLLLJLLLJLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "``!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!", "LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0107\u0105\u0109\u0109\u0107\u0105\u0109\u0109!", "XXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxx!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!", "LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!" + "'", str2, "!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!");
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!!", "~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!!" + "'", str2, "~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!!");
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```!" + "'", str2, "null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```!");
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!", "nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!u!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!" + "'", str2, "!null!");
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("lluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUU!", "nullnullBBnullnullBB!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPP!" + "'", str2, "rrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPP!");
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!" + "'", str2, "!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!");
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300!", "nullnullnullnullijllijllijllijllnullnullnullnullijllijll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnull!" + "'", str2, "LLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnull!");
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!", "``!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300!", "UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnull!" + "'", str2, "nullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnull!");
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!", "FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!" + "'", str2, "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!");
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!", "\305\306\310\310\305\306\310\310!!\305\306\310\310\305\306\310\310!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!!" + "'", str2, "\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!!");
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnull!", "ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340!" + "'", str2, "null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340!");
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!" + "'", str2, "!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!");
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UUUUUUUU!", "nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!" + "'", str2, "!!!!!!!!!");
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```!", "\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```!" + "'", str2, "nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```!");
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!", "\275\300\300\300\276\300\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull!" + "'", str2, "\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!", "`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!" + "'", str2, "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!");
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull!" + "'", str2, "}~\200\200}~\200\200nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e!!!", "\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBB!", "!L!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnull!" + "'", str2, "nullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnull!");
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLL!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e!", "~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!", "\u0170null!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!" + "'", str2, "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!");
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!", "EHHHEHHHEHHHEHHHEHHHEHHHEHHHEHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!!" + "'", str2, "hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!!");
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!", "\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!" + "'", str2, "\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!");
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("wxzzwxzz!!wxzzwxzz!!wxzzwxzzwxzzwxzz!!wxzzwxzz!!wxzzwxzz!", "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NULLNULL!!NULLNULL!!NULLNULLNULLNULL!!NULLNULL!!NULLNULL!" + "'", str2, "NULLNULL!!NULLNULL!!NULLNULLNULLNULL!!NULLNULL!!NULLNULL!");
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230\200}}`LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230]]!", "\276\276!!\276\276!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230]]!");
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!", "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!");
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!", "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225!", "LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230\200}}`LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225!" + "'", str2, "nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225!");
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336!", "\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNNNLNNN!", "\336\335\340\340\336\335\340\340!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("TT!!TT!!!", "llllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!", "\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LIIILIII!", "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNNNLNNN!" + "'", str2, "LNNNLNNN!");
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!!", "^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!!", "~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!!" + "'", str2, "\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!!");
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!", "nullnullnullnullZWXXZWXXZWXXZWXXnullnullnullnullZWXXZWXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhh!", "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULL!" + "'", str2, "LNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULL!");
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!", "L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~UU!~UU!~UU!~UU!~UU!~UU!~UU!~UU!!!~UU!~UU!~UU!~UU!~UU!~UU!~UU!~UU!!!" + "'", str2, "!~UU!~UU!~UU!~UU!~UU!~UU!~UU!~UU!!!~UU!~UU!~UU!~UU!~UU!~UU!~UU!~UU!!!");
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!", "nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!", "\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!" + "'", str2, "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!");
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!", "\246\250\250\250\246\250\250\250!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "fehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```!", "UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246!!!```!" + "'", str2, "\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246!!!```!");
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFF!", "\u0107\u0105\u0109\u0109\u0107\u0105\u0109\u0109!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!", "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!" + "'", str2, "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!");
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull!", "nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256!" + "'", str2, "nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256!");
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL!!LL!!!", "H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!" + "'", str2, "!!!!!!!!!");
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("RRPPRRPPRRPPRRPPRRPPRRPPRRPPRRPP!", "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("XXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxx!", "null~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnullnull~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0106\u0106\u0106\u0106!", "ULLLULLL!!ULLLULLL!!ULLLULLLULLLULLL!!ULLLULLL!!ULLLULLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullLULLLULLLULLLULLnullnull!" + "'", str2, "nullnullLULLLULLLULLLULLnullnull!");
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!!", "^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!!" + "'", str2, "^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!!");
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("TT!!TT!!!", "TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!" + "'", str2, "!!!!!!!!!");
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0128\u0128\u0128\u0128\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0128\u0128\u0128\u0128\u0346\u0348\u0348!");
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull!", "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!", "\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016enullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108!" + "'", str2, "\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108!");
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnullnull\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!", "FFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!!" + "'", str2, "]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!!");
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!!", "LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!!" + "'", str2, "LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!!");
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230\200}}`LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230]]!", "nullnullnullnullijllijllijllijllnullnullnullnullijllijll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230\200}}`LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230]]!" + "'", str2, "LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230\200}}`LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230]]!");
    }
}
