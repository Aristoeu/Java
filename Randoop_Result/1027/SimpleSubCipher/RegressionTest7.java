package SimpleSubCipher;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test03501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03501");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL!" + "'", str2, "\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL!");
    }

    @Test
    public void test03502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03502");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL\200}}`!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL]]!", "}~\200\200}~\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL}~\200\200}~\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL\200}}`!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL]]!" + "'", str2, "!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL\200}}`!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL]]!");
    }

    @Test
    public void test03503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03503");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\335\340\u0346\u0348\u0348!", "!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0170\u0170\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0170\u0170\u0346\u0348\u0348!");
    }

    @Test
    public void test03504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03504");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\220nullnull\200}}`null\220nullnull]]!", "]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\335\336\340\340\220\335\336\340\340\335\336\340\340\200}}`\335\336\340\340\220\335\336\340\340\335\336\340\340]]!" + "'", str2, "\335\336\340\340\220\335\336\340\340\335\336\340\340\200}}`\335\336\340\340\220\335\336\340\340\335\336\340\340]]!");
    }

    @Test
    public void test03505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03505");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!", "\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037enullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!" + "'", str2, "\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!");
    }

    @Test
    public void test03506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03506");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "UU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03507");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!UU!!UU!", "\336UUUUnull!!Unull!!!!!!\336UUUUnull!!Unull!!!!!!!!\336UUUUnull!!Unull!!!!!!\336UUUUnull!!Unull!!!!!!!!\336UUUUnull!!Unull!!!!!!\336UUUUnull!!Unull!!!!!!!!\336UUUUnull!!Unull!!!!!!\336UUUUnull!!Unull!!!!!!!!\336UUUUnull!!Unull!!!!!!\336UUUUnull!!Unull!!!!!!!!\336UUUUnull!!Unull!!!!!!\336UUUUnull!!Unull!!!!!!!!\336UUUUnull!!Unull!!!!!!\336UUUUnull!!Unull!!!!!!!!\336UUUUnull!!Unull!!!!!!\336UUUUnull!!Unull!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!" + "'", str2, "!!!!!!!!!");
    }

    @Test
    public void test03508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03508");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340nullnullnullnullnullnullnullnull\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340nullnullnullnullnullnullnullnull!", "FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03509");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03510");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223hfhhhfhhhfhh}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223hfhhhfhhhfhh}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223hfhhhfhhhfhh}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\223]\223\223\223]\223\223!!\223]\223\223\223]\223\223!!\223]\223\223\223]\223\223\223]\223\223\223]\223\223!!\223]\223\223\223]\223\223!!\223]\223\223\223]\223\223!" + "'", str2, "\223]\223\223\223]\223\223!!\223]\223\223\223]\223\223!!\223]\223\223\223]\223\223\223]\223\223\223]\223\223!!\223]\223\223\223]\223\223!!\223]\223\223\223]\223\223!");
    }

    @Test
    public void test03511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03511");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!!", "\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010cnullnull!!!" + "'", str2, "\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010cnullnull!!!");
    }

    @Test
    public void test03512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03512");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108!", "\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03513");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULLUULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03514");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ELLLELLLELLLELLL\200}}`ELLLELLLELLLELLL]]!", "NLUUNLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NnullnullnullNnullnullnullNnullnullnullNnullnullnull\200}}`NnullnullnullNnullnullnullNnullnullnullNnullnullnull]]!" + "'", str2, "NnullnullnullNnullnullnullNnullnullnullNnullnullnull\200}}`NnullnullnullNnullnullnullNnullnullnullNnullnullnull]]!");
    }

    @Test
    public void test03515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03515");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test03516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03516");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!\253\256\256\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!\253\256\256\u0346\u0348\u0348!");
    }

    @Test
    public void test03517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03517");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]!!!]!!!!!]!!!]!!!!!]!!!]!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!", "HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!!!]!!!!!]!!!]!!!!!]!!!]!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!" + "'", str2, "]!!!]!!!!!]!!!]!!!!!]!!!]!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!");
    }

    @Test
    public void test03518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03518");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!!", "\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!!" + "'", str2, "\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!!");
    }

    @Test
    public void test03519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03519");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\200E\220\220\200E\220\220\200E\220\220\200E\220\220\200E\220\220\200E\220\220\200E\220\220\200E\220\220!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220!" + "'", str2, "\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220!");
    }

    @Test
    public void test03520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03520");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e!", "nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230\200}}`nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test03521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03521");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d!!!", "\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af]]null!nullnullnullnull!!!" + "'", str2, "\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af]]null!nullnullnullnull!!!");
    }

    @Test
    public void test03522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03522");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!~nullnull!!!!~nullnull!!!!!!~nullnull!!!!~nullnull!!!!!!~nullnull!!!!~nullnull!!!!~nullnull!!!!~nullnull!!!!!!~nullnull!!!!~nullnull!!!!!!~nullnull!!!!~nullnull!!!", "NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~ULLLULLL!!!!~ULLLULLL!!!!!!~ULLLULLL!!!!~ULLLULLL!!!!!!~ULLLULLL!!!!~ULLLULLL!!!!~ULLLULLL!!!!~ULLLULLL!!!!!!~ULLLULLL!!!!~ULLLULLL!!!!!!~ULLLULLL!!!!~ULLLULLL!!!" + "'", str2, "!!~ULLLULLL!!!!~ULLLULLL!!!!!!~ULLLULLL!!!!~ULLLULLL!!!!!!~ULLLULLL!!!!~ULLLULLL!!!!~ULLLULLL!!!!~ULLLULLL!!!!!!~ULLLULLL!!!!~ULLLULLL!!!!!!~ULLLULLL!!!!~ULLLULLL!!!");
    }

    @Test
    public void test03523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03523");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!!" + "'", str2, "NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!!");
    }

    @Test
    public void test03524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03524");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03525");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]^``]^``!!]^``]^``!!]^``]^``]^``]^``!!]^``]^``!!]^``]^``!", "EHHH\200}}`EHHH]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]^``]^``!!]^``]^``!!]^``]^``]^``]^``!!]^``]^``!!]^``]^``!" + "'", str2, "]^``]^``!!]^``]^``!!]^``]^``]^``]^``!!]^``]^``!!]^``]^``!");
    }

    @Test
    public void test03526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03526");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!", "\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!" + "'", str2, "\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!");
    }

    @Test
    public void test03527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03527");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("Lu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!ll!", "\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a!!!!" + "'", str2, "\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a!!!!");
    }

    @Test
    public void test03528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03528");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\u023d\u023e\u0240\u0240\u023d\u023e\u0240\u0240\u023d\u023e\u0240\u0240\u023d\u023e\u0240\u0240!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03529");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220!", "!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220!" + "'", str2, "\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220!");
    }

    @Test
    public void test03530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03530");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275!!!\275!!!\275!!!\275!!!\200}}`\275!!!\275!!!\275!!!\275!!!]]!", "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!!!\275!!!\275!!!\275!!!\200}}`\275!!!\275!!!\275!!!\275!!!]]!" + "'", str2, "\275!!!\275!!!\275!!!\275!!!\200}}`\275!!!\275!!!\275!!!\275!!!]]!");
    }

    @Test
    public void test03531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03531");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!!", "\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016enullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254!!!" + "'", str2, "\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254!!!");
    }

    @Test
    public void test03532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03532");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!!\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!!\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!!\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!!\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!", "L!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!!\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!!\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!!\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!!\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!" + "'", str2, "\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!!\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!!\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!!\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!!\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!");
    }

    @Test
    public void test03533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03533");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348!", "LLLLnullnullnullnullLLLLnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348!" + "'", str2, "\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348!");
    }

    @Test
    public void test03534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03534");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!!", "\u0170null!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!" + "'", str2, "nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!");
    }

    @Test
    public void test03535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03535");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e!!!", "\u0317\u031a\u0317\u031a\u0317\u031a\u0317\u031anullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031anullnull!!!" + "'", str2, "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031anullnull!!!");
    }

    @Test
    public void test03536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03536");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!!", "nullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!!" + "'", str2, "NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!!");
    }

    @Test
    public void test03537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03537");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("``!!``!!``!!``!!``!!``!!``!!``!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!!``!!``!!``!!``!!``!!``!!``!!!" + "'", str2, "``!!``!!``!!``!!``!!``!!``!!``!!!");
    }

    @Test
    public void test03538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03538");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!", "]U!!]U!!!!]U!!]U!!!!]U!!]U!!]U!!]U!!!!]U!!]U!!!!]U!!]U!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test03539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03539");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll!", "\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull!" + "'", str2, "\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull!");
    }

    @Test
    public void test03540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03540");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!", "u`uu`UUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!" + "'", str2, "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!");
    }

    @Test
    public void test03541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03541");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!", "LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!" + "'", str2, "\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!");
    }

    @Test
    public void test03542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03542");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0126\u0128\u0128\u0126\u0128\u0128!", "NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullN!!!nullnullnullN!!!nullnull!" + "'", str2, "nullN!!!nullnullnullN!!!nullnull!");
    }

    @Test
    public void test03543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03543");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("l]lll]ll!!l]lll]ll!!l]lll]lll]lll]ll!!l]lll]ll!!l]lll]ll!", "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225!" + "'", str2, "\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225!");
    }

    @Test
    public void test03544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03544");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!", "\275null~}}null~}}\200\200null~}}null~}}\200\200null~}}null~}}\200\200\276null~}}null~}}\200\200\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!" + "'", str2, "!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!");
    }

    @Test
    public void test03545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03545");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!", "\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!" + "'", str2, "\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!");
    }

    @Test
    public void test03546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03546");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!!", "!tttnullnullnullnull!tttnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!!" + "'", str2, "UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!!");
    }

    @Test
    public void test03547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03547");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```!", "`R!RRRRRR!RRRRRR!RRRRR`R!RRRRRR!RRRRRR!RRRRR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```!" + "'", str2, "nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```!");
    }

    @Test
    public void test03548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03548");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!!", "UUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!!" + "'", str2, "nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!!");
    }

    @Test
    public void test03549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03549");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016eUU!!!!!!!", "`nullnullnull`nullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!!" + "'", str2, "lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!lLLLLnullLLLnullLL!!!!lLLLLnullLLLnullLL!!!!!!!");
    }

    @Test
    public void test03550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03550");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016a\u016a\u016a\u016a\u016a\u016aLL!", "\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\335LLL\335nullLL\335nullLL\335nullLL\335nullLL\335LLL\335nullLL\335nullLL!" + "'", str2, "\335LLL\335nullLL\335nullLL\335nullLL\335nullLL\335LLL\335nullLL\335nullLL!");
    }

    @Test
    public void test03551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03551");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!", "}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!" + "'", str2, "}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!");
    }

    @Test
    public void test03552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03552");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200\u0348\u0346\u0346!", "\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\300\335\335\335\214\300\335\335\335\300\335\335\335\300\335\335\335\214\300\335\335\335\300\335\335\335}~\200\200}~\200\200\300\335\335\335\214\300\335\335\335\300\335\335\335\300\335\335\335\214\300\335\335\335\300\335\335\335}~\200\200}~\200\200\300\335\335\335\214\300\335\335\335\300\335\335\335\300\335\335\335\214\300\335\335\335\300\335\335\335}~\200\200}~\200\200\300\335\335\335\214\300\335\335\335\300\335\335\335\300\335\335\335\214\300\335\335\335\300\335\335\335\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\300\335\335\335\214\300\335\335\335\300\335\335\335\300\335\335\335\214\300\335\335\335\300\335\335\335}~\200\200}~\200\200\300\335\335\335\214\300\335\335\335\300\335\335\335\300\335\335\335\214\300\335\335\335\300\335\335\335}~\200\200}~\200\200\300\335\335\335\214\300\335\335\335\300\335\335\335\300\335\335\335\214\300\335\335\335\300\335\335\335}~\200\200}~\200\200\300\335\335\335\214\300\335\335\335\300\335\335\335\300\335\335\335\214\300\335\335\335\300\335\335\335\u0348\u0346\u0346!");
    }

    @Test
    public void test03553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03553");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!", "\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test03554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03554");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv!", "~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200!" + "'", str2, "\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200!");
    }

    @Test
    public void test03555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03555");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHH!", "nullnull]]nullnull]]LnullnullnullLnullnullnullnullnull]]nullnull]]LnullnullnullLnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLL!" + "'", str2, "UULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLL!");
    }

    @Test
    public void test03556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03556");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03557");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214!", "EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214!");
    }

    @Test
    public void test03558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03558");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!!", "]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test03559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03559");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NNNNNNNNNNNNNNNN\200}}`NNNNNNNNNNNNNNNN]]!", "]!null!!!null!!!null!!!null!!!null!!]]!null!!!null!!]]!null!!!null!!]]!null!!!null!!]]]!null!!!null!!!null!!!null!!!null!!]]!null!!!null!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\305\305\305\305\305\305\305\305\305\305\305\305\305\305\305\305\200}}`\305\305\305\305\305\305\305\305\305\305\305\305\305\305\305\305]]!" + "'", str2, "\305\305\305\305\305\305\305\305\305\305\305\305\305\305\305\305\200}}`\305\305\305\305\305\305\305\305\305\305\305\305\305\305\305\305]]!");
    }

    @Test
    public void test03560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03560");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LIIILIII!", "\u0346\u0348\u0348\u0348\u037b\u037c\u037e\u037e\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03561");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ULNNULNNULNNULNNULNNULNNULNNULNN!!ULNNULNNULNNULNNULNNULNNULNNULNN!!ULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNN!!ULNNULNNULNNULNNULNNULNNULNNULNN!!ULNNULNNULNNULNNULNNULNNULNNULNN!", "LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dcnullnull!" + "'", str2, "\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dcnullnull!");
    }

    @Test
    public void test03562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03562");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!", "!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
    }

    @Test
    public void test03563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03563");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!", "FFFFFFFF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!" + "'", str2, "\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!");
    }

    @Test
    public void test03564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03564");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU}~\200\200}~\200\200LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!", "\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU}~\200\200}~\200\200LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!" + "'", str2, "}~\200\200}~\200\200LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU}~\200\200}~\200\200LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!");
    }

    @Test
    public void test03565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03565");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\335\340\u0346\u0348\u0348!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test03566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03566");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!", "~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
    }

    @Test
    public void test03567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03567");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!!", "nullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!!" + "'", str2, "NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!!");
    }

    @Test
    public void test03568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03568");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!!", "!~UU!~UU!~UU!~UU!~UU!~UU!~UU!~UU!!!~UU!~UU!~UU!~UU!~UU!~UU!~UU!~UU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!!" + "'", str2, "\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!!");
    }

    @Test
    public void test03569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03569");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226nullnull!", "UUNNUUNN!!UUNNUUNN!!UUNNUUNNUUNNUUNN!!UUNNUUNN!!UUNNUUNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!!nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!!nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!!nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!!nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!" + "'", str2, "nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!!nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!!nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!!nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!!nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!");
    }

    @Test
    public void test03570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03570");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!", "NNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!]]!!]]NN]]NN]]!!]]!!]]NN]]NN]]!!]]!!]]NN]]NN]]!!]]!!]]NN]]NN]]!!]]!!]]NN]]NN]]!!]]!!]]NN]]NN]]!!]]!!]]NN]]NN]]!!]]!!]]NN]]NN]]!" + "'", str2, "!!]]!!]]NN]]NN]]!!]]!!]]NN]]NN]]!!]]!!]]NN]]NN]]!!]]!!]]NN]]NN]]!!]]!!]]NN]]NN]]!!]]!!]]NN]]NN]]!!]]!!]]NN]]NN]]!!]]!!]]NN]]NN]]!");
    }

    @Test
    public void test03571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03571");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}}^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!", "``!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!~}}^``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!]]!" + "'", str2, "``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!~}}^``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!]]!");
    }

    @Test
    public void test03572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03572");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214!", "nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!!nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!!nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!!nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!!nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214!" + "'", str2, "\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214!");
    }

    @Test
    public void test03573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03573");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "porrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporr!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03574");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLL!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLL!" + "'", str2, "nullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLL!");
    }

    @Test
    public void test03575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03575");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!~ULLLULLL!!!!~ULLLULLL!!!!!!~ULLLULLL!!!!~ULLLULLL!!!!!!~ULLLULLL!!!!~ULLLULLL!!!!~ULLLULLL!!!!~ULLLULLL!!!!!!~ULLLULLL!!!!~ULLLULLL!!!!!!~ULLLULLL!!!!~ULLLULLL!!!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~LLLLLLLL!!!!~LLLLLLLL!!!!!!~LLLLLLLL!!!!~LLLLLLLL!!!!!!~LLLLLLLL!!!!~LLLLLLLL!!!!~LLLLLLLL!!!!~LLLLLLLL!!!!!!~LLLLLLLL!!!!~LLLLLLLL!!!!!!~LLLLLLLL!!!!~LLLLLLLL!!!" + "'", str2, "!!~LLLLLLLL!!!!~LLLLLLLL!!!!!!~LLLLLLLL!!!!~LLLLLLLL!!!!!!~LLLLLLLL!!!!~LLLLLLLL!!!!~LLLLLLLL!!!!~LLLLLLLL!!!!!!~LLLLLLLL!!!!~LLLLLLLL!!!!!!~LLLLLLLL!!!!~LLLLLLLL!!!");
    }

    @Test
    public void test03576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03576");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!!" + "'", str2, "\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!!");
    }

    @Test
    public void test03577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03577");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!", "JILLJILLJILLJILLJILLJILLJILLJILL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```!");
    }

    @Test
    public void test03578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03578");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("efhhefhhefhhefhhefhhefhhefhhefhh!", "\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03579");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271!", "nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271!" + "'", str2, "\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271!");
    }

    @Test
    public void test03580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03580");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUU!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
    }

    @Test
    public void test03581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03581");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0289\u028a\u028c\u028c!", "porrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporr!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnull!" + "'", str2, "!nullnullnullnull!");
    }

    @Test
    public void test03582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03582");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULL!", "NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test03583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03583");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230\200}}`~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230]]!", "LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~LUUU~~\225\230\230~LUUU~~\225\230\230~LUUU~~\225\230\230~LUUU~~\225\230\230\200}}`~LUUU~~\225\230\230~LUUU~~\225\230\230~LUUU~~\225\230\230~LUUU~~\225\230\230]]!" + "'", str2, "~LUUU~~\225\230\230~LUUU~~\225\230\230~LUUU~~\225\230\230~LUUU~~\225\230\230\200}}`~LUUU~~\225\230\230~LUUU~~\225\230\230~LUUU~~\225\230\230~LUUU~~\225\230\230]]!");
    }

    @Test
    public void test03584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03584");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!", "nullnullnullnullijllijllijllijllnullnullnullnullijllijll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!" + "'", str2, "!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!");
    }

    @Test
    public void test03585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03585");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HH!!HH!!!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLLLLLLLLLLLLLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!!" + "'", str2, "LL!!LL!!!");
    }

    @Test
    public void test03586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03586");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~HH!~HH!!!~HH!~HH!!!~HH!~HH!~HH!~HH!!!~HH!~HH!!!~HH!~HH!", "\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126!" + "'", str2, "\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126!");
    }

    @Test
    public void test03587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03587");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test03588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03588");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03589");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("EHHHEHHHEHHHEHHHEHHHEHHHEHHHEHHH!", "!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03590");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu!", "NNNNNNNN!!NNNNNNNN!!NNNNNNNNNNNNNNNN!!NNNNNNNN!!NNNNNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull!" + "'", str2, "~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull!");
    }

    @Test
    public void test03591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03591");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!", "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!" + "'", str2, "UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!");
    }

    @Test
    public void test03592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03592");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "ijllijllijllijll!ill!ill!ill!illijllijllijllijll!ill!ill!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03593");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276!", "nullnullnullnullnullnullnullnullnnnullnullnullnullnullnullnullnullnnnullnullnullnullnullnullnullnullnnnullnullnullnullnullnullnullnullnnnullnullnullnullnullnullnullnullnnnullnullnullnullnullnullnullnullnnnullnullnullnullnullnullnullnullnnnullnullnullnullnullnullnullnullnn!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276!" + "'", str2, "\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276!");
    }

    @Test
    public void test03594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03594");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!\300\300!!\300\300!!\300\300!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\300\300!!\300\300!!\300\300!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!\220\220!!\220\220!!\220\220!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\220\220!!\220\220!!\220\220!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!\220\220!!\220\220!!\220\220!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\220\220!!\220\220!!\220\220!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test03595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03595");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u037b\u037c\u037e\u037e\u0348\u0346\u0346!", "\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!");
    }

    @Test
    public void test03596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03596");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232!" + "'", str2, "~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232!");
    }

    @Test
    public void test03597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03597");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNN!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUU!" + "'", str2, "LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUU!");
    }

    @Test
    public void test03598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03598");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUU!", "NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNNNLUUNLUUNNNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNNNLUUNLUUNNNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNNNLUUNLUUNNNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNNNLUUNLUUNNNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNNNLUUNLUUNNNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNNNLUUNLUUNNNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNNNLUUNLUUNNNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNNNLUUNLUUNN!" + "'", str2, "NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNNNLUUNLUUNNNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNNNLUUNLUUNNNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNNNLUUNLUUNNNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNNNLUUNLUUNNNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNNNLUUNLUUNNNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNNNLUUNLUUNNNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNNNLUUNLUUNNNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNNNLUUNLUUNN!");
    }

    @Test
    public void test03599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03599");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!!", "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!" + "'", str2, "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
    }

    @Test
    public void test03600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03600");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214!", "\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214!");
    }

    @Test
    public void test03601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03601");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!", "!UUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!" + "'", str2, "UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!");
    }

    @Test
    public void test03602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03602");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!", "porrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporr!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!" + "'", str2, "!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!");
    }

    @Test
    public void test03603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03603");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223hfhhhfhhhfhh}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223hfhhhfhhhfhh}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223hfhhhfhhhfhh}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254!!!" + "'", str2, "\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254!!!");
    }

    @Test
    public void test03604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03604");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275UNLLUNLLUNLL\276UNLL\275\275!", "null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\u01ae\u01ad\u01b0\u01b0\u01ae\u01ad\u01b0\u01b0\u01ae\u01ad\u01b0\u01b0\276\u01ae\u01ad\u01b0\u01b0\275\275!" + "'", str2, "\275\u01ae\u01ad\u01b0\u01b0\u01ae\u01ad\u01b0\u01b0\u01ae\u01ad\u01b0\u01b0\276\u01ae\u01ad\u01b0\u01b0\275\275!");
    }

    @Test
    public void test03605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03605");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NN!!U`LLU`LLU`LLNN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!U`LLU`LLU`LLNN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!", "\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!\336`\336\336\336`\336\336\336`\336\336LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\336`\336\336\336`\336\336\336`\336\336LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!" + "'", str2, "LL!!\336`\336\336\336`\336\336\336`\336\336LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\336`\336\336\336`\336\336\336`\336\336LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
    }

    @Test
    public void test03606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03606");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u0346\u0348\u0348\u0348\u0345\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test03607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03607");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276!!\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276!!\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276!!\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276!!\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276!", "\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276!!\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276!!\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276!!\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276!!\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276!" + "'", str2, "\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276!!\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276!!\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276!!\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276!!\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276!");
    }

    @Test
    public void test03608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03608");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200\u0170\u0170\u0170\u0170\u0170\u0170nullnullnull}~\200\200}~\200\200\u0170\u0170\u0170\u0170\u0170\u0170nullnullnull!", "LNLLLNLL!!LNLLLNLL!!LNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200nullLLNNLLNNLLNN^nullLLNNLLNNLLNNnullLLNNLLNNLLNNnullLLNNLLNNLLNN^nullLLNNLLNNLLNNnullLLNNLLNNLLNN}~\200\200}~\200\200nullLLNNLLNNLLNN^nullLLNNLLNNLLNNnullLLNNLLNNLLNNnullLLNNLLNNLLNN^nullLLNNLLNNLLNNnullLLNNLLNNLLNN!" + "'", str2, "}~\200\200}~\200\200nullLLNNLLNNLLNN^nullLLNNLLNNLLNNnullLLNNLLNNLLNNnullLLNNLLNNLLNN^nullLLNNLLNNLLNNnullLLNNLLNNLLNN}~\200\200}~\200\200nullLLNNLLNNLLNN^nullLLNNLLNNLLNNnullLLNNLLNNLLNNnullLLNNLLNNLLNN^nullLLNNLLNNLLNNnullLLNNLLNNLLNN!");
    }

    @Test
    public void test03609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03609");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03610");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\276\300\300\300null\276\276\300null\276\276\300null\276\276\300null\276\276null\276\300\300\300null\276\276\300null\276\276!", "~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLL\276LLLLLLL\276\276LLLLL\276\276LLLLL\276\276LLLLL\276\276LLLL\276LLLLLLL\276\276LLLLL\276\276!" + "'", str2, "LLLL\276LLLLLLL\276\276LLLLL\276\276LLLLL\276\276LLLLL\276\276LLLL\276LLLLLLL\276\276LLLLL\276\276!");
    }

    @Test
    public void test03611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03611");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!UUUUUUUUUUUUUUUU!", "\275!!!\275\275!!\275\275!!\275\275!!\275\275!!\275!!!\275\275!!\275\275!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03612");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullEHHHEHHHEHHHnullnullnullnullEHHHEHHHEHHHnullnullnullnullEHHHEHHHEHHHnullnullnullnullEHHHEHHHEHHHnullnullnullnullEHHHEHHHEHHHnullnullnullnullEHHHEHHHEHHHnullnullnullnullEHHHEHHHEHHHnullnullnullnullEHHHEHHHEHHH!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "llllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLL!" + "'", str2, "llllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLL!");
    }

    @Test
    public void test03613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03613");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff!" + "'", str2, "``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff!");
    }

    @Test
    public void test03614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03614");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!!", "ORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!!" + "'", str2, "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!!");
    }

    @Test
    public void test03615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03615");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348!", "LLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348!" + "'", str2, "\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348!");
    }

    @Test
    public void test03616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03616");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NULLNULL!", "\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275LLL\275LLL!" + "'", str2, "\275LLL\275LLL!");
    }

    @Test
    public void test03617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03617");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225!" + "'", str2, "LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225!");
    }

    @Test
    public void test03618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03618");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLULNN!", "~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03619");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "FF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test03620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03620");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!", "\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!!" + "'", str2, "\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!!");
    }

    @Test
    public void test03621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03621");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NNNNNNNN!!NNNNNNNN!!NNNNNNNNNNNNNNNN!!NNNNNNNN!!NNNNNNNN!", "LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03622");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!", "LUUULUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!" + "'", str2, "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!");
    }

    @Test
    public void test03623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03623");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]!!]]!!}}]]!!]]!!}}!", "efhhefhhefhhefhhefhhefhhefhhefhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]!!]]!!}}]]!!]]!!}}!" + "'", str2, "]]!!]]!!}}]]!!]]!!}}!");
    }

    @Test
    public void test03624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03624");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03625");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnull~}}^nullnullnullnull]]!", "f]fff]ff!!f]fff]ff!!f]fff]fff]fff]ff!!f]fff]ff!!f]fff]ff!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FF]]FF]]FF]]FF]]~}}^FF]]FF]]FF]]FF]]]]!" + "'", str2, "FF]]FF]]FF]]FF]]~}}^FF]]FF]]FF]]FF]]]]!");
    }

    @Test
    public void test03626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03626");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!\200}}`!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!]]!", "\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe!!!```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!\200}}`!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!]]!" + "'", str2, "!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!\200}}`!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!]]!");
    }

    @Test
    public void test03627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03627");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u01c8\u01c5\u01c5\u01c5\u01c8\u01c5\u01c5\u01c5!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03628");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "!!~~!!~~!!!!~~!!~~!!!!~~!!~~!!~~!!~~!!!!~~!!~~!!!!~~!!~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03629");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("hfhhhfhh!!hfhhhfhh!!hfhhhfhhhfhhhfhh!!hfhhhfhh!!hfhhhfhh!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03630");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!!" + "'", str2, "UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!!");
    }

    @Test
    public void test03631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03631");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200!", "\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnull}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnull}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200!" + "'", str2, "null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnull}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnull}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200!");
    }

    @Test
    public void test03632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03632");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03633");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253!", "NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253!" + "'", str2, "\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253!");
    }

    @Test
    public void test03634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03634");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03635");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!", "nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
    }

    @Test
    public void test03636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03636");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275!", "\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275!" + "'", str2, "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275!");
    }

    @Test
    public void test03637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03637");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!!", "\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\270U\270\270\270U\270\270!!\270U\270\270\270U\270\270!!\270U\270\270\270U\270\270!!\270U\270\270\270U\270\270!!\270U\270\270\270U\270\270!!\270U\270\270\270U\270\270!!\270U\270\270\270U\270\270!!\270U\270\270\270U\270\270!!!" + "'", str2, "\270U\270\270\270U\270\270!!\270U\270\270\270U\270\270!!\270U\270\270\270U\270\270!!\270U\270\270\270U\270\270!!\270U\270\270\270U\270\270!!\270U\270\270\270U\270\270!!\270U\270\270\270U\270\270!!\270U\270\270\270U\270\270!!!");
    }

    @Test
    public void test03638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03638");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!eeeeeeeeeeeeeeee!", "!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03639");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!", "\u0170null!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!" + "'", str2, "!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!");
    }

    @Test
    public void test03640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03640");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!!", "UNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!!" + "'", str2, "LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!!");
    }

    @Test
    public void test03641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03641");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]^``]^``!!]^``]^``!!]^``]^``]^``]^``!!]^``]^``!!]^``]^``!", "UUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]^``]^``!!]^``]^``!!]^``]^``]^``]^``!!]^``]^``!!]^``]^``!" + "'", str2, "]^``]^``!!]^``]^``!!]^``]^``]^``]^``!!]^``]^``!!]^``]^``!");
    }

    @Test
    public void test03642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03642");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!", "UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013dnullnullnullnull!" + "'", str2, "\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013dnullnullnullnull!");
    }

    @Test
    public void test03643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03643");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!!", "\275}~\200\200}~\200\200}~\200\200\276}~\200\200\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!!" + "'", str2, "\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!!");
    }

    @Test
    public void test03644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03644");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f!", "\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275!!\275\275!!!!\275\275!!\275\275!!!!!" + "'", str2, "\275\275!!\275\275!!!!\275\275!!\275\275!!!!!");
    }

    @Test
    public void test03645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03645");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126!!!", "L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test03646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03646");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("XXXXXXXX!!XXXXXXXX!!XXXXXXXXXXXXXXXX!!XXXXXXXX!!XXXXXXXX!", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNN!!NNNNNNNN!!NNNNNNNNNNNNNNNN!!NNNNNNNN!!NNNNNNNN!" + "'", str2, "NNNNNNNN!!NNNNNNNN!!NNNNNNNNNNNNNNNN!!NNNNNNNN!!NNNNNNNN!");
    }

    @Test
    public void test03647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03647");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!", "\u0366\u0365\u0368\u0368\254\254\254\254\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!" + "'", str2, "null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
    }

    @Test
    public void test03648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03648");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL]]!", "Lu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!ll!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\200\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0]]!" + "'", str2, "\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\200\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0]]!");
    }

    @Test
    public void test03649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03649");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("````````````````````````````````!", "\u0346\u0348\u0348\u0348\216\254\254\254\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````````````````````!" + "'", str2, "````````````````````````````````!");
    }

    @Test
    public void test03650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03650");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106!", "!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!" + "'", str2, "!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!");
    }

    @Test
    public void test03651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03651");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!", "EHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!" + "'", str2, "!!!");
    }

    @Test
    public void test03652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03652");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU}~\200\200}~\200\200NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX}~\200\200}~\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!" + "'", str2, "}~\200\200}~\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX}~\200\200}~\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
    }

    @Test
    public void test03653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03653");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULL!", "UBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8nullnull!" + "'", str2, "\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8nullnull!");
    }

    @Test
    public void test03654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03654");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "NN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull!" + "'", str2, "!\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull!");
    }

    @Test
    public void test03655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03655");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!!", "EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!!" + "'", str2, "\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!!");
    }

    @Test
    public void test03656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03656");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200LUUULUUULUUULUUULUUULUUULUUULUUU}~\200\200}~\200\200LUUULUUULUUULUUULUUULUUULUUULUUU!", "!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e}~\200\200}~\200\200\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e!" + "'", str2, "}~\200\200}~\200\200\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e}~\200\200}~\200\200\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e!");
    }

    @Test
    public void test03657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03657");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!LL!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!ll!" + "'", str2, "!!!ll!");
    }

    @Test
    public void test03658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03658");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03659");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230\200}}`UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03660");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("F!HHF!HHF!HHF!HHF!HHF!HHF!HHF!HH!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test03661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03661");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!H!", "\352\356\356\356\352\356\356\356\352\356\356\356\352\356\356\356\200}}`\352\356\356\356\352\356\356\356\352\356\356\356\352\356\356\356]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!" + "'", str2, "!null!");
    }

    @Test
    public void test03662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03662");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!", "\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03663");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226!!null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226!!!", "\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!!" + "'", str2, "nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!!");
    }

    @Test
    public void test03664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03664");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("T!!!T!!!T!!!T!!!T!!!T!!!T!!!T!!!!", "null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!" + "'", str2, "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
    }

    @Test
    public void test03665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03665");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!!", "XXUUXXUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!!" + "'", str2, "\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!!");
    }

    @Test
    public void test03666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03666");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullF!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "qrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "R!~~R!~~R!~~R!~~R!~~R!~~R!~~R!~~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLR!~~R!~~R!~~R!~~R!~~R!~~R!~~R!~~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!" + "'", str2, "R!~~R!~~R!~~R!~~R!~~R!~~R!~~R!~~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLR!~~R!~~R!~~R!~~R!~~R!~~R!~~R!~~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
    }

    @Test
    public void test03667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03667");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!!", "\336\300\300\300\300\336\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!!" + "'", str2, "nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!!");
    }

    @Test
    public void test03668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03668");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\254\256\256\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128nullnull\253\254\256\256\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128nullnull!", "!!\256N!NN\254\254\256N!NN\254\254!!\256N!NN\254\254\256N!NN\254\254!!\256N!NN\254\254\256N!NN\254\254!!\256N!NN\254\254\256N!NN\254\254!!\256N!NN\254\254\256N!NN\254\254!!\256N!NN\254\254\256N!NN\254\254!!\256N!NN\254\254\256N!NN\254\254!!\256N!NN\254\254\256N!NN\254\254!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!\253\254\256\256N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!!" + "'", str2, "\253\254\256\256N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!\253\254\256\256N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!!");
    }

    @Test
    public void test03669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03669");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368!!\216\216\u0346\u0348\u0348!", "]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!!\216\216\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!!\216\216\u0346\u0348\u0348!");
    }

    @Test
    public void test03670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03670");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```!", "\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016enullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```!");
    }

    @Test
    public void test03671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03671");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLNLLLNLLLNLLLLLNNLLNNLLNNLLNNNLLLNLLLNLLLNLLLLLNNLLNN!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03672");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!", "l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn!!l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!" + "'", str2, "]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!");
    }

    @Test
    public void test03673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03673");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368nullnull!!nullnull!!\200\200\u0346\u0348\u0348!", "nullnull\226\226nullnull\226\226nullnullvvnullnullvvnullnull\226\226nullnull\226\226nullnullvvnullnullvvnullnull\226\226nullnull\226\226nullnullvvnullnullvvnullnull\226\226nullnull\226\226nullnullvvnullnullvvnullnull\226\226nullnull\226\226nullnullvvnullnullvvnullnull\226\226nullnull\226\226nullnullvvnullnullvvnullnull\226\226nullnull\226\226nullnullvvnullnullvvnullnull\226\226nullnull\226\226nullnullvvnullnullvv!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368ULLLULLL!!ULLLULLL!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368ULLLULLL!!ULLLULLL!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test03674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03674");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!", "!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test03675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03675");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!", "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03676");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275XXX\275XXX!", "UNLLUNLLUNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnull\275nullnullnull!" + "'", str2, "\275nullnullnull\275nullnullnull!");
    }

    @Test
    public void test03677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03677");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]AAAAA]]AA]]AA]]AA]]]AAAAA]]AA]]!", "\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]\300\300\300\300\300]]\300\300]]\300\300]]\300\300]]]\300\300\300\300\300]]\300\300]]!" + "'", str2, "]\300\300\300\300\300]]\300\300]]\300\300]]\300\300]]]\300\300\300\300\300]]\300\300]]!");
    }

    @Test
    public void test03678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03678");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e!", "nullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljj!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ!" + "'", str2, "~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ!");
    }

    @Test
    public void test03679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03679");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF}~\200\200}~\200\200FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}~\200\200}~\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "}~\200\200}~\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}~\200\200}~\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test03680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03680");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("qrttqrttnullnullqrttqrttnullnull!", "\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03681");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!\200}}`!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!]]!", "TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\200}}`!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!]]!" + "'", str2, "!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\200}}`!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!]]!");
    }

    @Test
    public void test03682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03682");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LL!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test03683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03683");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226!!ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!!" + "'", str2, "nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!!");
    }

    @Test
    public void test03684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03684");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~!", "hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HH!!H~~HH!!H~~HH!!H~~HH!!H~~HH!!H~~HH!!H~~HH!!H~~HH!!H~~!" + "'", str2, "HH!!H~~HH!!H~~HH!!H~~HH!!H~~HH!!H~~HH!!H~~HH!!H~~HH!!H~~!");
    }

    @Test
    public void test03685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03685");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "l!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!" + "'", str2, "!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!");
    }

    @Test
    public void test03686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03686");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH!!\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH!!\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH!!\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH!!\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH!", "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!!" + "'", str2, "\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!!");
    }

    @Test
    public void test03687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03687");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\276\276\276\276\276!!\276\276!!\276\276!!\276\276!!!", "NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL\200}}`NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276\276\276\276\276!!\276\276!!\276\276!!\276\276!!!" + "'", str2, "!\276\276\276\276\276!!\276\276!!\276\276!!\276\276!!!");
    }

    @Test
    public void test03688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03688");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!", "ULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!" + "'", str2, "\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!");
    }

    @Test
    public void test03689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03689");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128!", "^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03690");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150!!\200\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150!!]]!", "!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\200}}`!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!]]!" + "'", str2, "!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\200}}`!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!]]!");
    }

    @Test
    public void test03691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03691");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!", "!\253\253\253!\253\253\253!\253\253\253!\253\253\253\200}}`!\253\253\253!\253\253\253!\253\253\253!\253\253\253]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253!" + "'", str2, "\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253!");
    }

    @Test
    public void test03692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03692");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~HH!~HH!!!~HH!~HH!!!~HH!~HH!~HH!~HH!!!~HH!~HH!!!~HH!~HH!", "\223]\223\223\223]\223\223!!\223]\223\223\223]\223\223!!\223]\223\223\223]\223\223\223]\223\223\223]\223\223!!\223]\223\223\223]\223\223!!\223]\223\223\223]\223\223!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!" + "'", str2, "!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!");
    }

    @Test
    public void test03693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03693");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NNLLLLNN!", "l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230\200}}`l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0259\u0259\u0256\u0256\u0256\u0256\u0259\u0259!" + "'", str2, "\u0259\u0259\u0256\u0256\u0256\u0256\u0259\u0259!");
    }

    @Test
    public void test03694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03694");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225!", "J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225!" + "'", str2, "\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225!");
    }

    @Test
    public void test03695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03695");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03696");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368!", "~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
    }

    @Test
    public void test03697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03697");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!" + "'", str2, "!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!");
    }

    @Test
    public void test03698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03698");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn!!l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn!!!", "UUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!!U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!!!" + "'", str2, "U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!!U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!!!");
    }

    @Test
    public void test03699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03699");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!", "NLNNNLNNnullN\214\214nullN\214\214NLNNNLNNnullN\214\214nullN\214\214NLNNNLNNnullN\214\214nullN\214\214NLNNNLNNnullN\214\214nullN\214\214NLNNNLNNnullN\214\214nullN\214\214NLNNNLNNnullN\214\214nullN\214\214NLNNNLNNnullN\214\214nullN\214\214NLNNNLNNnullN\214\214nullN\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test03700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03700");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0108!", "u\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluu!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!" + "'", str2, "!null!");
    }

    @Test
    public void test03701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03701");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NNUUNNUU!!NNUUNNUU!!NNUUNNUUNNUUNNUU!!NNUUNNUU!!NNUUNNUU!", "nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\351\351\352\352\351\351\352\352!!\351\351\352\352\351\351\352\352!!\351\351\352\352\351\351\352\352\351\351\352\352\351\351\352\352!!\351\351\352\352\351\351\352\352!!\351\351\352\352\351\351\352\352!" + "'", str2, "\351\351\352\352\351\351\352\352!!\351\351\352\352\351\351\352\352!!\351\351\352\352\351\351\352\352\351\351\352\352\351\351\352\352!!\351\351\352\352\351\351\352\352!!\351\351\352\352\351\351\352\352!");
    }

    @Test
    public void test03702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03702");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL!", "\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!" + "'", str2, "\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!");
    }

    @Test
    public void test03703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03703");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300!", "}~\200\200}~\200\200ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL}~\200\200}~\200\200ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL!" + "'", str2, "\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL!");
    }

    @Test
    public void test03704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03704");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\256nullnullnull!", "\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\256nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull\256nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03705");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!", "null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!!null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!!null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!!null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!!null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!" + "'", str2, "!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!");
    }

    @Test
    public void test03706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03706");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0129\u0129\u0129\u0129nullll!", "~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02be\u02be\u02bb\u02bc\u02be\u02be\u02be\u02be\u02bb\u02bc\u02be\u02be\u02be\u02be\u02bb\u02bc\u02be\u02be\u02be\u02be!" + "'", str2, "\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02be\u02be\u02bb\u02bc\u02be\u02be\u02be\u02be\u02bb\u02bc\u02be\u02be\u02be\u02be\u02bb\u02bc\u02be\u02be\u02be\u02be!");
    }

    @Test
    public void test03707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03707");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````!", "\336\300\300\300\300\336\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````!" + "'", str2, "nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````!");
    }

    @Test
    public void test03708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03708");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullEHHHEHHHEHHHnullnullnullnullEHHHEHHHEHHHnullnullnullnullEHHHEHHHEHHHnullnullnullnullEHHHEHHHEHHHnullnullnullnullEHHHEHHHEHHHnullnullnullnullEHHHEHHHEHHHnullnullnullnullEHHHEHHHEHHHnullnullnullnullEHHHEHHHEHHH!", "null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullqrttqrttqrttqrttqrttqrttqrttqrttnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullqrttqrttqrttqrttqrttqrttqrttqrtt!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03709");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256!", "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLL!!!LLLL!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256!" + "'", str2, "~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256!");
    }

    @Test
    public void test03710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03710");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("lluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUU!", "\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176!" + "'", str2, "\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176!");
    }

    @Test
    public void test03711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03711");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test03712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03712");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!" + "'", str2, "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
    }

    @Test
    public void test03713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03713");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("f]fff]ff!!f]fff]ff!!f]fff]fff]fff]ff!!f]fff]ff!!f]fff]ff!", "\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U]UUU]UU!!U]UUU]UU!!U]UUU]UUU]UUU]UU!!U]UUU]UU!!U]UUU]UU!" + "'", str2, "U]UUU]UU!!U]UUU]UU!!U]UUU]UUU]UUU]UU!!U]UUU]UU!!U]UUU]UU!");
    }

    @Test
    public void test03714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03714");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248!", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03715");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336!", "!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ!" + "'", str2, "~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ!");
    }

    @Test
    public void test03716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03716");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NULLNULL!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03717");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!", "NULLNULLNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test03718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03718");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullvvvnullvvvnullvvvnullvvv\200}}`nullvvvnullvvvnullvvvnullvvv]]!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~NNN\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~NNN]]!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~NNN\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~NNN]]!");
    }

    @Test
    public void test03719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03719");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368!", "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
    }

    @Test
    public void test03720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03720");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
    }

    @Test
    public void test03721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03721");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNN!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNN!" + "'", str2, "LNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNN!");
    }

    @Test
    public void test03722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03722");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\254\256\256!JJJ!JJJ!JJJ!JJJ\253\254\256\256!JJJ!JJJ!", "!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!" + "'", str2, "\253\254\256\256!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!");
    }

    @Test
    public void test03723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03723");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\246\250\250\250\246\250\250\250!", "~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\246\250\250\250\246\250\250\250!" + "'", str2, "\246\250\250\250\246\250\250\250!");
    }

    @Test
    public void test03724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03724");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]!", "\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!" + "'", str2, "\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!");
    }

    @Test
    public void test03725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03725");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e!", "FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnull!" + "'", str2, "hfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnull!");
    }

    @Test
    public void test03726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03726");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!", "UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!" + "'", str2, "!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!");
    }

    @Test
    public void test03727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03727");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226!!LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226!!!", "!~HH!~HH!!!~HH!~HH!!!~HH!~HH!~HH!~HH!!!~HH!~HH!!!~HH!~HH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!!" + "'", str2, "nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!!");
    }

    @Test
    public void test03728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03728");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HFFFHFFF!", "null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N!!!N!!!!" + "'", str2, "N!!!N!!!!");
    }

    @Test
    public void test03729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03729");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNN!", "N!LLN!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03730");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\340\340!!nullnullnull\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!nullnullnull\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!!", "\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af]]nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af]]nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test03731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03731");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\216\216\216!\216\216\216!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\216\216\216!\216\216\216!" + "'", str2, "!\216\216\216!\216\216\216!");
    }

    @Test
    public void test03732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03732");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!!L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!!L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!!L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!!L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!", "!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!" + "'", str2, "!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!");
    }

    @Test
    public void test03733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03733");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126!", "!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03734");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("````````````````````````````````!", "NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````````````````````!" + "'", str2, "````````````````````````````````!");
    }

    @Test
    public void test03735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03735");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!", "\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!" + "'", str2, "\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!");
    }

    @Test
    public void test03736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03736");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU\200}}`!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU]]!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368nullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL\200}}`!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL]]!" + "'", str2, "!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL\200}}`!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL]]!");
    }

    @Test
    public void test03737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03737");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223hfhhhfhhhfhh}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223hfhhhfhhhfhh}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223hfhhhfhhhfhh}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223\u0348\u0346\u0346!", "EEEEEEEE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223\u0348\u0346\u0346!");
    }

    @Test
    public void test03738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03738");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EHHH\200}}`EHHH]]!", "nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLL\200}}`NLLL]]!" + "'", str2, "NLLL\200}}`NLLL]]!");
    }

    @Test
    public void test03739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03739");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03740");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`nullnullnull`nullnullnull!", "LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b!" + "'", str2, "\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b!");
    }

    @Test
    public void test03741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03741");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\271\271!!\271\271\271\271!!\271\271!!!!\271\271!!\271\271\271\271!!\271\271!!!", "!X!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\271\271!!\271\271\271\271!!\271\271!!!!\271\271!!\271\271\271\271!!\271\271!!!" + "'", str2, "!!\271\271!!\271\271\271\271!!\271\271!!!!\271\271!!\271\271\271\271!!\271\271!!!");
    }

    @Test
    public void test03742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03742");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("FF!", "NULLNULLNULLNULLNULLNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!" + "'", str2, "nullnull!");
    }

    @Test
    public void test03743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03743");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u0346\u0348\u0348!", "N!LLN!LL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test03744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03744");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```!", "LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```!");
    }

    @Test
    public void test03745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03745");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU\200}}`!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU]]!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN\200}}`!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN]]!" + "'", str2, "!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN\200}}`!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN]]!");
    }

    @Test
    public void test03746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03746");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLL!", "\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03747");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UNLLUNLL!!UNLLUNLL!!!", "LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u041c\u041e\u041b\u041b\u041c\u041e\u041b\u041b\u041c\u041e\u041b\u041b\u041c\u041e\u041b\u041b!!!" + "'", str2, "\u041c\u041e\u041b\u041b\u041c\u041e\u041b\u041b\u041c\u041e\u041b\u041b\u041c\u041e\u041b\u041b!!!");
    }

    @Test
    public void test03748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03748");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!", "\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!" + "'", str2, "\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!");
    }

    @Test
    public void test03749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03749");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ULLLULLLULLLULLL\200}}`ULLLULLLULLLULLL]]!", "!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!]]!" + "'", str2, "!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!]]!");
    }

    @Test
    public void test03750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03750");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03751");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!", "EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!" + "'", str2, "!!!");
    }

    @Test
    public void test03752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03752");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HHFFH~~HHFFH~~HHFFH~~HHFFH~~HHFFH~~HHFFH~~HHFFH~~HHFFH~~!", "nullnull!!nullnull!!]nullnullnull]nullnullnullnullnull!!nullnull!!]nullnullnull]nullnullnullnullnull!!nullnull!!]nullnullnull]nullnullnullnullnull!!nullnull!!]nullnullnull]nullnullnullnullnull!!nullnull!!]nullnullnull]nullnullnullnullnull!!nullnull!!]nullnullnull]nullnullnullnullnull!!nullnull!!]nullnullnull]nullnullnullnullnull!!nullnull!!]nullnullnull]nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~!" + "'", str2, "LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~!");
    }

    @Test
    public void test03753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03753");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleenullhnulleenullnullnullhnulleenullnullhnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleenullhnulleenullnullnullhnulleenullnullhnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleenullhnulleenullnullnullhnulleenullnullhnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleenullhnulleenullnullnullhnulleenullnullhnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleenullhnulleenullnullnullhnulleenullnullhnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleenullhnulleenullnullnullhnulleenullnullhnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleenullhnulleenullnullnullhnulleenullnullhnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleenullhnulleenullnullnullhnulleenullnull!", "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HHHH!!!HH!!HHHH!!HH!!HH!!!HH!!HHHH!!HH!!!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HHHH!!!HH!!HHHH!!HH!!HH!!!HH!!HHHH!!HH!!!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HHHH!!!HH!!HHHH!!HH!!HH!!!HH!!HHHH!!HH!!!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HHHH!!!HH!!HHHH!!HH!!HH!!!HH!!HHHH!!HH!!!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HHHH!!!HH!!HHHH!!HH!!HH!!!HH!!HHHH!!HH!!!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HHHH!!!HH!!HHHH!!HH!!HH!!!HH!!HHHH!!HH!!!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HHHH!!!HH!!HHHH!!HH!!HH!!!HH!!HHHH!!HH!!!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HHHH!!!HH!!HHHH!!HH!!HH!!!HH!!HHHH!!HH!!!" + "'", str2, "!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HHHH!!!HH!!HHHH!!HH!!HH!!!HH!!HHHH!!HH!!!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HHHH!!!HH!!HHHH!!HH!!HH!!!HH!!HHHH!!HH!!!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HHHH!!!HH!!HHHH!!HH!!HH!!!HH!!HHHH!!HH!!!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HHHH!!!HH!!HHHH!!HH!!HH!!!HH!!HHHH!!HH!!!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HHHH!!!HH!!HHHH!!HH!!HH!!!HH!!HHHH!!HH!!!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HHHH!!!HH!!HHHH!!HH!!HH!!!HH!!HHHH!!HH!!!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HHHH!!!HH!!HHHH!!HH!!HH!!!HH!!HHHH!!HH!!!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HHHH!!!HH!!HHHH!!HH!!HH!!!HH!!HHHH!!HH!!!");
    }

    @Test
    public void test03754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03754");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0128\u0126\u0126\u0108\u0106\u0106!", "T!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TT!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03755");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!", "U]UUU]UU!!U]UUU]UU!!U]UUU]UUU]UUU]UU!!U]UUU]UU!!U]UUU]UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU!!]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU!!]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU!!]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU!!]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU!" + "'", str2, "]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU!!]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU!!]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU!!]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU!!]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU!");
    }

    @Test
    public void test03756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03756");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!!", "~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!!" + "'", str2, "LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!!");
    }

    @Test
    public void test03757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03757");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
    }

    @Test
    public void test03758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03758");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!nullnull!!!", "ELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLL!!LLLLLLLL!!!" + "'", str2, "LLLLLLLL!!LLLLLLLL!!!");
    }

    @Test
    public void test03759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03759");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275}~\200\200}~\200\200}~\200\200\276}~\200\200\275\275!", "NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275}~\200\200}~\200\200}~\200\200\276}~\200\200\275\275!" + "'", str2, "\275}~\200\200}~\200\200}~\200\200\276}~\200\200\275\275!");
    }

    @Test
    public void test03760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03760");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!", "LLUU!!!LLUU!!!LLUU!!!LLUU!!!LLUU!!!LLUU!!!LLUU!!!LLUU!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test03761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03761");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]AAAAA]]AA]]AA]]AA]]]AAAAA]]AA]]!", "!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]nullnullnullnullnull]]nullnull]]nullnull]]nullnull]]]nullnullnullnullnull]]nullnull]]!" + "'", str2, "]nullnullnullnullnull]]nullnull]]nullnull]]nullnull]]]nullnullnullnullnull]]nullnull]]!");
    }

    @Test
    public void test03762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03762");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!!", "\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test03763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03763");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!", "LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!" + "'", str2, "!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!");
    }

    @Test
    public void test03764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03764");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d!", "!!~LL!!!!~LL!!!!!!~LL!!!!~LL!!!!!!~LL!!!!~LL!!!!~LL!!!!~LL!!!!!!~LL!!!!~LL!!!!!!~LL!!!!~LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull!" + "'", str2, "\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull!");
    }

    @Test
    public void test03765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03765");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!", "\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test03766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03766");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("X!UUX!UUX!UUX!UUX!UUX!UUX!UUX!UU!", "\u0346\u0348\u0348\u0348\u037b\u037c\u037e\u037e\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test03767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03767");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e!", "`R!RRRRRR!RRRRRR!RRRRR`R!RRRRRR!RRRRRR!RRRRR!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull!" + "'", str2, "~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull!");
    }

    @Test
    public void test03768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03768");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!", "nullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!" + "'", str2, "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!");
    }

    @Test
    public void test03769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03769");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!!", "nullnullLULLLULLLULLLULLnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!!" + "'", str2, "ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!!");
    }

    @Test
    public void test03770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03770");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("l!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLL!", "\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnull!" + "'", str2, "null!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnull!");
    }

    @Test
    public void test03771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03771");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!!!!!!", "\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!" + "'", str2, "!!!!!!!!!");
    }

    @Test
    public void test03772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03772");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!", "L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\340null\335\335\340null\335\335!!\340null\335\335\340null\335\335!!\340null\335\335\340null\335\335\340null\335\335\340null\335\335!!\340null\335\335\340null\335\335!!\340null\335\335\340null\335\335!" + "'", str2, "\340null\335\335\340null\335\335!!\340null\335\335\340null\335\335!!\340null\335\335\340null\335\335\340null\335\335\340null\335\335!!\340null\335\335\340null\335\335!!\340null\335\335\340null\335\335!");
    }

    @Test
    public void test03773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03773");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\215}\215\215\215}\215\215NLLLNLLLNLLLNLLL\215}\215\215\215}\215\215!", "\u0366\u0365\u0368\u0368\245\245\245\245\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\215}\215\215\215}\215\215!");
    }

    @Test
    public void test03774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03774");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275nullnullnull\275nullnullnull!", "\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\275\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c!" + "'", str2, "\275\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\275\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c!");
    }

    @Test
    public void test03775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03775");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!!", "!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!" + "'", str2, "nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!");
    }

    @Test
    public void test03776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03776");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214!", "NULLNULL!!NULLNULL!!NULLNULLNULLNULL!!NULLNULL!!NULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214!" + "'", str2, "\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214!");
    }

    @Test
    public void test03777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03777");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}N\200\200}N\200\200}N\200\200}N\200\200ULLLULLLULLLULLL}N\200\200}N\200\200}N\200\200}N\200\200ULLLULLL!", "NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fanullnullnull!" + "'", str2, "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fanullnullnull!");
    }

    @Test
    public void test03778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03778");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!", "!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!!!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test03779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03779");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLL!", "nullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BB!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178!" + "'", str2, "\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178!");
    }

    @Test
    public void test03780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03780");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!!", "\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test03781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03781");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\220\220!!\220\220!!\220\220!!\220\220\u0346\u0348\u0348!", "xxxxxxxxxxxxxxxxnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullxxxxxxxxxxxxxxxxnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\220\220!!\220\220!!\220\220!!\220\220\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\220\220!!\220\220!!\220\220!!\220\220\u0346\u0348\u0348!");
    }

    @Test
    public void test03782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03782");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!!L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!!L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!!L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!!L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!", "EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHH!!H\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHH!!H\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHH!!H\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHH!!H\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHH!" + "'", str2, "H\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHH!!H\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHH!!H\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHH!!H\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHH!!H\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHH!");
    }

    @Test
    public void test03783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03783");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0346\u0348\u0348!");
    }

    @Test
    public void test03784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03784");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326!", "}~\200\200}~\200\200null^nullnullnull^nullnull}~\200\200}~\200\200null^nullnullnull^nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!" + "'", str2, "\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!");
    }

    @Test
    public void test03785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03785");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128\u0348\u0346\u0346!", "NULLNULLNULLNULLNULL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200u!llnullnullnullu!llnullnullnull}~\200\200}~\200\200u!llnullnullnullu!llnullnullnull}~\200\200}~\200\200u!llnullnullnullu!llnullnullnull}~\200\200}~\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200u!llnullnullnullu!llnullnullnull}~\200\200}~\200\200u!llnullnullnullu!llnullnullnull}~\200\200}~\200\200u!llnullnullnullu!llnullnullnull}~\200\200}~\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test03786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03786");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!", "~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03787");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!" + "'", str2, "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
    }

    @Test
    public void test03788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03788");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~LUUU~~\225\230\230~LUUU~~\225\230\230~LUUU~~\225\230\230~LUUU~~\225\230\230\200}}`~LUUU~~\225\230\230~LUUU~~\225\230\230~LUUU~~\225\230\230~LUUU~~\225\230\230]]!", "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031anullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~LUUU~~\225\230\230~LUUU~~\225\230\230~LUUU~~\225\230\230~LUUU~~\225\230\230\200}}`~LUUU~~\225\230\230~LUUU~~\225\230\230~LUUU~~\225\230\230~LUUU~~\225\230\230]]!" + "'", str2, "~LUUU~~\225\230\230~LUUU~~\225\230\230~LUUU~~\225\230\230~LUUU~~\225\230\230\200}}`~LUUU~~\225\230\230~LUUU~~\225\230\230~LUUU~~\225\230\230~LUUU~~\225\230\230]]!");
    }

    @Test
    public void test03789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03789");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!", "``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!" + "'", str2, "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!");
    }

    @Test
    public void test03790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03790");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL!", "!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c!" + "'", str2, "\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c!");
    }

    @Test
    public void test03791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03791");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226nullnull!", "nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!" + "'", str2, "nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!");
    }

    @Test
    public void test03792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03792");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL}~\200\200}~\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!", "LL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL}~\200\200}~\200\200LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "}~\200\200}~\200\200LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL}~\200\200}~\200\200LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test03793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03793");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!", "\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!" + "'", str2, "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!");
    }

    @Test
    public void test03794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03794");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test03795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03795");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NULLNULL!", "!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\336!!!\336!!!!" + "'", str2, "\336!!!\336!!!!");
    }

    @Test
    public void test03796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03796");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!", "]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!" + "'", str2, "!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!");
    }

    @Test
    public void test03797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03797");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnull!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLL!" + "'", str2, "LLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test03798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03798");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!" + "'", str2, "!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!");
    }

    @Test
    public void test03799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03799");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LUUULUUULUUULUUULUUULUUULUUULUUU!", "nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc!" + "'", str2, "\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc!");
    }

    @Test
    public void test03800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03800");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULL!", "\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347!" + "'", str2, "\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347!");
    }

    @Test
    public void test03801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03801");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d!", "nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230\200}}`nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull!" + "'", str2, "\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull!");
    }

    @Test
    public void test03802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03802");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!!", "]]!!]]!!}}]]!!]]!!}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test03803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03803");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "NLUUNLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03804");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248nullnullnull!", "\u0368\u0368\u0368\u0368!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03805");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ULLLULLLULLLULLLULLLULLLULLLULLL!", "\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03806");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\331\330\333\333\331\330\333\333\331\330\333\333\331\330\333\333!", "\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276!\340\340\276!\340\340\276!\340\340\276!\340\340!" + "'", str2, "!\276!\340\340\276!\340\340\276!\340\340\276!\340\340!");
    }

    @Test
    public void test03807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03807");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230]]!", "]]UU]]UU!!]]UU]]UU!!]]UU]]UU]]UU]]UU!!]]UU]]UU!!]]UU]]UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230\200}}`U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230]]!" + "'", str2, "U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230\200}}`U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230]]!");
    }

    @Test
    public void test03808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03808");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test03809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03809");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03810");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\216\254\254\254\u0348\u0346\u0346!", "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\216\254\254\254\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\216\254\254\254\u0348\u0346\u0346!");
    }

    @Test
    public void test03811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03811");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!", "UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!" + "'", str2, "!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!");
    }

    @Test
    public void test03812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03812");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!", "LLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test03813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03813");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300!", "\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03814");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126!", "!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PORRPORRRR\200~~PORRPORRRR\200~~PORRPORRRRPORRPORRRRPORRPORRRR\200~~PORRPORRRR\200~~PORRPORRRRPORRPORRRR!!PORRPORRRR\200~~PORRPORRRR\200~~PORRPORRRRPORRPORRRRPORRPORRRR\200~~PORRPORRRR\200~~PORRPORRRRPORRPORRRR!!PORRPORRRR\200~~PORRPORRRR\200~~PORRPORRRRPORRPORRRRPORRPORRRR\200~~PORRPORRRR\200~~PORRPORRRRPORRPORRRRPORRPORRRR\200~~PORRPORRRR\200~~PORRPORRRRPORRPORRRRPORRPORRRR\200~~PORRPORRRR\200~~PORRPORRRRPORRPORRRR!!PORRPORRRR\200~~PORRPORRRR\200~~PORRPORRRRPORRPORRRRPORRPORRRR\200~~PORRPORRRR\200~~PORRPORRRRPORRPORRRR!!PORRPORRRR\200~~PORRPORRRR\200~~PORRPORRRRPORRPORRRRPORRPORRRR\200~~PORRPORRRR\200~~PORRPORRRRPORRPORRRR!" + "'", str2, "PORRPORRRR\200~~PORRPORRRR\200~~PORRPORRRRPORRPORRRRPORRPORRRR\200~~PORRPORRRR\200~~PORRPORRRRPORRPORRRR!!PORRPORRRR\200~~PORRPORRRR\200~~PORRPORRRRPORRPORRRRPORRPORRRR\200~~PORRPORRRR\200~~PORRPORRRRPORRPORRRR!!PORRPORRRR\200~~PORRPORRRR\200~~PORRPORRRRPORRPORRRRPORRPORRRR\200~~PORRPORRRR\200~~PORRPORRRRPORRPORRRRPORRPORRRR\200~~PORRPORRRR\200~~PORRPORRRRPORRPORRRRPORRPORRRR\200~~PORRPORRRR\200~~PORRPORRRRPORRPORRRR!!PORRPORRRR\200~~PORRPORRRR\200~~PORRPORRRRPORRPORRRRPORRPORRRR\200~~PORRPORRRR\200~~PORRPORRRRPORRPORRRR!!PORRPORRRR\200~~PORRPORRRR\200~~PORRPORRRRPORRPORRRRPORRPORRRR\200~~PORRPORRRR\200~~PORRPORRRRPORRPORRRR!");
    }

    @Test
    public void test03815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03815");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLL!!!LLLL!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03816");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "nullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u0348\u0346\u0346!");
    }

    @Test
    public void test03817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03817");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150]]!", "\230\230\225\225\230\230\225\225!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}}^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}}^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test03818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03818");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\200}}null\200}}null\200}}null\200}}null\200}}null\200}}null\200}}null\200}}!", "\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u019d\u01a0\u019d\u019d\200\u019d\u01a0\u019d\u019d\200\u019d\u01a0\u019d\u019d\200\u019d\u01a0\u019d\u019d\200\u019d\u01a0\u019d\u019d\200\u019d\u01a0\u019d\u019d\200\u019d\u01a0\u019d\u019d\200\u019d\u01a0\u019d\u019d\200}}!" + "'", str2, "\u019d\u01a0\u019d\u019d\200\u019d\u01a0\u019d\u019d\200\u019d\u01a0\u019d\u019d\200\u019d\u01a0\u019d\u019d\200\u019d\u01a0\u019d\u019d\200\u019d\u01a0\u019d\u019d\200\u019d\u01a0\u019d\u019d\200\u019d\u01a0\u019d\u019d\200}}!");
    }

    @Test
    public void test03819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03819");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u011c\u011e\u011e\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u011c\u011e\u011e\u0346\u0348\u0348!");
    }

    @Test
    public void test03820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03820");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!", "\u0366\u0365\u0368\u0368\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test03821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03821");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UUXXUUXXXXUUXXUUXXXX!", "NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017enullnullnullnull!" + "'", str2, "\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017enullnullnullnull!");
    }

    @Test
    public void test03822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03822");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03823");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLL!", "~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0!" + "'", str2, "\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0!");
    }

    @Test
    public void test03824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03824");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\275\275\275\275\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\275\275\275\275\u0346\u0348\u0348!");
    }

    @Test
    public void test03825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03825");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLL!", "unllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLL!" + "'", str2, "ULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLL!");
    }

    @Test
    public void test03826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03826");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LnullLLLnullLL!!LnullLLLnullLL!!LnullLLLnullLLLnullLLLnullLL!!LnullLLLnullLL!!LnullLLLnullLL!", "nullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUU!!UUUUU!!UU!!UUU!!UUUUU!!UU!!UUU!!UUUUU!!UUUUU!!UUUUU!!UU!!UUU!!UUUUU!!UU!!UUU!!UUUUU!!UU!" + "'", str2, "UUU!!UUUUU!!UU!!UUU!!UUUUU!!UU!!UUU!!UUUUU!!UUUUU!!UUUUU!!UU!!UUU!!UUUUU!!UU!!UUU!!UUUUU!!UU!");
    }

    @Test
    public void test03827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03827");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test03828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03828");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!", "\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!" + "'", str2, "!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!");
    }

    @Test
    public void test03829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03829");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!!", "!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!!" + "'", str2, "\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!!");
    }

    @Test
    public void test03830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03830");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!", "]`^^]`^^!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03831");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!!EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!!EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!!EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!!EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!" + "'", str2, "RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!");
    }

    @Test
    public void test03832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03832");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\276!!\276\276!!!", "NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276!!\276\276!!!" + "'", str2, "\276\276!!\276\276!!!");
    }

    @Test
    public void test03833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03833");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ijllnullnullnullijllnullnullnullijllnullnullnullijllnullnullnullijllnullnullnullijllnullnullnullijllnullnullnullijllnullnullnull!", "~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230\200}}`~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test03834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03834");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u0348\u0346\u0346!", "``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test03835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03835");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03836");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!" + "'", str2, "\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!");
    }

    @Test
    public void test03837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03837");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull}~\200\200}~\200\200\u0348\u0346\u0346!", "L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!!L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!!L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!!L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!!L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u0248\u0248\u0248\u0248}~\200\200}~\200\200\u0248\u0248\u0248\u0248}~\200\200}~\200\200\u0248\u0248\u0248\u0248}~\200\200}~\200\200\u0248\u0248\u0248\u0248\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u0248\u0248\u0248\u0248}~\200\200}~\200\200\u0248\u0248\u0248\u0248}~\200\200}~\200\200\u0248\u0248\u0248\u0248}~\200\200}~\200\200\u0248\u0248\u0248\u0248\u0348\u0346\u0346!");
    }

    @Test
    public void test03838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03838");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254!!!", "LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254!!!" + "'", str2, "\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254!!!");
    }

    @Test
    public void test03839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03839");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e!!!", "efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!!efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!!efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!!efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!!efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!!" + "'", str2, "UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!!");
    }

    @Test
    public void test03840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03840");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!!", "L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!" + "'", str2, "\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!");
    }

    @Test
    public void test03841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03841");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("````````````````````````````````!", "NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````````````````````!" + "'", str2, "````````````````````````````````!");
    }

    @Test
    public void test03842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03842");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214!", "!\253\256\256\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214!" + "'", str2, "\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214!");
    }

    @Test
    public void test03843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03843");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016eUU!!!!!!!", "}~\200\200}~\200\200LUELLUELLUELL^LUELLUELLUELLLUELLUELLUELLLUELLUELLUELL^LUELLUELLUELLLUELLUELLUELL}~\200\200}~\200\200LUELLUELLUELL^LUELLUELLUELLLUELLUELLUELLLUELLUELLUELL^LUELLUELLUELLLUELLUELLUELL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355!!!!!!!" + "'", str2, "\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355!!!!!!!");
    }

    @Test
    public void test03844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03844");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214!", "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214!" + "'", str2, "HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214!");
    }

    @Test
    public void test03845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03845");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!!", "!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN\200}}`!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!!" + "'", str2, "LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!!");
    }

    @Test
    public void test03846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03846");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLL!", "HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!" + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
    }

    @Test
    public void test03847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03847");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204!", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204!" + "'", str2, "HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204HHHH\201\204\204!");
    }

    @Test
    public void test03848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03848");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!", "\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!" + "'", str2, "\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!");
    }

    @Test
    public void test03849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03849");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\246\246!!\246\246!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03850");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03851");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!", "\u0366\u0365\u0368\u0368\u011c\u011e\u011e\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!" + "'", str2, "!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!");
    }

    @Test
    public void test03852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03852");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!", "RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!" + "'", str2, "!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!");
    }

    @Test
    public void test03853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03853");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!", "`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302!" + "'", str2, "\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302!");
    }

    @Test
    public void test03854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03854");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!", "l!uul!uul!uul!uul!uul!uul!uul!uu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276]]nullnull\275\275\276]]nullnull\275\275]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull\276]]nullnull\275\275\276]]nullnull\275\275]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull\276]]nullnull\275\275\276]]nullnull\275\275]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull\276]]nullnull\275\275\276]]nullnull\275\275]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull\276]]nullnull\275\275\276]]nullnull\275\275]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull\276]]nullnull\275\275\276]]nullnull\275\275]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull\276]]nullnull\275\275\276]]nullnull\275\275]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull\276]]nullnull\275\275\276]]nullnull\275\275]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull!" + "'", str2, "\276]]nullnull\275\275\276]]nullnull\275\275]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull\276]]nullnull\275\275\276]]nullnull\275\275]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull\276]]nullnull\275\275\276]]nullnull\275\275]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull\276]]nullnull\275\275\276]]nullnull\275\275]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull\276]]nullnull\275\275\276]]nullnull\275\275]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull\276]]nullnull\275\275\276]]nullnull\275\275]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull\276]]nullnull\275\275\276]]nullnull\275\275]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull\276]]nullnull\275\275\276]]nullnull\275\275]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull]!nullnull!");
    }

    @Test
    public void test03855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03855");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!", "\u041c\u041e\u041b\u041b\u041c\u041e\u041b\u041b\u041c\u041e\u041b\u041b\u041c\u041e\u041b\u041b!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!" + "'", str2, "nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!");
    }

    @Test
    public void test03856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03856");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "!LUU!LUU!LUU!LUU!UUU!UUU!UUU!UUU!LUU!LUU!LUU!LUU!UUU!UUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test03857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03857");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!!", "\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!!" + "'", str2, "\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!!");
    }

    @Test
    public void test03858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03858");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LULLLULL!!LULLLULL!!LULLLULLLULLLULL!!LULLLULL!!LULLLULL!", "NLLLULNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03859");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull!", "LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126!" + "'", str2, "\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126!");
    }

    @Test
    public void test03860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03860");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]!", "]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!" + "'", str2, "\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!");
    }

    @Test
    public void test03861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03861");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL!", "UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull!" + "'", str2, "\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull!");
    }

    @Test
    public void test03862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03862");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL}~\200\200}~\200\200LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!", "!!nullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU}~\200\200}~\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!" + "'", str2, "}~\200\200}~\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU}~\200\200}~\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
    }

    @Test
    public void test03863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03863");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullN!!!nullnullnullN!!!nullnull!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03864");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!", "nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLL!" + "'", str2, "UNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLL!");
    }

    @Test
    public void test03865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03865");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!u!", "\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012anullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!L!" + "'", str2, "!L!");
    }

    @Test
    public void test03866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03866");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLL!", "`NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL`NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLL!" + "'", str2, "LNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLL!");
    }

    @Test
    public void test03867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03867");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276!" + "'", str2, "null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276!");
    }

    @Test
    public void test03868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03868");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("enulleeenulleenullnullenulleeenulleenullnull!!enulleeenulleenullnullenulleeenulleenullnull!!enulleeenulleenullnullenulleeenulleenullnullenulleeenulleenullnullenulleeenulleenullnull!!enulleeenulleenullnullenulleeenulleenullnull!!enulleeenulleenullnullenulleeenulleenullnull!", "\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150nullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!" + "'", str2, "NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!");
    }

    @Test
    public void test03869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03869");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!", "\u0366\u0365\u0368\u0368LL!!LL!!!!LL!!LL!!!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test03870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03870");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]!", "~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230\200}}`~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]!" + "'", str2, "]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]!");
    }

    @Test
    public void test03871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03871");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256!" + "'", str2, "\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256!");
    }

    @Test
    public void test03872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03872");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0346\u0348\u0348!");
    }

    @Test
    public void test03873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03873");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!!!", "\u0366\u0365\u0368\u0368nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a!!!" + "'", str2, "\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a!!!");
    }

    @Test
    public void test03874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03874");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!" + "'", str2, "\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!");
    }

    @Test
    public void test03875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03875");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!", "}~\200\200}~\200\200FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH}~\200\200}~\200\200FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF!!HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF!!HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF!!HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF!!HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF!" + "'", str2, "HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF!!HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF!!HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF!!HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF!!HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF!");
    }

    @Test
    public void test03876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03876");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!", "porrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporr!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!!" + "'", str2, "PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!!");
    }

    @Test
    public void test03877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03877");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!", "\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228!" + "'", str2, "\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228!");
    }

    @Test
    public void test03878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03878");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03879");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "!!!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test03880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03880");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\242null\244\244\242null\244\244nullnull\242null\244\244\242null\244\244nullnull!!\242null\244\244\242null\244\244nullnull\242null\244\244\242null\244\244nullnull!!\242null\244\244\242null\244\244nullnull\242null\244\244\242null\244\244nullnull!!\242null\244\244\242null\244\244nullnull\242null\244\244\242null\244\244nullnull!!\242null\244\244\242null\244\244nullnull\242null\244\244\242null\244\244nullnull!!\242null\244\244\242null\244\244nullnull\242null\244\244\242null\244\244nullnull!!\242null\244\244\242null\244\244nullnull\242null\244\244\242null\244\244nullnull!!\242null\244\244\242null\244\244nullnull\242null\244\244\242null\244\244nullnull!!!" + "'", str2, "\242null\244\244\242null\244\244nullnull\242null\244\244\242null\244\244nullnull!!\242null\244\244\242null\244\244nullnull\242null\244\244\242null\244\244nullnull!!\242null\244\244\242null\244\244nullnull\242null\244\244\242null\244\244nullnull!!\242null\244\244\242null\244\244nullnull\242null\244\244\242null\244\244nullnull!!\242null\244\244\242null\244\244nullnull\242null\244\244\242null\244\244nullnull!!\242null\244\244\242null\244\244nullnull\242null\244\244\242null\244\244nullnull!!\242null\244\244\242null\244\244nullnull\242null\244\244\242null\244\244nullnull!!\242null\244\244\242null\244\244nullnull\242null\244\244\242null\244\244nullnull!!!");
    }

    @Test
    public void test03881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03881");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\335\340\u0346\u0348\u0348!", "!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test03882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03882");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullqrttqrttqrttqrttqrttqrttqrttqrttnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullqrttqrttqrttqrttqrttqrttqrttqrtt!", "\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e!" + "'", str2, "\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e!");
    }

    @Test
    public void test03883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03883");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!!!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!!!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!!!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!!!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!", "LL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!" + "'", str2, "!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!");
    }

    @Test
    public void test03884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03884");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275NULLNULLNULL\276NULL\275\275!", "``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275``UU``UU``UU\276``UU\275\275!" + "'", str2, "\275``UU``UU``UU\276``UU\275\275!");
    }

    @Test
    public void test03885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03885");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}N\200\200}N\200\200}N\200\200}N\200\200ULLLULLLULLLULLL}N\200\200}N\200\200}N\200\200}N\200\200ULLLULLL!", "~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}null\200\200}null\200\200}null\200\200}null\200\200\u029e\u029e\u029e\u029enullnullnull}null\200\200}null\200\200}null\200\200}null\200\200\u029e\u029enullnullnull!" + "'", str2, "}null\200\200}null\200\200}null\200\200}null\200\200\u029e\u029e\u029e\u029enullnullnull}null\200\200}null\200\200}null\200\200}null\200\200\u029e\u029enullnullnull!");
    }

    @Test
    public void test03886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03886");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!", "\u0346\u0348\u0348\u0348\u037b\u037c\u037e\u037e\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!" + "'", str2, "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
    }

    @Test
    public void test03887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03887");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL\200}}`!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL]]!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}}!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\200\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142]]!" + "'", str2, "\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\200\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142]]!");
    }

    @Test
    public void test03888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03888");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull!" + "'", str2, "\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull!");
    }

    @Test
    public void test03889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03889");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!\200}}`!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!]]!", "UNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!\200}}`!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!]]!" + "'", str2, "!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!\200}}`!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!]]!");
    }

    @Test
    public void test03890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03890");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u0366\u0365\u0368\u0368!\253\256\256\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03891");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!", "!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03892");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\253\256\256\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test03893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03893");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253\254\256\256\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\253\254\256\256\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnullnullnull!" + "'", str2, "\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03894");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!!" + "'", str2, "XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!XX!!X!!!");
    }

    @Test
    public void test03895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03895");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!", "\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!");
    }

    @Test
    public void test03896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03896");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275!", "\275!!!\275!!!\275!!!\275!!!\200}}`\275!!!\275!!!\275!!!\275!!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!!\275!!!\275!!\275\275!\275!!!\275!!\275\275!\275!!!\275!!\275\275!\275!!!\275!!\275\275\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!!\275!!!\275!!\275\275!\275!!!\275!!\275\275!" + "'", str2, "\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!!\275!!!\275!!\275\275!\275!!!\275!!\275\275!\275!!!\275!!\275\275!\275!!!\275!!\275\275\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!!\275!!!\275!!\275\275!\275!!!\275!!\275\275!");
    }

    @Test
    public void test03897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03897");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276!", "~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276!" + "'", str2, "nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276!");
    }

    @Test
    public void test03898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03898");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!", "\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!" + "'", str2, "~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!");
    }

    @Test
    public void test03899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03899");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\216\216\216!\216\216\216!", "\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\216\216\216!\216\216\216!" + "'", str2, "!\216\216\216!\216\216\216!");
    }

    @Test
    public void test03900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03900");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!X!", "nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!N!" + "'", str2, "!N!");
    }

    @Test
    public void test03901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03901");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b!", "fehhfehhnullnullfehhfehhnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03902");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248nullnullnull!", "!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUULNUULNUULNUULLUULNUULNUULNUULLUULNUULNUULNUULLUULNUULNUULNUULLUULNUULNUULNUULLUULNUULNUULNUULLUULNUULNUULNUULLUULNUULNUULNUU!" + "'", str2, "LLUULNUULNUULNUULLUULNUULNUULNUULLUULNUULNUULNUULLUULNUULNUULNUULLUULNUULNUULNUULLUULNUULNUULNUULLUULNUULNUULNUULLUULNUULNUULNUU!");
    }

    @Test
    public void test03903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03903");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("wxzzwxzz!!wxzzwxzz!!wxzzwxzzwxzzwxzz!!wxzzwxzz!!wxzzwxzz!", "\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03904");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!", "~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnullUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnull~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnullUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnull~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnullUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnull~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnullUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnull~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnullUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnull~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnullUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnull~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnullUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnull~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnullUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test03905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03905");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!", "nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!" + "'", str2, "!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!");
    }

    @Test
    public void test03906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03906");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200\300\300\300\300^\300\300\300\300\300\300\300\300\300\300\300\300^\300\300\300\300\300\300\300\300}~\200\200}~\200\200\300\300\300\300^\300\300\300\300\300\300\300\300\300\300\300\300^\300\300\300\300\300\300\300\300!", "LL!!\336`\336\336\336`\336\336\336`\336\336LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\336`\336\336\336`\336\336\336`\336\336LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull!" + "'", str2, "}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03907");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0128\u0128\u0128\u0128\u0346\u0348\u0348!", "\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test03908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03908");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull]]nullnull]]LnullnullnullLnullnullnullnullnull]]nullnull]]LnullnullnullLnullnullnull!", "LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull\254\254nullnull\254\254]]nullnull\254\254nullnull\254\254]]\214nullnull\254\254nullnull\254\254nullnull\254\254\214nullnull\254\254nullnull\254\254nullnull\254\254nullnull\254\254nullnull\254\254]]nullnull\254\254nullnull\254\254]]\214nullnull\254\254nullnull\254\254nullnull\254\254\214nullnull\254\254nullnull\254\254nullnull\254\254!" + "'", str2, "nullnull\254\254nullnull\254\254]]nullnull\254\254nullnull\254\254]]\214nullnull\254\254nullnull\254\254nullnull\254\254\214nullnull\254\254nullnull\254\254nullnull\254\254nullnull\254\254nullnull\254\254]]nullnull\254\254nullnull\254\254]]\214nullnull\254\254nullnull\254\254nullnull\254\254\214nullnull\254\254nullnull\254\254nullnull\254\254!");
    }

    @Test
    public void test03909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03909");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!!", "`RRPPRRPPRRPP`RRPPRRPPRRPP!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!!" + "'", str2, "nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!!");
    }

    @Test
    public void test03910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03910");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("II!!II!!II!!II!!II!!II!!II!!II!!!", "}~\200\200}~\200\200\215\215\215\215\215\215\215\215}~\200\200}~\200\200\215\215\215\215\215\215\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!!" + "'", str2, "\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!!");
    }

    @Test
    public void test03911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03911");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230!", "P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230!" + "'", str2, "~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230!");
    }

    @Test
    public void test03912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03912");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129!!!!!", "T!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TT!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!" + "'", str2, "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!");
    }

    @Test
    public void test03913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03913");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03914");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test03915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03915");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!L!", "\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!" + "'", str2, "!null!");
    }

    @Test
    public void test03916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03916");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253\u0346\u0348\u0348!");
    }

    @Test
    public void test03917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03917");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!", "\275LLL\275LLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!!nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!!nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!!nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!!nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!" + "'", str2, "nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!!nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!!nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!!nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!!nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!");
    }

    @Test
    public void test03918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03918");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214!", "NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214!" + "'", str2, "NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214!");
    }

    @Test
    public void test03919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03919");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!", "XXUUXXUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
    }

    @Test
    public void test03920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03920");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108!!!", "LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test03921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03921");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e!", "hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH!" + "'", str2, "~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH!");
    }

    @Test
    public void test03922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03922");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!" + "'", str2, "~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test03923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03923");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108UU!", "NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL\200}}`NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!" + "'", str2, "!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!");
    }

    @Test
    public void test03924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03924");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!!" + "'", str2, "nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!!");
    }

    @Test
    public void test03925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03925");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnull!", "LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd!" + "'", str2, "\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd!");
    }

    @Test
    public void test03926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03926");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`R!RRRRRR!RRRRRR!RRRRR`R!RRRRRR!RRRRRR!RRRRR!", "nullnull\336\336nullnull\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`null!nullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnull`null!nullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnull!" + "'", str2, "`null!nullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnull`null!nullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnull!");
    }

    @Test
    public void test03927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03927");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("````````````````````````````````!", "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````````````````````!" + "'", str2, "````````````````````````````````!");
    }

    @Test
    public void test03928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03928");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!", "\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320\u031e\u031d\u0320\u0320!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!" + "'", str2, "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!");
    }

    @Test
    public void test03929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03929");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("XXUUXXUU!", "\u016e\u016e\u016e\u016e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u016e\u016e\u016e\u016e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014e\u014e\u014e\u014e!" + "'", str2, "\u014e\u014e\u014e\u014e!");
    }

    @Test
    public void test03930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03930");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UUNNNNUU!", "\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\275\275\275\275\276\276!" + "'", str2, "\276\276\275\275\275\275\276\276!");
    }

    @Test
    public void test03931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03931");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300!", "\275NULLNULLNULL\276NULL\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnull!" + "'", str2, "nullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnull!");
    }

    @Test
    public void test03932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03932");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!!");
    }

    @Test
    public void test03933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03933");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\236\276\276null\236\276\276!!null\236\276\276null\236\276\276!!null\236\276\276null\236\276\276null\236\276\276null\236\276\276!!null\236\276\276null\236\276\276!!null\236\276\276null\236\276\276!", "}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!" + "'", str2, "}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!");
    }

    @Test
    public void test03934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03934");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn!", "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214!" + "'", str2, "\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214!");
    }

    @Test
    public void test03935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03935");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!", "!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF\200}}`!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!" + "'", str2, "FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!");
    }

    @Test
    public void test03936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03936");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL!", "\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128nullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200LLUU!LLUULLUULLUU!LLUULLUULLUULLUULLUU!LLUULLUULLUU!LLUULLUULLUULLUU~}\200\200~}\200\200LLUU!LLUULLUULLUU!LLUULLUULLUULLUULLUU!LLUULLUULLUU!LLUULLUULLUULLUU~}\200\200~}\200\200LLUU!LLUULLUULLUU!LLUULLUULLUULLUULLUU!LLUULLUULLUU!LLUULLUULLUULLUU~}\200\200~}\200\200LLUU!LLUULLUULLUU!LLUULLUULLUULLUULLUU!LLUULLUULLUU!LLUULLUULLUULLUU~}\200\200~}\200\200LLUU!LLUULLUULLUU!LLUULLUULLUULLUULLUU!LLUULLUULLUU!LLUULLUULLUULLUU~}\200\200~}\200\200LLUU!LLUULLUULLUU!LLUULLUULLUULLUULLUU!LLUULLUULLUU!LLUULLUULLUULLUU~}\200\200~}\200\200LLUU!LLUULLUULLUU!LLUULLUULLUULLUULLUU!LLUULLUULLUU!LLUULLUULLUULLUU~}\200\200~}\200\200LLUU!LLUULLUULLUU!LLUULLUULLUULLUULLUU!LLUULLUULLUU!LLUULLUULLUULLUU!" + "'", str2, "~}\200\200~}\200\200LLUU!LLUULLUULLUU!LLUULLUULLUULLUULLUU!LLUULLUULLUU!LLUULLUULLUULLUU~}\200\200~}\200\200LLUU!LLUULLUULLUU!LLUULLUULLUULLUULLUU!LLUULLUULLUU!LLUULLUULLUULLUU~}\200\200~}\200\200LLUU!LLUULLUULLUU!LLUULLUULLUULLUULLUU!LLUULLUULLUU!LLUULLUULLUULLUU~}\200\200~}\200\200LLUU!LLUULLUULLUU!LLUULLUULLUULLUULLUU!LLUULLUULLUU!LLUULLUULLUULLUU~}\200\200~}\200\200LLUU!LLUULLUULLUU!LLUULLUULLUULLUULLUU!LLUULLUULLUU!LLUULLUULLUULLUU~}\200\200~}\200\200LLUU!LLUULLUULLUU!LLUULLUULLUULLUULLUU!LLUULLUULLUU!LLUULLUULLUULLUU~}\200\200~}\200\200LLUU!LLUULLUULLUU!LLUULLUULLUULLUULLUU!LLUULLUULLUU!LLUULLUULLUULLUU~}\200\200~}\200\200LLUU!LLUULLUULLUU!LLUULLUULLUULLUULLUU!LLUULLUULLUU!LLUULLUULLUULLUU!");
    }

    @Test
    public void test03937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03937");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}nullnullnull~}}^}nullnullnull]]!", "F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullF!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}UNLLUNLLUNLL~}}^}UNLLUNLLUNLL]]!" + "'", str2, "}UNLLUNLLUNLL~}}^}UNLLUNLLUNLL]]!");
    }

    @Test
    public void test03938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03938");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300!", "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200!" + "'", str2, "\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200!");
    }

    @Test
    public void test03939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03939");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL!", "\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016eUU!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200L!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUUL!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUU~}\200\200~}\200\200L!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUUL!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUU~}\200\200~}\200\200L!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUUL!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUU~}\200\200~}\200\200L!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUUL!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUU~}\200\200~}\200\200L!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUUL!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUU~}\200\200~}\200\200L!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUUL!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUU~}\200\200~}\200\200L!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUUL!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUU~}\200\200~}\200\200L!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUUL!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUU!" + "'", str2, "~}\200\200~}\200\200L!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUUL!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUU~}\200\200~}\200\200L!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUUL!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUU~}\200\200~}\200\200L!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUUL!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUU~}\200\200~}\200\200L!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUUL!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUU~}\200\200~}\200\200L!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUUL!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUU~}\200\200~}\200\200L!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUUL!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUU~}\200\200~}\200\200L!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUUL!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUU~}\200\200~}\200\200L!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUUL!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUU!");
    }

    @Test
    public void test03940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03940");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\214\214!!\214\214!!\214\214!!\214\214\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\214\214!!\214\214!!\214\214!!\214\214\u0346\u0348\u0348!");
    }

    @Test
    public void test03941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03941");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu!", "\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c!" + "'", str2, "\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c!");
    }

    @Test
    public void test03942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03942");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200\u0348\u0346\u0346!", "!X!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test03943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03943");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll\200}}`ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll]]!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!]]!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!]]!");
    }

    @Test
    public void test03944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03944");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200U^LLU^LL}~\200\200}~\200\200U^LLU^LL!", "\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200\336^LL\336^LL}~\200\200}~\200\200\336^LL\336^LL!" + "'", str2, "}~\200\200}~\200\200\336^LL\336^LL}~\200\200}~\200\200\336^LL\336^LL!");
    }

    @Test
    public void test03945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03945");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("fehhfehh!", "\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368~~!" + "'", str2, "\u0368\u0368~~!");
    }

    @Test
    public void test03946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03946");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test03947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03947");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "nullnullLULLLULLLULLLULLnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test03948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03948");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}}^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!", "\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108]]!" + "'", str2, "\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108]]!");
    }

    @Test
    public void test03949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03949");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~TT!~TT!!!~TT!~TT!!!~TT!~TT!~TT!~TT!!!~TT!~TT!!!~TT!~TT!", "LLLLLUUULUUULUUULUUULLLLLUUULUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~UU!~UU!!!~UU!~UU!!!~UU!~UU!~UU!~UU!!!~UU!~UU!!!~UU!~UU!" + "'", str2, "!~UU!~UU!!!~UU!~UU!!!~UU!~UU!~UU!~UU!!!~UU!~UU!!!~UU!~UU!");
    }

    @Test
    public void test03950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03950");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275!", "~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275!" + "'", str2, "\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275!");
    }

    @Test
    public void test03951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03951");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d!", "FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03952");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\253\256\256]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test03953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03953");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!" + "'", str2, "!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!");
    }

    @Test
    public void test03954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03954");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test03955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03955");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("RRRRRRRR!", "!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\253\253\253\253\253\253\253!" + "'", str2, "\253\253\253\253\253\253\253\253!");
    }

    @Test
    public void test03956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03956");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "~~!!U~~~U~~~U~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!U~~~U~~~U~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test03957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03957");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("U!LLU!LL!!U!LLU!LL!!U!LLU!LLU!LLU!LL!!U!LLU!LL!!U!LLU!LL!", "UUXXUUXXXXUUXXUUXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P!nullnullP!nullnull!!P!nullnullP!nullnull!!P!nullnullP!nullnullP!nullnullP!nullnull!!P!nullnullP!nullnull!!P!nullnullP!nullnull!" + "'", str2, "P!nullnullP!nullnull!!P!nullnullP!nullnull!!P!nullnullP!nullnullP!nullnullP!nullnull!!P!nullnullP!nullnull!!P!nullnullP!nullnull!");
    }

    @Test
    public void test03958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03958");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullXXXXXXXXnullnullnullnullnullnullnullnullXXXXXXXXnullnullnullnullnullnullnullnullXXXXXXXXnullnullnullnullnullnullnullnullXXXXXXXXnullnullnullnullnullnullnullnullXXXXXXXXnullnullnullnullnullnullnullnullXXXXXXXXnullnullnullnullnullnullnullnullXXXXXXXXnullnullnullnullnullnullnullnullXXXXXXXX!", "\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215UUUUUUUU\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215UUUUUUUU\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215UUUUUUUU\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215UUUUUUUU\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215UUUUUUUU\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215UUUUUUUU\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215UUUUUUUU\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215UUUUUUUU!" + "'", str2, "\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215UUUUUUUU\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215UUUUUUUU\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215UUUUUUUU\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215UUUUUUUU\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215UUUUUUUU\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215UUUUUUUU\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215UUUUUUUU\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215UUUUUUUU!");
    }

    @Test
    public void test03959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03959");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UU!!UU!!!", "NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!!``!!!" + "'", str2, "``!!``!!!");
    }

    @Test
    public void test03960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03960");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn!", "L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull!" + "'", str2, "\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03961");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!", "\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!" + "'", str2, "null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
    }

    @Test
    public void test03962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03962");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull!", "\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262!" + "'", str2, "\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262!");
    }

    @Test
    public void test03963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03963");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FH!!FH!!FH!!FH!!FH!!FH!!FH!!FH!!!", "!!UU!!UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!" + "'", str2, "!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!");
    }

    @Test
    public void test03964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03964");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!", "!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!\200}}`!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242!!!" + "'", str2, "\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242!!!");
    }

    @Test
    public void test03965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03965");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnull!", "oprroprroprroprroprroprr!!!!oprroprroprroprroprroprr!!!!!!oprroprroprroprroprroprr!!!!oprroprroprroprroprroprr!!!!!!oprroprroprroprroprroprr!!!!oprroprroprroprroprroprr!!!!!!oprroprroprroprroprroprr!!!!oprroprroprroprroprroprr!!!!!!oprroprroprroprroprroprr!!!!oprroprroprroprroprroprr!!!!!!oprroprroprroprroprroprr!!!!oprroprroprroprroprroprr!!!!!!oprroprroprroprroprroprr!!!!oprroprroprroprroprroprr!!!!!!oprroprroprroprroprroprr!!!!oprroprroprroprroprroprr!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P!RRP!RRP!RRP!RRP!RRP!RRP!RRP!RR!" + "'", str2, "P!RRP!RRP!RRP!RRP!RRP!RRP!RRP!RR!");
    }

    @Test
    public void test03966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03966");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fanullnullnull!", "null\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0!" + "'", str2, "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0!");
    }

    @Test
    public void test03967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03967");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\300\335\335\335\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\300\335\335\335\u0346\u0348\u0348!");
    }

    @Test
    public void test03968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03968");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnull\223\223nullnullnullnullnull\223\223nullnullnull}~\200\200}~\200\200nullnull\223\223nullnullnullnullnull\223\223nullnullnull}~\200\200}~\200\200nullnull\223\223nullnullnullnullnull\223\223nullnullnull}~\200\200}~\200\200nullnull\223\223nullnullnullnullnull\223\223\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!" + "'", str2, "!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!");
    }

    @Test
    public void test03969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03969");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!", "\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test03970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03970");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03971");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250!", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250!" + "'", str2, "\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250!");
    }

    @Test
    public void test03972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03972");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0346\u0348\u0348!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test03973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03973");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!", "null\200}}`null]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!" + "'", str2, "LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!");
    }

    @Test
    public void test03974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03974");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UNLLUNLLUNLLUNLLULLLULLLULLLULLLUNLLUNLLUNLLUNLLULLLULLL!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test03975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03975");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLL!", "\u0346\u0348\u0348\u0348\u0108\u0106\u0106\u0106\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!!" + "'", str2, "nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!!");
    }

    @Test
    public void test03976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03976");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("T!!!T!!!T!!!T!!!T!!!T!!!T!!!T!!!!", "LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!" + "'", str2, "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
    }

    @Test
    public void test03977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03977");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\335\336\340\340\335\336\340\340\335\336\340\340\276\335\336\340\340\275\275!", "ORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnullnullnullnullnullnullnullnullnullnull\276nullnullnullnull\275\275!" + "'", str2, "\275nullnullnullnullnullnullnullnullnullnullnullnull\276nullnullnullnull\275\275!");
    }

    @Test
    public void test03978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03978");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("unllNULL!", "\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\326\325\330\330\325\326\330\330!" + "'", str2, "\326\325\330\330\325\326\330\330!");
    }

    @Test
    public void test03979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03979");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test03980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03980");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull\200\200!nullnull\200\200nullnull\200\200nullnull\200\200!nullnull\200\200nullnull\200\200nullnull\200\200!nullnull\200\200nullnull\200\200nullnull\200\200!nullnull\200\200nullnull\200\200nullnull\200\200!nullnull\200\200nullnull\200\200nullnull\200\200!nullnull\200\200nullnull\200\200nullnull\200\200!nullnull\200\200nullnull\200\200nullnull\200\200!nullnull\200\200nullnull\200\200!" + "'", str2, "nullnull\200\200!nullnull\200\200nullnull\200\200nullnull\200\200!nullnull\200\200nullnull\200\200nullnull\200\200!nullnull\200\200nullnull\200\200nullnull\200\200!nullnull\200\200nullnull\200\200nullnull\200\200!nullnull\200\200nullnull\200\200nullnull\200\200!nullnull\200\200nullnull\200\200nullnull\200\200!nullnull\200\200nullnull\200\200nullnull\200\200!nullnull\200\200nullnull\200\200!");
    }

    @Test
    public void test03981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03981");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!!", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!!" + "'", str2, "\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!!");
    }

    @Test
    public void test03982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03982");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03983");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253!", "~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253!" + "'", str2, "\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253!");
    }

    @Test
    public void test03984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03984");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!", "\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246!!!```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246!!!" + "'", str2, "\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246!!!");
    }

    @Test
    public void test03985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03985");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~LUUU~~\225\230\230~LUUU~~\225\230\230~LUUU~~\225\230\230~LUUU~~\225\230\230\200}}`~LUUU~~\225\230\230~LUUU~~\225\230\230~LUUU~~\225\230\230~LUUU~~\225\230\230]]!", "\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~N\275!!N\275!!N\275!!N\275!!N\275!!N\275!!N\275!!N\275!!\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~N\275!!N\275!!N\275!!N\275!!N\275!!N\275!!N\275!!N\275!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230\200}}`~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230]]!" + "'", str2, "~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230\200}}`~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230]]!");
    }

    @Test
    public void test03986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03986");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!", "\u0366\u0365\u0368\u0368LL!!LL!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnulljjnullnulljj!!nullnulljjnullnulljj!!nullnulljjnullnulljjnullnulljjnullnulljj!!nullnulljjnullnulljj!!nullnulljjnullnulljj!" + "'", str2, "nullnulljjnullnulljj!!nullnulljjnullnulljj!!nullnulljjnullnulljjnullnulljjnullnulljj!!nullnulljjnullnulljj!!nullnulljjnullnulljj!");
    }

    @Test
    public void test03987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03987");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\300\300\275\275\300\300\275\275\300\300\275\275\300\300\275\275\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\300\300\275\275\300\300\275\275!", "NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275UUU\275UUU\275UUU\275UUUUU\275\275UU\275\275UU\275\275UU\275\275\275UUU\275UUU\275UUU\275UUUUU\275\275UU\275\275!" + "'", str2, "\275UUU\275UUU\275UUU\275UUUUU\275\275UU\275\275UU\275\275UU\275\275\275UUU\275UUU\275UUU\275UUUUU\275\275UU\275\275!");
    }

    @Test
    public void test03988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03988");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!u!", "RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!" + "'", str2, "!null!");
    }

    @Test
    public void test03989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03989");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\300\276\276\275\300\276\276!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275null\276\276\275null\276\276!" + "'", str2, "\275null\276\276\275null\276\276!");
    }

    @Test
    public void test03990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03990");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnull!", "!UUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "unulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluu!" + "'", str2, "unulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluu!");
    }

    @Test
    public void test03991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03991");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!", "nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!" + "'", str2, "\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!");
    }

    @Test
    public void test03992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03992");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]\256!\254\254\256!\254\254\256!\254\254\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]]\256!\254\254\256!\254\254\256!\254\254\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]!", "\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]\256!\254\254\256!\254\254\256!\254\254\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]]\256!\254\254\256!\254\254\256!\254\254\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]!" + "'", str2, "]\256!\254\254\256!\254\254\256!\254\254\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]]\256!\254\254\256!\254\254\256!\254\254\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]!");
    }

    @Test
    public void test03993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03993");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!", "\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test03994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03994");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200~^~~~^~~}~\200\200}~\200\200~^~~~^~~!", "\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200~^~~~^~~}~\200\200}~\200\200~^~~~^~~!" + "'", str2, "}~\200\200}~\200\200~^~~~^~~}~\200\200}~\200\200~^~~~^~~!");
    }

    @Test
    public void test03995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03995");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\200\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0]]!", "\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test03996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03996");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!", "U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test03997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03997");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!", "~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!" + "'", str2, "nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!");
    }

    @Test
    public void test03998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03998");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "HH!!HH!!HHHH!!HH!!HH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03999");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214!" + "'", str2, "ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214!");
    }

    @Test
    public void test04000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test04000");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!", "!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!" + "'", str2, "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!");
    }
}
