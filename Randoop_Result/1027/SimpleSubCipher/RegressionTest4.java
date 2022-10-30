package SimpleSubCipher;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test02001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02001");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u0346\u0348\u0348!", "!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test02002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02002");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!", "}~\200\200}~\200\200nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216!!\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216!!\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216!!\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216!!\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216!" + "'", str2, "\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216!!\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216!!\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216!!\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216!!\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216!");
    }

    @Test
    public void test02003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02003");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02004");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!", "\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!" + "'", str2, "UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!");
    }

    @Test
    public void test02005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02005");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "ECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBB!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02006");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014enullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU!" + "'", str2, "\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU!");
    }

    @Test
    public void test02007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02007");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340!", "UNLLUNLL!!UNLLUNLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "porrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnull!" + "'", str2, "porrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnull!");
    }

    @Test
    public void test02008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02008");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("``!!``!!``!!``!!``!!``!!``!!``!!!", "UNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!!``!!``!!``!!``!!``!!``!!``!!!" + "'", str2, "``!!``!!``!!``!!``!!``!!``!!``!!!");
    }

    @Test
    public void test02009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02009");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226!", "L]LLL]LL!!L]LLL]LL!!L]LLL]LLL]LLL]LL!!L]LLL]LL!!L]LLL]LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226!" + "'", str2, "\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226!");
    }

    @Test
    public void test02010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02010");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!", "nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!!efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!!efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!!efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!!efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!" + "'", str2, "efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!!efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!!efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!!efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!!efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!");
    }

    @Test
    public void test02011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02011");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullLULLLULLLULLLULLnullnull!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02012");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!", "~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test02013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02013");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215!", "UUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215!" + "'", str2, "\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215!");
    }

    @Test
    public void test02014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02014");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226!", "efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!!efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!!efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!!efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!!efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226!");
    }

    @Test
    public void test02015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02015");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("fehhfehhfehhfehhfehhfehhfehhfehh!", "NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02016");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("xxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!", "LNLLLNLL!!LNLLLNLL!!LNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test02017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02017");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test02018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02018");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!!", "LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!!" + "'", str2, "\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!!");
    }

    @Test
    public void test02019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02019");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!!");
    }

    @Test
    public void test02020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02020");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "NULLNULLNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test02021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02021");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!", "~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!" + "'", str2, "]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!");
    }

    @Test
    public void test02022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02022");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!!" + "'", str2, "^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!!");
    }

    @Test
    public void test02023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02023");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108nullnull!!!!!!!", "\u0366\u0365\u0368\u0368!!\216\216\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!!" + "'", str2, "nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!!");
    }

    @Test
    public void test02024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02024");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!", "l]lll]ll!!l]lll]ll!!l]lll]lll]lll]ll!!l]lll]ll!!l]lll]ll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!" + "'", str2, "!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
    }

    @Test
    public void test02025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02025");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230!", "FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230!" + "'", str2, "~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230!");
    }

    @Test
    public void test02026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02026");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\225\230\230null\225\230\230null\225\230\230null\225\230\230\200}}`null\225\230\230null\225\230\230null\225\230\230null\225\230\230]]!", "nullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRR!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\200\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230]]!" + "'", str2, "\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\200\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230]]!");
    }

    @Test
    public void test02027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02027");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "\275nullnullnull\276null\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll!" + "'", str2, "\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll!");
    }

    @Test
    public void test02028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02028");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02029");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02030");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226!", "XXXXXXXXXXXXXXXX\200}}`XXXXXXXXXXXXXXXX]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226!" + "'", str2, "\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226!");
    }

    @Test
    public void test02031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02031");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!", "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!" + "'", str2, "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
    }

    @Test
    public void test02032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02032");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLL!", "\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02033");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\200!", "^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\200!" + "'", str2, "!\200!");
    }

    @Test
    public void test02034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02034");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "UULLUULLUULLUULLUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test02035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02035");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\220\220!!\220\220!!\220\220!!\220\220\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\220\220!!\220\220!!\220\220!!\220\220\u0346\u0348\u0348!");
    }

    @Test
    public void test02036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02036");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368!!\216\216\u0346\u0348\u0348!", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!!\216\216\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!!\216\216\u0346\u0348\u0348!");
    }

    @Test
    public void test02037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02037");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!", "^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!" + "'", str2, "\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!");
    }

    @Test
    public void test02038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02038");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02039");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106!", "NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUU!" + "'", str2, "UULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUU!");
    }

    @Test
    public void test02040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02040");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7!", "\u0366\u0365\u0368\u0368LL!!LL!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02041");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!", "!~UU!~UU!~UU!~UU!~UU!~UU!~UU!~UU!!!~UU!~UU!~UU!~UU!~UU!~UU!~UU!~UU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test02042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02042");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "h]hhh]hh!!h]hhh]hh!!h]hhh]hhh]hhh]hh!!h]hhh]hh!!h]hhh]hh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test02043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02043");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u041b\u041c\u041c\u041c\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u041b\u041c\u041c\u041c\u0346\u0348\u0348!");
    }

    @Test
    public void test02044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02044");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7!", "~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02045");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\300\300\275\275\300\300\275\275\300\300\275\275\300\300\275\275\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\300\300\275\275\300\300\275\275!", "LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275LLL\275LLL\275LLL\275LLLLL\275\275LL\275\275LL\275\275LL\275\275\275LLL\275LLL\275LLL\275LLLLL\275\275LL\275\275!" + "'", str2, "\275LLL\275LLL\275LLL\275LLLLL\275\275LL\275\275LL\275\275LL\275\275\275LLL\275LLL\275LLL\275LLLLL\275\275LL\275\275!");
    }

    @Test
    public void test02046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02046");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!", "ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!" + "'", str2, "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!");
    }

    @Test
    public void test02047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02047");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!", "nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!" + "'", str2, "U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!");
    }

    @Test
    public void test02048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02048");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!", "nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!" + "'", str2, "!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!");
    }

    @Test
    public void test02049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02049");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!u!", "lluulluu!!lluulluu!!lluulluulluulluu!!lluulluu!!lluulluu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\230!" + "'", str2, "!\230!");
    }

    @Test
    public void test02050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02050");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106\u0128\u0108\u0106\u0106!!!", "UNLLUNLLUNLLUNLLULLLULLLULLLULLLUNLLUNLLUNLLUNLLULLLULLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test02051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02051");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230\200}}`UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230]]!", "LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL^^\225\230\230LL^^\225\230\230LL^^\225\230\230LL^^\225\230\230\200}}`LL^^\225\230\230LL^^\225\230\230LL^^\225\230\230LL^^\225\230\230]]!" + "'", str2, "LL^^\225\230\230LL^^\225\230\230LL^^\225\230\230LL^^\225\230\230\200}}`LL^^\225\230\230LL^^\225\230\230LL^^\225\230\230LL^^\225\230\230]]!");
    }

    @Test
    public void test02052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02052");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!", "\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!" + "'", str2, "\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!");
    }

    @Test
    public void test02053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02053");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!", "!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!\200}}`!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!" + "'", str2, "U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!");
    }

    @Test
    public void test02054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02054");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("FEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHH!", "EHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220!" + "'", str2, "null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220!");
    }

    @Test
    public void test02055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02055");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!L!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!X!" + "'", str2, "!X!");
    }

    @Test
    public void test02056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02056");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017enullnull!", "\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140!" + "'", str2, "\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140!");
    }

    @Test
    public void test02057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02057");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\340\340!!nullnullnull\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!nullnullnull\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!!", "`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NN!!U`LLU`LLU`LLNN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!U`LLU`LLU`LLNN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!" + "'", str2, "NN!!U`LLU`LLU`LLNN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!U`LLU`LLU`LLNN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!");
    }

    @Test
    public void test02058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02058");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "LL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02059");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```!", "\u0366\u0365\u0368\u0368\u0345\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```!" + "'", str2, "nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```!");
    }

    @Test
    public void test02060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02060");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("EEEEEEEEEEEEEEEE\200}}`EEEEEEEEEEEEEEEE]]!", "\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test02061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02061");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108!", "NULLNULLNULLNULLNULLNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02062");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`LLUULLUULLUU`LLUULLUULLUU!", "porrporrporrporrporrporrporrporrnullporrnullnullnullporrnullnullporrporrporrporrporrporrporrporrnullporrnullnullnullporrnullnullporrporrporrporrporrporrporrporrnullporrnullnullnullporrnullnullporrporrporrporrporrporrporrporrnullporrnullnullnullporrnullnullporrporrporrporrporrporrporrporrnullporrnullnullnullporrnullnullporrporrporrporrporrporrporrporrnullporrnullnullnullporrnullnullporrporrporrporrporrporrporrporrnullporrnullnullnullporrnullnullporrporrporrporrporrporrporrporrnullporrnullnullnullporrnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`RRPPRRPPRRPP`RRPPRRPPRRPP!" + "'", str2, "`RRPPRRPPRRPP`RRPPRRPPRRPP!");
    }

    @Test
    public void test02063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02063");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("u`uu`UUU!", "NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u03aa\u03aa\u03aa\u038a\u038a\u038a!" + "'", str2, "\u03aa\u03aa\u03aa\u038a\u038a\u038a!");
    }

    @Test
    public void test02064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02064");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL}~\200\200}~\200\200NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!", "\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL}~\200\200}~\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!" + "'", str2, "}~\200\200}~\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL}~\200\200}~\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
    }

    @Test
    public void test02065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02065");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\276!!\276\276!!!", "\u013d\u013e\u0140\u0140\u013d\u013e\u0140\u0140nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276!!\276\276!!!" + "'", str2, "\276\276!!\276\276!!!");
    }

    @Test
    public void test02066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02066");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!", "LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!" + "'", str2, "N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!");
    }

    @Test
    public void test02067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02067");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02068");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`LLUULLUULLUU`LLUULLUULLUU!", "!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02069");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnull!", "\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!" + "'", str2, "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!");
    }

    @Test
    public void test02070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02070");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!!", "!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!" + "'", str2, "!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!");
    }

    @Test
    public void test02071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02071");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!", "!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!" + "'", str2, "}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!");
    }

    @Test
    public void test02072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02072");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LUUULUUULUUULUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUULUUULUUULUUULUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02073");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("WZZZ\200}}`WZZZ]]!", "\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ua7ad\ua7ad\ua7ad\ua7ad\200\ua7ad\ua7ad\ua7ad\ua7ad]]!" + "'", str2, "\ua7ad\ua7ad\ua7ad\ua7ad\200\ua7ad\ua7ad\ua7ad\ua7ad]]!");
    }

    @Test
    public void test02074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02074");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230!", "UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!" + "'", str2, "~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!");
    }

    @Test
    public void test02075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02075");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!", "\u0366\u0365\u0368\u0368nullnull!!nullnull!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test02076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02076");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!!", "LNLLLNLL!!LNLLLNLL!!LNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!!" + "'", str2, "NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!!");
    }

    @Test
    public void test02077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02077");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340!", "\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248nullnullnull!" + "'", str2, "\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248nullnullnull!");
    }

    @Test
    public void test02078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02078");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340\u0348\u0346\u0346!", "nullnullLULLLULLLULLLULLnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull}~\200\200}~\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull}~\200\200}~\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test02079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02079");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!", "NLLLL]NNL]NNL]NNL]NNNLLLL]NNL]NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!" + "'", str2, "]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!");
    }

    @Test
    public void test02080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02080");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`nullhffnullhffnullhff`nullhffnullhffnullhff!", "RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`R!RRRRRR!RRRRRR!RRRRR`R!RRRRRR!RRRRRR!RRRRR!" + "'", str2, "`R!RRRRRR!RRRRRR!RRRRR`R!RRRRRR!RRRRRR!RRRRR!");
    }

    @Test
    public void test02081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02081");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u0366\u0365\u0368\u0368\220\220!!\220\220!!\220\220!!\220\220\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test02082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02082");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```!", "UBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```!" + "'", str2, "BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```!");
    }

    @Test
    public void test02083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02083");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0nullnull!" + "'", str2, "\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0nullnull!");
    }

    @Test
    public void test02084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02084");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullBBnullnullBB!", "\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248nullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!" + "'", str2, "\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!");
    }

    @Test
    public void test02085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02085");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!", "nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test02086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02086");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7!", "!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02087");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull}~\200\200}~\200\200\u0348\u0346\u0346!", "\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test02088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02088");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH\200}}`EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02089");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!!", "EnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!!" + "'", str2, "~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!!");
    }

    @Test
    public void test02090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02090");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\230\226nullnull\236\276\276\230\226nullnull\236\276\276!!\230\226nullnull\236\276\276\230\226nullnull\236\276\276!!\230\226nullnull\236\276\276\230\226nullnull\236\276\276\230\226nullnull\236\276\276\230\226nullnull\236\276\276!!\230\226nullnull\236\276\276\230\226nullnull\236\276\276!!\230\226nullnull\236\276\276\230\226nullnull\236\276\276!", "!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276!!\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276!!\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276!!\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276!!\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276!" + "'", str2, "\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276!!\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276!!\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276!!\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276!!\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276!");
    }

    @Test
    public void test02091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02091");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\200\200!!\200\200!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200!!\200\200!!!" + "'", str2, "\200\200!!\200\200!!!");
    }

    @Test
    public void test02092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02092");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("f]fff]ff!!f]fff]ff!!f]fff]fff]fff]ff!!f]fff]ff!!f]fff]ff!", "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!" + "'", str2, "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!");
    }

    @Test
    public void test02093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02093");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnull!", "\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d!" + "'", str2, "\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d!");
    }

    @Test
    public void test02094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02094");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f!", "hehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehh!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HH!!HH!!HHHH!!HH!!HH!" + "'", str2, "HH!!HH!!HHHH!!HH!!HH!");
    }

    @Test
    public void test02095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02095");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253\254\256\256nullnullnullnull\253\254\256\256nullnull!", "EHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnullnullnull!" + "'", str2, "\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02096");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!", "NULLNULL!!NULLNULL!!NULLNULLNULLNULL!!NULLNULL!!NULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!" + "'", str2, "vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!");
    }

    @Test
    public void test02097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02097");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UULLUULLUULLUULLUULL!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02098");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!", "\275!!!\275!!!\275!!!\275!!!!!\275\275!!\275\275!!\275\275!!\275\275\275!!!\275!!!\275!!!\275!!!!!\275\275!!\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!" + "'", str2, "~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!");
    }

    @Test
    public void test02099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02099");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!", "\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!" + "'", str2, "!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!");
    }

    @Test
    public void test02100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02100");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("````````````````````````````````!", "ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!!ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!!ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!!ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!!ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````````````````````!" + "'", str2, "````````````````````````````````!");
    }

    @Test
    public void test02101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02101");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```!", "FEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```!" + "'", str2, "EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```!");
    }

    @Test
    public void test02102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02102");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230\200}}`~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230]]!", "}~\200\200}~\200\200\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be}~\200\200}~\200\200\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230\200}}`~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230]]!" + "'", str2, "~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230\200}}`~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230]]!");
    }

    @Test
    public void test02103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02103");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204\200}}`\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02104");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!", "!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!" + "'", str2, "\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!");
    }

    @Test
    public void test02105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02105");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("efhhefhhefhhefhhefhhefhhefhhefhh!", "nullnullnullnull~N\200\200~N\200\200!!!!nullnullnullnull~N\200\200~N\200\200!!!!!!nullnullnullnull~N\200\200~N\200\200!!!!nullnullnullnull~N\200\200~N\200\200!!!!!!nullnullnullnull~N\200\200~N\200\200!!!!nullnullnullnull~N\200\200~N\200\200!!!!!!nullnullnullnull~N\200\200~N\200\200!!!!nullnullnullnull~N\200\200~N\200\200!!!!!!nullnullnullnull~N\200\200~N\200\200!!!!nullnullnullnull~N\200\200~N\200\200!!!!!!nullnullnullnull~N\200\200~N\200\200!!!!nullnullnullnull~N\200\200~N\200\200!!!!!!nullnullnullnull~N\200\200~N\200\200!!!!nullnullnullnull~N\200\200~N\200\200!!!!!!nullnullnullnull~N\200\200~N\200\200!!!!nullnullnullnull~N\200\200~N\200\200!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02106");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u0345\u0348\u0346\u0346!", "\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test02107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02107");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!", "l]lll]ll!!l]lll]ll!!l]lll]lll]lll]ll!!l]lll]ll!!l]lll]ll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!" + "'", str2, "!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!");
    }

    @Test
    public void test02108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02108");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\ua7ad\ua7ad\ua7ad\ua7ad\200\ua7ad\ua7ad\ua7ad\ua7ad]]!", "\275UNLLUNLLUNLL\276UNLL\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\200}}`nullnullnullnull]]!" + "'", str2, "nullnullnullnull\200}}`nullnullnullnull]]!");
    }

    @Test
    public void test02109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02109");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\253\253\253!\253\253\253!\253\253\253!\253\253\253\200}}`!\253\253\253!\253\253\253!\253\253\253!\253\253\253]]!", "nullnull!!nullnull!!nullnull!!nullnull!!null!!!null!!!null!!!null!!!nullnull!!nullnull!!nullnull!!nullnull!!null!!!null!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\253\253!\253\253\253!\253\253\253!\253\253\253\200}}`!\253\253\253!\253\253\253!\253\253\253!\253\253\253]]!" + "'", str2, "!\253\253\253!\253\253\253!\253\253\253!\253\253\253\200}}`!\253\253\253!\253\253\253!\253\253\253!\253\253\253]]!");
    }

    @Test
    public void test02110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02110");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!", "LL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!" + "'", str2, "]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!");
    }

    @Test
    public void test02111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02111");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!!", "}~\200\200}~\200\200U^LLU^LL}~\200\200}~\200\200U^LLU^LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!!" + "'", str2, "}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!!");
    }

    @Test
    public void test02112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02112");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ijllijllijllijll!ill!ill!ill!illijllijllijllijll!ill!ill!", "\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388!" + "'", str2, "\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388!");
    }

    @Test
    public void test02113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02113");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "NULLNULLNULLNULLNULLNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "unllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunll!" + "'", str2, "unllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunll!");
    }

    @Test
    public void test02114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02114");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull\336\336nullnull\336\336!", "UNLLUNLL!!UNLLUNLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l!nnl!nnnullnulll!nnl!nnnullnull!" + "'", str2, "l!nnl!nnnullnulll!nnl!nnnullnull!");
    }

    @Test
    public void test02115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02115");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test02116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02116");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!!", "EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0!!!" + "'", str2, "\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0!!!");
    }

    @Test
    public void test02117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02117");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHH!", "efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!!efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!!efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!!efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!!efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHH!" + "'", str2, "UELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHH!");
    }

    @Test
    public void test02118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02118");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02119");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLL!", "hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleenullhnulleenullnullnullhnulleenullnullhnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleenullhnulleenullnullnullhnulleenullnullhnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleenullhnulleenullnullnullhnulleenullnullhnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleenullhnulleenullnullnullhnulleenullnullhnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleenullhnulleenullnullnullhnulleenullnullhnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleenullhnulleenullnullnullhnulleenullnullhnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleenullhnulleenullnullnullhnulleenullnullhnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleenullhnulleenullnullnullhnulleenullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLL!" + "'", str2, "ELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLL!");
    }

    @Test
    public void test02120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02120");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!", "!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!" + "'", str2, "!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!");
    }

    @Test
    public void test02121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02121");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e!", "\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276!!\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276!!\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276!!\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276!!\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!!" + "'", str2, "\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!!");
    }

    @Test
    public void test02122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02122");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLL!", "~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}!" + "'", str2, "~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}!");
    }

    @Test
    public void test02123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02123");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test02124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02124");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!", "null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!" + "'", str2, "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
    }

    @Test
    public void test02125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02125");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!!", "efhhefhhefhhefhhefhhefhhefhhefhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!!" + "'", str2, "~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!!");
    }

    @Test
    public void test02126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02126");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLnullnullnullnullLLLLnullnull!", "LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLUUULUUULUUULUUULLLLLUUULUUU!" + "'", str2, "LLLLLUUULUUULUUULUUULLLLLUUULUUU!");
    }

    @Test
    public void test02127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02127");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336!", "}~\200\200}~\200\200NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL}~\200\200}~\200\200NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUU!" + "'", str2, "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUU!");
    }

    @Test
    public void test02128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02128");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "NUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\335\340\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\335\340\u0346\u0348\u0348!");
    }

    @Test
    public void test02129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02129");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!X!", "OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!" + "'", str2, "!null!");
    }

    @Test
    public void test02130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02130");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnull!");
    }

    @Test
    public void test02131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02131");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!" + "'", str2, "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!");
    }

    @Test
    public void test02132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02132");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d!", "\275nullnullnull\276null\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test02133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02133");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!", "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test02134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02134");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!", "~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!" + "'", str2, "}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!");
    }

    @Test
    public void test02135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02135");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!!", "N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test02136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02136");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!", "UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!" + "'", str2, "\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!");
    }

    @Test
    public void test02137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02137");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("l]lll]ll!!l]lll]ll!!l]lll]lll]lll]ll!!l]lll]ll!!l]lll]ll!", "AALLLLAA!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f]fff]ff!!f]fff]ff!!f]fff]fff]fff]ff!!f]fff]ff!!f]fff]ff!" + "'", str2, "f]fff]ff!!f]fff]ff!!f]fff]fff]fff]ff!!f]fff]ff!!f]fff]ff!");
    }

    @Test
    public void test02138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02138");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "UBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02139");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!LL!!!", "\u0170null!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EE!!EE!!!" + "'", str2, "EE!!EE!!!");
    }

    @Test
    public void test02140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02140");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NN!!U`LLU`LLU`LLNN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!U`LLU`LLU`LLNN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!", "``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UU!!````````````UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!````````````UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!" + "'", str2, "UU!!````````````UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!````````````UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!");
    }

    @Test
    public void test02141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02141");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "EHHHEHHHEHHHEHHHEHHHEHHHEHHHEHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02142");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!", "\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\200\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!" + "'", str2, "\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!");
    }

    @Test
    public void test02143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02143");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!", "nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!" + "'", str2, "!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!");
    }

    @Test
    public void test02144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02144");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullLULLLULLLULLLULLnullnull!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02145");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214!", "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214!" + "'", str2, "NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214!");
    }

    @Test
    public void test02146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02146");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NNLLLLNN!", "\u0366\u0365\u0368\u0368!!\216\216\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02147");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!!", "LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!!" + "'", str2, "]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!!");
    }

    @Test
    public void test02148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02148");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253!", "\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253!" + "'", str2, "\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253!");
    }

    @Test
    public void test02149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02149");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!!", "UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!" + "'", str2, "nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!");
    }

    @Test
    public void test02150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02150");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HHHHHHHHHHHHHHHH\200}}`HHHHHHHHHHHHHHHH]]!", "~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test02151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02151");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!", "LUUULUUULUUULUUU\200}}`LUUULUUULUUULUUU]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!" + "'", str2, "!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!");
    }

    @Test
    public void test02152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02152");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull!" + "'", str2, "\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02153");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!", "\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02154");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LL!", "!L!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BB!" + "'", str2, "nullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BB!");
    }

    @Test
    public void test02155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02155");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!", "LIIILIII!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02156");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("l!lll!lll!lll!lll!lll!lll!lll!ll!", "LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7!" + "'", str2, "\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7!");
    }

    @Test
    public void test02157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02157");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!", "LLLLnullnullnullnullLLLLnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!" + "'", str2, "~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!");
    }

    @Test
    public void test02158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02158");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("unllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunll!", "\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\300\300\275\275\300\300\275\275\300\300\275\275\300\300\275\275\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\300\300\275\275\300\300\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02159");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226!", "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226!" + "'", str2, "\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226!");
    }

    @Test
    public void test02160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02160");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XX!", "EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HH!" + "'", str2, "HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HH!");
    }

    @Test
    public void test02161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02161");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!", "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!!!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!!!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!!!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!!!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!" + "'", str2, "!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!!!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!!!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!!!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!!!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!");
    }

    @Test
    public void test02162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02162");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!", "nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!" + "'", str2, "~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!");
    }

    @Test
    public void test02163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02163");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLL!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02164");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216!!\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216!!\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216!!\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216!!\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216!", "`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216!!\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216!!\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216!!\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216!!\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216!" + "'", str2, "\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216!!\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216!!\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216!!\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216!!\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216!");
    }

    @Test
    public void test02165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02165");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!", "NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULLLULLL!!ULLLULLL!!ULLLULLL!!ULLLULLL!!ULLLULLL!!ULLLULLL!!ULLLULLL!!ULLLULLL!!!" + "'", str2, "ULLLULLL!!ULLLULLL!!ULLLULLL!!ULLLULLL!!ULLLULLL!!ULLLULLL!!ULLLULLL!!ULLLULLL!!!");
    }

    @Test
    public void test02166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02166");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02167");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test02168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02168");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("efhhefhh!", "~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NULLNULL!" + "'", str2, "NULLNULL!");
    }

    @Test
    public void test02169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02169");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull!!nullnull!!nullnull!!nullnull!!null!!!null!!!null!!!null!!!nullnull!!nullnull!!nullnull!!nullnull!!null!!!null!!!!", "EnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200!!!!" + "'", str2, "\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200!!!!");
    }

    @Test
    public void test02170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02170");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!", "\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!" + "'", str2, "]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!");
    }

    @Test
    public void test02171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02171");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368nullnull!!nullnull!!\200\200\u0346\u0348\u0348!", "LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368LL!!LL!!!!LL!!LL!!!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368LL!!LL!!!!LL!!LL!!!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test02172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02172");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253!" + "'", str2, "\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253!");
    }

    @Test
    public void test02173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02173");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\230!", "null\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OO!!null\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OO!!null\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OO!!null\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OO!!null\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OO!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\230!" + "'", str2, "!\230!");
    }

    @Test
    public void test02174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02174");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "nullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test02175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02175");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnnnullnullnullnullnullnullnullnullnnnullnullnullnullnullnullnullnullnnnullnullnullnullnullnullnullnullnnnullnullnullnullnullnullnullnullnnnullnullnullnullnullnullnullnullnnnullnullnullnullnullnullnullnullnnnullnullnullnullnullnullnullnullnn!", "\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluu!" + "'", str2, "u\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluu!");
    }

    @Test
    public void test02176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02176");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!" + "'", str2, "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!");
    }

    @Test
    public void test02177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02177");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!", "ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02178");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLUULLUULLUULLUULLUULLUULLUULLUU!", "LL!!!!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnull!" + "'", str2, "HHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnull!");
    }

    @Test
    public void test02179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02179");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300!", "\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204\200}}`\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull!" + "'", str2, "\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull!");
    }

    @Test
    public void test02180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02180");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!", "URRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRR\200}}`URRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRR]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!" + "'", str2, "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!");
    }

    @Test
    public void test02181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02181");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02182");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!", "nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02183");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336!", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368nullnullnullnullnull!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368nullnullnullnullnull!");
    }

    @Test
    public void test02184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02184");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL!", "!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!" + "'", str2, "~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
    }

    @Test
    public void test02185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02185");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0nullnull!", "!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253!" + "'", str2, "L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253!");
    }

    @Test
    public void test02186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02186");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0289\u028a\u028c\u028c!", "]]AA]]AA!!]]AA]]AA!!]]AA]]AA]]AA]]AA!!]]AA]]AA!!]]AA]]AA!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnull!" + "'", str2, "!nullnullnullnull!");
    }

    @Test
    public void test02187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02187");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!" + "'", str2, "\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!");
    }

    @Test
    public void test02188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02188");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!", "!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!" + "'", str2, "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
    }

    @Test
    public void test02189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02189");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!", "nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!!" + "'", str2, "\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!!");
    }

    @Test
    public void test02190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02190");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!", "nullnull\336\336nullnull\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!!" + "'", str2, "ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!!");
    }

    @Test
    public void test02191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02191");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!", "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440nullnull!" + "'", str2, "\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440nullnull!");
    }

    @Test
    public void test02192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02192");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test02193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02193");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "LL!!!!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02194");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "EE!!EE!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test02195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02195");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230!", "!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230!" + "'", str2, "~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230!");
    }

    @Test
    public void test02196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02196");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226!!null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226!!!", "\u0366\u0365\u0368\u0368nullnull\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226!!ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226!!!" + "'", str2, "ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226!!ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226!!!");
    }

    @Test
    public void test02197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02197");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("l!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLL!", "NLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!" + "'", str2, "!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!");
    }

    @Test
    public void test02198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02198");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("X!UUX!UUX!UUX!UUX!UUX!UUX!UUX!UU!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test02199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02199");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```!", "NNUUNNUU!!NNUUNNUU!!NNUUNNUUNNUUNNUU!!NNUUNNUU!!NNUUNNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```!" + "'", str2, "NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```!");
    }

    @Test
    public void test02200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02200");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!" + "'", str2, "\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!");
    }

    @Test
    public void test02201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02201");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!", "}~\200\200}~\200\200\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be}~\200\200}~\200\200\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test02202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02202");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULLUULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test02203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02203");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!T!!!T!!!!!T!!!T!!!!!T!!!T!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!", "LNNNLNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!" + "'", str2, "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!");
    }

    @Test
    public void test02204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02204");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e!", "^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test02205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02205");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!", "UU!!````````````UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!````````````UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!" + "'", str2, "\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!");
    }

    @Test
    public void test02206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02206");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02207");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!", "L!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test02208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02208");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "!N!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02209");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EEEEEEEEEEEEEEEE\200}}`EEEEEEEEEEEEEEEE]]!", "LnullLLLnullLL!!LnullLLLnullLL!!LnullLLLnullLLLnullLLLnullLL!!LnullLLLnullLL!!LnullLLLnullLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLL]]!" + "'", str2, "LLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLL]]!");
    }

    @Test
    public void test02210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02210");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246!!!```!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368NULLNULL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```!" + "'", str2, "nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```!");
    }

    @Test
    public void test02211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02211");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\245\245\245\245\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\245\245\245\245\u0346\u0348\u0348!");
    }

    @Test
    public void test02212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02212");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("AALLLLAA!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02213");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test02214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02214");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!!", "RRPPRRPPRRPPRRPPRRPPRRPPRRPPRRPP!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!" + "'", str2, "nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!");
    }

    @Test
    public void test02215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02215");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!", "\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02216");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!", "nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!nullnull!!\200~~nullnull!!\200~~nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
    }

    @Test
    public void test02217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02217");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!", "LL^^\225\230\230LL^^\225\230\230LL^^\225\230\230LL^^\225\230\230\200}}`LL^^\225\230\230LL^^\225\230\230LL^^\225\230\230LL^^\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02218");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340!", "nullnullnullnull\200}}`nullnullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "unllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnull!" + "'", str2, "unllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnull!");
    }

    @Test
    public void test02219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02219");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!", "\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!!L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!!L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!!L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!!L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!" + "'", str2, "L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!!L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!!L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!!L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!!L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!");
    }

    @Test
    public void test02220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02220");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\276!", "nullnullnullnullZWXXZWXXZWXXZWXXnullnullnullnullZWXXZWXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276!" + "'", str2, "!\276!");
    }

    @Test
    public void test02221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02221");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLL]]!", "nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUU\200}}`UUUUUUUUUUUUUUUU]]!" + "'", str2, "UUUUUUUUUUUUUUUU\200}}`UUUUUUUUUUUUUUUU]]!");
    }

    @Test
    public void test02222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02222");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\276!", "!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276!" + "'", str2, "!\276!");
    }

    @Test
    public void test02223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02223");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!!", "UNLLUNLLUNLLUNLLULLLULLLULLLULLLUNLLUNLLUNLLUNLLULLLULLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!!" + "'", str2, "LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!!");
    }

    @Test
    public void test02224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02224");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016eUU!!!!!!!", "\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216!!\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216!!\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216!!\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216!!\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!!" + "'", str2, "~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!!");
    }

    @Test
    public void test02225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02225");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!", "\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108nullnull!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108UU!" + "'", str2, "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108UU!");
    }

    @Test
    public void test02226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02226");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225!", "!N!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "bnullnullnullbnullnullnullnullnullbnullnullnullbnullnullnullnullnull\225\225bnullnullnullbnullnullnullnullnullbnullnullnullbnullnullnullnullnull\225\225bnullnullnullbnullnullnullnullnullbnullnullnullbnullnullnullnullnull\225\225bnullnullnullbnullnullnullnullnullbnullnullnullbnullnullnullnullnull\225\225bnullnullnullbnullnullnullnullnullbnullnullnullbnullnullnullnullnull\225\225bnullnullnullbnullnullnullnullnullbnullnullnullbnullnullnullnullnull\225\225bnullnullnullbnullnullnullnullnullbnullnullnullbnullnullnullnullnull\225\225bnullnullnullbnullnullnullnullnullbnullnullnullbnullnullnullnullnull\225\225!" + "'", str2, "bnullnullnullbnullnullnullnullnullbnullnullnullbnullnullnullnullnull\225\225bnullnullnullbnullnullnullnullnullbnullnullnullbnullnullnullnullnull\225\225bnullnullnullbnullnullnullnullnullbnullnullnullbnullnullnullnullnull\225\225bnullnullnullbnullnullnullnullnullbnullnullnullbnullnullnullnullnull\225\225bnullnullnullbnullnullnullnullnullbnullnullnullbnullnullnullnullnull\225\225bnullnullnullbnullnullnullnullnullbnullnullnullbnullnullnullnullnull\225\225bnullnullnullbnullnullnullnullnullbnullnullnullbnullnullnullnullnull\225\225bnullnullnullbnullnullnullnullnullbnullnullnullbnullnullnullnullnull\225\225!");
    }

    @Test
    public void test02227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02227");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\253\256\256\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test02228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02228");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!" + "'", str2, "``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!");
    }

    @Test
    public void test02229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02229");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]\256!\254\254\256!\254\254\256!\254\254\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]]\256!\254\254\256!\254\254\256!\254\254\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]!", "null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]\256!\254\254\256!\254\254\256!\254\254\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]]\256!\254\254\256!\254\254\256!\254\254\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]!" + "'", str2, "]\256!\254\254\256!\254\254\256!\254\254\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]]\256!\254\254\256!\254\254\256!\254\254\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]!");
    }

    @Test
    public void test02230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02230");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLLUNLLUNLLUNLLULLLULLLULLLULLLUNLLUNLLUNLLUNLLULLLULLL!", "\u0150\u0150\u0150\u0150!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LUU!LUU!LUU!LUU!UUU!UUU!UUU!UUU!LUU!LUU!LUU!LUU!UUU!UUU!" + "'", str2, "!LUU!LUU!LUU!LUU!UUU!UUU!UUU!UUU!LUU!LUU!LUU!LUU!UUU!UUU!");
    }

    @Test
    public void test02231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02231");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u037b\u037c\u037e\u037e\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u037b\u037c\u037e\u037e\u0348\u0346\u0346!");
    }

    @Test
    public void test02232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02232");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200null^nullnullnull^nullnull}~\200\200}~\200\200null^nullnullnull^nullnull!", "LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200ULLL^ULLLULLLULLL^ULLLULLL}~\200\200}~\200\200ULLL^ULLLULLLULLL^ULLLULLL!" + "'", str2, "}~\200\200}~\200\200ULLL^ULLLULLLULLL^ULLLULLL}~\200\200}~\200\200ULLL^ULLLULLLULLL^ULLLULLL!");
    }

    @Test
    public void test02233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02233");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!", "\u0107\u0105\u0109\u0109\u0107\u0105\u0109\u0109!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test02234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02234");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("FHEEFHEE!!FHEEFHEE!!FHEEFHEEFHEEFHEE!!FHEEFHEE!!FHEEFHEE!", "}~\200\200}~\200\200U^LLU^LL}~\200\200}~\200\200U^LLU^LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02235");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!", "\275XXX\275XXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!" + "'", str2, "\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!");
    }

    @Test
    public void test02236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02236");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!!", "L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test02237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02237");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!", "xmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxxxmnnxmnnxxxmnnxmnnxxxx!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!" + "'", str2, "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!");
    }

    @Test
    public void test02238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02238");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\246\246!!\246\246!!!", "NLUUNLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\246\246!!\246\246!!!" + "'", str2, "\246\246!!\246\246!!!");
    }

    @Test
    public void test02239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02239");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226!!null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226!!!", "\u014f!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!!" + "'", str2, "nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!!");
    }

    @Test
    public void test02240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02240");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!", "nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!" + "'", str2, "!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!");
    }

    @Test
    public void test02241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02241");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull\253\253nullnull\253\253!", "^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253!");
    }

    @Test
    public void test02242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02242");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!", "\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7!" + "'", str2, "\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7!");
    }

    @Test
    public void test02243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02243");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!", "`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!" + "'", str2, "LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!");
    }

    @Test
    public void test02244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02244");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!", "LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test02245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02245");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL!", "null\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OO!!null\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OO!!null\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OO!!null\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OO!!null\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OO!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd!" + "'", str2, "~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd!");
    }

    @Test
    public void test02246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02246");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!", "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!" + "'", str2, "!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!");
    }

    @Test
    public void test02247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02247");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLNLLLNLLLNLLL\200}}`NLLLNLLLNLLLNLLL]]!", "nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\351\354\354\354\351\354\354\354\351\354\354\354\351\354\354\354\200}}`\351\354\354\354\351\354\354\354\351\354\354\354\351\354\354\354]]!" + "'", str2, "\351\354\354\354\351\354\354\354\351\354\354\354\351\354\354\354\200}}`\351\354\354\354\351\354\354\354\351\354\354\354\351\354\354\354]]!");
    }

    @Test
    public void test02248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02248");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!" + "'", str2, "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
    }

    @Test
    public void test02249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02249");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200U^LLU^LL}~\200\200}~\200\200U^LLU^LL!", "\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200null^nullnullnull^nullnull}~\200\200}~\200\200null^nullnullnull^nullnull!" + "'", str2, "}~\200\200}~\200\200null^nullnullnull^nullnull}~\200\200}~\200\200null^nullnullnull^nullnull!");
    }

    @Test
    public void test02250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02250");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de!!!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test02251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02251");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullZWXXZWXXZWXXZWXXnullnullnullnullZWXXZWXX!", "nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!" + "'", str2, "ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!");
    }

    @Test
    public void test02252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02252");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214!", "!T!!!T!!!!!T!!!T!!!!!T!!!T!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214!");
    }

    @Test
    public void test02253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02253");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!", "LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!" + "'", str2, "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!");
    }

    @Test
    public void test02254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02254");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNN!", "\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245!" + "'", str2, "\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245!");
    }

    @Test
    public void test02255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02255");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02256");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!", "LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!" + "'", str2, "\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!");
    }

    @Test
    public void test02257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02257");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]^``]^``!!]^``]^``!!]^``]^``]^``]^``!!]^``]^``!!]^``]^``!", "^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]^``]^``!!]^``]^``!!]^``]^``]^``]^``!!]^``]^``!!]^``]^``!" + "'", str2, "]^``]^``!!]^``]^``!!]^``]^``]^``]^``!!]^``]^``!!]^``]^``!");
    }

    @Test
    public void test02258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02258");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ!", "\336\335\340\340\336\335\340\340!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02259");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullBBnullnullBB!", "nullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "qrttqrttnullnullqrttqrttnullnull!" + "'", str2, "qrttqrttnullnullqrttqrttnullnull!");
    }

    @Test
    public void test02260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02260");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225!", "wxzzwxzz!!wxzzwxzz!!wxzzwxzzwxzzwxzz!!wxzzwxzz!!wxzzwxzz!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225!" + "'", str2, "nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225!");
    }

    @Test
    public void test02261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02261");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02262");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c!", "\u0366\u0365\u0368\u0368LL!!LL!!!!LL!!LL!!!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02263");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!!", "\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test02264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02264");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!", "nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226!!nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226!!nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226!!nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226!!nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!" + "'", str2, "!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!");
    }

    @Test
    public void test02265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02265");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\352\356\356\356\352\356\356\356\352\356\356\356\352\356\356\356\200}}`\352\356\356\356\352\356\356\356\352\356\356\356\352\356\356\356]]!", "\u023d\u023e\u0240\u0240\u023d\u023e\u0240\u0240\u023d\u023e\u0240\u0240\u023d\u023e\u0240\u0240!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test02266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02266");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108!", "efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02267");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!", "null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullqrttqrttqrttqrttqrttqrttqrttqrttnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullqrttqrttqrttqrttqrttqrttqrttqrtt!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UN\275\275UN\275\275LLUN\275\275UN\275\275LLUN\275\275UN\275\275LLUN\275\275UN\275\275LLUN\275\275UN\275\275LLUN\275\275UN\275\275LLUN\275\275UN\275\275LLUN\275\275UN\275\275LL!" + "'", str2, "UN\275\275UN\275\275LLUN\275\275UN\275\275LLUN\275\275UN\275\275LLUN\275\275UN\275\275LLUN\275\275UN\275\275LLUN\275\275UN\275\275LLUN\275\275UN\275\275LLUN\275\275UN\275\275LL!");
    }

    @Test
    public void test02268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02268");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!", "!\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test02269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02269");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~!", "unllNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHFFH~~HHFFH~~HHFFH~~HHFFH~~HHFFH~~HHFFH~~HHFFH~~HHFFH~~!" + "'", str2, "HHFFH~~HHFFH~~HHFFH~~HHFFH~~HHFFH~~HHFFH~~HHFFH~~HHFFH~~!");
    }

    @Test
    public void test02270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02270");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02271");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02272");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014enullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!!" + "'", str2, "\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!!");
    }

    @Test
    public void test02273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02273");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull!", "!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!!!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!!!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!!!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!!!LLUULLUULLUULLUU!!!LLUULLUULLUULLUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200LUUULUUULUUULUUULUUULUUULUUULUUU}~\200\200}~\200\200LUUULUUULUUULUUULUUULUUULUUULUUU!" + "'", str2, "}~\200\200}~\200\200LUUULUUULUUULUUULUUULUUULUUULUUU}~\200\200}~\200\200LUUULUUULUUULUUULUUULUUULUUULUUU!");
    }

    @Test
    public void test02274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02274");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02275");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnullnull~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnull!", "TT!!TT!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02276");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180!", "efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02277");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230]]!", "UNLLUNLL!!UNLLUNLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230\200}}`l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230]]!" + "'", str2, "l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230\200}}`l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230]]!");
    }

    @Test
    public void test02278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02278");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\216\216\216!\216\216\216!", "HHHHHHHHHHHHHHHH\200}}`HHHHHHHHHHHHHHHH]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\216\216\216!\216\216\216!" + "'", str2, "!\216\216\216!\216\216\216!");
    }

    @Test
    public void test02279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02279");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ab!", "NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!l!" + "'", str2, "!l!");
    }

    @Test
    public void test02280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02280");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LUUULUUULUUULUUU\200}}`LUUULUUULUUULUUU]]!", "UUNNUUNN!!UUNNUUNN!!UUNNUUNNUUNNUUNN!!UUNNUUNN!!UUNNUUNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullvvvnullvvvnullvvvnullvvv\200}}`nullvvvnullvvvnullvvvnullvvv]]!" + "'", str2, "nullvvvnullvvvnullvvvnullvvv\200}}`nullvvvnullvvvnullvvvnullvvv]]!");
    }

    @Test
    public void test02281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02281");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!", "\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!" + "'", str2, "\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!");
    }

    @Test
    public void test02282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02282");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!", "`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038enullnull!" + "'", str2, "\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038enullnull!");
    }

    @Test
    public void test02283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02283");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("unllunllunllunllunllunllunllunll!", "NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NULLNULLNULLNULLNULLNULLNULLNULL!" + "'", str2, "NULLNULLNULLNULLNULLNULLNULLNULL!");
    }

    @Test
    public void test02284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02284");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!", "EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!!EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!!EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!!EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!!EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!" + "'", str2, "\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!");
    }

    @Test
    public void test02285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02285");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253!", "\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253!" + "'", str2, "\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253!");
    }

    @Test
    public void test02286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02286");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180!", "BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02287");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031anullnullnullnullnullnullnullnull!", "\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e!" + "'", str2, "\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e!");
    }

    @Test
    public void test02288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02288");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "nullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02289");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198nullnull!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullUNLLUNLLUNLLUNLLnullnullnullnullUNLLUNLL!" + "'", str2, "nullnullnullnullUNLLUNLLUNLLUNLLnullnullnullnullUNLLUNLL!");
    }

    @Test
    public void test02290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02290");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!", "efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!!efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!!efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!!efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!!efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!" + "'", str2, "\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!");
    }

    @Test
    public void test02291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02291");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]^``]^``!!]^``]^``!!]^``]^``]^``]^``!!]^``]^``!!]^``]^``!", "EE!!EE!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]^``]^``!!]^``]^``!!]^``]^``]^``]^``!!]^``]^``!!]^``]^``!" + "'", str2, "]^``]^``!!]^``]^``!!]^``]^``]^``]^``!!]^``]^``!!]^``]^``!");
    }

    @Test
    public void test02292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02292");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!", "NLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!" + "'", str2, "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!");
    }

    @Test
    public void test02293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02293");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````!", "hfhhhfhh!!hfhhhfhh!!hfhhhfhhhfhhhfhh!!hfhhhfhh!!hfhhhfhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````!" + "'", str2, "nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````!");
    }

    @Test
    public void test02294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02294");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "!!\254\254!!\254\254!!!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!!!\254\254!!\254\254!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\254\254\254\254\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\254\254\254\254\u0346\u0348\u0348!");
    }

    @Test
    public void test02295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02295");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\200}}`null]]!", "LNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLL\200}}`NLLL]]!" + "'", str2, "NLLL\200}}`NLLL]]!");
    }

    @Test
    public void test02296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02296");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!", "UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test02297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02297");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UU!!````````````UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!````````````UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!", "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test02298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02298");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!", "FEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test02299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02299");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014enullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```!" + "'", str2, "LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```!");
    }

    @Test
    public void test02300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02300");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256!" + "'", str2, "\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256!");
    }

    @Test
    public void test02301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02301");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200LUUULUUULUUULUUULUUULUUULUUULUUU}~\200\200}~\200\200LUUULUUULUUULUUULUUULUUULUUULUUU!", "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN}~\200\200}~\200\200LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!" + "'", str2, "}~\200\200}~\200\200LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN}~\200\200}~\200\200LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!");
    }

    @Test
    public void test02302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02302");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!" + "'", str2, "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
    }

    @Test
    public void test02303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02303");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!", "fehhfehhnullnullfehhfehhnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!" + "'", str2, "!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!");
    }

    @Test
    public void test02304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02304");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!", "EEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400!!!" + "'", str2, "\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400!!!");
    }

    @Test
    public void test02305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02305");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!", "unllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!" + "'", str2, "!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!");
    }

    @Test
    public void test02306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02306");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU}~\200\200}~\200\200LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!" + "'", str2, "}~\200\200}~\200\200LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU}~\200\200}~\200\200LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!");
    }

    @Test
    public void test02307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02307");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LUUULUUULUUULUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUULUUULUUULUUULUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!", "\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02308");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HHHHHHHH!!HHHHHHHH!!HHHHHHHHHHHHHHHH!!HHHHHHHH!!HHHHHHHH!", "NLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02309");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!!", "\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test02310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02310");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200!!nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200!!nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200!!nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200!!nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200!", "\275UNLLUNLLUNLL\276UNLL\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200!!porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200!!porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200!!porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200!!porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200!" + "'", str2, "porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200!!porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200!!porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200!!porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200!!porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200!");
    }

    @Test
    public void test02311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02311");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276\276!!\276\276!!!", "\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276!!\276\276!!!" + "'", str2, "\276\276!!\276\276!!!");
    }

    @Test
    public void test02312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02312");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!", "LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!");
    }

    @Test
    public void test02313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02313");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!" + "'", str2, "]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!");
    }

    @Test
    public void test02314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02314");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL!!LL!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!!" + "'", str2, "LL!!LL!!!");
    }

    @Test
    public void test02315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02315");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\214!!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214!!" + "'", str2, "\214!!");
    }

    @Test
    public void test02316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02316");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "EHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02317");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!" + "'", str2, "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
    }

    @Test
    public void test02318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02318");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]AA]]AA!!]]AA]]AA!!]]AA]]AA]]AA]]AA!!]]AA]]AA!!]]AA]]AA!", "\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]\256\256]]\256\256!!]]\256\256]]\256\256!!]]\256\256]]\256\256]]\256\256]]\256\256!!]]\256\256]]\256\256!!]]\256\256]]\256\256!" + "'", str2, "]]\256\256]]\256\256!!]]\256\256]]\256\256!!]]\256\256]]\256\256]]\256\256]]\256\256!!]]\256\256]]\256\256!!]]\256\256]]\256\256!");
    }

    @Test
    public void test02319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02319");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!", "~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!" + "'", str2, "!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!");
    }

    @Test
    public void test02320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02320");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!", "nullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!" + "'", str2, "U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!");
    }

    @Test
    public void test02321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02321");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`\253!!!\253!!!\253!!!`\253!!!\253!!!\253!!!!", "l]lll]ll!!l]lll]ll!!l]lll]lll]lll]ll!!l]lll]ll!!l]lll]ll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`\253!!!\253!!!\253!!!`\253!!!\253!!!\253!!!!" + "'", str2, "`\253!!!\253!!!\253!!!`\253!!!\253!!!\253!!!!");
    }

    @Test
    public void test02322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02322");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XX!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230\200}}`UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LL!" + "'", str2, "LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LL!");
    }

    @Test
    public void test02323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02323");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366!" + "'", str2, "\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366!");
    }

    @Test
    public void test02324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02324");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```!", "HHFFH~~HHFFH~~HHFFH~~HHFFH~~HHFFH~~HHFFH~~HHFFH~~HHFFH~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```!" + "'", str2, "nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```!");
    }

    @Test
    public void test02325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02325");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn!", "\u0366\u0365\u0368\u0368\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e!" + "'", str2, "\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e!");
    }

    @Test
    public void test02326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02326");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!!", "\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!!" + "'", str2, "\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!!");
    }

    @Test
    public void test02327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02327");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnullnull~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnull!", "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!" + "'", str2, "\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!");
    }

    @Test
    public void test02328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02328");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245!", "UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245!" + "'", str2, "\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245!");
    }

    @Test
    public void test02329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02329");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("fehhfehhnullnullfehhfehhnullnull!", "!\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02330");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]\200}}`!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]!null]]]]!", "H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]\200}}`!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]]]!" + "'", str2, "!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]\200}}`!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]]]!");
    }

    @Test
    public void test02331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02331");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!", "\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!" + "'", str2, "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!");
    }

    @Test
    public void test02332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02332");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!", "~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!!" + "'", str2, "\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!!");
    }

    @Test
    public void test02333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02333");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!", "\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!" + "'", str2, "\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!");
    }

    @Test
    public void test02334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02334");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("AALLLLAA!", "\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll!!\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll!!\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll!!\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll!!\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0228\u0228\u0228\u0228nullnull!" + "'", str2, "\u0228\u0228\u0228\u0228nullnull!");
    }

    @Test
    public void test02335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02335");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!!", "nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226!!nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226!!nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226!!nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226!!nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!!" + "'", str2, "L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!!");
    }

    @Test
    public void test02336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02336");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn!", "!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!!" + "'", str2, "\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!!");
    }

    @Test
    public void test02337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02337");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0128\u0126\u0126\u0108\u0106\u0106!", "T!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TT!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!tttnullnullnullnull!tttnullnull!" + "'", str2, "!tttnullnullnullnull!tttnullnull!");
    }

    @Test
    public void test02338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02338");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!", "``!!``!!``!!``!!``!!``!!``!!``!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02339");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02340");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de!!!", "nullnullnullnullabddabddabddabddnullnullnullnullabddabdd!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test02341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02341");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("fehhfehhnullnullfehhfehhnullnull!", "`\253!!!\253!!!\253!!!`\253!!!\253!!!\253!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02342");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnull!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLL!" + "'", str2, "UNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLL!");
    }

    @Test
    public void test02343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02343");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300!", "\275\275!!\275\275!!!!\275\275!!\275\275!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02344");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!", "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!" + "'", str2, "!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!!!!!!~!!!!!!!!!!!!~!!!!!!!!!");
    }

    @Test
    public void test02345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02345");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\230!", "!~TT!~TT!!!~TT!~TT!!!~TT!~TT!~TT!~TT!!!~TT!~TT!!!~TT!~TT!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\230!" + "'", str2, "!\230!");
    }

    @Test
    public void test02346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02346");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("unllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunll!", "\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330!" + "'", str2, "\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330!");
    }

    @Test
    public void test02347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02347");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!", "\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031anullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a!" + "'", str2, "\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a!");
    }

    @Test
    public void test02348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02348");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!", "ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02349");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226!!null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226!!UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226!!!" + "'", str2, "UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226!!UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226!!!");
    }

    @Test
    public void test02350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02350");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106nullLL!!!", "\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d!!!" + "'", str2, "\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d!!!");
    }

    @Test
    public void test02351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02351");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]!\253\253]!\253\253!!]!\253\253]!\253\253!!!", "hehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!\253\253]!\253\253!!]!\253\253]!\253\253!!!" + "'", str2, "]!\253\253]!\253\253!!]!\253\253]!\253\253!!!");
    }

    @Test
    public void test02352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02352");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02353");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!", "null\225\230\230null\225\230\230null\225\230\230null\225\230\230\200}}`null\225\230\230null\225\230\230null\225\230\230null\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!" + "'", str2, "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!");
    }

    @Test
    public void test02354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02354");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\340\340!!nullnullnull\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!nullnullnull\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!!", "null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!!null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!!null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!!null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!!null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~!!U~~~U~~~U~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!U~~~U~~~U~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!" + "'", str2, "~~!!U~~~U~~~U~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!U~~~U~~~U~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
    }

    @Test
    public void test02355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02355");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300!", "\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv!" + "'", str2, "\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv!");
    }

    @Test
    public void test02356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02356");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!", "\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216!!\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216!!\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216!!\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216!!\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216\220\220\216\216\200~~\220\220\216\216\200~~\220\220\216\216\220\220\216\216!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!" + "'", str2, "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
    }

    @Test
    public void test02357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02357");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLL!", "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02358");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226!!ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226!!!", "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226!!LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226!!!" + "'", str2, "LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226!!LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226!!!");
    }

    @Test
    public void test02359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02359");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!", "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!" + "'", str2, "\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!");
    }

    @Test
    public void test02360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02360");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!", "nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!!UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!!UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!!UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!!UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!" + "'", str2, "UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!!UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!!UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!!UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!!UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!");
    }

    @Test
    public void test02361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02361");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!", "\246\246!!\246\246!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246!!nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246!!nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246!!nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246!!nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246!" + "'", str2, "nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246!!nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246!!nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246!!nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246!!nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246!");
    }

    @Test
    public void test02362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02362");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!!", "LL]UULLLL]UULLLL]UULLLL]UULL!LL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULL!LL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULL!LL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULL!LL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULL!LL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULL!LL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULL!LL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULL!LL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!" + "'", str2, "LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!");
    }

    @Test
    public void test02363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02363");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!", "HHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!" + "'", str2, "!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!");
    }

    @Test
    public void test02364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02364");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108nullnull!!!!!!!", "hhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHH!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!!");
    }

    @Test
    public void test02365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02365");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246!!nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246!!nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246!!nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246!!nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!" + "'", str2, "!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!");
    }

    @Test
    public void test02366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02366");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL!!LL!!!", "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!" + "'", str2, "!!!!!!!!!");
    }

    @Test
    public void test02367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02367");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("unllNULL!", "null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnullnull\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u016e\u016d\u0170\u0170\u014d\u014e\u0150\u0150!" + "'", str2, "\u016e\u016d\u0170\u0170\u014d\u014e\u0150\u0150!");
    }

    @Test
    public void test02368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02368");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!", "\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02369");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!");
    }

    @Test
    public void test02370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02370");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!", "efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02371");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0248\u0246\u0246\u0246\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0248\u0246\u0246\u0246\u0348\u0346\u0346!");
    }

    @Test
    public void test02372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02372");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!", "\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull\300\300~nullnull\300\300nullnull\300\300nullnull\300\300~nullnull\300\300nullnull\300\300!!nullnull\300\300~nullnull\300\300nullnull\300\300nullnull\300\300~nullnull\300\300nullnull\300\300!!nullnull\300\300~nullnull\300\300nullnull\300\300nullnull\300\300~nullnull\300\300nullnull\300\300nullnull\300\300~nullnull\300\300nullnull\300\300nullnull\300\300~nullnull\300\300nullnull\300\300!!nullnull\300\300~nullnull\300\300nullnull\300\300nullnull\300\300~nullnull\300\300nullnull\300\300!!nullnull\300\300~nullnull\300\300nullnull\300\300nullnull\300\300~nullnull\300\300nullnull\300\300!" + "'", str2, "nullnull\300\300~nullnull\300\300nullnull\300\300nullnull\300\300~nullnull\300\300nullnull\300\300!!nullnull\300\300~nullnull\300\300nullnull\300\300nullnull\300\300~nullnull\300\300nullnull\300\300!!nullnull\300\300~nullnull\300\300nullnull\300\300nullnull\300\300~nullnull\300\300nullnull\300\300nullnull\300\300~nullnull\300\300nullnull\300\300nullnull\300\300~nullnull\300\300nullnull\300\300!!nullnull\300\300~nullnull\300\300nullnull\300\300nullnull\300\300~nullnull\300\300nullnull\300\300!!nullnull\300\300~nullnull\300\300nullnull\300\300nullnull\300\300~nullnull\300\300nullnull\300\300!");
    }

    @Test
    public void test02373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02373");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test02374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02374");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106nullLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02375");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!", "\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\300\300\275\275\300\300\275\275\300\300\275\275\300\300\275\275\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\300\300\275\275\300\300\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02376");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!", "\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\300\300\275\275\300\300\275\275\300\300\275\275\300\300\275\275\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\300\300\275\275\300\300\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!" + "'", str2, "}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!");
    }

    @Test
    public void test02377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02377");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!", "EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!" + "'", str2, "!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!");
    }

    @Test
    public void test02378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02378");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215!", "\u016e\u016e\u016e\u016e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u016e\u016e\u016e\u016e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215!" + "'", str2, "\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215!");
    }

    @Test
    public void test02379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02379");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull!" + "'", str2, "\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull!");
    }

    @Test
    public void test02380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02380");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL!", "\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL!" + "'", str2, "\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL!");
    }

    @Test
    public void test02381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02381");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014enullnull!", "LLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260!" + "'", str2, "nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260!");
    }

    @Test
    public void test02382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02382");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("hfhhhfhh!!hfhhhfhh!!hfhhhfhhhfhhhfhh!!hfhhhfhh!!hfhhhfhh!", "EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH\200}}`EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264!" + "'", str2, "\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264!");
    }

    @Test
    public void test02383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02383");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!", "!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!" + "'", str2, "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
    }

    @Test
    public void test02384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02384");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!", "EnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!" + "'", str2, "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!");
    }

    @Test
    public void test02385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02385");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullBBnullnullBB!", "xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUXXUUXXXXUUXXUUXXXX!" + "'", str2, "UUXXUUXXXXUUXXUUXXXX!");
    }

    @Test
    public void test02386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02386");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128!", "\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02387");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!ll!!l!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!" + "'", str2, "nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!");
    }

    @Test
    public void test02388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02388");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!!", "xxxxxxxxxxxxxxxxnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullxxxxxxxxxxxxxxxxnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!!" + "'", str2, "UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!!");
    }

    @Test
    public void test02389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02389");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!!nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!!nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!!nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!!nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!", "N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!" + "'", str2, "!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!~!!\220!!!");
    }

    @Test
    public void test02390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02390");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0346\u0348\u0348!", "nullnullnullnullabddabddabddabddnullnullnullnullabddabdd!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test02391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02391");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("a]aaa]aa!!a]aaa]aa!!a]aaa]aaa]aaa]aa!!a]aaa]aa!!a]aaa]aa!", "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!" + "'", str2, "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!");
    }

    @Test
    public void test02392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02392");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!", "ULLLULLLULLLULLLULLLULLLULLLULLL!!ULLLULLLULLLULLLULLLULLLULLLULLL!!ULLLULLLULLLULLLULLLULLLULLLULLL!!ULLLULLLULLLULLLULLLULLLULLLULLL!!ULLLULLLULLLULLLULLLULLLULLLULLL!!ULLLULLLULLLULLLULLLULLLULLLULLL!!ULLLULLLULLLULLLULLLULLLULLLULLL!!ULLLULLLULLLULLLULLLULLLULLLULLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!" + "'", str2, "\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!");
    }

    @Test
    public void test02393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02393");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("unllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunll!", "!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!" + "'", str2, "LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!");
    }

    @Test
    public void test02394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02394");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU!" + "'", str2, "\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU!");
    }

    @Test
    public void test02395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02395");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]nullnullnullnullnull]]nullnull]]nullnull]]nullnull]]]nullnullnullnullnull]]nullnull]]!", "!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!E!!!E!!!E!!!E!!!E!!]]!E!!!E!!]]!E!!!E!!]]!E!!!E!!]]]!E!!!E!!!E!!!E!!!E!!]]!E!!!E!!]]!" + "'", str2, "]!E!!!E!!!E!!!E!!!E!!]]!E!!!E!!]]!E!!!E!!]]!E!!!E!!]]]!E!!!E!!!E!!!E!!!E!!]]!E!!!E!!]]!");
    }

    @Test
    public void test02396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02396");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("h]hhh]hh!!h]hhh]hh!!h]hhh]hhh]hhh]hh!!h]hhh]hh!!h]hhh]hh!", "\u0366\u0365\u0368\u0368\335\340\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u]uuu]uu!!u]uuu]uu!!u]uuu]uuu]uuu]uu!!u]uuu]uu!!u]uuu]uu!" + "'", str2, "u]uuu]uu!!u]uuu]uu!!u]uuu]uuu]uuu]uu!!u]uuu]uu!!u]uuu]uu!");
    }

    @Test
    public void test02397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02397");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226!!nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226!!nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226!!nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226!!nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226!", "!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226!!H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226!!H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226!!H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226!!H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226!" + "'", str2, "H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226!!H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226!!H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226!!H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226!!H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226!");
    }

    @Test
    public void test02398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02398");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!!", "LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test02399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02399");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NLLLNLLLNLLLNLLL\200}}`NLLLNLLLNLLLNLLL]]!", "UELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ELLLELLLELLLELLL\200}}`ELLLELLLELLLELLL]]!" + "'", str2, "ELLLELLLELLLELLL\200}}`ELLLELLLELLLELLL]]!");
    }

    @Test
    public void test02400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02400");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "!\276\276\276\276\276!!\276\276!!\276\276!!\276\276!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test02401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02401");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!!!", "!X!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!" + "'", str2, "!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test02402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02402");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "ULLLULLLULLLULLLULLLULLLULLLULLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test02403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02403");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300!", "!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test02404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02404");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFF!", "~~!!U~~~U~~~U~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!U~~~U~~~U~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02405");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```!", "nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```!" + "'", str2, "LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```!");
    }

    @Test
    public void test02406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02406");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!", "\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!" + "'", str2, "!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!");
    }

    @Test
    public void test02407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02407");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]^``]^``!!]^``]^``!!]^``]^``]^``]^``!!]^``]^``!!]^``]^``!", "}~\200\200}~\200\200ULLL^ULLLULLLULLL^ULLLULLL}~\200\200}~\200\200ULLL^ULLLULLLULLL^ULLLULLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]^``]^``!!]^``]^``!!]^``]^``]^``]^``!!]^``]^``!!]^``]^``!" + "'", str2, "]^``]^``!!]^``]^``!!]^``]^``]^``]^``!!]^``]^``!!]^``]^``!");
    }

    @Test
    public void test02408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02408");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnullnullnull!", "!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128nullnull\253\254\256\256\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128nullnull!" + "'", str2, "\253\254\256\256\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128nullnull\253\254\256\256\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128nullnull!");
    }

    @Test
    public void test02409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02409");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!!", "nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!!nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!!nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!!nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!!nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!!" + "'", str2, "\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!!");
    }

    @Test
    public void test02410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02410");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0289\u028a\u028c\u028c!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnull!" + "'", str2, "!nullnullnullnull!");
    }

    @Test
    public void test02411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02411");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\200}}`null]]!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\200}}`nullnullnullnull]]!" + "'", str2, "nullnullnullnull\200}}`nullnullnullnull]]!");
    }

    @Test
    public void test02412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02412");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!!", "\275\300\300\300\276\300\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test02413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02413");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn!", "\u016e\u016d\u0170\u0170\u014d\u014e\u0150\u0150!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test02414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02414");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!", "LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!" + "'", str2, "!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!");
    }

    @Test
    public void test02415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02415");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02416");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("hi!", "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!" + "'", str2, "nullnull!");
    }

    @Test
    public void test02417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02417");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```!", "hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```!" + "'", str2, "FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```!");
    }

    @Test
    public void test02418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02418");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnullnull\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!", "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126!" + "'", str2, "\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126!");
    }

    @Test
    public void test02419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02419");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HHHHHHHH!", "nulloprr!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RRRRRRRR!" + "'", str2, "RRRRRRRR!");
    }

    @Test
    public void test02420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02420");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02421");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]]HH]]HH!!]]HH]]HH!!]]HH]]HH]]HH]]HH!!]]HH]]HH!!]]HH]]HH!", "LLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!" + "'", str2, "]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!");
    }

    @Test
    public void test02422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02422");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\254!", "~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\254!" + "'", str2, "!\254!");
    }

    @Test
    public void test02423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02423");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254!", "!fhhnullnullnull!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhhnullnullnull!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254!" + "'", str2, "\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254!");
    }

    @Test
    public void test02424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02424");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e!", "ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!!ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!!ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!!ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!!ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02425");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```!", "HHHHHHHHHHHHHHHH\200}}`HHHHHHHHHHHHHHHH]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```!" + "'", str2, "HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```!");
    }

    @Test
    public void test02426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02426");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0!!!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test02427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02427");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u0346\u0348\u0348!", "lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test02428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02428");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108nullnull!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02429");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!!", "\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226!!LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226!!!" + "'", str2, "LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226!!LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226!!!");
    }

    @Test
    public void test02430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02430");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!", "!\216\216\216!\216\216\216!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test02431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02431");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UN\275\275UN\275\275LLUN\275\275UN\275\275LLUN\275\275UN\275\275LLUN\275\275UN\275\275LLUN\275\275UN\275\275LLUN\275\275UN\275\275LLUN\275\275UN\275\275LLUN\275\275UN\275\275LL!", "hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HH!" + "'", str2, "H!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HH!");
    }

    @Test
    public void test02432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02432");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!nullnullnullnull!", "UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!UNLL\256\254\254UNLL\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\331\330\333\333\331\330\333\333\331\330\333\333\331\330\333\333!" + "'", str2, "!\331\330\333\333\331\330\333\333\331\330\333\333\331\330\333\333!");
    }

    @Test
    public void test02433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02433");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0146\u0146\u0146\u0146\u0146\u0146\u0146\u0146\u0346\u0348\u0348!", "nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test02434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02434");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!!", "\u0366\u0365\u0368\u0368\u0128\u0128\u0128\u0128\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!!" + "'", str2, "]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!!");
    }

    @Test
    public void test02435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02435");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\275!!\275\275!!!!\275\275!!\275\275!!!!!", "hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275!!\275\275!!!!\275\275!!\275\275!!!!!" + "'", str2, "\275\275!!\275\275!!!!\275\275!!\275\275!!!!!");
    }

    @Test
    public void test02436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02436");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("l]lll]ll!!l]lll]ll!!l]lll]lll]lll]ll!!l]lll]ll!!l]lll]ll!", "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!" + "'", str2, "]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!");
    }

    @Test
    public void test02437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02437");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230!", "~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230!");
    }

    @Test
    public void test02438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02438");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!", "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!" + "'", str2, "NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!");
    }

    @Test
    public void test02439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02439");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!!", "\275nullnull\200\200nullnull\200\200nullnull\200\200\276nullnull\200\200\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test02440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02440");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02441");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!", "LNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!" + "'", str2, "LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!");
    }

    @Test
    public void test02442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02442");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198nullnull!", "\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NULLLNUULNUULNUULNUUNULLLNUULNUU!" + "'", str2, "NULLLNUULNUULNUULNUUNULLLNUULNUU!");
    }

    @Test
    public void test02443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02443");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!", "\351\354\354\354\351\354\354\354\351\354\354\354\351\354\354\354\200}}`\351\354\354\354\351\354\354\354\351\354\354\354\351\354\354\354]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314!" + "'", str2, "\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314!");
    }

    @Test
    public void test02444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02444");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!", "null~}}^null]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test02445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02445");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!!", "nullnullnullnullnullnullnullnullXXXXXXXXnullnullnullnullnullnullnullnullXXXXXXXXnullnullnullnullnullnullnullnullXXXXXXXXnullnullnullnullnullnullnullnullXXXXXXXXnullnullnullnullnullnullnullnullXXXXXXXXnullnullnullnullnullnullnullnullXXXXXXXXnullnullnullnullnullnullnullnullXXXXXXXXnullnullnullnullnullnullnullnullXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!!" + "'", str2, "UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!!");
    }

    @Test
    public void test02446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02446");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]!E!!!E!!!E!!!E!!!E!!]]!E!!!E!!]]!E!!!E!!]]!E!!!E!!]]]!E!!!E!!!E!!!E!!!E!!]]!E!!!E!!]]!", "porrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporr!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!null!!!null!!!null!!!null!!!null!!]]!null!!!null!!]]!null!!!null!!]]!null!!!null!!]]]!null!!!null!!!null!!!null!!!null!!]]!null!!!null!!]]!" + "'", str2, "]!null!!!null!!!null!!!null!!!null!!]]!null!!!null!!]]!null!!!null!!]]!null!!!null!!]]]!null!!!null!!!null!!!null!!!null!!]]!null!!!null!!]]!");
    }

    @Test
    public void test02447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02447");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULL!" + "'", str2, "UULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULL!");
    }

    @Test
    public void test02448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02448");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "efhhefhhefhhefhhefhhefhhefhhefhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test02449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02449");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266!" + "'", str2, "nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266!");
    }

    @Test
    public void test02450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02450");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!", "EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!" + "'", str2, "!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!");
    }

    @Test
    public void test02451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02451");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016enullnull!", "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!" + "'", str2, "LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!");
    }

    @Test
    public void test02452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02452");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220!", "\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\200\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220!" + "'", str2, "\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220!");
    }

    @Test
    public void test02453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02453");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu!", "LLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200llll!llllllllllll!llllllll!lll!lllllll!llllllllllll!llllllll!lll!lll~}\200\200~}\200\200llll!llllllllllll!llllllll!lll!lllllll!llllllllllll!llllllll!lll!lll~}\200\200~}\200\200llll!llllllllllll!llllllll!lll!lllllll!llllllllllll!llllllll!lll!lll~}\200\200~}\200\200llll!llllllllllll!llllllll!lll!lllllll!llllllllllll!llllllll!lll!lll~}\200\200~}\200\200llll!llllllllllll!llllllll!lll!lllllll!llllllllllll!llllllll!lll!lll~}\200\200~}\200\200llll!llllllllllll!llllllll!lll!lllllll!llllllllllll!llllllll!lll!lll~}\200\200~}\200\200llll!llllllllllll!llllllll!lll!lllllll!llllllllllll!llllllll!lll!lll~}\200\200~}\200\200llll!llllllllllll!llllllll!lll!lllllll!llllllllllll!llllllll!lll!lll!" + "'", str2, "~}\200\200~}\200\200llll!llllllllllll!llllllll!lll!lllllll!llllllllllll!llllllll!lll!lll~}\200\200~}\200\200llll!llllllllllll!llllllll!lll!lllllll!llllllllllll!llllllll!lll!lll~}\200\200~}\200\200llll!llllllllllll!llllllll!lll!lllllll!llllllllllll!llllllll!lll!lll~}\200\200~}\200\200llll!llllllllllll!llllllll!lll!lllllll!llllllllllll!llllllll!lll!lll~}\200\200~}\200\200llll!llllllllllll!llllllll!lll!lllllll!llllllllllll!llllllll!lll!lll~}\200\200~}\200\200llll!llllllllllll!llllllll!lll!lllllll!llllllllllll!llllllll!lll!lll~}\200\200~}\200\200llll!llllllllllll!llllllll!lll!lllllll!llllllllllll!llllllll!lll!lll~}\200\200~}\200\200llll!llllllllllll!llllllll!lll!lllllll!llllllllllll!llllllll!lll!lll!");
    }

    @Test
    public void test02454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02454");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\200\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230]]!", "~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\200\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230]]!" + "'", str2, "\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\200\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230]]!");
    }

    @Test
    public void test02455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02455");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HFFFHFFF!", "LLUUUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02456");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!nullnull!!nullnull!!nullnull!!null!!!null!!!null!!!null!!!nullnull!!nullnull!!nullnull!!nullnull!!null!!!null!!!!", "]!null!!!null!!!null!!!null!!!null!!]]!null!!!null!!]]!null!!!null!!]]!null!!!null!!]]]!null!!!null!!!null!!!null!!!null!!]]!null!!!null!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!" + "'", str2, "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!");
    }

    @Test
    public void test02457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02457");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XX!", "!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LL!" + "'", str2, "LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LL!");
    }

    @Test
    public void test02458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02458");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368LL!!LL!!\200\200\u0346\u0348\u0348!", "ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368LL!!LL!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368LL!!LL!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test02459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02459");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u016e\u016d\u0170\u0170\u014d\u014e\u0150\u0150!", "ULLLULLLULLLULLLULLLULLLULLLULLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02460");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!", "}~\200\200}~\200\200LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU}~\200\200}~\200\200LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!" + "'", str2, "NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!");
    }

    @Test
    public void test02461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02461");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULLUULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02462");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!!", "l!lll!lll!lll!lll!lll!lll!lll!ll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!" + "'", str2, "!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!");
    }

    @Test
    public void test02463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02463");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02464");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test02465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02465");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!", "UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!" + "'", str2, "!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!");
    }

    @Test
    public void test02466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02466");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226!!UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226!!!", "unllunllunllunllunllunllunllunll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226!!]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226!!!" + "'", str2, "]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226!!]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226!!!");
    }

    @Test
    public void test02467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02467");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HHHHHHHH!!HHHHHHHH!!HHHHHHHHHHHHHHHH!!HHHHHHHH!!HHHHHHHH!", "]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL!!]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL!!]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL!!]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL!!]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02468");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!nullnull!!!", "!\253\256\256nullnullnullnullnullnullnullnullnullnullnullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256nullnullnullnullnullnullnullnullnullnullnullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!LLU!LL!!U!LLU!LL!!!" + "'", str2, "U!LLU!LL!!U!LLU!LL!!!");
    }

    @Test
    public void test02469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02469");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c!", "\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02470");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02471");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214!", "LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```LUUULUUULUUULUUU```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214!" + "'", str2, "UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214!");
    }

    @Test
    public void test02472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02472");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!nullnull!!nullnull!!nullnull!!null!!!null!!!null!!!null!!!nullnull!!nullnull!!nullnull!!nullnull!!null!!!null!!!!", "UNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNN!!!LUNN!!!LUNN!!!LUNN!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNN!!!LUNN!!!!" + "'", str2, "LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNN!!!LUNN!!!LUNN!!!LUNN!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNN!!!LUNN!!!!");
    }

    @Test
    public void test02473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02473");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246!!!```!", "\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```!" + "'", str2, "nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```!");
    }

    @Test
    public void test02474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02474");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\276\276\276\276\276!!\276\276!!\276\276!!\276\276!!!", "porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200!!porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200!!porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200!!porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200!!porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276\276\276\276\276!!\276\276!!\276\276!!\276\276!!!" + "'", str2, "!\276\276\276\276\276!!\276\276!!\276\276!!\276\276!!!");
    }

    @Test
    public void test02475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02475");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!!", "ULLLULLLULLLULLL\200}}`ULLLULLLULLLULLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!!" + "'", str2, "ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!!");
    }

    @Test
    public void test02476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02476");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7!", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test02477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02477");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull}~\200\200}~\200\200\u0348\u0346\u0346!", "UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128\u0348\u0346\u0346!");
    }

    @Test
    public void test02478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02478");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314!", "!N!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02479");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!", "~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!" + "'", str2, "!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!");
    }

    @Test
    public void test02480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02480");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!", "hhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test02481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02481");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "\u0366\u0365\u0368\u0368LL!!LL!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljj!" + "'", str2, "nullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljj!");
    }

    @Test
    public void test02482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02482");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!!", "~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!!" + "'", str2, "\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!!");
    }

    @Test
    public void test02483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02483");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "lluulluu!!lluulluu!!lluulluulluulluu!!lluulluu!!lluulluu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!" + "'", str2, "ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!");
    }

    @Test
    public void test02484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02484");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d!", "EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test02485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02485");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("unllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnull!", "}~\200\200}~\200\200nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200!" + "'", str2, "N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200!");
    }

    @Test
    public void test02486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02486");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!", "!\253\256\256\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!" + "'", str2, "\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!");
    }

    @Test
    public void test02487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02487");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!!!LL!", "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0346\u0346!" + "'", str2, "\u0346\u0346\u0346\u0346!");
    }

    @Test
    public void test02488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02488");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!", "\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129!!!!!" + "'", str2, "\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129!!!!!");
    }

    @Test
    public void test02489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02489");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("rrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPP!", "\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e!" + "'", str2, "\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e!");
    }

    @Test
    public void test02490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02490");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "}~\200\200}~\200\200null^nullnullnull^nullnull}~\200\200}~\200\200null^nullnullnull^nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02491");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL!!!!LL!", "\u0366\u0365\u0368\u0368\u0345\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!!!nullnull!" + "'", str2, "nullnull!!!!nullnull!");
    }

    @Test
    public void test02492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02492");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\246\246!!\246\246!!!", "ijllijllijllijll!ill!ill!ill!illijllijllijllijll!ill!ill!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\246\246!!\246\246!!!" + "'", str2, "\246\246!!\246\246!!!");
    }

    @Test
    public void test02493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02493");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HHFFH~~HHFFH~~HHFFH~~HHFFH~~HHFFH~~HHFFH~~HHFFH~~HHFFH~~!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~!" + "'", str2, "nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~!");
    }

    @Test
    public void test02494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02494");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!", "UNLLUNLL!!UNLLUNLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn!!l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn!!!" + "'", str2, "l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn!!l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn!!!");
    }

    @Test
    public void test02495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02495");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```!", "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```!" + "'", str2, "NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```!");
    }

    @Test
    public void test02496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02496");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]!", "NULLNULL!!NULLNULL!!NULLNULLNULLNULL!!NULLNULL!!NULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]!" + "'", str2, "\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]!");
    }

    @Test
    public void test02497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02497");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test02498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02498");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368NULLNULL!", "LLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368LLLLLLLL!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368LLLLLLLL!");
    }

    @Test
    public void test02499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02499");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!", "UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLLNLLL!" + "'", str2, "NLLLNLLL!");
    }

    @Test
    public void test02500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02500");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!", "wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }
}
