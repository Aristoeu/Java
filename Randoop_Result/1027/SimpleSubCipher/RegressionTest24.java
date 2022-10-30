package SimpleSubCipher;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest24 {

    public static boolean debug = false;

    @Test
    public void test12001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12001");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!", "\u0143\u0145\u0145\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0143\u0145\u0145\u0145\u0143\u0145\u0143!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!" + "'", str2, "!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!");
    }

    @Test
    public void test12002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12002");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u0346\u0348\u0348!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test12003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12003");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!" + "'", str2, "\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!");
    }

    @Test
    public void test12004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12004");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\276\u02fa\225\225\276\u02fa\225\225\200\200\276\u02fa\225\225\276\u02fa\225\225\200\200\276\u02fa\225\225\276\u02fa\225\225\200\200\276\276\u02fa\225\225\276\u02fa\225\225\200\200\275\275!", "\275\276\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\225\225\276\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\225\225\200\200\276\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\225\225\276\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\225\225\200\200\276\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\225\225\276\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\225\225\200\200\276\276\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\225\225\276\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\225\225\200\200\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276\u02fa\225\225\276\u02fa\225\225\200\200\276\u02fa\225\225\276\u02fa\225\225\200\200\276\u02fa\225\225\276\u02fa\225\225\200\200\276\276\u02fa\225\225\276\u02fa\225\225\200\200\275\275!" + "'", str2, "\275\276\u02fa\225\225\276\u02fa\225\225\200\200\276\u02fa\225\225\276\u02fa\225\225\200\200\276\u02fa\225\225\276\u02fa\225\225\200\200\276\276\u02fa\225\225\276\u02fa\225\225\200\200\275\275!");
    }

    @Test
    public void test12005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12005");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!", "U!LLU!LL!!U!LLU!LL!!U!LLU!LLU!LLU!LL!!U!LLU!LL!!U!LLU!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!" + "'", str2, "!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
    }

    @Test
    public void test12006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12006");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]AAAnullnullnull\256\254\254]AAAnullnullnull\256\254\254!!]AAAnullnullnull\256\254\254]AAAnullnullnull\256\254\254!!]AAAnullnullnull\256\254\254]AAAnullnullnull\256\254\254!!]AAAnullnullnull\256\254\254]AAAnullnullnull\256\254\254!!]AAAnullnullnull\256\254\254]AAAnullnullnull\256\254\254!!]AAAnullnullnull\256\254\254]AAAnullnullnull\256\254\254!!]AAAnullnullnull\256\254\254]AAAnullnullnull\256\254\254!!]AAAnullnullnull\256\254\254]AAAnullnullnull\256\254\254!!!", "]!null!!!null!!!null!!!null!!!null!!]]!null!!!null!!]]!null!!!null!!]]!null!!!null!!]]]!null!!!null!!!null!!!null!!!null!!]]!null!!!null!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!!" + "'", str2, "]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!]]]]!]!!!]!!!]!!\256\254\254]]]]!]!!!]!!!]!!\256\254\254!!!");
    }

    @Test
    public void test12007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12007");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!``nullnull!", "\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!``\276\276\236\236\276\276\236\236!" + "'", str2, "!``\276\276\236\236\276\276\236\236!");
    }

    @Test
    public void test12008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12008");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!!!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!!!", "!\253\256\256\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172!!!" + "'", str2, "\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172!!!");
    }

    @Test
    public void test12009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12009");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\256LNLL\254\254\256LNLL\254\254!!\256LNLL\254\254\256LNLL\254\254!!\256LNLL\254\254\256LNLL\254\254!!\256LNLL\254\254\256LNLL\254\254!!\256LNLL\254\254\256LNLL\254\254!!\256LNLL\254\254\256LNLL\254\254!!\256LNLL\254\254\256LNLL\254\254!!\256LNLL\254\254\256LNLL\254\254!", "!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!" + "'", str2, "!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!");
    }

    @Test
    public void test12010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12010");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108UU!", "!UUU!UUU!UUU!UUU\200}}`!UUU!UUU!UUU!UUU]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!" + "'", str2, "!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!!Unull!!Unull!!!");
    }

    @Test
    public void test12011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12011");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!T!!!T!!!!!T!!!T!!!!!T!!!T!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test12012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12012");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!!", "!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!!");
    }

    @Test
    public void test12013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12013");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("fehhfehhnullnullfehhfehhnullnull!", "\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aanullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02ed\u02ee\u02f0\u02f0\u02ed\u02ee\u02f0\u02f0\u02ed\u02ee\u02f0\u02f0\u02ed\u02ee\u02f0\u02f0!" + "'", str2, "\u02ed\u02ee\u02f0\u02f0\u02ed\u02ee\u02f0\u02f0\u02ed\u02ee\u02f0\u02f0\u02ed\u02ee\u02f0\u02f0!");
    }

    @Test
    public void test12014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12014");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12015");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254!!!", "\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!!" + "'", str2, "nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!!");
    }

    @Test
    public void test12016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12016");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300!", "~}\200\200~}\200\200!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230~}\200\200~}\200\200!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230~}\200\200~}\200\200!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230~}\200\200~}\200\200!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230~}\200\200~}\200\200!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230~}\200\200~}\200\200!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230~}\200\200~}\200\200!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230~}\200\200~}\200\200!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!^^!!^^!!^^!!^^!!^^!!^^!!^^!!^^!" + "'", str2, "!!^^!!^^!!^^!!^^!!^^!!^^!!^^!!^^!");
    }

    @Test
    public void test12017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12017");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!", "\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300``\300\300````\300\300``\300\300````!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!" + "'", str2, "\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!");
    }

    @Test
    public void test12018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12018");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!", "}nullnullnull~}}^}nullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!" + "'", str2, "!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!");
    }

    @Test
    public void test12019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12019");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u017e\u017e\u017e\u017e\u017e\u017enullnullnullnullnullnullnullnull!", "XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xx!!nullnullnullxx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!nullnullnullxx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!" + "'", str2, "xx!!nullnullnullxx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!nullnullnullxx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!");
    }

    @Test
    public void test12020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12020");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ffff\236\276\276ffff\236\276\276!!ffff\236\276\276ffff\236\276\276!!ffff\236\276\276ffff\236\276\276ffff\236\276\276ffff\236\276\276!!ffff\236\276\276ffff\236\276\276!!ffff\236\276\276ffff\236\276\276!", "]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAA\236\276\276AAAA\236\276\276!!AAAA\236\276\276AAAA\236\276\276!!AAAA\236\276\276AAAA\236\276\276AAAA\236\276\276AAAA\236\276\276!!AAAA\236\276\276AAAA\236\276\276!!AAAA\236\276\276AAAA\236\276\276!" + "'", str2, "AAAA\236\276\276AAAA\236\276\276!!AAAA\236\276\276AAAA\236\276\276!!AAAA\236\276\276AAAA\236\276\276AAAA\236\276\276AAAA\236\276\276!!AAAA\236\276\276AAAA\236\276\276!!AAAA\236\276\276AAAA\236\276\276!");
    }

    @Test
    public void test12021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12021");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e!", "LLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12022");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!", "\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!" + "'", str2, "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!");
    }

    @Test
    public void test12023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12023");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!", "~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230\200}}`~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!" + "'", str2, "!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!");
    }

    @Test
    public void test12024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12024");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUU!", "II]IIIIII]IIIIII]IIIIII]IIII!II]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIII!II]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIII!II]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIII!II]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIII!II]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIII!II]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIII!II]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIII!II]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIII!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12025");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200!!!!}\200\200!!!!}\200\200\230\230!!!!}\200\200!!!!}\200\200\230\230~}\200\200~}\200\200!!!!}\200\200!!!!}\200\200\230\230!!!!}\200\200!!!!}\200\200\230\230~}\200\200~}\200\200!!!!}\200\200!!!!}\200\200\230\230!!!!}\200\200!!!!}\200\200\230\230~}\200\200~}\200\200!!!!}\200\200!!!!}\200\200\230\230!!!!}\200\200!!!!}\200\200\230\230~}\200\200~}\200\200!!!!}\200\200!!!!}\200\200\230\230!!!!}\200\200!!!!}\200\200\230\230~}\200\200~}\200\200!!!!}\200\200!!!!}\200\200\230\230!!!!}\200\200!!!!}\200\200\230\230~}\200\200~}\200\200!!!!}\200\200!!!!}\200\200\230\230!!!!}\200\200!!!!}\200\200\230\230~}\200\200~}\200\200!!!!}\200\200!!!!}\200\200\230\230!!!!}\200\200!!!!}\200\200\230\230!", "\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200!!!!}\200\200!!!!}\200\200\230\230!!!!}\200\200!!!!}\200\200\230\230~}\200\200~}\200\200!!!!}\200\200!!!!}\200\200\230\230!!!!}\200\200!!!!}\200\200\230\230~}\200\200~}\200\200!!!!}\200\200!!!!}\200\200\230\230!!!!}\200\200!!!!}\200\200\230\230~}\200\200~}\200\200!!!!}\200\200!!!!}\200\200\230\230!!!!}\200\200!!!!}\200\200\230\230~}\200\200~}\200\200!!!!}\200\200!!!!}\200\200\230\230!!!!}\200\200!!!!}\200\200\230\230~}\200\200~}\200\200!!!!}\200\200!!!!}\200\200\230\230!!!!}\200\200!!!!}\200\200\230\230~}\200\200~}\200\200!!!!}\200\200!!!!}\200\200\230\230!!!!}\200\200!!!!}\200\200\230\230~}\200\200~}\200\200!!!!}\200\200!!!!}\200\200\230\230!!!!}\200\200!!!!}\200\200\230\230!" + "'", str2, "~}\200\200~}\200\200!!!!}\200\200!!!!}\200\200\230\230!!!!}\200\200!!!!}\200\200\230\230~}\200\200~}\200\200!!!!}\200\200!!!!}\200\200\230\230!!!!}\200\200!!!!}\200\200\230\230~}\200\200~}\200\200!!!!}\200\200!!!!}\200\200\230\230!!!!}\200\200!!!!}\200\200\230\230~}\200\200~}\200\200!!!!}\200\200!!!!}\200\200\230\230!!!!}\200\200!!!!}\200\200\230\230~}\200\200~}\200\200!!!!}\200\200!!!!}\200\200\230\230!!!!}\200\200!!!!}\200\200\230\230~}\200\200~}\200\200!!!!}\200\200!!!!}\200\200\230\230!!!!}\200\200!!!!}\200\200\230\230~}\200\200~}\200\200!!!!}\200\200!!!!}\200\200\230\230!!!!}\200\200!!!!}\200\200\230\230~}\200\200~}\200\200!!!!}\200\200!!!!}\200\200\230\230!!!!}\200\200!!!!}\200\200\230\230!");
    }

    @Test
    public void test12026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12026");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]!", "!!!!\231\231\231\231\231\231\231\231!!\231\231\231\231\231\231\231\231!!\231\231\231\231\231\231\231\231!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\231\231\231\231\231\231\231\231!!\231\231\231\231\231\231\231\231!!\231\231\231\231\231\231\231\231!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]!" + "'", str2, "]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]!");
    }

    @Test
    public void test12027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12027");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12028");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\275\u0346!!\275\u0346!!\275\u0346!!!\275\u0346!!\275\u0346!!\275\u0346!!!!!\275\u0346!!\275\u0346!!\275\u0346!!!\275\u0346!!\275\u0346!!\275\u0346!!!!!\275\u0346!!\275\u0346!!\275\u0346!!!\275\u0346!!\275\u0346!!\275\u0346!!!!!\275\u0346!!\275\u0346!!\275\u0346!!!\275\u0346!!\275\u0346!!\275\u0346\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!\275\u0346!!\275\u0346!!\275\u0346!!!\275\u0346!!\275\u0346!!\275\u0346!!!!!\275\u0346!!\275\u0346!!\275\u0346!!!\275\u0346!!\275\u0346!!\275\u0346!!!!!\275\u0346!!\275\u0346!!\275\u0346!!!\275\u0346!!\275\u0346!!\275\u0346!!!!!\275\u0346!!\275\u0346!!\275\u0346!!!\275\u0346!!\275\u0346!!\275\u0346\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!", "LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\275\u0346!!\275\u0346!!\275\u0346!!!\275\u0346!!\275\u0346!!\275\u0346!!!!!\275\u0346!!\275\u0346!!\275\u0346!!!\275\u0346!!\275\u0346!!\275\u0346!!!!!\275\u0346!!\275\u0346!!\275\u0346!!!\275\u0346!!\275\u0346!!\275\u0346!!!!!\275\u0346!!\275\u0346!!\275\u0346!!!\275\u0346!!\275\u0346!!\275\u0346\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!\275\u0346!!\275\u0346!!\275\u0346!!!\275\u0346!!\275\u0346!!\275\u0346!!!!!\275\u0346!!\275\u0346!!\275\u0346!!!\275\u0346!!\275\u0346!!\275\u0346!!!!!\275\u0346!!\275\u0346!!\275\u0346!!!\275\u0346!!\275\u0346!!\275\u0346!!!!!\275\u0346!!\275\u0346!!\275\u0346!!!\275\u0346!!\275\u0346!!\275\u0346\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!" + "'", str2, "!\275\u0346!!\275\u0346!!\275\u0346!!!\275\u0346!!\275\u0346!!\275\u0346!!!!!\275\u0346!!\275\u0346!!\275\u0346!!!\275\u0346!!\275\u0346!!\275\u0346!!!!!\275\u0346!!\275\u0346!!\275\u0346!!!\275\u0346!!\275\u0346!!\275\u0346!!!!!\275\u0346!!\275\u0346!!\275\u0346!!!\275\u0346!!\275\u0346!!\275\u0346\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!\275\u0346!!\275\u0346!!\275\u0346!!!\275\u0346!!\275\u0346!!\275\u0346!!!!!\275\u0346!!\275\u0346!!\275\u0346!!!\275\u0346!!\275\u0346!!\275\u0346!!!!!\275\u0346!!\275\u0346!!\275\u0346!!!\275\u0346!!\275\u0346!!\275\u0346!!!!!\275\u0346!!\275\u0346!!\275\u0346!!!\275\u0346!!\275\u0346!!\275\u0346\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!");
    }

    @Test
    public void test12029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12029");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12030");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!", "\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276!!\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276!!\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276!!\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276!!\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!" + "'", str2, "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!");
    }

    @Test
    public void test12031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12031");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "}null\200\200}null\200\200}null\200\200}null\200\200L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~}null\200\200}null\200\200}null\200\200}null\200\200L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365!" + "'", str2, "\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365\323\324\365\365!");
    }

    @Test
    public void test12032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12032");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("u!ll!!!u!ll!!!u!ll!!!u!ll!!!u!ll!!!u!ll!!!u!ll!!!u!ll!!!!", "]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL]LLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!LL!!!]!LL!!!]!LL!!!]!LL!!!]!LL!!!]!LL!!!]!LL!!!]!LL!!!!" + "'", str2, "]!LL!!!]!LL!!!]!LL!!!]!LL!!!]!LL!!!]!LL!!!]!LL!!!]!LL!!!!");
    }

    @Test
    public void test12033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12033");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``!", "\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!!!!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!!!!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!!!!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!!!!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!!!!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!!!!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!!!!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``!" + "'", str2, "\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``\253\253\253!!```\253\253\253!!``\253\253\253!!``!");
    }

    @Test
    public void test12034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12034");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]F^^!]F^^]F^^]F^^]F^^!!]F^^]F^^!!]F^^]F^^!!]F^^]F^^!!]F^^!]F^^]F^^]F^^]F^^!!]F^^]F^^!!!", "!\220!!!\220!!^^\225\230\230!\220!!!\220!!^^\225\230\230!\220!!!\220!!^^\225\230\230!\220!!!\220!!^^\225\230\230\200}}`!\220!!!\220!!^^\225\230\230!\220!!!\220!!^^\225\230\230!\220!!!\220!!^^\225\230\230!\220!!!\220!!^^\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]null^^!]null^^]null^^]null^^]null^^!!]null^^]null^^!!]null^^]null^^!!]null^^]null^^!!]null^^!]null^^]null^^]null^^]null^^!!]null^^]null^^!!!" + "'", str2, "]null^^!]null^^]null^^]null^^]null^^!!]null^^]null^^!!]null^^]null^^!!]null^^]null^^!!]null^^!]null^^]null^^]null^^]null^^!!]null^^]null^^!!!");
    }

    @Test
    public void test12035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12035");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243!!!!!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!!!" + "'", str2, "!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!!!");
    }

    @Test
    public void test12036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12036");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!", "~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!" + "'", str2, "!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!");
    }

    @Test
    public void test12037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12037");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0150\u0150\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0150\u0150\u0346\u0348\u0348!");
    }

    @Test
    public void test12038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12038");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~!!]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~!!]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~!!]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~!!]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~!", "\276\276\275\275\275\275\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~!!]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~!!]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~!!]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~!!]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~!" + "'", str2, "]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~!!]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~!!]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~!!]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~!!]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~!");
    }

    @Test
    public void test12039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12039");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!", "\253\254\256\256\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da!!!\253\254\256\256\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!`!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "`!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!`!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test12040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12040");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("``JJ``JJ!!``JJ``JJ!!!", "N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``nullnull``nullnull!!``nullnull``nullnull!!!" + "'", str2, "``nullnull``nullnull!!``nullnull``nullnull!!!");
    }

    @Test
    public void test12041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12041");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014c\u014c\u014c\u014c\u014e\u014c\u014c\u014c\u014e\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014e\u014c\u014c\u014c\u014e\u014c\u014c\u014c!", "!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull]]nullnull]]nullnullnullnullnullnullnullnullnullnull]]nullnull]]nullnullnullnullnullnullnullnull!" + "'", str2, "nullnull]]nullnull]]nullnullnullnullnullnullnullnullnullnull]]nullnull]]nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12042");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0106\u0106\u0106\u0106!", "UNNN\200}}`UNNN]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull]nullnn]nullnn]nullnn]nullnnnullnull!" + "'", str2, "nullnull]nullnn]nullnn]nullnn]nullnnnullnull!");
    }

    @Test
    public void test12043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12043");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]]^^\225\230\230]]^^\225\230\230]]^^\225\230\230]]^^\225\230\230\200}}`]]^^\225\230\230]]^^\225\230\230]]^^\225\230\230]]^^\225\230\230]]!", "enulleeenulleenullnullenulleeenulleenullnull!!enulleeenulleenullnullenulleeenulleenullnull!!enulleeenulleenullnullenulleeenulleenullnullenulleeenulleenullnullenulleeenulleenullnull!!enulleeenulleenullnullenulleeenulleenullnull!!enulleeenulleenullnullenulleeenulleenullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]^^\225\230\230]]^^\225\230\230]]^^\225\230\230]]^^\225\230\230\200}}`]]^^\225\230\230]]^^\225\230\230]]^^\225\230\230]]^^\225\230\230]]!" + "'", str2, "]]^^\225\230\230]]^^\225\230\230]]^^\225\230\230]]^^\225\230\230\200}}`]]^^\225\230\230]]^^\225\230\230]]^^\225\230\230]]^^\225\230\230]]!");
    }

    @Test
    public void test12044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12044");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226!!null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226!!!", "!!LL!!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!LL!!!!LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull\264\264\230\226\226nullnull\264\264\230\226\226nullnull\264\264\230\226\226nullnull\264\264\230\226\226nullnull\264\264\230\226\226nullnull\264\264\230\226\226nullnull\264\264\230\226\226nullnull\264\264\230\226\226!!nullnull\264\264\230\226\226nullnull\264\264\230\226\226nullnull\264\264\230\226\226nullnull\264\264\230\226\226nullnull\264\264\230\226\226nullnull\264\264\230\226\226nullnull\264\264\230\226\226nullnull\264\264\230\226\226!!!" + "'", str2, "nullnull\264\264\230\226\226nullnull\264\264\230\226\226nullnull\264\264\230\226\226nullnull\264\264\230\226\226nullnull\264\264\230\226\226nullnull\264\264\230\226\226nullnull\264\264\230\226\226nullnull\264\264\230\226\226!!nullnull\264\264\230\226\226nullnull\264\264\230\226\226nullnull\264\264\230\226\226nullnull\264\264\230\226\226nullnull\264\264\230\226\226nullnull\264\264\230\226\226nullnull\264\264\230\226\226nullnull\264\264\230\226\226!!!");
    }

    @Test
    public void test12045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12045");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!!", "RRRRRRRR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!!" + "'", str2, "\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!!");
    }

    @Test
    public void test12046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12046");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull!", "!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~H!]]\200H!]]H!]]H!]]\200H!]]H!]]{|~~{|~~H!]]\200H!]]H!]]H!]]\200H!]]H!]]{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~H!]]\200H!]]H!]]H!]]\200H!]]H!]]{|~~{|~~H!]]\200H!]]H!]]H!]]\200H!]]H!]]{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~H!]]\200H!]]H!]]H!]]\200H!]]H!]]{|~~{|~~H!]]\200H!]]H!]]H!]]\200H!]]H!]]{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~H!]]\200H!]]H!]]H!]]\200H!]]H!]]{|~~{|~~H!]]\200H!]]H!]]H!]]\200H!]]H!]]{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~H!]]\200H!]]H!]]H!]]\200H!]]H!]]{|~~{|~~H!]]\200H!]]H!]]H!]]\200H!]]H!]]{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~H!]]\200H!]]H!]]H!]]\200H!]]H!]]{|~~{|~~H!]]\200H!]]H!]]H!]]\200H!]]H!]]{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~H!]]\200H!]]H!]]H!]]\200H!]]H!]]{|~~{|~~H!]]\200H!]]H!]]H!]]\200H!]]H!]]{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~H!]]\200H!]]H!]]H!]]\200H!]]H!]]{|~~{|~~H!]]\200H!]]H!]]H!]]\200H!]]H!]]!" + "'", str2, "{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~H!]]\200H!]]H!]]H!]]\200H!]]H!]]{|~~{|~~H!]]\200H!]]H!]]H!]]\200H!]]H!]]{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~H!]]\200H!]]H!]]H!]]\200H!]]H!]]{|~~{|~~H!]]\200H!]]H!]]H!]]\200H!]]H!]]{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~H!]]\200H!]]H!]]H!]]\200H!]]H!]]{|~~{|~~H!]]\200H!]]H!]]H!]]\200H!]]H!]]{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~H!]]\200H!]]H!]]H!]]\200H!]]H!]]{|~~{|~~H!]]\200H!]]H!]]H!]]\200H!]]H!]]{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~H!]]\200H!]]H!]]H!]]\200H!]]H!]]{|~~{|~~H!]]\200H!]]H!]]H!]]\200H!]]H!]]{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~H!]]\200H!]]H!]]H!]]\200H!]]H!]]{|~~{|~~H!]]\200H!]]H!]]H!]]\200H!]]H!]]{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~H!]]\200H!]]H!]]H!]]\200H!]]H!]]{|~~{|~~H!]]\200H!]]H!]]H!]]\200H!]]H!]]{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~H!]]\200H!]]H!]]H!]]\200H!]]H!]]{|~~{|~~H!]]\200H!]]H!]]H!]]\200H!]]H!]]!");
    }

    @Test
    public void test12047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12047");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!!", "!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!!" + "'", str2, "\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!\260!U!!!U!!!U!!!");
    }

    @Test
    public void test12048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12048");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275!U!!!U!!!U!!\276!U!!\275\275!", "nullnullnullnull\362\363\365\365\362\363\365\365\362\363\365\365\362\363\365\365nullnullnullnull\362\363\365\365\362\363\365\365!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!n!!!n!!!n!!\276!n!!\275\275!" + "'", str2, "\275!n!!!n!!!n!!\276!n!!\275\275!");
    }

    @Test
    public void test12049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12049");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("RR!", "\u013b\u013c\u013e\u013e\u013b\u013c\u013e\u013e\u013b\u013c\u013e\u013e\u013b\u013c\u013e\u013enullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UU!" + "'", str2, "UU!");
    }

    @Test
    public void test12050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12050");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff!", "fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``EHHH!HHEHHH!HH``EHHH!HHEHHH!HH``EHHH!HHEHHH!HH``EHHH!HHEHHH!HH``EHHH!HHEHHH!HH``EHHH!HHEHHH!HH``EHHH!HHEHHH!HH``EHHH!HHEHHH!HH!" + "'", str2, "``EHHH!HHEHHH!HH``EHHH!HHEHHH!HH``EHHH!HHEHHH!HH``EHHH!HHEHHH!HH``EHHH!HHEHHH!HH``EHHH!HHEHHH!HH``EHHH!HHEHHH!HH``EHHH!HHEHHH!HH!");
    }

    @Test
    public void test12051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12051");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!!", "NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!!");
    }

    @Test
    public void test12052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12052");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!!", "\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]!!RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]!!RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]!!RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]!!RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]!!RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]!!RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]!!RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]!!!" + "'", str2, "RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]!!RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]!!RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]!!RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]!!RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]!!RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]!!RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]!!RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]!!!");
    }

    @Test
    public void test12053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12053");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("U!UUU!UUU!UUUU!UUU!UUU!UUUU!UUU!UUU!UUUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUUU!UUU!UUU!UUUU!UUU!UUU!UUUU!UUU!UUU!UUUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!", "N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N!NNN!NNN!NNNN!NNN!NNN!NNNN!NNN!NNN!NNNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNNN!NNN!NNN!NNNN!NNN!NNN!NNNN!NNN!NNN!NNNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!" + "'", str2, "N!NNN!NNN!NNNN!NNN!NNN!NNNN!NNN!NNN!NNNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNNN!NNN!NNN!NNNN!NNN!NNN!NNNN!NNN!NNN!NNNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!");
    }

    @Test
    public void test12054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12054");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0346\u0348\u0348!", "NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test12055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12055");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\254\256\256\366\367\371\371\366\367\371\371\366\367\371\371\366\367\371\371\253\254\256\256\366\367\371\371\366\367\371\371!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullijllnullnullnullijllnullnull\253\253nullijllnullnullnullijllnullnull\253\253nullijllnullnullnullijllnullnull\253\253nullijllnullnullnullijllnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullijllnullnullnullijllnullnull\253\253nullijllnullnullnullijllnullnull\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256U\367NNU\367NNU\367NNU\367NN\253\254\256\256U\367NNU\367NN!" + "'", str2, "\253\254\256\256U\367NNU\367NNU\367NNU\367NN\253\254\256\256U\367NNU\367NN!");
    }

    @Test
    public void test12056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12056");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!", "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!" + "'", str2, "!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12057");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215}\215\215\215}\215\215\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\215}\215\215\215}\215\215!", "!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\215}\215\215\215}\215\215!");
    }

    @Test
    public void test12058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12058");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!!" + "'", str2, "\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!!");
    }

    @Test
    public void test12059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12059");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u016c\u016e\u016b\u016b\u016c\u016e\u016b\u016b\u016c\u016e\u016b\u016b\u0346\u0348\u0348!", "U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test12060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12060");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!nullnull!!nullnull!!nullnull!!nullnullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnullnull!!nullnullnullnullnull!!nullnull!", "\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245\250\245\246\246\250\245\246\246\245\245!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\245\246\246\246\245\246\246\246!!\245\246\246\246\245\246\246\246!!\245\246\246\246\245\246\246\246!!\245\246\246\246\245\246\246\246!!\245\246\246\246\245\246\246\246\245\246\246\246!!\245\246\246\246\245\246\246\246\245\246\246\246\245\246\246\246\245\246\246\246!!\245\246\246\246\245\246\246\246\245\246\246\246\245\246\246\246\245\246\246\246!!\245\246\246\246\245\246\246\246\245\246\246\246\245\246\246\246\245\246\246\246!!\245\246\246\246\245\246\246\246\245\246\246\246\245\246\246\246!!\245\246\246\246\245\246\246\246!!\245\246\246\246\245\246\246\246!!\245\246\246\246\245\246\246\246!!\245\246\246\246\245\246\246\246\245\246\246\246!!\245\246\246\246\245\246\246\246\245\246\246\246\245\246\246\246\245\246\246\246!!\245\246\246\246\245\246\246\246!" + "'", str2, "\245\246\246\246\245\246\246\246!!\245\246\246\246\245\246\246\246!!\245\246\246\246\245\246\246\246!!\245\246\246\246\245\246\246\246!!\245\246\246\246\245\246\246\246\245\246\246\246!!\245\246\246\246\245\246\246\246\245\246\246\246\245\246\246\246\245\246\246\246!!\245\246\246\246\245\246\246\246\245\246\246\246\245\246\246\246\245\246\246\246!!\245\246\246\246\245\246\246\246\245\246\246\246\245\246\246\246\245\246\246\246!!\245\246\246\246\245\246\246\246\245\246\246\246\245\246\246\246!!\245\246\246\246\245\246\246\246!!\245\246\246\246\245\246\246\246!!\245\246\246\246\245\246\246\246!!\245\246\246\246\245\246\246\246\245\246\246\246!!\245\246\246\246\245\246\246\246\245\246\246\246\245\246\246\246\245\246\246\246!!\245\246\246\246\245\246\246\246!");
    }

    @Test
    public void test12061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12061");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\253\256\256\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271\266L!!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test12062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12062");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]!", "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]!" + "'", str2, "]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]!");
    }

    @Test
    public void test12063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12063");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!!", "\215}\215\215\215}\215\215ULLLULLLULLLULLL\215}\215\215\215}\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "llllllll!!llllllll!!llllllll!!llllllll!!llllllll!!llllllll!!llllllll!!llllllll!!!" + "'", str2, "llllllll!!llllllll!!llllllll!!llllllll!!llllllll!!llllllll!!llllllll!!llllllll!!!");
    }

    @Test
    public void test12064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12064");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ZZZZZZZZ\255\256\260\260\255\256\260\260ZZZZZZZZ\255\256\260\260\255\256\260\260ZZZZZZZZ\255\256\260\260\255\256\260\260ZZZZZZZZ\255\256\260\260\255\256\260\260ZZZZZZZZ\255\256\260\260\255\256\260\260ZZZZZZZZ\255\256\260\260\255\256\260\260ZZZZZZZZ\255\256\260\260\255\256\260\260ZZZZZZZZ\255\256\260\260\255\256\260\260!", "\253\253\256\256\253\253\256\256\253\253\256\256\253\253\256\256\253\253\256\256\253\253\256\256\253\253\256\256\253\253\256\256!!\253\253\256\256\253\253\256\256\253\253\256\256\253\253\256\256\253\253\256\256\253\253\256\256\253\253\256\256\253\253\256\256!!\253\253\256\256\253\253\256\256\253\253\256\256\253\253\256\256\253\253\256\256\253\253\256\256\253\253\256\256\253\253\256\256\253\253\256\256\253\253\256\256\253\253\256\256\253\253\256\256\253\253\256\256\253\253\256\256\253\253\256\256\253\253\256\256!!\253\253\256\256\253\253\256\256\253\253\256\256\253\253\256\256\253\253\256\256\253\253\256\256\253\253\256\256\253\253\256\256!!\253\253\256\256\253\253\256\256\253\253\256\256\253\253\256\256\253\253\256\256\253\253\256\256\253\253\256\256\253\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\253\253\253\253\253\253\253\255\256\260\260\255\256\260\260\253\253\253\253\253\253\253\253\255\256\260\260\255\256\260\260\253\253\253\253\253\253\253\253\255\256\260\260\255\256\260\260\253\253\253\253\253\253\253\253\255\256\260\260\255\256\260\260\253\253\253\253\253\253\253\253\255\256\260\260\255\256\260\260\253\253\253\253\253\253\253\253\255\256\260\260\255\256\260\260\253\253\253\253\253\253\253\253\255\256\260\260\255\256\260\260\253\253\253\253\253\253\253\253\255\256\260\260\255\256\260\260!" + "'", str2, "\253\253\253\253\253\253\253\253\255\256\260\260\255\256\260\260\253\253\253\253\253\253\253\253\255\256\260\260\255\256\260\260\253\253\253\253\253\253\253\253\255\256\260\260\255\256\260\260\253\253\253\253\253\253\253\253\255\256\260\260\255\256\260\260\253\253\253\253\253\253\253\253\255\256\260\260\255\256\260\260\253\253\253\253\253\253\253\253\255\256\260\260\255\256\260\260\253\253\253\253\253\253\253\253\255\256\260\260\255\256\260\260\253\253\253\253\253\253\253\253\255\256\260\260\255\256\260\260!");
    }

    @Test
    public void test12065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12065");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLUU\256LLUULLUULLUU!", "\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\256nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull\256nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12066");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120!", "\275!NNN!NNN!NNN\276!NNN\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!nn\276!nnnullnull\276!nn\276!nnnullnull\276!nn\276!nnnullnull\276!nn\276!nnnullnull\276!nn\276!nnnullnull!" + "'", str2, "\276!nn\276!nnnullnull\276!nn\276!nnnullnull\276!nn\276!nnnullnull\276!nn\276!nnnullnull\276!nn\276!nnnullnull!");
    }

    @Test
    public void test12067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12067");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\254\256\256\366\367\371\371\366\367\371\371\366\367\371\371\366\367\371\371\253\254\256\256\366\367\371\371\366\367\371\371!", "EEEEEEEE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256null\367nullnullnull\367nullnullnull\367nullnullnull\367nullnull\253\254\256\256null\367nullnullnull\367nullnull!" + "'", str2, "\253\254\256\256null\367nullnullnull\367nullnullnull\367nullnullnull\367nullnull\253\254\256\256null\367nullnullnull\367nullnull!");
    }

    @Test
    public void test12068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12068");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\220xx\200}}`null\220xx]]!", "\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0200\u0200\220nullnull\200\u0200\u0200\220nullnull]]!" + "'", str2, "\u0200\u0200\220nullnull\200\u0200\u0200\220nullnull]]!");
    }

    @Test
    public void test12069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12069");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!]]!!]]N!!!N!!!!!]]!!]]N!!!N!!!!", "\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!]]!!]]null!!!null!!!!!]]!!]]null!!!null!!!!" + "'", str2, "!!]]!!]]null!!!null!!!!!]]!!]]null!!!null!!!!");
    }

    @Test
    public void test12070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12070");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!LIJJLIJJ!!LIJJLIJJ!!LIJJLIJJ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LIJJLIJJ!!LIJJLIJJ!!LIJJLIJJ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test12071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12071");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}`!!!`!!!`!!!~}}^}`!!!`!!!`!!!]]!", "LL!!LLLLLLLLLLLLLL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LLLLLLLLLLLLLL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}`!!!`!!!`!!!~}}^}`!!!`!!!`!!!]]!" + "'", str2, "}`!!!`!!!`!!!~}}^}`!!!`!!!`!!!]]!");
    }

    @Test
    public void test12072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12072");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`R!RRRRRR!RRRRRR!RRRRR`R!RRRRRR!RRRRRR!RRRRR!", "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`null!nullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnull`null!nullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnull!" + "'", str2, "`null!nullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnull`null!nullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnull!");
    }

    @Test
    public void test12073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12073");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\275\u0137\u0136\u0136\u0137\u0136\u0136\275\275\u0137\u0136\u0136\u0137\u0136\u0136\275\275\u0137\u0136\u0136\u0137\u0136\u0136\275\275\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\275\u0137\u0136\u0136\u0137\u0136\u0136\275\275!", "nullnullnullnullUNLLUNLLUNLLUNLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nulluullnullnullnulluullnullnullnulluullnullnull\275nulluullnullnullnulluullnullnullnulluullnullnull\275nulluullnullnullnulluullnullnullnulluullnullnull\275nulluullnullnullnulluullnullnullnulluullnullnullnulluullnullnullnulluullnullnull\275\275nulluullnullnullnulluullnullnull\275\275nulluullnullnullnulluullnullnull\275\275nulluullnullnullnulluullnullnull\275\275\275nulluullnullnullnulluullnullnullnulluullnullnull\275nulluullnullnullnulluullnullnullnulluullnullnull\275nulluullnullnullnulluullnullnullnulluullnullnull\275nulluullnullnullnulluullnullnullnulluullnullnullnulluullnullnullnulluullnullnull\275\275nulluullnullnullnulluullnullnull\275\275!" + "'", str2, "\275nulluullnullnullnulluullnullnullnulluullnullnull\275nulluullnullnullnulluullnullnullnulluullnullnull\275nulluullnullnullnulluullnullnullnulluullnullnull\275nulluullnullnullnulluullnullnullnulluullnullnullnulluullnullnullnulluullnullnull\275\275nulluullnullnullnulluullnullnull\275\275nulluullnullnullnulluullnullnull\275\275nulluullnullnullnulluullnullnull\275\275\275nulluullnullnullnulluullnullnullnulluullnullnull\275nulluullnullnullnulluullnullnullnulluullnullnull\275nulluullnullnullnulluullnullnullnulluullnullnull\275nulluullnullnullnulluullnullnullnulluullnullnullnulluullnullnullnulluullnullnull\275\275nulluullnullnullnulluullnullnull\275\275!");
    }

    @Test
    public void test12074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12074");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\204\241\242\244\244\204\204\204\241\242\244\244\204\204!!\204\241\242\244\244\204\204\204\241\242\244\244\204\204!!\204\241\242\244\244\204\204\204\241\242\244\244\204\204\204\241\242\244\244\204\204\204\241\242\244\244\204\204!!\204\241\242\244\244\204\204\204\241\242\244\244\204\204!!\204\241\242\244\244\204\204\204\241\242\244\244\204\204!", "\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\204\241\242\244\244\204\204\204\241\242\244\244\204\204!!\204\241\242\244\244\204\204\204\241\242\244\244\204\204!!\204\241\242\244\244\204\204\204\241\242\244\244\204\204\204\241\242\244\244\204\204\204\241\242\244\244\204\204!!\204\241\242\244\244\204\204\204\241\242\244\244\204\204!!\204\241\242\244\244\204\204\204\241\242\244\244\204\204!" + "'", str2, "\204\241\242\244\244\204\204\204\241\242\244\244\204\204!!\204\241\242\244\244\204\204\204\241\242\244\244\204\204!!\204\241\242\244\244\204\204\204\241\242\244\244\204\204\204\241\242\244\244\204\204\204\241\242\244\244\204\204!!\204\241\242\244\244\204\204\204\241\242\244\244\204\204!!\204\241\242\244\244\204\204\204\241\242\244\244\204\204!");
    }

    @Test
    public void test12075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12075");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260!", "\335LLL\335nullLL\335nullLL\335nullLL\335nullLL\335LLL\335nullLL\335nullLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260!" + "'", str2, "nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260!");
    }

    @Test
    public void test12076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12076");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~!", "LNNNLNNNLNNNLNNN\276LNNNLNNNLNNNLNNNLNNNLNNNLNNN\276\276LNNNLNNNLNNNLNNNLNNN\276\276LNNNLNNNLNNNLNNNLNNN\276\276LNNNLNNNLNNNLNNNLNNN\276\276LNNNLNNNLNNNLNNN\276LNNNLNNNLNNNLNNNLNNNLNNNLNNN\276\276LNNNLNNNLNNNLNNNLNNN\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~!" + "'", str2, "\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~!");
    }

    @Test
    public void test12077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12077");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214!", "\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228\u0226\u0228\u0228\u0228!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0226\u0228\u0226\u0226\u0226\u0228\u0226\u0226\u0228\u0226\u0228\u0228\u0226\214\214\u0228\u0226\u0228\u0228\u0226\214\214\u0226\u0228\u0226\u0226\u0226\u0228\u0226\u0226\u0228\u0226\u0228\u0228\u0226\214\214\u0228\u0226\u0228\u0228\u0226\214\214\u0226\u0228\u0226\u0226\u0226\u0228\u0226\u0226\u0228\u0226\u0228\u0228\u0226\214\214\u0228\u0226\u0228\u0228\u0226\214\214\u0226\u0228\u0226\u0226\u0226\u0228\u0226\u0226\u0228\u0226\u0228\u0228\u0226\214\214\u0228\u0226\u0228\u0228\u0226\214\214\u0226\u0228\u0226\u0226\u0226\u0228\u0226\u0226\u0228\u0226\u0228\u0228\u0226\214\214\u0228\u0226\u0228\u0228\u0226\214\214\u0226\u0228\u0226\u0226\u0226\u0228\u0226\u0226\u0228\u0226\u0228\u0228\u0226\214\214\u0228\u0226\u0228\u0228\u0226\214\214\u0226\u0228\u0226\u0226\u0226\u0228\u0226\u0226\u0228\u0226\u0228\u0228\u0226\214\214\u0228\u0226\u0228\u0228\u0226\214\214\u0226\u0228\u0226\u0226\u0226\u0228\u0226\u0226\u0228\u0226\u0228\u0228\u0226\214\214\u0228\u0226\u0228\u0228\u0226\214\214!" + "'", str2, "\u0226\u0228\u0226\u0226\u0226\u0228\u0226\u0226\u0228\u0226\u0228\u0228\u0226\214\214\u0228\u0226\u0228\u0228\u0226\214\214\u0226\u0228\u0226\u0226\u0226\u0228\u0226\u0226\u0228\u0226\u0228\u0228\u0226\214\214\u0228\u0226\u0228\u0228\u0226\214\214\u0226\u0228\u0226\u0226\u0226\u0228\u0226\u0226\u0228\u0226\u0228\u0228\u0226\214\214\u0228\u0226\u0228\u0228\u0226\214\214\u0226\u0228\u0226\u0226\u0226\u0228\u0226\u0226\u0228\u0226\u0228\u0228\u0226\214\214\u0228\u0226\u0228\u0228\u0226\214\214\u0226\u0228\u0226\u0226\u0226\u0228\u0226\u0226\u0228\u0226\u0228\u0228\u0226\214\214\u0228\u0226\u0228\u0228\u0226\214\214\u0226\u0228\u0226\u0226\u0226\u0228\u0226\u0226\u0228\u0226\u0228\u0228\u0226\214\214\u0228\u0226\u0228\u0228\u0226\214\214\u0226\u0228\u0226\u0226\u0226\u0228\u0226\u0226\u0228\u0226\u0228\u0228\u0226\214\214\u0228\u0226\u0228\u0228\u0226\214\214\u0226\u0228\u0226\u0226\u0226\u0228\u0226\u0226\u0228\u0226\u0228\u0228\u0226\214\214\u0228\u0226\u0228\u0228\u0226\214\214!");
    }

    @Test
    public void test12078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12078");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u017d~\200\200\u017d~\200\200\u017d\200\200\u017d\200\200\u017d~\200\200\u017d~\200\200\u017d\200\200\u017d\200\200\u017d~\200\200\u017d~\200\200\u017d\200\200\u017d\200\200\u017d~\200\200\u017d~\200\200\u017d\200\200\u017d\200\200\u017d~\200\200\u017d~\200\200\u017d\200\200\u017d\200\200\u017d~\200\200\u017d~\200\200\u017d\200\200\u017d\200\200\u017d~\200\200\u017d~\200\200\u017d\200\200\u017d\200\200\u017d~\200\200\u017d~\200\200\u017d\200\200\u017d\200\200!", "!!!!\220!!!!!!!!\200~~!!!!\220!!!!!!!!\200~~!!!!\220!!!!!!!!!!!!\220!!!!!!!!!!!!\220!!!!!!!!\200~~!!!!\220!!!!!!!!\200~~!!!!\220!!!!!!!!!!!!\220!!!!!!!!!!!!!!\220!!!!!!!!\200~~!!!!\220!!!!!!!!\200~~!!!!\220!!!!!!!!!!!!\220!!!!!!!!!!!!\220!!!!!!!!\200~~!!!!\220!!!!!!!!\200~~!!!!\220!!!!!!!!!!!!\220!!!!!!!!!!!!!!\220!!!!!!!!\200~~!!!!\220!!!!!!!!\200~~!!!!\220!!!!!!!!!!!!\220!!!!!!!!!!!!\220!!!!!!!!\200~~!!!!\220!!!!!!!!\200~~!!!!\220!!!!!!!!!!!!\220!!!!!!!!!!!!\220!!!!!!!!\200~~!!!!\220!!!!!!!!\200~~!!!!\220!!!!!!!!!!!!\220!!!!!!!!!!!!\220!!!!!!!!\200~~!!!!\220!!!!!!!!\200~~!!!!\220!!!!!!!!!!!!\220!!!!!!!!!!!!!!\220!!!!!!!!\200~~!!!!\220!!!!!!!!\200~~!!!!\220!!!!!!!!!!!!\220!!!!!!!!!!!!\220!!!!!!!!\200~~!!!!\220!!!!!!!!\200~~!!!!\220!!!!!!!!!!!!\220!!!!!!!!!!!!!!\220!!!!!!!!\200~~!!!!\220!!!!!!!!\200~~!!!!\220!!!!!!!!!!!!\220!!!!!!!!!!!!\220!!!!!!!!\200~~!!!!\220!!!!!!!!\200~~!!!!\220!!!!!!!!!!!!\220!!!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null~\200\200null~\200\200~null\200\200~null\200\200null~\200\200null~\200\200~null\200\200~null\200\200null~\200\200null~\200\200~null\200\200~null\200\200null~\200\200null~\200\200~null\200\200~null\200\200null~\200\200null~\200\200~null\200\200~null\200\200null~\200\200null~\200\200~null\200\200~null\200\200null~\200\200null~\200\200~null\200\200~null\200\200null~\200\200null~\200\200~null\200\200~null\200\200!" + "'", str2, "null~\200\200null~\200\200~null\200\200~null\200\200null~\200\200null~\200\200~null\200\200~null\200\200null~\200\200null~\200\200~null\200\200~null\200\200null~\200\200null~\200\200~null\200\200~null\200\200null~\200\200null~\200\200~null\200\200~null\200\200null~\200\200null~\200\200~null\200\200~null\200\200null~\200\200null~\200\200~null\200\200~null\200\200null~\200\200null~\200\200~null\200\200~null\200\200!");
    }

    @Test
    public void test12079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12079");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "UULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLLUULLUULLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12080");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\306\306nullnull\306\306nullnull\306\306nullnull\306\306nullnull\306\306nullnull\306\306nullnull\306\306nullnull\306\306nullnull!", "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256!" + "'", str2, "nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256!");
    }

    @Test
    public void test12081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12081");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!", "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031anullnullnullnullnullnullnullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!" + "'", str2, "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!");
    }

    @Test
    public void test12082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12082");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UU]]UU]]UU]]UU]]~}}^UU]]UU]]UU]]UU]]]]!", "\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!]]!!]]!!]]!!]]~}}^!!]]!!]]!!]]!!]]]]!" + "'", str2, "!!]]!!]]!!]]!!]]~}}^!!]]!!]]!!]]!!]]]]!");
    }

    @Test
    public void test12083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12083");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUUUULLUULLLLUULLUU!", "!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02cc\u02cc\u02cb\u02cb\u02cc\u02cc\u02cb\u02cb\u02cb\u02cb\u02cc\u02cc\u02cb\u02cb\u02cc\u02cc\u02cc\u02cc\u02cb\u02cb\u02cc\u02cc\u02cb\u02cb\u02cb\u02cb\u02cc\u02cc\u02cb\u02cb\u02cc\u02cc\u02cc\u02cc\u02cb\u02cb\u02cc\u02cc\u02cb\u02cb\u02cb\u02cb\u02cc\u02cc\u02cb\u02cb\u02cc\u02cc\u02cc\u02cc\u02cb\u02cb\u02cc\u02cc\u02cb\u02cb\u02cb\u02cb\u02cc\u02cc\u02cb\u02cb\u02cc\u02cc\u02cc\u02cc\u02cb\u02cb\u02cc\u02cc\u02cb\u02cb\u02cb\u02cb\u02cc\u02cc\u02cb\u02cb\u02cc\u02cc\u02cc\u02cc\u02cb\u02cb\u02cc\u02cc\u02cb\u02cb\u02cb\u02cb\u02cc\u02cc\u02cb\u02cb\u02cc\u02cc\u02cc\u02cc\u02cb\u02cb\u02cc\u02cc\u02cb\u02cb\u02cb\u02cb\u02cc\u02cc\u02cb\u02cb\u02cc\u02cc\u02cc\u02cc\u02cb\u02cb\u02cc\u02cc\u02cb\u02cb\u02cb\u02cb\u02cc\u02cc\u02cb\u02cb\u02cc\u02cc!" + "'", str2, "\u02cc\u02cc\u02cb\u02cb\u02cc\u02cc\u02cb\u02cb\u02cb\u02cb\u02cc\u02cc\u02cb\u02cb\u02cc\u02cc\u02cc\u02cc\u02cb\u02cb\u02cc\u02cc\u02cb\u02cb\u02cb\u02cb\u02cc\u02cc\u02cb\u02cb\u02cc\u02cc\u02cc\u02cc\u02cb\u02cb\u02cc\u02cc\u02cb\u02cb\u02cb\u02cb\u02cc\u02cc\u02cb\u02cb\u02cc\u02cc\u02cc\u02cc\u02cb\u02cb\u02cc\u02cc\u02cb\u02cb\u02cb\u02cb\u02cc\u02cc\u02cb\u02cb\u02cc\u02cc\u02cc\u02cc\u02cb\u02cb\u02cc\u02cc\u02cb\u02cb\u02cb\u02cb\u02cc\u02cc\u02cb\u02cb\u02cc\u02cc\u02cc\u02cc\u02cb\u02cb\u02cc\u02cc\u02cb\u02cb\u02cb\u02cb\u02cc\u02cc\u02cb\u02cb\u02cc\u02cc\u02cc\u02cc\u02cb\u02cb\u02cc\u02cc\u02cb\u02cb\u02cb\u02cb\u02cc\u02cc\u02cb\u02cb\u02cc\u02cc\u02cc\u02cc\u02cb\u02cb\u02cc\u02cc\u02cb\u02cb\u02cb\u02cb\u02cc\u02cc\u02cb\u02cb\u02cc\u02cc!");
    }

    @Test
    public void test12084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12084");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````\200}}`````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````]]!", "U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU\216\225\230\230\216\225\230\230U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU\216\225\230\230\216\225\230\230!!U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU\216\225\230\230\216\225\230\230U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU\216\225\230\230\216\225\230\230!!U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU\216\225\230\230\216\225\230\230U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU\216\225\230\230\216\225\230\230U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU\216\225\230\230\216\225\230\230U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU\216\225\230\230\216\225\230\230!!U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU\216\225\230\230\216\225\230\230U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU\216\225\230\230\216\225\230\230!!U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU\216\225\230\230\216\225\230\230U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU\216\225\230\230\216\225\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````\200}}`````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````]]!" + "'", str2, "````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````\200}}`````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````]]!");
    }

    @Test
    public void test12085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12085");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!L!LLL!LLL!LLL!LL!!!L!LLL!LLL!LLL!LL!!!!!L!LLL!LLL!LLL!LL!!!L!LLL!LLL!LLL!LL!!!!!L!LLL!LLL!LLL!LL!!!L!LLL!LLL!LLL!LL!!!!!L!LLL!LLL!LLL!LL!!!L!LLL!LLL!LLL!LL!!!!!L!LLL!LLL!LLL!LL!!!L!LLL!LLL!LLL!LL!!!!!L!LLL!LLL!LLL!LL!!!L!LLL!LLL!LLL!LL!!!!!L!LLL!LLL!LLL!LL!!!L!LLL!LLL!LLL!LL!!!!!L!LLL!LLL!LLL!LL!!!L!LLL!LLL!LLL!LL!!!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!!!" + "'", str2, "!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!!!!");
    }

    @Test
    public void test12086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12086");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test12087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12087");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0240\u0240!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!" + "'", str2, "nullnull!");
    }

    @Test
    public void test12088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12088");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0276\u0276\u0276\u0276\u0276\u0276\u0276\u0276\u0276\u0276\u0276\u0276\u0276\u0276\u0276\u0276\u0276\u0276\u0276\u0276\u0276\u0276\u0276\u0276\u0276\u0276\u0276\u0276\u0276\u0276\u0276\u0276LLLLL!!!", "nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullUUUnullUUUUUnullUUUnullUUUUU!!nullUUUnullUUUUUnullUUUnullUUUUU!!nullUUUnullUUUUUnullUUUnullUUUUU!!nullUUUnullUUUUUnullUUUnullUUUUU!!nullUUUnullUUUUUnullUUUnullUUUUU!!nullUUUnullUUUUUnullUUUnullUUUUU!!nullUUUnullUUUUUnullUUUnullUUUUU!!nullUUUnullUUUUUnullUUUnullUUUUU!!!" + "'", str2, "nullUUUnullUUUUUnullUUUnullUUUUU!!nullUUUnullUUUUUnullUUUnullUUUUU!!nullUUUnullUUUUUnullUUUnullUUUUU!!nullUUUnullUUUUUnullUUUnullUUUUU!!nullUUUnullUUUUUnullUUUnullUUUUU!!nullUUUnullUUUUUnullUUUnullUUUUU!!nullUUUnullUUUUUnullUUUnullUUUUU!!nullUUUnullUUUUUnullUUUnullUUUUU!!!");
    }

    @Test
    public void test12089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12089");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254!!]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254!!]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254!!]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254!!]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254!!]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254!!]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254!!]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254!!!", "\u0348l!!\200\u0348l!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!]]]!]]]!]]]!]]]!]]]!]]!!]!]]]!]]!!]!]]]!]]!!\256\254\254]!]]]!]]]!]]]!]]]!]]]!]]!!]!]]]!]]!!]!]]]!]]!!\256\254\254!!]!]]]!]]]!]]]!]]]!]]]!]]!!]!]]]!]]!!]!]]]!]]!!\256\254\254]!]]]!]]]!]]]!]]]!]]]!]]!!]!]]]!]]!!]!]]]!]]!!\256\254\254!!]!]]]!]]]!]]]!]]]!]]]!]]!!]!]]]!]]!!]!]]]!]]!!\256\254\254]!]]]!]]]!]]]!]]]!]]]!]]!!]!]]]!]]!!]!]]]!]]!!\256\254\254!!]!]]]!]]]!]]]!]]]!]]]!]]!!]!]]]!]]!!]!]]]!]]!!\256\254\254]!]]]!]]]!]]]!]]]!]]]!]]!!]!]]]!]]!!]!]]]!]]!!\256\254\254!!]!]]]!]]]!]]]!]]]!]]]!]]!!]!]]]!]]!!]!]]]!]]!!\256\254\254]!]]]!]]]!]]]!]]]!]]]!]]!!]!]]]!]]!!]!]]]!]]!!\256\254\254!!]!]]]!]]]!]]]!]]]!]]]!]]!!]!]]]!]]!!]!]]]!]]!!\256\254\254]!]]]!]]]!]]]!]]]!]]]!]]!!]!]]]!]]!!]!]]]!]]!!\256\254\254!!]!]]]!]]]!]]]!]]]!]]]!]]!!]!]]]!]]!!]!]]]!]]!!\256\254\254]!]]]!]]]!]]]!]]]!]]]!]]!!]!]]]!]]!!]!]]]!]]!!\256\254\254!!]!]]]!]]]!]]]!]]]!]]]!]]!!]!]]]!]]!!]!]]]!]]!!\256\254\254]!]]]!]]]!]]]!]]]!]]]!]]!!]!]]]!]]!!]!]]]!]]!!\256\254\254!!!" + "'", str2, "]!]]]!]]]!]]]!]]]!]]]!]]!!]!]]]!]]!!]!]]]!]]!!\256\254\254]!]]]!]]]!]]]!]]]!]]]!]]!!]!]]]!]]!!]!]]]!]]!!\256\254\254!!]!]]]!]]]!]]]!]]]!]]]!]]!!]!]]]!]]!!]!]]]!]]!!\256\254\254]!]]]!]]]!]]]!]]]!]]]!]]!!]!]]]!]]!!]!]]]!]]!!\256\254\254!!]!]]]!]]]!]]]!]]]!]]]!]]!!]!]]]!]]!!]!]]]!]]!!\256\254\254]!]]]!]]]!]]]!]]]!]]]!]]!!]!]]]!]]!!]!]]]!]]!!\256\254\254!!]!]]]!]]]!]]]!]]]!]]]!]]!!]!]]]!]]!!]!]]]!]]!!\256\254\254]!]]]!]]]!]]]!]]]!]]]!]]!!]!]]]!]]!!]!]]]!]]!!\256\254\254!!]!]]]!]]]!]]]!]]]!]]]!]]!!]!]]]!]]!!]!]]]!]]!!\256\254\254]!]]]!]]]!]]]!]]]!]]]!]]!!]!]]]!]]!!]!]]]!]]!!\256\254\254!!]!]]]!]]]!]]]!]]]!]]]!]]!!]!]]]!]]!!]!]]]!]]!!\256\254\254]!]]]!]]]!]]]!]]]!]]]!]]!!]!]]]!]]!!]!]]]!]]!!\256\254\254!!]!]]]!]]]!]]]!]]]!]]]!]]!!]!]]]!]]!!]!]]]!]]!!\256\254\254]!]]]!]]]!]]]!]]]!]]]!]]!!]!]]]!]]!!]!]]]!]]!!\256\254\254!!]!]]]!]]]!]]]!]]]!]]]!]]!!]!]]]!]]!!]!]]]!]]!!\256\254\254]!]]]!]]]!]]]!]]]!]]]!]]!!]!]]]!]]!!]!]]]!]]!!\256\254\254!!!");
    }

    @Test
    public void test12090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12090");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275``uuuuuuuu``uuuuuuuu``uuuuuuuu\276``uuuuuuuu\275\275!", "LNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull\276``nullnullnullnullnullnullnullnull\275\275!" + "'", str2, "\275``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull\276``nullnullnullnullnullnullnullnull\275\275!");
    }

    @Test
    public void test12091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12091");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0260\u0260\u025e\u025e\u0260\u0260\u025e\u025e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e!", "LL~~~~~LL~~~~~~~LL~~~~~LL~~~~~~~LL~~~~~LL~~~~~~~LL~~~~~LL~~~~~~~LL~~~~~LL~~~~~~~LL~~~~~LL~~~~~~~LL~~~~~LL~~~~~~~LL~~~~~LL~~~~~~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12092");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\200}}`NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!" + "'", str2, "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!");
    }

    @Test
    public void test12093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12093");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\200}}`\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300]]!", "\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test12094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12094");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("````````````````\200}}`````````````````]]!", "~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````\200}}`````````````````]]!" + "'", str2, "````````````````\200}}`````````````````]]!");
    }

    @Test
    public void test12095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12095");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN!!``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN!!``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN!!``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN!!``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN!", "\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~!!``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~!!``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~!!``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~!!``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~!" + "'", str2, "``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~!!``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~!!``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~!!``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~!!``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~``~~!");
    }

    @Test
    public void test12096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12096");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\336\335\340\340\336\335\340\340!", "NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12097");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!L!LLL!LL!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!null!nullnullnull!nullnull!" + "'", str2, "!!!null!nullnullnull!nullnull!");
    }

    @Test
    public void test12098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12098");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LUUULUUULUUULUUU\200}}`LUUULUUULUUULUUU]]!", "L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!!L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!!L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!!L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!!L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^LLL^LLL^LLL^LLL\200}}`^LLL^LLL^LLL^LLL]]!" + "'", str2, "^LLL^LLL^LLL^LLL\200}}`^LLL^LLL^LLL^LLL]]!");
    }

    @Test
    public void test12099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12099");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("T!!!T!!!T!!!T!!!T!!!T!!!T!!!T!!!!", "hh!!hh!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!" + "'", str2, "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
    }

    @Test
    public void test12100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12100");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c!!!", "FH!!FH!!FH!!FH!!FH!!FH!!FH!!FH!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test12101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12101");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NULLNULL!", "\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~!\200\200~!\200\200!" + "'", str2, "~!\200\200~!\200\200!");
    }

    @Test
    public void test12102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12102");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnullnullnullnullnull!", "L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL!" + "'", str2, "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL!");
    }

    @Test
    public void test12103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12103");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce!", "!\253\256\256]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12104");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("L!LULLLULLL!LULLLULLL!LULLLULLL!LULLLULLL!LULLLULLL!LULLLULLL!LULLLULLL!LULLLULL!", "\215}\215\215\215}\215\215\u014e\u014e\u014e\u014e!!!\215}\215\215\215}\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!" + "'", str2, "null!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12105");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u01a0\u01a0\u01a0\u01a0\u0346\u0348\u0348!", "\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~null\275!!null\275!!null\275!!null\275!!null\275!!null\275!!null\275!!null\275!!\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~null\275!!null\275!!null\275!!null\275!!null\275!!null\275!!null\275!!null\275!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test12106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12106");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!", "null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239!" + "'", str2, "\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239!");
    }

    @Test
    public void test12107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12107");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\270NN!!\270\270\270NN!!\270\270!!\270NN!!\270\270\270NN!!\270\270!!\270NN!!\270\270\270NN!!\270\270!!\270NN!!\270\270\270NN!!\270\270!!\270NN!!\270\270\270NN!!\270\270!!\270NN!!\270\270\270NN!!\270\270!!\270NN!!\270\270\270NN!!\270\270!!\270NN!!\270\270\270NN!!\270\270!!!", "UULLUULL!!UULLUULL!!UULLUULLUULLUULL!!UULLUULL!!UULLUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\270nullnull!!\270\270\270nullnull!!\270\270!!\270nullnull!!\270\270\270nullnull!!\270\270!!\270nullnull!!\270\270\270nullnull!!\270\270!!\270nullnull!!\270\270\270nullnull!!\270\270!!\270nullnull!!\270\270\270nullnull!!\270\270!!\270nullnull!!\270\270\270nullnull!!\270\270!!\270nullnull!!\270\270\270nullnull!!\270\270!!\270nullnull!!\270\270\270nullnull!!\270\270!!!" + "'", str2, "\270nullnull!!\270\270\270nullnull!!\270\270!!\270nullnull!!\270\270\270nullnull!!\270\270!!\270nullnull!!\270\270\270nullnull!!\270\270!!\270nullnull!!\270\270\270nullnull!!\270\270!!\270nullnull!!\270\270\270nullnull!!\270\270!!\270nullnull!!\270\270\270nullnull!!\270\270!!\270nullnull!!\270\270\270nullnull!!\270\270!!\270nullnull!!\270\270\270nullnull!!\270\270!!!");
    }

    @Test
    public void test12108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12108");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!", "\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!" + "'", str2, "!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!");
    }

    @Test
    public void test12109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12109");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("fehhfehhfehhfehhfehhfehhfehhfehh!", "H\200\200\200H\200\200\200]]H\200\200\200H\200\200\200]]H\200\200\200H\200\200\200]]H\200\200\200H\200\200\200]]~}}^H\200\200\200H\200\200\200]]H\200\200\200H\200\200\200]]H\200\200\200H\200\200\200]]H\200\200\200H\200\200\200]]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200]]\200\200]]\200\200]]\200\200]]\200\200]]\200\200]]\200\200]]\200\200]]!" + "'", str2, "\200\200]]\200\200]]\200\200]]\200\200]]\200\200]]\200\200]]\200\200]]\200\200]]!");
    }

    @Test
    public void test12110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12110");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("U!UUU!UUUUU!UUU!UUUUU!UUU!UUUUU!UUU!UUUUU!UUU!UUUUU!UUU!UUUUU!UUU!UUUUU!UUU!UUUU!", "!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!!!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!!!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!!!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!!!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!UUU!UUUUU!UUU!UUUUU!UUU!UUUUU!UUU!UUUUU!UUU!UUUUU!UUU!UUUUU!UUU!UUUUU!UUU!UUUU!" + "'", str2, "U!UUU!UUUUU!UUU!UUUUU!UUU!UUUUU!UUU!UUUUU!UUU!UUUUU!UUU!UUUUU!UUU!UUUUU!UUU!UUUU!");
    }

    @Test
    public void test12111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12111");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!NNNNNNNN!!NNNNNNNN!!!!NNNNNNNN!!NNNNNNNN!!!!NNNNNNNN!!NNNNNNNN!!!!NNNNNNNN!!NNNNNNNN!!!!NNNNNNNN!!NNNNNNNN!!!!NNNNNNNN!!NNNNNNNN!!!!NNNNNNNN!!NNNNNNNN!!!!NNNNNNNN!!NNNNNNNN!", "\275\275LL\275\275LLL\275LLL\214\214L\275LLL\214\214\275\275LL\275\275LLL\275LLL\214\214L\275LLL\214\214\275\275LL\275\275LLL\275LLL\214\214L\275LLL\214\214\275\275LL\275\275LLL\275LLL\214\214L\275LLL\214\214\275\275LL\275\275LLL\275LLL\214\214L\275LLL\214\214\275\275LL\275\275LLL\275LLL\214\214L\275LLL\214\214\275\275LL\275\275LLL\275LLL\214\214L\275LLL\214\214\275\275LL\275\275LLL\275LLL\214\214L\275LLL\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214!!!!\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214!!!!\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214!!!!\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214!!!!\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214!!!!\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214!!!!\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214!!!!\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214!" + "'", str2, "!!!!\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214!!!!\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214!!!!\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214!!!!\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214!!!!\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214!!!!\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214!!!!\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214!!!!\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214!");
    }

    @Test
    public void test12112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12112");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NULLLNUULNUULNUULNUUNULLLNUULNUU!", "!!!!\231\231\231\231\231\231\231\231!!\231\231\231\231\231\231\231\231!!\231\231\231\231\231\231\231\231!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\231\231\231\231\231\231\231\231!!\231\231\231\231\231\231\231\231!!\231\231\231\231\231\231\231\231!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\231\231\231\231!\231\231\231!\231\231\231!\231\231\231!\231\231!\231\231\231\231!\231\231\231!\231\231!" + "'", str2, "!\231\231\231\231!\231\231\231!\231\231\231!\231\231\231!\231\231!\231\231\231\231!\231\231\231!\231\231!");
    }

    @Test
    public void test12113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12113");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`\253```\253\u035e\u035e`\253```\253\u035e\u035e!!!!`\253```\253\u035e\u035e`\253```\253\u035e\u035e!", "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`\253```\253\u035e\u035e`\253```\253\u035e\u035e!!!!`\253```\253\u035e\u035e`\253```\253\u035e\u035e!" + "'", str2, "`\253```\253\u035e\u035e`\253```\253\u035e\u035e!!!!`\253```\253\u035e\u035e`\253```\253\u035e\u035e!");
    }

    @Test
    public void test12114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12114");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\367!\372\372\367!\372\372!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test12115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12115");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!!", "null\220nullnull\200}}`null\220nullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!!!" + "'", str2, "[[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!!!");
    }

    @Test
    public void test12116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12116");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!", "``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!`!```!```!```!``!!!`!```!```!```!``!!!!!`!```!```!```!``!!!`!```!```!```!``!!!!!`!```!```!```!``!!!`!```!```!```!``!!!!!`!```!```!```!``!!!`!```!```!```!``!!!!!`!```!```!```!``!!!`!```!```!```!``!!!!!`!```!```!```!``!!!`!```!```!```!``!!!!!`!```!```!```!``!!!`!```!```!```!``!!!!!`!```!```!```!``!!!`!```!```!```!``!!!!!" + "'", str2, "!`!```!```!```!``!!!`!```!```!```!``!!!!!`!```!```!```!``!!!`!```!```!```!``!!!!!`!```!```!```!``!!!`!```!```!```!``!!!!!`!```!```!```!``!!!`!```!```!```!``!!!!!`!```!```!```!``!!!`!```!```!```!``!!!!!`!```!```!```!``!!!`!```!```!```!``!!!!!`!```!```!```!``!!!`!```!```!```!``!!!!!`!```!```!```!``!!!`!```!```!```!``!!!!!");
    }

    @Test
    public void test12117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12117");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!", "\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\216!!!\216!!!\216!!!\216!!!\216!!!\216!!!\216!!!\216!!!" + "'", str2, "!\216!!!\216!!!\216!!!\216!!!\216!!!\216!!!\216!!!\216!!!");
    }

    @Test
    public void test12118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12118");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!", "\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216WW\200\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216WW]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test12119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12119");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!\276\276!", "\u0248\u0246\u0246\u0248\u0246\u0246\u0248\u0246\u0246\u0248\u0246\u0246nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!\276\276!" + "'", str2, "!!!\276\276!");
    }

    @Test
    public void test12120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12120");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!", "\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!" + "'", str2, "!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!");
    }

    @Test
    public void test12121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12121");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!!", "LN!!!!!!LN!!!!!LN!!!!!LN!!!!!!LN!!!!!LN!!!!!LN!!!!!!LN!!!!!LN!!!!!LN!!!!!!LN!!!!!LN!!!!!\200}}`LN!!!!!!LN!!!!!LN!!!!!LN!!!!!!LN!!!!!LN!!!!!LN!!!!!!LN!!!!!LN!!!!!LN!!!!!!LN!!!!!LN!!!!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test12122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12122");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ijllnullnullnullijllnullnullnullijllnullnullnullijllnullnullnullijllnullnullnullijllnullnullnullijllnullnullnullijllnullnullnull!", "\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014e\u014e\u014e\u014c\u014e\u014c\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014c\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014c\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014c\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014c\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014c\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014c\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014c\u014e\u014c~~!" + "'", str2, "\u014e\u014e\u014e\u014c\u014e\u014c\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014c\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014c\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014c\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014c\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014c\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014c\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014c\u014e\u014c~~!");
    }

    @Test
    public void test12123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12123");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!", "\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!" + "'", str2, "]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!");
    }

    @Test
    public void test12124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12124");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!\200\200null!\200\200null!\200\200null!\200\200!!!null!\200\200null!\200\200null!\200\200null!\200\200!!!!!null!\200\200null!\200\200null!\200\200null!\200\200!!!null!\200\200null!\200\200null!\200\200null!\200\200!!!!!null!\200\200null!\200\200null!\200\200null!\200\200!!!null!\200\200null!\200\200null!\200\200null!\200\200!!!!!null!\200\200null!\200\200null!\200\200null!\200\200!!!null!\200\200null!\200\200null!\200\200null!\200\200!!!!!null!\200\200null!\200\200null!\200\200null!\200\200!!!null!\200\200null!\200\200null!\200\200null!\200\200!!!!!null!\200\200null!\200\200null!\200\200null!\200\200!!!null!\200\200null!\200\200null!\200\200null!\200\200!!!!!null!\200\200null!\200\200null!\200\200null!\200\200!!!null!\200\200null!\200\200null!\200\200null!\200\200!!!!!null!\200\200null!\200\200null!\200\200null!\200\200!!!null!\200\200null!\200\200null!\200\200null!\200\200!!!!!" + "'", str2, "!null!\200\200null!\200\200null!\200\200null!\200\200!!!null!\200\200null!\200\200null!\200\200null!\200\200!!!!!null!\200\200null!\200\200null!\200\200null!\200\200!!!null!\200\200null!\200\200null!\200\200null!\200\200!!!!!null!\200\200null!\200\200null!\200\200null!\200\200!!!null!\200\200null!\200\200null!\200\200null!\200\200!!!!!null!\200\200null!\200\200null!\200\200null!\200\200!!!null!\200\200null!\200\200null!\200\200null!\200\200!!!!!null!\200\200null!\200\200null!\200\200null!\200\200!!!null!\200\200null!\200\200null!\200\200null!\200\200!!!!!null!\200\200null!\200\200null!\200\200null!\200\200!!!null!\200\200null!\200\200null!\200\200null!\200\200!!!!!null!\200\200null!\200\200null!\200\200null!\200\200!!!null!\200\200null!\200\200null!\200\200null!\200\200!!!!!null!\200\200null!\200\200null!\200\200null!\200\200!!!null!\200\200null!\200\200null!\200\200null!\200\200!!!!!");
    }

    @Test
    public void test12125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12125");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!", "nullnullnullnullnullnullnullnull\216\225\230\230\216\225\230\230nullnullnullnullnullnullnullnull\216\225\230\230\216\225\230\230!!nullnullnullnullnullnullnullnull\216\225\230\230\216\225\230\230nullnullnullnullnullnullnullnull\216\225\230\230\216\225\230\230!!nullnullnullnullnullnullnullnull\216\225\230\230\216\225\230\230nullnullnullnullnullnullnullnull\216\225\230\230\216\225\230\230nullnullnullnullnullnullnullnull\216\225\230\230\216\225\230\230nullnullnullnullnullnullnullnull\216\225\230\230\216\225\230\230!!nullnullnullnullnullnullnullnull\216\225\230\230\216\225\230\230nullnullnullnullnullnullnullnull\216\225\230\230\216\225\230\230!!nullnullnullnullnullnullnullnull\216\225\230\230\216\225\230\230nullnullnullnullnullnullnullnull\216\225\230\230\216\225\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!" + "'", str2, "!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
    }

    @Test
    public void test12126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12126");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!", "L!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256````````````````````````````````````````````````````````````````\253\254\256\256````````````````````````````````!" + "'", str2, "\253\254\256\256````````````````````````````````````````````````````````````````\253\254\256\256````````````````````````````````!");
    }

    @Test
    public void test12127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12127");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("L~UUL~UU!!L~UUL~UU!!L~UUL~UUL~UUL~UU!!L~UUL~UU!!L~UUL~UU!", "\253\254\256\256N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!\253\254\256\256N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01c0\u01be\u01be\u01c0\u01be\u01be\u01c0\u01be\u01be\u01c0\u01be\u01be\u01c0\u01be\u01be\u01c0\u01be\u01be\u01c0\u01be\u01be\u01c0\u01be\u01be\u01c0\u01be\u01be\u01c0\u01be\u01be\u01c0\u01be\u01be\u01c0\u01be\u01be!" + "'", str2, "\u01c0\u01be\u01be\u01c0\u01be\u01be\u01c0\u01be\u01be\u01c0\u01be\u01be\u01c0\u01be\u01be\u01c0\u01be\u01be\u01c0\u01be\u01be\u01c0\u01be\u01be\u01c0\u01be\u01be\u01c0\u01be\u01be\u01c0\u01be\u01be\u01c0\u01be\u01be!");
    }

    @Test
    public void test12128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12128");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!!", "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!!HH!!HH!!!!HH!!HH!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHH!!!" + "'", str2, "HHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHH!!!");
    }

    @Test
    public void test12129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12129");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!", "\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226!!!" + "'", str2, "\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226!!!");
    }

    @Test
    public void test12130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12130");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u0306\u0308\u0308\u0306\u0308\u0308\u0306\u0308\u0308\u0306\u0308\u0308\u0306\u0308\u0308\u0306\u0308\u0308}~\200\200}~\200\200\u0306\u0308\u0308\u0306\u0308\u0308\u0306\u0308\u0308\u0306\u0308\u0308\u0306\u0308\u0308\u0306\u0308\u0308}~\200\200}~\200\200\u0306\u0308\u0308\u0306\u0308\u0308\u0306\u0308\u0308\u0306\u0308\u0308\u0306\u0308\u0308\u0306\u0308\u0308}~\200\200}~\200\200\u0306\u0308\u0308\u0306\u0308\u0308\u0306\u0308\u0308\u0306\u0308\u0308\u0306\u0308\u0308\u0306\u0308\u0308\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254LLNNLLNNLLNNLLNNLLNN]]LLNNLLNNLLNNLLNNLLNN]]LLNNLLNNLLNNLLNNLLNN]]LLNNLLNNLLNNLLNNLLNN]]LLNNLLNNLLNNLLNNLLNN]]LLNNLLNNLLNNLLNNLLNN]]LLNNLLNNLLNNLLNNLLNN]]LLNNLLNNLLNNLLNNLLNN]]\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254LLNNLLNNLLNNLLNNLLNN]]LLNNLLNNLLNNLLNNLLNN]]LLNNLLNNLLNNLLNNLLNN]]LLNNLLNNLLNNLLNNLLNN]]LLNNLLNNLLNNLLNNLLNN]]LLNNLLNNLLNNLLNNLLNN]]LLNNLLNNLLNNLLNNLLNN]]LLNNLLNNLLNNLLNNLLNN]]!" + "'", str2, "\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254LLNNLLNNLLNNLLNNLLNN]]LLNNLLNNLLNNLLNNLLNN]]LLNNLLNNLLNNLLNNLLNN]]LLNNLLNNLLNNLLNNLLNN]]LLNNLLNNLLNNLLNNLLNN]]LLNNLLNNLLNNLLNNLLNN]]LLNNLLNNLLNNLLNNLLNN]]LLNNLLNNLLNNLLNNLLNN]]\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254LLNNLLNNLLNNLLNNLLNN]]LLNNLLNNLLNNLLNNLLNN]]LLNNLLNNLLNNLLNNLLNN]]LLNNLLNNLLNNLLNNLLNN]]LLNNLLNNLLNNLLNNLLNN]]LLNNLLNNLLNNLLNNLLNN]]LLNNLLNNLLNNLLNNLLNN]]LLNNLLNNLLNNLLNNLLNN]]!");
    }

    @Test
    public void test12131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12131");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("Lu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!ll!", "\u0366\u0365\u0368\u0368\u0245\u0246\u0248\u0248\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!" + "'", str2, "!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!");
    }

    @Test
    public void test12132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12132");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL!", "UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276UUUUUUUU\275\276UUUUUUUU\275\276UUUUUUUU\275\276UUUUUUUU\275\276UUUUUUUU\275\276UUUUUUUU\275\276UUUUUUUU\275\276UUUUUUUU\275\276UUUUUUUU\275\276UUUUUUUU\275\276UUUUUUUU\275\276UUUUUUUU\275\276UUUUUUUU\275\276UUUUUUUU\275\276UUUUUUUU\275\276UUUUUUUU\275\276UUUUUUUU\275\276UUUUUUUU\275\276UUUUUUUU\275\276UUUUUUUU!" + "'", str2, "\275\276UUUUUUUU\275\276UUUUUUUU\275\276UUUUUUUU\275\276UUUUUUUU\275\276UUUUUUUU\275\276UUUUUUUU\275\276UUUUUUUU\275\276UUUUUUUU\275\276UUUUUUUU\275\276UUUUUUUU\275\276UUUUUUUU\275\276UUUUUUUU\275\276UUUUUUUU\275\276UUUUUUUU\275\276UUUUUUUU\275\276UUUUUUUU\275\276UUUUUUUU\275\276UUUUUUUU\275\276UUUUUUUU\275\276UUUUUUUU!");
    }

    @Test
    public void test12133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12133");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251!", "\u014c\u014c\u014c\u014c\u014e\u014c\u014c\u014c\u014e\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014e\u014c\u014c\u014c\u014e\u014c\u014c\u014c!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251!" + "'", str2, "\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251\254\251\251\251!");
    }

    @Test
    public void test12134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12134");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!", "UULLUULL!!UULLUULL!!UULLUULLUULLUULL!!UULLUULL!!UULLUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!!" + "'", str2, "ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!ULUUULUU!!!");
    }

    @Test
    public void test12135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12135");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u02cc\u02cc\u02cc\u02cc\u02cc\u02cc\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u02cc\u02cc\u02cc\u02cc\u02cc\u02cc\u0346\u0348\u0348!");
    }

    @Test
    public void test12136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12136");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\253\u0348\u0346\u0346!", "]HHH\200}}`]HHH]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\253\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\253\u0348\u0346\u0346!");
    }

    @Test
    public void test12137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12137");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!", "N!LLN!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!E!\200\200E!\200\200E!\200\200E!\200\200!!!E!\200\200E!\200\200E!\200\200E!\200\200!!!!!E!\200\200E!\200\200E!\200\200E!\200\200!!!E!\200\200E!\200\200E!\200\200E!\200\200!!!!!E!\200\200E!\200\200E!\200\200E!\200\200!!!E!\200\200E!\200\200E!\200\200E!\200\200!!!!!E!\200\200E!\200\200E!\200\200E!\200\200!!!E!\200\200E!\200\200E!\200\200E!\200\200!!!!!E!\200\200E!\200\200E!\200\200E!\200\200!!!E!\200\200E!\200\200E!\200\200E!\200\200!!!!!E!\200\200E!\200\200E!\200\200E!\200\200!!!E!\200\200E!\200\200E!\200\200E!\200\200!!!!!E!\200\200E!\200\200E!\200\200E!\200\200!!!E!\200\200E!\200\200E!\200\200E!\200\200!!!!!E!\200\200E!\200\200E!\200\200E!\200\200!!!E!\200\200E!\200\200E!\200\200E!\200\200!!!!!" + "'", str2, "!E!\200\200E!\200\200E!\200\200E!\200\200!!!E!\200\200E!\200\200E!\200\200E!\200\200!!!!!E!\200\200E!\200\200E!\200\200E!\200\200!!!E!\200\200E!\200\200E!\200\200E!\200\200!!!!!E!\200\200E!\200\200E!\200\200E!\200\200!!!E!\200\200E!\200\200E!\200\200E!\200\200!!!!!E!\200\200E!\200\200E!\200\200E!\200\200!!!E!\200\200E!\200\200E!\200\200E!\200\200!!!!!E!\200\200E!\200\200E!\200\200E!\200\200!!!E!\200\200E!\200\200E!\200\200E!\200\200!!!!!E!\200\200E!\200\200E!\200\200E!\200\200!!!E!\200\200E!\200\200E!\200\200E!\200\200!!!!!E!\200\200E!\200\200E!\200\200E!\200\200!!!E!\200\200E!\200\200E!\200\200E!\200\200!!!!!E!\200\200E!\200\200E!\200\200E!\200\200!!!E!\200\200E!\200\200E!\200\200E!\200\200!!!!!");
    }

    @Test
    public void test12138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12138");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368UNLL\213\213\213\u0346\u0348\u0348!", "\u0366\u0365\u0368\u0368UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0143\u0144\u0146\u0146\213\213\213\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0143\u0144\u0146\u0146\213\213\213\u0346\u0348\u0348!");
    }

    @Test
    public void test12139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12139");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!N!!!N!!!N!!!!!N!!!N!!!N!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!N!!!!!N!!!N!!!N!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!N!!!!!N!!!N!!!N!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!N!!!!!N!!!N!!!N!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!N!!!!!N!!!N!!!N!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!N!!!!!N!!!N!!!N!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!N!!!!!N!!!N!!!N!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!N!!!!!N!!!N!!!N!!!N!!!N!!!!!N!!!N!!!!!", "orrrorrrrrorrrorrrrrorrrorrrrrorrrorrrrrorrrorrrrrorrrorrrrrorrrorrrrrorrrorrrrr!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!" + "'", str2, "!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!");
    }

    @Test
    public void test12140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12140");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12141");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\231\u0346\u0348\u0348!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\231\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\231\u0346\u0348\u0348!");
    }

    @Test
    public void test12142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12142");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200!!!!!", "d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200!!!!!" + "'", str2, "\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200!!!!!");
    }

    @Test
    public void test12143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12143");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "\u0178\u0175\u0178\u0178\u0178\u0175\u0178\u0178\u0178\u0175\u0178\u0178\u0178\u0175\u0178\u0178!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test12144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12144");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test12145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12145");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NLLL\236\276\276NLLL\236\276\276!!NLLL\236\276\276NLLL\236\276\276!!NLLL\236\276\276NLLL\236\276\276NLLL\236\276\276NLLL\236\276\276!!NLLL\236\276\276NLLL\236\276\276!!NLLL\236\276\276NLLL\236\276\276!", "ijllijllijllijllijllijllijllijllnull!!!null!!!ijllijllijllijllijllijllijllijllnull!!!null!!!!!ijllijllijllijllijllijllijllijllnull!!!null!!!ijllijllijllijllijllijllijllijllnull!!!null!!!!!ijllijllijllijllijllijllijllijllnull!!!null!!!ijllijllijllijllijllijllijllijllnull!!!null!!!ijllijllijllijllijllijllijllijllnull!!!null!!!ijllijllijllijllijllijllijllijllnull!!!null!!!!!ijllijllijllijllijllijllijllijllnull!!!null!!!ijllijllijllijllijllijllijllijllnull!!!null!!!!!ijllijllijllijllijllijllijllijllnull!!!null!!!ijllijllijllijllijllijllijllijllnull!!!null!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JLLL\236\276\276JLLL\236\276\276!!JLLL\236\276\276JLLL\236\276\276!!JLLL\236\276\276JLLL\236\276\276JLLL\236\276\276JLLL\236\276\276!!JLLL\236\276\276JLLL\236\276\276!!JLLL\236\276\276JLLL\236\276\276!" + "'", str2, "JLLL\236\276\276JLLL\236\276\276!!JLLL\236\276\276JLLL\236\276\276!!JLLL\236\276\276JLLL\236\276\276JLLL\236\276\276JLLL\236\276\276!!JLLL\236\276\276JLLL\236\276\276!!JLLL\236\276\276JLLL\236\276\276!");
    }

    @Test
    public void test12146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12146");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "]]!!]]!!}}]]!!]]!!}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test12147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12147");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0136\u0139\u0139\u0139\u0139\u0136\u0139\u0139\u0139\u0139\225\225\u0136\u0139\u0139\u0139\u0139\u0136\u0139\u0139\u0139\u0139\225\225\u0136\u0139\u0139\u0139\u0139\u0136\u0139\u0139\u0139\u0139\225\225\u0136\u0139\u0139\u0139\u0139\u0136\u0139\u0139\u0139\u0139\225\225\u0136\u0139\u0139\u0139\u0139\u0136\u0139\u0139\u0139\u0139\225\225\u0136\u0139\u0139\u0139\u0139\u0136\u0139\u0139\u0139\u0139\225\225\u0136\u0139\u0139\u0139\u0139\u0136\u0139\u0139\u0139\u0139\225\225\u0136\u0139\u0139\u0139\u0139\u0136\u0139\u0139\u0139\u0139\225\225!", "\215}\215\215\215}\215\215\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\215}\215\215\215}\215\215!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aanullnullnullnull\225\225\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aanullnullnullnull\225\225\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aanullnullnullnull\225\225\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aanullnullnullnull\225\225\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aanullnullnullnull\225\225\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aanullnullnullnull\225\225\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aanullnullnullnull\225\225\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aanullnullnullnull\225\225!" + "'", str2, "\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aanullnullnullnull\225\225\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aanullnullnullnull\225\225\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aanullnullnullnull\225\225\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aanullnullnullnull\225\225\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aanullnullnullnull\225\225\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aanullnullnullnull\225\225\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aanullnullnullnull\225\225\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aa\u01aa\u01a8\u01aa\u01aanullnullnullnull\225\225!");
    }

    @Test
    public void test12148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12148");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200LUUULUUULUUULUUULUUULUUULUUULUUU}~\200\200}~\200\200LUUULUUULUUULUUULUUULUUULUUULUUU!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12149");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214!", "!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214!" + "'", str2, "\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214!");
    }

    @Test
    public void test12150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12150");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316!!\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316!!\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316!!\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316!!\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316!", "!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12151");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!!!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!!!", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!!!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!!!" + "'", str2, "!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!!!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!~null!nullnullnull!nullnull!!!");
    }

    @Test
    public void test12152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12152");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017enullnullnullnull!", "\u0143\u0145\u0145\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0143\u0145\u0145\u0145\u0143\u0145\u0143!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144!!!" + "'", str2, "\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144!!!");
    }

    @Test
    public void test12153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12153");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "NLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12154");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c!!!", "nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c!!!" + "'", str2, "\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c!!!");
    }

    @Test
    public void test12155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12155");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("OOOO!]OO!]OO!]OO!]OOOOOO!]OO!]OO!", "!!!lll!lll!lll!lll!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!]nullnull!]nullnull!]nullnull!]nullnullnullnullnullnull!]nullnull!]nullnull!" + "'", str2, "nullnullnullnull!]nullnull!]nullnull!]nullnull!]nullnullnullnullnullnull!]nullnull!]nullnull!");
    }

    @Test
    public void test12156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12156");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!", "porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!!" + "'", str2, "ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!ORRRORRRORRRORRR!!!!");
    }

    @Test
    public void test12157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12157");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("efhhefhhefhhefhhefhhefhhefhhefhh!", "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12158");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNNN!NNNNNNNNNNNN!NNNNNNNNNNNN!NNNNNNNNNNNN!NNNNNNNNNNNN!NNNNNNNNNNNN!NNNNNNNNNNNN!NNNNNNNNNNNN!NNNNNNNN!!NNNN!NNNNNNNNNNNN!NNNNNNNNNNNN!NNNNNNNNNNNN!NNNNNNNNNNNN!NNNNNNNNNNNN!NNNNNNNNNNNN!NNNNNNNNNNNN!NNNNNNNN!!!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~~~!~~~~~~~~~~~~!~~~~~~~~~~~~!~~~~~~~~~~~~!~~~~~~~~~~~~!~~~~~~~~~~~~!~~~~~~~~~~~~!~~~~~~~~~~~~!~~~~~~~~!!~~~~!~~~~~~~~~~~~!~~~~~~~~~~~~!~~~~~~~~~~~~!~~~~~~~~~~~~!~~~~~~~~~~~~!~~~~~~~~~~~~!~~~~~~~~~~~~!~~~~~~~~!!!" + "'", str2, "~~~~!~~~~~~~~~~~~!~~~~~~~~~~~~!~~~~~~~~~~~~!~~~~~~~~~~~~!~~~~~~~~~~~~!~~~~~~~~~~~~!~~~~~~~~~~~~!~~~~~~~~!!~~~~!~~~~~~~~~~~~!~~~~~~~~~~~~!~~~~~~~~~~~~!~~~~~~~~~~~~!~~~~~~~~~~~~!~~~~~~~~~~~~!~~~~~~~~~~~~!~~~~~~~~!!!");
    }

    @Test
    public void test12159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12159");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368^^``^^``^^!", "\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368^^``^^``^^!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368^^``^^``^^!");
    }

    @Test
    public void test12160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12160");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHH!!FEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHH!!FEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHH!!FEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHH!!FEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHH!", "null]!]]]!]]]!]]null]!]]]!]]]!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!!!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!!!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!!!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!!!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!" + "'", str2, "!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!!!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!!!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!!!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!!!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!]]]!!]]]!]]]!");
    }

    @Test
    public void test12161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12161");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnullnull\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!", "\253\254\256\256\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da!!!\253\254\256\256\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\256nullnullnullnull\254\254nullnullnullnullnullnullnullnullnullnullnullnull\256nullnullnullnull\254\254nullnullnullnullnullnullnullnull!!nullnullnullnull\256nullnullnullnull\254\254nullnullnullnullnullnullnullnullnullnullnullnull\256nullnullnullnull\254\254nullnullnullnullnullnullnullnull!!nullnullnullnull\256nullnullnullnull\254\254nullnullnullnullnullnullnullnullnullnullnullnull\256nullnullnullnull\254\254nullnullnullnullnullnullnullnullnullnullnullnull\256nullnullnullnull\254\254nullnullnullnullnullnullnullnullnullnullnullnull\256nullnullnullnull\254\254nullnullnullnullnullnullnullnull!!nullnullnullnull\256nullnullnullnull\254\254nullnullnullnullnullnullnullnullnullnullnullnull\256nullnullnullnull\254\254nullnullnullnullnullnullnullnull!!nullnullnullnull\256nullnullnullnull\254\254nullnullnullnullnullnullnullnullnullnullnullnull\256nullnullnullnull\254\254nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull\256nullnullnullnull\254\254nullnullnullnullnullnullnullnullnullnullnullnull\256nullnullnullnull\254\254nullnullnullnullnullnullnullnull!!nullnullnullnull\256nullnullnullnull\254\254nullnullnullnullnullnullnullnullnullnullnullnull\256nullnullnullnull\254\254nullnullnullnullnullnullnullnull!!nullnullnullnull\256nullnullnullnull\254\254nullnullnullnullnullnullnullnullnullnullnullnull\256nullnullnullnull\254\254nullnullnullnullnullnullnullnullnullnullnullnull\256nullnullnullnull\254\254nullnullnullnullnullnullnullnullnullnullnullnull\256nullnullnullnull\254\254nullnullnullnullnullnullnullnull!!nullnullnullnull\256nullnullnullnull\254\254nullnullnullnullnullnullnullnullnullnullnullnull\256nullnullnullnull\254\254nullnullnullnullnullnullnullnull!!nullnullnullnull\256nullnullnullnull\254\254nullnullnullnullnullnullnullnullnullnullnullnull\256nullnullnullnull\254\254nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12162");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253!!\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253!!\200\200\u0346\u0348\u0348!", "\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037enullll]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253!!\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253!!\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test12163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12163");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test12164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12164");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!", "\u0366\u0365\u0368\u0368L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!" + "'", str2, "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
    }

    @Test
    public void test12165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12165");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0200\u0200\u01fb\u01fc\u01fe\u01fe\u01fb\u01fc\u01fe\u01fe\u01fb\u01fc\u01fe\u01fe\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u01fb\u01fc\u01fe\u01fe\u01fb\u01fc\u01fe\u01fe\u01fb\u01fc\u01fe\u01fe\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200!!!", "NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN\200}}`NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test12166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12166");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull~}}^\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull]]!", "}~\200\200}~\200\200TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT}~\200\200}~\200\200TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT~}}^\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT]]!" + "'", str2, "\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT~}}^\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT]]!");
    }

    @Test
    public void test12167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12167");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "XXXX!!!XXXX!!!XXXX!!!XXXX!!!XXXX!!!XXXX!!!XXXX!!!XXXX!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test12168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12168");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\216\216\216!\216\216\216!", "\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\216\216\216!\216\216\216!" + "'", str2, "!\216\216\216!\216\216\216!");
    }

    @Test
    public void test12169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12169");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!!!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!!\200\200\u0346\u0348\u0348!", "\u0366\u0365\u0368\u0368\u0109\u0107\u0107\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!!!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!!!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!null\275\275!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test12170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12170");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!", "u}}}nullu}}}u}}}u}}}nullu}}}u}}}u}}}u}}}u}}}nullu}}}u}}}u}}}nullu}}}u}}}u}}}u}}}u}}}u}}}nullu}}}u}}}u}}}u}}}u}}}u}}}nullu}}}u}}}u}}}u}}}u}}}u}}}nullu}}}u}}}u}}}u}}}u}}}u}}}nullu}}}u}}}u}}}u}}}u}}}nullu}}}u}}}u}}}nullu}}}u}}}u}}}u}}}u}}}nullu}}}u}}}u}}}nullu}}}u}}}u}}}u}}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!" + "'", str2, "!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!");
    }

    @Test
    public void test12171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12171");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200!", "!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\200\200\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\200\200\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\200\200\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\200\200\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\200\200\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\200\200\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\200\200\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\200\200\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\200\200\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\200\200\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\200\200\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\200\200\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\200\200\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\200\200\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\200\200\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\200\200!" + "'", str2, "\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\200\200\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\200\200\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\200\200\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\200\200\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\200\200\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\200\200\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\200\200\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\200\200\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\200\200\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\200\200\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\200\200\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\200\200\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\200\200\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\200\200\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\200\200\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\200\200!");
    }

    @Test
    public void test12172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12172");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12173");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226!!LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12174");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~UU!~UU!~UU!~UU!~UU!~UU!~UU!~UU!!!~UU!~UU!~UU!~UU!~UU!~UU!~UU!~UU!!!", "\200\200\u01d0\u01d0\200\200\u01d0\u01d0!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!!!" + "'", str2, "!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!!!");
    }

    @Test
    public void test12175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12175");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null!nullnullnullnull!!nullnull!!nullnull!!nullnull!!null!nullnullnullnull!!nullnull!!!", "\u0366\u0365\u0368\u0368!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLL!!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!!LLL!LLL!LLL!LLL!!!LLL!LLL!!!" + "'", str2, "!LLL!!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!!LLL!LLL!LLL!LLL!!!LLL!LLL!!!");
    }

    @Test
    public void test12176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12176");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230\200}}`~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230]]!", "\u0366\u0365\u0368\u0368\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230\200}}`~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230]]!" + "'", str2, "~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230\200}}`~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230]]!");
    }

    @Test
    public void test12177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12177");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\200~~~\200~~~!", "nn\200\200nn\200\200!!nn\200\200nn\200\200!!nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200!!nn\200\200nn\200\200!!nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200!!nn\200\200nn\200\200!!nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200!!nn\200\200nn\200\200!!nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200!!nn\200\200nn\200\200!!nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200!!nn\200\200nn\200\200!!nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200!!nn\200\200nn\200\200!!nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200!!nn\200\200nn\200\200!!nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200nn\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200~~~\200~~~!" + "'", str2, "\200~~~\200~~~!");
    }

    @Test
    public void test12178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12178");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239\u023b\u023b\u0239\u0239!", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12179");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!", "!!~N^}}N^}}!!!!~N^}}N^}}!!!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!!!~N^}}N^}}!!!!~N^}}N^}}!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200^!~~^!~~!!^!~~^!~~!!^!~~^!~~^!~~^!~~!!^!~~^!~~!!^!~~^!~~~}\200\200~}\200\200^!~~^!~~!!^!~~^!~~!!^!~~^!~~^!~~^!~~!!^!~~^!~~!!^!~~^!~~~}\200\200~}\200\200^!~~^!~~!!^!~~^!~~!!^!~~^!~~^!~~^!~~!!^!~~^!~~!!^!~~^!~~~}\200\200~}\200\200^!~~^!~~!!^!~~^!~~!!^!~~^!~~^!~~^!~~!!^!~~^!~~!!^!~~^!~~~}\200\200~}\200\200^!~~^!~~!!^!~~^!~~!!^!~~^!~~^!~~^!~~!!^!~~^!~~!!^!~~^!~~~}\200\200~}\200\200^!~~^!~~!!^!~~^!~~!!^!~~^!~~^!~~^!~~!!^!~~^!~~!!^!~~^!~~~}\200\200~}\200\200^!~~^!~~!!^!~~^!~~!!^!~~^!~~^!~~^!~~!!^!~~^!~~!!^!~~^!~~~}\200\200~}\200\200^!~~^!~~!!^!~~^!~~!!^!~~^!~~^!~~^!~~!!^!~~^!~~!!^!~~^!~~!" + "'", str2, "~}\200\200~}\200\200^!~~^!~~!!^!~~^!~~!!^!~~^!~~^!~~^!~~!!^!~~^!~~!!^!~~^!~~~}\200\200~}\200\200^!~~^!~~!!^!~~^!~~!!^!~~^!~~^!~~^!~~!!^!~~^!~~!!^!~~^!~~~}\200\200~}\200\200^!~~^!~~!!^!~~^!~~!!^!~~^!~~^!~~^!~~!!^!~~^!~~!!^!~~^!~~~}\200\200~}\200\200^!~~^!~~!!^!~~^!~~!!^!~~^!~~^!~~^!~~!!^!~~^!~~!!^!~~^!~~~}\200\200~}\200\200^!~~^!~~!!^!~~^!~~!!^!~~^!~~^!~~^!~~!!^!~~^!~~!!^!~~^!~~~}\200\200~}\200\200^!~~^!~~!!^!~~^!~~!!^!~~^!~~^!~~^!~~!!^!~~^!~~!!^!~~^!~~~}\200\200~}\200\200^!~~^!~~!!^!~~^!~~!!^!~~^!~~^!~~^!~~!!^!~~^!~~!!^!~~^!~~~}\200\200~}\200\200^!~~^!~~!!^!~~^!~~!!^!~~^!~~^!~~^!~~!!^!~~^!~~!!^!~~^!~~!");
    }

    @Test
    public void test12180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12180");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\276\276\276null\276\276\276null\276\276\276null\276\276\276null\276\276\276null\276\276\276null\276\276\276null\276\276\276!", "\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\213\214\216\216\276\276\276\213\214\216\216\276\276\276\213\214\216\216\276\276\276\213\214\216\216\276\276\276\213\214\216\216\276\276\276\213\214\216\216\276\276\276\213\214\216\216\276\276\276\213\214\216\216\276\276\276!" + "'", str2, "\213\214\216\216\276\276\276\213\214\216\216\276\276\276\213\214\216\216\276\276\276\213\214\216\216\276\276\276\213\214\216\216\276\276\276\213\214\216\216\276\276\276\213\214\216\216\276\276\276\213\214\216\216\276\276\276!");
    }

    @Test
    public void test12181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12181");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU!!`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU!!`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU!!`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU!!`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU!", "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031aLLnullnullLLnullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c!" + "'", str2, "\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c!");
    }

    @Test
    public void test12182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12182");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnull!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullrnullnull]nullrnullnullnullrnullnull!nullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnull!nullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnull!nullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnull!nullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnull!nullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnull!nullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnull!nullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnull!nullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnull!" + "'", str2, "nullrnullnull]nullrnullnullnullrnullnull!nullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnull!nullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnull!nullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnull!nullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnull!nullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnull!nullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnull!nullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnull!nullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnull!");
    }

    @Test
    public void test12183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12183");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!", "\261\262\264\264NN~~NN~~!!!!\261\262\264\264NN~~NN~~!!!!!!\261\262\264\264NN~~NN~~!!!!\261\262\264\264NN~~NN~~!!!!!!\261\262\264\264NN~~NN~~!!!!\261\262\264\264NN~~NN~~!!!!!!\261\262\264\264NN~~NN~~!!!!\261\262\264\264NN~~NN~~!!!!!!\261\262\264\264NN~~NN~~!!!!\261\262\264\264NN~~NN~~!!!!!!\261\262\264\264NN~~NN~~!!!!\261\262\264\264NN~~NN~~!!!!!!\261\262\264\264NN~~NN~~!!!!\261\262\264\264NN~~NN~~!!!!!!\261\262\264\264NN~~NN~~!!!!\261\262\264\264NN~~NN~~!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!!!~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test12184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12184");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230\200}}`~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230]]!", "NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230\200}}`~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230]]!" + "'", str2, "~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230\200}}`~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230]]!");
    }

    @Test
    public void test12185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12185");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u03c0\u03c0\u03c0\u03c0!!\200\200\u0346\u0348\u0348!", "\260\260]]!\260\260]]\260\260]]\260\260]]!\260\260]]\260\260]]\225\225\260\260]]!\260\260]]\260\260]]\260\260]]!\260\260]]\260\260]]\225\225\260\260]]!\260\260]]\260\260]]\260\260]]!\260\260]]\260\260]]\225\225\260\260]]!\260\260]]\260\260]]\260\260]]!\260\260]]\260\260]]\225\225\260\260]]!\260\260]]\260\260]]\260\260]]!\260\260]]\260\260]]\225\225\260\260]]!\260\260]]\260\260]]\260\260]]!\260\260]]\260\260]]\225\225\260\260]]!\260\260]]\260\260]]\260\260]]!\260\260]]\260\260]]\225\225\260\260]]!\260\260]]\260\260]]\260\260]]!\260\260]]\260\260]]\225\225!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnull!!nullnull!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnull!!nullnull!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test12186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12186");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!", "!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!" + "'", str2, "XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!");
    }

    @Test
    public void test12187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12187");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "NNNNNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12188");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "U!LLU!LL!!U!LLU!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test12189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12189");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("XXXXXXXX!!XXXXXXXX!!XXXXXXXXXXXXXXXX!!XXXXXXXX!!XXXXXXXX!", "\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12190");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!", "}~\200\200}~\200\200null\210nullnullnull\210nullnullnull\210nullnullnull\210nullnull^null\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnull^null\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnull}~\200\200}~\200\200null\210nullnullnull\210nullnullnull\210nullnullnull\210nullnull^null\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnull^null\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!" + "'", str2, "!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!");
    }

    @Test
    public void test12191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12191");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!", "!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!" + "'", str2, "!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!");
    }

    @Test
    public void test12192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12192");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!", "LNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLL\220!!\200~~NLLL\220!!\200~~NLLL\220!!NLLL\220!!NLLL\220!!\200~~NLLL\220!!\200~~NLLL\220!!NLLL\220!!!!NLLL\220!!\200~~NLLL\220!!\200~~NLLL\220!!NLLL\220!!NLLL\220!!\200~~NLLL\220!!\200~~NLLL\220!!NLLL\220!!!!NLLL\220!!\200~~NLLL\220!!\200~~NLLL\220!!NLLL\220!!NLLL\220!!\200~~NLLL\220!!\200~~NLLL\220!!NLLL\220!!NLLL\220!!\200~~NLLL\220!!\200~~NLLL\220!!NLLL\220!!NLLL\220!!\200~~NLLL\220!!\200~~NLLL\220!!NLLL\220!!!!NLLL\220!!\200~~NLLL\220!!\200~~NLLL\220!!NLLL\220!!NLLL\220!!\200~~NLLL\220!!\200~~NLLL\220!!NLLL\220!!!!NLLL\220!!\200~~NLLL\220!!\200~~NLLL\220!!NLLL\220!!NLLL\220!!\200~~NLLL\220!!\200~~NLLL\220!!NLLL\220!!!" + "'", str2, "NLLL\220!!\200~~NLLL\220!!\200~~NLLL\220!!NLLL\220!!NLLL\220!!\200~~NLLL\220!!\200~~NLLL\220!!NLLL\220!!!!NLLL\220!!\200~~NLLL\220!!\200~~NLLL\220!!NLLL\220!!NLLL\220!!\200~~NLLL\220!!\200~~NLLL\220!!NLLL\220!!!!NLLL\220!!\200~~NLLL\220!!\200~~NLLL\220!!NLLL\220!!NLLL\220!!\200~~NLLL\220!!\200~~NLLL\220!!NLLL\220!!NLLL\220!!\200~~NLLL\220!!\200~~NLLL\220!!NLLL\220!!NLLL\220!!\200~~NLLL\220!!\200~~NLLL\220!!NLLL\220!!!!NLLL\220!!\200~~NLLL\220!!\200~~NLLL\220!!NLLL\220!!NLLL\220!!\200~~NLLL\220!!\200~~NLLL\220!!NLLL\220!!!!NLLL\220!!\200~~NLLL\220!!\200~~NLLL\220!!NLLL\220!!NLLL\220!!\200~~NLLL\220!!\200~~NLLL\220!!NLLL\220!!!");
    }

    @Test
    public void test12193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12193");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!", "nullnullnullnull\256nullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!" + "'", str2, "]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!");
    }

    @Test
    public void test12194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12194");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!!", "!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!!" + "'", str2, "!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!!");
    }

    @Test
    public void test12195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12195");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullLLnullnullLLnullnullLLnullnullLLnullnullnullLLLLnullnullnullLLLLnullnullnullLLLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullnullLLLLnullnullnullLLLLnullnullnullLLLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullnullLLLLnullnullnullLLLLnullnullnullLLLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullnullLLLLnullnullnullLLLLnullnullnullLLLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullnullLLLLnullnullnullLLLLnullnullnullLLLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullnullLLLLnullnullnullLLLLnullnullnullLLLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullnullLLLLnullnullnullLLLLnullnullnullLLLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullnullLLLLnullnullnullLLLLnullnullnullLLLL!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!" + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
    }

    @Test
    public void test12196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12196");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NULLNULL!", "\u0264\u0262\u0264\u0262\u0264\u0262\u0264\u0262\u0264\u0262\u0264\u0262\u0264\u0262\u0264\u0262\u0264\u0262\u0264\u0262\u0264\u0262\u0264\u0262nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0262\u0262\u0262\u0262!" + "'", str2, "\u0262\u0262\u0262\u0262!");
    }

    @Test
    public void test12197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12197");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "efhhnullnullnullefhhnullnullnullefhhnullnullnullefhhnullnullnullefhhnullnullnullefhhnullnullnullefhhnullnullnullefhhnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!" + "'", str2, "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
    }

    @Test
    public void test12198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12198");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!!!TTT!TTT!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!" + "'", str2, "!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!");
    }

    @Test
    public void test12199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12199");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!" + "'", str2, "U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!");
    }

    @Test
    public void test12200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12200");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\255\256\260\260\255\256\260\260\255\256\260\260\255\256\260\260null\255\256\260\260\255\256\260\260\255\256\260\260null\255\256\260\260\255\256\260\260\255\256\260\260null\255\256\260\260\255\256\260\260\255\256\260\260null\255\256\260\260\255\256\260\260!\255\256\260\260\255\256\260\260\255\256\260\260\255\256\260\260null\255\256\260\260\255\256\260\260\255\256\260\260null\255\256\260\260\255\256\260\260!", "!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\255\256\260\260\255\256\260\260\255\256\260\260\255\256\260\260]\225\225\225\255\256\260\260\255\256\260\260\255\256\260\260]\225\225\225\255\256\260\260\255\256\260\260\255\256\260\260]\225\225\225\255\256\260\260\255\256\260\260\255\256\260\260]\225\225\225\255\256\260\260\255\256\260\260!\255\256\260\260\255\256\260\260\255\256\260\260\255\256\260\260]\225\225\225\255\256\260\260\255\256\260\260\255\256\260\260]\225\225\225\255\256\260\260\255\256\260\260!" + "'", str2, "!\255\256\260\260\255\256\260\260\255\256\260\260\255\256\260\260]\225\225\225\255\256\260\260\255\256\260\260\255\256\260\260]\225\225\225\255\256\260\260\255\256\260\260\255\256\260\260]\225\225\225\255\256\260\260\255\256\260\260\255\256\260\260]\225\225\225\255\256\260\260\255\256\260\260!\255\256\260\260\255\256\260\260\255\256\260\260\255\256\260\260]\225\225\225\255\256\260\260\255\256\260\260\255\256\260\260]\225\225\225\255\256\260\260\255\256\260\260!");
    }

    @Test
    public void test12201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12201");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!", "`null!nullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnull`null!nullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!" + "'", str2, "\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!");
    }

    @Test
    public void test12202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12202");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!", "HHHHHHHHHHHHHHHH\200}}`HHHHHHHHHHHHHHHH]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H~\225\225\230\230\225\225\230\230\225\225\230\230\225\225H~\225\225\230\230\225\225\230\230\225\225\230\230\225\225H~\225\225\230\230\225\225\230\230\225\225\230\230\225\225H~\225\225\230\230\225\225\230\230\225\225\230\230\225\225H~\225\225\230\230\225\225\230\230\225\225\230\230\225\225H~\225\225\230\230\225\225\230\230\225\225\230\230\225\225H~\225\225\230\230\225\225\230\230\225\225\230\230\225\225H~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "H~\225\225\230\230\225\225\230\230\225\225\230\230\225\225H~\225\225\230\230\225\225\230\230\225\225\230\230\225\225H~\225\225\230\230\225\225\230\230\225\225\230\230\225\225H~\225\225\230\230\225\225\230\230\225\225\230\230\225\225H~\225\225\230\230\225\225\230\230\225\225\230\230\225\225H~\225\225\230\230\225\225\230\230\225\225\230\230\225\225H~\225\225\230\230\225\225\230\230\225\225\230\230\225\225H~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test12203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12203");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014b!", "UNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUU!!UNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUU!!UNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUU!!UNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUU!!UNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUU!!UNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUU!!UNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUU!!UNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUU!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!" + "'", str2, "!null!");
    }

    @Test
    public void test12204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12204");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!", "Le!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!ll!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~nullnull!!!!~nullnull!!!!!!~nullnull!!!!~nullnull!!!!!!~nullnull!!!!~nullnull!!!!~nullnull!!!!~nullnull!!!!!!~nullnull!!!!~nullnull!!!!!!~nullnull!!!!~nullnull!!!" + "'", str2, "!!~nullnull!!!!~nullnull!!!!!!~nullnull!!!!~nullnull!!!!!!~nullnull!!!!~nullnull!!!!~nullnull!!!!~nullnull!!!!!!~nullnull!!!!~nullnull!!!!!!~nullnull!!!!~nullnull!!!");
    }

    @Test
    public void test12205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12205");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!!", "]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254!!]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254!!]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254!!]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254!!]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254!!]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254!!]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254!!]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!!" + "'", str2, "\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!!");
    }

    @Test
    public void test12206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12206");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!~!!!!!!~!!!!!!!!~!!!!!!~!!!!!!!!~!!!!!!~!!!!!!~!!!!!!~!!!!!!!!~!!!!!!~!!!!!!!!~!!!!!!~!!!!!", "X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~!!!!!!~!!!!!!!!~!!!!!!~!!!!!!!!~!!!!!!~!!!!!!~!!!!!!~!!!!!!!!~!!!!!!~!!!!!!!!~!!!!!!~!!!!!" + "'", str2, "!!~!!!!!!~!!!!!!!!~!!!!!!~!!!!!!!!~!!!!!!~!!!!!!~!!!!!!~!!!!!!!!~!!!!!!~!!!!!!!!~!!!!!!~!!!!!");
    }

    @Test
    public void test12207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12207");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLNNNNLL!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12208");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!!", "!!~N^}}N^}}!!!!~N^}}N^}}!!!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!!!~N^}}N^}}!!!!~N^}}N^}}!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test12209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12209");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\200\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0]]!", "\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull\200}}`nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull\200}}`nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test12210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12210");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214!", "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214!" + "'", str2, "\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214!");
    }

    @Test
    public void test12211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12211");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200!", "\u017e\u017e\u017e\u017e\u017e\u017enullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200\200LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200\200LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200\200LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200\200LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200\200LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200\200LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200\200LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200\200!" + "'", str2, "LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200\200LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200\200LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200\200LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200\200LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200\200LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200\200LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200\200LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200\200!");
    }

    @Test
    public void test12212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12212");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e]]!!!", "!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e]]!!!" + "'", str2, "\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e]]!!!");
    }

    @Test
    public void test12213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12213");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c\u022c!", "l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230\200}}`l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNN!" + "'", str2, "NNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNN!");
    }

    @Test
    public void test12214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12214");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\254\254!!\254\254!!!", "\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\254!!\254\254!!!" + "'", str2, "\254\254!!\254\254!!!");
    }

    @Test
    public void test12215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12215");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]\200}}`!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]]]!", "NN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]\200}}`!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]]]!" + "'", str2, "!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]\200}}`!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]]]!");
    }

    @Test
    public void test12216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12216");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UUU!!UUUUU!!UU!!UUU!!UUUUU!!UU!!UUU!!UUUUU!!UUUUU!!UUUUU!!UU!!UUU!!UUUUU!!UU!!UUU!!UUUUU!!UU!", "\275\u0126\u0128\u0128\u0126\u0128\u0128\200\200\u0126\u0128\u0128\u0126\u0128\u0128\200\200\u0126\u0128\u0128\u0126\u0128\u0128\200\200\276\u0126\u0128\u0128\u0126\u0128\u0128\200\200\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLL!!LLLLL!!LL!!LLL!!LLLLL!!LL!!LLL!!LLLLL!!LLLLL!!LLLLL!!LL!!LLL!!LLLLL!!LL!!LLL!!LLLLL!!LL!" + "'", str2, "LLL!!LLLLL!!LL!!LLL!!LLLLL!!LL!!LLL!!LLLLL!!LLLLL!!LLLLL!!LL!!LLL!!LLLLL!!LL!!LLL!!LLLLL!!LL!");
    }

    @Test
    public void test12217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12217");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\204``]]\204\204\204``]]\204\204!!\204``]]\204\204\204``]]\204\204!!\204``]]\204\204\204``]]\204\204\204``]]\204\204\204``]]\204\204!!\204``]]\204\204\204``]]\204\204!!\204``]]\204\204\204``]]\204\204!", "l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn!!l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\204``]]\204\204\204``]]\204\204!!\204``]]\204\204\204``]]\204\204!!\204``]]\204\204\204``]]\204\204\204``]]\204\204\204``]]\204\204!!\204``]]\204\204\204``]]\204\204!!\204``]]\204\204\204``]]\204\204!" + "'", str2, "\204``]]\204\204\204``]]\204\204!!\204``]]\204\204\204``]]\204\204!!\204``]]\204\204\204``]]\204\204\204``]]\204\204\204``]]\204\204!!\204``]]\204\204\204``]]\204\204!!\204``]]\204\204\204``]]\204\204!");
    }

    @Test
    public void test12218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12218");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("lluulluu!!lluulluu!!lluulluulluulluu!!lluulluu!!lluulluu!", "\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307!" + "'", str2, "\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307\u0307!");
    }

    @Test
    public void test12219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12219");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346!", "\204nullnullnullnull\204\204\204nullnullnullnull\204\204!!\204nullnullnullnull\204\204\204nullnullnullnull\204\204!!\204nullnullnullnull\204\204\204nullnullnullnull\204\204\204nullnullnullnull\204\204\204nullnullnullnull\204\204!!\204nullnullnullnull\204\204\204nullnullnullnull\204\204!!\204nullnullnullnull\204\204\204nullnullnullnull\204\204!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test12220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12220");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("X!UUX!UUX!UUX!UUX!UUX!UUX!UUX!UU!", "~L\276\276\276L\276\276\276L\276\276\276~L\276\276\276L\276\276\276L\276\276\276~L\276\276\276L\276\276\276L\276\276\276~L\276\276\276L\276\276\276L\276\276\276\200}}`~L\276\276\276L\276\276\276L\276\276\276~L\276\276\276L\276\276\276L\276\276\276~L\276\276\276L\276\276\276L\276\276\276~L\276\276\276L\276\276\276L\276\276\276]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276!" + "'", str2, "\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276!");
    }

    @Test
    public void test12221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12221");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215!", "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215!" + "'", str2, "\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215!");
    }

    @Test
    public void test12222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12222");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!", "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!" + "'", str2, "!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!");
    }

    @Test
    public void test12223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12223");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnull]!]]]!]]]!]]nullnullnullnull]!]]]!]]]!]]!", "nullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UELLUELLUELLUELL]!]]]!]]]!]]UELLUELLUELLUELL]!]]]!]]]!]]!" + "'", str2, "UELLUELLUELLUELL]!]]]!]]]!]]UELLUELLUELLUELL]!]]]!]]]!]]!");
    }

    @Test
    public void test12224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12224");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348!", "\340\340!!nullnullnull\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!nullnullnull\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test12225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12225");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d}~\200\200}~\200\200\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d}~\200\200}~\200\200\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d}~\200\200}~\200\200\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12226");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!nulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleff!", "!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282nullnullnull!" + "'", str2, "\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282\u027f\u0280\u0282\u0282nullnullnull!");
    }

    @Test
    public void test12227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12227");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnull\254~\256\256\254~\256\256\254~\256\256\254~\256\256!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull\244\244nullnull\244\244nullnull\244\244nullnull\244\244\254~\256\256\254~\256\256\254~\256\256\254~\256\256!" + "'", str2, "nullnull\244\244nullnull\244\244nullnull\244\244nullnull\244\244\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
    }

    @Test
    public void test12228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12228");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull!", "}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276}~\200\200\276}}}}}}}}}~\200\200\276}}}}}}}}\276\276}~\200\200\276}}}}}}}}}~\200\200\276}}}}}}}}\276\276}~\200\200\276}}}}}}}}}~\200\200\276}}}}}}}}\276\276}~\200\200\276}}}}}}}}}~\200\200\276}}}}}}}}\276\276}~\200\200\276}}}}}}}}}~\200\200\276}}}}}}}}\276\276}~\200\200\276}}}}}}}}}~\200\200\276}}}}}}}}\276\276}~\200\200\276}}}}}}}}}~\200\200\276}}}}}}}}\276\276}~\200\200\276}}}}}}}}}~\200\200\276}}}}}}}}!" + "'", str2, "\276\276}~\200\200\276}}}}}}}}}~\200\200\276}}}}}}}}\276\276}~\200\200\276}}}}}}}}}~\200\200\276}}}}}}}}\276\276}~\200\200\276}}}}}}}}}~\200\200\276}}}}}}}}\276\276}~\200\200\276}}}}}}}}}~\200\200\276}}}}}}}}\276\276}~\200\200\276}}}}}}}}}~\200\200\276}}}}}}}}\276\276}~\200\200\276}}}}}}}}}~\200\200\276}}}}}}}}\276\276}~\200\200\276}}}}}}}}}~\200\200\276}}}}}}}}\276\276}~\200\200\276}}}}}}}}}~\200\200\276}}}}}}}}!");
    }

    @Test
    public void test12229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12229");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!!!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!!!", "}~!!!\200\200}~!!!\200\200}~!!!\200\200}~!!!\200\200~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~}~!!!\200\200}~!!!\200\200}~!!!\200\200}~!!!\200\200~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!!!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!!!" + "'", str2, "!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!!!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!!!");
    }

    @Test
    public void test12230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12230");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```!", "\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7!!nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7LL```!" + "'", str2, "\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7LL```!");
    }

    @Test
    public void test12231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12231");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NUUU!UUU!UUU!UUU!UUUNUUU!UUU!UUU!", "nullnull!!nullnull!!nullnull!!nullnull!!nullnullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnullnull!!nullnullnullnullnull!!nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0111\u0112\u0112\u0112\u0112\u0112\u0112\u0112\u0112\u0112\u0112\u0112\u0112\u0112\u0112\u0112\u0111\u0112\u0112\u0112\u0112\u0112\u0112\u0112\u0112\u0112!" + "'", str2, "\u0111\u0112\u0112\u0112\u0112\u0112\u0112\u0112\u0112\u0112\u0112\u0112\u0112\u0112\u0112\u0112\u0111\u0112\u0112\u0112\u0112\u0112\u0112\u0112\u0112\u0112!");
    }

    @Test
    public void test12232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12232");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150]]!", "!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUULLUULLUULLUU~}}^LLUULLUULLUULLUU]]!" + "'", str2, "LLUULLUULLUULLUU~}}^LLUULLUULLUULLUU]]!");
    }

    @Test
    public void test12233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12233");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214!", "\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!" + "'", str2, "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!");
    }

    @Test
    public void test12234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12234");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NLLL\256\254\254NLLL\256\254\254!!NLLL\256\254\254NLLL\256\254\254!!NLLL\256\254\254NLLL\256\254\254!!NLLL\256\254\254NLLL\256\254\254!!NLLL\256\254\254NLLL\256\254\254!!NLLL\256\254\254NLLL\256\254\254!!NLLL\256\254\254NLLL\256\254\254!!NLLL\256\254\254NLLL\256\254\254!!!", "\u019d!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!!" + "'", str2, "nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!!");
    }

    @Test
    public void test12235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12235");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\260\260ULLLULLL\260\260ULLLULLL}}\260\260ULLLULLL\260\260ULLLULLL}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test12236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12236");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!nullnullnull!!!!nullnullnull!!!", "}~\200\200}~\200\200NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU}~\200\200}~\200\200NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LNUULNUULNUU!!!!LNUULNUULNUU!!!" + "'", str2, "!!LNUULNUULNUU!!!!LNUULNUULNUU!!!");
    }

    @Test
    public void test12237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12237");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "NULLNULL!!NULLNULL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12238");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348!", "\u017d\u017d\u017d\u017d\260\255\255\225\230\230\u017d\u017d\u017d\u017d\260\255\255\225\230\230\u017d\u017d\u017d\u017d\260\255\255\225\230\230\u017d\u017d\u017d\u017d\260\255\255\225\230\230\200\u017d\u017d\u017d\u017d\260\255\255\225\230\230\u017d\u017d\u017d\u017d\260\255\255\225\230\230\u017d\u017d\u017d\u017d\260\255\255\225\230\230\u017d\u017d\u017d\u017d\260\255\255\225\230\230]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test12239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12239");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242}~\200\200}~\200\200\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull!" + "'", str2, "}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12240");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null^nullnullnull^nullnullnull^nullnullnull^nullnull\256null^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnull!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUU^UUUUUUUUUUUU^UUUUUUUUUUUU^UUUUUUUUUUUU^UUUUUUUU\256UUUU^UUUUUUUUUUUU^UUUUUUUUUUUU^UUUUUUUUUUUU^UUUUUUUUUUUU^UUUUUUUUUUUU^UUUUUUUUUUUU^UUUUUUUUUUUU^UUUUUUUUUUUU^UUUUUUUUUUUU^UUUUUUUUUUUU^UUUUUUUUUUUU^UUUUUUUU!" + "'", str2, "UUUU^UUUUUUUUUUUU^UUUUUUUUUUUU^UUUUUUUUUUUU^UUUUUUUU\256UUUU^UUUUUUUUUUUU^UUUUUUUUUUUU^UUUUUUUUUUUU^UUUUUUUUUUUU^UUUUUUUUUUUU^UUUUUUUUUUUU^UUUUUUUUUUUU^UUUUUUUUUUUU^UUUUUUUUUUUU^UUUUUUUUUUUU^UUUUUUUUUUUU^UUUUUUUU!");
    }

    @Test
    public void test12241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12241");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL!", "!aa!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull!" + "'", str2, "^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull!");
    }

    @Test
    public void test12242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12242");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("F]]]F]]]!", "UUUU\256\254\254UUUU\256\254\254!!UUUU\256\254\254UUUU\256\254\254!!UUUU\256\254\254UUUU\256\254\254!!UUUU\256\254\254UUUU\256\254\254!!UUUU\256\254\254UUUU\256\254\254!!UUUU\256\254\254UUUU\256\254\254!!UUUU\256\254\254UUUU\256\254\254!!UUUU\256\254\254UUUU\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null]]]null]]]!" + "'", str2, "null]]]null]]]!");
    }

    @Test
    public void test12243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12243");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULLUULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!", "\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12244");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200u!llnullnullnullu!llnullnullnull}~\200\200}~\200\200u!llnullnullnullu!llnullnullnull}~\200\200}~\200\200u!llnullnullnullu!llnullnullnull}~\200\200}~\200\200\u0348\u0346\u0346!", "!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200L!LLLLLLLLLLLLLLL!LLLLLLLLLLLLLL}~\200\200}~\200\200L!LLLLLLLLLLLLLLL!LLLLLLLLLLLLLL}~\200\200}~\200\200L!LLLLLLLLLLLLLLL!LLLLLLLLLLLLLL}~\200\200}~\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200L!LLLLLLLLLLLLLLL!LLLLLLLLLLLLLL}~\200\200}~\200\200L!LLLLLLLLLLLLLLL!LLLLLLLLLLLLLL}~\200\200}~\200\200L!LLLLLLLLLLLLLLL!LLLLLLLLLLLLLL}~\200\200}~\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test12245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12245");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!", "UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull!" + "'", str2, "\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull!");
    }

    @Test
    public void test12246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12246");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!", "U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\220~~~\220~~~\220~~~\220~~~}}\200\220~~~\220~~~\220~~~\220~~~}}\200\220~~~\220~~~\220~~~\220~~~}}\200\220~~~\220~~~\220~~~\220~~~}}\200\220~~~\220~~~\220~~~\220~~~}}\200\220~~~\220~~~\220~~~\220~~~}}\200\220~~~\220~~~\220~~~\220~~~}}\200\220~~~\220~~~\220~~~\220~~~}}\200\220~~~\220~~~\220~~~\220~~~}}\200\220~~~\220~~~\220~~~\220~~~}}\200\220~~~\220~~~\220~~~\220~~~}}\200\220~~~\220~~~\220~~~\220~~~}}\200\220~~~\220~~~\220~~~\220~~~}}\200\220~~~\220~~~\220~~~\220~~~}}\200\220~~~\220~~~\220~~~\220~~~}}\200\220~~~\220~~~\220~~~\220~~~}}``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!" + "'", str2, "\200\220~~~\220~~~\220~~~\220~~~}}\200\220~~~\220~~~\220~~~\220~~~}}\200\220~~~\220~~~\220~~~\220~~~}}\200\220~~~\220~~~\220~~~\220~~~}}\200\220~~~\220~~~\220~~~\220~~~}}\200\220~~~\220~~~\220~~~\220~~~}}\200\220~~~\220~~~\220~~~\220~~~}}\200\220~~~\220~~~\220~~~\220~~~}}\200\220~~~\220~~~\220~~~\220~~~}}\200\220~~~\220~~~\220~~~\220~~~}}\200\220~~~\220~~~\220~~~\220~~~}}\200\220~~~\220~~~\220~~~\220~~~}}\200\220~~~\220~~~\220~~~\220~~~}}\200\220~~~\220~~~\220~~~\220~~~}}\200\220~~~\220~~~\220~~~\220~~~}}\200\220~~~\220~~~\220~~~\220~~~}}``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!");
    }

    @Test
    public void test12247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12247");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!!", "\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L\214LLL\214LL!!L\214LLL\214LL!!L\214LLL\214LL!!L\214LLL\214LL!!L\214LLL\214LL!!L\214LLL\214LL!!L\214LLL\214LL!!L\214LLL\214LL!!!" + "'", str2, "L\214LLL\214LL!!L\214LLL\214LL!!L\214LLL\214LL!!L\214LLL\214LL!!L\214LLL\214LL!!L\214LLL\214LL!!L\214LLL\214LL!!L\214LLL\214LL!!!");
    }

    @Test
    public void test12248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12248");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UULLUULLUULLUULLUULLUULLUULLUULL\214\214UULLUULLUULLUULLUULLUULLUULLUULL\214\214UULLUULLUULLUULLUULLUULLUULLUULL\214\214UULLUULLUULLUULLUULLUULLUULLUULL\214\214UULLUULLUULLUULLUULLUULLUULLUULL\214\214UULLUULLUULLUULLUULLUULLUULLUULL\214\214UULLUULLUULLUULLUULLUULLUULLUULL\214\214UULLUULLUULLUULLUULLUULLUULLUULL\214\214!", "XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\214\214XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\214\214XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\214\214XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\214\214XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\214\214XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\214\214XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\214\214XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\214\214!" + "'", str2, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\214\214XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\214\214XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\214\214XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\214\214XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\214\214XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\214\214XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\214\214XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\214\214!");
    }

    @Test
    public void test12249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12249");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u017d\u0243\u0243\u017d\u0243\u0243\u017d\u0243\u0243\u017d\u0243\u0243\u017d\u0243\u0243\u017d\u0243\u0243!", "~\200}}~\200}}~\200}}~\200}}nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~\200}}~\200}}~\200}}~\200}}nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLUNLLUNLLUNLLNUNLLnullnullNUNLLnullnullNUNLLnullnullNUNLLnullnullUNLLUNLLUNLLUNLLNUNLLnullnullNUNLLnullnull!" + "'", str2, "UNLLUNLLUNLLUNLLNUNLLnullnullNUNLLnullnullNUNLLnullnullNUNLLnullnullUNLLUNLLUNLLUNLLNUNLLnullnullNUNLLnullnull!");
    }

    @Test
    public void test12250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12250");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!", "\u0366\u0365\u0368\u0368!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL\204\204!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL\204\204!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!!!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL\204\204!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL\204\204!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!!!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL\204\204!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL\204\204!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!!!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL\204\204!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL!ELL\204\204\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test12251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12251");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!", "\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!" + "'", str2, "\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!");
    }

    @Test
    public void test12252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12252");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("XXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxx!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12253");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UUUUUUUU!!UUUUUUUU!!UUUUUUUUUUUUUUUU!!UUUUUUUU!!UUUUUUUU!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNN!!NNNNNNNN!!NNNNNNNNNNNNNNNN!!NNNNNNNN!!NNNNNNNN!" + "'", str2, "NNNNNNNN!!NNNNNNNN!!NNNNNNNNNNNNNNNN!!NNNNNNNN!!NNNNNNNN!");
    }

    @Test
    public void test12254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12254");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276R\266\266~RR\276R\266\266~RR!!\276R\266\266~RR\276R\266\266~RR!!\276R\266\266~RR\276R\266\266~RR\276R\266\266~RR\276R\266\266~RR!!\276R\266\266~RR\276R\266\266~RR!!\276R\266\266~RR\276R\266\266~RR!", "\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!\266\266~!!\276!\266\266~!!!!\276!\266\266~!!\276!\266\266~!!!!\276!\266\266~!!\276!\266\266~!!\276!\266\266~!!\276!\266\266~!!!!\276!\266\266~!!\276!\266\266~!!!!\276!\266\266~!!\276!\266\266~!!!" + "'", str2, "\276!\266\266~!!\276!\266\266~!!!!\276!\266\266~!!\276!\266\266~!!!!\276!\266\266~!!\276!\266\266~!!\276!\266\266~!!\276!\266\266~!!!!\276!\266\266~!!\276!\266\266~!!!!\276!\266\266~!!\276!\266\266~!!!");
    }

    @Test
    public void test12255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12255");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!HHHHHHHH!!HHHHHHHH!!!!HHHHHHHH!!HHHHHHHH!!!!HHHHHHHH!!HHHHHHHH!!!!HHHHHHHH!!HHHHHHHH!!!!HHHHHHHH!!HHHHHHHH!!!!HHHHHHHH!!HHHHHHHH!!!!HHHHHHHH!!HHHHHHHH!!!!HHHHHHHH!!HHHHHHHH!!!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\300\335\335\335\214\300\335\335\335\300\335\335\335\300\335\335\335\214\300\335\335\335\300\335\335\335}~\200\200}~\200\200\300\335\335\335\214\300\335\335\335\300\335\335\335\300\335\335\335\214\300\335\335\335\300\335\335\335}~\200\200}~\200\200\300\335\335\335\214\300\335\335\335\300\335\335\335\300\335\335\335\214\300\335\335\335\300\335\335\335}~\200\200}~\200\200\300\335\335\335\214\300\335\335\335\300\335\335\335\300\335\335\335\214\300\335\335\335\300\335\335\335\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!" + "'", str2, "!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!");
    }

    @Test
    public void test12256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12256");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200null\210nullnullnull\210nullnullnull\210nullnullnull\210nullnull^null\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnull^null\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnull}~\200\200}~\200\200null\210nullnullnull\210nullnullnull\210nullnullnull\210nullnull^null\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnull^null\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnull!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200n!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!ll^n!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!ll^n!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!ll}~\200\200}~\200\200n!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!ll^n!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!ll^n!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!ll!" + "'", str2, "}~\200\200}~\200\200n!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!ll^n!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!ll^n!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!ll}~\200\200}~\200\200n!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!ll^n!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!ll^n!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!lln!ll\210n!lln!ll!");
    }

    @Test
    public void test12257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12257");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\246\246!!\246\246!!!", "]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\246\246!!\246\246!!!" + "'", str2, "\246\246!!\246\246!!!");
    }

    @Test
    public void test12258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12258");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d}~\200\200}~\200\200\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d}~\200\200}~\200\200\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d}~\200\200}~\200\200\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!" + "'", str2, "!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!");
    }

    @Test
    public void test12259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12259");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullrnullnull]nullrnullnullnullrnullnull!nullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnull!nullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnull!nullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnull!nullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnull!nullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnull!nullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnull!nullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnull!nullrnullnull]nullrnullnullnullrnullnullnullrnullnull]nullrnullnullnullrnullnull!", "]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!" + "'", str2, "!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]]!!]]!!!]]!!]]!!]]!!!]]!!]]!");
    }

    @Test
    public void test12260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12260");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}}}}}}}}}}}}}}}}\200}}`}}}}}}}}}}}}}}}}]]!", "RRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}}}}}}}}}}}}}}}}\200}}`}}}}}}}}}}}}}}}}]]!" + "'", str2, "}}}}}}}}}}}}}}}}\200}}`}}}}}}}}}}}}}}}}]]!");
    }

    @Test
    public void test12261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12261");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!", "\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\204\204\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\204\204\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\204\204\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\204\204\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\204\204\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\204\204!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!" + "'", str2, "\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!");
    }

    @Test
    public void test12262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12262");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\230\226\u0346\u0346!nullnull\236\276\276\230\226\u0346\u0346!nullnull\236\276\276!!\230\226\u0346\u0346!nullnull\236\276\276\230\226\u0346\u0346!nullnull\236\276\276!!\230\226\u0346\u0346!nullnull\236\276\276\230\226\u0346\u0346!nullnull\236\276\276\230\226\u0346\u0346!nullnull\236\276\276\230\226\u0346\u0346!nullnull\236\276\276!!\230\226\u0346\u0346!nullnull\236\276\276\230\226\u0346\u0346!nullnull\236\276\276!!\230\226\u0346\u0346!nullnull\236\276\276\230\226\u0346\u0346!nullnull\236\276\276!", "\276\274\273\276\276\274\273\276\276\274\273\276\276\276\274\273\276\276\274\273\276\276\274\273\276\276\276\274\273\276\276\274\273\276\276\274\273\276\276\276\274\273\276\276\274\273\276\276\274\273\276\276\274\273\276\276\274\273\276\276\274\273\276\276\274\273\276\276\274\273\276\276\274\273\276\276\274\273\276\276\274\273\276\276\274\273\276\276\274\273\276\276\274\273\276\276\274\273\276\276\274\273\276\276\274\273\276\276\274\273\276\276\274\273\276\276\276\274\273\276\276\274\273\276\276\274\273\276\276\276\274\273\276\276\274\273\276\276\274\273\276\276\276\274\273\276\276\274\273\276\276\274\273\276\276\276\274\273\276\276\274\273\276\276\274\273\276\276\274\273\276\276\274\273\276\276\274\273\276\276\274\273\276\276\274\273\276\276\274\273\276\276\274\273\276\276\274\273\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\226\u0346\u0346!nullnullnullnullnullnullnullnull\236\276\276\230\226\u0346\u0346!nullnullnullnullnullnullnullnull\236\276\276!!\230\226\u0346\u0346!nullnullnullnullnullnullnullnull\236\276\276\230\226\u0346\u0346!nullnullnullnullnullnullnullnull\236\276\276!!\230\226\u0346\u0346!nullnullnullnullnullnullnullnull\236\276\276\230\226\u0346\u0346!nullnullnullnullnullnullnullnull\236\276\276\230\226\u0346\u0346!nullnullnullnullnullnullnullnull\236\276\276\230\226\u0346\u0346!nullnullnullnullnullnullnullnull\236\276\276!!\230\226\u0346\u0346!nullnullnullnullnullnullnullnull\236\276\276\230\226\u0346\u0346!nullnullnullnullnullnullnullnull\236\276\276!!\230\226\u0346\u0346!nullnullnullnullnullnullnullnull\236\276\276\230\226\u0346\u0346!nullnullnullnullnullnullnullnull\236\276\276!" + "'", str2, "\230\226\u0346\u0346!nullnullnullnullnullnullnullnull\236\276\276\230\226\u0346\u0346!nullnullnullnullnullnullnullnull\236\276\276!!\230\226\u0346\u0346!nullnullnullnullnullnullnullnull\236\276\276\230\226\u0346\u0346!nullnullnullnullnullnullnullnull\236\276\276!!\230\226\u0346\u0346!nullnullnullnullnullnullnullnull\236\276\276\230\226\u0346\u0346!nullnullnullnullnullnullnullnull\236\276\276\230\226\u0346\u0346!nullnullnullnullnullnullnullnull\236\276\276\230\226\u0346\u0346!nullnullnullnullnullnullnullnull\236\276\276!!\230\226\u0346\u0346!nullnullnullnullnullnullnullnull\236\276\276\230\226\u0346\u0346!nullnullnullnullnullnullnullnull\236\276\276!!\230\226\u0346\u0346!nullnullnullnullnullnullnullnull\236\276\276\230\226\u0346\u0346!nullnullnullnullnullnullnullnull\236\276\276!");
    }

    @Test
    public void test12263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12263");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!", "!fhhnullnullnull!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhhnullnullnull!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!" + "'", str2, "!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!");
    }

    @Test
    public void test12264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12264");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!" + "'", str2, "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!");
    }

    @Test
    public void test12265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12265");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\211\211\207\207\211\211\207\207\207\211!!\207\211!!\211\211\207\207\211\211\207\207\207\211!!\207\211!!!", "\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\211\211\207\207\211\211\207\207\207\211!!\207\211!!\211\211\207\207\211\211\207\207\207\211!!\207\211!!!" + "'", str2, "\211\211\207\207\211\211\207\207\207\211!!\207\211!!\211\211\207\207\211\211\207\207\207\211!!\207\211!!!");
    }

    @Test
    public void test12266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12266");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368LL!!\213\213\213\u0346\u0348\u0348!", "\266!!!\266!!!\266!!!\266!!!\200}}`\266!!!\266!!!\266!!!\266!!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!!!!\213\213\213\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!!!!\213\213\213\u0346\u0348\u0348!");
    }

    @Test
    public void test12267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12267");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0346\u013e\u0346\u0346\u0346\u0346\u0346\u0346\u013e\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u013e\u0346\u0346\u0346\u0346\u0346\u0346\u013e\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u013e\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u013e\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u013e\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u013e\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u013e\u0346\u0346\u0346\u0346\u0346\u0346\u013e\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u013e\u0346\u0346\u0346\u0346\u0346\u0346\u013e\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!", "^^^^]HHnullnull^^]HHnullnull^^]HHnullnull^^]HHnullnull^^^^^^]HHnullnull^^]HHnullnull^^!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!" + "'", str2, "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!");
    }

    @Test
    public void test12268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12268");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01c8\u01c5\u01c5\u01c5\u01c8\u01c5\u01c5\u01c5!", "JJJJJJJJ!!JJJJJJJJ!!JJJJJJJJ!!JJJJJJJJ!!JJJJJJJJ!!JJJJJJJJ!!JJJJJJJJ!!JJJJJJJJ!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12269");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!!!\200\200\u0346\u0348\u0348!", "`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test12270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12270");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!", "N!UUN!UUUUN!UUN!UUUUN!UUN!UUUUN!UUN!UUUUN!UUN!UUUUN!UUN!UUUUN!UUN!UUUUN!UUN!UUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!" + "'", str2, "!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!");
    }

    @Test
    public void test12271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12271");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!", "LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!" + "'", str2, "!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!");
    }

    @Test
    public void test12272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12272");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "null\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12273");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12274");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0348\u0348\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u0348\u0348\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u0348\u0348\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u0348\u0348\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016eLL\200\u0348\u0348\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u0348\u0348\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u0348\u0348\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u0348\u0348\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016eLL]]!", "\u02eb\u019d\u01a0\u01a0\u019d\u01a0\u01a0\u019d\u01a0\u01a0\200\u02eb\u019d\u01a0\u01a0\u019d\u01a0\u01a0\u019d\u01a0\u01a0]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348~~\206\206nullnullnull\206\206\206\206nullnullnull\206\206\206\206nullnullnull\206\206\u0348\u0348~~\206\206nullnullnull\206\206\206\206nullnullnull\206\206\206\206nullnullnull\206\206\u0348\u0348~~\206\206nullnullnull\206\206\206\206nullnullnull\206\206\206\206nullnullnull\206\206\u0348\u0348~~\206\206nullnullnull\206\206\206\206nullnullnull\206\206\206\206nullnullnull\206\206\200\u0348\u0348~~\206\206nullnullnull\206\206\206\206nullnullnull\206\206\206\206nullnullnull\206\206\u0348\u0348~~\206\206nullnullnull\206\206\206\206nullnullnull\206\206\206\206nullnullnull\206\206\u0348\u0348~~\206\206nullnullnull\206\206\206\206nullnullnull\206\206\206\206nullnullnull\206\206\u0348\u0348~~\206\206nullnullnull\206\206\206\206nullnullnull\206\206\206\206nullnullnull\206\206]]!" + "'", str2, "\u0348\u0348~~\206\206nullnullnull\206\206\206\206nullnullnull\206\206\206\206nullnullnull\206\206\u0348\u0348~~\206\206nullnullnull\206\206\206\206nullnullnull\206\206\206\206nullnullnull\206\206\u0348\u0348~~\206\206nullnullnull\206\206\206\206nullnullnull\206\206\206\206nullnullnull\206\206\u0348\u0348~~\206\206nullnullnull\206\206\206\206nullnullnull\206\206\206\206nullnullnull\206\206\200\u0348\u0348~~\206\206nullnullnull\206\206\206\206nullnullnull\206\206\206\206nullnullnull\206\206\u0348\u0348~~\206\206nullnullnull\206\206\206\206nullnullnull\206\206\206\206nullnullnull\206\206\u0348\u0348~~\206\206nullnullnull\206\206\206\206nullnullnull\206\206\206\206nullnullnull\206\206\u0348\u0348~~\206\206nullnullnull\206\206\206\206nullnullnull\206\206\206\206nullnullnull\206\206]]!");
    }

    @Test
    public void test12275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12275");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01a8\u01a8\u01a6\u01a6\u01a8\u01a8\u01a6\u01a6\u01a8\u01a8\u01a6\u01a6\u01a8\u01a8\u01a6\u01a6}}!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!" + "'", str2, "nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!");
    }

    @Test
    public void test12276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12276");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\300\300\300null\300\300\300null\300\300\300null\300\300\300null\300\300\300null\300\300\300null\300\300\300null\300\300\300!", "l!nnl!nnnullnulll!nnl!nnnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200nullnullnull}~\200\200nullnullnull}~\200\200nullnullnull}~\200\200nullnullnull}~\200\200nullnullnull}~\200\200nullnullnull}~\200\200nullnullnull}~\200\200nullnullnull!" + "'", str2, "}~\200\200nullnullnull}~\200\200nullnullnull}~\200\200nullnullnull}~\200\200nullnullnull}~\200\200nullnullnull}~\200\200nullnullnull}~\200\200nullnullnull}~\200\200nullnullnull!");
    }

    @Test
    public void test12277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12277");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!!!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!!!", "`U```U```U```U```U```U```U```U```U```U```U```U````U```U```U```U```U```U```U```U```U```U```U```U```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!!!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!!!" + "'", str2, "!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!!!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!~!~~~~!~~!~~~!~~~!~~~~!~~!~~~!~~~!!!");
    }

    @Test
    public void test12278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12278");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12279");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254!", "\u014f!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254!" + "'", str2, "\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254!");
    }

    @Test
    public void test12280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12280");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac!", "\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull!" + "'", str2, "^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull!");
    }

    @Test
    public void test12281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12281");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`LNLLLNLLLNLL`LNLLLNLLLNLL!", "\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHHHHHHHHHH\275\275HHHHHHHH\275\275HHHHHHHH\275\275HHHHHHHH\275\275\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHHHHHHHHHH\275\275HHHHHHHH\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12282");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\230\216\216null\230\216\216~~\256\254\254null\230\216\216null\230\216\216~~\256\254\254!!null\230\216\216null\230\216\216~~\256\254\254null\230\216\216null\230\216\216~~\256\254\254!!null\230\216\216null\230\216\216~~\256\254\254null\230\216\216null\230\216\216~~\256\254\254!!null\230\216\216null\230\216\216~~\256\254\254null\230\216\216null\230\216\216~~\256\254\254!!null\230\216\216null\230\216\216~~\256\254\254null\230\216\216null\230\216\216~~\256\254\254!!null\230\216\216null\230\216\216~~\256\254\254null\230\216\216null\230\216\216~~\256\254\254!!null\230\216\216null\230\216\216~~\256\254\254null\230\216\216null\230\216\216~~\256\254\254!!null\230\216\216null\230\216\216~~\256\254\254null\230\216\216null\230\216\216~~\256\254\254!!!", "!UUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "unulluu\230\216\216unulluu\230\216\216~~\256\254\254unulluu\230\216\216unulluu\230\216\216~~\256\254\254!!unulluu\230\216\216unulluu\230\216\216~~\256\254\254unulluu\230\216\216unulluu\230\216\216~~\256\254\254!!unulluu\230\216\216unulluu\230\216\216~~\256\254\254unulluu\230\216\216unulluu\230\216\216~~\256\254\254!!unulluu\230\216\216unulluu\230\216\216~~\256\254\254unulluu\230\216\216unulluu\230\216\216~~\256\254\254!!unulluu\230\216\216unulluu\230\216\216~~\256\254\254unulluu\230\216\216unulluu\230\216\216~~\256\254\254!!unulluu\230\216\216unulluu\230\216\216~~\256\254\254unulluu\230\216\216unulluu\230\216\216~~\256\254\254!!unulluu\230\216\216unulluu\230\216\216~~\256\254\254unulluu\230\216\216unulluu\230\216\216~~\256\254\254!!unulluu\230\216\216unulluu\230\216\216~~\256\254\254unulluu\230\216\216unulluu\230\216\216~~\256\254\254!!!" + "'", str2, "unulluu\230\216\216unulluu\230\216\216~~\256\254\254unulluu\230\216\216unulluu\230\216\216~~\256\254\254!!unulluu\230\216\216unulluu\230\216\216~~\256\254\254unulluu\230\216\216unulluu\230\216\216~~\256\254\254!!unulluu\230\216\216unulluu\230\216\216~~\256\254\254unulluu\230\216\216unulluu\230\216\216~~\256\254\254!!unulluu\230\216\216unulluu\230\216\216~~\256\254\254unulluu\230\216\216unulluu\230\216\216~~\256\254\254!!unulluu\230\216\216unulluu\230\216\216~~\256\254\254unulluu\230\216\216unulluu\230\216\216~~\256\254\254!!unulluu\230\216\216unulluu\230\216\216~~\256\254\254unulluu\230\216\216unulluu\230\216\216~~\256\254\254!!unulluu\230\216\216unulluu\230\216\216~~\256\254\254unulluu\230\216\216unulluu\230\216\216~~\256\254\254!!unulluu\230\216\216unulluu\230\216\216~~\256\254\254unulluu\230\216\216unulluu\230\216\216~~\256\254\254!!!");
    }

    @Test
    public void test12283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12283");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12284");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01a8\u01a8\u01a6\u01a6\u01a8\u01a8\u01a6\u01a6\u01a8\u01a8\u01a6\u01a6\u01a8\u01a8\u01a6\u01a6}}!", "\304\303\303\303\304\303\303\303\303\303\304\303\303\303\304\303\303\303\303\303\304\303\303\303\304\303\303\303\303\303\304\303\303\303\304\303\303\303\303\303\304\303\303\303\304\303\303\303\303\303\304\303\303\303\304\303\303\303\303\303\304\303\303\303\304\303\303\303\303\303\304\303\303\303\304\303\303\303\303\303!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!" + "'", str2, "nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!");
    }

    @Test
    public void test12285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12285");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!", "Lu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!ll!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!" + "'", str2, "!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!");
    }

    @Test
    public void test12286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12286");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!!", "\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!!" + "'", str2, "\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!!");
    }

    @Test
    public void test12287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12287");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!", "}~\200\200}~\200\200\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be}~\200\200}~\200\200\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test12288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12288");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e!", "\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031anullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031anullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12289");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~!", "UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!!UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!!UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!!UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!!UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~!" + "'", str2, "\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~!");
    }

    @Test
    public void test12290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12290");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12291");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253EEEEEEEE\253\253EEEEEEEE\253\253EEEEEEEE\253\253EEEEEEEE\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253EEEEEEEE\253\253EEEEEEEE\253\253!", "null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!!null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!!null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!!null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!!null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!");
    }

    @Test
    public void test12292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12292");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```!", "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031anullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```!" + "'", str2, "LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```!");
    }

    @Test
    public void test12293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12293");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`UNUUUNUUUNUU`UNUUUNUUUNUU!", "!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u029c\u029b\u029c\u029c\u029c\u029b\u029c\u029c\u029c\u029b\u029c\u029c\u029c\u029b\u029c\u029c\u029c\u029b\u029c\u029c\u029c\u029b\u029c\u029c!" + "'", str2, "\u029c\u029b\u029c\u029c\u029c\u029b\u029c\u029c\u029c\u029b\u029c\u029c\u029c\u029b\u029c\u029c\u029c\u029b\u029c\u029c\u029c\u029b\u029c\u029c!");
    }

    @Test
    public void test12294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12294");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!!", "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\300\300~\300\300\300\300\300\300~\300\300\300\300!!\300\300~\300\300\300\300\300\300~\300\300\300\300!!\300\300~\300\300\300\300\300\300~\300\300\300\300!!\300\300~\300\300\300\300\300\300~\300\300\300\300!!\300\300~\300\300\300\300\300\300~\300\300\300\300!!\300\300~\300\300\300\300\300\300~\300\300\300\300!!\300\300~\300\300\300\300\300\300~\300\300\300\300!!\300\300~\300\300\300\300\300\300~\300\300\300\300!!!" + "'", str2, "\300\300~\300\300\300\300\300\300~\300\300\300\300!!\300\300~\300\300\300\300\300\300~\300\300\300\300!!\300\300~\300\300\300\300\300\300~\300\300\300\300!!\300\300~\300\300\300\300\300\300~\300\300\300\300!!\300\300~\300\300\300\300\300\300~\300\300\300\300!!\300\300~\300\300\300\300\300\300~\300\300\300\300!!\300\300~\300\300\300\300\300\300~\300\300\300\300!!\300\300~\300\300\300\300\300\300~\300\300\300\300!!!");
    }

    @Test
    public void test12295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12295");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0317\u031a\u0317\u031a\u0317\u031a\u0317\u031anullnull!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0317\u031a\u0317\u031a\u0317\u031a\u0317\u031anullnullnullnullnullnullnullnull!" + "'", str2, "\u0317\u031a\u0317\u031a\u0317\u031a\u0317\u031anullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12296");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8!luu!luu!luu!luu!luu!luu!luu!luu!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\300\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\300\u0346\u0348\u0348!");
    }

    @Test
    public void test12297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12297");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("KKNNnull!!KKNNnull!!!", "UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~]]UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~]]UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~]]UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~]]UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01c6\u01c6\u01e6\u01e5\u01c6\u01c6\u01e6\u01e5nullnull!!!" + "'", str2, "\u01c6\u01c6\u01e6\u01e5\u01c6\u01c6\u01e6\u01e5nullnull!!!");
    }

    @Test
    public void test12298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12298");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0248\u0246\u0246\u0248\u0246\u0246\u0248\u0246\u0246\u0248\u0246\u0246nullnull!", "~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u013b\u013c\u013e\u013e\u013b\u013c\u013e\u013e\u013b\u013c\u013e\u013e\u013b\u013c\u013e\u013e\u013b\u013c\u013e\u013e\u013b\u013c\u013e\u013e\u013b\u013c\u013e\u013e\u013b\u013c\u013e\u013e!" + "'", str2, "\u013b\u013c\u013e\u013e\u013b\u013c\u013e\u013e\u013b\u013c\u013e\u013e\u013b\u013c\u013e\u013e\u013b\u013c\u013e\u013e\u013b\u013c\u013e\u013e\u013b\u013c\u013e\u013e\u013b\u013c\u013e\u013e!");
    }

    @Test
    public void test12299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12299");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!\200\200!", "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!\200\200!" + "'", str2, "!!!\200\200!");
    }

    @Test
    public void test12300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12300");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!", "VVXXVVXX!!VVXXVVXX!!VVXXVVXX!!VVXXVVXX!!VVXXVVXX!!VVXXVVXX!!VVXXVVXX!!VVXXVVXX!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!V!!!V!!!!VV!!VV!V!!!V!!!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!V!!!V!!!!VV!!VV!V!!!V!!!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!V!!!V!!!!VV!!VV!V!!!V!!!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!V!!!V!!!!VV!!VV!V!!!V!!!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!V!!!V!!!!VV!!VV!V!!!V!!!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!V!!!V!!!!VV!!VV!V!!!V!!!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!V!!!V!!!!VV!!VV!V!!!V!!!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!V!!!V!!!!VV!!VV!V!!!V!!!" + "'", str2, "!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!V!!!V!!!!VV!!VV!V!!!V!!!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!V!!!V!!!!VV!!VV!V!!!V!!!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!V!!!V!!!!VV!!VV!V!!!V!!!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!V!!!V!!!!VV!!VV!V!!!V!!!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!V!!!V!!!!VV!!VV!V!!!V!!!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!V!!!V!!!!VV!!VV!V!!!V!!!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!V!!!V!!!!VV!!VV!V!!!V!!!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!!VV!V!!!V!!!!VV!!VV!V!!!V!!!");
    }

    @Test
    public void test12301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12301");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!", "LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!" + "'", str2, "\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!");
    }

    @Test
    public void test12302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12302");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\253\256\256\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "\u0420\u0420\u0420\u0420!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test12303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12303");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300!", "!!~]!!!]!!!!!!!~]!!!]!!!!!!!!!~]!!!]!!!!!!!~]!!!]!!!!!!!!!~]!!!]!!!!!!!~]!!!]!!!!!!!~]!!!]!!!!!!!~]!!!]!!!!!!!!!~]!!!]!!!!!!!~]!!!]!!!!!!!!!~]!!!]!!!!!!!~]!!!]!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12304");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~NLLLNLLNLLLNLLNLLLNLL\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~NLLLNLLNLLLNLLNLLLNLL]]!", "!~\200\276\276\276\276~~\200\276\276\276\276~~!~\200\276\276\276\276~~\200\276\276\276\276~~!!!~\200\276\276\276\276~~\200\276\276\276\276~~!~\200\276\276\276\276~~\200\276\276\276\276~~!!!~\200\276\276\276\276~~\200\276\276\276\276~~!~\200\276\276\276\276~~\200\276\276\276\276~~!~\200\276\276\276\276~~\200\276\276\276\276~~!~\200\276\276\276\276~~\200\276\276\276\276~~!!!~\200\276\276\276\276~~\200\276\276\276\276~~!~\200\276\276\276\276~~\200\276\276\276\276~~!!!~\200\276\276\276\276~~\200\276\276\276\276~~!~\200\276\276\276\276~~\200\276\276\276\276~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test12305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12305");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!" + "'", str2, "\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!");
    }

    @Test
    public void test12306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12306");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ULLL!ULLLULLLULLL!ULLLULLLULLLULLLULLL!ULLLULLLULLL!ULLLULLLULLLULLLULLL!ULLLULLLULLL!ULLLULLLULLLULLLULLL!ULLLULLLULLL!ULLLULLLULLLULLLULLL!ULLLULLLULLL!ULLLULLLULLLULLLULLL!ULLLULLLULLL!ULLLULLLULLLULLLULLL!ULLLULLLULLL!ULLLULLLULLLULLLULLL!ULLLULLLULLL!ULLLULLLULLLULLL!", "}~\200\200}~\200\200null\304\304\304^null\304\304\304null\304\304\304null\304\304\304^null\304\304\304null\304\304\304}~\200\200}~\200\200null\304\304\304^null\304\304\304null\304\304\304null\304\304\304^null\304\304\304null\304\304\304!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\304LLL!\304LLL\304LLL\304LLL!\304LLL\304LLL\304LLL\304LLL\304LLL!\304LLL\304LLL\304LLL!\304LLL\304LLL\304LLL\304LLL\304LLL!\304LLL\304LLL\304LLL!\304LLL\304LLL\304LLL\304LLL\304LLL!\304LLL\304LLL\304LLL!\304LLL\304LLL\304LLL\304LLL\304LLL!\304LLL\304LLL\304LLL!\304LLL\304LLL\304LLL\304LLL\304LLL!\304LLL\304LLL\304LLL!\304LLL\304LLL\304LLL\304LLL\304LLL!\304LLL\304LLL\304LLL!\304LLL\304LLL\304LLL\304LLL\304LLL!\304LLL\304LLL\304LLL!\304LLL\304LLL\304LLL\304LLL!" + "'", str2, "\304LLL!\304LLL\304LLL\304LLL!\304LLL\304LLL\304LLL\304LLL\304LLL!\304LLL\304LLL\304LLL!\304LLL\304LLL\304LLL\304LLL\304LLL!\304LLL\304LLL\304LLL!\304LLL\304LLL\304LLL\304LLL\304LLL!\304LLL\304LLL\304LLL!\304LLL\304LLL\304LLL\304LLL\304LLL!\304LLL\304LLL\304LLL!\304LLL\304LLL\304LLL\304LLL\304LLL!\304LLL\304LLL\304LLL!\304LLL\304LLL\304LLL\304LLL\304LLL!\304LLL\304LLL\304LLL!\304LLL\304LLL\304LLL\304LLL\304LLL!\304LLL\304LLL\304LLL!\304LLL\304LLL\304LLL\304LLL!");
    }

    @Test
    public void test12307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12307");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\254\256\256\u035c\u035c\u035c\u035c\u035c\u035c\u035c\u035c\u035c\u035c\u035c\u035c\253\254\256\256\u035c\u035c\u035c\u035c\u035c\u035c!", "!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256\u035c\u035c\u035c\u035c\u035c\u035c\u035c\u035c\u035c\u035c\u035c\u035c\253\254\256\256\u035c\u035c\u035c\u035c\u035c\u035c!" + "'", str2, "\253\254\256\256\u035c\u035c\u035c\u035c\u035c\u035c\u035c\u035c\u035c\u035c\u035c\u035c\253\254\256\256\u035c\u035c\u035c\u035c\u035c\u035c!");
    }

    @Test
    public void test12308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12308");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!", "eeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeff!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12309");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!P!!!P!!!P!!!P!!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!null!!!null!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!" + "'", str2, "!null!!!null!!!null!!!null!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!");
    }

    @Test
    public void test12310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12310");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360!", "\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254NL]]NL]]NL]]NL]]NL]]NL]]NL]]NL]]\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254NL]]NL]]NL]]NL]]NL]]NL]]NL]]NL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360!" + "'", str2, "\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360!");
    }

    @Test
    public void test12311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12311");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176!", "EEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12312");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NULLNULL!!NULLNULL!!NULLNULLNULLNULL!!NULLNULL!!NULLNULL!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12313");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("unullxx\200\200\200unullxx\200\200\200]]unullxx\200\200\200unullxx\200\200\200]]unullxx\200\200\200unullxx\200\200\200]]unullxx\200\200\200unullxx\200\200\200]]~}}^unullxx\200\200\200unullxx\200\200\200]]unullxx\200\200\200unullxx\200\200\200]]unullxx\200\200\200unullxx\200\200\200]]unullxx\200\200\200unullxx\200\200\200]]]]!", "UUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnull\200\200\200nullnullnullnullnullnullnull\200\200\200]]nullnullnullnullnullnullnull\200\200\200nullnullnullnullnullnullnull\200\200\200]]nullnullnullnullnullnullnull\200\200\200nullnullnullnullnullnullnull\200\200\200]]nullnullnullnullnullnullnull\200\200\200nullnullnullnullnullnullnull\200\200\200]]~}}^nullnullnullnullnullnullnull\200\200\200nullnullnullnullnullnullnull\200\200\200]]nullnullnullnullnullnullnull\200\200\200nullnullnullnullnullnullnull\200\200\200]]nullnullnullnullnullnullnull\200\200\200nullnullnullnullnullnullnull\200\200\200]]nullnullnullnullnullnullnull\200\200\200nullnullnullnullnullnullnull\200\200\200]]]]!" + "'", str2, "nullnullnullnullnullnullnull\200\200\200nullnullnullnullnullnullnull\200\200\200]]nullnullnullnullnullnullnull\200\200\200nullnullnullnullnullnullnull\200\200\200]]nullnullnullnullnullnullnull\200\200\200nullnullnullnullnullnullnull\200\200\200]]nullnullnullnullnullnullnull\200\200\200nullnullnullnullnullnullnull\200\200\200]]~}}^nullnullnullnullnullnullnull\200\200\200nullnullnullnullnullnullnull\200\200\200]]nullnullnullnullnullnullnull\200\200\200nullnullnullnullnullnullnull\200\200\200]]nullnullnullnullnullnullnull\200\200\200nullnullnullnullnullnullnull\200\200\200]]nullnullnullnullnullnullnull\200\200\200nullnullnullnullnullnullnull\200\200\200]]]]!");
    }

    @Test
    public void test12314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12314");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("L\335LLL\335LL!!L\335LLL\335LL!!L\335LLL\335LLL\335LLL\335LL!!L\335LLL\335LL!!L\335LLL\335LL!", "\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LnLLLnLL!!LnLLLnLL!!LnLLLnLLLnLLLnLL!!LnLLLnLL!!LnLLLnLL!" + "'", str2, "LnLLLnLL!!LnLLLnLL!!LnLLLnLLLnLLLnLL!!LnLLLnLL!!LnLLLnLL!");
    }

    @Test
    public void test12315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12315");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!~]]!~]]!!!~]]!~]]!!!~]]!~]]!~]]!~]]!!!~]]!~]]!!!~]]!~]]!", "````````````````````````````````````````````````````````````````\200}}`````````````````````````````````````````````````````````````````]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~]]!~]]!!!~]]!~]]!!!~]]!~]]!~]]!~]]!!!~]]!~]]!!!~]]!~]]!" + "'", str2, "!~]]!~]]!!!~]]!~]]!!!~]]!~]]!~]]!~]]!!!~]]!~]]!!!~]]!~]]!");
    }

    @Test
    public void test12316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12316");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\230!", "LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\230!" + "'", str2, "!\230!");
    }

    @Test
    public void test12317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12317");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!X!", "LL!!}`}}}`}}}`}}LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!}`}}}`}}}`}}LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!" + "'", str2, "!!!");
    }

    @Test
    public void test12318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12318");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\316\316\316\316\236\276\276\316\316\316\316\236\276\276!!\316\316\316\316\236\276\276\316\316\316\316\236\276\276!!\316\316\316\316\236\276\276\316\316\316\316\236\276\276\316\316\316\316\236\276\276\316\316\316\316\236\276\276!!\316\316\316\316\236\276\276\316\316\316\316\236\276\276!!\316\316\316\316\236\276\276\316\316\316\316\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12319");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UALLUALLAAAAAAAAUALLUALLAAAAAAAAUALLUALLAAAAAAAAUALLUALLAAAAAAAAUALLUALLAAAAAAAAUALLUALLAAAAAAAAUALLUALLAAAAAAAAUALLUALLAAAAAAAA!", "}~\200\200}~\200\200nulllulllulllull^nulllulllulllullnulllulllulllullnulllulllulllull^nulllulllulllullnulllulllulllull}~\200\200}~\200\200nulllulllulllull^nulllulllulllullnulllulllulllullnulllulllulllull^nulllulllulllullnulllulllulllull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L}LLL}LL}}}}}}}}L}LLL}LL}}}}}}}}L}LLL}LL}}}}}}}}L}LLL}LL}}}}}}}}L}LLL}LL}}}}}}}}L}LLL}LL}}}}}}}}L}LLL}LL}}}}}}}}L}LLL}LL}}}}}}}}!" + "'", str2, "L}LLL}LL}}}}}}}}L}LLL}LL}}}}}}}}L}LLL}LL}}}}}}}}L}LLL}LL}}}}}}}}L}LLL}LL}}}}}}}}L}LLL}LL}}}}}}}}L}LLL}LL}}}}}}}}L}LLL}LL}}}}}}}}!");
    }

    @Test
    public void test12320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12320");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8nullnullnullnullnullnullnullnull!", "\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!" + "'", str2, "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!");
    }

    @Test
    public void test12321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12321");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!", "\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULLLULLLULLLULLLULLLULLLULLLULLL!" + "'", str2, "ULLLULLLULLLULLLULLLULLLULLLULLL!");
    }

    @Test
    public void test12322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12322");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "!null!!!null!!!null!!!null!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test12323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12323");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!!null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!!null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!!null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!!null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!", "`!!nullnull!!nullnull!!nullnull`!!nullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^!!U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^!!U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^!!U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^!!U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^!" + "'", str2, "U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^!!U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^!!U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^!!U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^!!U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^U!!!]^^!");
    }

    @Test
    public void test12324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12324");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106!", "\276\276\276\276\275\275\275\276\276\276\276\275\275\275!!\276\276\276\276\275\275\275\276\276\276\276\275\275\275!!\276\276\276\276\275\275\275\276\276\276\276\275\275\275\276\276\276\276\275\275\275\276\276\276\276\275\275\275!!\276\276\276\276\275\275\275\276\276\276\276\275\275\275!!\276\276\276\276\275\275\275\276\276\276\276\275\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12325");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!!!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!!!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!!!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!!!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!", "UL!!UL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!!!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!!!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!!!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!!!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!" + "'", str2, "!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!!!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!!!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!!!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!!!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!");
    }

    @Test
    public void test12326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12326");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368!!!!\213\213\213\u0346\u0348\u0348!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200XX~~XX~~}~\200\200}~\200\200XX~~XX~~}~\200\200}~\200\200XX~~XX~~}~\200\200}~\200\200\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!!!!\213\213\213\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!!!!\213\213\213\u0346\u0348\u0348!");
    }

    @Test
    public void test12327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12327");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!", "!LLL!LLL!LLL!LLL!LLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!" + "'", str2, "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
    }

    @Test
    public void test12328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12328");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test12329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12329");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!LLLLLLLLLLLLLLLL!", "}UNLLUNLLUNLL~}}^}UNLLUNLLUNLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!^^^^^^^^^^^^^^^^!" + "'", str2, "!^^^^^^^^^^^^^^^^!");
    }

    @Test
    public void test12330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12330");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\266\266!!\266\266!!\266\266!!\266\266\u0346\u0348\u0348!", "\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\266\266!!\266\266!!\266\266!!\266\266\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\266\266!!\266\266!!\266\266!!\266\266\u0346\u0348\u0348!");
    }

    @Test
    public void test12331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12331");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12332");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\253\256\256]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test12333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12333");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u02ed\u02ee\u02f0\u02f0\u02ed\u02ee\u02f0\u02f0\u02ed\u02ee\u02f0\u02f0\u02ed\u02ee\u02f0\u02f0!", "!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02ed\u02f0\u02f0\u02ed\u02f0\u02f0\u02ed\u02f0\u02f0\u02ed\u02f0\u02f0!" + "'", str2, "\u02ed\u02f0\u02f0\u02ed\u02f0\u02f0\u02ed\u02f0\u02f0\u02ed\u02f0\u02f0!");
    }

    @Test
    public void test12334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12334");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0346\u0346\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0346\u0346\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0346\u0346\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0346\u0346\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0346\u0346\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0346\u0346\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0346\u0346\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0106\u0107\u0109\u0109\u0346\u0346!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!" + "'", str2, "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!");
    }

    @Test
    public void test12335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12335");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "nullnullnullnull\253\253\253\200}}`nullnullnullnull\253\253\253]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test12336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12336");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275``!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN``!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN``!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\276``!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\275\275!", "\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275``!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull``!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull``!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276``!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\275\275!" + "'", str2, "\275``!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull``!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull``!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276``!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\275\275!");
    }

    @Test
    public void test12337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12337");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!]!!!]!!!!!]!!!]!!!!!]!!!]!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!", "\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!" + "'", str2, "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!");
    }

    @Test
    public void test12338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12338");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u035d\u035d\u035d\u035d\u035d\u035d\u035d\u035d!!!!", "NNNNNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u035d\u035d\u035d\u035d\u035d\u035d\u035d\u035d!!!!" + "'", str2, "\u035d\u035d\u035d\u035d\u035d\u035d\u035d\u035d!!!!");
    }

    @Test
    public void test12339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12339");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NULLNULLNULLNULLNULLNULLNULLNULL!L!!!L!!NULLNULLNULLNULLNULLNULLNULLNULL!L!!!L!!NULLNULLNULLNULLNULLNULLNULLNULL!L!!!L!!NULLNULLNULLNULLNULLNULLNULLNULL!L!!!L!!NULLNULLNULLNULLNULLNULLNULLNULL!L!!!L!!NULLNULLNULLNULLNULLNULLNULLNULL!L!!!L!!NULLNULLNULLNULLNULLNULLNULLNULL!L!!!L!!NULLNULLNULLNULLNULLNULLNULLNULL!L!!!L!!!", "FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!F!!!F!!FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!F!!!F!!FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!F!!!F!!FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!F!!!F!!FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!F!!!F!!FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!F!!!F!!FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!F!!!F!!FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!F!!!F!!!" + "'", str2, "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!F!!!F!!FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!F!!!F!!FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!F!!!F!!FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!F!!!F!!FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!F!!!F!!FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!F!!!F!!FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!F!!!F!!FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!F!!!F!!!");
    }

    @Test
    public void test12340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12340");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170nullnull\225\225\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170nullnull\225\225\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170nullnull\225\225\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170nullnull\225\225\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170nullnull\225\225\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170nullnull\225\225\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170nullnull\225\225\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170nullnull\225\225!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!nullll!nullllnullnullnullnullnullnullnullnull!nullll!nullll\225\225nullnullnullnullnullnullnullnull!nullll!nullllnullnullnullnullnullnullnullnull!nullll!nullll\225\225nullnullnullnullnullnullnullnull!nullll!nullllnullnullnullnullnullnullnullnull!nullll!nullll\225\225nullnullnullnullnullnullnullnull!nullll!nullllnullnullnullnullnullnullnullnull!nullll!nullll\225\225nullnullnullnullnullnullnullnull!nullll!nullllnullnullnullnullnullnullnullnull!nullll!nullll\225\225nullnullnullnullnullnullnullnull!nullll!nullllnullnullnullnullnullnullnullnull!nullll!nullll\225\225nullnullnullnullnullnullnullnull!nullll!nullllnullnullnullnullnullnullnullnull!nullll!nullll\225\225nullnullnullnullnullnullnullnull!nullll!nullllnullnullnullnullnullnullnullnull!nullll!nullll\225\225!" + "'", str2, "nullnullnullnullnullnullnullnull!nullll!nullllnullnullnullnullnullnullnullnull!nullll!nullll\225\225nullnullnullnullnullnullnullnull!nullll!nullllnullnullnullnullnullnullnullnull!nullll!nullll\225\225nullnullnullnullnullnullnullnull!nullll!nullllnullnullnullnullnullnullnullnull!nullll!nullll\225\225nullnullnullnullnullnullnullnull!nullll!nullllnullnullnullnullnullnullnullnull!nullll!nullll\225\225nullnullnullnullnullnullnullnull!nullll!nullllnullnullnullnullnullnullnullnull!nullll!nullll\225\225nullnullnullnullnullnullnullnull!nullll!nullllnullnullnullnullnullnullnullnull!nullll!nullll\225\225nullnullnullnullnullnullnullnull!nullll!nullllnullnullnullnullnullnullnullnull!nullll!nullll\225\225nullnullnullnullnullnullnullnull!nullll!nullllnullnullnullnullnullnullnullnull!nullll!nullll\225\225!");
    }

    @Test
    public void test12341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12341");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0178\u0177\u017a\u017a\u0178\u0177\u017a\u017a\u0178\u0177\u017a\u017a\u0346\u0348\u0348!", "!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test12342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12342");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220!", "\256\256\256\256\256\256\256\256\276\276\266\266\276\276\266\266\256\256\256\256\256\256\256\256\276\276\266\266\276\276\266\266\256\256\256\256\256\256\256\256\276\276\266\266\276\276\266\266\256\256\256\256\256\256\256\256\276\276\266\266\276\276\266\266\256\256\256\256\256\256\256\256\276\276\266\266\276\276\266\266\256\256\256\256\256\256\256\256\276\276\266\266\276\276\266\266\256\256\256\256\256\256\256\256\276\276\266\266\276\276\266\266\256\256\256\256\256\256\256\256\276\276\266\266\276\276\266\266!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\276\256\266\266\220\220\200\276\256\266\266\220\220\200\276\256\266\266\220\220\200\276\256\266\266\220\220\200\276\256\266\266\220\220\200\276\256\266\266\220\220\200\276\256\266\266\220\220\200\276\256\266\266\220\220!" + "'", str2, "\200\276\256\266\266\220\220\200\276\256\266\266\220\220\200\276\256\266\266\220\220\200\276\256\266\266\220\220\200\276\256\266\266\220\220\200\276\256\266\266\220\220\200\276\256\266\266\220\220\200\276\256\266\266\220\220!");
    }

    @Test
    public void test12343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12343");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!!", "\275\276U\225\225\276U\225\225\200\200\276U\225\225\276U\225\225\200\200\276U\225\225\276U\225\225\200\200\276\276U\225\225\276U\225\225\200\200\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!!" + "'", str2, "\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!!");
    }

    @Test
    public void test12344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12344");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\276LUUULUUU\275\276LUUULUUU\225\225\275\276LUUULUUU\275\276LUUULUUU\225\225\275\276LUUULUUU\275\276LUUULUUU\225\225\275\276LUUULUUU\275\276LUUULUUU\225\225\275\276LUUULUUU\275\276LUUULUUU\225\225\275\276LUUULUUU\275\276LUUULUUU\225\225\275\276LUUULUUU\275\276LUUULUUU\225\225\275\276LUUULUUU\275\276LUUULUUU\225\225!", "JJJJJJJJ!!JJJJJJJJ!!JJJJJJJJ!!JJJJJJJJ!!JJJJJJJJ!!JJJJJJJJ!!JJJJJJJJ!!JJJJJJJJ!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225!" + "'", str2, "\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225!");
    }

    @Test
    public void test12345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12345");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c~~!", "UUUU!]UU!]UU!]UU!]UUUUUU!]UU!]UU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~!" + "'", str2, "~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~!");
    }

    @Test
    public void test12346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12346");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!", "\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!" + "'", str2, "!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!");
    }

    @Test
    public void test12347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12347");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "UUUU\260\255\255\225\230\230UUUU\260\255\255\225\230\230UUUU\260\255\255\225\230\230UUUU\260\255\255\225\230\230\200}}`UUUU\260\255\255\225\230\230UUUU\260\255\255\225\230\230UUUU\260\255\255\225\230\230UUUU\260\255\255\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test12348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12348");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u016c\u016e\u016b\u016b\u016c\u016e\u016b\u016b\u016c\u016e\u016b\u016b\u0346\u0348\u0348!", "\230LLL!\230LLL\230LLL\230LLL\230LLL!!\230LLL\230LLL!!\230LLL\230LLL!!\230LLL\230LLL!!\230LLL!\230LLL\230LLL\230LLL\230LLL!!\230LLL\230LLL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test12349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12349");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!!", "U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!u!!!u!!!u!!!u!!\256\254\254!u!!!u!!!u!!!u!!\256\254\254!!!u!!!u!!!u!!!u!!\256\254\254!u!!!u!!!u!!!u!!\256\254\254!!!u!!!u!!!u!!!u!!\256\254\254!u!!!u!!!u!!!u!!\256\254\254!!!u!!!u!!!u!!!u!!\256\254\254!u!!!u!!!u!!!u!!\256\254\254!!!u!!!u!!!u!!!u!!\256\254\254!u!!!u!!!u!!!u!!\256\254\254!!!u!!!u!!!u!!!u!!\256\254\254!u!!!u!!!u!!!u!!\256\254\254!!!u!!!u!!!u!!!u!!\256\254\254!u!!!u!!!u!!!u!!\256\254\254!!!u!!!u!!!u!!!u!!\256\254\254!u!!!u!!!u!!!u!!\256\254\254!!!" + "'", str2, "!u!!!u!!!u!!!u!!\256\254\254!u!!!u!!!u!!!u!!\256\254\254!!!u!!!u!!!u!!!u!!\256\254\254!u!!!u!!!u!!!u!!\256\254\254!!!u!!!u!!!u!!!u!!\256\254\254!u!!!u!!!u!!!u!!\256\254\254!!!u!!!u!!!u!!!u!!\256\254\254!u!!!u!!!u!!!u!!\256\254\254!!!u!!!u!!!u!!!u!!\256\254\254!u!!!u!!!u!!!u!!\256\254\254!!!u!!!u!!!u!!!u!!\256\254\254!u!!!u!!!u!!!u!!\256\254\254!!!u!!!u!!!u!!!u!!\256\254\254!u!!!u!!!u!!!u!!\256\254\254!!!u!!!u!!!u!!!u!!\256\254\254!u!!!u!!!u!!!u!!\256\254\254!!!");
    }

    @Test
    public void test12350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12350");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UL!!UL!!null!\214\214null!\214\214UL!!UL!!null!\214\214null!\214\214UL!!UL!!null!\214\214null!\214\214UL!!UL!!null!\214\214null!\214\214UL!!UL!!null!\214\214null!\214\214UL!!UL!!null!\214\214null!\214\214UL!!UL!!null!\214\214null!\214\214UL!!UL!!null!\214\214null!\214\214!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnullnullnull!\214\214nullnullnullnull!\214\214nullnull!!nullnull!!nullnullnullnull!\214\214nullnullnullnull!\214\214nullnull!!nullnull!!nullnullnullnull!\214\214nullnullnullnull!\214\214nullnull!!nullnull!!nullnullnullnull!\214\214nullnullnullnull!\214\214nullnull!!nullnull!!nullnullnullnull!\214\214nullnullnullnull!\214\214nullnull!!nullnull!!nullnullnullnull!\214\214nullnullnullnull!\214\214nullnull!!nullnull!!nullnullnullnull!\214\214nullnullnullnull!\214\214nullnull!!nullnull!!nullnullnullnull!\214\214nullnullnullnull!\214\214!" + "'", str2, "nullnull!!nullnull!!nullnullnullnull!\214\214nullnullnullnull!\214\214nullnull!!nullnull!!nullnullnullnull!\214\214nullnullnullnull!\214\214nullnull!!nullnull!!nullnullnullnull!\214\214nullnullnullnull!\214\214nullnull!!nullnull!!nullnullnullnull!\214\214nullnullnullnull!\214\214nullnull!!nullnull!!nullnullnullnull!\214\214nullnullnullnull!\214\214nullnull!!nullnull!!nullnullnullnull!\214\214nullnullnullnull!\214\214nullnull!!nullnull!!nullnullnullnull!\214\214nullnullnullnull!\214\214nullnull!!nullnull!!nullnullnullnull!\214\214nullnullnullnull!\214\214!");
    }

    @Test
    public void test12351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12351");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12352");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!", "!\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test12353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12353");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!", "~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnullUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnull~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnullUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnull~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnullUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnull~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnullUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnull~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnullUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnull~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnullUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnull~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnullUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnull~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnullUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!" + "'", str2, "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!");
    }

    @Test
    public void test12354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12354");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!\231\231\231\231\231\231\231\231!!\231\231\231\231\231\231\231\231!!\231\231\231\231\231\231\231\231!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\231\231\231\231\231\231\231\231!!\231\231\231\231\231\231\231\231!!\231\231\231\231\231\231\231\231!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!\231\231\231\231\231\231\231\231!!\231\231\231\231\231\231\231\231!!\231\231\231\231\231\231\231\231!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\231\231\231\231\231\231\231\231!!\231\231\231\231\231\231\231\231!!\231\231\231\231\231\231\231\231!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!\231\231\231\231\231\231\231\231!!\231\231\231\231\231\231\231\231!!\231\231\231\231\231\231\231\231!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\231\231\231\231\231\231\231\231!!\231\231\231\231\231\231\231\231!!\231\231\231\231\231\231\231\231!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test12355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12355");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\367!\372\372\367!\372\372!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\367!nullnull\367!nullnull!" + "'", str2, "\367!nullnull\367!nullnull!");
    }

    @Test
    public void test12356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12356");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!!", "]nullnn]nullnn]nullnn]nullnn]nullnn]nullnn]nullnn]nullnn]nullnn]nullnn]nullnn]nullnn]nullnn]nullnn]nullnn]nullnn\200\200!!\200\200!!\200\200!!\200\200!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!!" + "'", str2, "`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!!");
    }

    @Test
    public void test12357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12357");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276]\276\276\276]\276\276!!\276]\276\276\276]\276\276!!\276]\276\276\276]\276\276\276]\276\276\276]\276\276!!\276]\276\276\276]\276\276!!\276]\276\276\276]\276\276!", "LLNNNNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276]\276\276\276]\276\276!!\276]\276\276\276]\276\276!!\276]\276\276\276]\276\276\276]\276\276\276]\276\276!!\276]\276\276\276]\276\276!!\276]\276\276\276]\276\276!" + "'", str2, "\276]\276\276\276]\276\276!!\276]\276\276\276]\276\276!!\276]\276\276\276]\276\276\276]\276\276\276]\276\276!!\276]\276\276\276]\276\276!!\276]\276\276\276]\276\276!");
    }

    @Test
    public void test12358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12358");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`UNUUUNUUUNUU`UNUUUNUUUNUU!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12359");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!", "\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e]]!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!" + "'", str2, "!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!");
    }

    @Test
    public void test12360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12360");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!UU!!!UU!!UU!!!!!UU!!!UU!!UU!!!!!UU!!!UU!!UU!!!!!UU!!!UU!!UU!!!!!UU!!!UU!!UU!!!!!UU!!!UU!!UU!!!!!UU!!!UU!!UU!!!!!UU!!!UU!!UU!!!!", "]]]]]]]]\214\214]]]]]]]]\214\214]]]]]]]]\214\214]]]]]]]]\214\214]]]]]]]]\214\214]]]]]]]]\214\214]]]]]]]]\214\214]]]]]]]]\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!!nullnull!!nullnull!!!!!nullnull!!!nullnull!!nullnull!!!!!nullnull!!!nullnull!!nullnull!!!!!nullnull!!!nullnull!!nullnull!!!!!nullnull!!!nullnull!!nullnull!!!!!nullnull!!!nullnull!!nullnull!!!!!nullnull!!!nullnull!!nullnull!!!!!nullnull!!!nullnull!!nullnull!!!!" + "'", str2, "!!nullnull!!!nullnull!!nullnull!!!!!nullnull!!!nullnull!!nullnull!!!!!nullnull!!!nullnull!!nullnull!!!!!nullnull!!!nullnull!!nullnull!!!!!nullnull!!!nullnull!!nullnull!!!!!nullnull!!!nullnull!!nullnull!!!!!nullnull!!!nullnull!!nullnull!!!!!nullnull!!!nullnull!!nullnull!!!!");
    }

    @Test
    public void test12361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12361");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!", "\u012e\u012b\u012e\u012e\u012e\u012b\u012e\u012e\u012e\u012b\u012e\u012e\u012e\u012b\u012e\u012e\u012e\u012b\u012e\u012e\u012e\u012b\u012e\u012e\u012e\u012b\u012e\u012e\u012e\u012b\u012e\u012e\u012e\u012b\u012e\u012e\u012e\u012b\u012e\u012e\u012e\u012b\u012e\u012e\u012e\u012b\u012e\u012e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12362");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108!", "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULLLULLLLLULLLULLLLL!!ULLLULLLLLULLLULLLLL!!ULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLL!!ULLLULLLLLULLLULLLLL!!ULLLULLLLLULLLULLLLL!" + "'", str2, "ULLLULLLLLULLLULLLLL!!ULLLULLLLLULLLULLLLL!!ULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLL!!ULLLULLLLLULLLULLLLL!!ULLLULLLLLULLLULLLLL!");
    }

    @Test
    public void test12363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12363");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\225\225\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\225\225\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\225\225\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\225\225\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\225\225\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\225\225\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\225\225\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12364");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\220\220\220!\220\220\220!\220\220\220!\220\220\220!", "!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\220\220\220!\220\220\220!\220\220\220!\220\220\220!" + "'", str2, "!!\220\220\220!\220\220\220!\220\220\220!\220\220\220!");
    }

    @Test
    public void test12365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12365");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null~LLnullnullLLnullnullnull~LLnullnullLLnullnull!!null~LLnullnullLLnullnullnull~LLnullnullLLnullnull!!null~LLnullnullLLnullnullnull~LLnullnullLLnullnullnull~LLnullnullLLnullnullnull~LLnullnullLLnullnull!!null~LLnullnullLLnullnullnull~LLnullnullLLnullnull!!null~LLnullnullLLnullnullnull~LLnullnullLLnullnull!", "LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}U~LLU~LLLL}}LL}}U~LLU~LLLL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}U~LLU~LLLL}}LL}}U~LLU~LLLL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}U~LLU~LLLL}}LL}}U~LLU~LLLL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}U~LLU~LLLL}}LL}}U~LLU~LLLL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}U~LLU~LLLL}}LL}}U~LLU~LLLL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}U~LLU~LLLL}}LL}}U~LLU~LLLL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}U~LLU~LLLL}}LL}}U~LLU~LLLL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}U~LLU~LLLL}}LL}}U~LLU~LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~LLL~}}~LLL~LLL}}~LLL~LLL~LLL~}}~LLL~LLL}}~LLL~LLL!!~LLL~}}~LLL~LLL}}~LLL~LLL~LLL~}}~LLL~LLL}}~LLL~LLL!!~LLL~}}~LLL~LLL}}~LLL~LLL~LLL~}}~LLL~LLL}}~LLL~LLL~LLL~}}~LLL~LLL}}~LLL~LLL~LLL~}}~LLL~LLL}}~LLL~LLL!!~LLL~}}~LLL~LLL}}~LLL~LLL~LLL~}}~LLL~LLL}}~LLL~LLL!!~LLL~}}~LLL~LLL}}~LLL~LLL~LLL~}}~LLL~LLL}}~LLL~LLL!" + "'", str2, "~LLL~}}~LLL~LLL}}~LLL~LLL~LLL~}}~LLL~LLL}}~LLL~LLL!!~LLL~}}~LLL~LLL}}~LLL~LLL~LLL~}}~LLL~LLL}}~LLL~LLL!!~LLL~}}~LLL~LLL}}~LLL~LLL~LLL~}}~LLL~LLL}}~LLL~LLL~LLL~}}~LLL~LLL}}~LLL~LLL~LLL~}}~LLL~LLL}}~LLL~LLL!!~LLL~}}~LLL~LLL}}~LLL~LLL~LLL~}}~LLL~LLL}}~LLL~LLL!!~LLL~}}~LLL~LLL}}~LLL~LLL~LLL~}}~LLL~LLL}}~LLL~LLL!");
    }

    @Test
    public void test12366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12366");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!", "\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!" + "'", str2, "LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!");
    }

    @Test
    public void test12367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12367");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!", "\u0238\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0238\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0238\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0238\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0238\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0238\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0238\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0238\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0236\u0238\u0238\u0238!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test12368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12368");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256!", "}~\200\200}~\200\200\220^nullnull\220^nullnull}~\200\200}~\200\200\220^nullnull\220^nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "vvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxx\253\254\256\256\253\254\256\256vvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxx\253\254\256\256\253\254\256\256vvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxx\253\254\256\256\253\254\256\256vvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxx\253\254\256\256\253\254\256\256vvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxx\253\254\256\256\253\254\256\256vvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxx\253\254\256\256\253\254\256\256vvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxx\253\254\256\256\253\254\256\256vvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxx\253\254\256\256\253\254\256\256!" + "'", str2, "vvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxx\253\254\256\256\253\254\256\256vvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxx\253\254\256\256\253\254\256\256vvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxx\253\254\256\256\253\254\256\256vvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxx\253\254\256\256\253\254\256\256vvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxx\253\254\256\256\253\254\256\256vvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxx\253\254\256\256\253\254\256\256vvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxx\253\254\256\256\253\254\256\256vvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxx\253\254\256\256\253\254\256\256!");
    }

    @Test
    public void test12369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12369");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test12370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12370");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215!", "!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215!" + "'", str2, "\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215!");
    }

    @Test
    public void test12371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12371");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\211\211\207\207\211\211\207\207\207\211!!\207\211!!\211\211\207\207\211\211\207\207\207\211!!\207\211!!!", "\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\211\211\207\207\211\211\207\207\207\211!!\207\211!!\211\211\207\207\211\211\207\207\207\211!!\207\211!!!" + "'", str2, "\211\211\207\207\211\211\207\207\207\211!!\207\211!!\211\211\207\207\211\211\207\207\207\211!!\207\211!!!");
    }

    @Test
    public void test12372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12372");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("U!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UU!", "\u0346\u0348\u0348\u0348\u037b\u037c\u037e\u037e\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnull!" + "'", str2, "null!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnull!");
    }

    @Test
    public void test12373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12373");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200LLUULLUULLUULLUULLUULLUULLUULLUU``LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU``LLUULLUULLUULLUULLUULLUULLUULLUU``LLUULLUULLUULLUULLUULLUULLUULLUU``LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU``LLUULLUULLUULLUULLUULLUULLUULLUU``}~\200\200}~\200\200LLUULLUULLUULLUULLUULLUULLUULLUU``LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU``LLUULLUULLUULLUULLUULLUULLUULLUU``LLUULLUULLUULLUULLUULLUULLUULLUU``LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU``LLUULLUULLUULLUULLUULLUULLUULLUU``}~\200\200}~\200\200LLUULLUULLUULLUULLUULLUULLUULLUU``LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU``LLUULLUULLUULLUULLUULLUULLUULLUU``LLUULLUULLUULLUULLUULLUULLUULLUU``LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU``LLUULLUULLUULLUULLUULLUULLUULLUU``}~\200\200}~\200\200\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12374");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200!", "\u0366\u0365\u0368\u0368\231\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200!" + "'", str2, "\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200!");
    }

    @Test
    public void test12375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12375");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!!", "LUUULUUULUUULUUULLLLLLLL!!!!LUUULUUULUUULUUULLLLLLLL!!!!!!LUUULUUULUUULUUULLLLLLLL!!!!LUUULUUULUUULUUULLLLLLLL!!!!!!LUUULUUULUUULUUULLLLLLLL!!!!LUUULUUULUUULUUULLLLLLLL!!!!!!LUUULUUULUUULUUULLLLLLLL!!!!LUUULUUULUUULUUULLLLLLLL!!!!!!LUUULUUULUUULUUULLLLLLLL!!!!LUUULUUULUUULUUULLLLLLLL!!!!!!LUUULUUULUUULUUULLLLLLLL!!!!LUUULUUULUUULUUULLLLLLLL!!!!!!LUUULUUULUUULUUULLLLLLLL!!!!LUUULUUULUUULUUULLLLLLLL!!!!!!LUUULUUULUUULUUULLLLLLLL!!!!LUUULUUULUUULUUULLLLLLLL!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0202\u020a\u020a\u0202\u020a\u020a\u0202\u0202\u0202\u020a\u020a\u0202\u020a\u020a\u0202\u0202\u0202\u020a\u020a\u0202\u020a\u020a\u0202\u0202\u0202\u020a\u020a\u0202\u020a\u020a\u0202\u0202\u0202\u020a\u020a\u0202\u020a\u020a\u0202\u0202\u0202\u020a\u020a\u0202\u020a\u020a\u0202\u0202\u0202\u020a\u020a\u0202\u020a\u020a\u0202\u0202\u0202\u020a\u020a\u0202\u020a\u020a\u0202\u0202\u0202\u020a\u020a\u0202\u020a\u020a\u0202\u0202\u0202\u020a\u020a\u0202\u020a\u020a\u0202\u0202\u0202\u020a\u020a\u0202\u020a\u020a\u0202\u0202\u0202\u020a\u020a\u0202\u020a\u020a\u0202\u0202\u0202\u020a\u020a\u0202\u020a\u020a\u0202\u0202\u0202\u020a\u020a\u0202\u020a\u020a\u0202\u0202\u0202\u020a\u020a\u0202\u020a\u020a\u0202\u0202\u0202\u020a\u020a\u0202\u020a\u020a\u0202\u0202!!!" + "'", str2, "\u0202\u020a\u020a\u0202\u020a\u020a\u0202\u0202\u0202\u020a\u020a\u0202\u020a\u020a\u0202\u0202\u0202\u020a\u020a\u0202\u020a\u020a\u0202\u0202\u0202\u020a\u020a\u0202\u020a\u020a\u0202\u0202\u0202\u020a\u020a\u0202\u020a\u020a\u0202\u0202\u0202\u020a\u020a\u0202\u020a\u020a\u0202\u0202\u0202\u020a\u020a\u0202\u020a\u020a\u0202\u0202\u0202\u020a\u020a\u0202\u020a\u020a\u0202\u0202\u0202\u020a\u020a\u0202\u020a\u020a\u0202\u0202\u0202\u020a\u020a\u0202\u020a\u020a\u0202\u0202\u0202\u020a\u020a\u0202\u020a\u020a\u0202\u0202\u0202\u020a\u020a\u0202\u020a\u020a\u0202\u0202\u0202\u020a\u020a\u0202\u020a\u020a\u0202\u0202\u0202\u020a\u020a\u0202\u020a\u020a\u0202\u0202\u0202\u020a\u020a\u0202\u020a\u020a\u0202\u0202\u0202\u020a\u020a\u0202\u020a\u020a\u0202\u0202!!!");
    }

    @Test
    public void test12376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12376");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\204LLNN\204\204\204LLNN\204\204!!\204LLNN\204\204\204LLNN\204\204!!\204LLNN\204\204\204LLNN\204\204\204LLNN\204\204\204LLNN\204\204!!\204LLNN\204\204\204LLNN\204\204!!\204LLNN\204\204\204LLNN\204\204!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\204nullnullnullnull\204\204\204nullnullnullnull\204\204!!\204nullnullnullnull\204\204\204nullnullnullnull\204\204!!\204nullnullnullnull\204\204\204nullnullnullnull\204\204\204nullnullnullnull\204\204\204nullnullnullnull\204\204!!\204nullnullnullnull\204\204\204nullnullnullnull\204\204!!\204nullnullnullnull\204\204\204nullnullnullnull\204\204!" + "'", str2, "\204nullnullnullnull\204\204\204nullnullnullnull\204\204!!\204nullnullnullnull\204\204\204nullnullnullnull\204\204!!\204nullnullnullnull\204\204\204nullnullnullnull\204\204\204nullnullnullnull\204\204\204nullnullnullnull\204\204!!\204nullnullnullnull\204\204\204nullnullnullnull\204\204!!\204nullnullnullnull\204\204\204nullnullnullnull\204\204!");
    }

    @Test
    public void test12377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12377");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]]!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]!", "\u013d\u013e\u0140\u0140\u013d\u013e\u0140\u0140nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!}~\200\200}~\200\200}~\200\200}~\200\200!!!}~\200\200}~\200\200}~\200\200}~\200\200!!!}~\200\200}~\200\200}~\200\200}~\200\200!!!}~\200\200}~\200\200}~\200\200}~\200\200!!!}~\200\200}~\200\200}~\200\200}~\200\200!!]]!}~\200\200}~\200\200}~\200\200}~\200\200!!!}~\200\200}~\200\200}~\200\200}~\200\200!!]]!}~\200\200}~\200\200}~\200\200}~\200\200!!!}~\200\200}~\200\200}~\200\200}~\200\200!!]]!}~\200\200}~\200\200}~\200\200}~\200\200!!!}~\200\200}~\200\200}~\200\200}~\200\200!!]]]!}~\200\200}~\200\200}~\200\200}~\200\200!!!}~\200\200}~\200\200}~\200\200}~\200\200!!!}~\200\200}~\200\200}~\200\200}~\200\200!!!}~\200\200}~\200\200}~\200\200}~\200\200!!!}~\200\200}~\200\200}~\200\200}~\200\200!!]]!}~\200\200}~\200\200}~\200\200}~\200\200!!!}~\200\200}~\200\200}~\200\200}~\200\200!!]]!" + "'", str2, "]!}~\200\200}~\200\200}~\200\200}~\200\200!!!}~\200\200}~\200\200}~\200\200}~\200\200!!!}~\200\200}~\200\200}~\200\200}~\200\200!!!}~\200\200}~\200\200}~\200\200}~\200\200!!!}~\200\200}~\200\200}~\200\200}~\200\200!!]]!}~\200\200}~\200\200}~\200\200}~\200\200!!!}~\200\200}~\200\200}~\200\200}~\200\200!!]]!}~\200\200}~\200\200}~\200\200}~\200\200!!!}~\200\200}~\200\200}~\200\200}~\200\200!!]]!}~\200\200}~\200\200}~\200\200}~\200\200!!!}~\200\200}~\200\200}~\200\200}~\200\200!!]]]!}~\200\200}~\200\200}~\200\200}~\200\200!!!}~\200\200}~\200\200}~\200\200}~\200\200!!!}~\200\200}~\200\200}~\200\200}~\200\200!!!}~\200\200}~\200\200}~\200\200}~\200\200!!!}~\200\200}~\200\200}~\200\200}~\200\200!!]]!}~\200\200}~\200\200}~\200\200}~\200\200!!!}~\200\200}~\200\200}~\200\200}~\200\200!!]]!");
    }

    @Test
    public void test12378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12378");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("````````\214\214````````\214\214````````\214\214````````\214\214````````\214\214````````\214\214````````\214\214````````\214\214!", "\u02eb\u019d\u01a0\u01a0\u019d\u01a0\u01a0\u019d\u01a0\u01a0\200\u02eb\u019d\u01a0\u01a0\u019d\u01a0\u01a0\u019d\u01a0\u01a0]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````\214\214````````\214\214````````\214\214````````\214\214````````\214\214````````\214\214````````\214\214````````\214\214!" + "'", str2, "````````\214\214````````\214\214````````\214\214````````\214\214````````\214\214````````\214\214````````\214\214````````\214\214!");
    }

    @Test
    public void test12379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12379");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!\220\220!!\220\220!!\220\220!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\220\220!!\220\220!!\220\220!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!\220\220!!\220\220!!\220\220!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\220\220!!\220\220!!\220\220!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!\220\220!!\220\220!!\220\220!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\220\220!!\220\220!!\220\220!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test12380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12380");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12381");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test12382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12382");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!", "hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!!hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!!hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!!hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!!hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a!!!!!!" + "'", str2, "\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a\u038a!!!!!!");
    }

    @Test
    public void test12383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12383");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u025e\u025e\u025e\u025e\u025e\u025enullnull!", "\u038a!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12384");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12385");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("p{ppp{ppp{ppp{pp!p{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{pp!p{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{pp!p{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{pp!p{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{pp!p{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{pp!p{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{pp!p{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{pp!p{ppp{ppp{ppp{ppp{ppp{ppp{ppp{pp!", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H{HHH{HHH{HHH{HH!H{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HH!H{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HH!H{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HH!H{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HH!H{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HH!H{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HH!H{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HH!H{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HH!" + "'", str2, "H{HHH{HHH{HHH{HH!H{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HH!H{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HH!H{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HH!H{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HH!H{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HH!H{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HH!H{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HH!H{HHH{HHH{HHH{HHH{HHH{HHH{HHH{HH!");
    }

    @Test
    public void test12386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12386");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!!", "\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!!" + "'", str2, "LLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!!");
    }

    @Test
    public void test12387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12387");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380!", "\u0366\u0365\u0368\u0368\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380!" + "'", str2, "\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380\u0380!");
    }

    @Test
    public void test12388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12388");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LNLLLNLL\253\253LNLLLNLL\253\253LNLLLNLL\253\253LNLLLNLL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LNLLLNLL\253\253LNLLLNLL\253\253!", "\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\u0174\u0178\u0174\u0174\u0174\u0178\u0174\u0174\253\253\u0174\u0178\u0174\u0174\u0174\u0178\u0174\u0174\253\253\u0174\u0178\u0174\u0174\u0174\u0178\u0174\u0174\253\253\u0174\u0178\u0174\u0174\u0174\u0178\u0174\u0174\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\u0174\u0178\u0174\u0174\u0174\u0178\u0174\u0174\253\253\u0174\u0178\u0174\u0174\u0174\u0178\u0174\u0174\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\u0174\u0178\u0174\u0174\u0174\u0178\u0174\u0174\253\253\u0174\u0178\u0174\u0174\u0174\u0178\u0174\u0174\253\253\u0174\u0178\u0174\u0174\u0174\u0178\u0174\u0174\253\253\u0174\u0178\u0174\u0174\u0174\u0178\u0174\u0174\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\u0174\u0178\u0174\u0174\u0174\u0178\u0174\u0174\253\253\u0174\u0178\u0174\u0174\u0174\u0178\u0174\u0174\253\253!");
    }

    @Test
    public void test12389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12389");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "LNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test12390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12390");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!!", "nullnullnullnull]]]nullnullnullnull]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`acc`acc!!`acc`acc!!`acc`acc!!`acc`acc!!`acc`acc!!`acc`acc!!`acc`acc!!`acc`acc!!!" + "'", str2, "`acc`acc!!`acc`acc!!`acc`acc!!`acc`acc!!`acc`acc!!`acc`acc!!`acc`acc!!`acc`acc!!!");
    }

    @Test
    public void test12391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12391");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215\216\230\230L!~~L!~~L!~~\215\216\230\230L!~~L!~~L!~~\215\216\230\230L!~~L!~~L!~~\215\216\230\230L!~~L!~~L!~~\215\216\230\230L!~~L!~~L!~~\215\216\230\230L!~~L!~~L!~~\215\216\230\230L!~~L!~~L!~~\215\216\230\230L!~~L!~~L!~~!", "\u014e\u014e\u014e\u014c\u014e\u014c\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014c\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014c\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014c\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014c\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014c\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014c\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014c\u014e\u014c~~!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230~!~~~!~~~!~~\215\216\230\230~!~~~!~~~!~~\215\216\230\230~!~~~!~~~!~~\215\216\230\230~!~~~!~~~!~~\215\216\230\230~!~~~!~~~!~~\215\216\230\230~!~~~!~~~!~~\215\216\230\230~!~~~!~~~!~~\215\216\230\230~!~~~!~~~!~~!" + "'", str2, "\215\216\230\230~!~~~!~~~!~~\215\216\230\230~!~~~!~~~!~~\215\216\230\230~!~~~!~~~!~~\215\216\230\230~!~~~!~~~!~~\215\216\230\230~!~~~!~~~!~~\215\216\230\230~!~~~!~~~!~~\215\216\230\230~!~~~!~~~!~~\215\216\230\230~!~~~!~~~!~~!");
    }

    @Test
    public void test12392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12392");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!" + "'", str2, "U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!");
    }

    @Test
    public void test12393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12393");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!", "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!" + "'", str2, "!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!");
    }

    @Test
    public void test12394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12394");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!!", "NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!!" + "'", str2, "NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!!");
    }

    @Test
    public void test12395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12395");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!", "LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LUNNLNNLUNNLNNLUNNLNNLUNNLNNLUNNLNNLUNNLNNLUNNLNNLUNNLNN!" + "'", str2, "LUNNLNNLUNNLNNLUNNLNNLUNNLNNLUNNLNNLUNNLNNLUNNLNNLUNNLNN!");
    }

    @Test
    public void test12396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12396");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UNLL!LUNLLLLLUNLLLLUNLL!LUNLLLLLUNLLLL!!UNLL!LUNLLLLLUNLLLLUNLL!LUNLLLLLUNLLLL!!UNLL!LUNLLLLLUNLLLLUNLL!LUNLLLLLUNLLLLUNLL!LUNLLLLLUNLLLLUNLL!LUNLLLLLUNLLLL!!UNLL!LUNLLLLLUNLLLLUNLL!LUNLLLLLUNLLLL!!UNLL!LUNLLLLLUNLLLLUNLL!LUNLLLLLUNLLLL!", "\u0346\u0348\u0348\u0348\u016c\u016b\u0163\u0163\u016c\u016b\u0163\u0163\u016c\u016b\u0163\u0163\u016c\u016b\u0163\u0163\u016c\u016b\u0163\u0163\u016c\u016b\u0163\u0163\u016c\u016b\u0163\u0163\u016c\u016b\u0163\u0163\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\202\201\204\204!\204\202\201\204\204\204\204\204\202\201\204\204\204\204\202\201\204\204!\204\202\201\204\204\204\204\204\202\201\204\204\204\204!!\202\201\204\204!\204\202\201\204\204\204\204\204\202\201\204\204\204\204\202\201\204\204!\204\202\201\204\204\204\204\204\202\201\204\204\204\204!!\202\201\204\204!\204\202\201\204\204\204\204\204\202\201\204\204\204\204\202\201\204\204!\204\202\201\204\204\204\204\204\202\201\204\204\204\204\202\201\204\204!\204\202\201\204\204\204\204\204\202\201\204\204\204\204\202\201\204\204!\204\202\201\204\204\204\204\204\202\201\204\204\204\204!!\202\201\204\204!\204\202\201\204\204\204\204\204\202\201\204\204\204\204\202\201\204\204!\204\202\201\204\204\204\204\204\202\201\204\204\204\204!!\202\201\204\204!\204\202\201\204\204\204\204\204\202\201\204\204\204\204\202\201\204\204!\204\202\201\204\204\204\204\204\202\201\204\204\204\204!" + "'", str2, "\202\201\204\204!\204\202\201\204\204\204\204\204\202\201\204\204\204\204\202\201\204\204!\204\202\201\204\204\204\204\204\202\201\204\204\204\204!!\202\201\204\204!\204\202\201\204\204\204\204\204\202\201\204\204\204\204\202\201\204\204!\204\202\201\204\204\204\204\204\202\201\204\204\204\204!!\202\201\204\204!\204\202\201\204\204\204\204\204\202\201\204\204\204\204\202\201\204\204!\204\202\201\204\204\204\204\204\202\201\204\204\204\204\202\201\204\204!\204\202\201\204\204\204\204\204\202\201\204\204\204\204\202\201\204\204!\204\202\201\204\204\204\204\204\202\201\204\204\204\204!!\202\201\204\204!\204\202\201\204\204\204\204\204\202\201\204\204\204\204\202\201\204\204!\204\202\201\204\204\204\204\204\202\201\204\204\204\204!!\202\201\204\204!\204\202\201\204\204\204\204\204\202\201\204\204\204\204\202\201\204\204!\204\202\201\204\204\204\204\204\202\201\204\204\204\204!");
    }

    @Test
    public void test12397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12397");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!", "\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d!nullnull!!!" + "'", str2, "\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d\u021d!nullnull!!!");
    }

    @Test
    public void test12398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12398");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8!luu!luu!luu!luu!luu!luu!luu!luu!", "!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test12399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12399");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!", "\275\200!]]\200!]]\200!]]\275\200!]]\200!]]\200!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!" + "'", str2, "!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!");
    }

    @Test
    public void test12400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12400");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12401");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\250\250\246\246\250\250\246\246!", "\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248\u0246\u0246\u0248\u0248!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\246\246\250\250\246\246!" + "'", str2, "\250\250\246\246\250\250\246\246!");
    }

    @Test
    public void test12402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12402");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150!", "\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107nullll!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!" + "'", str2, "!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!");
    }

    @Test
    public void test12403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12403");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!", "L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnull}}nullnull}}nullnullnullnullnullnullnullnullnullnull}}nullnull}}nullnullnullnullnullnullnullnullnullnull}}nullnull}}nullnullnullnullnullnullnullnullnullnull}}nullnull}}nullnullnullnullnullnullnullnullnullnull}}nullnull}}nullnullnullnullnullnullnullnullnullnull}}nullnull}}nullnullnullnullnullnullnullnullnullnull}}nullnull}}nullnullnullnullnullnullnullnullnullnull}}nullnull}}!" + "'", str2, "nullnullnullnullnullnullnullnullnullnull}}nullnull}}nullnullnullnullnullnullnullnullnullnull}}nullnull}}nullnullnullnullnullnullnullnullnullnull}}nullnull}}nullnullnullnullnullnullnullnullnullnull}}nullnull}}nullnullnullnullnullnullnullnullnullnull}}nullnull}}nullnullnullnullnullnullnullnullnullnull}}nullnull}}nullnullnullnullnullnullnullnullnullnull}}nullnull}}nullnullnullnullnullnullnullnullnullnull}}nullnull}}!");
    }

    @Test
    public void test12404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12404");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0243\u0243\u017d\u017d\u0243\u0243\u017d\u017d\u0243\u0243\u017d\u017d\u0243\u0243\u017d\u017d\u0243\u0243\u017d\u017d\u0243\u0243\u017d\u017d\u0243\u0243\u017d\u017d\u0243\u0243\u017d\u017d!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12405");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!", "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02faLIIILIIILIII!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!" + "'", str2, "\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!");
    }

    @Test
    public void test12406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12406");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!", "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c!!!!" + "'", str2, "\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c!!!!");
    }

    @Test
    public void test12407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12407");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!", "`!!!!~~!!~~!!!!~~!!~~!!!!~~!!~~`!!!!~~!!~~!!!!~~!!~~!!!!~~!!~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test12408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12408");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250!", "!!\256\u011anullnull\254\254\256\u011anullnull\254\254!!\256\u011anullnull\254\254\256\u011anullnull\254\254!!\256\u011anullnull\254\254\256\u011anullnull\254\254!!\256\u011anullnull\254\254\256\u011anullnull\254\254!!\256\u011anullnull\254\254\256\u011anullnull\254\254!!\256\u011anullnull\254\254\256\u011anullnull\254\254!!\256\u011anullnull\254\254\256\u011anullnull\254\254!!\256\u011anullnull\254\254\256\u011anullnull\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250!" + "'", str2, "\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250!");
    }

    @Test
    public void test12409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12409");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~!", "\u01de\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01dd\u01de\u01de\u01de!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~!" + "'", str2, "}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~!");
    }

    @Test
    public void test12410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12410");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\270\270\270\270\270\270\270\270!", "^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\270\270\270\270\270\270\270\270!" + "'", str2, "\270\270\270\270\270\270\270\270!");
    }

    @Test
    public void test12411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12411");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU!", "``LNUULUULNUULUU``LNUULUULNUULUU``LNUULUULNUULUU``LNUULUULNUULUU``LNUULUULNUULUU``LNUULUULNUULUU``LNUULUULNUULUU``LNUULUULNUULUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU!" + "'", str2, "\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU!");
    }

    @Test
    public void test12412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12412");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNLLLNLL!!LNLLLNLL!!LNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!", "\u0366\u0365\u0368\u0368vv!!vv!!!!vv!!vv!!!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test12413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12413");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}!\200\200}!\200\200}!\200\200}!\200\200\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215}!\200\200}!\200\200}!\200\200}!\200\200\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215!", "LN!!!!!!LN!!!!!LN!!!!!LN!!!!!!LN!!!!!LN!!!!!LN!!!!!!LN!!!!!LN!!!!!LN!!!!!!LN!!!!!LN!!!!!\200}}`LN!!!!!!LN!!!!!LN!!!!!LN!!!!!!LN!!!!!LN!!!!!LN!!!!!!LN!!!!!LN!!!!!LN!!!!!!LN!!!!!LN!!!!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}!\200\200}!\200\200}!\200\200}!\200\200\230!\215\215\230!\215\215\230!\215\215\230!\215\215\230!\215\215\230!\215\215\230!\215\215\230!\215\215\230!\215\215\230!\215\215\230!\215\215\230!\215\215\230!\215\215\230!\215\215\230!\215\215\230!\215\215}!\200\200}!\200\200}!\200\200}!\200\200\230!\215\215\230!\215\215\230!\215\215\230!\215\215\230!\215\215\230!\215\215\230!\215\215\230!\215\215!" + "'", str2, "}!\200\200}!\200\200}!\200\200}!\200\200\230!\215\215\230!\215\215\230!\215\215\230!\215\215\230!\215\215\230!\215\215\230!\215\215\230!\215\215\230!\215\215\230!\215\215\230!\215\215\230!\215\215\230!\215\215\230!\215\215\230!\215\215\230!\215\215}!\200\200}!\200\200}!\200\200}!\200\200\230!\215\215\230!\215\215\230!\215\215\230!\215\215\230!\215\215\230!\215\215\230!\215\215\230!\215\215!");
    }

    @Test
    public void test12414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12414");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "L!!!L!!!!!L!!!L!!!!!!!L!!!L!!!!!L!!!L!!!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!!!L!!!L!!!!!L!!!L!!!!!!!L!!!L!!!!!L!!!L!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12415");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ELLLELLLELLLELLLELLLELLLELLLELLLELLLELLLELLLELLLELLLELLL!", "!\276\u02eb\u02ebnullnullnullnullnullnullnullnullnullnullnullnull\276\u02eb\u02ebnullnullnullnullnullnullnullnullnullnullnullnull\276\u02eb\u02ebnullnullnullnullnullnullnullnullnullnullnullnull\276\u02eb\u02ebnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1!" + "'", str2, "\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1!");
    }

    @Test
    public void test12416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12416");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12417");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!", "!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!" + "'", str2, "]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!");
    }

    @Test
    public void test12418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12418");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\300\300\300null\300\300\300null\300\300\300null\300\300\300null\300\300\300null\300\300\300null\300\300\300null\300\300\300!", "!\255\256\260\260\255\256\260\260\255\256\260\260\255\256\260\260null\255\256\260\260\255\256\260\260\255\256\260\260null\255\256\260\260\255\256\260\260\255\256\260\260null\255\256\260\260\255\256\260\260\255\256\260\260null\255\256\260\260\255\256\260\260!\255\256\260\260\255\256\260\260\255\256\260\260\255\256\260\260null\255\256\260\260\255\256\260\260\255\256\260\260null\255\256\260\260\255\256\260\260!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\255L\260\260uuu\255L\260\260uuu\255L\260\260uuu\255L\260\260uuu\255L\260\260uuu\255L\260\260uuu\255L\260\260uuu\255L\260\260uuu!" + "'", str2, "\255L\260\260uuu\255L\260\260uuu\255L\260\260uuu\255L\260\260uuu\255L\260\260uuu\255L\260\260uuu\255L\260\260uuu\255L\260\260uuu!");
    }

    @Test
    public void test12419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12419");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\276!\276\276\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\276!\276\276\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be!!\276!\276\276\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\276!\276\276\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be!!\200\200\u0346\u0348\u0348!", "UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\276!\276\276nullnullnullnullnullnullnullnullnullnullnullnull\276!\276\276nullnullnullnullnullnullnullnullnullnullnullnull!!\276!\276\276nullnullnullnullnullnullnullnullnullnullnullnull\276!\276\276nullnullnullnullnullnullnullnullnullnullnullnull!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\276!\276\276nullnullnullnullnullnullnullnullnullnullnullnull\276!\276\276nullnullnullnullnullnullnullnullnullnullnullnull!!\276!\276\276nullnullnullnullnullnullnullnullnullnullnullnull\276!\276\276nullnullnullnullnullnullnullnullnullnullnullnull!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test12420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12420");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!", "!null!!!null!!!null!!!null!!!!!!null!!!null!!!null!!!null!!!!!!!!null!!!null!!!null!!!null!!!!!!null!!!null!!!null!!!null!!!!!!!!null!!!null!!!null!!!null!!!!!!null!!!null!!!null!!!null!!!!!!!!null!!!null!!!null!!!null!!!!!!null!!!null!!!null!!!null!!!!!!!!null!!!null!!!null!!!null!!!!!!null!!!null!!!null!!!null!!!!!!!!null!!!null!!!null!!!null!!!!!!null!!!null!!!null!!!null!!!!!!!!null!!!null!!!null!!!null!!!!!!null!!!null!!!null!!!null!!!!!!!!null!!!null!!!null!!!null!!!!!!null!!!null!!!null!!!null!!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0239\u0239\u0239\u0239\u0239\u0239\u0239\u0239\u0239\u0239\u0239\u0239\u0239\u0239\u0239\u0239\u0239\u0239\u0239\u0239\u0239\u0239\u0239\u0239!" + "'", str2, "\u0239\u0239\u0239\u0239\u0239\u0239\u0239\u0239\u0239\u0239\u0239\u0239\u0239\u0239\u0239\u0239\u0239\u0239\u0239\u0239\u0239\u0239\u0239\u0239!");
    }

    @Test
    public void test12421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12421");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("XXXXXXXX\254\254XXXXXXXX\254\254]]XXXXXXXX\254\254XXXXXXXX\254\254]]\214XXXXXXXX\254\254XXXXXXXX\254\254XXXXXXXX\254\254\214XXXXXXXX\254\254XXXXXXXX\254\254XXXXXXXX\254\254XXXXXXXX\254\254XXXXXXXX\254\254]]XXXXXXXX\254\254XXXXXXXX\254\254]]\214XXXXXXXX\254\254XXXXXXXX\254\254XXXXXXXX\254\254\214XXXXXXXX\254\254XXXXXXXX\254\254XXXXXXXX\254\254!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull\253\253nullnull\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLL\254\254LLLLLLLL\254\254]]LLLLLLLL\254\254LLLLLLLL\254\254]]\214LLLLLLLL\254\254LLLLLLLL\254\254LLLLLLLL\254\254\214LLLLLLLL\254\254LLLLLLLL\254\254LLLLLLLL\254\254LLLLLLLL\254\254LLLLLLLL\254\254]]LLLLLLLL\254\254LLLLLLLL\254\254]]\214LLLLLLLL\254\254LLLLLLLL\254\254LLLLLLLL\254\254\214LLLLLLLL\254\254LLLLLLLL\254\254LLLLLLLL\254\254!" + "'", str2, "LLLLLLLL\254\254LLLLLLLL\254\254]]LLLLLLLL\254\254LLLLLLLL\254\254]]\214LLLLLLLL\254\254LLLLLLLL\254\254LLLLLLLL\254\254\214LLLLLLLL\254\254LLLLLLLL\254\254LLLLLLLL\254\254LLLLLLLL\254\254LLLLLLLL\254\254]]LLLLLLLL\254\254LLLLLLLL\254\254]]\214LLLLLLLL\254\254LLLLLLLL\254\254LLLLLLLL\254\254\214LLLLLLLL\254\254LLLLLLLL\254\254LLLLLLLL\254\254!");
    }

    @Test
    public void test12422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12422");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a~~!", "\275!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^\275!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^\275!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^\275!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^\275\275!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^\275\275!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^\275\275!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^\275\275\275!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^\275!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^\275!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^\275!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^\275\275!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~!" + "'", str2, "nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~!");
    }

    @Test
    public void test12423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12423");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("EEEEEEEEEEEEEEEE!EEE!EEE!EEE!EEEEEEEEEEEEEEEEEEE!EEE!EEE!", "nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnull!nullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test12424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12424");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\204nullnullnullnull\204\204\204nullnullnullnull\204\204!!\204nullnullnullnull\204\204\204nullnullnullnull\204\204!!\204nullnullnullnull\204\204\204nullnullnullnull\204\204\204nullnullnullnull\204\204\204nullnullnullnull\204\204!!\204nullnullnullnull\204\204\204nullnullnullnull\204\204!!\204nullnullnullnull\204\204\204nullnullnullnull\204\204!", "]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!!]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!!]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!!]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!!]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204!!\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204!!\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204!!\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204!!\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204!" + "'", str2, "\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204!!\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204!!\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204!!\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204!!\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204!");
    }

    @Test
    public void test12425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12425");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0317\u031a\u0317\u031a\u0317\u031a\u0317\u031aP`PPP`PP!", "!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!!!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!!!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!!!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!!!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!!!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!!!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!!!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0317\u031a\u0317\u031a\u0317\u031a\u0317\u031anull`nullnullnull`nullnull!" + "'", str2, "\u0317\u031a\u0317\u031a\u0317\u031a\u0317\u031anull`nullnullnull`nullnull!");
    }

    @Test
    public void test12426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12426");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("AA]]AA]]nullnullAA]]AA]]nullnull!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull]]nullnull]]nullnullnullnullnullnullnullnullnullnull]]nullnull]]nullnullnullnullnullnullnullnull!" + "'", str2, "nullnull]]nullnull]]nullnullnullnullnullnullnullnullnullnull]]nullnull]]nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12427");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200FULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULL}~\200\200}~\200\200FULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULL!", "\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126UUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200null`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnull}~\200\200}~\200\200null`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnull!" + "'", str2, "}~\200\200}~\200\200null`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnull}~\200\200}~\200\200null`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnull!");
    }

    @Test
    public void test12428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12428");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca!", "\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12429");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275``uuuuuuuu``uuuuuuuu``uuuuuuuu\276``uuuuuuuu\275\275!", "LL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275``!!!!!!!!``!!!!!!!!``!!!!!!!!\276``!!!!!!!!\275\275!" + "'", str2, "\275``!!!!!!!!``!!!!!!!!``!!!!!!!!\276``!!!!!!!!\275\275!");
    }

    @Test
    public void test12430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12430");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull!!nullnull!!\253\253nullnull!!nullnull!!\253\253nullnull!!nullnull!!\253\253nullnull!!nullnull!!\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull!!nullnull!!\253\253nullnull!!nullnull!!\253\253!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\253\253nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\253\253nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\253\253nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\253\253nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\253\253nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\253\253nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\253\253nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\253\253nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\253\253!");
    }

    @Test
    public void test12431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12431");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200ULLLULLLULLLULLLULLLULLLULLLULLL}~\200\200}~\200\200ULLLULLLULLLULLLULLLULLLULLLULLL!", "!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120}~\200\200}~\200\200\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120!" + "'", str2, "}~\200\200}~\200\200\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120}~\200\200}~\200\200\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120!");
    }

    @Test
    public void test12432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12432");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\254\256\256N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!\253\254\256\256N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!!", "``!!``!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!\253\254\256\256null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!!" + "'", str2, "\253\254\256\256null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!\253\254\256\256null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!null!!!nullnullnullnullnull!!!null!!!!");
    }

    @Test
    public void test12433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12433");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253\254\256\256\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!\253\254\256\256\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!\253\254\256\256null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!" + "'", str2, "\253\254\256\256null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!\253\254\256\256null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
    }

    @Test
    public void test12434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12434");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254]]\214\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\214\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254]]\214\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\214\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~NNN\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~NNN]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254]]\214\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\214\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254]]\214\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\214\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254!" + "'", str2, "\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254]]\214\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\214\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254]]\214\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\214\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254!");
    }

    @Test
    public void test12435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12435");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull\225\225nullnull\225\225\225\225nullnull\225\225nullnull\225\225\225\225!!nullnull\225\225nullnull\225\225\225\225nullnull\225\225nullnull\225\225\225\225!!nullnull\225\225nullnull\225\225\225\225nullnull\225\225nullnull\225\225\225\225!!nullnull\225\225nullnull\225\225\225\225nullnull\225\225nullnull\225\225\225\225!!nullnull\225\225nullnull\225\225\225\225nullnull\225\225nullnull\225\225\225\225!!nullnull\225\225nullnull\225\225\225\225nullnull\225\225nullnull\225\225\225\225!!nullnull\225\225nullnull\225\225\225\225nullnull\225\225nullnull\225\225\225\225!!nullnull\225\225nullnull\225\225\225\225nullnull\225\225nullnull\225\225\225\225!!!", "!!~nullnullnull~~!!!!~nullnullnull~~!!!!!!~nullnullnull~~!!!!~nullnullnull~~!!!!!!~nullnullnull~~!!!!~nullnullnull~~!!!!!!~nullnullnull~~!!!!~nullnullnull~~!!!!!!~nullnullnull~~!!!!~nullnullnull~~!!!!!!~nullnullnull~~!!!!~nullnullnull~~!!!!!!~nullnullnull~~!!!!~nullnullnull~~!!!!!!~nullnullnull~~!!!!~nullnullnull~~!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LUNNLUNN\225\225LUNNLUNN\225\225\225\225LUNNLUNN\225\225LUNNLUNN\225\225\225\225!!LUNNLUNN\225\225LUNNLUNN\225\225\225\225LUNNLUNN\225\225LUNNLUNN\225\225\225\225!!LUNNLUNN\225\225LUNNLUNN\225\225\225\225LUNNLUNN\225\225LUNNLUNN\225\225\225\225!!LUNNLUNN\225\225LUNNLUNN\225\225\225\225LUNNLUNN\225\225LUNNLUNN\225\225\225\225!!LUNNLUNN\225\225LUNNLUNN\225\225\225\225LUNNLUNN\225\225LUNNLUNN\225\225\225\225!!LUNNLUNN\225\225LUNNLUNN\225\225\225\225LUNNLUNN\225\225LUNNLUNN\225\225\225\225!!LUNNLUNN\225\225LUNNLUNN\225\225\225\225LUNNLUNN\225\225LUNNLUNN\225\225\225\225!!LUNNLUNN\225\225LUNNLUNN\225\225\225\225LUNNLUNN\225\225LUNNLUNN\225\225\225\225!!!" + "'", str2, "LUNNLUNN\225\225LUNNLUNN\225\225\225\225LUNNLUNN\225\225LUNNLUNN\225\225\225\225!!LUNNLUNN\225\225LUNNLUNN\225\225\225\225LUNNLUNN\225\225LUNNLUNN\225\225\225\225!!LUNNLUNN\225\225LUNNLUNN\225\225\225\225LUNNLUNN\225\225LUNNLUNN\225\225\225\225!!LUNNLUNN\225\225LUNNLUNN\225\225\225\225LUNNLUNN\225\225LUNNLUNN\225\225\225\225!!LUNNLUNN\225\225LUNNLUNN\225\225\225\225LUNNLUNN\225\225LUNNLUNN\225\225\225\225!!LUNNLUNN\225\225LUNNLUNN\225\225\225\225LUNNLUNN\225\225LUNNLUNN\225\225\225\225!!LUNNLUNN\225\225LUNNLUNN\225\225\225\225LUNNLUNN\225\225LUNNLUNN\225\225\225\225!!LUNNLUNN\225\225LUNNLUNN\225\225\225\225LUNNLUNN\225\225LUNNLUNN\225\225\225\225!!!");
    }

    @Test
    public void test12436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12436");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225!", "\275]]]\275]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225!" + "'", str2, "\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225!");
    }

    @Test
    public void test12437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12437");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!\200\200\u0346\u0348\u0348!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test12438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12438");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!", "!LLUULLUULLUU!LLUULLUULLUU!!!LLUULLUULLUU!LLUULLUULLUU!!!LLUULLUULLUU!LLUULLUULLUU!LLUULLUULLUU!LLUULLUULLUU!!!LLUULLUULLUU!LLUULLUULLUU!!!LLUULLUULLUU!LLUULLUULLUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\256\u0104\u0102\u0102\254\254\256\u0104\u0102\u0102\254\254!!\256\u0104\u0102\u0102\254\254\256\u0104\u0102\u0102\254\254!!\256\u0104\u0102\u0102\254\254\256\u0104\u0102\u0102\254\254!!\256\u0104\u0102\u0102\254\254\256\u0104\u0102\u0102\254\254!!\256\u0104\u0102\u0102\254\254\256\u0104\u0102\u0102\254\254!!\256\u0104\u0102\u0102\254\254\256\u0104\u0102\u0102\254\254!!\256\u0104\u0102\u0102\254\254\256\u0104\u0102\u0102\254\254!!\256\u0104\u0102\u0102\254\254\256\u0104\u0102\u0102\254\254!" + "'", str2, "!!\256\u0104\u0102\u0102\254\254\256\u0104\u0102\u0102\254\254!!\256\u0104\u0102\u0102\254\254\256\u0104\u0102\u0102\254\254!!\256\u0104\u0102\u0102\254\254\256\u0104\u0102\u0102\254\254!!\256\u0104\u0102\u0102\254\254\256\u0104\u0102\u0102\254\254!!\256\u0104\u0102\u0102\254\254\256\u0104\u0102\u0102\254\254!!\256\u0104\u0102\u0102\254\254\256\u0104\u0102\u0102\254\254!!\256\u0104\u0102\u0102\254\254\256\u0104\u0102\u0102\254\254!!\256\u0104\u0102\u0102\254\254\256\u0104\u0102\u0102\254\254!");
    }

    @Test
    public void test12439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12439");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]NNN]NNN]NNN]NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN]NNN]NNN]NNN]NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!", "LLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]\215\215\215]\215\215\215]\215\215\215]\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215]\215\215\215]\215\215\215]\215\215\215]\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215!" + "'", str2, "]\215\215\215]\215\215\215]\215\215\215]\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215]\215\215\215]\215\215\215]\215\215\215]\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215!");
    }

    @Test
    public void test12440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12440");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!", "LLLLLUUULUUULUUULUUULLLLLUUULUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!" + "'", str2, "]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!");
    }

    @Test
    public void test12441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12441");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``!", "nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``!!nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``!!nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``!!nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``!!nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``!" + "'", str2, "~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``!");
    }

    @Test
    public void test12442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12442");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("u}}}nullu}}}u}}}u}}}nullu}}}u}}}u}}}u}}}u}}}nullu}}}u}}}u}}}nullu}}}u}}}u}}}u}}}u}}}u}}}nullu}}}u}}}u}}}u}}}u}}}u}}}nullu}}}u}}}u}}}u}}}u}}}u}}}nullu}}}u}}}u}}}u}}}u}}}u}}}nullu}}}u}}}u}}}u}}}u}}}nullu}}}u}}}u}}}nullu}}}u}}}u}}}u}}}u}}}nullu}}}u}}}u}}}nullu}}}u}}}u}}}u}}}!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~NLLLNLLNLLLNLLNLLLNLL\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~NLLLNLLNLLLNLLNLLLNLL]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}}}L~NN~}}}~}}}~}}}L~NN~}}}~}}}~}}}~}}}~}}}L~NN~}}}~}}}~}}}L~NN~}}}~}}}~}}}~}}}~}}}~}}}L~NN~}}}~}}}~}}}~}}}~}}}~}}}L~NN~}}}~}}}~}}}~}}}~}}}~}}}L~NN~}}}~}}}~}}}~}}}~}}}~}}}L~NN~}}}~}}}~}}}~}}}~}}}L~NN~}}}~}}}~}}}L~NN~}}}~}}}~}}}~}}}~}}}L~NN~}}}~}}}~}}}L~NN~}}}~}}}~}}}~}}}!" + "'", str2, "~}}}L~NN~}}}~}}}~}}}L~NN~}}}~}}}~}}}~}}}~}}}L~NN~}}}~}}}~}}}L~NN~}}}~}}}~}}}~}}}~}}}~}}}L~NN~}}}~}}}~}}}~}}}~}}}~}}}L~NN~}}}~}}}~}}}~}}}~}}}~}}}L~NN~}}}~}}}~}}}~}}}~}}}~}}}L~NN~}}}~}}}~}}}~}}}~}}}L~NN~}}}~}}}~}}}L~NN~}}}~}}}~}}}~}}}~}}}L~NN~}}}~}}}~}}}L~NN~}}}~}}}~}}}~}}}!");
    }

    @Test
    public void test12443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12443");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276!", "nullnullnullnullnullnullnullnullnullnull\214\214nullnull\214\214nullnullnullnullnullnullnullnullnullnull\214\214nullnull\214\214nullnullnullnullnullnullnullnullnullnull\214\214nullnull\214\214nullnullnullnullnullnullnullnullnullnull\214\214nullnull\214\214nullnullnullnullnullnullnullnullnullnull\214\214nullnull\214\214nullnullnullnullnullnullnullnullnullnull\214\214nullnull\214\214nullnullnullnullnullnullnullnullnullnull\214\214nullnull\214\214nullnullnullnullnullnullnullnullnullnull\214\214nullnull\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276!" + "'", str2, "\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276!");
    }

    @Test
    public void test12444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12444");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e!", "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346dnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12445");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108UU!", "NNNNNNNNNNNNNNNN\200}}`NNNNNNNNNNNNNNNN]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!" + "'", str2, "!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!!NnullNNNnullNN!");
    }

    @Test
    public void test12446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12446");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\253\253\253\200}}`null\253\253\253]]!", "\227\227!!\227\227!!\227\227!!\227\227!!\227\227!!\227\227!!\227\227!!\227\227!!\227\227!!\227\227!!\227\227!!\227\227!!\227\227!!\227\227!!\227\227!!\227\227!!\227\227!!\227\227!!\227\227!!\227\227!!\227\227!!\227\227!!\227\227!!\227\227!!\227\227!!\227\227!!\227\227!!\227\227!!\227\227!!\227\227!!\227\227!!\227\227!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\227\227!!\253\253\253\200}}`\227\227!!\253\253\253]]!" + "'", str2, "\227\227!!\253\253\253\200}}`\227\227!!\253\253\253]]!");
    }

    @Test
    public void test12447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12447");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\300\300\300\300\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\300\300\300\300\u0346\u0348\u0348!");
    }

    @Test
    public void test12448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12448");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "nullnull!!!!!!nullnull!!!!!nullnull!!!!!nullnull!!!!!!nullnull!!!!!nullnull!!!!!nullnull!!!!!!nullnull!!!!!nullnull!!!!!nullnull!!!!!!nullnull!!!!!nullnull!!!!!\200}}`nullnull!!!!!!nullnull!!!!!nullnull!!!!!nullnull!!!!!!nullnull!!!!!nullnull!!!!!nullnull!!!!!!nullnull!!!!!nullnull!!!!!nullnull!!!!!!nullnull!!!!!nullnull!!!!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test12449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12449");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL!!!!LL!", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NN!!!!NN!" + "'", str2, "NN!!!!NN!");
    }

    @Test
    public void test12450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12450");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull!", "]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~!!]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~!!]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~!!]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~!!]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~]]~~~~~~~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12451");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LUUULUUULUUULUUU\200}}`LUUULUUULUUULUUU]]!", "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01da\u01d8\u01d8\u01d8\u01da\u01d8\u01d8\u01d8\u01da\u01d8\u01d8\u01d8\u01da\u01d8\u01d8\u01d8\200\u01da\u01d8\u01d8\u01d8\u01da\u01d8\u01d8\u01d8\u01da\u01d8\u01d8\u01d8\u01da\u01d8\u01d8\u01d8]]!" + "'", str2, "\u01da\u01d8\u01d8\u01d8\u01da\u01d8\u01d8\u01d8\u01da\u01d8\u01d8\u01d8\u01da\u01d8\u01d8\u01d8\200\u01da\u01d8\u01d8\u01d8\u01da\u01d8\u01d8\u01d8\u01da\u01d8\u01d8\u01d8\u01da\u01d8\u01d8\u01d8]]!");
    }

    @Test
    public void test12452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12452");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8!", "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test12453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12453");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\273!\275\275\275!\275\275\275!\275\275\275\273!\275\275\275!\275\275\275!\275\275\275\273!\275\275\275!\275\275\275!\275\275\275\273!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275\273!\275\275\275!\275\275\275!\275\275\275\273!\275\275\275!\275\275\275!\275\275\275\273!\275\275\275!\275\275\275!\275\275\275\273!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\273!\275\275\275!\275\275\275!\275\275\275\273!\275\275\275!\275\275\275!\275\275\275\273!\275\275\275!\275\275\275!\275\275\275\273!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275\273!\275\275\275!\275\275\275!\275\275\275\273!\275\275\275!\275\275\275!\275\275\275\273!\275\275\275!\275\275\275!\275\275\275\273!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!" + "'", str2, "\273!\275\275\275!\275\275\275!\275\275\275\273!\275\275\275!\275\275\275!\275\275\275\273!\275\275\275!\275\275\275!\275\275\275\273!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275\273!\275\275\275!\275\275\275!\275\275\275\273!\275\275\275!\275\275\275!\275\275\275\273!\275\275\275!\275\275\275!\275\275\275\273!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!\275\275\275!");
    }

    @Test
    public void test12454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12454");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN\276!NNNNNNNN!", "\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU!" + "'", str2, "\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU!");
    }

    @Test
    public void test12455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12455");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!!", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!!" + "'", str2, "\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!!");
    }

    @Test
    public void test12456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12456");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NN!!!!NN!", "nullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u020d\u020d\u020d\u020d!" + "'", str2, "\u020d\u020d\u020d\u020d!");
    }

    @Test
    public void test12457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12457");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull!" + "'", str2, "~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12458");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null]]]null]]]!", "\u0366\u0365\u0368\u0368\214\214!!\214\214!!\214\214!!\214\214\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\u0346!!]]]\214\u0346!!]]]!" + "'", str2, "\214\u0346!!]]]\214\u0346!!]]]!");
    }

    @Test
    public void test12459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12459");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "RRRRRRRR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12460");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225!", "\276\u01e0\275\275\276\u01e0\275\275\276\u01e0\275\275\276\u01e0\275\275\276\u01e0\275\275\276\u01e0\275\275\276\u01e0\275\275\276\u01e0\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276\276\u031d\275\275\276\u031d\275\275\275\276\276\u031d\275\275\276\u031d\275\275\225\225\275\276\276\u031d\275\275\276\u031d\275\275\275\276\276\u031d\275\275\276\u031d\275\275\225\225\275\276\276\u031d\275\275\276\u031d\275\275\275\276\276\u031d\275\275\276\u031d\275\275\225\225\275\276\276\u031d\275\275\276\u031d\275\275\275\276\276\u031d\275\275\276\u031d\275\275\225\225\275\276\276\u031d\275\275\276\u031d\275\275\275\276\276\u031d\275\275\276\u031d\275\275\225\225\275\276\276\u031d\275\275\276\u031d\275\275\275\276\276\u031d\275\275\276\u031d\275\275\225\225\275\276\276\u031d\275\275\276\u031d\275\275\275\276\276\u031d\275\275\276\u031d\275\275\225\225\275\276\276\u031d\275\275\276\u031d\275\275\275\276\276\u031d\275\275\276\u031d\275\275\225\225!" + "'", str2, "\275\276\276\u031d\275\275\276\u031d\275\275\275\276\276\u031d\275\275\276\u031d\275\275\225\225\275\276\276\u031d\275\275\276\u031d\275\275\275\276\276\u031d\275\275\276\u031d\275\275\225\225\275\276\276\u031d\275\275\276\u031d\275\275\275\276\276\u031d\275\275\276\u031d\275\275\225\225\275\276\276\u031d\275\275\276\u031d\275\275\275\276\276\u031d\275\275\276\u031d\275\275\225\225\275\276\276\u031d\275\275\276\u031d\275\275\275\276\276\u031d\275\275\276\u031d\275\275\225\225\275\276\276\u031d\275\275\276\u031d\275\275\275\276\276\u031d\275\275\276\u031d\275\275\225\225\275\276\276\u031d\275\275\276\u031d\275\275\275\276\276\u031d\275\275\276\u031d\275\275\225\225\275\276\276\u031d\275\275\276\u031d\275\275\275\276\276\u031d\275\275\276\u031d\275\275\225\225!");
    }

    @Test
    public void test12461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12461");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "nullnullnullnull\362\363\365\365\362\363\365\365\362\363\365\365\362\363\365\365nullnullnullnull\362\363\365\365\362\363\365\365!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12462");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!null!", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0108\u0108!!!" + "'", str2, "\u0108\u0108!!!");
    }

    @Test
    public void test12463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12463");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fadnullnullnulldnullnullnulldnullnullnull!", "!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fanullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fanullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12464");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```!", "nullnull\246\246nullnull\246\246nullnullnullnull\246\246nullnull\246\246nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```!" + "'", str2, "xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```xvxxxvxxxvxxxvxx!!!```!");
    }

    @Test
    public void test12465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12465");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e!!!!!", "\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!" + "'", str2, "UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!");
    }

    @Test
    public void test12466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12466");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200!]!!!!!^!]!!!!!!]!!!!!!]!!!!!^!]!!!!!!]!!!!!}~\200\200}~\200\200!]!!!!!^!]!!!!!!]!!!!!!]!!!!!^!]!!!!!!]!!!!!!", "[[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200!]!!!!!^!]!!!!!!]!!!!!!]!!!!!^!]!!!!!!]!!!!!}~\200\200}~\200\200!]!!!!!^!]!!!!!!]!!!!!!]!!!!!^!]!!!!!!]!!!!!!" + "'", str2, "}~\200\200}~\200\200!]!!!!!^!]!!!!!!]!!!!!!]!!!!!^!]!!!!!!]!!!!!}~\200\200}~\200\200!]!!!!!^!]!!!!!!]!!!!!!]!!!!!^!]!!!!!!]!!!!!!");
    }

    @Test
    public void test12467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12467");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("U!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UU!", "\u02ed\u02f0\u02f0\u02ed\u02f0\u02f0\u02ed\u02f0\u02f0\u02ed\u02f0\u02f0!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UU!" + "'", str2, "U!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UU!");
    }

    @Test
    public void test12468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12468");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLNLLLNLLLNLLL\200}}`NLLLNLLLNLLLNLLL]]!", "~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~!!~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~!!~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~!!~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~!!~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~!!~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~!!~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~!!~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test12469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12469");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360!" + "'", str2, "\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360!");
    }

    @Test
    public void test12470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12470");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\260\260\260\260\u0346\u0348\u0348!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\260\260\260\260\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\260\260\260\260\u0346\u0348\u0348!");
    }

    @Test
    public void test12471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12471");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!L!!\216\254\254!L!!\216\254\254!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!\216\254\254!L!!\216\254\254!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!\216\254\254!L!!\216\254\254!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!\216\254\254!L!!\216\254\254!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!\216\254\254!L!!\216\254\254!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!\216\254\254!L!!\216\254\254!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!\216\254\254!L!!\216\254\254!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!\216\254\254!L!!\216\254\254!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!", "FF]]FF]]FF]]FF]]~}}^FF]]FF]]FF]]FF]]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]!!\216\254\254!]!!\216\254\254!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!\216\254\254!]!!\216\254\254!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!\216\254\254!]!!\216\254\254!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!\216\254\254!]!!\216\254\254!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!\216\254\254!]!!\216\254\254!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!\216\254\254!]!!\216\254\254!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!\216\254\254!]!!\216\254\254!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!\216\254\254!]!!\216\254\254!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!" + "'", str2, "!]!!\216\254\254!]!!\216\254\254!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!\216\254\254!]!!\216\254\254!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!\216\254\254!]!!\216\254\254!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!\216\254\254!]!!\216\254\254!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!\216\254\254!]!!\216\254\254!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!\216\254\254!]!!\216\254\254!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!\216\254\254!]!!\216\254\254!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!\216\254\254!]!!\216\254\254!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!");
    }

    @Test
    public void test12472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12472");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!", "UELLLUEELUEELUEELUEEUELLLUEELUEE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!" + "'", str2, "\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!");
    }

    @Test
    public void test12473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12473");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016enullnull!", "\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12474");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!NN!!NN!!NN!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!NN!!NN!!NN!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0141\u0141\u0141\u0141\u0141\u0141\u0141\u0141\u0141\u0141\u0141\u0141!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "\u0141\u0141\u0141\u0141\u0141\u0141\u0141\u0141\u0141\u0141\u0141\u0141!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test12475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12475");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNNNLNNNLNNNLNNN\276LNNNLNNNLNNNLNNNLNNNLNNNLNNN\276\276LNNNLNNNLNNNLNNNLNNN\276\276LNNNLNNNLNNNLNNNLNNN\276\276LNNNLNNNLNNNLNNNLNNN\276\276LNNNLNNNLNNNLNNN\276LNNNLNNNLNNNLNNNLNNNLNNNLNNN\276\276LNNNLNNNLNNNLNNNLNNN\276\276!", "UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ELLLELLLELLLELLL\276ELLLELLLELLLELLLELLLELLLELLL\276\276ELLLELLLELLLELLLELLL\276\276ELLLELLLELLLELLLELLL\276\276ELLLELLLELLLELLLELLL\276\276ELLLELLLELLLELLL\276ELLLELLLELLLELLLELLLELLLELLL\276\276ELLLELLLELLLELLLELLL\276\276!" + "'", str2, "ELLLELLLELLLELLL\276ELLLELLLELLLELLLELLLELLLELLL\276\276ELLLELLLELLLELLLELLL\276\276ELLLELLLELLLELLLELLL\276\276ELLLELLLELLLELLLELLL\276\276ELLLELLLELLLELLL\276ELLLELLLELLLELLLELLLELLLELLL\276\276ELLLELLLELLLELLLELLL\276\276!");
    }

    @Test
    public void test12476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12476");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u0346\u0348\u0348!", "nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226!!nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test12477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12477");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("N\254NNN\254NN!!N\254NNN\254NN!!N\254NNN\254NNN\254NNN\254NN!!N\254NNN\254NN!!N\254NNN\254NN!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnull~~nullnull~~}~\200\200}~\200\200nullnull~~nullnull~~}~\200\200}~\200\200nullnull~~nullnull~~}~\200\200}~\200\200\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U\254UUU\254UU!!U\254UUU\254UU!!U\254UUU\254UUU\254UUU\254UU!!U\254UUU\254UU!!U\254UUU\254UU!" + "'", str2, "U\254UUU\254UU!!U\254UUU\254UU!!U\254UUU\254UUU\254UUU\254UU!!U\254UUU\254UU!!U\254UUU\254UU!");
    }

    @Test
    public void test12478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12478");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NNNN!NNN!NNN!NNN!NNNNNNN!NNN!NNN!", "\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d!" + "'", str2, "\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d!");
    }

    @Test
    public void test12479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12479");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\215}\215\215\215}\215\215\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\215}\215\215\215}\215\215!", "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\215}\215\215\215}\215\215!");
    }

    @Test
    public void test12480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12480");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253\254\256\256!UUU!UUU!UUU!UUU\253\254\256\256!UUU!UUU!", "!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256!nullnullnull!nullnullnull!nullnullnull!nullnullnull\253\254\256\256!nullnullnull!nullnullnull!" + "'", str2, "\253\254\256\256!nullnullnull!nullnullnull!nullnullnull!nullnullnull\253\254\256\256!nullnullnull!nullnullnull!");
    }

    @Test
    public void test12481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12481");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!~!!!~!!!!!~!!!~!!!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!", "nullnullnullnullZWXXZWXXZWXXZWXXnullnullnullnullZWXXZWXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~!!!~!!!!!~!!!~!!!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!" + "'", str2, "!~!!!~!!!!!~!!!~!!!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!");
    }

    @Test
    public void test12482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12482");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`~\200\200`~\200\200!!`~\200\200`~\200\200!!`~\200\200`~\200\200`~\200\200`~\200\200!!`~\200\200`~\200\200!!`~\200\200`~\200\200!", "}~\200\200}~\200\200\336^LL\336^LL}~\200\200}~\200\200\336^LL\336^LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`~\200\200`~\200\200!!`~\200\200`~\200\200!!`~\200\200`~\200\200`~\200\200`~\200\200!!`~\200\200`~\200\200!!`~\200\200`~\200\200!" + "'", str2, "`~\200\200`~\200\200!!`~\200\200`~\200\200!!`~\200\200`~\200\200`~\200\200`~\200\200!!`~\200\200`~\200\200!!`~\200\200`~\200\200!");
    }

    @Test
    public void test12483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12483");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\253\256\256]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test12484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12484");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("L!LULLLULLL!LULLLULLL!LULLLULLL!LULLLULLL!LULLLULLL!LULLLULLL!LULLLULLL!LULLLULL!", "\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220!\220\216\220\220\220\216\220\220\220!\220\216\220\220\220\216\220\220\220!\220\216\220\220\220\216\220\220\220!\220\216\220\220\220\216\220\220\220!\220\216\220\220\220\216\220\220\220!\220\216\220\220\220\216\220\220\220!\220\216\220\220\220\216\220\220\220!\220\216\220\220\220\216\220\220!" + "'", str2, "\220!\220\216\220\220\220\216\220\220\220!\220\216\220\220\220\216\220\220\220!\220\216\220\220\220\216\220\220\220!\220\216\220\220\220\216\220\220\220!\220\216\220\220\220\216\220\220\220!\220\216\220\220\220\216\220\220\220!\220\216\220\220\220\216\220\220\220!\220\216\220\220\220\216\220\220!");
    }

    @Test
    public void test12485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12485");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("L\204LLL\204LLL\204LLL\204LLLLLLLLLLLLLLLLLLL\204LLL\204LLL\204LLL\204LLLLLLLLLL!", "!!~~!!~~!!!!~~!!~~!!!!~~!!~~!!~~!!~~!!!!~~!!~~!!!!~~!!~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\204nullnullnull\204nullnullnull\204nullnullnull\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204nullnullnull\204nullnullnull\204nullnullnull\204nullnullnullnullnullnullnullnullnullnull!" + "'", str2, "null\204nullnullnull\204nullnullnull\204nullnullnull\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204nullnullnull\204nullnullnull\204nullnullnull\204nullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12486");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!LLL!LLL!LLL!LLLnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!LLL!LLL!LLL!LLLnullnullnullnullnullnullnullnull!", "LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01d8\u01d8\u01d8\u01d8\u01d8\u01d8\u01d8\u01d8\u01d8\u01d8\u01d8\u01d8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01d8\u01d8\u01d8\u01d8\u01d8\u01d8\u01d8\u01d8\u01d8\u01d8\u01d8\u01d8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8!" + "'", str2, "\u01d8\u01d8\u01d8\u01d8\u01d8\u01d8\u01d8\u01d8\u01d8\u01d8\u01d8\u01d8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01d8\u01d8\u01d8\u01d8\u01d8\u01d8\u01d8\u01d8\u01d8\u01d8\u01d8\u01d8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8\u01f5\u01f7\u01f8\u01f8!");
    }

    @Test
    public void test12487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12487");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!", "\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT~}}^\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT\245\245TTTTTTTT]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!" + "'", str2, "!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!");
    }

    @Test
    public void test12488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12488");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230\200}}`L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230]]!", "null!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!null!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!null!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!null!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!null!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230\200}}`L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230]]!" + "'", str2, "L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230\200}}`L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230]]!");
    }

    @Test
    public void test12489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12489");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!", "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!" + "'", str2, "!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!");
    }

    @Test
    public void test12490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12490");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12491");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275``UU``UU``UU\276``UU\275\275!", "\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\u037e\u037e\u037e\u037e\u037e\u037e\276\u037e\u037e\275\275!" + "'", str2, "\275\u037e\u037e\u037e\u037e\u037e\u037e\276\u037e\u037e\275\275!");
    }

    @Test
    public void test12492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12492");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]!", "\u0366\u0365\u0368\u0368\u037e\u037d\u0380\u0380\u037e\u037d\u0380\u0380\u037e\u037d\u0380\u0380\u037e\u037d\u0380\u0380\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!" + "'", str2, "nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!");
    }

    @Test
    public void test12493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12493");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214!", "!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214!" + "'", str2, "\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214!");
    }

    @Test
    public void test12494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12494");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!", "\275\200!!\275\200!!!!\275\200!!\275\200!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12495");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``!", "nullnullnullnull!!UU!!UU!!UU!!UUnullnullnullnull!!UU!!UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``!" + "'", str2, "\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``!");
    }

    @Test
    public void test12496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12496");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230]]!", "\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041dLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041dULL\260\255\255\225\230\230\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041dULL\260\255\255\225\230\230\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041dULL\260\255\255\225\230\230\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041dULL\260\255\255\225\230\230\200\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041dULL\260\255\255\225\230\230\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041dULL\260\255\255\225\230\230\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041dULL\260\255\255\225\230\230\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041dULL\260\255\255\225\230\230]]!" + "'", str2, "\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041dULL\260\255\255\225\230\230\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041dULL\260\255\255\225\230\230\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041dULL\260\255\255\225\230\230\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041dULL\260\255\255\225\230\230\200\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041dULL\260\255\255\225\230\230\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041dULL\260\255\255\225\230\230\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041dULL\260\255\255\225\230\230\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041dULL\260\255\255\225\230\230]]!");
    }

    @Test
    public void test12497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12497");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\226\230LL\226\230LL\226\230LL\226\230LL]!]]]!]]]!]]\226\230LL\226\230LL\226\230LL\226\230LL]!]]]!]]]!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12498");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368]\344\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368]\344\u0346\u0348\u0348!");
    }

    @Test
    public void test12499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12499");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200\u0348\u0346\u0346!", "}!\200\200}!\200\200}!\200\200}!\200\200\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215}!\200\200}!\200\200}!\200\200}!\200\200\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200NN\215\215LNN\215\215NN\215\215NN\215\215LNN\215\215NN\215\215}~\200\200}~\200\200NN\215\215LNN\215\215NN\215\215NN\215\215LNN\215\215NN\215\215}~\200\200}~\200\200NN\215\215LNN\215\215NN\215\215NN\215\215LNN\215\215NN\215\215}~\200\200}~\200\200NN\215\215LNN\215\215NN\215\215NN\215\215LNN\215\215NN\215\215\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200NN\215\215LNN\215\215NN\215\215NN\215\215LNN\215\215NN\215\215}~\200\200}~\200\200NN\215\215LNN\215\215NN\215\215NN\215\215LNN\215\215NN\215\215}~\200\200}~\200\200NN\215\215LNN\215\215NN\215\215NN\215\215LNN\215\215NN\215\215}~\200\200}~\200\200NN\215\215LNN\215\215NN\215\215NN\215\215LNN\215\215NN\215\215\u0348\u0346\u0346!");
    }

    @Test
    public void test12500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12500");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!");
    }
}
