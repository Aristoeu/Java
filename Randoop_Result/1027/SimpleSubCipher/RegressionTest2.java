package SimpleSubCipher;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test01001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01001");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("efhhefhh!", "!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01002");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!!", "!\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!!" + "'", str2, "nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!!");
    }

    @Test
    public void test01003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01003");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("fehhfehh!", "\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01004");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348!", "\u03dd\u03de\u03e0\u03e0nullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test01005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01005");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!", "LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!" + "'", str2, "!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!");
    }

    @Test
    public void test01006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01006");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e!", "TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!tt!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~TT!~TT!!!~TT!~TT!!!~TT!~TT!~TT!~TT!!!~TT!~TT!!!~TT!~TT!" + "'", str2, "!~TT!~TT!!!~TT!~TT!!!~TT!~TT!~TT!~TT!!!~TT!~TT!!!~TT!~TT!");
    }

    @Test
    public void test01007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01007");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!", "EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHH!!FEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHH!!FEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHH!!FEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHH!!FEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHH!" + "'", str2, "FEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHH!!FEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHH!!FEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHH!!FEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHH!!FEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHH!");
    }

    @Test
    public void test01008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01008");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "ULNNULNNULNNULNNULNNULNNULNNULNN!!ULNNULNNULNNULNNULNNULNNULNNULNN!!ULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNN!!ULNNULNNULNNULNNULNNULNNULNNULNN!!ULNNULNNULNNULNNULNNULNNULNNULNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01009");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("unllNULL!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test01010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01010");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFF!", "\u0366\u0365\u0368\u0368!!\216\216\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01011");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0128\u0126\u0126\u0108\u0106\u0106!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u013d\u013e\u0140\u0140\u013d\u013e\u0140\u0140nullnull!" + "'", str2, "\u013d\u013e\u0140\u0140\u013d\u013e\u0140\u0140nullnull!");
    }

    @Test
    public void test01012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01012");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull\336\336nullnull\336\336!", "nullUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fehhfehhnullnullfehhfehhnullnull!" + "'", str2, "fehhfehhnullnullfehhfehhnullnull!");
    }

    @Test
    public void test01013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01013");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("h]hhh]hh!!h]hhh]hh!!h]hhh]hhh]hhh]hh!!h]hhh]hh!!h]hhh]hh!", "LLUULLUU}}LLUULLUU}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u]uuu]uu!!u]uuu]uu!!u]uuu]uuu]uuu]uu!!u]uuu]uu!!u]uuu]uu!" + "'", str2, "u]uuu]uu!!u]uuu]uu!!u]uuu]uuu]uuu]uu!!u]uuu]uu!!u]uuu]uu!");
    }

    @Test
    public void test01014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01014");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("llllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLL!", "NUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01015");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!!", "LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!!" + "'", str2, "\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!!");
    }

    @Test
    public void test01016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01016");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("FEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHH!", "!L!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01017");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```!", "!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```!" + "'", str2, "LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```!");
    }

    @Test
    public void test01018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01018");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u03dd\u03de\u03e0\u03e0nullnullnullnull!", "\246\246!!\246\246!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01019");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFF!", "~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01020");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!!" + "'", str2, "HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!!");
    }

    @Test
    public void test01021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01021");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!!", "NULLNULLNULLNULLNULLNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!!" + "'", str2, "\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!!");
    }

    @Test
    public void test01022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01022");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108nullnull!!!!!!!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!!" + "'", str2, "lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!!");
    }

    @Test
    public void test01023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01023");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!", "\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01024");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`LLUULLUULLUU`LLUULLUULLUU!", "~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01025");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LULLLULL!!LULLLULL!!LULLLULLLULLLULL!!LULLLULL!!LULLLULL!", "TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!tt!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!T!!!T!!!!!T!!!T!!!!!T!!!T!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!" + "'", str2, "!T!!!T!!!!!T!!!T!!!!!T!!!T!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!");
    }

    @Test
    public void test01026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01026");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("XXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxx!", "~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01027");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!!", "nullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!!" + "'", str2, "\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!!");
    }

    @Test
    public void test01028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01028");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!" + "'", str2, "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
    }

    @Test
    public void test01029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01029");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!", "\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!" + "'", str2, "!!!");
    }

    @Test
    public void test01030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01030");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\200}}`\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300]]!", "\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016enullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLLNLLLNLLLNLLL\200}}`NLLLNLLLNLLLNLLL]]!" + "'", str2, "NLLLNLLLNLLLNLLL\200}}`NLLLNLLLNLLLNLLL]]!");
    }

    @Test
    public void test01031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01031");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("hhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHH!", "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!" + "'", str2, "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!");
    }

    @Test
    public void test01032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01032");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!e!", "NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!" + "'", str2, "!null!");
    }

    @Test
    public void test01033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01033");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!LL!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test01034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01034");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!", "LNNNLNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!" + "'", str2, "hnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!");
    }

    @Test
    public void test01035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01035");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336!", "hehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01036");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "\340\340!!nullnullnull\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!nullnullnull\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300!" + "'", str2, "\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300!");
    }

    @Test
    public void test01037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01037");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "nulloprr!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01038");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnull!", "NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLUNLLUNLLUNLLUNLL!" + "'", str2, "UNLLUNLLUNLLUNLLUNLL!");
    }

    @Test
    public void test01039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01039");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UNLLUNLL!!UNLLUNLL!!!", "nullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhh!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0176\u0175\u0178\u0178\u0176\u0175\u0178\u0178\u0176\u0175\u0178\u0178\u0176\u0175\u0178\u0178!!!" + "'", str2, "\u0176\u0175\u0178\u0178\u0176\u0175\u0178\u0178\u0176\u0175\u0178\u0178\u0176\u0175\u0178\u0178!!!");
    }

    @Test
    public void test01040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01040");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!!", "null\200}}`null]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!!" + "'", str2, "~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!!");
    }

    @Test
    public void test01041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01041");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!!", "null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnullnull\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test01042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01042");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!", "^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
    }

    @Test
    public void test01043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01043");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("H!!!H!!!H!!!H!!!H!!!H!!!H!!!H!!!!", "nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!" + "'", str2, "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
    }

    @Test
    public void test01044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01044");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108nullnull!!!!!!!", "FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!!");
    }

    @Test
    public void test01045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01045");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("h]hhh]hh!!h]hhh]hh!!h]hhh]hhh]hhh]hh!!h]hhh]hh!!h]hhh]hh!", "\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!" + "'", str2, "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!");
    }

    @Test
    public void test01046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01046");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test01047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01047");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\246\250\250\250\246\250\250\250!", "UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\246\250\250\250\246\250\250\250!" + "'", str2, "\246\250\250\250\246\250\250\250!");
    }

    @Test
    public void test01048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01048");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108!", "XXXXXXXXXXXXXXXX\200}}`XXXXXXXXXXXXXXXX]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01049");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01050");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test01051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01051");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336!", "\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull!" + "'", str2, "~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull!");
    }

    @Test
    public void test01052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01052");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01053");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!", "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126!" + "'", str2, "\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126!");
    }

    @Test
    public void test01054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01054");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!" + "'", str2, "\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
    }

    @Test
    public void test01055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01055");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!!", "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!!" + "'", str2, "\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!!");
    }

    @Test
    public void test01056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01056");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214!", "LNLLLNLL!!LNLLLNLL!!LNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214!" + "'", str2, "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214!");
    }

    @Test
    public void test01057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01057");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01c8\u01c5\u01c5\u01c5\u01c8\u01c5\u01c5\u01c5!", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01058");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test01059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01059");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\200!", "NLLLNLLLNLLLNLLL\200}}`NLLLNLLLNLLLNLLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\200!" + "'", str2, "!\200!");
    }

    @Test
    public void test01060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01060");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!!", "\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test01061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01061");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225!", "UNLLUNLLUNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225!" + "'", str2, "rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225!");
    }

    @Test
    public void test01062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01062");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!!", "!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!" + "'", str2, "!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!");
    }

    @Test
    public void test01063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01063");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!!", "EHHH\200}}`EHHH]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test01064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01064");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!", "\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test01065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01065");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!!", "LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!!" + "'", str2, "NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!!");
    }

    @Test
    public void test01066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01066");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!", "!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test01067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01067");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!", "nullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "URRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRR\200}}`URRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRR]]!" + "'", str2, "URRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRR\200}}`URRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRR]]!");
    }

    @Test
    public void test01068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01068");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!", "UUUUUUUUUUUUUUUU\200}}`UUUUUUUUUUUUUUUU]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01069");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "``!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01070");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300!", "!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnull!" + "'", str2, "nullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnull!");
    }

    @Test
    public void test01071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01071");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("JLLLJLLLJLLLJLLLJLLLJLLLJLLLJLLL!", "fehhfehhnullnullfehhfehhnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULLLULLLULLLULLLULLLULLLULLLULLL!" + "'", str2, "ULLLULLLULLLULLLULLLULLLULLLULLL!");
    }

    @Test
    public void test01072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01072");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!", "nullnullBBnullnullBB!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLL!" + "'", str2, "l!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLL!");
    }

    @Test
    public void test01073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01073");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128nullnull!", "EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHH!" + "'", str2, "nullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHH!");
    }

    @Test
    public void test01074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01074");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("wxzzwxzz!!wxzzwxzz!!wxzzwxzzwxzzwxzz!!wxzzwxzz!!wxzzwxzz!", "nullnullLULLLULLLULLLULLnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lluulluu!!lluulluu!!lluulluulluulluu!!lluulluu!!lluulluu!" + "'", str2, "lluulluu!!lluulluu!!lluulluulluulluu!!lluulluu!!lluulluu!");
    }

    @Test
    public void test01075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01075");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "LLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLL]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204\u0346\u0348\u0348!");
    }

    @Test
    public void test01076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01076");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0107\u0105\u0109\u0109\u0107\u0105\u0109\u0109!", "\253\254\256\256\253\254\256\256!!\253\254\256\256\253\254\256\256!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01077");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01078");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u0345\u0348\u0346\u0346!", "~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test01079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01079");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!", "nullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!" + "'", str2, "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!");
    }

    @Test
    public void test01080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01080");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!", "nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!" + "'", str2, "LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!");
    }

    @Test
    public void test01081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01081");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullUNLL!", "NULLNULLNULLNULLNULLNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "unllNULL!" + "'", str2, "unllNULL!");
    }

    @Test
    public void test01082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01082");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!", "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
    }

    @Test
    public void test01083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01083");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!", "nullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhh!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014e\u014c\u014c\u014e\u014c\u014c\u014e\u014c\u014c\u014e\u014c\u014c\u014e\u014c\u014c\u014e\u014c\u014c\u014e\u014c\u014c\u014e\u014c\u014c!" + "'", str2, "\u014e\u014c\u014c\u014e\u014c\u014c\u014e\u014c\u014c\u014e\u014c\u014c\u014e\u014c\u014c\u014e\u014c\u014c\u014e\u014c\u014c\u014e\u014c\u014c!");
    }

    @Test
    public void test01084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01084");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f!", "\u0366\u0365\u0368\u0368nullnull\200\200\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!" + "'", str2, "nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test01085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01085");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!!", "\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!!" + "'", str2, "nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!!");
    }

    @Test
    public void test01086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01086");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("H!!!H!!!H!!!H!!!H!!!H!!!H!!!H!!!!", "\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!" + "'", str2, "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
    }

    @Test
    public void test01087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01087");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHH!", "nullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLL!" + "'", str2, "NLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLL!");
    }

    @Test
    public void test01088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01088");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!", "efhhefhhefhhefhhefhhefhhefhhefhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!" + "'", str2, "FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!");
    }

    @Test
    public void test01089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01089");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!" + "'", str2, "\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!");
    }

    @Test
    public void test01090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01090");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225!" + "'", str2, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225!");
    }

    @Test
    public void test01091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01091");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!!", "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test01092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01092");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "!~TT!~TT!!!~TT!~TT!!!~TT!~TT!~TT!~TT!!!~TT!~TT!!!~TT!~TT!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01093");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnull!", "~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01094");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("fehhfehhnullnullfehhfehhnullnull!", "\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e!" + "'", str2, "\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e!");
    }

    @Test
    public void test01095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01095");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "LLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test01096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01096");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!", "FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!" + "'", str2, "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!");
    }

    @Test
    public void test01097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01097");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!!");
    }

    @Test
    public void test01098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01098");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "LNLLLNLL!!LNLLLNLL!!LNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!" + "'", str2, "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!");
    }

    @Test
    public void test01099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01099");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108!", "xxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XXUUXXUU!" + "'", str2, "XXUUXXUU!");
    }

    @Test
    public void test01100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01100");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246!!!```!", "\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```!" + "'", str2, "nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```!");
    }

    @Test
    public void test01101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01101");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!", "ULLLULLL!!ULLLULLL!!ULLLULLLULLLULLL!!ULLLULLL!!ULLLULLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test01102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01102");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250!", "!~TT!~TT!!!~TT!~TT!!!~TT!~TT!~TT!~TT!!!~TT!~TT!!!~TT!~TT!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250!" + "'", str2, "\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250!");
    }

    @Test
    public void test01103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01103");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01104");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!", "nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!" + "'", str2, "!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!");
    }

    @Test
    public void test01105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01105");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!", "\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336!" + "'", str2, "\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336!");
    }

    @Test
    public void test01106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01106");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!", "UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01107");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226!", "\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226!" + "'", str2, "\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226!");
    }

    @Test
    public void test01108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01108");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "UUUUUUUUUUUUUUUU\200}}`UUUUUUUUUUUUUUUU]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01109");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!", "H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!" + "'", str2, "!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!");
    }

    @Test
    public void test01110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01110");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ULLLULLL!!ULLLULLL!!ULLLULLLULLLULLL!!ULLLULLL!!ULLLULLL!", "\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!" + "'", str2, "\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!");
    }

    @Test
    public void test01111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01111");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("``!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!", "NLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!" + "'", str2, "``!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!");
    }

    @Test
    public void test01112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01112");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200}}`\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test01113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01113");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL}~\200\200}~\200\200NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!" + "'", str2, "}~\200\200}~\200\200NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL}~\200\200}~\200\200NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!");
    }

    @Test
    public void test01114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01114");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "u]uuu]uu!!u]uuu]uu!!u]uuu]uuu]uuu]uu!!u]uuu]uu!!u]uuu]uu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test01115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01115");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLUUUULL!", "NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUNNNNUU!" + "'", str2, "UUNNNNUU!");
    }

    @Test
    public void test01116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01116");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016enullnull!", "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200!!nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200!!nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200!!nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200!!nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200!" + "'", str2, "nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200!!nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200!!nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200!!nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200!!nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200!");
    }

    @Test
    public void test01117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01117");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01118");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N~LLN~LL!!N~LLN~LL!!N~LLN~LLN~LLN~LL!!N~LLN~LL!!N~LLN~LL!" + "'", str2, "N~LLN~LL!!N~LLN~LL!!N~LLN~LLN~LLN~LL!!N~LLN~LL!!N~LLN~LL!");
    }

    @Test
    public void test01119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01119");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnullnull\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!" + "'", str2, "efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!");
    }

    @Test
    public void test01120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01120");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!", "\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!" + "'", str2, "\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!");
    }

    @Test
    public void test01121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01121");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("TT!!TT!!!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HH!!HH!!!" + "'", str2, "HH!!HH!!!");
    }

    @Test
    public void test01122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01122");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!", "!\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test01123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01123");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!" + "'", str2, "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!");
    }

    @Test
    public void test01124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01124");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRR!", "nullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLL!" + "'", str2, "LNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLL!");
    }

    @Test
    public void test01125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01125");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!", "ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!!ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!!ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!!ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!!ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226nullnull!" + "'", str2, "\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226nullnull!");
    }

    @Test
    public void test01126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01126");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126!", "\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XX!" + "'", str2, "XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XX!");
    }

    @Test
    public void test01127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01127");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test01128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01128");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLLUNLLUNLLUNLLUNLL!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01129");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("H!!!H!!!H!!!H!!!H!!!H!!!H!!!H!!!!", "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!" + "'", str2, "U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!");
    }

    @Test
    public void test01130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01130");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!", "\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
    }

    @Test
    public void test01131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01131");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u0108\u0106\u0106\u0106\u0348\u0346\u0346!", "UNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test01132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01132");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnullnull~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnull!", "NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULLUULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!" + "'", str2, "UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULLUULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!");
    }

    @Test
    public void test01133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01133");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!", "RRPPRRPPRRPPRRPPRRPPRRPPRRPPRRPP!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01134");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230\200}}`nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230]]!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230]]!");
    }

    @Test
    public void test01135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01135");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "H!!!H!!!H!!!H!!!H!!!H!!!H!!!H!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01136");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340\u0348\u0346\u0346!");
    }

    @Test
    public void test01137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01137");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FHHHnullnullnullnullFHHHnullnull!", "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!" + "'", str2, "\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!");
    }

    @Test
    public void test01138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01138");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!", "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnull!!!nullnullnullnull!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!" + "'", str2, "LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!");
    }

    @Test
    public void test01139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01139");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225!", "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225!" + "'", str2, "\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225!");
    }

    @Test
    public void test01140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01140");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!", "LLUUUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!!nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!!nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!!nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!!nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!" + "'", str2, "nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!!nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!!nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!!nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!!nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!");
    }

    @Test
    public void test01141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01141");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01142");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!" + "'", str2, "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
    }

    @Test
    public void test01143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01143");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256!" + "'", str2, "\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256!");
    }

    @Test
    public void test01144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01144");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "XXXXXXXXXXXXXXXX\200}}`XXXXXXXXXXXXXXXX]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test01145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01145");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!", "nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200!!nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200!!nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200!!nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200!!nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220nullnull!" + "'", str2, "\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220\u0220nullnull!");
    }

    @Test
    public void test01146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01146");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLL!", "null\340\336\336nullnullnullnull\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336nullnullnullnull\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNN!" + "'", str2, "NN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNN!");
    }

    @Test
    public void test01147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01147");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!", "LULLLULL!!LULLLULL!!LULLLULLLULLLULL!!LULLLULL!!LULLLULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test01148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01148");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e!", "nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031anullnullnullnullnullnullnullnull!" + "'", str2, "\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031anullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01149");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8!", "nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!" + "'", str2, "U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!");
    }

    @Test
    public void test01150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01150");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("hhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHH!", "\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126!" + "'", str2, "\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126!");
    }

    @Test
    public void test01151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01151");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108!", "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01152");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01153");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!!", "FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test01154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01154");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230]]!", "nullnullnullnullnullnullnullnulll!nnl!nnnullnullnullnullnullnullnullnulll!nnl!nnnullnullnullnullnullnullnullnulll!nnl!nnnullnullnullnullnullnullnullnulll!nnl!nnnullnullnullnullnullnullnullnulll!nnl!nnnullnullnullnullnullnullnullnulll!nnl!nnnullnullnullnullnullnullnullnulll!nnl!nnnullnullnullnullnullnullnullnulll!nnl!nn!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230\200}}`UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230]]!" + "'", str2, "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230\200}}`UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230]]!");
    }

    @Test
    public void test01155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01155");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!", "\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!" + "'", str2, "]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!");
    }

    @Test
    public void test01156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01156");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!", "\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!!null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!!null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!!null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!!null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!" + "'", str2, "null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!!null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!!null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!!null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!!null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!");
    }

    @Test
    public void test01157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01157");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014f!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\225!" + "'", str2, "!\225!");
    }

    @Test
    public void test01158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01158");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336!", "UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01159");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e!", "\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01160");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214!", "}~\200\200}~\200\200NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL}~\200\200}~\200\200NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214!" + "'", str2, "\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214!");
    }

    @Test
    public void test01161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01161");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!", "unllNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test01162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01162");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HHHHHHHH!", "\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016enullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01163");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!!", "nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test01164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01164");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("TT!!TT!!!", "!\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test01165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01165");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!", "\u014e\u014e\u014e\u014e!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test01166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01166");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullaanullnullaanullnullaanullnullaanullnullaanullnullaanullnullaanullnullaa!", "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNN!" + "'", str2, "LNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNN!");
    }

    @Test
    public void test01167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01167");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL!", "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL!" + "'", str2, "LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL!");
    }

    @Test
    public void test01168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01168");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("F!HHF!HHF!HHF!HHF!HHF!HHF!HHF!HH!", "xxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "X!UUX!UUX!UUX!UUX!UUX!UUX!UUX!UU!" + "'", str2, "X!UUX!UUX!UUX!UUX!UUX!UUX!UUX!UU!");
    }

    @Test
    public void test01169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01169");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("lluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUU!", "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017enullnull!" + "'", str2, "\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017enullnull!");
    }

    @Test
    public void test01170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01170");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!", "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01171");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01172");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300!", "P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N~~~N~~~N~~~N~~~N~~~N~~~N~~~N~~~!" + "'", str2, "N~~~N~~~N~~~N~~~N~~~N~~~N~~~N~~~!");
    }

    @Test
    public void test01173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01173");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNN!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUU!" + "'", str2, "UU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUU!");
    }

    @Test
    public void test01174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01174");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348!", "~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test01175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01175");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\254\256\256\253\254\256\256!!\253\254\256\256\253\254\256\256!!!", "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256\253\254\256\256!!\253\254\256\256\253\254\256\256!!!" + "'", str2, "\253\254\256\256\253\254\256\256!!\253\254\256\256\253\254\256\256!!!");
    }

    @Test
    public void test01176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01176");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("l!uul!uul!uul!uul!uul!uul!uul!uu!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test01177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01177");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("IJLLIJLL!!IJLLIJLL!!IJLLIJLLIJLLIJLL!!IJLLIJLL!!IJLLIJLL!", "\253\254\256\256\253\254\256\256!!\253\254\256\256\253\254\256\256!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\254\254!!\254\254!!!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!!!\254\254!!\254\254!" + "'", str2, "!!\254\254!!\254\254!!!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!!!\254\254!!\254\254!");
    }

    @Test
    public void test01178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01178");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("XXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxx!", "UU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01179");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300!", "\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108nullnull!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUU!" + "'", str2, "NUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUU!");
    }

    @Test
    public void test01180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01180");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01181");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216!", "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216!" + "'", str2, "\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216!");
    }

    @Test
    public void test01182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01182");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!", "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test01183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01183");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\254\254!!\254\254!!!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!!!\254\254!!\254\254!", "UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\254\254!!\254\254!!!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!!!\254\254!!\254\254!" + "'", str2, "!!\254\254!!\254\254!!!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!!!\254\254!!\254\254!");
    }

    @Test
    public void test01184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01184");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!", "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
    }

    @Test
    public void test01185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01185");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108!", "UU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01186");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UULLUULL!!UULLUULL!!UULLUULLUULLUULL!!UULLUULL!!UULLUULL!", "NULLNULL!!NULLNULL!!NULLNULLNULLNULL!!NULLNULL!!NULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNUUNNUU!!NNUUNNUU!!NNUUNNUUNNUUNNUU!!NNUUNNUU!!NNUUNNUU!" + "'", str2, "NNUUNNUU!!NNUUNNUU!!NNUUNNUUNNUUNNUU!!NNUUNNUU!!NNUUNNUU!");
    }

    @Test
    public void test01187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01187");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!", "N~LLN~LL!!N~LLN~LL!!N~LLN~LLN~LLN~LL!!N~LLN~LL!!N~LLN~LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test01188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01188");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!", "fehhfehhnullnullfehhfehhnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!" + "'", str2, "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
    }

    @Test
    public void test01189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01189");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\200}}`null]]!", "\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P\220NN\200}}`P\220NN]]!" + "'", str2, "P\220NN\200}}`P\220NN]]!");
    }

    @Test
    public void test01190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01190");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f!", "\276\276!!\276\276!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!" + "'", str2, "nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test01191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01191");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!", "NUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test01192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01192");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!", "UUNNNNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
    }

    @Test
    public void test01193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01193");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull!", "^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200U^LLU^LL}~\200\200}~\200\200U^LLU^LL!" + "'", str2, "}~\200\200}~\200\200U^LLU^LL}~\200\200}~\200\200U^LLU^LL!");
    }

    @Test
    public void test01194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01194");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("AALLLLAA!", "\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01195");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnullnull\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!!" + "'", str2, "nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!!");
    }

    @Test
    public void test01196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01196");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!!", "\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!" + "'", str2, "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
    }

    @Test
    public void test01197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01197");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!!", "nulloprr!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!!" + "'", str2, "porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!!");
    }

    @Test
    public void test01198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01198");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u017e\u017e\u017e\u017e\u017e\u017enullnullnullnullnullnullnullnull!", "F!HHF!HHF!HHF!HHF!HHF!HHF!HHF!HH!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!fhhnullnullnull!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhhnullnullnull!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!" + "'", str2, "!fhhnullnullnull!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhhnullnullnull!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!");
    }

    @Test
    public void test01199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01199");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull!", "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104!" + "'", str2, "~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104!");
    }

    @Test
    public void test01200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01200");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!", "NUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01201");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340!", "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01202");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01203");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!", "nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!" + "'", str2, "\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!");
    }

    @Test
    public void test01204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01204");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!", "AALLLLAA!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01205");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!", "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!" + "'", str2, "!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
    }

    @Test
    public void test01206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01206");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01207");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UNLLUNLL!", "nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\352\351\354\354\352\351\354\354!" + "'", str2, "\352\351\354\354\352\351\354\354!");
    }

    @Test
    public void test01208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01208");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!", "\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!" + "'", str2, "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!");
    }

    @Test
    public void test01209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01209");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014c\u014c\u014e\u014c\u014c\u014e\u014c\u014c\u014e\u014c\u014c\u014e\u014c\u014c\u014e\u014c\u014c\u014e\u014c\u014c\u014e\u014c\u014c!", "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!" + "'", str2, "!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!");
    }

    @Test
    public void test01210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01210");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnull!", "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128!" + "'", str2, "\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128!");
    }

    @Test
    public void test01211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01211");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!", "~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
    }

    @Test
    public void test01212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01212");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNN!", "ULLLULLL!!ULLLULLL!!ULLLULLLULLLULLL!!ULLLULLL!!ULLLULLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLL!" + "'", str2, "ULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLL!");
    }

    @Test
    public void test01213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01213");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!", "UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01214");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("u]uuu]uu!!u]uuu]uu!!u]uuu]uuu]uuu]uu!!u]uuu]uu!!u]uuu]uu!", "\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!" + "'", str2, "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!");
    }

    @Test
    public void test01215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01215");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]AAAAA]]AA]]AA]]AA]]]AAAAA]]AA]]!", "\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]nullnullnullnullnull]]nullnull]]nullnull]]nullnull]]]nullnullnullnullnull]]nullnull]]!" + "'", str2, "]nullnullnullnullnull]]nullnull]]nullnull]]nullnull]]]nullnullnullnullnull]]nullnull]]!");
    }

    @Test
    public void test01216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01216");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("TT!!TT!!!", "NNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!!" + "'", str2, "LL!!LL!!!");
    }

    @Test
    public void test01217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01217");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0345\u0346\u0348\u0348!", "nullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test01218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01218");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!", "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01219");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!", "a]aaa]aa!!a]aaa]aa!!a]aaa]aaa]aaa]aa!!a]aaa]aa!!a]aaa]aa!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01220");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!", "!u!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!" + "'", str2, "]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!");
    }

    @Test
    public void test01221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01221");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "NNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test01222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01222");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368!!\216\216\u0346\u0348\u0348!", "!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!!\216\216\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!!\216\216\u0346\u0348\u0348!");
    }

    @Test
    public void test01223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01223");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u0345\u0348\u0346\u0346!", "ULLLULLLULLLULLL\200}}`ULLLULLLULLLULLL]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test01224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01224");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FHHHnullnullnullnullFHHHnullnull!", "\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u016a\u016a\u016a\u016a\u016a\u016aLL!" + "'", str2, "\u016a\u016a\u016a\u016a\u016a\u016aLL!");
    }

    @Test
    public void test01225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01225");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UULLUULL!!UULLUULL!!UULLUULLUULLUULL!!UULLUULL!!UULLUULL!", "efhhefhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01226");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!", "xxxxxxxxxxxxxxxxnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullxxxxxxxxxxxxxxxxnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01227");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!!", "NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!!" + "'", str2, "^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!!");
    }

    @Test
    public void test01228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01228");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ULLLULLLULLLULLLULLLULLLULLLULLL!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300!" + "'", str2, "\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300!");
    }

    @Test
    public void test01229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01229");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!", "hfhhhfhh!!hfhhhfhh!!hfhhhfhhhfhhhfhh!!hfhhhfhh!!hfhhhfhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!" + "'", str2, "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!");
    }

    @Test
    public void test01230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01230");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("hnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!", "]nullnullnullnullnull]]nullnull]]nullnull]]nullnull]]]nullnullnullnullnull]]nullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!" + "'", str2, "LL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!");
    }

    @Test
    public void test01231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01231");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!", "null\200}}`null]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL!!]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL!!]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL!!]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL!!]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL!" + "'", str2, "]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL!!]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL!!]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL!!]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL!!]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL!");
    }

    @Test
    public void test01232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01232");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNUUNNUU!!NNUUNNUU!!NNUUNNUUNNUUNNUU!!NNUUNNUU!!NNUUNNUU!", "\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUNNUUNN!!UUNNUUNN!!UUNNUUNNUUNNUUNN!!UUNNUUNN!!UUNNUUNN!" + "'", str2, "UUNNUUNN!!UUNNUUNN!!UUNNUUNNUUNNUUNN!!UUNNUUNN!!UUNNUUNN!");
    }

    @Test
    public void test01233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01233");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "l!uul!uul!uul!uul!uul!uul!uul!uu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test01234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01234");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!!", "]nullnullnullnullnull]]nullnull]]nullnull]]nullnull]]]nullnullnullnullnull]]nullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!!" + "'", str2, "\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!!");
    }

    @Test
    public void test01235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01235");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\230\230\225\225\230\230\225\225!", "!\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\230\225\225\230\230\225\225!" + "'", str2, "\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test01236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01236");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test01237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01237");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225!", "nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225!" + "'", str2, "\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225!");
    }

    @Test
    public void test01238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01238");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!", "`nullnullnull`nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!" + "'", str2, "wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!");
    }

    @Test
    public void test01239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01239");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!", "LLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAA!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!" + "'", str2, "``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!");
    }

    @Test
    public void test01240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01240");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("fehhfehhnullnullfehhfehhnullnull!", "llllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test01241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01241");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!", "LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106!" + "'", str2, "\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106!");
    }

    @Test
    public void test01242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01242");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("lluulluu!!lluulluu!!lluulluulluulluu!!lluulluu!!lluulluu!", "a]aaa]aa!!a]aaa]aa!!a]aaa]aaa]aaa]aa!!a]aaa]aa!!a]aaa]aa!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]AA]]AA!!]]AA]]AA!!]]AA]]AA]]AA]]AA!!]]AA]]AA!!]]AA]]AA!" + "'", str2, "]]AA]]AA!!]]AA]]AA!!]]AA]]AA]]AA]]AA!!]]AA]]AA!!]]AA]]AA!");
    }

    @Test
    public void test01243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01243");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220!" + "'", str2, "\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220!");
    }

    @Test
    public void test01244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01244");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("XXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxx!", "\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01245");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ULLLULLL!!ULLLULLL!!ULLLULLLULLLULLL!!ULLLULLL!!ULLLULLL!", "ULNNULNNULNNULNNULNNULNNULNNULNN!!ULNNULNNULNNULNNULNNULNNULNNULNN!!ULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNN!!ULNNULNNULNNULNNULNNULNNULNNULNN!!ULNNULNNULNNULNNULNNULNNULNNULNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106!" + "'", str2, "\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106!");
    }

    @Test
    public void test01246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01246");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!fhhnullnullnull!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhhnullnullnull!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!", "fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256nullnullnullnullnullnullnullnullnullnullnullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256nullnullnullnullnullnullnullnullnullnullnullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256nullnullnullnullnullnullnullnullnullnullnullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256nullnullnullnullnullnullnullnullnullnullnullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test01247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01247");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "F!HHF!HHF!HHF!HHF!HHF!HHF!HHF!HH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test01248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01248");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!", "null~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnullnull~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!" + "'", str2, "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!");
    }

    @Test
    public void test01249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01249");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!", "\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
    }

    @Test
    public void test01250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01250");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EHHH\200}}`EHHH]]!", "wxzzwxzz!!wxzzwxzz!!wxzzwxzzwxzzwxzz!!wxzzwxzz!!wxzzwxzz!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "WZZZ\200}}`WZZZ]]!" + "'", str2, "WZZZ\200}}`WZZZ]]!");
    }

    @Test
    public void test01251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01251");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNNNLNNN!", "XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275XXX\275XXX!" + "'", str2, "\275XXX\275XXX!");
    }

    @Test
    public void test01252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01252");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!", "\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test01253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01253");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106!", "WZZZ\200}}`WZZZ]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01254");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!", "!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253!" + "'", str2, "\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253!");
    }

    @Test
    public void test01255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01255");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("FHHHnullnullnullnullFHHHnullnull!", "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170!" + "'", str2, "\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170!");
    }

    @Test
    public void test01256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01256");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!", "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test01257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01257");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull!", "\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01258");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("AALLLLAA!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNLLLLNN!" + "'", str2, "NNLLLLNN!");
    }

    @Test
    public void test01259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01259");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01260");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!", "\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!" + "'", str2, "\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!");
    }

    @Test
    public void test01261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01261");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!" + "'", str2, "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
    }

    @Test
    public void test01262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01262");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAA!", "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!" + "'", str2, "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!");
    }

    @Test
    public void test01263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01263");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("F!HHF!HHF!HHF!HHF!HHF!HHF!HHF!HH!", "\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031anullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test01264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01264");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01265");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106!", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNN!!NNNNNNNN!!NNNNNNNNNNNNNNNN!!NNNNNNNN!!NNNNNNNN!" + "'", str2, "NNNNNNNN!!NNNNNNNN!!NNNNNNNNNNNNNNNN!!NNNNNNNN!!NNNNNNNN!");
    }

    @Test
    public void test01266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01266");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NULLNULLNULLNULLNULLNULLNULLNULL!", "\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256!" + "'", str2, "\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256!");
    }

    @Test
    public void test01267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01267");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!", "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test01268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01268");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FHHHnullnullnullnullFHHHnullnull!", "\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254!" + "'", str2, "\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254!");
    }

    @Test
    public void test01269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01269");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420!!!", "nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!!" + "'", str2, "\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!!");
    }

    @Test
    public void test01270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01270");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("lluulluu!!lluulluu!!lluulluulluulluu!!lluulluu!!lluulluu!", "UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248!" + "'", str2, "\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248!");
    }

    @Test
    public void test01271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01271");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!!", "\u0366\u0365\u0368\u0368nullnull\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test01272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01272");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e!", "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01273");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014f!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230\200}}`UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!" + "'", str2, "!null!");
    }

    @Test
    public void test01274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01274");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("fehhfehhfehhfehhfehhfehhfehhfehh!", "NLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01275");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\336\335\340\340\336\335\340\340!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01276");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368nullnull\200\200\u0346\u0348\u0348!", "]]!!]]!!}}]]!!]]!!}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!!]]!!]]\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!!]]!!]]\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test01277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01277");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("JLLLJLLLJLLLJLLLJLLLJLLLJLLLJLLL!", "nullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhh!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178!" + "'", str2, "\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178!");
    }

    @Test
    public void test01278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01278");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHH!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01279");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!!nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!!nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!!nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!!nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!", "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!" + "'", str2, "hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!");
    }

    @Test
    public void test01280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01280");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("l!uul!uul!uul!uul!uul!uul!uul!uu!", "`nullnullnull`nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l!lll!lll!lll!lll!lll!lll!lll!ll!" + "'", str2, "l!lll!lll!lll!lll!lll!lll!lll!ll!");
    }

    @Test
    public void test01281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01281");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!!", "\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108nullnull!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!" + "'", str2, "LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!");
    }

    @Test
    public void test01282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01282");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!", "IJLLIJLL!!IJLLIJLL!!IJLLIJLLIJLLIJLL!!IJLLIJLL!!IJLLIJLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!" + "'", str2, "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!");
    }

    @Test
    public void test01283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01283");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300!", "JILLJILLJILLJILLJILLJILLJILLJILL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01284");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e!", "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL!" + "'", str2, "~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL!");
    }

    @Test
    public void test01285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01285");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!", "}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!" + "'", str2, "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!");
    }

    @Test
    public void test01286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01286");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!", "nullUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!" + "'", str2, "!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!");
    }

    @Test
    public void test01287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01287");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUU!", "nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01288");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullZWXXZWXXZWXXZWXXnullnullnullnullZWXXZWXX!", "\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016enullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128nullnullnullnullnullnullnullnull!" + "'", str2, "\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01289");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!", "!\253\256\256nullnullnullnullnullnullnullnullnullnullnullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256nullnullnullnullnullnullnullnullnullnullnullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test01290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01290");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "UUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01291");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014f!", "\305\306\310\310\305\306\310\310!!\305\306\310\310\305\306\310\310!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!" + "'", str2, "!null!");
    }

    @Test
    public void test01292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01292");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!" + "'", str2, "nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test01293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01293");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!", "\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017enullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0!" + "'", str2, "\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0!");
    }

    @Test
    public void test01294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01294");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UNLLUNLL!", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01295");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230\200}}`UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!!" + "'", str2, "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!!");
    }

    @Test
    public void test01296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01296");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!", "LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!" + "'", str2, "UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!");
    }

    @Test
    public void test01297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01297");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("hhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHH!", "unllunllunllunllunllunllunllunll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "llllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLL!" + "'", str2, "llllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLL!");
    }

    @Test
    public void test01298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01298");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!", "\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348\u0345\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!");
    }

    @Test
    public void test01299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01299");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!!", "null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!!null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!!null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!!null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!!null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test01300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01300");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253\254\256\256\253\254\256\256!!\253\254\256\256\253\254\256\256!!!", "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256\253\254\256\256!!\253\254\256\256\253\254\256\256!!!" + "'", str2, "\253\254\256\256\253\254\256\256!!\253\254\256\256\253\254\256\256!!!");
    }

    @Test
    public void test01301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01301");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull!", "IJLLIJLL!!IJLLIJLL!!IJLLIJLLIJLLIJLL!!IJLLIJLL!!IJLLIJLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230!" + "'", str2, "~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230!");
    }

    @Test
    public void test01302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01302");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!", "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test01303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01303");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!", "!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01304");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test01305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01305");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!", "}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}!" + "'", str2, "~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}!");
    }

    @Test
    public void test01306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01306");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!", "fehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH\200}}`EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH]]!" + "'", str2, "EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH\200}}`EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH]]!");
    }

    @Test
    public void test01307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01307");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!", "UNLLUNLLUNLLUNLLULLLULLLULLLULLLUNLLUNLLUNLLUNLLULLLULLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!" + "'", str2, "xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!");
    }

    @Test
    public void test01308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01308");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!null!", "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0289\u028a\u028c\u028c!" + "'", str2, "\u0289\u028a\u028c\u028c!");
    }

    @Test
    public void test01309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01309");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230!", "\352\351\354\354\352\351\354\354!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230!" + "'", str2, "~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230!");
    }

    @Test
    public void test01310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01310");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300!", "l!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01311");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "null~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnullnull~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0346\u0348\u0348!");
    }

    @Test
    public void test01312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01312");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLUULLUULLUULLUULLUULLUULLUULLUU!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRR!" + "'", str2, "TTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRR!");
    }

    @Test
    public void test01313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01313");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH\200}}`EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH]]!", "!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU\200}}`!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU]]!" + "'", str2, "!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU\200}}`!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU]]!");
    }

    @Test
    public void test01314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01314");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test01315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01315");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "LL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01316");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!" + "'", str2, "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
    }

    @Test
    public void test01317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01317");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test01318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01318");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216!", "LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216!" + "'", str2, "\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216!");
    }

    @Test
    public void test01319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01319");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u0346\u0348\u0348!");
    }

    @Test
    public void test01320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01320");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("l!lll!lll!lll!lll!lll!lll!lll!ll!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200!\200\200\200!\200\200\200!\200\200\200!\200\200\200!\200\200\200!\200\200\200!\200\200\200!\200\200!" + "'", str2, "\200!\200\200\200!\200\200\200!\200\200\200!\200\200\200!\200\200\200!\200\200\200!\200\200\200!\200\200!");
    }

    @Test
    public void test01321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01321");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!~UU!~UU!~UU!~UU!~UU!~UU!~UU!~UU!!!~UU!~UU!~UU!~UU!~UU!~UU!~UU!~UU!!!", "\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!!!" + "'", str2, "!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!!!");
    }

    @Test
    public void test01322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01322");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("H!!!H!!!H!!!H!!!H!!!H!!!H!!!H!!!!", "\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!!" + "'", str2, "\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!!");
    }

    @Test
    public void test01323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01323");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("N~LLN~LL!!N~LLN~LL!!N~LLN~LLN~LLN~LL!!N~LLN~LL!!N~LLN~LL!", "!~UU!~UU!~UU!~UU!~UU!~UU!~UU!~UU!!!~UU!~UU!~UU!~UU!~UU!~UU!~UU!~UU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnullnull~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnull!" + "'", str2, "null~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnullnull~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnull!");
    }

    @Test
    public void test01324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01324");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017enullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01325");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01326");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!", "ULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!" + "'", str2, "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
    }

    @Test
    public void test01327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01327");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u0346\u0348\u0348!");
    }

    @Test
    public void test01328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01328");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU\200}}`!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU]]!", "nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN\200}}`!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN]]!" + "'", str2, "!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN\200}}`!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN]]!");
    }

    @Test
    public void test01329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01329");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("URRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRR\200}}`URRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRR]]!", "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL]]!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL]]!");
    }

    @Test
    public void test01330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01330");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256!", "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256!" + "'", str2, "\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256!");
    }

    @Test
    public void test01331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01331");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~TT!~TT!!!~TT!~TT!!!~TT!~TT!~TT!~TT!!!~TT!~TT!!!~TT!~TT!", "F!HHF!HHF!HHF!HHF!HHF!HHF!HHF!HH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~HH!~HH!!!~HH!~HH!!!~HH!~HH!~HH!~HH!!!~HH!~HH!!!~HH!~HH!" + "'", str2, "!~HH!~HH!!!~HH!~HH!!!~HH!~HH!~HH!~HH!!!~HH!~HH!!!~HH!~HH!");
    }

    @Test
    public void test01332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01332");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e!", "\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340nullnullnullnullnullnullnullnull\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340nullnullnullnullnullnullnullnull!" + "'", str2, "\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340nullnullnullnullnullnullnullnull\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01333");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!", "H!!!H!!!H!!!H!!!H!!!H!!!H!!!H!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!" + "'", str2, "!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!");
    }

    @Test
    public void test01334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01334");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017enullnull!", "\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f!" + "'", str2, "\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f!");
    }

    @Test
    public void test01335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01335");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128!", "LLUULLUULLUULLUULLUULLUULLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01336");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01337");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108nullnull!!!!!!!", "\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016enullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016eUU!!!!!!!" + "'", str2, "\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016eUU!!!!!!!");
    }

    @Test
    public void test01338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01338");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\352\351\354\354\352\351\354\354!", "HH!!HH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01339");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0!", "XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XX!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01340");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!");
    }

    @Test
    public void test01341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01341");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LULLLULL!!LULLLULL!!LULLLULLLULLLULL!!LULLLULL!!LULLLULL!", "\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L\335LLL\335LL!!L\335LLL\335LL!!L\335LLL\335LLL\335LLL\335LL!!L\335LLL\335LL!!L\335LLL\335LL!" + "'", str2, "L\335LLL\335LL!!L\335LLL\335LL!!L\335LLL\335LLL\335LLL\335LL!!L\335LLL\335LL!!L\335LLL\335LL!");
    }

    @Test
    public void test01342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01342");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULLUULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!", "\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\200}}`\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!" + "'", str2, "\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!");
    }

    @Test
    public void test01343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01343");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!", "UNLLUNLL!!UNLLUNLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "porrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporr!" + "'", str2, "porrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporr!");
    }

    @Test
    public void test01344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01344");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("hhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHH!", "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01345");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!", "h]hhh]hh!!h]hhh]hh!!h]hhh]hhh]hhh]hh!!h]hhh]hh!!h]hhh]hh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!" + "'", str2, "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!");
    }

    @Test
    public void test01346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01346");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\352\351\354\354\352\351\354\354!", "\275XXX\275XXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01347");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("RRPPRRPPRRPPRRPPRRPPRRPPRRPPRRPP!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01348");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLL!", "nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRR!" + "'", str2, "ORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRR!");
    }

    @Test
    public void test01349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01349");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NULLNULL!!NULLNULL!!NULLNULLNULLNULL!!NULLNULL!!NULLNULL!", "hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01350");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!", "!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de!!!" + "'", str2, "\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de!!!");
    }

    @Test
    public void test01351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01351");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLLUNLL!", "nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLUUNLUU!" + "'", str2, "NLUUNLUU!");
    }

    @Test
    public void test01352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01352");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("l!uul!uul!uul!uul!uul!uul!uul!uu!", "nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn!" + "'", str2, "l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn!");
    }

    @Test
    public void test01353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01353");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU\200}}`!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU!LUU]]!", "nullnull\336\336nullnull\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!\200}}`!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!]]!" + "'", str2, "!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!\200}}`!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!]]!");
    }

    @Test
    public void test01354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01354");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HFFFHFFF!", "\u0346\u0348\u0348\u0348\u0108\u0106\u0106\u0106\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106!" + "'", str2, "\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106!");
    }

    @Test
    public void test01355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01355");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LNUULNUU!!LNUULNUU!!LNUULNUULNUULNUU!!LNUULNUU!!LNUULNUU!", "ORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01356");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("llllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLL!", "UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01357");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214!", "IILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214!" + "'", str2, "\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214!");
    }

    @Test
    public void test01358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01358");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01359");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!", "TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "T!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TT!" + "'", str2, "T!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TT!");
    }

    @Test
    public void test01360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01360");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253!", "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253!" + "'", str2, "\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253!");
    }

    @Test
    public void test01361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01361");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!" + "'", str2, "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
    }

    @Test
    public void test01362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01362");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("h]hhh]hh!!h]hhh]hh!!h]hhh]hhh]hhh]hh!!h]hhh]hh!!h]hhh]hh!", "LLUULLUULLUULLUULLUULLUULLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!" + "'", str2, "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!");
    }

    @Test
    public void test01363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01363");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "\u017e\u017e\u017e\u017e\u017e\u017enullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!" + "'", str2, "LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!");
    }

    @Test
    public void test01364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01364");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01365");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!" + "'", str2, "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!");
    }

    @Test
    public void test01366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01366");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!!", "\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!!" + "'", str2, "~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!!");
    }

    @Test
    public void test01367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01367");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01368");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300!", "LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ!" + "'", str2, "\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ!");
    }

    @Test
    public void test01369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01369");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014enullnull!", "\u0289\u028a\u028c\u028c!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01370");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("IJLLIJLL!!IJLLIJLL!!IJLLIJLLIJLLIJLL!!IJLLIJLL!!IJLLIJLL!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NULLNULL!!NULLNULL!!NULLNULLNULLNULL!!NULLNULL!!NULLNULL!" + "'", str2, "NULLNULL!!NULLNULL!!NULLNULLNULLNULL!!NULLNULL!!NULLNULL!");
    }

    @Test
    public void test01371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01371");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!", "\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214!" + "'", str2, "\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214!");
    }

    @Test
    public void test01372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01372");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214!", "\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214!" + "'", str2, "\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214!");
    }

    @Test
    public void test01373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01373");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("hnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!", "XXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxx!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!" + "'", str2, "XXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
    }

    @Test
    public void test01374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01374");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!", "\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!" + "'", str2, "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!");
    }

    @Test
    public void test01375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01375");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300!", "^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01376");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("TTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRR!", "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01377");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275nullnullnull\276null\275\275!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275UNLLUNLLUNLL\276UNLL\275\275!" + "'", str2, "\275UNLLUNLLUNLL\276UNLL\275\275!");
    }

    @Test
    public void test01378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01378");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420!!!", "LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043bnullnullnullnullnullnull!!!" + "'", str2, "\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043bnullnullnullnullnullnull!!!");
    }

    @Test
    public void test01379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01379");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL}~\200\200}~\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!" + "'", str2, "}~\200\200}~\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL}~\200\200}~\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!");
    }

    @Test
    public void test01380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01380");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!!", "]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!" + "'", str2, "nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!");
    }

    @Test
    public void test01381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01381");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("l!lll!lll!lll!lll!lll!lll!lll!ll!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LL!" + "'", str2, "L!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LL!");
    }

    @Test
    public void test01382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01382");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test01383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01383");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!!", "LLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!!" + "'", str2, "LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!!");
    }

    @Test
    public void test01384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01384");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108!", "\u014e\u014e\u014e\u014e!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01385");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0289\u028a\u028c\u028c!", "~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLUU!" + "'", str2, "!LLUU!");
    }

    @Test
    public void test01386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01386");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368nullnull!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368nullnull!");
    }

    @Test
    public void test01387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01387");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!", "UNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01388");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UUUUUUUUUUUUUUUU\200}}`UUUUUUUUUUUUUUUU]]!", "\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test01389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01389");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01390");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256!", "FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256!" + "'", str2, "~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256!");
    }

    @Test
    public void test01391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01391");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!", "\276\276!!\276\276!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test01392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01392");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!" + "'", str2, "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!");
    }

    @Test
    public void test01393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01393");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!", "nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!" + "'", str2, "U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!");
    }

    @Test
    public void test01394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01394");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014enullnull!", "nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01395");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!", "FEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHH!!FEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHH!!FEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHH!!FEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHH!!FEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!" + "'", str2, "\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!");
    }

    @Test
    public void test01396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01396");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn!", "!e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test01397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01397");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140!", "NNLLLLNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnull!" + "'", str2, "hnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnull!");
    }

    @Test
    public void test01398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01398");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!!", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!!" + "'", str2, "FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!!");
    }

    @Test
    public void test01399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01399");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126!!!", "TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test01400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01400");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01401");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\246\246!!\246\246!!!", "\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\246\246!!\246\246!!!" + "'", str2, "\246\246!!\246\246!!!");
    }

    @Test
    public void test01402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01402");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!", "\275nullnullnull\276null\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!" + "'", str2, "!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!");
    }

    @Test
    public void test01403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01403");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUU!", "LNNNLNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!" + "'", str2, "EEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!");
    }

    @Test
    public void test01404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01404");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("l!lll!lll!lll!lll!lll!lll!lll!ll!", "\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test01405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01405");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01406");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("XXXXXXXXXXXXXXXX\200}}`XXXXXXXXXXXXXXXX]]!", "L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test01407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01407");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u017e\u017e\u017e\u017e\u017e\u017enullnullnullnullnullnullnullnull!", "\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01408");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!", "JLLLJLLLJLLLJLLLJLLLJLLLJLLLJLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!" + "'", str2, "\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!");
    }

    @Test
    public void test01409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01409");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!", "NLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL!" + "'", str2, "LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL!");
    }

    @Test
    public void test01410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01410");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!", "FEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!" + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
    }

    @Test
    public void test01411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01411");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}!" + "'", str2, "~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}!");
    }

    @Test
    public void test01412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01412");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLUUUULL!", "\u01a0\u0196\u019d\u019dnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!!!LL!" + "'", str2, "LL!!!!LL!");
    }

    @Test
    public void test01413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01413");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014b\u014c\u014e\u014e\u014b\u014c\u014e\u014e!", "AALLLLAA!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01414");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!T!!!T!!!!!T!!!T!!!!!T!!!T!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!", "\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!" + "'", str2, "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!");
    }

    @Test
    public void test01415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01415");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!", "\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253!" + "'", str2, "\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253!");
    }

    @Test
    public void test01416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01416");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test01417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01417");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e!!!", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test01418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01418");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01419");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106!!!", "!e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test01420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01420");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("l]lll]ll!!l]lll]ll!!l]lll]lll]lll]ll!!l]lll]ll!!l]lll]ll!", "TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!" + "'", str2, "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!");
    }

    @Test
    public void test01421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01421");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214!", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214!");
    }

    @Test
    public void test01422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01422");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!", "nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!" + "'", str2, "\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!");
    }

    @Test
    public void test01423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01423");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\340\340!!nullnullnull\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!nullnullnull\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!!", "LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!UULLUULLUULLLL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!UULLUULLUULLLL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!" + "'", str2, "LL!!UULLUULLUULLLL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!UULLUULLUULLLL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
    }

    @Test
    public void test01424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01424");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248!", "\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01425");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!!", "ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!!ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!!ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!!ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!!ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!!" + "'", str2, "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!!");
    }

    @Test
    public void test01426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01426");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u03dd\u03de\u03e0\u03e0nullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test01427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01427");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!T!!!T!!!!!T!!!T!!!!!T!!!T!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!" + "'", str2, "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!");
    }

    @Test
    public void test01428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01428");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NULLNULLNULLNULLNULLNULLNULLNULL!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test01429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01429");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NNNNNNNN!!NNNNNNNN!!NNNNNNNNNNNNNNNN!!NNNNNNNN!!NNNNNNNN!", "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215!" + "'", str2, "\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215!");
    }

    @Test
    public void test01430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01430");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01431");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLUUUULL!", "FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FFFFFFFF!" + "'", str2, "FFFFFFFF!");
    }

    @Test
    public void test01432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01432");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u03dd\u03de\u03e0\u03e0nullnullnullnull!", "~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\254~\256\256\254~\256\256\254~\256\256\254~\256\256!" + "'", str2, "nullnullnullnull\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
    }

    @Test
    public void test01433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01433");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128nullnull!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnull!");
    }

    @Test
    public void test01434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01434");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300!", "!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01435");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\226!", "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\226!" + "'", str2, "!\226!");
    }

    @Test
    public void test01436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01436");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01437");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull!", "NLLLNLLLNLLLNLLLLLNNLLNNLLNNLLNNNLLLNLLLNLLLNLLLLLNNLLNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226!");
    }

    @Test
    public void test01438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01438");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL!!!!LL!", "nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!!!LL!" + "'", str2, "LL!!!!LL!");
    }

    @Test
    public void test01439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01439");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!", "UULLUULL!!UULLUULL!!UULLUULLUULLUULL!!UULLUULL!!UULLUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!" + "'", str2, "!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!");
    }

    @Test
    public void test01440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01440");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\300\300\300\276\300\275\275!", "\335\300\336\336\335\300\336\336\335\300\336\336\335\300\336\336\335\300\336\336\335\300\336\336\335\300\336\336\335\300\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnull\276null\275\275!" + "'", str2, "\275nullnullnull\276null\275\275!");
    }

    @Test
    public void test01441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01441");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014enullnull!", "HFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFF!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01442");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!", "null~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnullnull~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test01443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01443");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200U^LLU^LL}~\200\200}~\200\200U^LLU^LL!", "\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200null^nullnullnull^nullnull}~\200\200}~\200\200null^nullnullnull^nullnull!" + "'", str2, "}~\200\200}~\200\200null^nullnullnull^nullnull}~\200\200}~\200\200null^nullnullnull^nullnull!");
    }

    @Test
    public void test01444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01444");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullLULLLULLLULLLULLnullnull!", "!\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01445");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn!", "EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull!" + "'", str2, "\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01446");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e!", "\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test01447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01447");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLLUNLLUNLLUNLLUNLL!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NULLNULLNULLNULLNULL!" + "'", str2, "NULLNULLNULLNULLNULL!");
    }

    @Test
    public void test01448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01448");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!!", "fehhfehhfehhfehhfehhfehhfehhfehh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!!" + "'", str2, "EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!!");
    }

    @Test
    public void test01449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01449");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368nullnull\200\200\u0346\u0348\u0348!", "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368LL!!LL!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368LL!!LL!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test01450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01450");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ULLLULLLULLLULLLULLLULLLULLLULLL!", "\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180!" + "'", str2, "\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180!");
    }

    @Test
    public void test01451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01451");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\225\230\230null\225\230\230null\225\230\230null\225\230\230\200}}`null\225\230\230null\225\230\230null\225\230\230null\225\230\230]]!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230\200}}`nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230]]!" + "'", str2, "nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230\200}}`nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230]]!");
    }

    @Test
    public void test01452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01452");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!", "L!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!" + "'", str2, "!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!");
    }

    @Test
    public void test01453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01453");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NULLNULL!!NULLNULL!!NULLNULLNULLNULL!!NULLNULL!!NULLNULL!", "LL!!UULLUULLUULLLL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!UULLUULLUULLLL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\236\276\276null\236\276\276!!null\236\276\276null\236\276\276!!null\236\276\276null\236\276\276null\236\276\276null\236\276\276!!null\236\276\276null\236\276\276!!null\236\276\276null\236\276\276!" + "'", str2, "null\236\276\276null\236\276\276!!null\236\276\276null\236\276\276!!null\236\276\276null\236\276\276null\236\276\276null\236\276\276!!null\236\276\276null\236\276\276!!null\236\276\276null\236\276\276!");
    }

    @Test
    public void test01454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01454");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test01455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01455");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnull!", "wxzzwxzz!!wxzzwxzz!!wxzzwxzzwxzzwxzz!!wxzzwxzz!!wxzzwxzz!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01456");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLNLLLNLLLNLLL\200}}`NLLLNLLLNLLLNLLL]]!", "}~\200\200}~\200\200null^nullnullnull^nullnull}~\200\200}~\200\200null^nullnullnull^nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204\200}}`\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204]]!" + "'", str2, "\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204\200}}`\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204]]!");
    }

    @Test
    public void test01457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01457");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!", "\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043bnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!" + "'", str2, "~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!");
    }

    @Test
    public void test01458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01458");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNN!", "U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!]nullnullnull]nullnullnullnullnull!!nullnull!!]nullnullnull]nullnullnullnullnull!!nullnull!!]nullnullnull]nullnullnullnullnull!!nullnull!!]nullnullnull]nullnullnullnullnull!!nullnull!!]nullnullnull]nullnullnullnullnull!!nullnull!!]nullnullnull]nullnullnullnullnull!!nullnull!!]nullnullnull]nullnullnullnullnull!!nullnull!!]nullnullnull]nullnullnull!" + "'", str2, "nullnull!!nullnull!!]nullnullnull]nullnullnullnullnull!!nullnull!!]nullnullnull]nullnullnullnullnull!!nullnull!!]nullnullnull]nullnullnullnullnull!!nullnull!!]nullnullnull]nullnullnullnullnull!!nullnull!!]nullnullnull]nullnullnullnullnull!!nullnull!!]nullnullnull]nullnullnullnullnull!!nullnull!!]nullnullnull]nullnullnullnullnull!!nullnull!!]nullnullnull]nullnullnull!");
    }

    @Test
    public void test01459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01459");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("llllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLL!", "\230\230\225\225\230\230\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01460");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256!" + "'", str2, "~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256!");
    }

    @Test
    public void test01461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01461");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214!", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!" + "'", str2, "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!");
    }

    @Test
    public void test01462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01462");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01463");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!!", "nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!!" + "'", str2, "\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!!");
    }

    @Test
    public void test01464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01464");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LULLLULL!!LULLLULL!!LULLLULLLULLLULL!!LULLLULL!!LULLLULL!", "!fhhnullnullnull!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhhnullnullnull!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!" + "'", str2, "\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!");
    }

    @Test
    public void test01465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01465");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!", "\u0366\u0365\u0368\u0368nullnull\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!" + "'", str2, "J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!");
    }

    @Test
    public void test01466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01466");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!", "\230\230\225\225\230\230\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!" + "'", str2, "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!");
    }

    @Test
    public void test01467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01467");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7!" + "'", str2, "\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7!");
    }

    @Test
    public void test01468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01468");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("unllunllunllunllunllunllunllunll!", "]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL!!]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL!!]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL!!]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL!!]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!" + "'", str2, "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!");
    }

    @Test
    public void test01469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01469");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!!" + "'", str2, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!!");
    }

    @Test
    public void test01470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01470");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH\200}}`EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH]]!", "nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL\200}}`NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL]]!" + "'", str2, "NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL\200}}`NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL]]!");
    }

    @Test
    public void test01471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01471");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!" + "'", str2, "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!");
    }

    @Test
    public void test01472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01472");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214!" + "'", str2, "TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214TTQQTTQQTTQQTTQQTTQQTTQQTTQQTTQQ\214\214!");
    }

    @Test
    public void test01473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01473");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("xxxxxxxxxxxxxxxxnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullxxxxxxxxxxxxxxxxnullnullnullnullnullnullnullnull!", "EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01474");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300!", "null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01475");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRR!", "NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUU!" + "'", str2, "UNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUU!");
    }

    @Test
    public void test01476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01476");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "nullnullnullnullabddabddabddabddnullnullnullnullabddabdd!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01477");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106!", "LL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01478");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("lluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUU!", "l!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LL!" + "'", str2, "UUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LL!");
    }

    @Test
    public void test01479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01479");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!", "\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test01480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01480");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test01481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01481");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01482");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!!", "\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108nullnull!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!!" + "'", str2, "~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!!");
    }

    @Test
    public void test01483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01483");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230\200}}`LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230]]!", "ULLLULLLULLLULLLULLLULLLULLLULLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230\200}}`LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230]]!" + "'", str2, "LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230\200}}`LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230]]!");
    }

    @Test
    public void test01484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01484");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0170null!", "NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\256nullnullnull!" + "'", str2, "null\256nullnullnull!");
    }

    @Test
    public void test01485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01485");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!", "l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!" + "'", str2, "\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!");
    }

    @Test
    public void test01486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01486");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("lluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUU!", "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLL!" + "'", str2, "LL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLL!");
    }

    @Test
    public void test01487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01487");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01488");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0128\u0128\u0128\u0128\u0346\u0348\u0348!", "\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test01489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01489");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0346\u0348\u0348!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test01490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01490");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!", "FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!" + "'", str2, "nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!");
    }

    @Test
    public void test01491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01491");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!" + "'", str2, "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
    }

    @Test
    public void test01492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01492");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!", "null\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0!" + "'", str2, "\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0!");
    }

    @Test
    public void test01493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01493");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300!", "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246!" + "'", str2, "\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246!");
    }

    @Test
    public void test01494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01494");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhh!", "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!!" + "'", str2, "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!!");
    }

    @Test
    public void test01495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01495");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!", "\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!" + "'", str2, "!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test01496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01496");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!!", "wxzzwxzz!!wxzzwxzz!!wxzzwxzzwxzzwxzz!!wxzzwxzz!!wxzzwxzz!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!!" + "'", str2, "ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!!");
    }

    @Test
    public void test01497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01497");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "!u!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01498");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!!", "\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!!" + "'", str2, "\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!!");
    }

    @Test
    public void test01499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01499");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!!", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014enullnull!!!" + "'", str2, "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014enullnull!!!");
    }

    @Test
    public void test01500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01500");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("xxxxxxxxxxxxxxxxnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullxxxxxxxxxxxxxxxxnullnullnullnullnullnullnullnull!", "\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }
}
