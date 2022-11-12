package ciphers.SimpleSubCipher;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest25 {

    public static boolean debug = false;

    @Test
    public void test12501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12501");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`!!\275\275!!\275\275!!\275\275`!!\275\275!!\275\275!!\275\275!", "]````!!\275]````!!]````!!]````!!\275]````!!]````!!]````!!\275]````!!]````!!]````!!\275]````!!]````!!]````!!\275]````!!]````!!]````!!\275]````!!]````!!]````!!\275]````!!]````!!]````!!\275\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e]````!!\275]````!!]````!!]````!!\275]````!!]````!!]````!!\275]````!!]````!!]````!!\275]````!!]````!!]````!!\275]````!!]````!!]````!!\275]````!!]````!!]````!!\275]````!!]````!!]````!!\275\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!!\275\275!!\275\275!!\275\275`!!\275\275!!\275\275!!\275\275!" + "'", str2, "`!!\275\275!!\275\275!!\275\275`!!\275\275!!\275\275!!\275\275!");
    }

    @Test
    public void test12502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12502");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "UUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test12503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12503");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\230LLL!\230LLL\230LLL\230LLL\230LLL!!\230LLL\230LLL!!\230LLL\230LLL!!\230LLL\230LLL!!\230LLL!\230LLL\230LLL\230LLL\230LLL!!\230LLL\230LLL!!!", "\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull\275\276\u0200\u01fc\u0200\u01fcnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\u01f8\u01f8\u01f8!\230\u01f8\u01f8\u01f8\230\u01f8\u01f8\u01f8\230\u01f8\u01f8\u01f8\230\u01f8\u01f8\u01f8!!\230\u01f8\u01f8\u01f8\230\u01f8\u01f8\u01f8!!\230\u01f8\u01f8\u01f8\230\u01f8\u01f8\u01f8!!\230\u01f8\u01f8\u01f8\230\u01f8\u01f8\u01f8!!\230\u01f8\u01f8\u01f8!\230\u01f8\u01f8\u01f8\230\u01f8\u01f8\u01f8\230\u01f8\u01f8\u01f8\230\u01f8\u01f8\u01f8!!\230\u01f8\u01f8\u01f8\230\u01f8\u01f8\u01f8!!!" + "'", str2, "\230\u01f8\u01f8\u01f8!\230\u01f8\u01f8\u01f8\230\u01f8\u01f8\u01f8\230\u01f8\u01f8\u01f8\230\u01f8\u01f8\u01f8!!\230\u01f8\u01f8\u01f8\230\u01f8\u01f8\u01f8!!\230\u01f8\u01f8\u01f8\230\u01f8\u01f8\u01f8!!\230\u01f8\u01f8\u01f8\230\u01f8\u01f8\u01f8!!\230\u01f8\u01f8\u01f8!\230\u01f8\u01f8\u01f8\230\u01f8\u01f8\u01f8\230\u01f8\u01f8\u01f8\230\u01f8\u01f8\u01f8!!\230\u01f8\u01f8\u01f8\230\u01f8\u01f8\u01f8!!!");
    }

    @Test
    public void test12504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12504");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNN!!!LUNN!!!LUNN!!!LUNN!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNN!!!LUNN!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12505");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!", "\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\200}}`\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!" + "'", str2, "\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!");
    }

    @Test
    public void test12506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12506");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!!", "!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]\200}}`!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!]]!!!]!]]!!!!!]!]]!!!]!]]!!!!!]!]]!!!]!]]!!!!!]!]]!!!]!]]!!!!!]!]]!!!]!]]!!!!!]!]]!!!]!]]!!!!!]!]]!!!]!]]!!!!!]!]]!!!]!]]!!!!!!" + "'", str2, "]!]]!!!]!]]!!!!!]!]]!!!]!]]!!!!!]!]]!!!]!]]!!!!!]!]]!!!]!]]!!!!!]!]]!!!]!]]!!!!!]!]]!!!]!]]!!!!!]!]]!!!]!]]!!!!!]!]]!!!]!]]!!!!!!");
    }

    @Test
    public void test12507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12507");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336!", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12508");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254NL]]NL]]NL]]NL]]NL]]NL]]NL]]NL]]\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254NL]]NL]]NL]]NL]]NL]]NL]]NL]]NL]]!", "!~HH!~HH\220\220!~HH!~HH\220\220\220!~HH\220\220\220!~HH\220\220\220!~HH\220\220\220!~HH\220\220!~HH!~HH\220\220!~HH!~HH\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!" + "'", str2, "\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!");
    }

    @Test
    public void test12509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12509");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\220\220\220\u0348\u0348!\220\220\220\u0348\u0348!!!\220\220\220\u0348\u0348!\220\220\220\u0348\u0348!!!\220\220\220\u0348\u0348!\220\220\220\u0348\u0348!\220\220\220\u0348\u0348!\220\220\220\u0348\u0348!!!\220\220\220\u0348\u0348!\220\220\220\u0348\u0348!!!\220\220\220\u0348\u0348!\220\220\220\u0348\u0348!" + "'", str2, "!\220\220\220\u0348\u0348!\220\220\220\u0348\u0348!!!\220\220\220\u0348\u0348!\220\220\220\u0348\u0348!!!\220\220\220\u0348\u0348!\220\220\220\u0348\u0348!\220\220\220\u0348\u0348!\220\220\220\u0348\u0348!!!\220\220\220\u0348\u0348!\220\220\220\u0348\u0348!!!\220\220\220\u0348\u0348!\220\220\220\u0348\u0348!");
    }

    @Test
    public void test12510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12510");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\336\335\300\300\336\335\300\300\376\376\336\335\300\300\336\335\300\300\376\376!", "\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12511");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull!!nullnull!!\255\256\260\260\255\256\260\260nullnull!!nullnull!!\255\256\260\260\255\256\260\260nullnull!!nullnull!!\255\256\260\260\255\256\260\260nullnull!!nullnull!!\255\256\260\260\255\256\260\260nullnull!!nullnull!!\255\256\260\260\255\256\260\260nullnull!!nullnull!!\255\256\260\260\255\256\260\260nullnull!!nullnull!!\255\256\260\260\255\256\260\260nullnull!!nullnull!!\255\256\260\260\255\256\260\260!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnnnullnullnn!!nullnullnnnullnullnn!!\255\256\260\260\255\256\260\260nullnullnnnullnullnn!!nullnullnnnullnullnn!!\255\256\260\260\255\256\260\260nullnullnnnullnullnn!!nullnullnnnullnullnn!!\255\256\260\260\255\256\260\260nullnullnnnullnullnn!!nullnullnnnullnullnn!!\255\256\260\260\255\256\260\260nullnullnnnullnullnn!!nullnullnnnullnullnn!!\255\256\260\260\255\256\260\260nullnullnnnullnullnn!!nullnullnnnullnullnn!!\255\256\260\260\255\256\260\260nullnullnnnullnullnn!!nullnullnnnullnullnn!!\255\256\260\260\255\256\260\260nullnullnnnullnullnn!!nullnullnnnullnullnn!!\255\256\260\260\255\256\260\260!" + "'", str2, "nullnullnnnullnullnn!!nullnullnnnullnullnn!!\255\256\260\260\255\256\260\260nullnullnnnullnullnn!!nullnullnnnullnullnn!!\255\256\260\260\255\256\260\260nullnullnnnullnullnn!!nullnullnnnullnullnn!!\255\256\260\260\255\256\260\260nullnullnnnullnullnn!!nullnullnnnullnullnn!!\255\256\260\260\255\256\260\260nullnullnnnullnullnn!!nullnullnnnullnullnn!!\255\256\260\260\255\256\260\260nullnullnnnullnullnn!!nullnullnnnullnullnn!!\255\256\260\260\255\256\260\260nullnullnnnullnullnn!!nullnullnnnullnullnn!!\255\256\260\260\255\256\260\260nullnullnnnullnullnn!!nullnullnnnullnullnn!!\255\256\260\260\255\256\260\260!");
    }

    @Test
    public void test12512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12512");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull!", "!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}}!!}}!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}}!!}}~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}}!!}}!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}}!!}}~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}}!!}}!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}}!!}}~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}}!!}}!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}}!!}}~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}}!!}}!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}}!!}}~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}}!!}}!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}}!!}}~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}}!!}}!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}}!!}}~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}}!!}}!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}}!!}}!" + "'", str2, "~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}}!!}}!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}}!!}}~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}}!!}}!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}}!!}}~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}}!!}}!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}}!!}}~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}}!!}}!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}}!!}}~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}}!!}}!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}}!!}}~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}}!!}}!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}}!!}}~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}}!!}}!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}}!!}}~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}}!!}}!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}}!!}}!");
    }

    @Test
    public void test12513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12513");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLL!!!LLLL!!!!", "~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNN!!!NNNN!!!NNNN!!!NNNN!!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNN!!!NNNN!!!!" + "'", str2, "NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNN!!!NNNN!!!NNNN!!!NNNN!!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNN!!!NNNN!!!!");
    }

    @Test
    public void test12514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12514");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u021e\u021e\u021e\u021e\u021e\u021e\u021e\u021e!!!", "\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!" + "'", str2, "!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!");
    }

    @Test
    public void test12515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12515");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b!", "!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b!" + "'", str2, "\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b!");
    }

    @Test
    public void test12516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12516");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!!!!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!!!!!!!!", "FF!!FF!!FF!!FF!!\256\254\254FF!!FF!!FF!!FF!!\256\254\254!!FF!!FF!!FF!!FF!!\256\254\254FF!!FF!!FF!!FF!!\256\254\254!!FF!!FF!!FF!!FF!!\256\254\254FF!!FF!!FF!!FF!!\256\254\254!!FF!!FF!!FF!!FF!!\256\254\254FF!!FF!!FF!!FF!!\256\254\254!!FF!!FF!!FF!!FF!!\256\254\254FF!!FF!!FF!!FF!!\256\254\254!!FF!!FF!!FF!!FF!!\256\254\254FF!!FF!!FF!!FF!!\256\254\254!!FF!!FF!!FF!!FF!!\256\254\254FF!!FF!!FF!!FF!!\256\254\254!!FF!!FF!!FF!!FF!!\256\254\254FF!!FF!!FF!!FF!!\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!!!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!!!!!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!!!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!!!!!!!");
    }

    @Test
    public void test12517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12517");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360!", "!\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]!\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]!\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]!\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]!\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360!" + "'", str2, "\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360!");
    }

    @Test
    public void test12518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12518");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```!", "HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!" + "'", str2, "!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!H!!!H!!!H!!!H!!```!");
    }

    @Test
    public void test12519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12519");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!", "}~\200\200}~\200\200FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF}~\200\200}~\200\200FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test12520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12520");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12521");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!!", "\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test12522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12522");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULL!", "HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFF!HFF!HFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFF!HFF!HFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFF!HFF!HFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFF!HFF!HFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFF!HFF!HFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFF!HFF!HFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFF!HFF!HFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFF!HFF!HFF!" + "'", str2, "HHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFF!HFF!HFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFF!HFF!HFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFF!HFF!HFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFF!HFF!HFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFF!HFF!HFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFF!HFF!HFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFF!HFF!HFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFF!HFF!HFF!");
    }

    @Test
    public void test12523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12523");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200L!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUUL!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUU~}\200\200~}\200\200L!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUUL!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUU~}\200\200~}\200\200L!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUUL!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUU~}\200\200~}\200\200L!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUUL!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUU~}\200\200~}\200\200L!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUUL!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUU~}\200\200~}\200\200L!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUUL!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUU~}\200\200~}\200\200L!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUUL!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUU~}\200\200~}\200\200L!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUUL!UU!L!UUL!UUL!UU!L!UUL!UU!LUU!LUU!", "XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test12524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12524");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368n!lln!lln!lln!lln!lln!lln!lln!ll\204\204n!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!ll\204\204n!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!ll!!n!lln!lln!lln!lln!lln!lln!lln!ll\204\204n!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!ll\204\204n!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!ll!!n!lln!lln!lln!lln!lln!lln!lln!ll\204\204n!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!ll\204\204n!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!ll!!n!lln!lln!lln!lln!lln!lln!lln!ll\204\204n!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!ll\204\204\u0346\u0348\u0348!", "X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204\u0346\u0348\u0348!");
    }

    @Test
    public void test12525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12525");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\335\335\335\335\335\335\335\214\214\335\335\335\335\335\335\335\335\214\214\335\335\335\335\335\335\335\335\214\214\335\335\335\335\335\335\335\335\214\214\335\335\335\335\335\335\335\335\214\214\335\335\335\335\335\335\335\335\214\214\335\335\335\335\335\335\335\335\214\214\335\335\335\335\335\335\335\335\214\214!", "\u0346\u0348\u0348\u0348\300!\300\300\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!" + "'", str2, "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!");
    }

    @Test
    public void test12526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12526");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!", "\230\230\225\225\230\230\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
    }

    @Test
    public void test12527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12527");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200!" + "'", str2, "\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200!");
    }

    @Test
    public void test12528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12528");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\200}}!", "~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~LLL~LLL~LLLUU~LLL~LLLUU~LLL~LLLUU\200}}~LLL~LLL~LLLUU~LLL~LLLUU~LLL~LLLUU\200}}~LLL~LLL~LLLUU~LLL~LLLUU~LLL~LLLUU\200}}~LLL~LLL~LLLUU~LLL~LLLUU~LLL~LLLUU\200}}~LLL~LLL~LLLUU~LLL~LLLUU~LLL~LLLUU\200}}~LLL~LLL~LLLUU~LLL~LLLUU~LLL~LLLUU\200}}~LLL~LLL~LLLUU~LLL~LLLUU~LLL~LLLUU\200}}~LLL~LLL~LLLUU~LLL~LLLUU~LLL~LLLUU\200}}!" + "'", str2, "~LLL~LLL~LLLUU~LLL~LLLUU~LLL~LLLUU\200}}~LLL~LLL~LLLUU~LLL~LLLUU~LLL~LLLUU\200}}~LLL~LLL~LLLUU~LLL~LLLUU~LLL~LLLUU\200}}~LLL~LLL~LLLUU~LLL~LLLUU~LLL~LLLUU\200}}~LLL~LLL~LLLUU~LLL~LLLUU~LLL~LLLUU\200}}~LLL~LLL~LLLUU~LLL~LLLUU~LLL~LLLUU\200}}~LLL~LLL~LLLUU~LLL~LLLUU~LLL~LLLUU\200}}~LLL~LLL~LLLUU~LLL~LLLUU~LLL~LLLUU\200}}!");
    }

    @Test
    public void test12529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12529");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!", "~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230\200}}`~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!" + "'", str2, "!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!");
    }

    @Test
    public void test12530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12530");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "LLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12531");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LIIILIII!", "\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\356nullnullnull\356nullnullnull!" + "'", str2, "\356nullnullnull\356nullnullnull!");
    }

    @Test
    public void test12532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12532");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\234!nullnull\234!nullnull!!\234!nullnull\234!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12533");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^!HHHH]]!HHHH]]HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^!HHHH]]!HHHH]]HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^!HHHH]]!HHHH]]HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^!HHHH]]!HHHH]]HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^!HHHH]]!HHHH]]HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^!HHHH]]!HHHH]]HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^!HHHH]]!HHHH]]HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^!HHHH]]!HHHH]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12534");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`!!!`!!!`!!!`!!!\200\200!!\200\200!!\200\200!!\200\200!!!", "\275UUU\275UUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!!!`!!!`!!!`!!!\200\200!!\200\200!!\200\200!!\200\200!!!" + "'", str2, "`!!!`!!!`!!!`!!!\200\200!!\200\200!!\200\200!!\200\200!!!");
    }

    @Test
    public void test12535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12535");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL!", "!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull!" + "'", str2, "^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull!");
    }

    @Test
    public void test12536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12536");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE!", "nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!!nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!!nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!!nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!!nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!" + "'", str2, "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!");
    }

    @Test
    public void test12537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12537");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("vvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnull!", "LNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNHNNNHNNNHNNNHNNNHNNNHNNNHNNNHNNNNNHNNNHNNNHNNNHNNNHNNNHNNNHNNNHNNNNNHNNNHNNNHNNNHNNNHNNNHNNNHNNNHNNNNNHNNNHNNNHNNNHNNNHNNNHNNNHNNNHNNNNNHNNNHNNNHNNNHNNNHNNNHNNNHNNNHNNNNNHNNNHNNNHNNNHNNNHNNNHNNNHNNNHNNNNNHNNNHNNNHNNNHNNNHNNNHNNNHNNNHNNNNNHNNNHNNNHNNNHNNNHNNNHNNNHNNNHNNN!" + "'", str2, "NNHNNNHNNNHNNNHNNNHNNNHNNNHNNNHNNNNNHNNNHNNNHNNNHNNNHNNNHNNNHNNNHNNNNNHNNNHNNNHNNNHNNNHNNNHNNNHNNNHNNNNNHNNNHNNNHNNNHNNNHNNNHNNNHNNNHNNNNNHNNNHNNNHNNNHNNNHNNNHNNNHNNNHNNNNNHNNNHNNNHNNNHNNNHNNNHNNNHNNNHNNNNNHNNNHNNNHNNNHNNNHNNNHNNNHNNNHNNNNNHNNNHNNNHNNNHNNNHNNNHNNNHNNNHNNN!");
    }

    @Test
    public void test12538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12538");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u0123\u0124\u0126\u0126\u0123\u0124\u0126\u0126nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test12539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12539");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "]]\200!LLL!!LLL!LLL\200\200\200!LLL!!LLL!LLL\200\200]]\200!LLL!!LLL!LLL\200\200\200!LLL!!LLL!LLL\200\200!!]]\200!LLL!!LLL!LLL\200\200\200!LLL!!LLL!LLL\200\200]]\200!LLL!!LLL!LLL\200\200\200!LLL!!LLL!LLL\200\200!!]]\200!LLL!!LLL!LLL\200\200\200!LLL!!LLL!LLL\200\200]]\200!LLL!!LLL!LLL\200\200\200!LLL!!LLL!LLL\200\200]]\200!LLL!!LLL!LLL\200\200\200!LLL!!LLL!LLL\200\200]]\200!LLL!!LLL!LLL\200\200\200!LLL!!LLL!LLL\200\200!!]]\200!LLL!!LLL!LLL\200\200\200!LLL!!LLL!LLL\200\200]]\200!LLL!!LLL!LLL\200\200\200!LLL!!LLL!LLL\200\200!!]]\200!LLL!!LLL!LLL\200\200\200!LLL!!LLL!LLL\200\200]]\200!LLL!!LLL!LLL\200\200\200!LLL!!LLL!LLL\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12540");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!!", "null~LLnullnullLLnullnullnull~LLnullnullLLnullnull!!null~LLnullnullLLnullnullnull~LLnullnullLLnullnull!!null~LLnullnullLLnullnullnull~LLnullnullLLnullnullnull~LLnullnullLLnullnullnull~LLnullnullLLnullnull!!null~LLnullnullLLnullnullnull~LLnullnullLLnullnull!!null~LLnullnullLLnullnullnull~LLnullnullLLnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226!!LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226!!!" + "'", str2, "LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226!!LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226!!!");
    }

    @Test
    public void test12541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12541");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!" + "'", str2, "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!");
    }

    @Test
    public void test12542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12542");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\220nullnull\200}}`null\220nullnull]]!", "~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\336~LL\220\336~LL\336~LL\200}}`\336~LL\220\336~LL\336~LL]]!" + "'", str2, "\336~LL\220\336~LL\336~LL\200}}`\336~LL\220\336~LL\336~LL]]!");
    }

    @Test
    public void test12543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12543");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!!", "\u0366\u0365\u0368\u0368!!\276\276\230!\215\215\230!\215\215\230!\215\215!!\276\276\230!\215\215\230!\215\215\230!\215\215!!!!\276\276\230!\215\215\230!\215\215\230!\215\215!!\276\276\230!\215\215\230!\215\215\230!\215\215!!!!\276\276\230!\215\215\230!\215\215\230!\215\215!!\276\276\230!\215\215\230!\215\215\230!\215\215!!!!\276\276\230!\215\215\230!\215\215\230!\215\215!!\276\276\230!\215\215\230!\215\215\230!\215\215\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!!" + "'", str2, "!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!!");
    }

    @Test
    public void test12544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12544");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!!", "\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!!" + "'", str2, "null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!null!~~null!~~!!!");
    }

    @Test
    public void test12545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12545");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260!", "LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200\200LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200\200LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200\200LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200\200LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200\200LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200\200LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200\200LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260!" + "'", str2, "nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260!");
    }

    @Test
    public void test12546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12546");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\220\220!!\220\220!!\220\220!!\220\220\u0346\u0348\u0348!", "null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\220\220!!\220\220!!\220\220!!\220\220\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\220\220!!\220\220!!\220\220!!\220\220\u0346\u0348\u0348!");
    }

    @Test
    public void test12547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12547");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\200\200\200\200!", "!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\200\200\200\200!" + "'", str2, "!\200\200\200\200!");
    }

    @Test
    public void test12548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12548");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348!", "}!\200\200}!\200\200}!\200\200}!\200\200\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215}!\200\200}!\200\200}!\200\200}!\200\200\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\276\200\200\u0348\276\200\200\u0348\u0348\u0348\276\200\200\u0348\276\200\200\u0348\u0348\u0348\276\200\200\u0348\276\200\200\u0348\u0348\u0348\276\200\200\u0348\276\200\200\u0348\u0348\u0348\276\200\200\u0348\276\200\200\u0348\u0348\u0348\276\200\200\u0348\276\200\200\u0348\u0348\u0348\276\200\200\u0348\276\200\200\u0348\u0348\u0348\276\200\200\u0348\276\200\200\u0348\u0348\u0348\276\200\200\u0348\276\200\200\u0348\u0348\u0348\276\200\200\u0348\276\200\200\u0348\u0348\u0348\276\200\200\u0348\276\200\200\u0348\u0348\u0348\276\200\200\u0348\276\200\200\u0348\u0348!" + "'", str2, "\u0348\276\200\200\u0348\276\200\200\u0348\u0348\u0348\276\200\200\u0348\276\200\200\u0348\u0348\u0348\276\200\200\u0348\276\200\200\u0348\u0348\u0348\276\200\200\u0348\276\200\200\u0348\u0348\u0348\276\200\200\u0348\276\200\200\u0348\u0348\u0348\276\200\200\u0348\276\200\200\u0348\u0348\u0348\276\200\200\u0348\276\200\200\u0348\u0348\u0348\276\200\200\u0348\276\200\200\u0348\u0348\u0348\276\200\200\u0348\276\200\200\u0348\u0348\u0348\276\200\200\u0348\276\200\200\u0348\u0348\u0348\276\200\200\u0348\276\200\200\u0348\u0348\u0348\276\200\200\u0348\276\200\200\u0348\u0348!");
    }

    @Test
    public void test12549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12549");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!!!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!!!", "E!LLE!LLLLE!LLE!LLLLE!LLE!LLLLE!LLE!LLLLE!LLE!LLLLE!LLE!LLLLE!LLE!LLLLE!LLE!LLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!" + "'", str2, "!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test12550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12550");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("[[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!!!", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!!!" + "'", str2, "[[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!![[!![[!![[!![[!![[!![[!![[!![[!!!![[!![[!![[!![[!![[!![[!![[!![[!!!!!!!");
    }

    @Test
    public void test12551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12551");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull!", "LLUULLUU!!LLUULLUU!!!LLUULLUULLUU!LLUULLUULLUULLUULLUU!!LLUULLUU!!!LLUULLUULLUU!LLUULLUULLUULLUULLUU!!LLUULLUU!!!LLUULLUULLUU!LLUULLUULLUULLUULLUU!!LLUULLUU!!!LLUULLUULLUU!LLUULLUULLUULLUULLUU!!LLUULLUU!!!LLUULLUULLUU!LLUULLUULLUULLUULLUU!!LLUULLUU!!!LLUULLUULLUU!LLUULLUULLUULLUULLUU!!LLUULLUU!!!LLUULLUULLUU!LLUULLUULLUULLUULLUU!!LLUULLUU!!!LLUULLUULLUU!LLUULLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275UULLUULLUULL\275UULLUULLUULLUULLUULL\275UULLUULLUULL\275UULLUULLUULLUULLUULL\275UULLUULLUULL\275UULLUULLUULLUULLUULL\275UULLUULLUULL\275UULLUULLUULLUULLUULL\275UULLUULLUULL\275UULLUULLUULLUULLUULL\275UULLUULLUULL\275UULLUULLUULLUULLUULL\275UULLUULLUULL\275UULLUULLUULLUULLUULL\275UULLUULLUULL\275UULLUULLUULLUULLUULL!" + "'", str2, "\275UULLUULLUULL\275UULLUULLUULLUULLUULL\275UULLUULLUULL\275UULLUULLUULLUULLUULL\275UULLUULLUULL\275UULLUULLUULLUULLUULL\275UULLUULLUULL\275UULLUULLUULLUULLUULL\275UULLUULLUULL\275UULLUULLUULLUULLUULL\275UULLUULLUULL\275UULLUULLUULLUULLUULL\275UULLUULLUULL\275UULLUULLUULLUULLUULL\275UULLUULLUULL\275UULLUULLUULLUULLUULL!");
    }

    @Test
    public void test12552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12552");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256}}\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256}}!", "\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256}}\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256}}!" + "'", str2, "\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256}}\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256}}!");
    }

    @Test
    public void test12553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12553");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u03dd\u03e0\u03e0\u03dd\u03e0\u03e0\u03dd\u03e0\u03e0\u03dd\u03e0\u03e0\u03dd\u03e0\u03e0\u03dd\u03e0\u03e0!", "\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174nullnullnull!" + "'", str2, "\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174\u0178\u0198\u0174\u0174nullnullnull!");
    }

    @Test
    public void test12554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12554");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "!L!LLL!LLL!LLL!LL!!!L!LLL!LLL!LLL!LL!!!!!L!LLL!LLL!LLL!LL!!!L!LLL!LLL!LLL!LL!!!!!L!LLL!LLL!LLL!LL!!!L!LLL!LLL!LLL!LL!!!!!L!LLL!LLL!LLL!LL!!!L!LLL!LLL!LLL!LL!!!!!L!LLL!LLL!LLL!LL!!!L!LLL!LLL!LLL!LL!!!!!L!LLL!LLL!LLL!LL!!!L!LLL!LLL!LLL!LL!!!!!L!LLL!LLL!LLL!LL!!!L!LLL!LLL!LLL!LL!!!!!L!LLL!LLL!LLL!LL!!!L!LLL!LLL!LLL!LL!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test12555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12555");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440nullnull!", "!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!NN!!NNnullnullnullnullnullnullnullnull!!NN!!NNnullnullnullnullnullnullnullnull!!NN!!NNnullnullnullnullnullnullnullnull!!NN!!NNnullnullnullnullnullnullnullnull!!NN!!NNnullnullnullnullnullnullnullnull!!NN!!NNnullnullnullnullnullnullnullnull!!NN!!NNnullnullnullnullnullnullnullnull!!NN!!NN!" + "'", str2, "nullnullnullnullnullnullnullnull!!NN!!NNnullnullnullnullnullnullnullnull!!NN!!NNnullnullnullnullnullnullnullnull!!NN!!NNnullnullnullnullnullnullnullnull!!NN!!NNnullnullnullnullnullnullnullnull!!NN!!NNnullnullnullnullnullnullnullnull!!NN!!NNnullnullnullnullnullnullnullnull!!NN!!NNnullnullnullnullnullnullnullnull!!NN!!NN!");
    }

    @Test
    public void test12556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12556");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0106\u0106\u0106\u0106!", "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12557");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200\u01fd\u0200\u0200!!]]!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!nullnullnullnullnullnullnull!!!nullnullnullnullnullnullnull!!!nullnullnullnullnullnullnull!!!nullnullnullnullnullnullnull!!!nullnullnullnullnullnullnull!!]]!nullnullnullnullnullnullnull!!!nullnullnullnullnullnullnull!!]]!nullnullnullnullnullnullnull!!!nullnullnullnullnullnullnull!!]]!nullnullnullnullnullnullnull!!!nullnullnullnullnullnullnull!!]]]!nullnullnullnullnullnullnull!!!nullnullnullnullnullnullnull!!!nullnullnullnullnullnullnull!!!nullnullnullnullnullnullnull!!!nullnullnullnullnullnullnull!!]]!nullnullnullnullnullnullnull!!!nullnullnullnullnullnullnull!!]]!" + "'", str2, "]!nullnullnullnullnullnullnull!!!nullnullnullnullnullnullnull!!!nullnullnullnullnullnullnull!!!nullnullnullnullnullnullnull!!!nullnullnullnullnullnullnull!!]]!nullnullnullnullnullnullnull!!!nullnullnullnullnullnullnull!!]]!nullnullnullnullnullnullnull!!!nullnullnullnullnullnullnull!!]]!nullnullnullnullnullnullnull!!!nullnullnullnullnullnullnull!!]]]!nullnullnullnullnullnullnull!!!nullnullnullnullnullnullnull!!!nullnullnullnullnullnullnull!!!nullnullnullnullnullnullnull!!!nullnullnullnullnullnullnull!!]]!nullnullnullnullnullnullnull!!!nullnullnullnullnullnullnull!!]]!");
    }

    @Test
    public void test12558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12558");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "!]]]!]!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12559");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!nullnullnullnullnullnullnullnull!", "null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!" + "'", str2, "!!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!");
    }

    @Test
    public void test12560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12560");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!!", "\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9!!!" + "'", str2, "\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9!!!");
    }

    @Test
    public void test12561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12561");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNNNLNNNLNNNLNNNLNNNLNNN\204\204LNNNLNNN\204\204LNNNLNNN\204\204LNNNLNNN\204\204LNNNLNNNLNNNLNNNLNNNLNNN\204\204LNNNLNNN\204\204!", "\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108nullnull!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L!!!L!!!L!!!L!!!L!!!L!!!\204\204L!!!L!!!\204\204L!!!L!!!\204\204L!!!L!!!\204\204L!!!L!!!L!!!L!!!L!!!L!!!\204\204L!!!L!!!\204\204!" + "'", str2, "L!!!L!!!L!!!L!!!L!!!L!!!\204\204L!!!L!!!\204\204L!!!L!!!\204\204L!!!L!!!\204\204L!!!L!!!L!!!L!!!L!!!L!!!\204\204L!!!L!!!\204\204!");
    }

    @Test
    public void test12562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12562");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!", "`!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL`!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!" + "'", str2, "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
    }

    @Test
    public void test12563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12563");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12564");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull!" + "'", str2, "\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull!");
    }

    @Test
    public void test12565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12565");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!!!nullnull!", "\230\226\u0346\u0346!nullnull\236\276\276\230\226\u0346\u0346!nullnull\236\276\276!!\230\226\u0346\u0346!nullnull\236\276\276\230\226\u0346\u0346!nullnull\236\276\276!!\230\226\u0346\u0346!nullnull\236\276\276\230\226\u0346\u0346!nullnull\236\276\276\230\226\u0346\u0346!nullnull\236\276\276\230\226\u0346\u0346!nullnull\236\276\276!!\230\226\u0346\u0346!nullnull\236\276\276\230\226\u0346\u0346!nullnull\236\276\276!!\230\226\u0346\u0346!nullnull\236\276\276\230\226\u0346\u0346!nullnull\236\276\276!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L\230NNL\230NN!!!!L\230NNL\230NN!" + "'", str2, "L\230NNL\230NN!!!!L\230NNL\230NN!");
    }

    @Test
    public void test12566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12566");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01a0!!!\200\u01a0!!!]]!", "nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!\200}}`null!!!]]!" + "'", str2, "null!!!\200}}`null!!!]]!");
    }

    @Test
    public void test12567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12567");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275]]]\275]]]!", "U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275]]]\275]]]!" + "'", str2, "\275]]]\275]]]!");
    }

    @Test
    public void test12568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12568");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```LUUULUUULUUULUUU!!!```!", "nullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```!" + "'", str2, "HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```HNNNHNNNHNNNHNNN!!!```!");
    }

    @Test
    public void test12569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12569");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull!", "\225\225\225\225\225\225\225\225!!\225\225\225\225\225\225\225\225!!\225\225\225\225\225\225\225\225\225\225\225\225\225\225\225\225!!\225\225\225\225\225\225\225\225!!\225\225\225\225\225\225\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\225\225\225\225\225\225\225\225~}\200\200~}\200\200\225\225\225\225\225\225\225\225~}\200\200~}\200\200\225\225\225\225\225\225\225\225~}\200\200~}\200\200\225\225\225\225\225\225\225\225~}\200\200~}\200\200\225\225\225\225\225\225\225\225~}\200\200~}\200\200\225\225\225\225\225\225\225\225~}\200\200~}\200\200\225\225\225\225\225\225\225\225~}\200\200~}\200\200\225\225\225\225\225\225\225\225!" + "'", str2, "~}\200\200~}\200\200\225\225\225\225\225\225\225\225~}\200\200~}\200\200\225\225\225\225\225\225\225\225~}\200\200~}\200\200\225\225\225\225\225\225\225\225~}\200\200~}\200\200\225\225\225\225\225\225\225\225~}\200\200~}\200\200\225\225\225\225\225\225\225\225~}\200\200~}\200\200\225\225\225\225\225\225\225\225~}\200\200~}\200\200\225\225\225\225\225\225\225\225~}\200\200~}\200\200\225\225\225\225\225\225\225\225!");
    }

    @Test
    public void test12570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12570");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~]]UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~]]UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~]]UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~]]UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~]]nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~]]nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~]]nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~]]nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~!" + "'", str2, "nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~]]nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~]]nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~]]nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~]]nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~nullnull~~!");
    }

    @Test
    public void test12571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12571");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u014e\u014b\u014b\u014b\u0348\u0346\u0346!", "\u0346\u0348\u0348\u0348\226\226\226\226\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test12572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12572");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!", "\u0128\u0129\u012b\u012b!!!\200\200\u0128\u0129\u012b\u012b!!!\200\200\u0128\u0129\u012b\u012b!!!\200\200\u0128\u0129\u012b\u012b!!!\200\200\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b!!!\200\200\u0128\u0129\u012b\u012b!!!\200\200\u0128\u0129\u012b\u012b!!!\200\200\u0128\u0129\u012b\u012b!!!\200\200\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b\u0128\u0129\u012b\u012b!~~!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\u0128\u0128\u0128\u0348\u0348\253\u0128\u0128\u0128\u0348\u0348!!\253\u0128\u0128\u0128\u0348\u0348\253\u0128\u0128\u0128\u0348\u0348!!\253\u0128\u0128\u0128\u0348\u0348\253\u0128\u0128\u0128\u0348\u0348\253\u0128\u0128\u0128\u0348\u0348\253\u0128\u0128\u0128\u0348\u0348!!\253\u0128\u0128\u0128\u0348\u0348\253\u0128\u0128\u0128\u0348\u0348!!\253\u0128\u0128\u0128\u0348\u0348\253\u0128\u0128\u0128\u0348\u0348!" + "'", str2, "\253\u0128\u0128\u0128\u0348\u0348\253\u0128\u0128\u0128\u0348\u0348!!\253\u0128\u0128\u0128\u0348\u0348\253\u0128\u0128\u0128\u0348\u0348!!\253\u0128\u0128\u0128\u0348\u0348\253\u0128\u0128\u0128\u0348\u0348\253\u0128\u0128\u0128\u0348\u0348\253\u0128\u0128\u0128\u0348\u0348!!\253\u0128\u0128\u0128\u0348\u0348\253\u0128\u0128\u0128\u0348\u0348!!\253\u0128\u0128\u0128\u0348\u0348\253\u0128\u0128\u0128\u0348\u0348!");
    }

    @Test
    public void test12573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12573");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("``!!``!!^```^`````!!``!!^```^`````!!``!!^```^`````!!``!!^```^`````!!``!!^```^`````!!``!!^```^`````!!``!!^```^`````!!``!!^```^```!", "\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144\u0144!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!!``!!^```^`````!!``!!^```^`````!!``!!^```^`````!!``!!^```^`````!!``!!^```^`````!!``!!^```^`````!!``!!^```^`````!!``!!^```^```!" + "'", str2, "``!!``!!^```^`````!!``!!^```^`````!!``!!^```^`````!!``!!^```^`````!!``!!^```^`````!!``!!^```^`````!!``!!^```^`````!!``!!^```^```!");
    }

    @Test
    public void test12574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12574");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!!!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!!!", "\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105!!!" + "'", str2, "\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105\u0105!!!");
    }

    @Test
    public void test12575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12575");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0123\u0124\u0126\u0126\213\213\213\u0346\u0348\u0348!", "unllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnullnullnull\213\213\213\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnullnullnull\213\213\213\u0346\u0348\u0348!");
    }

    @Test
    public void test12576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12576");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!", "`acc`acc!!`acc`acc!!`acc`acc!!`acc`acc!!`acc`acc!!`acc`acc!!`acc`acc!!`acc`acc!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!" + "'", str2, "\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!");
    }

    @Test
    public void test12577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12577");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("llllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLL!", "\u0366\u0365\u0368\u0368\u026e\u026e\u026c\u026c\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12578");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNUUUNUUUNUU\200\200UNUUUNUUUNUUUNUUUNUU\200\200UNUUUNUU!!UNUUUNUUUNUU\200\200UNUUUNUUUNUUUNUUUNUU\200\200UNUUUNUU!!UNUUUNUUUNUU\200\200UNUUUNUUUNUUUNUUUNUU\200\200UNUUUNUU!!UNUUUNUUUNUU\200\200UNUUUNUUUNUUUNUUUNUU\200\200UNUUUNUU!!UNUUUNUUUNUU\200\200UNUUUNUUUNUUUNUUUNUU\200\200UNUUUNUU!!UNUUUNUUUNUU\200\200UNUUUNUUUNUUUNUUUNUU\200\200UNUUUNUU!!UNUUUNUUUNUU\200\200UNUUUNUUUNUUUNUUUNUU\200\200UNUUUNUU!!UNUUUNUUUNUU\200\200UNUUUNUUUNUUUNUUUNUU\200\200UNUUUNUU!!!", "LIJJLLLLIJJLLLLIJJLLLLIJJLLL\200}}`LIJJLLLLIJJLLLLIJJLLLLIJJLLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLL\200\200LLLLLLLLLLLLLLLLLLLL\200\200LLLLLLLL!!LLLLLLLLLLLL\200\200LLLLLLLLLLLLLLLLLLLL\200\200LLLLLLLL!!LLLLLLLLLLLL\200\200LLLLLLLLLLLLLLLLLLLL\200\200LLLLLLLL!!LLLLLLLLLLLL\200\200LLLLLLLLLLLLLLLLLLLL\200\200LLLLLLLL!!LLLLLLLLLLLL\200\200LLLLLLLLLLLLLLLLLLLL\200\200LLLLLLLL!!LLLLLLLLLLLL\200\200LLLLLLLLLLLLLLLLLLLL\200\200LLLLLLLL!!LLLLLLLLLLLL\200\200LLLLLLLLLLLLLLLLLLLL\200\200LLLLLLLL!!LLLLLLLLLLLL\200\200LLLLLLLLLLLLLLLLLLLL\200\200LLLLLLLL!!!" + "'", str2, "LLLLLLLLLLLL\200\200LLLLLLLLLLLLLLLLLLLL\200\200LLLLLLLL!!LLLLLLLLLLLL\200\200LLLLLLLLLLLLLLLLLLLL\200\200LLLLLLLL!!LLLLLLLLLLLL\200\200LLLLLLLLLLLLLLLLLLLL\200\200LLLLLLLL!!LLLLLLLLLLLL\200\200LLLLLLLLLLLLLLLLLLLL\200\200LLLLLLLL!!LLLLLLLLLLLL\200\200LLLLLLLLLLLLLLLLLLLL\200\200LLLLLLLL!!LLLLLLLLLLLL\200\200LLLLLLLLLLLLLLLLLLLL\200\200LLLLLLLL!!LLLLLLLLLLLL\200\200LLLLLLLLLLLLLLLLLLLL\200\200LLLLLLLL!!LLLLLLLLLLLL\200\200LLLLLLLLLLLLLLLLLLLL\200\200LLLLLLLL!!!");
    }

    @Test
    public void test12579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12579");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH\200}}`EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH]]!", "unllunll!!unllunll!!unllunll!!unllunll!!unllunll!!unllunll!!unllunll!!unllunll!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\200}}`UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL]]!" + "'", str2, "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\200}}`UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL]]!");
    }

    @Test
    public void test12580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12580");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!", "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02fa\u02fa\200\u02fa\u02fa\200\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\200\u02fa\u02fa\200\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\200\u02fa\u02fa\200\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\200\u02fa\u02fa\200\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\200\u02fa\u02fa\200\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\200\u02fa\u02fa\200\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\200\u02fa\u02fa\200\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\200\u02fa\u02fa\200\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\200\u02fa\u02fa\200\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\200\u02fa\u02fa\200\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\200\u02fa\u02fa\200\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\200\u02fa\u02fa\200\u02fa\u02fa\u02fa\u02fa!" + "'", str2, "\u02fa\u02fa\200\u02fa\u02fa\200\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\200\u02fa\u02fa\200\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\200\u02fa\u02fa\200\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\200\u02fa\u02fa\200\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\200\u02fa\u02fa\200\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\200\u02fa\u02fa\200\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\200\u02fa\u02fa\200\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\200\u02fa\u02fa\200\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\200\u02fa\u02fa\200\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\200\u02fa\u02fa\200\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\200\u02fa\u02fa\200\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\200\u02fa\u02fa\200\u02fa\u02fa\u02fa\u02fa!");
    }

    @Test
    public void test12581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12581");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!", "\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038enullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!" + "'", str2, "!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!");
    }

    @Test
    public void test12582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12582");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\214\214LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\214\214LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\214\214LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\214\214LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\214\214LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\214\214LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\214\214LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!" + "'", str2, "~~!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
    }

    @Test
    public void test12583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12583");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`LLUULLUULLUU`LLUULLUULLUU!", "!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254]]!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254]]\214!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254\214!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254]]!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254]]\214!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254\214!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254!\276\276\276!\276\276\276\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`\276\276]]\276\276]]\276\276]]`\276\276]]\276\276]]\276\276]]!" + "'", str2, "`\276\276]]\276\276]]\276\276]]`\276\276]]\276\276]]\276\276]]!");
    }

    @Test
    public void test12584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12584");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\200\u011b\u011c\u011e\u011e\220\220\200\u011b\u011c\u011e\u011e\220\220\200\u011b\u011c\u011e\u011e\220\220\200\u011b\u011c\u011e\u011e\220\220\200\u011b\u011c\u011e\u011e\220\220\200\u011b\u011c\u011e\u011e\220\220\200\u011b\u011c\u011e\u011e\220\220\200\u011b\u011c\u011e\u011e\220\220!", "\275\276NN\275\276NN\275\276NN\275\276NN\275\276NN\275\276NN\275\276NN\275\276NN\275\276NN\275\276NN\275\276NN\275\276NN\275\276NN\275\276NN\275\276NN\275\276NN\275\276NN\275\276NN\275\276NN\275\276NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220!" + "'", str2, "\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220!");
    }

    @Test
    public void test12585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12585");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260``!!!!!!!", "!!!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!!" + "'", str2, "null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!!");
    }

    @Test
    public void test12586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12586");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\275\275\275\276\275\275\275\276\275\275\275\276\275\275\275\276\275\275\275!", "\261\262\264\264LL~~LL~~!!!!\261\262\264\264LL~~LL~~!!!!!!\261\262\264\264LL~~LL~~!!!!\261\262\264\264LL~~LL~~!!!!!!\261\262\264\264LL~~LL~~!!!!\261\262\264\264LL~~LL~~!!!!!!\261\262\264\264LL~~LL~~!!!!\261\262\264\264LL~~LL~~!!!!!!\261\262\264\264LL~~LL~~!!!!\261\262\264\264LL~~LL~~!!!!!!\261\262\264\264LL~~LL~~!!!!\261\262\264\264LL~~LL~~!!!!!!\261\262\264\264LL~~LL~~!!!!\261\262\264\264LL~~LL~~!!!!!!\261\262\264\264LL~~LL~~!!!!\261\262\264\264LL~~LL~~!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\275\275\275\276\275\275\275\276\275\275\275\276\275\275\275\276\275\275\275!" + "'", str2, "\276\275\275\275\276\275\275\275\276\275\275\275\276\275\275\275\276\275\275\275!");
    }

    @Test
    public void test12587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12587");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214!", "``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM!!``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM!!``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM!!``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM!!``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!\214\214MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!\214\214MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!\214\214MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!\214\214MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!\214\214MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!\214\214MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!\214\214MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!\214\214!" + "'", str2, "MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!\214\214MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!\214\214MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!\214\214MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!\214\214MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!\214\214MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!\214\214MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!\214\214MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!\214\214!");
    }

    @Test
    public void test12588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12588");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`!!\210\210nullnull\210\210nullnull!!\210\210nullnull\210\210nullnull!!\210\210nullnull\210\210nullnull`!!\210\210nullnull\210\210nullnull!!\210\210nullnull\210\210nullnull!!\210\210nullnull\210\210nullnull!", "!X!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!!\210\210nullnullnullnullnullnullnullnull\210\210nullnullnullnullnullnullnullnull!!\210\210nullnullnullnullnullnullnullnull\210\210nullnullnullnullnullnullnullnull!!\210\210nullnullnullnullnullnullnullnull\210\210nullnullnullnullnullnullnullnull`!!\210\210nullnullnullnullnullnullnullnull\210\210nullnullnullnullnullnullnullnull!!\210\210nullnullnullnullnullnullnullnull\210\210nullnullnullnullnullnullnullnull!!\210\210nullnullnullnullnullnullnullnull\210\210nullnullnullnullnullnullnullnull!" + "'", str2, "`!!\210\210nullnullnullnullnullnullnullnull\210\210nullnullnullnullnullnullnullnull!!\210\210nullnullnullnullnullnullnullnull\210\210nullnullnullnullnullnullnullnull!!\210\210nullnullnullnullnullnullnullnull\210\210nullnullnullnullnullnullnullnull`!!\210\210nullnullnullnullnullnullnullnull\210\210nullnullnullnullnullnullnullnull!!\210\210nullnullnullnullnullnullnullnull\210\210nullnullnullnullnullnullnullnull!!\210\210nullnullnullnullnullnullnullnull\210\210nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12589");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!", "!LNUULNUULNUU!LNUULNUULNUU!LNUULNUULNUU!LNUULNUULNUU~}}^!LNUULNUULNUU!LNUULNUULNUU!LNUULNUULNUU!LNUULNUULNUU]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!" + "'", str2, "!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!!");
    }

    @Test
    public void test12590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12590");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("L!!!L!!!!!L!!!L!!!!!!!L!!!L!!!!!L!!!L!!!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!!!L!!!L!!!!!L!!!L!!!!!!!L!!!L!!!!!L!!!L!!!!!!", "\u01c6\u01c6\u01e6\u01e5\u01c6\u01c6\u01e6\u01e5nullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4!!!!!!" + "'", str2, "\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4\u01e4!!!!!!");
    }

    @Test
    public void test12591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12591");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLUU\226\230\230LLUULLUULLUULLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUULLUULLUULLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\226\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230!" + "'", str2, "nullnullnullnull\226\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230!");
    }

    @Test
    public void test12592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12592");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254!!!", "EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!!EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!!EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!!EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!!EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EEEEnullnullnullEEEEEEEEEEEE\256\254\254EEEEnullnullnullEEEEEEEEEEEE\256\254\254!!EEEEnullnullnullEEEEEEEEEEEE\256\254\254EEEEnullnullnullEEEEEEEEEEEE\256\254\254!!EEEEnullnullnullEEEEEEEEEEEE\256\254\254EEEEnullnullnullEEEEEEEEEEEE\256\254\254!!EEEEnullnullnullEEEEEEEEEEEE\256\254\254EEEEnullnullnullEEEEEEEEEEEE\256\254\254!!EEEEnullnullnullEEEEEEEEEEEE\256\254\254EEEEnullnullnullEEEEEEEEEEEE\256\254\254!!EEEEnullnullnullEEEEEEEEEEEE\256\254\254EEEEnullnullnullEEEEEEEEEEEE\256\254\254!!EEEEnullnullnullEEEEEEEEEEEE\256\254\254EEEEnullnullnullEEEEEEEEEEEE\256\254\254!!EEEEnullnullnullEEEEEEEEEEEE\256\254\254EEEEnullnullnullEEEEEEEEEEEE\256\254\254!!!" + "'", str2, "EEEEnullnullnullEEEEEEEEEEEE\256\254\254EEEEnullnullnullEEEEEEEEEEEE\256\254\254!!EEEEnullnullnullEEEEEEEEEEEE\256\254\254EEEEnullnullnullEEEEEEEEEEEE\256\254\254!!EEEEnullnullnullEEEEEEEEEEEE\256\254\254EEEEnullnullnullEEEEEEEEEEEE\256\254\254!!EEEEnullnullnullEEEEEEEEEEEE\256\254\254EEEEnullnullnullEEEEEEEEEEEE\256\254\254!!EEEEnullnullnullEEEEEEEEEEEE\256\254\254EEEEnullnullnullEEEEEEEEEEEE\256\254\254!!EEEEnullnullnullEEEEEEEEEEEE\256\254\254EEEEnullnullnullEEEEEEEEEEEE\256\254\254!!EEEEnullnullnullEEEEEEEEEEEE\256\254\254EEEEnullnullnullEEEEEEEEEEEE\256\254\254!!EEEEnullnullnullEEEEEEEEEEEE\256\254\254EEEEnullnullnullEEEEEEEEEEEE\256\254\254!!!");
    }

    @Test
    public void test12593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12593");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!!!!!!!!!", "^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!!!!!!!!!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!!!!!!!!!");
    }

    @Test
    public void test12594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12594");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12595");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u016e\u0170\u0170\u0170\u016c\u016c\u016c\u016c\u016e\u0170\u0170\u0170\u016c\u016cLL!", "]nullnullnullnullnull]]nullnull]]nullnull]]nullnull]]]nullnullnullnullnull]]nullnull]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\222null\224\224\222null\224\224\222null\224\224\222null\224\224nullnullnullnull\222null\224\224\222null\224\224!" + "'", str2, "nullnullnullnull\222null\224\224\222null\224\224\222null\224\224\222null\224\224nullnullnullnull\222null\224\224\222null\224\224!");
    }

    @Test
    public void test12596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12596");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!", "fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!" + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
    }

    @Test
    public void test12597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12597");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\227\227!!\253\253\253\200}}`\227\227!!\253\253\253]]!", "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\227\227!!\253\253\253\200}}`\227\227!!\253\253\253]]!" + "'", str2, "\227\227!!\253\253\253\200}}`\227\227!!\253\253\253]]!");
    }

    @Test
    public void test12598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12598");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\253\256\256]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "\250\250\246\246\250\250\246\246!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test12599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12599");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014c\u016e\u016c\u016c\u016e\u016c\u016c\u014c\u016e\u016c\u016c\u016e\u016c\u016c\u014c\u016e\u016c\u016c\u016e\u016c\u016c\u014c\u016e\u016c\u016c\u016e\u016c\u016c\u014c\u016e\u016c\u016c\u016e\u016c\u016c!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12600");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253]]]]]]]]\253\253]]]]]]]]\253\253]]]]]]]]\253\253]]]]]]]]\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253]]]]]]]]\253\253]]]]]]]]\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230null!~~null!~~null!~~\215\216\230\230null!~~null!~~null!~~\215\216\230\230null!~~null!~~null!~~\215\216\230\230null!~~null!~~null!~~\215\216\230\230null!~~null!~~null!~~\215\216\230\230null!~~null!~~null!~~\215\216\230\230null!~~null!~~null!~~\215\216\230\230null!~~null!~~null!~~!" + "'", str2, "\215\216\230\230null!~~null!~~null!~~\215\216\230\230null!~~null!~~null!~~\215\216\230\230null!~~null!~~null!~~\215\216\230\230null!~~null!~~null!~~\215\216\230\230null!~~null!~~null!~~\215\216\230\230null!~~null!~~null!~~\215\216\230\230null!~~null!~~null!~~\215\216\230\230null!~~null!~~null!~~!");
    }

    @Test
    public void test12601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12601");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\335LLL\335LLL\335!UU\335!UU\335LLL\335LLL\335!UU\335!UU\335LLL\335LLL\335!UU\335!UU\335LLL\335LLL\335!UU\335\u0348\u0346\u0346!", "!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test12602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12602");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull\336\336nullnull\336\336!", "\u0366\u0365\u0368\u0368!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UN!!UN!!UUUN!!UN!!UU!" + "'", str2, "UN!!UN!!UUUN!!UN!!UU!");
    }

    @Test
    public void test12603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12603");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\u023e\u023e\u023e\u023e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12604");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL!", "^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\u029e\u029e\u029e\u029e~}\200\200~}\200\200\u029e\u029e\u029e\u029e~}\200\200~}\200\200\u029e\u029e\u029e\u029e~}\200\200~}\200\200\u029e\u029e\u029e\u029e~}\200\200~}\200\200\u029e\u029e\u029e\u029e~}\200\200~}\200\200\u029e\u029e\u029e\u029e~}\200\200~}\200\200\u029e\u029e\u029e\u029e~}\200\200~}\200\200\u029e\u029e\u029e\u029e!" + "'", str2, "~}\200\200~}\200\200\u029e\u029e\u029e\u029e~}\200\200~}\200\200\u029e\u029e\u029e\u029e~}\200\200~}\200\200\u029e\u029e\u029e\u029e~}\200\200~}\200\200\u029e\u029e\u029e\u029e~}\200\200~}\200\200\u029e\u029e\u029e\u029e~}\200\200~}\200\200\u029e\u029e\u029e\u029e~}\200\200~}\200\200\u029e\u029e\u029e\u029e~}\200\200~}\200\200\u029e\u029e\u029e\u029e!");
    }

    @Test
    public void test12605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12605");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0108!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!" + "'", str2, "!null!");
    }

    @Test
    public void test12606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12606");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\u0366\u0365\u0368\u0368\u0244\u0244\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12607");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLUULU]]LLUULLUULLUULU]]LLUULLUU!!LLUULU]]LLUULLUULLUULU]]LLUULLUU!!LLUULU]]LLUULLUULLUULU]]LLUULLUULLUULU]]LLUULLUULLUULU]]LLUULLUU!!LLUULU]]LLUULLUULLUULU]]LLUULLUU!!LLUULU]]LLUULLUULLUULU]]LLUULLUU!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!!!LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!!!LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!!!LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!!!LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!!" + "'", str2, "LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!!!LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!!!LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!!!LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!!!LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!!");
    }

    @Test
    public void test12608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12608");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\220\220!!\220\220!!\220\220!!\220\220\u0346\u0348\u0348!", "JILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILLJILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILL!!JILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILLJILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILL!!JILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILLJILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILLJILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILLJILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILL!!JILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILLJILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILL!!JILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILLJILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\220\220!!\220\220!!\220\220!!\220\220\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\220\220!!\220\220!!\220\220!!\220\220\u0346\u0348\u0348!");
    }

    @Test
    public void test12609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12609");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368!\253\253\u0366\u0366\253\253\u0366\u0366\253\253\u0366\u0366\u0346\u0348\u0348!", "N!LLN!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!\253\253\u0366\u0366\253\253\u0366\u0366\253\253\u0366\u0366\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!\253\253\u0366\u0366\253\253\u0366\u0366\253\253\u0366\u0366\u0346\u0348\u0348!");
    }

    @Test
    public void test12610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12610");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNNNUNNN!!UNNNUNNN!!!!UNNNUNNN!!UNNNUNNN!!!!!!UNNNUNNN!!UNNNUNNN!!!!UNNNUNNN!!UNNNUNNN!!!!!!UNNNUNNN!!UNNNUNNN!!!!UNNNUNNN!!UNNNUNNN!!!!!!UNNNUNNN!!UNNNUNNN!!!!UNNNUNNN!!UNNNUNNN!!!!!!UNNNUNNN!!UNNNUNNN!!!!UNNNUNNN!!UNNNUNNN!!!!!!UNNNUNNN!!UNNNUNNN!!!!UNNNUNNN!!UNNNUNNN!!!!!!UNNNUNNN!!UNNNUNNN!!!!UNNNUNNN!!UNNNUNNN!!!!!!UNNNUNNN!!UNNNUNNN!!!!UNNNUNNN!!UNNNUNNN!!!!!!!", "XUUUXUUUXUUUXUUUXUUUXUUUXUUUXUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XUUUXUUU!!XUUUXUUU!!!!XUUUXUUU!!XUUUXUUU!!!!!!XUUUXUUU!!XUUUXUUU!!!!XUUUXUUU!!XUUUXUUU!!!!!!XUUUXUUU!!XUUUXUUU!!!!XUUUXUUU!!XUUUXUUU!!!!!!XUUUXUUU!!XUUUXUUU!!!!XUUUXUUU!!XUUUXUUU!!!!!!XUUUXUUU!!XUUUXUUU!!!!XUUUXUUU!!XUUUXUUU!!!!!!XUUUXUUU!!XUUUXUUU!!!!XUUUXUUU!!XUUUXUUU!!!!!!XUUUXUUU!!XUUUXUUU!!!!XUUUXUUU!!XUUUXUUU!!!!!!XUUUXUUU!!XUUUXUUU!!!!XUUUXUUU!!XUUUXUUU!!!!!!!" + "'", str2, "XUUUXUUU!!XUUUXUUU!!!!XUUUXUUU!!XUUUXUUU!!!!!!XUUUXUUU!!XUUUXUUU!!!!XUUUXUUU!!XUUUXUUU!!!!!!XUUUXUUU!!XUUUXUUU!!!!XUUUXUUU!!XUUUXUUU!!!!!!XUUUXUUU!!XUUUXUUU!!!!XUUUXUUU!!XUUUXUUU!!!!!!XUUUXUUU!!XUUUXUUU!!!!XUUUXUUU!!XUUUXUUU!!!!!!XUUUXUUU!!XUUUXUUU!!!!XUUUXUUU!!XUUUXUUU!!!!!!XUUUXUUU!!XUUUXUUU!!!!XUUUXUUU!!XUUUXUUU!!!!!!XUUUXUUU!!XUUUXUUU!!!!XUUUXUUU!!XUUUXUUU!!!!!!!");
    }

    @Test
    public void test12611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12611");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!", "\u014e\u0150\u0150\u014e\u0150\u0150\u014e\u0150\u0150\u014e\u0150\u0150\u014e\u0150\u0150\u014e\u0150\u0150]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!" + "'", str2, "^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!");
    }

    @Test
    public void test12612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12612");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\213\213\213\u0346\u0348\u0348!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200EHHHEHHHEHHHEHHH\226\227\231\231\226\227\231\231\226\227\231\231EHHHEHHHEHHHEHHH\226\227\231\231\226\227\231\231\226\227\231\231}~\200\200}~\200\200EHHHEHHHEHHHEHHH\226\227\231\231\226\227\231\231\226\227\231\231EHHHEHHHEHHHEHHH\226\227\231\231\226\227\231\231\226\227\231\231}~\200\200}~\200\200EHHHEHHHEHHHEHHH\226\227\231\231\226\227\231\231\226\227\231\231EHHHEHHHEHHHEHHH\226\227\231\231\226\227\231\231\226\227\231\231}~\200\200}~\200\200EHHHEHHHEHHHEHHH\226\227\231\231\226\227\231\231\226\227\231\231EHHHEHHHEHHHEHHH\226\227\231\231\226\227\231\231\226\227\231\231\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\213\213\213\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\213\213\213\u0346\u0348\u0348!");
    }

    @Test
    public void test12613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12613");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLL!", "\u028d\u028e\u0290\u0290nullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLL!" + "'", str2, "LL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLL!");
    }

    @Test
    public void test12614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12614");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12615");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UU]]UU]]\276\276UU]]UU]]\276\276\253\253UU]]UU]]\276\276UU]]UU]]\276\276\253\253UU]]UU]]\276\276UU]]UU]]\276\276\253\253UU]]UU]]\276\276UU]]UU]]\276\276\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UU]]UU]]\276\276UU]]UU]]\276\276\253\253UU]]UU]]\276\276UU]]UU]]\276\276\253\253!", "LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\216\216]]\216\216]]\276\276\216\216]]\216\216]]\276\276\253\253\216\216]]\216\216]]\276\276\216\216]]\216\216]]\276\276\253\253\216\216]]\216\216]]\276\276\216\216]]\216\216]]\276\276\253\253\216\216]]\216\216]]\276\276\216\216]]\216\216]]\276\276\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\216\216]]\216\216]]\276\276\216\216]]\216\216]]\276\276\253\253\216\216]]\216\216]]\276\276\216\216]]\216\216]]\276\276\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\216\216]]\216\216]]\276\276\216\216]]\216\216]]\276\276\253\253\216\216]]\216\216]]\276\276\216\216]]\216\216]]\276\276\253\253\216\216]]\216\216]]\276\276\216\216]]\216\216]]\276\276\253\253\216\216]]\216\216]]\276\276\216\216]]\216\216]]\276\276\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\216\216]]\216\216]]\276\276\216\216]]\216\216]]\276\276\253\253\216\216]]\216\216]]\276\276\216\216]]\216\216]]\276\276\253\253!");
    }

    @Test
    public void test12616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12616");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!!", "\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106nullLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!!" + "'", str2, "\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!!");
    }

    @Test
    public void test12617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12617");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!!!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!!!", "\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~!!!!!!!!!~!!!!!!!!!~!!!!!!!!!~!!!!!!!!!~!!!!!!!!!~!!!!!!!!!~!!!!!!!!!~!!!!!!!!!!!~!!!!!!!!!~!!!!!!!!!~!!!!!!!!!~!!!!!!!!!~!!!!!!!!!~!!!!!!!!!~!!!!!!!!!~!!!!!!!!!!!" + "'", str2, "!~!!!!!!!!!~!!!!!!!!!~!!!!!!!!!~!!!!!!!!!~!!!!!!!!!~!!!!!!!!!~!!!!!!!!!~!!!!!!!!!!!~!!!!!!!!!~!!!!!!!!!~!!!!!!!!!~!!!!!!!!!~!!!!!!!!!~!!!!!!!!!~!!!!!!!!!~!!!!!!!!!!!");
    }

    @Test
    public void test12618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12618");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!", "!``LLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!" + "'", str2, "\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!");
    }

    @Test
    public void test12619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12619");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\300\300!!\300\300!!!", "nullnullnullnull\222null\224\224\222null\224\224\222null\224\224\222null\224\224nullnullnullnull\222null\224\224\222null\224\224!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test12620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12620");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u0348\u0346\u0346!");
    }

    @Test
    public void test12621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12621");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0129\u0129\u0129\u0129nullll!", "\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271~}}^\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\267\266\271\271\267\266\271\271\267\266\271\271\267\266\271\271null\267\266\271\271\271\271null\267\266\271\271\271\271null\267\266\271\271\271\271null\267\266\271\271\271\271!" + "'", str2, "\267\266\271\271\267\266\271\271\267\266\271\271\267\266\271\271null\267\266\271\271\271\271null\267\266\271\271\271\271null\267\266\271\271\271\271null\267\266\271\271\271\271!");
    }

    @Test
    public void test12622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12622");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test12623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12623");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!", "}~\200\200}~\200\200null^\214\214null^\214\214}~\200\200}~\200\200null^\214\214null^\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!" + "'", str2, "!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!\207\230\204\204\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!!\207\230\204\204\207\230\204\204!");
    }

    @Test
    public void test12624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12624");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "!nullnullnull!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12625");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN}~\200\200}~\200\200LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!", "\275\275\275\275\275\275\275\275LLLLLLLL\275\275\275\275\275\275\275\275LLLLLLLL\275\275\275\275\275\275\275\275LLLLLLLL\275\275\275\275\275\275\275\275LLLLLLLL\275\275\275\275\275\275\275\275LLLLLLLL\275\275\275\275\275\275\275\275LLLLLLLL\275\275\275\275\275\275\275\275LLLLLLLL\275\275\275\275\275\275\275\275LLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200\300nullnullnull\300nullnullnull\300nullnullnull\300nullnullnull\300nullnullnull\300nullnullnull\300nullnullnull\300nullnullnull}~\200\200}~\200\200\300nullnullnull\300nullnullnull\300nullnullnull\300nullnullnull\300nullnullnull\300nullnullnull\300nullnullnull\300nullnullnull!" + "'", str2, "}~\200\200}~\200\200\300nullnullnull\300nullnullnull\300nullnullnull\300nullnullnull\300nullnullnull\300nullnullnull\300nullnullnull\300nullnullnull}~\200\200}~\200\200\300nullnullnull\300nullnullnull\300nullnullnull\300nullnullnull\300nullnullnull\300nullnullnull\300nullnullnull\300nullnullnull!");
    }

    @Test
    public void test12626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12626");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!", "\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e!!!" + "'", str2, "\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e!!!");
    }

    @Test
    public void test12627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12627");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLL\220NN\200}}`NLLL\220NN]]!", "!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!!!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\220nullnull\200}}`nullnullnullnull\220nullnull]]!" + "'", str2, "nullnullnullnull\220nullnull\200}}`nullnullnullnull\220nullnull]]!");
    }

    @Test
    public void test12628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12628");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226!!NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226!!!", "LNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02fa\u02fa\u02fa\u02fa\230\226\226\u02fa\u02fa\u02fa\u02fa\230\226\226\u02fa\u02fa\u02fa\u02fa\230\226\226\u02fa\u02fa\u02fa\u02fa\230\226\226\u02fa\u02fa\u02fa\u02fa\230\226\226\u02fa\u02fa\u02fa\u02fa\230\226\226\u02fa\u02fa\u02fa\u02fa\230\226\226\u02fa\u02fa\u02fa\u02fa\230\226\226\u02fa\u02fa\u02fa\u02fa\230\226\226\u02fa\u02fa\u02fa\u02fa\230\226\226\u02fa\u02fa\u02fa\u02fa\230\226\226\u02fa\u02fa\u02fa\u02fa\230\226\226\u02fa\u02fa\u02fa\u02fa\230\226\226\u02fa\u02fa\u02fa\u02fa\230\226\226\u02fa\u02fa\u02fa\u02fa\230\226\226\u02fa\u02fa\u02fa\u02fa\230\226\226!!!" + "'", str2, "\u02fa\u02fa\u02fa\u02fa\230\226\226\u02fa\u02fa\u02fa\u02fa\230\226\226\u02fa\u02fa\u02fa\u02fa\230\226\226\u02fa\u02fa\u02fa\u02fa\230\226\226\u02fa\u02fa\u02fa\u02fa\230\226\226\u02fa\u02fa\u02fa\u02fa\230\226\226\u02fa\u02fa\u02fa\u02fa\230\226\226\u02fa\u02fa\u02fa\u02fa\230\226\226\u02fa\u02fa\u02fa\u02fa\230\226\226\u02fa\u02fa\u02fa\u02fa\230\226\226\u02fa\u02fa\u02fa\u02fa\230\226\226\u02fa\u02fa\u02fa\u02fa\230\226\226\u02fa\u02fa\u02fa\u02fa\230\226\226\u02fa\u02fa\u02fa\u02fa\230\226\226\u02fa\u02fa\u02fa\u02fa\230\226\226\u02fa\u02fa\u02fa\u02fa\230\226\226!!!");
    }

    @Test
    public void test12629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12629");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!!", "``}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200``}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200!!``}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200``}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256\200L!!\200L!!\200L!!\200L!!\200L!!\200L!!\253\254\256\256\200L!!\200L!!\200L!!\200L!!\200L!!\200L!!!!\253\254\256\256\200L!!\200L!!\200L!!\200L!!\200L!!\200L!!\253\254\256\256\200L!!\200L!!\200L!!\200L!!\200L!!\200L!!!!\253\254\256\256\200L!!\200L!!\200L!!\200L!!\200L!!\200L!!\253\254\256\256\200L!!\200L!!\200L!!\200L!!\200L!!\200L!!!!\253\254\256\256\200L!!\200L!!\200L!!\200L!!\200L!!\200L!!\253\254\256\256\200L!!\200L!!\200L!!\200L!!\200L!!\200L!!!!\253\254\256\256\200L!!\200L!!\200L!!\200L!!\200L!!\200L!!\253\254\256\256\200L!!\200L!!\200L!!\200L!!\200L!!\200L!!!!\253\254\256\256\200L!!\200L!!\200L!!\200L!!\200L!!\200L!!\253\254\256\256\200L!!\200L!!\200L!!\200L!!\200L!!\200L!!!!\253\254\256\256\200L!!\200L!!\200L!!\200L!!\200L!!\200L!!\253\254\256\256\200L!!\200L!!\200L!!\200L!!\200L!!\200L!!!!\253\254\256\256\200L!!\200L!!\200L!!\200L!!\200L!!\200L!!\253\254\256\256\200L!!\200L!!\200L!!\200L!!\200L!!\200L!!!!!" + "'", str2, "\253\254\256\256\200L!!\200L!!\200L!!\200L!!\200L!!\200L!!\253\254\256\256\200L!!\200L!!\200L!!\200L!!\200L!!\200L!!!!\253\254\256\256\200L!!\200L!!\200L!!\200L!!\200L!!\200L!!\253\254\256\256\200L!!\200L!!\200L!!\200L!!\200L!!\200L!!!!\253\254\256\256\200L!!\200L!!\200L!!\200L!!\200L!!\200L!!\253\254\256\256\200L!!\200L!!\200L!!\200L!!\200L!!\200L!!!!\253\254\256\256\200L!!\200L!!\200L!!\200L!!\200L!!\200L!!\253\254\256\256\200L!!\200L!!\200L!!\200L!!\200L!!\200L!!!!\253\254\256\256\200L!!\200L!!\200L!!\200L!!\200L!!\200L!!\253\254\256\256\200L!!\200L!!\200L!!\200L!!\200L!!\200L!!!!\253\254\256\256\200L!!\200L!!\200L!!\200L!!\200L!!\200L!!\253\254\256\256\200L!!\200L!!\200L!!\200L!!\200L!!\200L!!!!\253\254\256\256\200L!!\200L!!\200L!!\200L!!\200L!!\200L!!\253\254\256\256\200L!!\200L!!\200L!!\200L!!\200L!!\200L!!!!\253\254\256\256\200L!!\200L!!\200L!!\200L!!\200L!!\200L!!\253\254\256\256\200L!!\200L!!\200L!!\200L!!\200L!!\200L!!!!!");
    }

    @Test
    public void test12630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12630");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!u!!!u!!!u!!!u!!\256\254\254!u!!!u!!!u!!!u!!\256\254\254!!!u!!!u!!!u!!!u!!\256\254\254!u!!!u!!!u!!!u!!\256\254\254!!!u!!!u!!!u!!!u!!\256\254\254!u!!!u!!!u!!!u!!\256\254\254!!!u!!!u!!!u!!!u!!\256\254\254!u!!!u!!!u!!!u!!\256\254\254!!!u!!!u!!!u!!!u!!\256\254\254!u!!!u!!!u!!!u!!\256\254\254!!!u!!!u!!!u!!!u!!\256\254\254!u!!!u!!!u!!!u!!\256\254\254!!!u!!!u!!!u!!!u!!\256\254\254!u!!!u!!!u!!!u!!\256\254\254!!!u!!!u!!!u!!!u!!\256\254\254!u!!!u!!!u!!!u!!\256\254\254!!!", "\276!ll\276!ll\276!ll\276!ll!\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll!\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll!\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll!\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\200}}`\276!ll\276!ll\276!ll\276!ll!\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll!\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll!\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll!\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!null!!!null!!\256\254\254!null!!!null!!!null!!!null!!\256\254\254!!!null!!!null!!!null!!!null!!\256\254\254!null!!!null!!!null!!!null!!\256\254\254!!!null!!!null!!!null!!!null!!\256\254\254!null!!!null!!!null!!!null!!\256\254\254!!!null!!!null!!!null!!!null!!\256\254\254!null!!!null!!!null!!!null!!\256\254\254!!!null!!!null!!!null!!!null!!\256\254\254!null!!!null!!!null!!!null!!\256\254\254!!!null!!!null!!!null!!!null!!\256\254\254!null!!!null!!!null!!!null!!\256\254\254!!!null!!!null!!!null!!!null!!\256\254\254!null!!!null!!!null!!!null!!\256\254\254!!!null!!!null!!!null!!!null!!\256\254\254!null!!!null!!!null!!!null!!\256\254\254!!!" + "'", str2, "!null!!!null!!!null!!!null!!\256\254\254!null!!!null!!!null!!!null!!\256\254\254!!!null!!!null!!!null!!!null!!\256\254\254!null!!!null!!!null!!!null!!\256\254\254!!!null!!!null!!!null!!!null!!\256\254\254!null!!!null!!!null!!!null!!\256\254\254!!!null!!!null!!!null!!!null!!\256\254\254!null!!!null!!!null!!!null!!\256\254\254!!!null!!!null!!!null!!!null!!\256\254\254!null!!!null!!!null!!!null!!\256\254\254!!!null!!!null!!!null!!!null!!\256\254\254!null!!!null!!!null!!!null!!\256\254\254!!!null!!!null!!!null!!!null!!\256\254\254!null!!!null!!!null!!!null!!\256\254\254!!!null!!!null!!!null!!!null!!\256\254\254!null!!!null!!!null!!!null!!\256\254\254!!!");
    }

    @Test
    public void test12631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12631");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!!!!", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHH!!!!!!!" + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHH!!!!!!!");
    }

    @Test
    public void test12632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12632");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\275\275\275\275\u0348\u0346\u0346!", "EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\275\275\275\275\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\275\275\275\275\u0348\u0346\u0346!");
    }

    @Test
    public void test12633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12633");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnull!]nullnull!]nullnull!]nullnull!]nullnullnullnullnullnull!]nullnull!]nullnull!", "\253!LLL\260\260\253!LLL\260\260!!\253!LLL\260\260\253!LLL\260\260!!!!\253!LLL\260\260\253!LLL\260\260!!\253!LLL\260\260\253!LLL\260\260!!!!\253!LLL\260\260\253!LLL\260\260!!\253!LLL\260\260\253!LLL\260\260!!!!\253!LLL\260\260\253!LLL\260\260!!\253!LLL\260\260\253!LLL\260\260!!!!\253!LLL\260\260\253!LLL\260\260!!\253!LLL\260\260\253!LLL\260\260!!!!\253!LLL\260\260\253!LLL\260\260!!\253!LLL\260\260\253!LLL\260\260!!!!\253!LLL\260\260\253!LLL\260\260!!\253!LLL\260\260\253!LLL\260\260!!!!\253!LLL\260\260\253!LLL\260\260!!\253!LLL\260\260\253!LLL\260\260!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLL!]LLLLLLLL!]LLLLLLLL!]LLLLLLLL!]LLLLLLLLLLLLLLLLLLLLLLLL!]LLLLLLLL!]LLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLL!]LLLLLLLL!]LLLLLLLL!]LLLLLLLL!]LLLLLLLLLLLLLLLLLLLLLLLL!]LLLLLLLL!]LLLLLLLL!");
    }

    @Test
    public void test12634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12634");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLLLLLLL!!LLLLLLLL!!!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\253\254\256\256\253\254\256\256HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\253\254\256\256\253\254\256\256HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\253\254\256\256\253\254\256\256HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\253\254\256\256\253\254\256\256HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\253\254\256\256\253\254\256\256HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\253\254\256\256\253\254\256\256HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\253\254\256\256\253\254\256\256HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\253\254\256\256\253\254\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test12635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12635");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!\200\200\u0346\u0348\u0348!", "NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNNNLUUNLUUNNNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNNNLUUNLUUNNNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNNNLUUNLUUNNNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNNNLUUNLUUNNNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNNNLUUNLUUNNNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNNNLUUNLUUNNNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNNNLUUNLUUNNNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNNNLUUNLUUNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test12636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12636");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLNULLNULLNULLNULLNLLLNULLNULL!", "\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\235\235\235nullnull\235\235nullnull\235\235nullnull\235\235nullnull\235\235null\235\235\235nullnull\235\235nullnull\235\235!" + "'", str2, "null\235\235\235nullnull\235\235nullnull\235\235nullnull\235\235nullnull\235\235null\235\235\235nullnull\235\235nullnull\235\235!");
    }

    @Test
    public void test12637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12637");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HH\276\276HH\276\276!!\256\254\254HH\276\276HH\276\276!!\256\254\254!!HH\276\276HH\276\276!!\256\254\254HH\276\276HH\276\276!!\256\254\254!!HH\276\276HH\276\276!!\256\254\254HH\276\276HH\276\276!!\256\254\254!!HH\276\276HH\276\276!!\256\254\254HH\276\276HH\276\276!!\256\254\254!!HH\276\276HH\276\276!!\256\254\254HH\276\276HH\276\276!!\256\254\254!!HH\276\276HH\276\276!!\256\254\254HH\276\276HH\276\276!!\256\254\254!!HH\276\276HH\276\276!!\256\254\254HH\276\276HH\276\276!!\256\254\254!!HH\276\276HH\276\276!!\256\254\254HH\276\276HH\276\276!!\256\254\254!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!!" + "'", str2, "nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!nullnull\276\276nullnull\276\276!!\256\254\254nullnull\276\276nullnull\276\276!!\256\254\254!!!");
    }

    @Test
    public void test12638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12638");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275!]]]!]]]!]]]\275!]]]!]]]!]]]\275!]]]!]]]!]]]\275!]]]!]]]!]]]!]]]!]]]\275\275!]]]!]]]\275\275!]]]!]]]\275\275!]]]!]]]\275\275\275!]]]!]]]!]]]\275!]]]!]]]!]]]\275!]]]!]]]!]]]\275!]]]!]]]!]]]!]]]!]]]\275\275!]]]!]]]\275\275!", "LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!]]]!]]]!]]]\275!]]]!]]]!]]]\275!]]]!]]]!]]]\275!]]]!]]]!]]]!]]]!]]]\275\275!]]]!]]]\275\275!]]]!]]]\275\275!]]]!]]]\275\275\275!]]]!]]]!]]]\275!]]]!]]]!]]]\275!]]]!]]]!]]]\275!]]]!]]]!]]]!]]]!]]]\275\275!]]]!]]]\275\275!" + "'", str2, "\275!]]]!]]]!]]]\275!]]]!]]]!]]]\275!]]]!]]]!]]]\275!]]]!]]]!]]]!]]]!]]]\275\275!]]]!]]]\275\275!]]]!]]]\275\275!]]]!]]]\275\275\275!]]]!]]]!]]]\275!]]]!]]]!]]]\275!]]]!]]]!]]]\275!]]]!]]]!]]]!]]]!]]]\275\275!]]]!]]]\275\275!");
    }

    @Test
    public void test12639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12639");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("xx!!nullnullnullxx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!nullnullnullxx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!", "\260\260NN\260\260NN}}\260\260NN\260\260NN}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!rnullnullnullrnullnullnullrnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!rnullnullnullrnullnullnullrnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!rnullnullnullrnullnullnullrnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!rnullnullnullrnullnullnullrnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test12640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12640");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!", "\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~~~!null~~!null~~~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~~~!null~~!null~~~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~~~!null~~!null~~~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~~~!null~~!null~~~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~~~!null~~!null~~~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~~~!null~~!null~~~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~~~!null~~!null~~~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~~~!null~~!null~~~~!" + "'", str2, "!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~~~!null~~!null~~~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~~~!null~~!null~~~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~~~!null~~!null~~~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~~~!null~~!null~~~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~~~!null~~!null~~~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~~~!null~~!null~~~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~~~!null~~!null~~~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~~~!null~~!null~~~~!");
    }

    @Test
    public void test12641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12641");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!LL!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnull!!!" + "'", str2, "!nullnull!!!");
    }

    @Test
    public void test12642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12642");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368NNLLNNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260!" + "'", str2, "nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260!");
    }

    @Test
    public void test12643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12643");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NNUUNNUU!!NNUUNNUU!!NNUUNNUUNNUUNNUU!!NNUUNNUU!!NNUUNNUU!", "`OROOOROOOROO`OROOOROOOROO!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12644");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLUULLUULLUULLUU\260\255\255\225\230\230LLUULLUULLUULLUU\260\255\255\225\230\230LLUULLUULLUULLUU\260\255\255\225\230\230LLUULLUULLUULLUU\260\255\255\225\230\230\200}}`LLUULLUULLUULLUU\260\255\255\225\230\230LLUULLUULLUULLUU\260\255\255\225\230\230LLUULLUULLUULLUU\260\255\255\225\230\230LLUULLUULLUULLUU\260\255\255\225\230\230]]!", "!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!\303\304\306\306\303\304\306\306\275null!!\275null!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\260\255\255\225\230\230\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\260\255\255\225\230\230\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\260\255\255\225\230\230\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\260\255\255\225\230\230\200\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\260\255\255\225\230\230\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\260\255\255\225\230\230\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\260\255\255\225\230\230\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\260\255\255\225\230\230]]!" + "'", str2, "\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\260\255\255\225\230\230\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\260\255\255\225\230\230\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\260\255\255\225\230\230\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\260\255\255\225\230\230\200\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\260\255\255\225\230\230\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\260\255\255\225\230\230\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\260\255\255\225\230\230\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\260\255\255\225\230\230]]!");
    }

    @Test
    public void test12645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12645");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215}\215\215\215}\215\215NNFF!!!NNFF!!!NNFF!!!NNFF!!!\215}\215\215\215}\215\215!", "nullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhhnullnullnullnullnullnullnullnullhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215UUUU!!!UUUU!!!UUUU!!!UUUU!!!\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215UUUU!!!UUUU!!!UUUU!!!UUUU!!!\215}\215\215\215}\215\215!");
    }

    @Test
    public void test12646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12646");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200nulllulllulllull^nulllulllulllullnulllulllulllullnulllulllulllull^nulllulllulllullnulllulllulllull}~\200\200}~\200\200nulllulllulllull^nulllulllulllullnulllulllulllullnulllulllulllull^nulllulllulllullnulllulllulllull!", "\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!!}~\200\200}~\200\200\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!!!" + "'", str2, "}~\200\200}~\200\200\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!!}~\200\200}~\200\200\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!!!");
    }

    @Test
    public void test12647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12647");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\254\256\256\366\367\371\371\366\367\371\371\366\367\371\371\366\367\371\371\253\254\256\256\366\367\371\371\366\367\371\371!", "null\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256L\367LLL\367LLL\367LLL\367LL\253\254\256\256L\367LLL\367LL!" + "'", str2, "\253\254\256\256L\367LLL\367LLL\367LLL\367LL\253\254\256\256L\367LLL\367LL!");
    }

    @Test
    public void test12648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12648");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!!", "\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!!" + "'", str2, "\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!!");
    }

    @Test
    public void test12649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12649");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\254!!!\254!!\254\254~!\254!!!\254!!\254\254!\254!!!\254!!\254\254!\254!!!\254!!\254\254~!\254!!!\254!!\254\254!\254!!!\254!!\254\254!!!\254!!!\254!!\254\254~!\254!!!\254!!\254\254!\254!!!\254!!\254\254!\254!!!\254!!\254\254~!\254!!!\254!!\254\254!\254!!!\254!!\254\254!!!\254!!!\254!!\254\254~!\254!!!\254!!\254\254!\254!!!\254!!\254\254!\254!!!\254!!\254\254~!\254!!!\254!!\254\254!\254!!!\254!!\254\254!\254!!!\254!!\254\254~!\254!!!\254!!\254\254!\254!!!\254!!\254\254!\254!!!\254!!\254\254~!\254!!!\254!!\254\254!\254!!!\254!!\254\254!!!\254!!!\254!!\254\254~!\254!!!\254!!\254\254!\254!!!\254!!\254\254!\254!!!\254!!\254\254~!\254!!!\254!!\254\254!\254!!!\254!!\254\254!!!\254!!!\254!!\254\254~!\254!!!\254!!\254\254!\254!!!\254!!\254\254!\254!!!\254!!\254\254~!\254!!!\254!!\254\254!\254!!!\254!!\254\254!", "nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\254!!!\254!!\254\254~!\254!!!\254!!\254\254!\254!!!\254!!\254\254!\254!!!\254!!\254\254~!\254!!!\254!!\254\254!\254!!!\254!!\254\254!!!\254!!!\254!!\254\254~!\254!!!\254!!\254\254!\254!!!\254!!\254\254!\254!!!\254!!\254\254~!\254!!!\254!!\254\254!\254!!!\254!!\254\254!!!\254!!!\254!!\254\254~!\254!!!\254!!\254\254!\254!!!\254!!\254\254!\254!!!\254!!\254\254~!\254!!!\254!!\254\254!\254!!!\254!!\254\254!\254!!!\254!!\254\254~!\254!!!\254!!\254\254!\254!!!\254!!\254\254!\254!!!\254!!\254\254~!\254!!!\254!!\254\254!\254!!!\254!!\254\254!!!\254!!!\254!!\254\254~!\254!!!\254!!\254\254!\254!!!\254!!\254\254!\254!!!\254!!\254\254~!\254!!!\254!!\254\254!\254!!!\254!!\254\254!!!\254!!!\254!!\254\254~!\254!!!\254!!\254\254!\254!!!\254!!\254\254!\254!!!\254!!\254\254~!\254!!!\254!!\254\254!\254!!!\254!!\254\254!" + "'", str2, "!\254!!!\254!!\254\254~!\254!!!\254!!\254\254!\254!!!\254!!\254\254!\254!!!\254!!\254\254~!\254!!!\254!!\254\254!\254!!!\254!!\254\254!!!\254!!!\254!!\254\254~!\254!!!\254!!\254\254!\254!!!\254!!\254\254!\254!!!\254!!\254\254~!\254!!!\254!!\254\254!\254!!!\254!!\254\254!!!\254!!!\254!!\254\254~!\254!!!\254!!\254\254!\254!!!\254!!\254\254!\254!!!\254!!\254\254~!\254!!!\254!!\254\254!\254!!!\254!!\254\254!\254!!!\254!!\254\254~!\254!!!\254!!\254\254!\254!!!\254!!\254\254!\254!!!\254!!\254\254~!\254!!!\254!!\254\254!\254!!!\254!!\254\254!!!\254!!!\254!!\254\254~!\254!!!\254!!\254\254!\254!!!\254!!\254\254!\254!!!\254!!\254\254~!\254!!!\254!!\254\254!\254!!!\254!!\254\254!!!\254!!!\254!!\254\254~!\254!!!\254!!\254\254!\254!!!\254!!\254\254!\254!!!\254!!\254\254~!\254!!!\254!!\254\254!\254!!!\254!!\254\254!");
    }

    @Test
    public void test12650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12650");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!", "LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]\200nullnullff\200\200\200nullnullff\200\200]]\200nullnullff\200\200\200nullnullff\200\200!!]]\200nullnullff\200\200\200nullnullff\200\200]]\200nullnullff\200\200\200nullnullff\200\200!!]]\200nullnullff\200\200\200nullnullff\200\200]]\200nullnullff\200\200\200nullnullff\200\200]]\200nullnullff\200\200\200nullnullff\200\200]]\200nullnullff\200\200\200nullnullff\200\200!!]]\200nullnullff\200\200\200nullnullff\200\200]]\200nullnullff\200\200\200nullnullff\200\200!!]]\200nullnullff\200\200\200nullnullff\200\200]]\200nullnullff\200\200\200nullnullff\200\200!" + "'", str2, "]]\200nullnullff\200\200\200nullnullff\200\200]]\200nullnullff\200\200\200nullnullff\200\200!!]]\200nullnullff\200\200\200nullnullff\200\200]]\200nullnullff\200\200\200nullnullff\200\200!!]]\200nullnullff\200\200\200nullnullff\200\200]]\200nullnullff\200\200\200nullnullff\200\200]]\200nullnullff\200\200\200nullnullff\200\200]]\200nullnullff\200\200\200nullnullff\200\200!!]]\200nullnullff\200\200\200nullnullff\200\200]]\200nullnullff\200\200\200nullnullff\200\200!!]]\200nullnullff\200\200\200nullnullff\200\200]]\200nullnullff\200\200\200nullnullff\200\200!");
    }

    @Test
    public void test12651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12651");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test12652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12652");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348!", "!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348!" + "'", str2, "\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348!");
    }

    @Test
    public void test12653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12653");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\254LLL\254LLLL\254LLL\254LL\254LLL\254LLLL\254LLL\254LL\254LLL\254LLLL\254LLL\254LL\254LLL\254LLLL\254LLL\254LL\254LLL\254LLLL\254LLL\254LL\254LLL\254LLLL\254LLL\254LL\254LLL\254LLLL\254LLL\254LL\254LLL\254LLLL\254LLL\254LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12654");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!", "~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120!nullnull!" + "'", str2, "\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120!nullnull!");
    }

    @Test
    public void test12655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12655");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ULLLULL\256\254\254ULLLULL\256\254\254!!ULLLULL\256\254\254ULLLULL\256\254\254!!ULLLULL\256\254\254ULLLULL\256\254\254!!ULLLULL\256\254\254ULLLULL\256\254\254!!ULLLULL\256\254\254ULLLULL\256\254\254!!ULLLULL\256\254\254ULLLULL\256\254\254!!ULLLULL\256\254\254ULLLULL\256\254\254!!ULLLULL\256\254\254ULLLULL\256\254\254!!!", "\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01ad\u01ad\u01ad\u01ad\u01ad\256\254\254\u01ad\u01ad\u01ad\u01ad\u01ad\256\254\254\u01ad\u01ad\u01ad\u01ad\u01ad\256\254\254\u01ad\u01ad\u01ad\u01ad\u01ad\256\254\254\u01ad\u01ad\u01ad\u01ad\u01ad\256\254\254\u01ad\u01ad\u01ad\u01ad\u01ad\256\254\254\u01ad\u01ad\u01ad\u01ad\u01ad\256\254\254\u01ad\u01ad\u01ad\u01ad\u01ad\256\254\254\u01ad\u01ad\u01ad\u01ad\u01ad\256\254\254\u01ad\u01ad\u01ad\u01ad\u01ad\256\254\254\u01ad\u01ad\u01ad\u01ad\u01ad\256\254\254\u01ad\u01ad\u01ad\u01ad\u01ad\256\254\254\u01ad\u01ad\u01ad\u01ad\u01ad\256\254\254\u01ad\u01ad\u01ad\u01ad\u01ad\256\254\254\u01ad\u01ad\u01ad\u01ad\u01ad\256\254\254\u01ad\u01ad\u01ad\u01ad\u01ad\256\254\254!!!" + "'", str2, "\u01ad\u01ad\u01ad\u01ad\u01ad\256\254\254\u01ad\u01ad\u01ad\u01ad\u01ad\256\254\254\u01ad\u01ad\u01ad\u01ad\u01ad\256\254\254\u01ad\u01ad\u01ad\u01ad\u01ad\256\254\254\u01ad\u01ad\u01ad\u01ad\u01ad\256\254\254\u01ad\u01ad\u01ad\u01ad\u01ad\256\254\254\u01ad\u01ad\u01ad\u01ad\u01ad\256\254\254\u01ad\u01ad\u01ad\u01ad\u01ad\256\254\254\u01ad\u01ad\u01ad\u01ad\u01ad\256\254\254\u01ad\u01ad\u01ad\u01ad\u01ad\256\254\254\u01ad\u01ad\u01ad\u01ad\u01ad\256\254\254\u01ad\u01ad\u01ad\u01ad\u01ad\256\254\254\u01ad\u01ad\u01ad\u01ad\u01ad\256\254\254\u01ad\u01ad\u01ad\u01ad\u01ad\256\254\254\u01ad\u01ad\u01ad\u01ad\u01ad\256\254\254\u01ad\u01ad\u01ad\u01ad\u01ad\256\254\254!!!");
    }

    @Test
    public void test12656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12656");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ULLLnullnullnullULLLnullnullnullULLLnullnullnullULLLnullnullnullULLLnullnullnullULLLnullnullnullULLLnullnullnullULLLnullnullnull!", "\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUU\230U\215\215\230U\215\215\230U\215\215UUUU\230U\215\215\230U\215\215\230U\215\215UUUU\230U\215\215\230U\215\215\230U\215\215UUUU\230U\215\215\230U\215\215\230U\215\215UUUU\230U\215\215\230U\215\215\230U\215\215UUUU\230U\215\215\230U\215\215\230U\215\215UUUU\230U\215\215\230U\215\215\230U\215\215UUUU\230U\215\215\230U\215\215\230U\215\215!" + "'", str2, "UUUU\230U\215\215\230U\215\215\230U\215\215UUUU\230U\215\215\230U\215\215\230U\215\215UUUU\230U\215\215\230U\215\215\230U\215\215UUUU\230U\215\215\230U\215\215\230U\215\215UUUU\230U\215\215\230U\215\215\230U\215\215UUUU\230U\215\215\230U\215\215\230U\215\215UUUU\230U\215\215\230U\215\215\230U\215\215UUUU\230U\215\215\230U\215\215\230U\215\215!");
    }

    @Test
    public void test12657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12657");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLL!", "\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12658");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320nullnullnull!", "\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12659");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL^^\225\230\230LL^^\225\230\230LL^^\225\230\230LL^^\225\230\230\200}}`LL^^\225\230\230LL^^\225\230\230LL^^\225\230\230LL^^\225\230\230]]!", "!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230\200}}`UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230]]!" + "'", str2, "UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230\200}}`UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230]]!");
    }

    @Test
    public void test12660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12660");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ss!!ss!!ssssssssss!!ss!!ssssssssss!!ss!!ssssssssss!!ss!!ssssssssss!!ss!!ssssssssss!!ss!!ssssssssss!!ss!!ssssssssss!!ss!!ssssssss!", "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02faN~LLN~LL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa!" + "'", str2, "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa!");
    }

    @Test
    public void test12661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12661");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!", "``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN!!``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN!!``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN!!``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN!!``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!" + "'", str2, "!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!");
    }

    @Test
    public void test12662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12662");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("L\335LLL\335LL!!L\335LLL\335LL!!L\335LLL\335LLL\335LLL\335LL!!L\335LLL\335LL!!L\335LLL\335LL!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12663");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276!", "UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLNN\276\276\276LLNN\276\276\276\276\276LLNN\276\276\276LLNN\276\276\276\276\276LLNN\276\276\276LLNN\276\276\276\276\276LLNN\276\276\276LLNN\276\276\276\276\276LLNN\276\276\276LLNN\276\276\276\276\276LLNN\276\276\276LLNN\276\276\276\276\276LLNN\276\276\276LLNN\276\276\276\276\276LLNN\276\276\276LLNN\276\276\276\276\276!" + "'", str2, "LLNN\276\276\276LLNN\276\276\276\276\276LLNN\276\276\276LLNN\276\276\276\276\276LLNN\276\276\276LLNN\276\276\276\276\276LLNN\276\276\276LLNN\276\276\276\276\276LLNN\276\276\276LLNN\276\276\276\276\276LLNN\276\276\276LLNN\276\276\276\276\276LLNN\276\276\276LLNN\276\276\276\276\276LLNN\276\276\276LLNN\276\276\276\276\276!");
    }

    @Test
    public void test12664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12664");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "`UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU`UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12665");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\ua7ad\ua7ad\ua7ad\ua7ad\200\ua7ad\ua7ad\ua7ad\ua7ad]]!", "\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\200}}`nullnullnullnull]]!" + "'", str2, "nullnullnullnull\200}}`nullnullnullnull]]!");
    }

    @Test
    public void test12666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12666");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\215}\215\215\215}\215\215~nullnullnull~nullnullnull~nullnullnull~nullnullnull\215}\215\215\215}\215\215!", "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\215}\215\215\215}\215\215!");
    }

    @Test
    public void test12667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12667");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!", "HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!" + "'", str2, "!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!!\256\213\213\200\200\254\254\256\213\213\200\200\254\254!");
    }

    @Test
    public void test12668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12668");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\353\356!!!\275\275!!!```\353\356!!!\275\275!!!```\353\356!!!\275\275!!!```\353\356!!!\275\275!!!```\353\356!!!\275\275!!!```\353\356!!!\275\275!!!```\353\356!!!\275\275!!!```\353\356!!!\275\275!!!```\353\356!!!\275\275!!!```\353\356!!!\275\275!!!```\353\356!!!\275\275!!!```\353\356!!!\275\275!!!```\353\356!!!\275\275!!!```\353\356!!!\275\275!!!```\353\356!!!\275\275!!!```\353\356!!!\275\275!!!```\353\356!!!\275\275!!!```\353\356!!!\275\275!!!```\353\356!!!\275\275!!!```\353\356!!!\275\275!!!```\353\356!!!\275\275!!!```\353\356!!!\275\275!!!```\353\356!!!\275\275!!!```\353\356!!!\275\275!!!```\353\356!!!\275\275!!!```\353\356!!!\275\275!!!```\353\356!!!\275\275!!!```\353\356!!!\275\275!!!```\353\356!!!\275\275!!!```\353\356!!!\275\275!!!```\353\356!!!\275\275!!!```\353\356!!!\275\275!!!```!", "EE!!EE!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```!" + "'", str2, "nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```nullnull!!!\275\275!!!```!");
    }

    @Test
    public void test12669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12669");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u01c7\u01c8\u01ca\u01ca\u0348\u0346\u0346!");
    }

    @Test
    public void test12670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12670");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230!!!!!!!!!", "NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!!" + "'", str2, "!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!!");
    }

    @Test
    public void test12671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12671");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!", "`!!!`!!!`!!!`!!!\200\200!!\200\200!!\200\200!!\200\200!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\u037e\u037e\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\u037e\u037e\u0348\u0346\u0346!");
    }

    @Test
    public void test12672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12672");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]!", "!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]!" + "'", str2, "]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]!");
    }

    @Test
    public void test12673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12673");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dcnullnull!", "l!uul!uul!uul!uul!uul!uul!uul!uu!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!!!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!!!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!!!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!!!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!" + "'", str2, "!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!!!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!!!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!!!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!!!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!luunull!luu!luu!");
    }

    @Test
    public void test12674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12674");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!nullnull!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!nullnull!!!!!", "UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e!!!!!" + "'", str2, "\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e!!!!!");
    }

    @Test
    public void test12675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12675");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~L\276\276\276L\276\276\276L\276\276\276~L\276\276\276L\276\276\276L\276\276\276~L\276\276\276L\276\276\276L\276\276\276~L\276\276\276L\276\276\276L\276\276\276\200}}`~L\276\276\276L\276\276\276L\276\276\276~L\276\276\276L\276\276\276L\276\276\276~L\276\276\276L\276\276\276L\276\276\276~L\276\276\276L\276\276\276L\276\276\276]]!", "nullnull!!nullnull!!nullnullnullnull!\214\214nullnullnullnull!\214\214nullnull!!nullnull!!nullnullnullnull!\214\214nullnullnullnull!\214\214nullnull!!nullnull!!nullnullnullnull!\214\214nullnullnullnull!\214\214nullnull!!nullnull!!nullnullnullnull!\214\214nullnullnullnull!\214\214nullnull!!nullnull!!nullnullnullnull!\214\214nullnullnullnull!\214\214nullnull!!nullnull!!nullnullnullnull!\214\214nullnullnullnull!\214\214nullnull!!nullnull!!nullnullnullnull!\214\214nullnullnullnull!\214\214nullnull!!nullnull!!nullnullnullnull!\214\214nullnullnullnull!\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\200\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276]]!" + "'", str2, "\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\200\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276\u020d\276\276\276]]!");
    }

    @Test
    public void test12676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12676");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull\254\254nullnull\254\254]]nullnull\254\254nullnull\254\254]]\214nullnull\254\254nullnull\254\254nullnull\254\254\214nullnull\254\254nullnull\254\254nullnull\254\254nullnull\254\254nullnull\254\254]]nullnull\254\254nullnull\254\254]]\214nullnull\254\254nullnull\254\254nullnull\254\254\214nullnull\254\254nullnull\254\254nullnull\254\254!", "!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``^^``^^\254\254``^^``^^\254\254]]``^^``^^\254\254``^^``^^\254\254]]\214``^^``^^\254\254``^^``^^\254\254``^^``^^\254\254\214``^^``^^\254\254``^^``^^\254\254``^^``^^\254\254``^^``^^\254\254``^^``^^\254\254]]``^^``^^\254\254``^^``^^\254\254]]\214``^^``^^\254\254``^^``^^\254\254``^^``^^\254\254\214``^^``^^\254\254``^^``^^\254\254``^^``^^\254\254!" + "'", str2, "``^^``^^\254\254``^^``^^\254\254]]``^^``^^\254\254``^^``^^\254\254]]\214``^^``^^\254\254``^^``^^\254\254``^^``^^\254\254\214``^^``^^\254\254``^^``^^\254\254``^^``^^\254\254``^^``^^\254\254``^^``^^\254\254]]``^^``^^\254\254``^^``^^\254\254]]\214``^^``^^\254\254``^^``^^\254\254``^^``^^\254\254\214``^^``^^\254\254``^^``^^\254\254``^^``^^\254\254!");
    }

    @Test
    public void test12677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12677");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!lll!lll!lll!lll!!!", "\276\276U\200LLU\200LLU\200LLU\200LL\276U\200LLU\200LLU\200LLU\200LLU\200LLU\200LL\276U\200LLU\200LL\276\276U\200LLU\200LLU\200LLU\200LL\276U\200LLU\200LLU\200LLU\200LLU\200LLU\200LL\276U\200LLU\200LL\276\276U\200LLU\200LLU\200LLU\200LL\276U\200LLU\200LLU\200LLU\200LLU\200LLU\200LL\276U\200LLU\200LL\276\276U\200LLU\200LLU\200LLU\200LL\276U\200LLU\200LLU\200LLU\200LLU\200LLU\200LL\276U\200LLU\200LL\276\276U\200LLU\200LLU\200LLU\200LL\276U\200LLU\200LLU\200LLU\200LLU\200LLU\200LL\276U\200LLU\200LL\276\276U\200LLU\200LLU\200LLU\200LL\276U\200LLU\200LLU\200LLU\200LLU\200LLU\200LL\276U\200LLU\200LL\276\276U\200LLU\200LLU\200LLU\200LL\276U\200LLU\200LLU\200LLU\200LLU\200LLU\200LL\276U\200LLU\200LL\276\276U\200LLU\200LLU\200LLU\200LL\276U\200LLU\200LLU\200LLU\200LLU\200LLU\200LL\276U\200LLU\200LL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200!!!" + "'", str2, "\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200!!!");
    }

    @Test
    public void test12678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12678");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275!null!!!null!!!null!!\276!null!!\275\275!", "\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\u0220\u021f\u0222\u0222\u0220\u021f\u0222\u0222\u0220\u021f\u0222\u0222!!\276\u0220\u021f\u0222\u0222!!\275\275!" + "'", str2, "\275\u0220\u021f\u0222\u0222\u0220\u021f\u0222\u0222\u0220\u021f\u0222\u0222!!\276\u0220\u021f\u0222\u0222!!\275\275!");
    }

    @Test
    public void test12679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12679");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ss!!ss!!!", "~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test12680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12680");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368UNLL\213\213\213\u0346\u0348\u0348!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnullnullnull\213\213\213\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnullnullnull\213\213\213\u0346\u0348\u0348!");
    }

    @Test
    public void test12681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12681");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200\225\225\225\225\225\225\225\225~}\200\200~}\200\200\225\225\225\225\225\225\225\225~}\200\200~}\200\200\225\225\225\225\225\225\225\225~}\200\200~}\200\200\225\225\225\225\225\225\225\225~}\200\200~}\200\200\225\225\225\225\225\225\225\225~}\200\200~}\200\200\225\225\225\225\225\225\225\225~}\200\200~}\200\200\225\225\225\225\225\225\225\225~}\200\200~}\200\200\225\225\225\225\225\225\225\225!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\260\255\255\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\225\225\225\225\225\225\225\225~}\200\200~}\200\200\225\225\225\225\225\225\225\225~}\200\200~}\200\200\225\225\225\225\225\225\225\225~}\200\200~}\200\200\225\225\225\225\225\225\225\225~}\200\200~}\200\200\225\225\225\225\225\225\225\225~}\200\200~}\200\200\225\225\225\225\225\225\225\225~}\200\200~}\200\200\225\225\225\225\225\225\225\225~}\200\200~}\200\200\225\225\225\225\225\225\225\225!" + "'", str2, "~}\200\200~}\200\200\225\225\225\225\225\225\225\225~}\200\200~}\200\200\225\225\225\225\225\225\225\225~}\200\200~}\200\200\225\225\225\225\225\225\225\225~}\200\200~}\200\200\225\225\225\225\225\225\225\225~}\200\200~}\200\200\225\225\225\225\225\225\225\225~}\200\200~}\200\200\225\225\225\225\225\225\225\225~}\200\200~}\200\200\225\225\225\225\225\225\225\225~}\200\200~}\200\200\225\225\225\225\225\225\225\225!");
    }

    @Test
    public void test12682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12682");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee!", "!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!!~~\275\275\276!!~~\275\275!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~\276!!~~\275\275\276!!~~\275\275!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~\276!!~~\275\275\276!!~~\275\275!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~\276!!~~\275\275\276!!~~\275\275!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~\276!!~~\275\275\276!!~~\275\275!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~\276!!~~\275\275\276!!~~\275\275!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~\276!!~~\275\275\276!!~~\275\275!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~\276!!~~\275\275\276!!~~\275\275!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!" + "'", str2, "\276!!~~\275\275\276!!~~\275\275!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~\276!!~~\275\275\276!!~~\275\275!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~\276!!~~\275\275\276!!~~\275\275!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~\276!!~~\275\275\276!!~~\275\275!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~\276!!~~\275\275\276!!~~\275\275!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~\276!!~~\275\275\276!!~~\275\275!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~\276!!~~\275\275\276!!~~\275\275!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~\276!!~~\275\275\276!!~~\275\275!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!");
    }

    @Test
    public void test12683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12683");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!null!\276\276null!\276\276null!\276\276null!\276\276!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!!!", "nullnullnullnulll!uul!uul!uunullnullnullnulll!uul!uul!uu~~~~~nullnullnullnulll!uul!uul!uunullnullnullnulll!uul!uul!uu~~~~~~~nullnullnullnulll!uul!uul!uunullnullnullnulll!uul!uul!uu~~~~~nullnullnullnulll!uul!uul!uunullnullnullnulll!uul!uul!uu~~~~~~~nullnullnullnulll!uul!uul!uunullnullnullnulll!uul!uul!uu~~~~~nullnullnullnulll!uul!uul!uunullnullnullnulll!uul!uul!uu~~~~~~~nullnullnullnulll!uul!uul!uunullnullnullnulll!uul!uul!uu~~~~~nullnullnullnulll!uul!uul!uunullnullnullnulll!uul!uul!uu~~~~~~~nullnullnullnulll!uul!uul!uunullnullnullnulll!uul!uul!uu~~~~~nullnullnullnulll!uul!uul!uunullnullnullnulll!uul!uul!uu~~~~~~~nullnullnullnulll!uul!uul!uunullnullnullnulll!uul!uul!uu~~~~~nullnullnullnulll!uul!uul!uunullnullnullnulll!uul!uul!uu~~~~~~~nullnullnullnulll!uul!uul!uunullnullnullnulll!uul!uul!uu~~~~~nullnullnullnulll!uul!uul!uunullnullnullnulll!uul!uul!uu~~~~~~~nullnullnullnulll!uul!uul!uunullnullnullnulll!uul!uul!uu~~~~~nullnullnullnulll!uul!uul!uunullnullnullnulll!uul!uul!uu~~~~~~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!!" + "'", str2, "!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!LLL!\276\276!LLL!\276\276!LLL!\276\276!LLL!\276\276!!!!!");
    }

    @Test
    public void test12684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12684");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214!", "NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!" + "'", str2, "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!");
    }

    @Test
    public void test12685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12685");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u017b\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u017b\u0348\u0346\u0346!");
    }

    @Test
    public void test12686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12686");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnullnullnullnullnullnull!", "!\264\214\214\264\264\264!\264\214\214\264\264\264!\264\214\214\264\264\264!\264\214\214\264\264\264\200}}`!\264\214\214\264\264\264!\264\214\214\264\264\264!\264\214\214\264\264\264!\264\214\214\264\264\264]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264\264!");
    }

    @Test
    public void test12687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12687");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!", "\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull~}}^\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull\245\245nullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!" + "'", str2, "~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!");
    }

    @Test
    public void test12688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12688");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348LNN!", "\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200\200\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200\200\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200\200\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200\200\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200\200\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200\200\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200\200\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200null!!\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348L!!!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348L!!!");
    }

    @Test
    public void test12689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12689");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0120\u0120\u0120\u0120\254\254\256\u0120\u0120\254\254\256\u0120\u0120\254\254\256\u0120\u0120\254\254\u0120\u0120\u0120\u0120\254\254\256\u0120\u0120\254\254\256\u0120\u0120\254\254\256\u0120\u0120\254\254\u0120\u0120\u0120\u0120\254\254\256\u0120\u0120\254\254\256\u0120\u0120\254\254\256\u0120\u0120\254\254\u0120\u0120\u0120\u0120\254\254\256\u0120\u0120\254\254\256\u0120\u0120\254\254\256\u0120\u0120\254\254\u0120\u0120\u0120\u0120\254\254\256\u0120\u0120\254\254\256\u0120\u0120\254\254\256\u0120\u0120\254\254\u0120\u0120\u0120\u0120\254\254\256\u0120\u0120\254\254\256\u0120\u0120\254\254\256\u0120\u0120\254\254\u0120\u0120\u0120\u0120\254\254\256\u0120\u0120\254\254\256\u0120\u0120\254\254\256\u0120\u0120\254\254\u0120\u0120\u0120\u0120\254\254\256\u0120\u0120\254\254\256\u0120\u0120\254\254\256\u0120\u0120\254\254!" + "'", str2, "\u0120\u0120\u0120\u0120\254\254\256\u0120\u0120\254\254\256\u0120\u0120\254\254\256\u0120\u0120\254\254\u0120\u0120\u0120\u0120\254\254\256\u0120\u0120\254\254\256\u0120\u0120\254\254\256\u0120\u0120\254\254\u0120\u0120\u0120\u0120\254\254\256\u0120\u0120\254\254\256\u0120\u0120\254\254\256\u0120\u0120\254\254\u0120\u0120\u0120\u0120\254\254\256\u0120\u0120\254\254\256\u0120\u0120\254\254\256\u0120\u0120\254\254\u0120\u0120\u0120\u0120\254\254\256\u0120\u0120\254\254\256\u0120\u0120\254\254\256\u0120\u0120\254\254\u0120\u0120\u0120\u0120\254\254\256\u0120\u0120\254\254\256\u0120\u0120\254\254\256\u0120\u0120\254\254\u0120\u0120\u0120\u0120\254\254\256\u0120\u0120\254\254\256\u0120\u0120\254\254\256\u0120\u0120\254\254\u0120\u0120\u0120\u0120\254\254\256\u0120\u0120\254\254\256\u0120\u0120\254\254\256\u0120\u0120\254\254!");
    }

    @Test
    public void test12690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12690");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!``LLUULLUU!", "\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!``nullnullnullnullnullnullnullnull!" + "'", str2, "!``nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12691");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test12692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12692");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!]]]!]]]!", "\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]]]!]]]!" + "'", str2, "!]]]!]]]!");
    }

    @Test
    public void test12693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12693");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170!!!!", "\u0226!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!!nullnull!!nullnull!!!!!nullnull!!!nullnull!!nullnull!!!!!nullnull!!!nullnull!!nullnull!!!!!nullnull!!!nullnull!!nullnull!!!!!nullnull!!!nullnull!!nullnull!!!!!nullnull!!!nullnull!!nullnull!!!!!nullnull!!!nullnull!!nullnull!!!!!nullnull!!!nullnull!!nullnull!!!!" + "'", str2, "!!nullnull!!!nullnull!!nullnull!!!!!nullnull!!!nullnull!!nullnull!!!!!nullnull!!!nullnull!!nullnull!!!!!nullnull!!!nullnull!!nullnull!!!!!nullnull!!!nullnull!!nullnull!!!!!nullnull!!!nullnull!!nullnull!!!!!nullnull!!!nullnull!!nullnull!!!!!nullnull!!!nullnull!!nullnull!!!!");
    }

    @Test
    public void test12694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12694");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU\254~\256\256\254~\256\256\254~\256\256\254~\256\256!", "\u0366\u0365\u0368\u0368nullnullnullnull\213\213\213\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213\254~\256\256\254~\256\256\254~\256\256\254~\256\256!" + "'", str2, "LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
    }

    @Test
    public void test12695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12695");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("^```^```!!^```^```!!^```^```!!^```^```!!^```!!!^```!!!^```!!!^```!!!^```^```!!^```^```!!^```^```!!^```^```!!^```!!!^```!!!!", "}~\200\200}~\200\200NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN}~\200\200}~\200\200NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```!!^```^```!!^```^```!!^```^```!!^```!!!^```!!!^```!!!^```!!!^```^```!!^```^```!!^```^```!!^```^```!!^```!!!^```!!!!" + "'", str2, "^```^```!!^```^```!!^```^```!!^```^```!!^```!!!^```!!!^```!!!^```!!!^```^```!!^```^```!!^```^```!!^```^```!!^```!!!^```!!!!");
    }

    @Test
    public void test12696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12696");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348!", "H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test12697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12697");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0UU\225\225\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0UU\225\225\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0UU\225\225\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0UU\225\225\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0UU\225\225\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0UU\225\225\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0UU\225\225\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0UU\225\225!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!nullnullnullnullnullnullnullnullnull!!!null!!!nullnullnullnullnullnullnullnull\225\225null!!!null!!!nullnullnullnullnullnullnullnullnull!!!null!!!nullnullnullnullnullnullnullnull\225\225null!!!null!!!nullnullnullnullnullnullnullnullnull!!!null!!!nullnullnullnullnullnullnullnull\225\225null!!!null!!!nullnullnullnullnullnullnullnullnull!!!null!!!nullnullnullnullnullnullnullnull\225\225null!!!null!!!nullnullnullnullnullnullnullnullnull!!!null!!!nullnullnullnullnullnullnullnull\225\225null!!!null!!!nullnullnullnullnullnullnullnullnull!!!null!!!nullnullnullnullnullnullnullnull\225\225null!!!null!!!nullnullnullnullnullnullnullnullnull!!!null!!!nullnullnullnullnullnullnullnull\225\225null!!!null!!!nullnullnullnullnullnullnullnullnull!!!null!!!nullnullnullnullnullnullnullnull\225\225!" + "'", str2, "null!!!null!!!nullnullnullnullnullnullnullnullnull!!!null!!!nullnullnullnullnullnullnullnull\225\225null!!!null!!!nullnullnullnullnullnullnullnullnull!!!null!!!nullnullnullnullnullnullnullnull\225\225null!!!null!!!nullnullnullnullnullnullnullnullnull!!!null!!!nullnullnullnullnullnullnullnull\225\225null!!!null!!!nullnullnullnullnullnullnullnullnull!!!null!!!nullnullnullnullnullnullnullnull\225\225null!!!null!!!nullnullnullnullnullnullnullnullnull!!!null!!!nullnullnullnullnullnullnullnull\225\225null!!!null!!!nullnullnullnullnullnullnullnullnull!!!null!!!nullnullnullnullnullnullnullnull\225\225null!!!null!!!nullnullnullnullnullnullnullnullnull!!!null!!!nullnullnullnullnullnullnullnull\225\225null!!!null!!!nullnullnullnullnullnullnullnullnull!!!null!!!nullnullnullnullnullnullnullnull\225\225!");
    }

    @Test
    public void test12698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12698");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!LLL!LLL!LLL!LLLnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!LLL!LLL!LLL!LLLnullnullnullnullnullnullnullnull!", "LL!!!!!LL!!!!!LL!!!!!LL!!!!!LL!!!!!LL!!!!!LL!!!!!LL!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!!!!!!!!!!!!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!" + "'", str2, "!!!!!!!!!!!!!!!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!!!!!!!!!!!!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!");
    }

    @Test
    public void test12699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12699");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test12700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12700");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LLnull!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LLnull!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LLnull!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LLnull!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test12701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12701");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246!", "\253\254\256\256\u017b\u0178\u0179\u0179\u017b\u0178\u0179\u0179\u017b\u0178\u0179\u0179\u017b\u0178\u0179\u0179\253\254\256\256\u017b\u0178\u0179\u0179\u017b\u0178\u0179\u0179!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\377\253\u017a\u017a\377\253\u017a\u017anullnullnullnullnullnullnullnull\377\253\u017a\u017a\377\253\u017a\u017anullnullnullnullnullnullnullnull\377\253\u017a\u017a\377\253\u017a\u017anullnullnullnullnullnullnullnull\377\253\u017a\u017a\377\253\u017a\u017anullnullnullnullnullnullnullnull\377\253\u017a\u017a\377\253\u017a\u017anullnullnullnullnullnullnullnull\377\253\u017a\u017a\377\253\u017a\u017anullnullnullnullnullnullnullnull\377\253\u017a\u017a\377\253\u017a\u017anullnullnullnullnullnullnullnull\377\253\u017a\u017a\377\253\u017a\u017anullnullnullnullnullnullnullnull!" + "'", str2, "\377\253\u017a\u017a\377\253\u017a\u017anullnullnullnullnullnullnullnull\377\253\u017a\u017a\377\253\u017a\u017anullnullnullnullnullnullnullnull\377\253\u017a\u017a\377\253\u017a\u017anullnullnullnullnullnullnullnull\377\253\u017a\u017a\377\253\u017a\u017anullnullnullnullnullnullnullnull\377\253\u017a\u017a\377\253\u017a\u017anullnullnullnullnullnullnullnull\377\253\u017a\u017a\377\253\u017a\u017anullnullnullnullnullnullnullnull\377\253\u017a\u017a\377\253\u017a\u017anullnullnullnullnullnullnullnull\377\253\u017a\u017a\377\253\u017a\u017anullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12702");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HHFFFHHHFHHHFHHHHHFFFHHHFHHHFHHHHHFFFHHHFHHHFHHHHHFFFHHHFHHHFHHHHHFFFHHHFHHHFHHHHHFFFHHHFHHHFHHHHHFFFHHHFHHHFHHHHHFFFHHHFHHHFHHH!", "\u031a\u031a\u031a\u031anull]]\256\254\254\u031a\u031a\u031a\u031anull]]\256\254\254\u031a\u031a\u031a\u031anull]]\256\254\254\u031a\u031a\u031a\u031anull]]\256\254\254\u031a\u031a\u031a\u031anull]]\256\254\254\u031a\u031a\u031a\u031anull]]\256\254\254\u031a\u031a\u031a\u031anull]]\256\254\254\u031a\u031a\u031a\u031anull]]\256\254\254\u031a\u031a\u031a\u031anull]]\256\254\254\u031a\u031a\u031a\u031anull]]\256\254\254\u031a\u031a\u031a\u031anull]]\256\254\254\u031a\u031a\u031a\u031anull]]\256\254\254\u031a\u031a\u031a\u031anull]]\256\254\254\u031a\u031a\u031a\u031anull]]\256\254\254\u031a\u031a\u031a\u031anull]]\256\254\254\u031a\u031a\u031a\u031anull]]\256\254\254!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!" + "'", str2, "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!");
    }

    @Test
    public void test12703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12703");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!!", "!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnull!!!!!!!nullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnull!!!!!!!nullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnull!!!!!!!nullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnull!!!!!!!nullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnull!!!!!!!nullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnull!!!!!!!nullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnull!!!!!!!nullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnull!!!!!!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnull!!!!!!!nullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnull!!!!!!!nullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnull!!!!!!!nullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnull!!!!!!!nullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnull!!!!!!!nullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnull!!!!!!!nullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnull!!!!!!!nullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnull!!!!!!!!");
    }

    @Test
    public void test12704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12704");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!!", "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!!" + "'", str2, "^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!!");
    }

    @Test
    public void test12705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12705");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204!", "}~\200\200}~\200\200\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!}~\200\200}~\200\200\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204!" + "'", str2, "\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204!");
    }

    @Test
    public void test12706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12706");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnullnullnull\264\264nullnull\264\264nullnullnullnullnullnullnullnullnullnull\264\264nullnull\264\264!", "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\264\264nullnullnullnullnullnullnullnull\264\264nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\264\264nullnullnullnullnullnullnullnull\264\264!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\264\264nullnullnullnullnullnullnullnull\264\264nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\264\264nullnullnullnullnullnullnullnull\264\264!");
    }

    @Test
    public void test12707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12707");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!", "\220H~~\220H~~!!``\220H~~\220H~~``\220H~~\220H~~``\220H~~\220H~~\220H~~\220H~~!!\220H~~\220H~~!!\220H~~\220H~~!!\220H~~\220H~~!!\220H~~\220H~~!!\220H~~\220H~~!!\220H~~\220H~~!!\220H~~\220H~~!!\220H~~\220H~~!!\220H~~\220H~~!!\220H~~\220H~~!!\220H~~\220H~~!!\220H~~\220H~~!!\220H~~\220H~~!!\220H~~\220H~~!!\220H~~\220H~~!!\220H~~\220H~~!!``\220H~~\220H~~``\220H~~\220H~~``\220H~~\220H~~\220H~~\220H~~!!\220H~~\220H~~!!\220H~~\220H~~!!\220H~~\220H~~!!\220H~~\220H~~!!\220H~~\220H~~!!\220H~~\220H~~!!\220H~~\220H~~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!");
    }

    @Test
    public void test12708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12708");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12709");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("XW\275\275XW\275\275!", "\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!!!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!!!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!!!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!!!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!!!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!!!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!!!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\275\275!!\275\275!" + "'", str2, "!!\275\275!!\275\275!");
    }

    @Test
    public void test12710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12710");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275\u0346\u0348\u0348!", "\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275\u0346\u0348\u0348!");
    }

    @Test
    public void test12711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12711");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!", "``nullnull\234\234nullnull\234\234nullnull\234\234nullnull\234\234``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!" + "'", str2, "!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!");
    }

    @Test
    public void test12712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12712");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("tnullpptnullppnullnulltnullpptnullppnullnulltnullpptnullppnullnulltnullpptnullppnullnull!tnullppnullnull!tnullppnullnull!tnullppnullnull!tnullppnullnulltnullpptnullppnullnulltnullpptnullppnullnulltnullpptnullppnullnulltnullpptnullppnullnull!tnullppnullnull!tnullppnullnull!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLL!LLLLLLLLLLLLLLL!LLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLL!LLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLL!LLLLLLLLLLLLLLL!LLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLL!LLLLLLLLLLLLLLL!");
    }

    @Test
    public void test12713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12713");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275!~!!!~!!!~!!\276!~!!\275\275!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!~!!!~!!!~!!\276!~!!\275\275!" + "'", str2, "\275!~!!!~!!!~!!\276!~!!\275\275!");
    }

    @Test
    public void test12714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12714");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII!", "UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
    }

    @Test
    public void test12715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12715");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLNNNNLL!", "LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0179\u0179\u0179\u0179!" + "'", str2, "\u0179\u0179\u0179\u0179!");
    }

    @Test
    public void test12716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12716");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276!", "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02faNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276!" + "'", str2, "\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276!");
    }

    @Test
    public void test12717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12717");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0346\u0348\u0348!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test12718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12718");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214!", "\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!" + "'", str2, "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!");
    }

    @Test
    public void test12719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12719");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!LUU!LUU!LUU!LUU!UUU!UUU!UUU!UUU!LUU!LUU!LUU!LUU!UUU!UUU!", "nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!" + "'", str2, "!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!");
    }

    @Test
    public void test12720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12720");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "nullnull!!nullnull!!nullnull!!nullnull!!null!!!null!!!null!!!null!!!nullnull!!nullnull!!nullnull!!nullnull!!null!!!null!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12721");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\367\253\371\371null\367\253\371\371\367\253\371\371\367\253\371\371null\367\253\371\371\367\253\371\371\u035e\u035e\367\253\371\371null\367\253\371\371\367\253\371\371\367\253\371\371null\367\253\371\371\367\253\371\371\u035e\u035e!!!!\367\253\371\371null\367\253\371\371\367\253\371\371\367\253\371\371null\367\253\371\371\367\253\371\371\u035e\u035e\367\253\371\371null\367\253\371\371\367\253\371\371\367\253\371\371null\367\253\371\371\367\253\371\371\u035e\u035e!", "ULLL\200}}`ULLL]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\367\253nullnull]nullll\367\253nullnull\367\253nullnull\367\253nullnull]nullll\367\253nullnull\367\253\u035e\u035e\367\253nullnull]nullll\367\253nullnull\367\253nullnull\367\253nullnull]nullll\367\253nullnull\367\253\u035e\u035e!!!!\367\253nullnull]nullll\367\253nullnull\367\253nullnull\367\253nullnull]nullll\367\253nullnull\367\253\u035e\u035e\367\253nullnull]nullll\367\253nullnull\367\253nullnull\367\253nullnull]nullll\367\253nullnull\367\253\u035e\u035e!" + "'", str2, "\367\253nullnull]nullll\367\253nullnull\367\253nullnull\367\253nullnull]nullll\367\253nullnull\367\253\u035e\u035e\367\253nullnull]nullll\367\253nullnull\367\253nullnull\367\253nullnull]nullll\367\253nullnull\367\253\u035e\u035e!!!!\367\253nullnull]nullll\367\253nullnull\367\253nullnull\367\253nullnull]nullll\367\253nullnull\367\253\u035e\u035e\367\253nullnull]nullll\367\253nullnull\367\253nullnull\367\253nullnull]nullll\367\253nullnull\367\253\u035e\u035e!");
    }

    @Test
    public void test12722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12722");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!", "\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!" + "'", str2, "!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!NULL!!!");
    }

    @Test
    public void test12723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12723");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!" + "'", str2, "!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
    }

    @Test
    public void test12724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12724");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("h]hhh]hh!!h]hhh]hh!!h]hhh]hhh]hhh]hh!!h]hhh]hh!!h]hhh]hh!", "\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276\u0260\275\u0260\275\u0260\275\u0260\275\u0260\275\u0260\275\u0260\275\u0260\275!!\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276\u0260\275\u0260\275\u0260\275\u0260\275\u0260\275\u0260\275\u0260\275\u0260\275!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!" + "'", str2, "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!");
    }

    @Test
    public void test12725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12725");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test12726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12726");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ!", "l!!!l!!!LLl!!!l!!!LLl!!!l!!!LLl!!!l!!!LLl!!!l!!!LLl!!!l!!!LLl!!!l!!!LLl!!!l!!!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL!" + "'", str2, "\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL!");
    }

    @Test
    public void test12727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12727");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull`!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!", "U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!!\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230!!\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230!!\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230`!!\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230!!\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230!!\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230!" + "'", str2, "`!!\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230!!\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230!!\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230`!!\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230!!\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230!!\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230!");
    }

    @Test
    public void test12728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12728");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("````````````````````````````````!!````````````````````````````````!!````````````````````````````````````````````````````````````````!!````````````````````````````````!!````````````````````````````````!", "efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````````````````````!!````````````````````````````````!!````````````````````````````````````````````````````````````````!!````````````````````````````````!!````````````````````````````````!" + "'", str2, "````````````````````````````````!!````````````````````````````````!!````````````````````````````````````````````````````````````````!!````````````````````````````````!!````````````````````````````````!");
    }

    @Test
    public void test12729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12729");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\233HHHHHHHHHHHH\233HHHHHHHHHHHH\233HHHHHHHHHHHH\275\233HHHHHHHHHHHH\233HHHHHHHHHHHH\233HHHHHHHHHHHH\275\233HHHHHHHHHHHH\233HHHHHHHHHHHH\233HHHHHHHHHHHH\275\233HHHHHHHHHHHH\233HHHHHHHHHHHH\233HHHHHHHHHHHH\233HHHHHHHHHHHH\233HHHHHHHHHHHH\275\275\233HHHHHHHHHHHH\233HHHHHHHHHHHH\275\275\233HHHHHHHHHHHH\233HHHHHHHHHHHH\275\275\233HHHHHHHHHHHH\233HHHHHHHHHHHH\275\275\275\233HHHHHHHHHHHH\233HHHHHHHHHHHH\233HHHHHHHHHHHH\275\233HHHHHHHHHHHH\233HHHHHHHHHHHH\233HHHHHHHHHHHH\275\233HHHHHHHHHHHH\233HHHHHHHHHHHH\233HHHHHHHHHHHH\275\233HHHHHHHHHHHH\233HHHHHHHHHHHH\233HHHHHHHHHHHH\233HHHHHHHHHHHH\233HHHHHHHHHHHH\275\275\233HHHHHHHHHHHH\233HHHHHHHHHHHH\275\275!", "BB!!null`nullnullnull`nullnullnull`nullnullBB!!BB!!BB!!BB!!BB!!BB!!BB!!BB!!BB!!BB!!BB!!BB!!BB!!BB!!BB!!BB!!BB!!null`nullnullnull`nullnullnull`nullnullBB!!BB!!BB!!BB!!BB!!BB!!BB!!BB!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\233LLLLLLLLLLLL\233LLLLLLLLLLLL\233LLLLLLLLLLLL\275\233LLLLLLLLLLLL\233LLLLLLLLLLLL\233LLLLLLLLLLLL\275\233LLLLLLLLLLLL\233LLLLLLLLLLLL\233LLLLLLLLLLLL\275\233LLLLLLLLLLLL\233LLLLLLLLLLLL\233LLLLLLLLLLLL\233LLLLLLLLLLLL\233LLLLLLLLLLLL\275\275\233LLLLLLLLLLLL\233LLLLLLLLLLLL\275\275\233LLLLLLLLLLLL\233LLLLLLLLLLLL\275\275\233LLLLLLLLLLLL\233LLLLLLLLLLLL\275\275\275\233LLLLLLLLLLLL\233LLLLLLLLLLLL\233LLLLLLLLLLLL\275\233LLLLLLLLLLLL\233LLLLLLLLLLLL\233LLLLLLLLLLLL\275\233LLLLLLLLLLLL\233LLLLLLLLLLLL\233LLLLLLLLLLLL\275\233LLLLLLLLLLLL\233LLLLLLLLLLLL\233LLLLLLLLLLLL\233LLLLLLLLLLLL\233LLLLLLLLLLLL\275\275\233LLLLLLLLLLLL\233LLLLLLLLLLLL\275\275!" + "'", str2, "\275\233LLLLLLLLLLLL\233LLLLLLLLLLLL\233LLLLLLLLLLLL\275\233LLLLLLLLLLLL\233LLLLLLLLLLLL\233LLLLLLLLLLLL\275\233LLLLLLLLLLLL\233LLLLLLLLLLLL\233LLLLLLLLLLLL\275\233LLLLLLLLLLLL\233LLLLLLLLLLLL\233LLLLLLLLLLLL\233LLLLLLLLLLLL\233LLLLLLLLLLLL\275\275\233LLLLLLLLLLLL\233LLLLLLLLLLLL\275\275\233LLLLLLLLLLLL\233LLLLLLLLLLLL\275\275\233LLLLLLLLLLLL\233LLLLLLLLLLLL\275\275\275\233LLLLLLLLLLLL\233LLLLLLLLLLLL\233LLLLLLLLLLLL\275\233LLLLLLLLLLLL\233LLLLLLLLLLLL\233LLLLLLLLLLLL\275\233LLLLLLLLLLLL\233LLLLLLLLLLLL\233LLLLLLLLLLLL\275\233LLLLLLLLLLLL\233LLLLLLLLLLLL\233LLLLLLLLLLLL\233LLLLLLLLLLLL\233LLLLLLLLLLLL\275\275\233LLLLLLLLLLLL\233LLLLLLLLLLLL\275\275!");
    }

    @Test
    public void test12730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12730");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLL!", "!\200\200\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12731");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "NNNN!nullnullNNNN!nullnull!nullnullnull!nullnullnullNNNN!nullnullNNNN!nullnull!nullnullnull!nullnullnull!!NNNN!nullnullNNNN!nullnull!nullnullnull!nullnullnullNNNN!nullnullNNNN!nullnull!nullnullnull!nullnullnull!!NNNN!nullnullNNNN!nullnull!nullnullnull!nullnullnullNNNN!nullnullNNNN!nullnull!nullnullnull!nullnullnullNNNN!nullnullNNNN!nullnull!nullnullnull!nullnullnullNNNN!nullnullNNNN!nullnull!nullnullnull!nullnullnull!!NNNN!nullnullNNNN!nullnull!nullnullnull!nullnullnullNNNN!nullnullNNNN!nullnull!nullnullnull!nullnullnull!!NNNN!nullnullNNNN!nullnull!nullnullnull!nullnullnullNNNN!nullnullNNNN!nullnull!nullnullnull!nullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test12732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12732");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!!!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!!!", "}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~u}llnullnullnullnullu}llu}llu}llnullnullnullnullu}llu}ll!~u}llnullnullnullnullu}llu}llu}llnullnullnullnullu}llu}ll!~u}llnullnullnullnullu}llu}llu}llnullnullnullnullu}llu}ll!~u}llnullnullnullnullu}llu}llu}llnullnullnullnullu}llu}ll!~u}llnullnullnullnullu}llu}llu}llnullnullnullnullu}llu}ll!~u}llnullnullnullnullu}llu}llu}llnullnullnullnullu}llu}ll!~u}llnullnullnullnullu}llu}llu}llnullnullnullnullu}llu}ll!~u}llnullnullnullnullu}llu}llu}llnullnullnullnullu}llu}ll!!!~u}llnullnullnullnullu}llu}llu}llnullnullnullnullu}llu}ll!~u}llnullnullnullnullu}llu}llu}llnullnullnullnullu}llu}ll!~u}llnullnullnullnullu}llu}llu}llnullnullnullnullu}llu}ll!~u}llnullnullnullnullu}llu}llu}llnullnullnullnullu}llu}ll!~u}llnullnullnullnullu}llu}llu}llnullnullnullnullu}llu}ll!~u}llnullnullnullnullu}llu}llu}llnullnullnullnullu}llu}ll!~u}llnullnullnullnullu}llu}llu}llnullnullnullnullu}llu}ll!~u}llnullnullnullnullu}llu}llu}llnullnullnullnullu}llu}ll!!!" + "'", str2, "!~u}llnullnullnullnullu}llu}llu}llnullnullnullnullu}llu}ll!~u}llnullnullnullnullu}llu}llu}llnullnullnullnullu}llu}ll!~u}llnullnullnullnullu}llu}llu}llnullnullnullnullu}llu}ll!~u}llnullnullnullnullu}llu}llu}llnullnullnullnullu}llu}ll!~u}llnullnullnullnullu}llu}llu}llnullnullnullnullu}llu}ll!~u}llnullnullnullnullu}llu}llu}llnullnullnullnullu}llu}ll!~u}llnullnullnullnullu}llu}llu}llnullnullnullnullu}llu}ll!~u}llnullnullnullnullu}llu}llu}llnullnullnullnullu}llu}ll!!!~u}llnullnullnullnullu}llu}llu}llnullnullnullnullu}llu}ll!~u}llnullnullnullnullu}llu}llu}llnullnullnullnullu}llu}ll!~u}llnullnullnullnullu}llu}llu}llnullnullnullnullu}llu}ll!~u}llnullnullnullnullu}llu}llu}llnullnullnullnullu}llu}ll!~u}llnullnullnullnullu}llu}llu}llnullnullnullnullu}llu}ll!~u}llnullnullnullnullu}llu}llu}llnullnullnullnullu}llu}ll!~u}llnullnullnullnullu}llu}llu}llnullnullnullnullu}llu}ll!~u}llnullnullnullnullu}llu}llu}llnullnullnullnullu}llu}ll!!!");
    }

    @Test
    public void test12733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12733");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!nullnullHH!!nullnullnullHH!!nullnull!nullnullHH!!nullnullnullHH!!nullnull!nullnullHH!!nullnullnullHH!!nullnull!nullnullHH!!nullnullnullHH!!nullnull!nullnullHH!!nullnullnullHH!!nullnull!", "!~\307\307!~\307\307\220\220!~\307\307!~\307\307\220\220\220!~\307\307\220\220\220!~\307\307\220\220\220!~\307\307\220\220\220!~\307\307\220\220!~\307\307!~\307\307\220\220!~\307\307!~\307\307\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "!nullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12734");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!LLNN!", "LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!UU!" + "'", str2, "!!!UU!");
    }

    @Test
    public void test12735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12735");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\u0346\u0348\u0348!", "\275null~}}null~}}\200\200null~}}null~}}\200\200null~}}null~}}\200\200\276null~}}null~}}\200\200\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204\u0346\u0348\u0348!");
    }

    @Test
    public void test12736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12736");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0346null!!!", "}~\200\200}~\200\200LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN}~\200\200}~\200\200LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~L\200\200\u0346\u0346~L\200\200!!!" + "'", str2, "~L\200\200\u0346\u0346~L\200\200!!!");
    }

    @Test
    public void test12737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12737");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230\200}}`l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230]]!", "\u0366\u0365\u0368\u0368\231\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\225\230\230H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\225\230\230H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\225\230\230H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\225\230\230\200}}`H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\225\230\230H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\225\230\230H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\225\230\230H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\225\230\230]]!" + "'", str2, "H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\225\230\230H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\225\230\230H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\225\230\230H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\225\230\230\200}}`H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\225\230\230H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\225\230\230H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\225\230\230H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\225\230\230]]!");
    }

    @Test
    public void test12738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12738");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~\200}}~\200}}~\200}}~\200}}\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272~\200}}~\200}}~\200}}~\200}}\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272!", "nullnullHHnullnullHH\254\254\256nullnullHH\254\254\256nullnullHH\254\254\256nullnullHH\254\254nullnullHHnullnullHH\254\254\256nullnullHH\254\254\256nullnullHH\254\254\256nullnullHH\254\254nullnullHHnullnullHH\254\254\256nullnullHH\254\254\256nullnullHH\254\254\256nullnullHH\254\254nullnullHHnullnullHH\254\254\256nullnullHH\254\254\256nullnullHH\254\254\256nullnullHH\254\254nullnullHHnullnullHH\254\254\256nullnullHH\254\254\256nullnullHH\254\254\256nullnullHH\254\254nullnullHHnullnullHH\254\254\256nullnullHH\254\254\256nullnullHH\254\254\256nullnullHH\254\254nullnullHHnullnullHH\254\254\256nullnullHH\254\254\256nullnullHH\254\254\256nullnullHH\254\254nullnullHHnullnullHH\254\254\256nullnullHH\254\254\256nullnullHH\254\254\256nullnullHH\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~\200}}~\200}}~\200}}~\200}}\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254~\200}}~\200}}~\200}}~\200}}\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254!" + "'", str2, "~\200}}~\200}}~\200}}~\200}}\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254~\200}}~\200}}~\200}}~\200}}\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254!");
    }

    @Test
    public void test12739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12739");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u014e\u014e!!\213\213\213\u0346\u0348\u0348!", "\u0366\u0365\u0368\u0368\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnull!!\213\213\213\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnull!!\213\213\213\u0346\u0348\u0348!");
    }

    @Test
    public void test12740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12740");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test12741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12741");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]\204]]]\204]]]\204]]]\204]]]]]]]]]]]]]]]]]]]\204]]]\204]]]\204]]]\204]]]]]]]]]]!", "\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]\204]]]\204]]]\204]]]\204]]]]]]]]]]]]]]]]]]]\204]]]\204]]]\204]]]\204]]]]]]]]]]!" + "'", str2, "]\204]]]\204]]]\204]]]\204]]]]]]]]]]]]]]]]]]]\204]]]\204]]]\204]]]\204]]]]]]]]]]!");
    }

    @Test
    public void test12742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12742");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d!!!!", "]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!!" + "'", str2, "]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!]]]]]]]]nullnull!!!!");
    }

    @Test
    public void test12743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12743");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!");
    }

    @Test
    public void test12744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12744");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!!", "\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!!" + "'", str2, "\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!!");
    }

    @Test
    public void test12745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12745");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!!", "\275L!NNL!NNL!NN\276L!NN\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test12746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12746");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("P!RRP!RRP!RRP!RRP!RRP!RRP!RRP!RR!", "\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test12747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12747");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test12748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12748");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!", "\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\200}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!" + "'", str2, "}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!");
    }

    @Test
    public void test12749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12749");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226!!]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226!!!", "\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226!!]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226!!!" + "'", str2, "]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226!!]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226!!!");
    }

    @Test
    public void test12750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12750");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253\254\256\256!JJJ!JJJ!JJJ!JJJ\253\254\256\256!JJJ!JJJ!", "}\215\213!!\200\200}\215\213!!\200\200}\215\213!!\200\200}\215\213!!\200\200\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!}\215\213!!\200\200}\215\213!!\200\200}\215\213!!\200\200}\215\213!!\200\200\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256!nullnullnull!nullnullnull!nullnullnull!nullnullnull\253\254\256\256!nullnullnull!nullnullnull!" + "'", str2, "\253\254\256\256!nullnullnull!nullnullnull!nullnullnull!nullnullnull\253\254\256\256!nullnullnull!nullnullnull!");
    }

    @Test
    public void test12751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12751");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253\254\256\256!RRRRRRRRRRRR!RRRRRRRRRRRR!RRRRRRRRRRRR!RRRRRRRRRRRR\253\254\256\256!RRRRRRRRRRRR!RRRRRRRRRRRR!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull\276\276nullnull\276\276\253\253nullnull\276\276nullnull\276\276\253\253nullnull\276\276nullnull\276\276\253\253nullnull\276\276nullnull\276\276\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull\276\276nullnull\276\276\253\253nullnull\276\276nullnull\276\276\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\253\254\256\256!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12752");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368]\344\u0346\u0348\u0348!", "\215}\215\215\215}\215\215ULLLULLLULLLULLL\215}\215\215\215}\215\215!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test12753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12753");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12754");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\214!!", "EHHHHEFFHEFFHEFFEHHHHEFFHEFFHEFFEHHHHEFFHEFFHEFFEHHHHEFFHEFFHEFFEHHHHEFFHEFFHEFFEHHHHEFFHEFFHEFFEHHHHEFFHEFFHEFFEHHHHEFFHEFFHEFF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214!!" + "'", str2, "\214!!");
    }

    @Test
    public void test12755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12755");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!!", "NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!!" + "'", str2, "NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!!");
    }

    @Test
    public void test12756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12756");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL!!}`}}}`}}}`}}LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!}`}}}`}}}`}}LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!", "\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]!!}`}}}`}}}`}}]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!}`}}}`}}}`}}]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!" + "'", str2, "]]!!}`}}}`}}}`}}]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!}`}}}`}}}`}}]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!");
    }

    @Test
    public void test12757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12757");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\216\254\254\254\u0348\u0346\u0346!", "\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\216\254\254\254\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\216\254\254\254\u0348\u0346\u0346!");
    }

    @Test
    public void test12758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12758");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12759");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12760");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!", "\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!" + "'", str2, "!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!");
    }

    @Test
    public void test12761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12761");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```LNUULNUULNUULNUU!!!```!", "ULLLULLLULLLULLL\200}}`ULLLULLLULLLULLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```!" + "'", str2, "LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```LLUULLUULLUULLUU!!!```!");
    }

    @Test
    public void test12762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12762");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("^^^^]LLUU^^]LLUU^^]LLUU^^]LLUU^^^^^^]LLUU^^]LLUU^^!", "nullnullnullnullnullnullnullnullnullnullnullnullnull\200}}nullnullnullnullnullnullnullnullnullnullnullnullnull\200}}nullnullnullnullnullnullnullnullnullnullnullnullnull\200}}nullnullnullnullnullnullnullnullnullnullnullnullnull\200}}nullnullnullnullnullnullnullnullnullnullnullnullnull\200}}nullnullnullnullnullnullnullnullnullnullnullnullnull\200}}nullnullnullnullnullnullnullnullnullnullnullnullnull\200}}nullnullnullnullnullnullnullnullnullnullnullnullnull\200}}!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01f5\u01f5\u01f3\u01f3\u01f5\u01f5\u01f3\u01f3\u01f5\u01f5\u01f3\u01f3\u01f5\u01f5\u01f3\u01f3\u01f5\u01f5\u01f3\u01f3\u01f5\u01f5\u01f3\u01f3^^!" + "'", str2, "\u01f5\u01f5\u01f3\u01f3\u01f5\u01f5\u01f3\u01f3\u01f5\u01f5\u01f3\u01f3\u01f5\u01f5\u01f3\u01f3\u01f5\u01f5\u01f3\u01f3\u01f5\u01f5\u01f3\u01f3^^!");
    }

    @Test
    public void test12763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12763");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\273\272\275\275\273\272\275\275\253\253\273\272\275\275\273\272\275\275\253\253\273\272\275\275\273\272\275\275\253\253\273\272\275\275\273\272\275\275\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\273\272\275\275\273\272\275\275\253\253\273\272\275\275\273\272\275\275\253\253!", "TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\273null\275\275\273null\275\275\253\253\273null\275\275\273null\275\275\253\253\273null\275\275\273null\275\275\253\253\273null\275\275\273null\275\275\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\273null\275\275\273null\275\275\253\253\273null\275\275\273null\275\275\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\273null\275\275\273null\275\275\253\253\273null\275\275\273null\275\275\253\253\273null\275\275\273null\275\275\253\253\273null\275\275\273null\275\275\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\273null\275\275\273null\275\275\253\253\273null\275\275\273null\275\275\253\253!");
    }

    @Test
    public void test12764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12764");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!!!LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!!!LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!!!LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!!!LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!!", "!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!!!LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!!!LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!!!LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!!!LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!!" + "'", str2, "LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!!!LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!!!LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!!!LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!!!LL!!L!]]LL!!LL!!LL!!L!]]LL!!LL!!!");
    }

    @Test
    public void test12765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12765");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!", "HNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHH!!HNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHH!!HNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHH!!HNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHH!!HNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHH!!HNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHH!!HNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHH!!HNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!" + "'", str2, "]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!");
    }

    @Test
    public void test12766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12766");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!", "^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!" + "'", str2, "!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!");
    }

    @Test
    public void test12767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12767");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!", "\u0348\u0348\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u0348\u0348\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u0348\u0348\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u0348\u0348\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016eLL\200\u0348\u0348\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u0348\u0348\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u0348\u0348\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u0348\u0348\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016eLL]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010cnullnull!!!" + "'", str2, "\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010c\u010cnullnull!!!");
    }

    @Test
    public void test12768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12768");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "\275``UU``UU``UU\276``UU\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test12769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12769");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FHFFFHFFH~~~H~~~H~~~H~~~H~~~H~~~H~~~H~~~FHFFFHFFH~~~H~~~H~~~H~~~H~~~H~~~H~~~H~~~FHFFFHFFH~~~H~~~H~~~H~~~H~~~H~~~H~~~H~~~FHFFFHFFH~~~H~~~H~~~H~~~H~~~H~~~H~~~H~~~FHFFFHFFH~~~H~~~H~~~H~~~H~~~H~~~H~~~H~~~FHFFFHFFH~~~H~~~H~~~H~~~H~~~H~~~H~~~H~~~FHFFFHFFH~~~H~~~H~~~H~~~H~~~H~~~H~~~H~~~FHFFFHFFH~~~H~~~H~~~H~~~H~~~H~~~H~~~H~~~!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnull~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~nullnullnullnullnullnullnullnullnull~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~nullnullnullnullnullnullnullnullnull~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~nullnullnullnullnullnullnullnullnull~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~nullnullnullnullnullnullnullnullnull~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~nullnullnullnullnullnullnullnullnull~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~nullnullnullnullnullnullnullnullnull~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~nullnullnullnullnullnullnullnullnull~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~!" + "'", str2, "nullnullnullnullnullnullnullnullnull~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~nullnullnullnullnullnullnullnullnull~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~nullnullnullnullnullnullnullnullnull~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~nullnullnullnullnullnullnullnullnull~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~nullnullnullnullnullnullnullnullnull~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~nullnullnullnullnullnullnullnullnull~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~nullnullnullnullnullnullnullnullnull~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~nullnullnullnullnullnullnullnullnull~~~null~~~null~~~null~~~null~~~null~~~null~~~null~~~!");
    }

    @Test
    public void test12770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12770");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]]null{|~~nullnullnull{|~~nullnull]]null{|~~nullnullnull{|~~nullnull!!]]null{|~~nullnullnull{|~~nullnull]]null{|~~nullnullnull{|~~nullnull!!]]null{|~~nullnullnull{|~~nullnull]]null{|~~nullnullnull{|~~nullnull]]null{|~~nullnullnull{|~~nullnull]]null{|~~nullnullnull{|~~nullnull!!]]null{|~~nullnullnull{|~~nullnull]]null{|~~nullnullnull{|~~nullnull!!]]null{|~~nullnullnull{|~~nullnull]]null{|~~nullnullnull{|~~nullnull!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]nullnullrr{|~~nullnullrrnullnullrrnullnullrr{|~~nullnullrrnullnullrr]]nullnullrr{|~~nullnullrrnullnullrrnullnullrr{|~~nullnullrrnullnullrr!!]]nullnullrr{|~~nullnullrrnullnullrrnullnullrr{|~~nullnullrrnullnullrr]]nullnullrr{|~~nullnullrrnullnullrrnullnullrr{|~~nullnullrrnullnullrr!!]]nullnullrr{|~~nullnullrrnullnullrrnullnullrr{|~~nullnullrrnullnullrr]]nullnullrr{|~~nullnullrrnullnullrrnullnullrr{|~~nullnullrrnullnullrr]]nullnullrr{|~~nullnullrrnullnullrrnullnullrr{|~~nullnullrrnullnullrr]]nullnullrr{|~~nullnullrrnullnullrrnullnullrr{|~~nullnullrrnullnullrr!!]]nullnullrr{|~~nullnullrrnullnullrrnullnullrr{|~~nullnullrrnullnullrr]]nullnullrr{|~~nullnullrrnullnullrrnullnullrr{|~~nullnullrrnullnullrr!!]]nullnullrr{|~~nullnullrrnullnullrrnullnullrr{|~~nullnullrrnullnullrr]]nullnullrr{|~~nullnullrrnullnullrrnullnullrr{|~~nullnullrrnullnullrr!" + "'", str2, "]]nullnullrr{|~~nullnullrrnullnullrrnullnullrr{|~~nullnullrrnullnullrr]]nullnullrr{|~~nullnullrrnullnullrrnullnullrr{|~~nullnullrrnullnullrr!!]]nullnullrr{|~~nullnullrrnullnullrrnullnullrr{|~~nullnullrrnullnullrr]]nullnullrr{|~~nullnullrrnullnullrrnullnullrr{|~~nullnullrrnullnullrr!!]]nullnullrr{|~~nullnullrrnullnullrrnullnullrr{|~~nullnullrrnullnullrr]]nullnullrr{|~~nullnullrrnullnullrrnullnullrr{|~~nullnullrrnullnullrr]]nullnullrr{|~~nullnullrrnullnullrrnullnullrr{|~~nullnullrrnullnullrr]]nullnullrr{|~~nullnullrrnullnullrrnullnullrr{|~~nullnullrrnullnullrr!!]]nullnullrr{|~~nullnullrrnullnullrrnullnullrr{|~~nullnullrrnullnullrr]]nullnullrr{|~~nullnullrrnullnullrrnullnullrr{|~~nullnullrrnullnullrr!!]]nullnullrr{|~~nullnullrrnullnullrrnullnullrr{|~~nullnullrrnullnullrr]]nullnullrr{|~~nullnullrrnullnullrrnullnullrr{|~~nullnullrrnullnullrr!");
    }

    @Test
    public void test12771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12771");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!", "UU!!UU!!LLUU!!UU!!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!" + "'", str2, "!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!");
    }

    @Test
    public void test12772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12772");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010cnullnull!!!", "\276!U\220\220\275\275\276!U\220\220\275\275U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220\276!U\220\220\275\275\276!U\220\220\275\275U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220\276!U\220\220\275\275\276!U\220\220\275\275U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220\276!U\220\220\275\275\276!U\220\220\275\275U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220\276!U\220\220\275\275\276!U\220\220\275\275U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220\276!U\220\220\275\275\276!U\220\220\275\275U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220\276!U\220\220\275\275\276!U\220\220\275\275U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220\276!U\220\220\275\275\276!U\220\220\275\275U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cdnullnull!!!" + "'", str2, "\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cd\u01cdnullnull!!!");
    }

    @Test
    public void test12773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12773");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253]]]]]]]]\253\253]]]]]]]]\253\253]]]]]]]]\253\253]]]]]]]]\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253]]]]]]]]\253\253]]]]]]]]\253\253!", "\275\300\300\300\275\300\300\300\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\300\300\300\275\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253]]]]]]]]\253\253]]]]]]]]\253\253]]]]]]]]\253\253]]]]]]]]\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253]]]]]]]]\253\253]]]]]]]]\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253]]]]]]]]\253\253]]]]]]]]\253\253]]]]]]]]\253\253]]]]]]]]\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253]]]]]]]]\253\253]]]]]]]]\253\253!");
    }

    @Test
    public void test12774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12774");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\254\256\256\253\254\256\256!!\253\254\256\256\253\254\256\256!!!", "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02faLIIILIIILIII!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256\253\254\256\256!!\253\254\256\256\253\254\256\256!!!" + "'", str2, "\253\254\256\256\253\254\256\256!!\253\254\256\256\253\254\256\256!!!");
    }

    @Test
    public void test12775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12775");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\300nullnullnull\300nullnullnull\300\u02fa\300nullnullnull\300nullnullnull\300\u02fa\300nullnullnull\300nullnullnull\300\u02fa\300nullnullnull\300nullnullnull\300\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\300nullnullnull\300nullnullnull\300\u02fa\300nullnullnull\300nullnullnull\300nullnullnull!", "LL\253\253\256LL\253\253\254\254LL\253\253LL\253\253LL\253\253\256LL\253\253\254\254LL\253\253LL\253\253!!LL\253\253\256LL\253\253\254\254LL\253\253LL\253\253LL\253\253\256LL\253\253\254\254LL\253\253LL\253\253!!LL\253\253\256LL\253\253\254\254LL\253\253LL\253\253LL\253\253\256LL\253\253\254\254LL\253\253LL\253\253!!LL\253\253\256LL\253\253\254\254LL\253\253LL\253\253LL\253\253\256LL\253\253\254\254LL\253\253LL\253\253!!LL\253\253\256LL\253\253\254\254LL\253\253LL\253\253LL\253\253\256LL\253\253\254\254LL\253\253LL\253\253!!LL\253\253\256LL\253\253\254\254LL\253\253LL\253\253LL\253\253\256LL\253\253\254\254LL\253\253LL\253\253!!LL\253\253\256LL\253\253\254\254LL\253\253LL\253\253LL\253\253\256LL\253\253\254\254LL\253\253LL\253\253!!LL\253\253\256LL\253\253\254\254LL\253\253LL\253\253LL\253\253\256LL\253\253\254\254LL\253\253LL\253\253!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\253LL\253\253LL\253\253LL\253\253\253LL\253\253LL\253\253LL\253\253\253LL\253\253LL\253\253LL\253\253\u02fa\253LL\253\253LL\253\253LL\253\253\253LL\253\253LL\253\253LL\253\253\253LL\253\253LL\253\253LL\253\253\u02fa\253LL\253\253LL\253\253LL\253\253\253LL\253\253LL\253\253LL\253\253\253LL\253\253LL\253\253LL\253\253\u02fa\253LL\253\253LL\253\253LL\253\253\253LL\253\253LL\253\253LL\253\253\253LL\253\253LL\253\253LL\253\253\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\253LL\253\253LL\253\253LL\253\253\253LL\253\253LL\253\253LL\253\253\253LL\253\253LL\253\253LL\253\253\u02fa\253LL\253\253LL\253\253LL\253\253\253LL\253\253LL\253\253LL\253\253\253LL\253\253LL\253\253LL\253\253!" + "'", str2, "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\253LL\253\253LL\253\253LL\253\253\253LL\253\253LL\253\253LL\253\253\253LL\253\253LL\253\253LL\253\253\u02fa\253LL\253\253LL\253\253LL\253\253\253LL\253\253LL\253\253LL\253\253\253LL\253\253LL\253\253LL\253\253\u02fa\253LL\253\253LL\253\253LL\253\253\253LL\253\253LL\253\253LL\253\253\253LL\253\253LL\253\253LL\253\253\u02fa\253LL\253\253LL\253\253LL\253\253\253LL\253\253LL\253\253LL\253\253\253LL\253\253LL\253\253LL\253\253\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\253LL\253\253LL\253\253LL\253\253\253LL\253\253LL\253\253LL\253\253\253LL\253\253LL\253\253LL\253\253\u02fa\253LL\253\253LL\253\253LL\253\253\253LL\253\253LL\253\253LL\253\253\253LL\253\253LL\253\253LL\253\253!");
    }

    @Test
    public void test12776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12776");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260!!!\255\256\260\260!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test12777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12777");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214!", "!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\214\214\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\214\214\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\214\214\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\214\214\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\214\214\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\214\214\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\214\214\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\214\214!" + "'", str2, "\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\214\214\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\214\214\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\214\214\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\214\214\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\214\214\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\214\214\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\214\214\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\u02eb\214\214!");
    }

    @Test
    public void test12778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12778");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~LLNNNLLLLNNNLLLLNNNLL\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~LLNNNLLLLNNNLLLLNNNLL]]!", "!!!!U\270\270\270U\270\270\270!!U\270\270\270U\270\270\270!!U\270\270\270U\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!U\270\270\270U\270\270\270!!U\270\270\270U\270\270\270!!U\270\270\270U\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test12779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12779");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLL!", "hhhhhhhhhhhhhhhhhhhhhhhh\204\204hhhhhhhh\204\204hhhhhhhh\204\204hhhhhhhh\204\204hhhhhhhhhhhhhhhhhhhhhhhh\204\204hhhhhhhh\204\204!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\204HHHHHH\204HHHHHHHH\204HHHHHH\204HHHHHHHH\204HHHHHH\204HHHHHHHH\204HHHHHH\204HHHHHHHH\204HHHHHH\204HHHHHHHH\204HHHHHH\204HHHHHHHH\204HHHHHH\204HHHHHHHH\204HHHHHH\204HHHHHHHH!" + "'", str2, "\204HHHHHH\204HHHHHHHH\204HHHHHH\204HHHHHHHH\204HHHHHH\204HHHHHHHH\204HHHHHH\204HHHHHHHH\204HHHHHH\204HHHHHHHH\204HHHHHH\204HHHHHHHH\204HHHHHH\204HHHHHHHH\204HHHHHH\204HHHHHHHH!");
    }

    @Test
    public void test12780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12780");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!!", "}null\200\200}null\200\200}null\200\200}null\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}null\200\200}null\200\200}null\200\200}null\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!!" + "'", str2, "\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!!");
    }

    @Test
    public void test12781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12781");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d!", "\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1\u01d1!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\274\275\277\277\274\275\277\277\274\275\277\277\274\275\277\277\274\275\277\277\274\275\277\277nullnull\274\275\277\277\274\275\277\277nullnull\274\275\277\277\274\275\277\277nullnull\274\275\277\277\274\275\277\277nullnull\274\275\277\277\274\275\277\277\274\275\277\277\274\275\277\277\274\275\277\277\274\275\277\277nullnull\274\275\277\277\274\275\277\277nullnull!" + "'", str2, "\274\275\277\277\274\275\277\277\274\275\277\277\274\275\277\277\274\275\277\277\274\275\277\277nullnull\274\275\277\277\274\275\277\277nullnull\274\275\277\277\274\275\277\277nullnull\274\275\277\277\274\275\277\277nullnull\274\275\277\277\274\275\277\277\274\275\277\277\274\275\277\277\274\275\277\277\274\275\277\277nullnull\274\275\277\277\274\275\277\277nullnull!");
    }

    @Test
    public void test12782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12782");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!", "\u0366\u0365\u0368\u0368!\274\271\271\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test12783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12783");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("N!NNN!NNN!NNNN!NNN!NNN!NNNN!NNN!NNN!NNNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNNN!NNN!NNN!NNNN!NNN!NNN!NNNN!NNN!NNN!NNNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!", "nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403!" + "'", str2, "\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403\u0403!");
    }

    @Test
    public void test12784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12784");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!", "\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b!!!!!!" + "'", str2, "\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b!!!!!!");
    }

    @Test
    public void test12785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12785");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UUUUUUUU\276\276\266\266\276\276\266\266UUUUUUUU\276\276\266\266\276\276\266\266UUUUUUUU\276\276\266\266\276\276\266\266UUUUUUUU\276\276\266\266\276\276\266\266UUUUUUUU\276\276\266\266\276\276\266\266UUUUUUUU\276\276\266\266\276\276\266\266UUUUUUUU\276\276\266\266\276\276\266\266UUUUUUUU\276\276\266\266\276\276\266\266!", "\u029e\u02a0\u029e\u029e\u029e\u02a0\u029e\u029e\u02a0\u029e\u029e\u029e\u029e\214\214\u02a0\u029e\u029e\u029e\u029e\214\214\u029e\u02a0\u029e\u029e\u029e\u02a0\u029e\u029e\u02a0\u029e\u029e\u029e\u029e\214\214\u02a0\u029e\u029e\u029e\u029e\214\214\u029e\u02a0\u029e\u029e\u029e\u02a0\u029e\u029e\u02a0\u029e\u029e\u029e\u029e\214\214\u02a0\u029e\u029e\u029e\u029e\214\214\u029e\u02a0\u029e\u029e\u029e\u02a0\u029e\u029e\u02a0\u029e\u029e\u029e\u029e\214\214\u02a0\u029e\u029e\u029e\u029e\214\214\u029e\u02a0\u029e\u029e\u029e\u02a0\u029e\u029e\u02a0\u029e\u029e\u029e\u029e\214\214\u02a0\u029e\u029e\u029e\u029e\214\214\u029e\u02a0\u029e\u029e\u029e\u02a0\u029e\u029e\u02a0\u029e\u029e\u029e\u029e\214\214\u02a0\u029e\u029e\u029e\u029e\214\214\u029e\u02a0\u029e\u029e\u029e\u02a0\u029e\u029e\u02a0\u029e\u029e\u029e\u029e\214\214\u02a0\u029e\u029e\u029e\u029e\214\214\u029e\u02a0\u029e\u029e\u029e\u02a0\u029e\u029e\u02a0\u029e\u029e\u029e\u029e\214\214\u02a0\u029e\u029e\u029e\u029e\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266!" + "'", str2, "nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266!");
    }

    @Test
    public void test12786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12786");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380}~\200\200}~\200\200\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380}~\200\200}~\200\200\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380}~\200\200}~\200\200\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u01fe\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u0348\u0346\u0346!", "``JJ``JJ!!``JJ``JJ!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380}~\200\200}~\200\200\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380}~\200\200}~\200\200\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380}~\200\200}~\200\200\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380}~\200\200}~\200\200\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380}~\200\200}~\200\200\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380}~\200\200}~\200\200\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u0348\u0346\u0346!");
    }

    @Test
    public void test12787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12787");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214!", "\u0366\u0365\u0368\u0368\254\254\254\254\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!" + "'", str2, "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!");
    }

    @Test
    public void test12788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12788");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200\200!!\200\200!!\200\200!!\200\200!!!", "\200\200\u01d0\u01d0\200\200\u01d0\u01d0!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200\200!!\200\200!!\200\200!!\200\200!!!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200\200!!\200\200!!\200\200!!\200\200!!!");
    }

    @Test
    public void test12789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12789");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276!!\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276!!\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276!!\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276!!\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276!", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\226\256!nullnull!!nullnull!!\256!nullnull!!nullnull!!\236\276\276\230\226\256!nullnull!!nullnull!!\256!nullnull!!nullnull!!\236\276\276!!\230\226\256!nullnull!!nullnull!!\256!nullnull!!nullnull!!\236\276\276\230\226\256!nullnull!!nullnull!!\256!nullnull!!nullnull!!\236\276\276!!\230\226\256!nullnull!!nullnull!!\256!nullnull!!nullnull!!\236\276\276\230\226\256!nullnull!!nullnull!!\256!nullnull!!nullnull!!\236\276\276\230\226\256!nullnull!!nullnull!!\256!nullnull!!nullnull!!\236\276\276\230\226\256!nullnull!!nullnull!!\256!nullnull!!nullnull!!\236\276\276!!\230\226\256!nullnull!!nullnull!!\256!nullnull!!nullnull!!\236\276\276\230\226\256!nullnull!!nullnull!!\256!nullnull!!nullnull!!\236\276\276!!\230\226\256!nullnull!!nullnull!!\256!nullnull!!nullnull!!\236\276\276\230\226\256!nullnull!!nullnull!!\256!nullnull!!nullnull!!\236\276\276!" + "'", str2, "\230\226\256!nullnull!!nullnull!!\256!nullnull!!nullnull!!\236\276\276\230\226\256!nullnull!!nullnull!!\256!nullnull!!nullnull!!\236\276\276!!\230\226\256!nullnull!!nullnull!!\256!nullnull!!nullnull!!\236\276\276\230\226\256!nullnull!!nullnull!!\256!nullnull!!nullnull!!\236\276\276!!\230\226\256!nullnull!!nullnull!!\256!nullnull!!nullnull!!\236\276\276\230\226\256!nullnull!!nullnull!!\256!nullnull!!nullnull!!\236\276\276\230\226\256!nullnull!!nullnull!!\256!nullnull!!nullnull!!\236\276\276\230\226\256!nullnull!!nullnull!!\256!nullnull!!nullnull!!\236\276\276!!\230\226\256!nullnull!!nullnull!!\256!nullnull!!nullnull!!\236\276\276\230\226\256!nullnull!!nullnull!!\256!nullnull!!nullnull!!\236\276\276!!\230\226\256!nullnull!!nullnull!!\256!nullnull!!nullnull!!\236\276\276\230\226\256!nullnull!!nullnull!!\256!nullnull!!nullnull!!\236\276\276!");
    }

    @Test
    public void test12790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12790");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!", "``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!!!!!``!!!!!!!``!!!!!``!!!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!!!``!!!!!``!!!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!!!``!!!!!``!!!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!!!``!!!!!``!!!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!!!``!!!!!``!!!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!!!``!!!!!``!!!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!!!``!!!!!``!!!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!!!``!!!!!``!!!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!!" + "'", str2, "``!!!!!``!!!!!!!``!!!!!``!!!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!!!``!!!!!``!!!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!!!``!!!!!``!!!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!!!``!!!!!``!!!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!!!``!!!!!``!!!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!!!``!!!!!``!!!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!!!``!!!!!``!!!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!!!``!!!!!``!!!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!!");
    }

    @Test
    public void test12791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12791");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!", "EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HHEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HHEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HHEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HHEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HHEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HHEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HHEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HH!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!" + "'", str2, "!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!E!!!");
    }

    @Test
    public void test12792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12792");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNUULNUU!!LNUULNUU!!LNUULNUULNUULNUU!!LNUULNUU!!LNUULNUU!", "}~\200\200}~\200\200null^LLnull^LL}~\200\200}~\200\200null^LLnull^LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!" + "'", str2, "LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!");
    }

    @Test
    public void test12793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12793");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200}}`\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200]]!", "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\300nullnullnull\300nullnullnull\300\u02fa\300nullnullnull\300nullnullnull\300\u02fa\300nullnullnull\300nullnullnull\300\u02fa\300nullnullnull\300nullnullnull\300\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\300nullnullnull\300nullnullnull\300\u02fa\300nullnullnull\300nullnullnull\300nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200}}`\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200]]!" + "'", str2, "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200}}`\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200]]!");
    }

    @Test
    public void test12794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12794");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!!", "\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!!" + "'", str2, "\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!!");
    }

    @Test
    public void test12795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12795");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU}~\200\200}~\200\200LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!", "mnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200LUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMM}~\200\200}~\200\200LUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMM!" + "'", str2, "}~\200\200}~\200\200LUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMM}~\200\200}~\200\200LUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMMLUMM!");
    }

    @Test
    public void test12796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12796");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```!", "!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```!" + "'", str2, "~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```!");
    }

    @Test
    public void test12797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12797");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\u0126\u0128\u0128\u0126\u0128\u0128\200\200\u0126\u0128\u0128\u0126\u0128\u0128\200\200\u0126\u0128\u0128\u0126\u0128\u0128\200\200\276\u0126\u0128\u0128\u0126\u0128\u0128\200\200\275\275!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275null\377\u0100\u0102\u0102nullnullnull\377\u0100\u0102\u0102nullnull\200\200null\377\u0100\u0102\u0102nullnullnull\377\u0100\u0102\u0102nullnull\200\200null\377\u0100\u0102\u0102nullnullnull\377\u0100\u0102\u0102nullnull\200\200\276null\377\u0100\u0102\u0102nullnullnull\377\u0100\u0102\u0102nullnull\200\200\275\275!" + "'", str2, "\275null\377\u0100\u0102\u0102nullnullnull\377\u0100\u0102\u0102nullnull\200\200null\377\u0100\u0102\u0102nullnullnull\377\u0100\u0102\u0102nullnull\200\200null\377\u0100\u0102\u0102nullnullnull\377\u0100\u0102\u0102nullnull\200\200\276null\377\u0100\u0102\u0102nullnullnull\377\u0100\u0102\u0102nullnull\200\200\275\275!");
    }

    @Test
    public void test12798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12798");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ULUUULUULUUULUUUULUUULUULUUULUUUULUUULUULUUULUUUULUUULUULUUULUUUULUUULUULUUULUUUULUUULUULUUULUUUULUUULUULUUULUUUULUUULUULUUULUUU!", "````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````\200}}`````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12799");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]}~\200\200}~\200\200]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]}~\200\200}~\200\200]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]}~\200\200}~\200\200\u0348\u0346\u0346!", "null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]}~\200\200}~\200\200]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]}~\200\200}~\200\200]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]}~\200\200}~\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]}~\200\200}~\200\200]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]}~\200\200}~\200\200]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]}~\200\200}~\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test12800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12800");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLL!LLLLLLLLLLLLLLL!LLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLL!LLLLLLLLLLLLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0348\u0346\u0346!");
    }

    @Test
    public void test12801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12801");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380!", "]!!!]!!!!!]!!!]!!!!!]!!!]!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380!" + "'", str2, "\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380!");
    }

    @Test
    public void test12802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12802");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\254\275\254\254\254\275\254\254!!\254\275\254\254\254\275\254\254!!!", "H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\275\254\254\254\275\254\254!!\254\275\254\254\254\275\254\254!!!" + "'", str2, "\254\275\254\254\254\275\254\254!!\254\275\254\254\254\275\254\254!!!");
    }

    @Test
    public void test12803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12803");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!]]!", "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!]]!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!]]!");
    }

    @Test
    public void test12804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12804");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!", "L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNL!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!");
    }

    @Test
    public void test12805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12805");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\275UU\276\275UU\214\214\276\275UU\276\275UU\214\214\276\275UU\276\275UU\214\214\276\275UU\276\275UU\214\214\276\275UU\276\275UU\214\214\276\275UU\276\275UU\214\214\276\275UU\276\275UU\214\214\276\275UU\276\275UU\214\214!", "llllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\275nullnull\276\275nullnull\214\214\276\275nullnull\276\275nullnull\214\214\276\275nullnull\276\275nullnull\214\214\276\275nullnull\276\275nullnull\214\214\276\275nullnull\276\275nullnull\214\214\276\275nullnull\276\275nullnull\214\214\276\275nullnull\276\275nullnull\214\214\276\275nullnull\276\275nullnull\214\214!" + "'", str2, "\276\275nullnull\276\275nullnull\214\214\276\275nullnull\276\275nullnull\214\214\276\275nullnull\276\275nullnull\214\214\276\275nullnull\276\275nullnull\214\214\276\275nullnull\276\275nullnull\214\214\276\275nullnull\276\275nullnull\214\214\276\275nullnull\276\275nullnull\214\214\276\275nullnull\276\275nullnull\214\214!");
    }

    @Test
    public void test12806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12806");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214!", "\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214!");
    }

    @Test
    public void test12807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12807");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!!", "NULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!!" + "'", str2, "~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!!");
    }

    @Test
    public void test12808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12808");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\305\305\305\305\305\305\305\305\305\305\305\305\305\305\305\305\200}}`\305\305\305\305\305\305\305\305\305\305\305\305\305\305\305\305]]!", "\275]]]\275]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test12809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12809");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!\254LLU\254!!\214\214U\254!!\254LLU\254!!\214\214U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!\254LLU\254!!\214\214U\254!!\254LLU\254!!\214\214U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!\254LLU\254!!\214\214U\254!!\254LLU\254!!\214\214U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!\254LLU\254!!\214\214U\254!!\254LLU\254!!\214\214U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!\254LLU\254!!\214\214U\254!!\254LLU\254!!\214\214U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!\254LLU\254!!\214\214U\254!!\254LLU\254!!\214\214U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!\254LLU\254!!\214\214U\254!!\254LLU\254!!\214\214U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!\254LLU\254!!\214\214U\254!!\254LLU\254!!\214\214!", "u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!\254UU`\254!!\214\214`\254!!\254UU`\254!!\214\214`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!\254UU`\254!!\214\214`\254!!\254UU`\254!!\214\214`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!\254UU`\254!!\214\214`\254!!\254UU`\254!!\214\214`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!\254UU`\254!!\214\214`\254!!\254UU`\254!!\214\214`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!\254UU`\254!!\214\214`\254!!\254UU`\254!!\214\214`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!\254UU`\254!!\214\214`\254!!\254UU`\254!!\214\214`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!\254UU`\254!!\214\214`\254!!\254UU`\254!!\214\214`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!\254UU`\254!!\214\214`\254!!\254UU`\254!!\214\214!" + "'", str2, "`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!\254UU`\254!!\214\214`\254!!\254UU`\254!!\214\214`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!\254UU`\254!!\214\214`\254!!\254UU`\254!!\214\214`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!\254UU`\254!!\214\214`\254!!\254UU`\254!!\214\214`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!\254UU`\254!!\214\214`\254!!\254UU`\254!!\214\214`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!\254UU`\254!!\214\214`\254!!\254UU`\254!!\214\214`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!\254UU`\254!!\214\214`\254!!\254UU`\254!!\214\214`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!\254UU`\254!!\214\214`\254!!\254UU`\254!!\214\214`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!`\254!!\254UU`\254!!\214\214`\254!!\254UU`\254!!\214\214!");
    }

    @Test
    public void test12810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12810");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test12811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12811");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0226!", "null\300\300\300null\300\300\300null\300\300\300null\300\300\300null\300\300\300null\300\300\300null\300\300\300null\300\300\300!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!" + "'", str2, "!null!");
    }

    @Test
    public void test12812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12812");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321!", "\300\335\336\340\340\300\300\300\335\336\340\340\300\300!!\300\335\336\340\340\300\300\300\335\336\340\340\300\300!!\300\335\336\340\340\300\300\300\335\336\340\340\300\300\300\335\336\340\340\300\300\300\335\336\340\340\300\300!!\300\335\336\340\340\300\300\300\335\336\340\340\300\300!!\300\335\336\340\340\300\300\300\335\336\340\340\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12813");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02faLUNNLUNN!", "UULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02faLLUULLUU!" + "'", str2, "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02faLLUULLUU!");
    }

    @Test
    public void test12814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12814");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!!", "\u0366\u0365\u0368\u0368vv!!vv!!!!vv!!vv!!!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\220~~!\220~~!!!\220~~!\220~~!!!\220~~!\220~~!!!\220~~!\220~~!!!\220~~!\220~~!!!\220~~!\220~~!!!\220~~!\220~~!!!\220~~!\220~~!!!" + "'", str2, "!\220~~!\220~~!!!\220~~!\220~~!!!\220~~!\220~~!!!\220~~!\220~~!!!\220~~!\220~~!!!\220~~!\220~~!!!\220~~!\220~~!!!\220~~!\220~~!!!");
    }

    @Test
    public void test12815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12815");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380!", "\u01a0!!!\200\u01a0!!!]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380!" + "'", str2, "\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380!");
    }

    @Test
    public void test12816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12816");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200\u0348\u0346\u0346!", "!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200!!\200\200\200\200\200\200\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test12817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12817");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}!\200\200}!\200\200}!\200\200}!\200\200\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215}!\200\200}!\200\200}!\200\200}!\200\200\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}!\200\200}!\200\200}!\200\200}!\200\200\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215}!\200\200}!\200\200}!\200\200}!\200\200\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215!" + "'", str2, "}!\200\200}!\200\200}!\200\200}!\200\200\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215}!\200\200}!\200\200}!\200\200}!\200\200\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215\230LLLL\215\215!");
    }

    @Test
    public void test12818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12818");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!\231\231\231\231\231\231\231\231!!\231\231\231\231\231\231\231\231!!\231\231\231\231\231\231\231\231!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\231\231\231\231\231\231\231\231!!\231\231\231\231\231\231\231\231!!\231\231\231\231\231\231\231\231!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!\231\231\231\231\231\231\231\231!!\231\231\231\231\231\231\231\231!!\231\231\231\231\231\231\231\231!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\231\231\231\231\231\231\231\231!!\231\231\231\231\231\231\231\231!!\231\231\231\231\231\231\231\231!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!\231\231\231\231\231\231\231\231!!\231\231\231\231\231\231\231\231!!\231\231\231\231\231\231\231\231!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\231\231\231\231\231\231\231\231!!\231\231\231\231\231\231\231\231!!\231\231\231\231\231\231\231\231!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test12819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12819");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!!", "\275!JLL!JLL!JLL\275!JLL!JLL!JLL\275!JLL!JLL!JLL\275!JLL!JLL!JLL!JLL!JLL\275\275!JLL!JLL\275\275!JLL!JLL\275\275!JLL!JLL\275\275\275!JLL!JLL!JLL\275!JLL!JLL!JLL\275!JLL!JLL!JLL\275!JLL!JLL!JLL!JLL!JLL\275\275!JLL!JLL\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!!" + "'", str2, "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!!");
    }

    @Test
    public void test12820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12820");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ\275JJJ!", "nullvvvnullvvvnullvvvnullvvv\200}}`nullvvvnullvvvnullvvvnullvvv]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull!" + "'", str2, "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull!");
    }

    @Test
    public void test12821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12821");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("``UUUUUUUU``UUUUUUUU``UUUUUUUU``UUUUUUUU``UUUUUUUU``UUUUUUUU``UUUUUUUU``UUUUUUUU!", "!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!!!!!!!!``!!!!!!!!``!!!!!!!!``!!!!!!!!``!!!!!!!!``!!!!!!!!``!!!!!!!!``!!!!!!!!!" + "'", str2, "``!!!!!!!!``!!!!!!!!``!!!!!!!!``!!!!!!!!``!!!!!!!!``!!!!!!!!``!!!!!!!!``!!!!!!!!!");
    }

    @Test
    public void test12822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12822");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null]!]]]!]]]!]]null]!]]]!]]]!]]!", "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\230\225\225]!]]]!]]]!]]\230\230\225\225]!]]]!]]]!]]!" + "'", str2, "\230\230\225\225]!]]]!]]]!]]\230\230\225\225]!]]]!]]]!]]!");
    }

    @Test
    public void test12823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12823");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230\200}}`~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u010c\u010d\u010f\u010f\u010c\u010d\u010f\u010f\u010c\u010d\u010f\u010f\u010c\u010d\u010f\u010f\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u010c\u010d\u010f\u010f\u010c\u010d\u010f\u010f\u010c\u010d\u010f\u010f\u010c\u010d\u010f\u010f\u0348\u0346\u0346!");
    }

    @Test
    public void test12824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12824");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!!", "NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!!" + "'", str2, "\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!!");
    }

    @Test
    public void test12825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12825");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220!", "\275nullnullJJnullnullJJnullnullJJ\276nullnullJJ\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~\205\206\210\210\205\206\210\210!~\205\206\210\210\205\206\210\210\220\220!~\205\206\210\210\205\206\210\210!~\205\206\210\210\205\206\210\210\220\220\220!~\205\206\210\210\205\206\210\210\220\220\220!~\205\206\210\210\205\206\210\210\220\220\220!~\205\206\210\210\205\206\210\210\220\220\220!~\205\206\210\210\205\206\210\210\220\220!~\205\206\210\210\205\206\210\210!~\205\206\210\210\205\206\210\210\220\220!~\205\206\210\210\205\206\210\210!~\205\206\210\210\205\206\210\210\220\220!" + "'", str2, "!~\205\206\210\210\205\206\210\210!~\205\206\210\210\205\206\210\210\220\220!~\205\206\210\210\205\206\210\210!~\205\206\210\210\205\206\210\210\220\220\220!~\205\206\210\210\205\206\210\210\220\220\220!~\205\206\210\210\205\206\210\210\220\220\220!~\205\206\210\210\205\206\210\210\220\220\220!~\205\206\210\210\205\206\210\210\220\220!~\205\206\210\210\205\206\210\210!~\205\206\210\210\205\206\210\210\220\220!~\205\206\210\210\205\206\210\210!~\205\206\210\210\205\206\210\210\220\220!");
    }

    @Test
    public void test12826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12826");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!``nullnullnullnullnullnullnullnull!", "\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\200\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c!" + "'", str2, "\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c!");
    }

    @Test
    public void test12827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12827");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull!!nullnull!!\255\256\260\260\255\256\260\260nullnull!!nullnull!!\255\256\260\260\255\256\260\260nullnull!!nullnull!!\255\256\260\260\255\256\260\260nullnull!!nullnull!!\255\256\260\260\255\256\260\260nullnull!!nullnull!!\255\256\260\260\255\256\260\260nullnull!!nullnull!!\255\256\260\260\255\256\260\260nullnull!!nullnull!!\255\256\260\260\255\256\260\260nullnull!!nullnull!!\255\256\260\260\255\256\260\260!", "NLLLNLLLNLLLNLLLLLNNLLNNLLNNLLNNNLLLNLLLNLLLNLLLLLNNLLNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230null\226\226\230null\226\226!!\230null\226\226\230null\226\226!!\255\256\260\260\255\256\260\260\230null\226\226\230null\226\226!!\230null\226\226\230null\226\226!!\255\256\260\260\255\256\260\260\230null\226\226\230null\226\226!!\230null\226\226\230null\226\226!!\255\256\260\260\255\256\260\260\230null\226\226\230null\226\226!!\230null\226\226\230null\226\226!!\255\256\260\260\255\256\260\260\230null\226\226\230null\226\226!!\230null\226\226\230null\226\226!!\255\256\260\260\255\256\260\260\230null\226\226\230null\226\226!!\230null\226\226\230null\226\226!!\255\256\260\260\255\256\260\260\230null\226\226\230null\226\226!!\230null\226\226\230null\226\226!!\255\256\260\260\255\256\260\260\230null\226\226\230null\226\226!!\230null\226\226\230null\226\226!!\255\256\260\260\255\256\260\260!" + "'", str2, "\230null\226\226\230null\226\226!!\230null\226\226\230null\226\226!!\255\256\260\260\255\256\260\260\230null\226\226\230null\226\226!!\230null\226\226\230null\226\226!!\255\256\260\260\255\256\260\260\230null\226\226\230null\226\226!!\230null\226\226\230null\226\226!!\255\256\260\260\255\256\260\260\230null\226\226\230null\226\226!!\230null\226\226\230null\226\226!!\255\256\260\260\255\256\260\260\230null\226\226\230null\226\226!!\230null\226\226\230null\226\226!!\255\256\260\260\255\256\260\260\230null\226\226\230null\226\226!!\230null\226\226\230null\226\226!!\255\256\260\260\255\256\260\260\230null\226\226\230null\226\226!!\230null\226\226\230null\226\226!!\255\256\260\260\255\256\260\260\230null\226\226\230null\226\226!!\230null\226\226\230null\226\226!!\255\256\260\260\255\256\260\260!");
    }

    @Test
    public void test12828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12828");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!!", "null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a!!!" + "'", str2, "\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a!!!");
    }

    @Test
    public void test12829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12829");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354!", "\253\254\256\256``^^``^^``^^``^^\253\254\256\256``^^``^^!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12830");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213\254~\256\256\254~\256\256\254~\256\256\254~\256\256!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213\254~\256\256\254~\256\256\254~\256\256\254~\256\256!" + "'", str2, "LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213LL\213\213\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
    }

    @Test
    public void test12831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12831");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test12832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12832");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\300\300\300\275\300\300\300!", "null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275LLL\275LLL!" + "'", str2, "\275LLL\275LLL!");
    }

    @Test
    public void test12833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12833");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!", "\u0406\u0406!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12834");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UL!!UL!!null!\214\214null!\214\214UL!!UL!!null!\214\214null!\214\214UL!!UL!!null!\214\214null!\214\214UL!!UL!!null!\214\214null!\214\214UL!!UL!!null!\214\214null!\214\214UL!!UL!!null!\214\214null!\214\214UL!!UL!!null!\214\214null!\214\214UL!!UL!!null!\214\214null!\214\214!", "nullooonullooonullooonullooo\200}}`nullooonullooonullooonullooo]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "wy!!wy!!\226\227\231\231!\214\214\226\227\231\231!\214\214wy!!wy!!\226\227\231\231!\214\214\226\227\231\231!\214\214wy!!wy!!\226\227\231\231!\214\214\226\227\231\231!\214\214wy!!wy!!\226\227\231\231!\214\214\226\227\231\231!\214\214wy!!wy!!\226\227\231\231!\214\214\226\227\231\231!\214\214wy!!wy!!\226\227\231\231!\214\214\226\227\231\231!\214\214wy!!wy!!\226\227\231\231!\214\214\226\227\231\231!\214\214wy!!wy!!\226\227\231\231!\214\214\226\227\231\231!\214\214!" + "'", str2, "wy!!wy!!\226\227\231\231!\214\214\226\227\231\231!\214\214wy!!wy!!\226\227\231\231!\214\214\226\227\231\231!\214\214wy!!wy!!\226\227\231\231!\214\214\226\227\231\231!\214\214wy!!wy!!\226\227\231\231!\214\214\226\227\231\231!\214\214wy!!wy!!\226\227\231\231!\214\214\226\227\231\231!\214\214wy!!wy!!\226\227\231\231!\214\214\226\227\231\231!\214\214wy!!wy!!\226\227\231\231!\214\214\226\227\231\231!\214\214wy!!wy!!\226\227\231\231!\214\214\226\227\231\231!\214\214!");
    }

    @Test
    public void test12835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12835");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!", "nulllnuulnuulnuulnuunulllnuulnuu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU!!NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU!!NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU!!NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU!!NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU!" + "'", str2, "NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU!!NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU!!NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU!!NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU!!NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU!");
    }

    @Test
    public void test12836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12836");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\307\307\307\307\307\307\307\307\307\307\307\307!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!!!!", "ppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnn!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!!");
    }

    @Test
    public void test12837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12837");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test12838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12838");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````\200}}`````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````]]!", "\u0317\u031a\u0317\u031a\u0317\u031a\u0317\u031a]]!!]]!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````\200}}`````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````]]!" + "'", str2, "````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````\200}}`````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````]]!");
    }

    @Test
    public void test12839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12839");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253!", "!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253!" + "'", str2, "U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253U!\253\253\253U!\253\253U!\253\253!");
    }

    @Test
    public void test12840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12840");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!!!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!!!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!!!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!!!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!", "U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!" + "'", str2, "!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!~!!~!!!~!!!!!~!!!~!!!!~!!!~!!!!!~!!!~!!!");
    }

    @Test
    public void test12841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12841");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253!", "\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\260\255\255\225\230\230\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\260\255\255\225\230\230\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\260\255\255\225\230\230\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\260\255\255\225\230\230\200\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\260\255\255\225\230\230\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\260\255\255\225\230\230\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\260\255\255\225\230\230\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\u019f\u019f\u019d\u019d\260\255\255\225\230\230]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253!" + "'", str2, "\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253\u019f!\253\253\253\u019f!\253\253\u019f!\253\253!");
    }

    @Test
    public void test12842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12842");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\u0366\u0365\u0368\u0368LL!!LL!!!!LL!!LL!!!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12843");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!", "\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~!!NN\256\256NN\256\256NN\256\256NN\256\256~~~NN\256\256NN\256\256NN\256\256NN\256\256~~~NN\256\256NN\256\256NN\256\256NN\256\256~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!NN\256\256NN\256\256NN\256\256NN\256\256~~~NN\256\256NN\256\256NN\256\256NN\256\256~~~NN\256\256NN\256\256NN\256\256NN\256\256~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!" + "'", str2, "~~!!NN\256\256NN\256\256NN\256\256NN\256\256~~~NN\256\256NN\256\256NN\256\256NN\256\256~~~NN\256\256NN\256\256NN\256\256NN\256\256~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!NN\256\256NN\256\256NN\256\256NN\256\256~~~NN\256\256NN\256\256NN\256\256NN\256\256~~~NN\256\256NN\256\256NN\256\256NN\256\256~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
    }

    @Test
    public void test12844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12844");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0348\u0348!", "!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0348\u0348!");
    }

    @Test
    public void test12845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12845");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!", "nullnullnullnull]!]]]!]]]!]]nullnullnullnull]!]]]!]]]!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!" + "'", str2, "!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!");
    }

    @Test
    public void test12846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12846");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\223]\223\223\223]\223\223!!\223]\223\223\223]\223\223!!\223]\223\223\223]\223\223\223]\223\223\223]\223\223!!\223]\223\223\223]\223\223!!\223]\223\223\223]\223\223!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12847");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294!!!", "!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF\200}}`!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test12848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12848");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210!", "\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU!!\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU!!\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU!!\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU!!\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU!!\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU!!\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU!!\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12849");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\253\256\256\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "\336UUUUnull!!Unull!!!!!!\336UUUUnull!!Unull!!!!!!!!\336UUUUnull!!Unull!!!!!!\336UUUUnull!!Unull!!!!!!!!\336UUUUnull!!Unull!!!!!!\336UUUUnull!!Unull!!!!!!!!\336UUUUnull!!Unull!!!!!!\336UUUUnull!!Unull!!!!!!!!\336UUUUnull!!Unull!!!!!!\336UUUUnull!!Unull!!!!!!!!\336UUUUnull!!Unull!!!!!!\336UUUUnull!!Unull!!!!!!!!\336UUUUnull!!Unull!!!!!!\336UUUUnull!!Unull!!!!!!!!\336UUUUnull!!Unull!!!!!!\336UUUUnull!!Unull!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test12850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12850");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\260\260\260\260\u0346\u0348\u0348!", "UULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\260\260\260\260\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\260\260\260\260\u0346\u0348\u0348!");
    }

    @Test
    public void test12851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12851");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\u0366\u0365\u0368\u0368!\253\253\u0366\u0366\253\253\u0366\u0366\253\253\u0366\u0366\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12852");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12853");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215\216\230\230L!~~L!~~L!~~\215\216\230\230L!~~L!~~L!~~\215\216\230\230L!~~L!~~L!~~\215\216\230\230L!~~L!~~L!~~\215\216\230\230L!~~L!~~L!~~\215\216\230\230L!~~L!~~L!~~\215\216\230\230L!~~L!~~L!~~\215\216\230\230L!~~L!~~L!~~!", "\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230\u019d\u019d\u019d!~~\215\216\230\230\u019d\u019d\u019d!~~\215\216\230\230\u019d\u019d\u019d!~~\215\216\230\230\u019d\u019d\u019d!~~\215\216\230\230\u019d\u019d\u019d!~~\215\216\230\230\u019d\u019d\u019d!~~\215\216\230\230\u019d\u019d\u019d!~~\215\216\230\230\u019d\u019d\u019d!~~!" + "'", str2, "\215\216\230\230\u019d\u019d\u019d!~~\215\216\230\230\u019d\u019d\u019d!~~\215\216\230\230\u019d\u019d\u019d!~~\215\216\230\230\u019d\u019d\u019d!~~\215\216\230\230\u019d\u019d\u019d!~~\215\216\230\230\u019d\u019d\u019d!~~\215\216\230\230\u019d\u019d\u019d!~~\215\216\230\230\u019d\u019d\u019d!~~!");
    }

    @Test
    public void test12854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12854");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!!\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a!\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a!\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a!\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a!!!!!\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a!\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a!" + "'", str2, "\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a!");
    }

    @Test
    public void test12855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12855");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!", "!\275!!!\275!!]]!\275!!!\275!!]]!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!]]!\275!!!\275!!]]!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!" + "'", str2, "\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!");
    }

    @Test
    public void test12856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12856");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUU!", "NNNNNNLLNNLL!!!!NNNNNNLLNNLL!!!!!!NNNNNNLLNNLL!!!!NNNNNNLLNNLL!!!!!!NNNNNNLLNNLL!!!!NNNNNNLLNNLL!!!!!!NNNNNNLLNNLL!!!!NNNNNNLLNNLL!!!!!!NNNNNNLLNNLL!!!!NNNNNNLLNNLL!!!!!!NNNNNNLLNNLL!!!!NNNNNNLLNNLL!!!!!!NNNNNNLLNNLL!!!!NNNNNNLLNNLL!!!!!!NNNNNNLLNNLL!!!!NNNNNNLLNNLL!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148nullnull!" + "'", str2, "\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148\u014a\u0148\u014a\u014a\u0148\u014a\u0148nullnull!");
    }

    @Test
    public void test12857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12857");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368nullnull!!nullnull!!\200\200\u0346\u0348\u0348!", "FHFFFHFFH~~~H~~~H~~~H~~~H~~~H~~~H~~~H~~~FHFFFHFFH~~~H~~~H~~~H~~~H~~~H~~~H~~~H~~~FHFFFHFFH~~~H~~~H~~~H~~~H~~~H~~~H~~~H~~~FHFFFHFFH~~~H~~~H~~~H~~~H~~~H~~~H~~~H~~~FHFFFHFFH~~~H~~~H~~~H~~~H~~~H~~~H~~~H~~~FHFFFHFFH~~~H~~~H~~~H~~~H~~~H~~~H~~~H~~~FHFFFHFFH~~~H~~~H~~~H~~~H~~~H~~~H~~~H~~~FHFFFHFFH~~~H~~~H~~~H~~~H~~~H~~~H~~~H~~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368HHFFHHFF!!HHFFHHFF!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368HHFFHHFF!!HHFFHHFF!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test12858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12858");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246!", "\u0346\u0348\u0348\u0348\u02e3\u02e3\u02e3\u02e3\u02e3\u02e3\u037e\u037e\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u037e\u02e3\u02e3\u037e\u02e3\u02e3\u037e\u02e3\u02e3\u037e\u02e3\u02e3\u037e\u02e3\u02e3\u037e\u02e3\u02e3\u037e\u02e3\u02e3\u037e\u02e3\u02e3\u037e\u02e3\u02e3\u037e\u02e3\u02e3\u037e\u02e3\u02e3\u037e\u02e3\u02e3\u037e\u02e3\u02e3\u037e\u02e3\u02e3\u037e\u02e3\u02e3\u037e\u02e3\u02e3nullnullnullnullnullnullnullnull!" + "'", str2, "\u037e\u02e3\u02e3\u037e\u02e3\u02e3\u037e\u02e3\u02e3\u037e\u02e3\u02e3\u037e\u02e3\u02e3\u037e\u02e3\u02e3\u037e\u02e3\u02e3\u037e\u02e3\u02e3\u037e\u02e3\u02e3\u037e\u02e3\u02e3\u037e\u02e3\u02e3\u037e\u02e3\u02e3\u037e\u02e3\u02e3\u037e\u02e3\u02e3\u037e\u02e3\u02e3\u037e\u02e3\u02e3nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12859");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL!", "]`^^]`^^!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12860");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014e\u014e\u014e\u014e\u014e!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnullnull!!!!nullnullnull!!!" + "'", str2, "!!nullnullnull!!!!nullnullnull!!!");
    }

    @Test
    public void test12861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12861");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("unllunllunllunllunllunllunllunll!", "\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12862");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\254\254\200NNN\200NNN\254\254\200NNN\200NNN\254\254\200NNN\200NNN\254\254\200NNN\200NNN\254\254\200NNN\200NNN\254\254\200NNN\200NNN\254\254\200NNN\200NNN\254\254\200NNN\200NNN!", "\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull!" + "'", str2, "\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull!");
    }

    @Test
    public void test12863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12863");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!", "`nullhffnullhffnullhff`nullhffnullhffnullhff!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!" + "'", str2, "!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!");
    }

    @Test
    public void test12864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12864");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275!UUU!UUU!UUU\276!UUU\275\275!", "\u0346\u0348\u0348\u0348\u017d\u017d\u017d\u017d\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!nullnullnull!nullnullnull!nullnullnull\276!nullnullnull\275\275!" + "'", str2, "\275!nullnullnull!nullnullnull!nullnullnull\276!nullnullnull\275\275!");
    }

    @Test
    public void test12865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12865");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "\u0228\u0228\u0228\u0228!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test12866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12866");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!", "LLUULLUULLUULLUU\260\255\255\225\230\230LLUULLUULLUULLUU\260\255\255\225\230\230LLUULLUULLUULLUU\260\255\255\225\230\230LLUULLUULLUULLUU\260\255\255\225\230\230\200}}`LLUULLUULLUULLUU\260\255\255\225\230\230LLUULLUULLUULLUU\260\255\255\225\230\230LLUULLUULLUULLUU\260\255\255\225\230\230LLUULLUULLUULLUU\260\255\255\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!" + "'", str2, "!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!");
    }

    @Test
    public void test12867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12867");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4!!!", "\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204\200}}`\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test12868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12868");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "NLLL\236\276\276NLLL\236\276\276!!NLLL\236\276\276NLLL\236\276\276!!NLLL\236\276\276NLLL\236\276\276NLLL\236\276\276NLLL\236\276\276!!NLLL\236\276\276NLLL\236\276\276!!NLLL\236\276\276NLLL\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12869");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214!", "}~\200\200}~\200\200\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120}~\200\200}~\200\200\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214!" + "'", str2, "\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214\225]\225\225\225]\225\225\225\225]]\225\225]]\225]\225\225\225]\225\225\225\225]]\225\225]]\214\214!");
    }

    @Test
    public void test12870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12870");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0124\u0348\u0346\u0346!");
    }

    @Test
    public void test12871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12871");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa!", "UNLLnllUNLLnllUNLLnllUNLLnllUNLLnllUNLLnllUNLLnllUNLLnll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa!" + "'", str2, "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa!");
    }

    @Test
    public void test12872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12872");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368!!!!\213\213\213\u0346\u0348\u0348!", "!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!null!!!null!!!null!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!!!!\213\213\213\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!!!!\213\213\213\u0346\u0348\u0348!");
    }

    @Test
    public void test12873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12873");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!", "\u0199\u0199\220nullnull\200\u0199\u0199\220nullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!" + "'", str2, "\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!");
    }

    @Test
    public void test12874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12874");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj!", "UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
    }

    @Test
    public void test12875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12875");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253\254\256\256!UUU!UUU!UUU!UUU\253\254\256\256!UUU!UUU!", "\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256!\254\254\254!\254\254\254!\254\254\254!\254\254\254\253\254\256\256!\254\254\254!\254\254\254!" + "'", str2, "\253\254\256\256!\254\254\254!\254\254\254!\254\254\254!\254\254\254\253\254\256\256!\254\254\254!\254\254\254!");
    }

    @Test
    public void test12876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12876");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!!", "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~~NLLL!!~~!!~~!!~~NLLL!!~~!!~~!!~~!!~~!!~~NLLL!!~~!!~~!!~~NLLL!!~~!!~~!!~~!!~~!!!!~~NLLL!!~~!!~~!!~~NLLL!!~~!!~~!!~~!!~~!!~~NLLL!!~~!!~~!!~~NLLL!!~~!!~~!!~~!!~~!!!!~~NLLL!!~~!!~~!!~~NLLL!!~~!!~~!!~~!!~~!!~~NLLL!!~~!!~~!!~~NLLL!!~~!!~~!!~~!!~~!!!!~~NLLL!!~~!!~~!!~~NLLL!!~~!!~~!!~~!!~~!!~~NLLL!!~~!!~~!!~~NLLL!!~~!!~~!!~~!!~~!!!!~~NLLL!!~~!!~~!!~~NLLL!!~~!!~~!!~~!!~~!!~~NLLL!!~~!!~~!!~~NLLL!!~~!!~~!!~~!!~~!!!!~~NLLL!!~~!!~~!!~~NLLL!!~~!!~~!!~~!!~~!!~~NLLL!!~~!!~~!!~~NLLL!!~~!!~~!!~~!!~~!!!!~~NLLL!!~~!!~~!!~~NLLL!!~~!!~~!!~~!!~~!!~~NLLL!!~~!!~~!!~~NLLL!!~~!!~~!!~~!!~~!!!!~~NLLL!!~~!!~~!!~~NLLL!!~~!!~~!!~~!!~~!!~~NLLL!!~~!!~~!!~~NLLL!!~~!!~~!!~~!!~~!!!" + "'", str2, "!!~~NLLL!!~~!!~~!!~~NLLL!!~~!!~~!!~~!!~~!!~~NLLL!!~~!!~~!!~~NLLL!!~~!!~~!!~~!!~~!!!!~~NLLL!!~~!!~~!!~~NLLL!!~~!!~~!!~~!!~~!!~~NLLL!!~~!!~~!!~~NLLL!!~~!!~~!!~~!!~~!!!!~~NLLL!!~~!!~~!!~~NLLL!!~~!!~~!!~~!!~~!!~~NLLL!!~~!!~~!!~~NLLL!!~~!!~~!!~~!!~~!!!!~~NLLL!!~~!!~~!!~~NLLL!!~~!!~~!!~~!!~~!!~~NLLL!!~~!!~~!!~~NLLL!!~~!!~~!!~~!!~~!!!!~~NLLL!!~~!!~~!!~~NLLL!!~~!!~~!!~~!!~~!!~~NLLL!!~~!!~~!!~~NLLL!!~~!!~~!!~~!!~~!!!!~~NLLL!!~~!!~~!!~~NLLL!!~~!!~~!!~~!!~~!!~~NLLL!!~~!!~~!!~~NLLL!!~~!!~~!!~~!!~~!!!!~~NLLL!!~~!!~~!!~~NLLL!!~~!!~~!!~~!!~~!!~~NLLL!!~~!!~~!!~~NLLL!!~~!!~~!!~~!!~~!!!!~~NLLL!!~~!!~~!!~~NLLL!!~~!!~~!!~~!!~~!!~~NLLL!!~~!!~~!!~~NLLL!!~~!!~~!!~~!!~~!!!");
    }

    @Test
    public void test12877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12877");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!", "}~\200\200}~\200\200FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH}~\200\200}~\200\200FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!" + "'", str2, "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!");
    }

    @Test
    public void test12878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12878");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UUUUUUUU\253\253UUUUUUUU\253\253UUUUUUUU\253\253UUUUUUUU\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UUUUUUUU\253\253UUUUUUUU\253\253!", "LLLLLLLLLLLLLLLLLLLLLLLL\204\204LLLLLLLL\204\204LLLLLLLL\204\204LLLLLLLL\204\204LLLLLLLLLLLLLLLLLLLLLLLL\204\204LLLLLLLL\204\204!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LLLLLLLL\253\253LLLLLLLL\253\253LLLLLLLL\253\253LLLLLLLL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LLLLLLLL\253\253LLLLLLLL\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LLLLLLLL\253\253LLLLLLLL\253\253LLLLLLLL\253\253LLLLLLLL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LLLLLLLL\253\253LLLLLLLL\253\253!");
    }

    @Test
    public void test12879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12879");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ!", "\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104!" + "'", str2, "\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104\u0104!");
    }

    @Test
    public void test12880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12880");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnull}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnull}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnull}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u0348\u0346\u0346!", "U\254UUU\254UU!!U\254UUU\254UU!!U\254UUU\254UUU\254UUU\254UU!!U\254UUU\254UU!!U\254UUU\254UU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnullnull\230nullnullnull\230nullnullnull\230nullnullnullnullnullnullnull\230nullnullnull\230nullnullnull\230nullnull}~\200\200}~\200\200nullnullnullnullnull\230nullnullnull\230nullnullnull\230nullnullnullnullnullnullnull\230nullnullnull\230nullnullnull\230nullnull}~\200\200}~\200\200nullnullnullnullnull\230nullnullnull\230nullnullnull\230nullnullnullnullnullnullnull\230nullnullnull\230nullnullnull\230nullnull}~\200\200}~\200\200nullnullnullnullnull\230nullnullnull\230nullnullnull\230nullnullnullnullnullnullnull\230nullnullnull\230nullnullnull\230\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnullnull\230nullnullnull\230nullnullnull\230nullnullnullnullnullnullnull\230nullnullnull\230nullnullnull\230nullnull}~\200\200}~\200\200nullnullnullnullnull\230nullnullnull\230nullnullnull\230nullnullnullnullnullnullnull\230nullnullnull\230nullnullnull\230nullnull}~\200\200}~\200\200nullnullnullnullnull\230nullnullnull\230nullnullnull\230nullnullnullnullnullnullnull\230nullnullnull\230nullnullnull\230nullnull}~\200\200}~\200\200nullnullnullnullnull\230nullnullnull\230nullnullnull\230nullnullnullnullnullnullnull\230nullnullnull\230nullnullnull\230\u0348\u0346\u0346!");
    }

    @Test
    public void test12881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12881");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220!", "\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220!" + "'", str2, "\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220!");
    }

    @Test
    public void test12882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12882");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200!", "!\253\256\256\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200!");
    }

    @Test
    public void test12883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12883");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "hgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjj!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test12884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12884");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c\u020c!", "]F^^!]F^^]F^^]F^^]F^^!!]F^^]F^^!!]F^^]F^^!!]F^^]F^^!!]F^^!]F^^]F^^]F^^]F^^!!]F^^]F^^!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull!!`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull!!`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull!!`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull!!`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull!" + "'", str2, "`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull!!`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull!!`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull!!`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull!!`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull!");
    }

    @Test
    public void test12885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12885");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300!", "\253\254\256\256\u035c\u035c\u035c\u035c\u035c\u035c\u035c\u035c\u035c\u035c\u035c\u035c\253\254\256\256\u035c\u035c\u035c\u035c\u035c\u035c!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnullnull~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnull!" + "'", str2, "null~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnullnull~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnull!");
    }

    @Test
    public void test12886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12886");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200\350^\214\214\350^\214\214}~\200\200}~\200\200\350^\214\214\350^\214\214!", "]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200U^\214\214U^\214\214}~\200\200}~\200\200U^\214\214U^\214\214!" + "'", str2, "}~\200\200}~\200\200U^\214\214U^\214\214}~\200\200}~\200\200U^\214\214U^\214\214!");
    }

    @Test
    public void test12887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12887");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU!", "\276HHHH\275\275\276HHHH\275\275H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\276HHHH\275\275\276HHHH\275\275H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\276HHHH\275\275\276HHHH\275\275H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\276HHHH\275\275\276HHHH\275\275H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\276HHHH\275\275\276HHHH\275\275H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\276HHHH\275\275\276HHHH\275\275H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\276HHHH\275\275\276HHHH\275\275H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\276HHHH\275\275\276HHHH\275\275H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200HHHH!HHHHHHHHHHHH!HHHHHHHHHHHHHHHHHHHH!HHHHHHHHHHHH!HHHHHHHHHHHHHHHH~}\200\200~}\200\200HHHH!HHHHHHHHHHHH!HHHHHHHHHHHHHHHHHHHH!HHHHHHHHHHHH!HHHHHHHHHHHHHHHH~}\200\200~}\200\200HHHH!HHHHHHHHHHHH!HHHHHHHHHHHHHHHHHHHH!HHHHHHHHHHHH!HHHHHHHHHHHHHHHH~}\200\200~}\200\200HHHH!HHHHHHHHHHHH!HHHHHHHHHHHHHHHHHHHH!HHHHHHHHHHHH!HHHHHHHHHHHHHHHH~}\200\200~}\200\200HHHH!HHHHHHHHHHHH!HHHHHHHHHHHHHHHHHHHH!HHHHHHHHHHHH!HHHHHHHHHHHHHHHH~}\200\200~}\200\200HHHH!HHHHHHHHHHHH!HHHHHHHHHHHHHHHHHHHH!HHHHHHHHHHHH!HHHHHHHHHHHHHHHH~}\200\200~}\200\200HHHH!HHHHHHHHHHHH!HHHHHHHHHHHHHHHHHHHH!HHHHHHHHHHHH!HHHHHHHHHHHHHHHH~}\200\200~}\200\200HHHH!HHHHHHHHHHHH!HHHHHHHHHHHHHHHHHHHH!HHHHHHHHHHHH!HHHHHHHHHHHHHHHH!" + "'", str2, "~}\200\200~}\200\200HHHH!HHHHHHHHHHHH!HHHHHHHHHHHHHHHHHHHH!HHHHHHHHHHHH!HHHHHHHHHHHHHHHH~}\200\200~}\200\200HHHH!HHHHHHHHHHHH!HHHHHHHHHHHHHHHHHHHH!HHHHHHHHHHHH!HHHHHHHHHHHHHHHH~}\200\200~}\200\200HHHH!HHHHHHHHHHHH!HHHHHHHHHHHHHHHHHHHH!HHHHHHHHHHHH!HHHHHHHHHHHHHHHH~}\200\200~}\200\200HHHH!HHHHHHHHHHHH!HHHHHHHHHHHHHHHHHHHH!HHHHHHHHHHHH!HHHHHHHHHHHHHHHH~}\200\200~}\200\200HHHH!HHHHHHHHHHHH!HHHHHHHHHHHHHHHHHHHH!HHHHHHHHHHHH!HHHHHHHHHHHHHHHH~}\200\200~}\200\200HHHH!HHHHHHHHHHHH!HHHHHHHHHHHHHHHHHHHH!HHHHHHHHHHHH!HHHHHHHHHHHHHHHH~}\200\200~}\200\200HHHH!HHHHHHHHHHHH!HHHHHHHHHHHHHHHHHHHH!HHHHHHHHHHHH!HHHHHHHHHHHHHHHH~}\200\200~}\200\200HHHH!HHHHHHHHHHHH!HHHHHHHHHHHHHHHHHHHH!HHHHHHHHHHHH!HHHHHHHHHHHHHHHH!");
    }

    @Test
    public void test12888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12888");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\u033c\u033d\u033f\u033f\u033c\u033d\u033f\u033f\253\253\u033c\u033d\u033f\u033f\u033c\u033d\u033f\u033f\253\253\u033c\u033d\u033f\u033f\u033c\u033d\u033f\u033f\253\253\u033c\u033d\u033f\u033f\u033c\u033d\u033f\u033f\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\u033c\u033d\u033f\u033f\u033c\u033d\u033f\u033f\253\253\u033c\u033d\u033f\u033f\u033c\u033d\u033f\u033f\253\253!", "null!!!null!!!nullnullnullnullnullnullnullnullnull!!!null!!!nullnullnullnullnullnullnullnull\225\225null!!!null!!!nullnullnullnullnullnullnullnullnull!!!null!!!nullnullnullnullnullnullnullnull\225\225null!!!null!!!nullnullnullnullnullnullnullnullnull!!!null!!!nullnullnullnullnullnullnullnull\225\225null!!!null!!!nullnullnullnullnullnullnullnullnull!!!null!!!nullnullnullnullnullnullnullnull\225\225null!!!null!!!nullnullnullnullnullnullnullnullnull!!!null!!!nullnullnullnullnullnullnullnull\225\225null!!!null!!!nullnullnullnullnullnullnullnullnull!!!null!!!nullnullnullnullnullnullnullnull\225\225null!!!null!!!nullnullnullnullnullnullnullnullnull!!!null!!!nullnullnullnullnullnullnullnull\225\225null!!!null!!!nullnullnullnullnullnullnullnullnull!!!null!!!nullnullnullnullnullnullnullnull\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\u033c\u033d\u033f\u033f\u033c\u033d\u033f\u033f\253\253\u033c\u033d\u033f\u033f\u033c\u033d\u033f\u033f\253\253\u033c\u033d\u033f\u033f\u033c\u033d\u033f\u033f\253\253\u033c\u033d\u033f\u033f\u033c\u033d\u033f\u033f\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\u033c\u033d\u033f\u033f\u033c\u033d\u033f\u033f\253\253\u033c\u033d\u033f\u033f\u033c\u033d\u033f\u033f\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\u033c\u033d\u033f\u033f\u033c\u033d\u033f\u033f\253\253\u033c\u033d\u033f\u033f\u033c\u033d\u033f\u033f\253\253\u033c\u033d\u033f\u033f\u033c\u033d\u033f\u033f\253\253\u033c\u033d\u033f\u033f\u033c\u033d\u033f\u033f\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\u033c\u033d\u033f\u033f\u033c\u033d\u033f\u033f\253\253\u033c\u033d\u033f\u033f\u033c\u033d\u033f\u033f\253\253!");
    }

    @Test
    public void test12889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12889");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "nulloprr!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12890");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253!", "\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253!" + "'", str2, "\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253!");
    }

    @Test
    public void test12891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12891");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\275\275\275\275\u0346\u0348\u0348!", "\200\200]]\200\200]]\200\200]]\200\200]]~}}^\200\200]]\200\200]]\200\200]]\200\200]]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\275\275\275\275\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\275\275\275\275\u0346\u0348\u0348!");
    }

    @Test
    public void test12892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12892");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253\254\256\256null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!\253\254\256\256null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!", "F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!!F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!!F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!!F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!!F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\253\254\256\256nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!" + "'", str2, "\253\254\256\256nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\253\254\256\256nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!");
    }

    @Test
    public void test12893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12893");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("U}}}U}}}U}}}U}}}~U}}}U}}}U}}}U}}}U}}}U}}}~U}}}U}}}!!U}}}U}}}U}}}U}}}~U}}}U}}}U}}}U}}}U}}}U}}}~U}}}U}}}!!U}}}U}}}U}}}U}}}~U}}}U}}}U}}}U}}}U}}}U}}}~U}}}U}}}U}}}U}}}U}}}U}}}~U}}}U}}}U}}}U}}}U}}}U}}}~U}}}U}}}!!U}}}U}}}U}}}U}}}~U}}}U}}}U}}}U}}}U}}}U}}}~U}}}U}}}!!U}}}U}}}U}}}U}}}~U}}}U}}}U}}}U}}}U}}}U}}}~U}}}U}}}!", "!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150}}}!" + "'", str2, "\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150}}}!");
    }

    @Test
    public void test12894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12894");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!\236\276\276!!!!\236\276\276!!!!!!\236\276\276!!!!\236\276\276!!!!!!\236\276\276!!!!\236\276\276!!!!\236\276\276!!!!\236\276\276!!!!!!\236\276\276!!!!\236\276\276!!!!!!\236\276\276!!!!\236\276\276!", "JILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILLJILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILL!!JILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILLJILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILL!!JILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILLJILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILLJILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILLJILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILL!!JILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILLJILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILL!!JILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILLJILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!\236\276\276!!!!\236\276\276!!!!!!\236\276\276!!!!\236\276\276!!!!!!\236\276\276!!!!\236\276\276!!!!\236\276\276!!!!\236\276\276!!!!!!\236\276\276!!!!\236\276\276!!!!!!\236\276\276!!!!\236\276\276!" + "'", str2, "!!!!\236\276\276!!!!\236\276\276!!!!!!\236\276\276!!!!\236\276\276!!!!!!\236\276\276!!!!\236\276\276!!!!\236\276\276!!!!\236\276\276!!!!!!\236\276\276!!!!\236\276\276!!!!!!\236\276\276!!!!\236\276\276!");
    }

    @Test
    public void test12895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12895");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~TT!~TT!!!~TT!~TT!!!~TT!~TT!~TT!~TT!!!~TT!~TT!!!~TT!~TT!", "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fanullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~LL!~LL!!!~LL!~LL!!!~LL!~LL!~LL!~LL!!!~LL!~LL!!!~LL!~LL!" + "'", str2, "!~LL!~LL!!!~LL!~LL!!!~LL!~LL!~LL!~LL!!!~LL!~LL!!!~LL!~LL!");
    }

    @Test
    public void test12896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12896");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!", "\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!" + "'", str2, "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!");
    }

    @Test
    public void test12897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12897");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!!!!", "UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!!!!" + "'", str2, "N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!!!!");
    }

    @Test
    public void test12898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12898");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!", "\u0245\u0246\u0248\u0248\253\253\253\200\u0245\u0246\u0248\u0248\253\253\253]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test12899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12899");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u012a\u012aL!!!!\200\u012a\u012aL!!!!\200\u012a\u012a\u012a\u012a\u012a\u012aL!!!!\200\u012a\u012aL!!!!\200\u012a\u012a\u012a\u012a\u012a\u012aL!!!!\200\u012a\u012aL!!!!\200\u012a\u012a\u012a\u012a\u012a\u012aL!!!!\200\u012a\u012aL!!!!\200\u012a\u012a\u012a\u012a\u012a\u012aL!!!!\200\u012a\u012aL!!!!\200\u012a\u012a\u012a\u012a\u012a\u012aL!!!!\200\u012a\u012aL!!!!\200\u012a\u012a\u012a\u012a\u012a\u012aL!!!!\200\u012a\u012aL!!!!\200\u012a\u012a\u012a\u012a\u012a\u012aL!!!!\200\u012a\u012aL!!!!\200\u012a\u012a\u012a\u012a\u012a\u012aL!!!!\200\u012a\u012aL!!!!\200\u012a\u012a\u012a\u012a\u012a\u012aL!!!!\200\u012a\u012aL!!!!\200\u012a\u012a\u012a\u012a\u012a\u012aL!!!!\200\u012a\u012aL!!!!\200\u012a\u012a\u012a\u012a\u012a\u012aL!!!!\200\u012a\u012aL!!!!\200\u012a\u012a\u012a\u012aL!!!!!", "NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0148\u0148!!!!\200\u0148\u0148!!!!\200\u0148\u0148\u0148\u0148\u0148\u0148!!!!\200\u0148\u0148!!!!\200\u0148\u0148\u0148\u0148\u0148\u0148!!!!\200\u0148\u0148!!!!\200\u0148\u0148\u0148\u0148\u0148\u0148!!!!\200\u0148\u0148!!!!\200\u0148\u0148\u0148\u0148\u0148\u0148!!!!\200\u0148\u0148!!!!\200\u0148\u0148\u0148\u0148\u0148\u0148!!!!\200\u0148\u0148!!!!\200\u0148\u0148\u0148\u0148\u0148\u0148!!!!\200\u0148\u0148!!!!\200\u0148\u0148\u0148\u0148\u0148\u0148!!!!\200\u0148\u0148!!!!\200\u0148\u0148\u0148\u0148\u0148\u0148!!!!\200\u0148\u0148!!!!\200\u0148\u0148\u0148\u0148\u0148\u0148!!!!\200\u0148\u0148!!!!\200\u0148\u0148\u0148\u0148\u0148\u0148!!!!\200\u0148\u0148!!!!\200\u0148\u0148\u0148\u0148\u0148\u0148!!!!\200\u0148\u0148!!!!\200\u0148\u0148\u0148\u0148!!!!!" + "'", str2, "\u0148\u0148!!!!\200\u0148\u0148!!!!\200\u0148\u0148\u0148\u0148\u0148\u0148!!!!\200\u0148\u0148!!!!\200\u0148\u0148\u0148\u0148\u0148\u0148!!!!\200\u0148\u0148!!!!\200\u0148\u0148\u0148\u0148\u0148\u0148!!!!\200\u0148\u0148!!!!\200\u0148\u0148\u0148\u0148\u0148\u0148!!!!\200\u0148\u0148!!!!\200\u0148\u0148\u0148\u0148\u0148\u0148!!!!\200\u0148\u0148!!!!\200\u0148\u0148\u0148\u0148\u0148\u0148!!!!\200\u0148\u0148!!!!\200\u0148\u0148\u0148\u0148\u0148\u0148!!!!\200\u0148\u0148!!!!\200\u0148\u0148\u0148\u0148\u0148\u0148!!!!\200\u0148\u0148!!!!\200\u0148\u0148\u0148\u0148\u0148\u0148!!!!\200\u0148\u0148!!!!\200\u0148\u0148\u0148\u0148\u0148\u0148!!!!\200\u0148\u0148!!!!\200\u0148\u0148\u0148\u0148\u0148\u0148!!!!\200\u0148\u0148!!!!\200\u0148\u0148\u0148\u0148!!!!!");
    }

    @Test
    public void test12900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12900");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "NNNNNNNNNNNNNNNN!NNN!NNN!NNN!NNNNNNNNNNNNNNNNNNN!NNN!NNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test12901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12901");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!", "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUU\220!!\200~~LLUU\220!!\200~~LLUU\220!!LLUU\220!!LLUU\220!!\200~~LLUU\220!!\200~~LLUU\220!!LLUU\220!!!!LLUU\220!!\200~~LLUU\220!!\200~~LLUU\220!!LLUU\220!!LLUU\220!!\200~~LLUU\220!!\200~~LLUU\220!!LLUU\220!!!!LLUU\220!!\200~~LLUU\220!!\200~~LLUU\220!!LLUU\220!!LLUU\220!!\200~~LLUU\220!!\200~~LLUU\220!!LLUU\220!!LLUU\220!!\200~~LLUU\220!!\200~~LLUU\220!!LLUU\220!!LLUU\220!!\200~~LLUU\220!!\200~~LLUU\220!!LLUU\220!!!!LLUU\220!!\200~~LLUU\220!!\200~~LLUU\220!!LLUU\220!!LLUU\220!!\200~~LLUU\220!!\200~~LLUU\220!!LLUU\220!!!!LLUU\220!!\200~~LLUU\220!!\200~~LLUU\220!!LLUU\220!!LLUU\220!!\200~~LLUU\220!!\200~~LLUU\220!!LLUU\220!!!" + "'", str2, "LLUU\220!!\200~~LLUU\220!!\200~~LLUU\220!!LLUU\220!!LLUU\220!!\200~~LLUU\220!!\200~~LLUU\220!!LLUU\220!!!!LLUU\220!!\200~~LLUU\220!!\200~~LLUU\220!!LLUU\220!!LLUU\220!!\200~~LLUU\220!!\200~~LLUU\220!!LLUU\220!!!!LLUU\220!!\200~~LLUU\220!!\200~~LLUU\220!!LLUU\220!!LLUU\220!!\200~~LLUU\220!!\200~~LLUU\220!!LLUU\220!!LLUU\220!!\200~~LLUU\220!!\200~~LLUU\220!!LLUU\220!!LLUU\220!!\200~~LLUU\220!!\200~~LLUU\220!!LLUU\220!!!!LLUU\220!!\200~~LLUU\220!!\200~~LLUU\220!!LLUU\220!!LLUU\220!!\200~~LLUU\220!!\200~~LLUU\220!!LLUU\220!!!!LLUU\220!!\200~~LLUU\220!!\200~~LLUU\220!!LLUU\220!!LLUU\220!!\200~~LLUU\220!!\200~~LLUU\220!!LLUU\220!!!");
    }

    @Test
    public void test12902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12902");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull!", "\275\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\200\200\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\200\200\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\200\200\276\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\200\200\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``\230\u02d6\u02d6\230\u02d6\u02d6``\230\u02d6\u02d6\230\u02d6\u02d6``\230\u02d6\u02d6\230\u02d6\u02d6``\230\u02d6\u02d6\230\u02d6\u02d6``\230\u02d6\u02d6\230\u02d6\u02d6``\230\u02d6\u02d6\230\u02d6\u02d6``\230\u02d6\u02d6\230\u02d6\u02d6``\230\u02d6\u02d6\230\u02d6\u02d6!" + "'", str2, "``\230\u02d6\u02d6\230\u02d6\u02d6``\230\u02d6\u02d6\230\u02d6\u02d6``\230\u02d6\u02d6\230\u02d6\u02d6``\230\u02d6\u02d6\230\u02d6\u02d6``\230\u02d6\u02d6\230\u02d6\u02d6``\230\u02d6\u02d6\230\u02d6\u02d6``\230\u02d6\u02d6\230\u02d6\u02d6``\230\u02d6\u02d6\230\u02d6\u02d6!");
    }

    @Test
    public void test12903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12903");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~\200}}~\200}}~\200}}~\200}}\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254~\200}}~\200}}~\200}}~\200}}\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254!", "\u0366\u0365\u0368\u0368\254\254\254\254\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~\200}}~\200}}~\200}}~\200}}\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254~\200}}~\200}}~\200}}~\200}}\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254!" + "'", str2, "~\200}}~\200}}~\200}}~\200}}\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254~\200}}~\200}}~\200}}~\200}}\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254\270\267\254\254!");
    }

    @Test
    public void test12904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12904");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!", "!!!!!!!!!!!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!!!!!!!!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!");
    }

    @Test
    public void test12905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12905");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "}~!!!\200\200}~!!!\200\200}~!!!\200\200}~!!!\200\200~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~}~!!!\200\200}~!!!\200\200}~!!!\200\200}~!!!\200\200~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12906");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!!", "\u0366\u0365\u0368\u0368\u011c\u011e\u011e\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!!" + "'", str2, "`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!!");
    }

    @Test
    public void test12907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12907");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230\200}}`!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230]]!", "!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230\200}}`!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230]]!" + "'", str2, "!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230\200}}`!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230]]!");
    }

    @Test
    public void test12908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12908");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!", "!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!!LL!!LL!!LL!!LL\266\266~!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL\276!!LL!!LL!!LL!!LL\266\266~!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\276!!LL!!LL!!LL!!LL\266\266~!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL\276!!LL!!LL!!LL!!LL\266\266~!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\276!!LL!!LL!!LL!!LL\266\266~!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL\276!!LL!!LL!!LL!!LL\266\266~!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL\276!!LL!!LL!!LL!!LL\266\266~!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL\276!!LL!!LL!!LL!!LL\266\266~!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\276!!LL!!LL!!LL!!LL\266\266~!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL\276!!LL!!LL!!LL!!LL\266\266~!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\276!!LL!!LL!!LL!!LL\266\266~!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL\276!!LL!!LL!!LL!!LL\266\266~!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!" + "'", str2, "\276!!LL!!LL!!LL!!LL\266\266~!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL\276!!LL!!LL!!LL!!LL\266\266~!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\276!!LL!!LL!!LL!!LL\266\266~!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL\276!!LL!!LL!!LL!!LL\266\266~!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\276!!LL!!LL!!LL!!LL\266\266~!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL\276!!LL!!LL!!LL!!LL\266\266~!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL\276!!LL!!LL!!LL!!LL\266\266~!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL\276!!LL!!LL!!LL!!LL\266\266~!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\276!!LL!!LL!!LL!!LL\266\266~!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL\276!!LL!!LL!!LL!!LL\266\266~!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\276!!LL!!LL!!LL!!LL\266\266~!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL\276!!LL!!LL!!LL!!LL\266\266~!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!");
    }

    @Test
    public void test12909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12909");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullHnullnullnullHnullnull!!nullHnullnullnullHnullnull!!nullHnullnullnullHnullnull!!nullHnullnullnullHnullnull!!nullHnullnullnullHnullnull!!nullHnullnullnullHnullnull!!nullHnullnullnullHnullnull!!nullHnullnullnullHnullnull!!!", "nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NN\214\214LNN\214\214NN\214\214NN\214\214LNN\214\214NN\214\214!!NN\214\214LNN\214\214NN\214\214NN\214\214LNN\214\214NN\214\214!!NN\214\214LNN\214\214NN\214\214NN\214\214LNN\214\214NN\214\214!!NN\214\214LNN\214\214NN\214\214NN\214\214LNN\214\214NN\214\214!!NN\214\214LNN\214\214NN\214\214NN\214\214LNN\214\214NN\214\214!!NN\214\214LNN\214\214NN\214\214NN\214\214LNN\214\214NN\214\214!!NN\214\214LNN\214\214NN\214\214NN\214\214LNN\214\214NN\214\214!!NN\214\214LNN\214\214NN\214\214NN\214\214LNN\214\214NN\214\214!!!" + "'", str2, "NN\214\214LNN\214\214NN\214\214NN\214\214LNN\214\214NN\214\214!!NN\214\214LNN\214\214NN\214\214NN\214\214LNN\214\214NN\214\214!!NN\214\214LNN\214\214NN\214\214NN\214\214LNN\214\214NN\214\214!!NN\214\214LNN\214\214NN\214\214NN\214\214LNN\214\214NN\214\214!!NN\214\214LNN\214\214NN\214\214NN\214\214LNN\214\214NN\214\214!!NN\214\214LNN\214\214NN\214\214NN\214\214LNN\214\214NN\214\214!!NN\214\214LNN\214\214NN\214\214NN\214\214LNN\214\214NN\214\214!!NN\214\214LNN\214\214NN\214\214NN\214\214LNN\214\214NN\214\214!!!");
    }

    @Test
    public void test12910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12910");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256!", "\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256!" + "'", str2, "\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256!");
    }

    @Test
    public void test12911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12911");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230\200}}`UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230]]!", "rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RR^^\225\230\230RR^^\225\230\230RR^^\225\230\230RR^^\225\230\230\200}}`RR^^\225\230\230RR^^\225\230\230RR^^\225\230\230RR^^\225\230\230]]!" + "'", str2, "RR^^\225\230\230RR^^\225\230\230RR^^\225\230\230RR^^\225\230\230\200}}`RR^^\225\230\230RR^^\225\230\230RR^^\225\230\230RR^^\225\230\230]]!");
    }

    @Test
    public void test12912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12912");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "N\276LLN\276LL}}N\276LLN\276LL}}!!N\276LLN\276LL}}N\276LLN\276LL}}!!N\276LLN\276LL}}N\276LLN\276LL}}!!N\276LLN\276LL}}N\276LLN\276LL}}!!N\276LLN\276LL}}N\276LLN\276LL}}!!N\276LLN\276LL}}N\276LLN\276LL}}!!N\276LLN\276LL}}N\276LLN\276LL}}!!N\276LLN\276LL}}N\276LLN\276LL}}!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12913");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276!!!\276!!!\276!!!\276!!!\276!!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!!!\276!!!\276!!!\276!!!\276!!!!" + "'", str2, "\276!!!\276!!!\276!!!\276!!!\276!!!!");
    }

    @Test
    public void test12914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12914");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256!", "l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn!!l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\242null\237\237\242null\237\237\253\254\256\256\253\254\256\256\242null\237\237\242null\237\237\253\254\256\256\253\254\256\256\242null\237\237\242null\237\237\253\254\256\256\253\254\256\256\242null\237\237\242null\237\237\253\254\256\256\253\254\256\256\242null\237\237\242null\237\237\253\254\256\256\253\254\256\256\242null\237\237\242null\237\237\253\254\256\256\253\254\256\256\242null\237\237\242null\237\237\253\254\256\256\253\254\256\256\242null\237\237\242null\237\237\253\254\256\256\253\254\256\256!" + "'", str2, "\242null\237\237\242null\237\237\253\254\256\256\253\254\256\256\242null\237\237\242null\237\237\253\254\256\256\253\254\256\256\242null\237\237\242null\237\237\253\254\256\256\253\254\256\256\242null\237\237\242null\237\237\253\254\256\256\253\254\256\256\242null\237\237\242null\237\237\253\254\256\256\253\254\256\256\242null\237\237\242null\237\237\253\254\256\256\253\254\256\256\242null\237\237\242null\237\237\253\254\256\256\253\254\256\256\242null\237\237\242null\237\237\253\254\256\256\253\254\256\256!");
    }

    @Test
    public void test12915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12915");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UULLUULL!", "NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLL!" + "'", str2, "LLLLLLLL!");
    }

    @Test
    public void test12916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12916");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!~UU!~UU!!!~UU!~UU!!!~UU!~UU!~UU!~UU!!!~UU!~UU!!!~UU!~UU!", "}~\200\200}~\200\200\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be}~\200\200}~\200\200\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!" + "'", str2, "!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!");
    }

    @Test
    public void test12917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12917");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\226\226~~~~~\226\226~~~~~~~\226\226~~~~~\226\226~~~~~~~\226\226~~~~~\226\226~~~~~~~\226\226~~~~~\226\226~~~~~~~\226\226~~~~~\226\226~~~~~~~\226\226~~~~~\226\226~~~~~~~\226\226~~~~~\226\226~~~~~~~\226\226~~~~~\226\226~~~~~~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12918");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]!E!!!E!!!E!!!E!!!E!!]]!E!!!E!!]]!E!!!E!!]]!E!!!E!!]]]!E!!!E!!!E!!!E!!!E!!]]!E!!!E!!]]!", "\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!null!!!null!!!null!!!null!!!null!!]]!null!!!null!!]]!null!!!null!!]]!null!!!null!!]]]!null!!!null!!!null!!!null!!!null!!]]!null!!!null!!]]!" + "'", str2, "]!null!!!null!!!null!!!null!!!null!!]]!null!!!null!!]]!null!!!null!!]]!null!!!null!!]]]!null!!!null!!!null!!!null!!!null!!]]!null!!!null!!]]!");
    }

    @Test
    public void test12919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12919");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\213\214\216\216\276\276\276\213\214\216\216\276\276\276\213\214\216\216\276\276\276\213\214\216\216\276\276\276\213\214\216\216\276\276\276\213\214\216\216\276\276\276\213\214\216\216\276\276\276\213\214\216\216\276\276\276!", "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\213\214\216\216\276\276\276\213\214\216\216\276\276\276\213\214\216\216\276\276\276\213\214\216\216\276\276\276\213\214\216\216\276\276\276\213\214\216\216\276\276\276\213\214\216\216\276\276\276\213\214\216\216\276\276\276!" + "'", str2, "\213\214\216\216\276\276\276\213\214\216\216\276\276\276\213\214\216\216\276\276\276\213\214\216\216\276\276\276\213\214\216\216\276\276\276\213\214\216\216\276\276\276\213\214\216\216\276\276\276\213\214\216\216\276\276\276!");
    }

    @Test
    public void test12920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12920");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253uruuuruu\253\253uruuuruu\253\253uruuuruu\253\253uruuuruu\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253uruuuruu\253\253uruuuruu\253\253!", "H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!");
    }

    @Test
    public void test12921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12921");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullijllijllijllijllnullnullnullnullijllijll!", "]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02be\u02be\u02be\u02be!" + "'", str2, "\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02be\u02be\u02be\u02be!");
    }

    @Test
    public void test12922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12922");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LNLLLNLL\253\253LNLLLNLL\253\253LNLLLNLL\253\253LNLLLNLL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LNLLLNLL\253\253LNLLLNLL\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!" + "'", str2, "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!");
    }

    @Test
    public void test12923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12923");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!~N^}}N^}}!!!!~N^}}N^}}!!!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!!!~N^}}N^}}!!!!~N^}}N^}}!!!", "null\276\276\276null\276\276\276null\276\276\276null\276\276\276null\276\276\276null\276\276\276null\276\276\276null\276\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~r^}}r^}}!!!!~r^}}r^}}!!!!!!~r^}}r^}}!!!!~r^}}r^}}!!!!!!~r^}}r^}}!!!!~r^}}r^}}!!!!~r^}}r^}}!!!!~r^}}r^}}!!!!!!~r^}}r^}}!!!!~r^}}r^}}!!!!!!~r^}}r^}}!!!!~r^}}r^}}!!!" + "'", str2, "!!~r^}}r^}}!!!!~r^}}r^}}!!!!!!~r^}}r^}}!!!!~r^}}r^}}!!!!!!~r^}}r^}}!!!!~r^}}r^}}!!!!~r^}}r^}}!!!!~r^}}r^}}!!!!!!~r^}}r^}}!!!!~r^}}r^}}!!!!!!~r^}}r^}}!!!!~r^}}r^}}!!!");
    }

    @Test
    public void test12924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12924");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!", "N\200\200\200N\200\200\256\254\254N\200\200\200N\200\200\256\254\254!!N\200\200\200N\200\200\256\254\254N\200\200\200N\200\200\256\254\254!!N\200\200\200N\200\200\256\254\254N\200\200\200N\200\200\256\254\254!!N\200\200\200N\200\200\256\254\254N\200\200\200N\200\200\256\254\254!!N\200\200\200N\200\200\256\254\254N\200\200\200N\200\200\256\254\254!!N\200\200\200N\200\200\256\254\254N\200\200\200N\200\200\256\254\254!!N\200\200\200N\200\200\256\254\254N\200\200\200N\200\200\256\254\254!!N\200\200\200N\200\200\256\254\254N\200\200\200N\200\200\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!" + "'", str2, "!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~!`~~~~!`~~!`~~~~!");
    }

    @Test
    public void test12925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12925");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!!!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!!!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!!!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!!!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!", "`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!" + "'", str2, "!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!");
    }

    @Test
    public void test12926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12926");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!!", "\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!!" + "'", str2, "\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!!");
    }

    @Test
    public void test12927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12927");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NULLLNUULNUULNUULNUUNULLLNUULNUU!", "\u0366\u0365\u0368\u0368\u03c0\u03c0\u03c0\u03c0!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12928");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118!", "LL]~~LLLL]~~LLLL]~~LLLL]~~LL!LL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LL!LL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LL!LL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LL!LL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LL!LL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LL!LL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LL!LL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LL!LL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!" + "'", str2, "!!!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!");
    }

    @Test
    public void test12929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12929");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a!!!", "}!\200\200}!\200\200}!\200\200}!\200\200\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215}!\200\200}!\200\200}!\200\200}!\200\200\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test12930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12930");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL!", "nullnullnullnull\266\267\271\271\266\267\271\271!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200UULLUULL~}\200\200~}\200\200UULLUULL~}\200\200~}\200\200UULLUULL~}\200\200~}\200\200UULLUULL~}\200\200~}\200\200UULLUULL~}\200\200~}\200\200UULLUULL~}\200\200~}\200\200UULLUULL~}\200\200~}\200\200UULLUULL!" + "'", str2, "~}\200\200~}\200\200UULLUULL~}\200\200~}\200\200UULLUULL~}\200\200~}\200\200UULLUULL~}\200\200~}\200\200UULLUULL~}\200\200~}\200\200UULLUULL~}\200\200~}\200\200UULLUULL~}\200\200~}\200\200UULLUULL~}\200\200~}\200\200UULLUULL!");
    }

    @Test
    public void test12931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12931");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}}!", "]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}}}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}}!" + "'", str2, "}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}}}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}}!");
    }

    @Test
    public void test12932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12932");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0245\u0246\u0248\u0248\253\253\253\200\u0245\u0246\u0248\u0248\253\253\253]]!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\253\253\253\200}}`nullnullnullnull\253\253\253]]!" + "'", str2, "nullnullnullnull\253\253\253\200}}`nullnullnullnull\253\253\253]]!");
    }

    @Test
    public void test12933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12933");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!!", "nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!!" + "'", str2, "\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!!");
    }

    @Test
    public void test12934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12934");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!!", "\270null\272\272\270null\272\272\270null\272\272!!\270null\272\272\270null\272\272!!\270null\272\272\270null\272\272!!\270null\272\272\270null\272\272\270null\272\272!!\270null\272\272\270null\272\272!!\270null\272\272\270null\272\272!!\270null\272\272\270null\272\272\270null\272\272!!\270null\272\272\270null\272\272!!\270null\272\272\270null\272\272!!\270null\272\272\270null\272\272\270null\272\272!!\270null\272\272\270null\272\272!!\270null\272\272\270null\272\272!!\270null\272\272\270null\272\272\270null\272\272!!\270null\272\272\270null\272\272!!\270null\272\272\270null\272\272!!\270null\272\272\270null\272\272\270null\272\272!!\270null\272\272\270null\272\272!!\270null\272\272\270null\272\272!!\270null\272\272\270null\272\272\270null\272\272!!\270null\272\272\270null\272\272!!\270null\272\272\270null\272\272!!\270null\272\272\270null\272\272\270null\272\272!!\270null\272\272\270null\272\272!!\270null\272\272\270null\272\272!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!!" + "'", str2, "\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!!");
    }

    @Test
    public void test12935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12935");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLNNNNNNLNNNNNNNNLNNNNNNLNNNNNNNNLNNNNNNLNNNNNNNNLNNNNNNLNNNNNNNNLNNNNNNLNNNNNNNNLNNNNNNLNNNNNNNNLNNNNNNLNNNNNNNNLNNNNNNLNNNNNNN!", "\275\u0176\u0178\u0178\u0176\u0178\u0178\u0176\u0178\u0178\276\u0176\u0178\u0178\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Y\\YYYYYY\\YYYYYYYY\\YYYYYY\\YYYYYYYY\\YYYYYY\\YYYYYYYY\\YYYYYY\\YYYYYYYY\\YYYYYY\\YYYYYYYY\\YYYYYY\\YYYYYYYY\\YYYYYY\\YYYYYYYY\\YYYYYY\\YYYYYYY!" + "'", str2, "Y\\YYYYYY\\YYYYYYYY\\YYYYYY\\YYYYYYYY\\YYYYYY\\YYYYYYYY\\YYYYYY\\YYYYYYYY\\YYYYYY\\YYYYYYYY\\YYYYYY\\YYYYYYYY\\YYYYYY\\YYYYYYYY\\YYYYYY\\YYYYYYY!");
    }

    @Test
    public void test12936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12936");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("FFFFFFFF!!FFFFFFFF!!!", "\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test12937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12937");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!!", "\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L\276\275\275LUNN!LUNNLUNNLUNNLUNNL\276\275\275LUNN!LUNNLUNNLUNNLUNN!!L\276\275\275LUNN!LUNNLUNNLUNNLUNNL\276\275\275LUNN!LUNNLUNNLUNNLUNN!!L\276\275\275LUNN!LUNNLUNNLUNNLUNNL\276\275\275LUNN!LUNNLUNNLUNNLUNN!!L\276\275\275LUNN!LUNNLUNNLUNNLUNNL\276\275\275LUNN!LUNNLUNNLUNNLUNN!!L\276\275\275LUNN!LUNNLUNNLUNNLUNNL\276\275\275LUNN!LUNNLUNNLUNNLUNN!!L\276\275\275LUNN!LUNNLUNNLUNNLUNNL\276\275\275LUNN!LUNNLUNNLUNNLUNN!!L\276\275\275LUNN!LUNNLUNNLUNNLUNNL\276\275\275LUNN!LUNNLUNNLUNNLUNN!!L\276\275\275LUNN!LUNNLUNNLUNNLUNNL\276\275\275LUNN!LUNNLUNNLUNNLUNN!!!" + "'", str2, "L\276\275\275LUNN!LUNNLUNNLUNNLUNNL\276\275\275LUNN!LUNNLUNNLUNNLUNN!!L\276\275\275LUNN!LUNNLUNNLUNNLUNNL\276\275\275LUNN!LUNNLUNNLUNNLUNN!!L\276\275\275LUNN!LUNNLUNNLUNNLUNNL\276\275\275LUNN!LUNNLUNNLUNNLUNN!!L\276\275\275LUNN!LUNNLUNNLUNNLUNNL\276\275\275LUNN!LUNNLUNNLUNNLUNN!!L\276\275\275LUNN!LUNNLUNNLUNNLUNNL\276\275\275LUNN!LUNNLUNNLUNNLUNN!!L\276\275\275LUNN!LUNNLUNNLUNNLUNNL\276\275\275LUNN!LUNNLUNNLUNNLUNN!!L\276\275\275LUNN!LUNNLUNNLUNNLUNNL\276\275\275LUNN!LUNNLUNNLUNNLUNN!!L\276\275\275LUNN!LUNNLUNNLUNNLUNNL\276\275\275LUNN!LUNNLUNNLUNNLUNN!!!");
    }

    @Test
    public void test12938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12938");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullijllnullnullnullijllnullnull\253\253nullijllnullnullnullijllnullnull\253\253nullijllnullnullnullijllnullnull\253\253nullijllnullnullnullijllnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullijllnullnullnullijllnullnull\253\253nullijllnullnullnullijllnullnull\253\253!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253!");
    }

    @Test
    public void test12939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12939");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275null~}}null~}}\200\200null~}}null~}}\200\200null~}}null~}}\200\200\276null~}}null~}}\200\200\275\275!", "JILLJILLJILLJILLJILLJILLJILLJILL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275ijll~}}ijll~}}\200\200ijll~}}ijll~}}\200\200ijll~}}ijll~}}\200\200\276ijll~}}ijll~}}\200\200\275\275!" + "'", str2, "\275ijll~}}ijll~}}\200\200ijll~}}ijll~}}\200\200ijll~}}ijll~}}\200\200\276ijll~}}ijll~}}\200\200\275\275!");
    }

    @Test
    public void test12940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12940");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256!", "LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u016a\u016a\u016a\u016a\253\254\256\256\253\254\256\256\u016a\u016a\u016a\u016a\253\254\256\256\253\254\256\256\u016a\u016a\u016a\u016a\253\254\256\256\253\254\256\256\u016a\u016a\u016a\u016a\253\254\256\256\253\254\256\256\u016a\u016a\u016a\u016a\253\254\256\256\253\254\256\256\u016a\u016a\u016a\u016a\253\254\256\256\253\254\256\256\u016a\u016a\u016a\u016a\253\254\256\256\253\254\256\256\u016a\u016a\u016a\u016a\253\254\256\256\253\254\256\256!" + "'", str2, "\u016a\u016a\u016a\u016a\253\254\256\256\253\254\256\256\u016a\u016a\u016a\u016a\253\254\256\256\253\254\256\256\u016a\u016a\u016a\u016a\253\254\256\256\253\254\256\256\u016a\u016a\u016a\u016a\253\254\256\256\253\254\256\256\u016a\u016a\u016a\u016a\253\254\256\256\253\254\256\256\u016a\u016a\u016a\u016a\253\254\256\256\253\254\256\256\u016a\u016a\u016a\u016a\253\254\256\256\253\254\256\256\u016a\u016a\u016a\u016a\253\254\256\256\253\254\256\256!");
    }

    @Test
    public void test12941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12941");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLNLLL!!NLLL~~NLLLNLLL!!NLLL~~NLLLNLLL!!NLLL~~NLLLNLLL!!NLLL~~NLLLNLLL!!NLLL~~NLLLNLLL!!NLLL~~NLLLNLLL!!NLLL~~NLLLNLLL!!NLLL~~!", "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b~~!" + "'", str2, "\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b\u012b~~!");
    }

    @Test
    public void test12942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12942");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!", "!!!nulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleff!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!" + "'", str2, "!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!");
    }

    @Test
    public void test12943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12943");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230\200\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230]]!", "]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230\200\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230]]!" + "'", str2, "\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230\200\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230]]!");
    }

    @Test
    public void test12944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12944");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUU!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253]]]]]]]]\253\253]]]]]]]]\253\253]]]]]]]]\253\253]]]]]]]]\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253]]]]]]]]\253\253]]]]]]]]\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12945");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214!", "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8ULLLULLLULLLULLLULLLULLLULLLULLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02d6\u02d6UULULLU\214\214LULLU\214\214\u02d6\u02d6UULULLU\214\214LULLU\214\214\u02d6\u02d6UULULLU\214\214LULLU\214\214\u02d6\u02d6UULULLU\214\214LULLU\214\214\u02d6\u02d6UULULLU\214\214LULLU\214\214\u02d6\u02d6UULULLU\214\214LULLU\214\214\u02d6\u02d6UULULLU\214\214LULLU\214\214\u02d6\u02d6UULULLU\214\214LULLU\214\214!" + "'", str2, "\u02d6\u02d6UULULLU\214\214LULLU\214\214\u02d6\u02d6UULULLU\214\214LULLU\214\214\u02d6\u02d6UULULLU\214\214LULLU\214\214\u02d6\u02d6UULULLU\214\214LULLU\214\214\u02d6\u02d6UULULLU\214\214LULLU\214\214\u02d6\u02d6UULULLU\214\214LULLU\214\214\u02d6\u02d6UULULLU\214\214LULLU\214\214\u02d6\u02d6UULULLU\214\214LULLU\214\214!");
    }

    @Test
    public void test12946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12946");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EHHH\200}}`EHHH]]!", "\276\276!nullPP!nullPP!nullPP!nullPP\276!nullPP!nullPP!nullPP!nullPP!nullPP!nullPP\276!nullPP!nullPP\276\276!nullPP!nullPP!nullPP!nullPP\276!nullPP!nullPP!nullPP!nullPP!nullPP!nullPP\276!nullPP!nullPP\276\276!nullPP!nullPP!nullPP!nullPP\276!nullPP!nullPP!nullPP!nullPP!nullPP!nullPP\276!nullPP!nullPP\276\276!nullPP!nullPP!nullPP!nullPP\276!nullPP!nullPP!nullPP!nullPP!nullPP!nullPP\276!nullPP!nullPP\276\276!nullPP!nullPP!nullPP!nullPP\276!nullPP!nullPP!nullPP!nullPP!nullPP!nullPP\276!nullPP!nullPP\276\276!nullPP!nullPP!nullPP!nullPP\276!nullPP!nullPP!nullPP!nullPP!nullPP!nullPP\276!nullPP!nullPP\276\276!nullPP!nullPP!nullPP!nullPP\276!nullPP!nullPP!nullPP!nullPP!nullPP!nullPP\276!nullPP!nullPP\276\276!nullPP!nullPP!nullPP!nullPP\276!nullPP!nullPP!nullPP!nullPP!nullPP!nullPP\276!nullPP!nullPP!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UPPP\200}}`UPPP]]!" + "'", str2, "UPPP\200}}`UPPP]]!");
    }

    @Test
    public void test12947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12947");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NULLLLLNULLLLLNULLLLLNULLLLLNULLLLLNULLLLLNULLLLLNULLLLL!" + "'", str2, "NULLLLLNULLLLLNULLLLLNULLLLLNULLLLLNULLLLLNULLLLLNULLLLL!");
    }

    @Test
    public void test12948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12948");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNNN!NNN!NNN!NNN!NNNNNNN!NNN!NNN!", "!LN!!LN!!LN!!!LN!!LN!!LN!!!LN!!LN!!LN!!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!!LN!!LN!!LN!!!LN!!LN!!LN!!!LN!!LN!!LN!!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test12949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12949");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014eLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12950");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118!", "\u0366\u0365\u0368\u0368!!\276\276\230!\215\215\230!\215\215\230!\215\215!!\276\276\230!\215\215\230!\215\215\230!\215\215!!!!\276\276\230!\215\215\230!\215\215\230!\215\215!!\276\276\230!\215\215\230!\215\215\230!\215\215!!!!\276\276\230!\215\215\230!\215\215\230!\215\215!!\276\276\230!\215\215\230!\215\215\230!\215\215!!!!\276\276\230!\215\215\230!\215\215\230!\215\215!!\276\276\230!\215\215\230!\215\215\230!\215\215\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12951");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~~~~~~~~~~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~~~~~~~~~~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~~~~~~~~~~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~~~~~~~~~~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!", "]NNN]NNN]NNN]NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN]NNN]NNN]NNN]NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~~~~~~~~~~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~~~~~~~~~~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~~~~~~~~~~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~~~~~~~~~~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!" + "'", str2, "!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~~~~~~~~~~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~~~~~~~~~~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~~~~~~~~~~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~~~~~~~~~~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!");
    }

    @Test
    public void test12952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12952");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253!", "RTRRRTRR!!RTRRRTRR!!RTRRRTRRRTRRRTRR!!RTRRRTRR!!RTRRRTRR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253RRTTRRTT\253\253RRTTRRTT\253\253RRTTRRTT\253\253RRTTRRTT\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253RRTTRRTT\253\253RRTTRRTT\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253RRTTRRTT\253\253RRTTRRTT\253\253RRTTRRTT\253\253RRTTRRTT\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253RRTTRRTT\253\253RRTTRRTT\253\253!");
    }

    @Test
    public void test12953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12953");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368!\253\253\u0366\u0366\253\253\u0366\u0366\253\253\u0366\u0366\u0346\u0348\u0348!", "UULLUULLUULLUULLUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!\253\253\u0366\u0366\253\253\u0366\u0366\253\253\u0366\u0366\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!\253\253\u0366\u0366\253\253\u0366\u0366\253\253\u0366\u0366\u0346\u0348\u0348!");
    }

    @Test
    public void test12954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12954");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348!", "\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271~}}^\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test12955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12955");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~~~!null~~!null~~~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~~~!null~~!null~~~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~~~!null~~!null~~~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~~~!null~~!null~~~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~~~!null~~!null~~~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~~~!null~~!null~~~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~~~!null~~!null~~~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~!null~~~~!null~~!null~~~~!", "LLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~~~!llll~~!llll~~~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~~~!llll~~!llll~~~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~~~!llll~~!llll~~~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~~~!llll~~!llll~~~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~~~!llll~~!llll~~~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~~~!llll~~!llll~~~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~~~!llll~~!llll~~~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~~~!llll~~!llll~~~~!" + "'", str2, "!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~~~!llll~~!llll~~~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~~~!llll~~!llll~~~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~~~!llll~~!llll~~~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~~~!llll~~!llll~~~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~~~!llll~~!llll~~~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~~~!llll~~!llll~~~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~~~!llll~~!llll~~~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~!llll~~~~!llll~~!llll~~~~!");
    }

    @Test
    public void test12956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12956");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~!", "\u017e\u017e\u017e\u017e\u017e\u017enullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~!" + "'", str2, "\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~!");
    }

    @Test
    public void test12957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12957");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\352\351\354\354\352\351\354\354!", "\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12958");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\342\u0348\u0346\u0346!", "\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260!!!\255\256\260\260!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test12959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12959");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHHUELLUELLUELLUELLUELLUELLUELLUELLFHHHFHHH!", "nullnull~~~~~nullnull~~~~~~~nullnull~~~~~nullnull~~~~~~~nullnull~~~~~nullnull~~~~~~~nullnull~~~~~nullnull~~~~~~~nullnull~~~~~nullnull~~~~~~~nullnull~~~~~nullnull~~~~~~~nullnull~~~~~nullnull~~~~~~~nullnull~~~~~nullnull~~~~~~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LN~~LN~~LN~~LN~~LN~~LN~~LN~~LN~~ULLLULLLLN~~LN~~LN~~LN~~LN~~LN~~LN~~LN~~ULLLULLLLN~~LN~~LN~~LN~~LN~~LN~~LN~~LN~~ULLLULLLLN~~LN~~LN~~LN~~LN~~LN~~LN~~LN~~ULLLULLLLN~~LN~~LN~~LN~~LN~~LN~~LN~~LN~~ULLLULLLLN~~LN~~LN~~LN~~LN~~LN~~LN~~LN~~ULLLULLLLN~~LN~~LN~~LN~~LN~~LN~~LN~~LN~~ULLLULLLLN~~LN~~LN~~LN~~LN~~LN~~LN~~LN~~ULLLULLL!" + "'", str2, "LN~~LN~~LN~~LN~~LN~~LN~~LN~~LN~~ULLLULLLLN~~LN~~LN~~LN~~LN~~LN~~LN~~LN~~ULLLULLLLN~~LN~~LN~~LN~~LN~~LN~~LN~~LN~~ULLLULLLLN~~LN~~LN~~LN~~LN~~LN~~LN~~LN~~ULLLULLLLN~~LN~~LN~~LN~~LN~~LN~~LN~~LN~~ULLLULLLLN~~LN~~LN~~LN~~LN~~LN~~LN~~LN~~ULLLULLLLN~~LN~~LN~~LN~~LN~~LN~~LN~~LN~~ULLLULLLLN~~LN~~LN~~LN~~LN~~LN~~LN~~LN~~ULLLULLL!");
    }

    @Test
    public void test12960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12960");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!", "EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
    }

    @Test
    public void test12961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12961");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\276~\300\300\276\276\276\276~\300\300\276\276!!\276\276~\300\300\276\276\276\276~\300\300\276\276!!\276\276~\300\300\276\276\276\276~\300\300\276\276!!\276\276~\300\300\276\276\276\276~\300\300\276\276!!\276\276~\300\300\276\276\276\276~\300\300\276\276!!\276\276~\300\300\276\276\276\276~\300\300\276\276!!\276\276~\300\300\276\276\276\276~\300\300\276\276!!\276\276~\300\300\276\276\276\276~\300\300\276\276!!!", "\226]\226\226\226]\226\226!!\226]\226\226\226]\226\226!!\226]\226\226\226]\226\226\226]\226\226\226]\226\226!!\226]\226\226\226]\226\226!!\226]\226\226\226]\226\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276~nullnull\276\276\276\276~nullnull\276\276!!\276\276~nullnull\276\276\276\276~nullnull\276\276!!\276\276~nullnull\276\276\276\276~nullnull\276\276!!\276\276~nullnull\276\276\276\276~nullnull\276\276!!\276\276~nullnull\276\276\276\276~nullnull\276\276!!\276\276~nullnull\276\276\276\276~nullnull\276\276!!\276\276~nullnull\276\276\276\276~nullnull\276\276!!\276\276~nullnull\276\276\276\276~nullnull\276\276!!!" + "'", str2, "\276\276~nullnull\276\276\276\276~nullnull\276\276!!\276\276~nullnull\276\276\276\276~nullnull\276\276!!\276\276~nullnull\276\276\276\276~nullnull\276\276!!\276\276~nullnull\276\276\276\276~nullnull\276\276!!\276\276~nullnull\276\276\276\276~nullnull\276\276!!\276\276~nullnull\276\276\276\276~nullnull\276\276!!\276\276~nullnull\276\276\276\276~nullnull\276\276!!\276\276~nullnull\276\276\276\276~nullnull\276\276!!!");
    }

    @Test
    public void test12962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12962");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]]]]]]]]]]]]]]]\200}}]]]]]]]]]]]]]]]]\200}}]]]]]]]]]]]]]]]]\200}}]]]]]]]]]]]]]]]]\200}}]]]]]]]]]]]]]]]]\200}}]]]]]]]]]]]]]]]]\200}}]]]]]]]]]]]]]]]]\200}}]]]]]]]]]]]]]]]]\200}}!", "\u02c9\u02c9\u02cc\u02cc\u02c9\u02c9\u02cc\u02cc\u02c9\u02c9\u02cc\u02cc\u02c9\u02c9\u02cc\u02cc\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]]]]]]]]]]]]]\200}}]]]]]]]]]]]]]]]]\200}}]]]]]]]]]]]]]]]]\200}}]]]]]]]]]]]]]]]]\200}}]]]]]]]]]]]]]]]]\200}}]]]]]]]]]]]]]]]]\200}}]]]]]]]]]]]]]]]]\200}}]]]]]]]]]]]]]]]]\200}}!" + "'", str2, "]]]]]]]]]]]]]]]]\200}}]]]]]]]]]]]]]]]]\200}}]]]]]]]]]]]]]]]]\200}}]]]]]]]]]]]]]]]]\200}}]]]]]]]]]]]]]]]]\200}}]]]]]]]]]]]]]]]]\200}}]]]]]]]]]]]]]]]]\200}}]]]]]]]]]]]]]]]]\200}}!");
    }

    @Test
    public void test12963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12963");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0240\u0240!", "NLLLNLLLnullnullnullnullnullnullnullnullNLLLNLLLnullnullnullnullnullnullnullnullNLLLNLLLnullnullnullnullnullnullnullnullNLLLNLLLnullnullnullnullnullnullnullnullNLLLNLLLnullnullnullnullnullnullnullnullNLLLNLLLnullnullnullnullnullnullnullnullNLLLNLLLnullnullnullnullnullnullnullnullNLLLNLLLnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!" + "'", str2, "nullnull!");
    }

    @Test
    public void test12964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12964");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("F!HHF!HHF!HHF!HHF!HHF!HHF!HHF!HH!", "\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\225\225!!\225\225!!\225\225!!\225\225!!\225\225!!\225\225!!\225\225!!\225\225!" + "'", str2, "!!\225\225!!\225\225!!\225\225!!\225\225!!\225\225!!\225\225!!\225\225!!\225\225!");
    }

    @Test
    public void test12965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12965");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\215}\215\215\215}\215\215\u026e\u026e\u026e\u026e\u026e\u026e\u026e\u026e\u026e\u026e\u026e\u026e\215}\215\215\215}\215\215!", "\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215~nullnullnull~nullnullnull~nullnullnull~nullnullnull\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215~nullnullnull~nullnullnull~nullnullnull~nullnullnull\215}\215\215\215}\215\215!");
    }

    @Test
    public void test12966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12966");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269!", "!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!" + "'", str2, "!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!");
    }

    @Test
    public void test12967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12967");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\367!nullnull\367!nullnull!", "\u0366\u0365\u0368\u0368\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\367\u0348\275\u0348\275!!\367\u0348\275\u0348\275!!!" + "'", str2, "\367\u0348\275\u0348\275!!\367\u0348\275\u0348\275!!!");
    }

    @Test
    public void test12968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12968");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!\200\200\u0346\u0348\u0348!", "LL``LL``LL``LL``LL``LL``LL``LL``!!LL``LL``LL``LL``LL``LL``LL``LL``!!LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``!!LL``LL``LL``LL``LL``LL``LL``LL``!!LL``LL``LL``LL``LL``LL``LL``LL``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```!!L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```!!L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```L```!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test12969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12969");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fanullnull!", "HH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02faHHHHHHHH!" + "'", str2, "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02faHHHHHHHH!");
    }

    @Test
    public void test12970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12970");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test12971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12971");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12972");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!" + "'", str2, "\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!");
    }

    @Test
    public void test12973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12973");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("``nullnullnullnull``!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull``!" + "'", str2, "``nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull``!");
    }

    @Test
    public void test12974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12974");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12975");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\u0108\u0108\u0108\275\u0108\u0108\u0108!", "\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a\u014e\u0318\u031a\u031a!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275UUU\275UUU!" + "'", str2, "\275UUU\275UUU!");
    }

    @Test
    public void test12976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12976");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0150\u0150!", "!!xxxx!!!!!!xxxx!!!!!!!!xxxx!!!!!!xxxx!!!!!!!!xxxx!!!!!!xxxx!!!!!!!!xxxx!!!!!!xxxx!!!!!!!!xxxx!!!!!!xxxx!!!!!!!!xxxx!!!!!!xxxx!!!!!!!!xxxx!!!!!!xxxx!!!!!!!!xxxx!!!!!!xxxx!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!nullnull!" + "'", str2, "!!!nullnull!");
    }

    @Test
    public void test12977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12977");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("XXXXXXXX!!XXXXXXXX!!XXXXXXXXXXXXXXXX!!XXXXXXXX!!XXXXXXXX!", "\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9!" + "'", str2, "\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9\u01a9!");
    }

    @Test
    public void test12978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12978");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("L!!!L!!!!!L!!!L!!!!!!!L!!!L!!!!!L!!!L!!!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!!!L!!!L!!!!!L!!!L!!!!!!!L!!!L!!!!!L!!!L!!!!!!", "\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\200\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151\u0151]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!!!null!!!null!!!!!!!null!!!null!!!!!null!!!null!!!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!!!null!!!null!!!!!null!!!null!!!!!!!null!!!null!!!!!null!!!null!!!!!!" + "'", str2, "null!!!null!!!!!null!!!null!!!!!!!null!!!null!!!!!null!!!null!!!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!!!null!!!null!!!!!null!!!null!!!!!!!null!!!null!!!!!null!!!null!!!!!!");
    }

    @Test
    public void test12979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12979");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0128\u0128\u0128\u0128\u0346\u0348\u0348!", "null\220~~null\220~~!!null\220~~null\220~~!!null\220~~null\220~~!!null\220~~null\220~~!!null\220~~null\220~~!!null\220~~null\220~~!!null\220~~null\220~~!!null\220~~null\220~~!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test12980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12980");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196!", "nullnullnullnullnullnullnull\200\200\200nullnullnullnullnullnullnull\200\200\200]]nullnullnullnullnullnullnull\200\200\200nullnullnullnullnullnullnull\200\200\200]]nullnullnullnullnullnullnull\200\200\200nullnullnullnullnullnullnull\200\200\200]]nullnullnullnullnullnullnull\200\200\200nullnullnullnullnullnullnull\200\200\200]]~}}^nullnullnullnullnullnullnull\200\200\200nullnullnullnullnullnullnull\200\200\200]]nullnullnullnullnullnullnull\200\200\200nullnullnullnullnullnullnull\200\200\200]]nullnullnullnullnullnullnull\200\200\200nullnullnullnullnullnullnull\200\200\200]]nullnullnullnullnullnullnull\200\200\200nullnullnullnullnullnullnull\200\200\200]]]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f!nullnull!" + "'", str2, "\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f\u025c\u025d\u025f\u025f!nullnull!");
    }

    @Test
    public void test12981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12981");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214!", "L!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214!" + "'", str2, "\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214!");
    }

    @Test
    public void test12982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12982");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\253\u0348\u0346\u0346!", "\u0346\u0348\u0348\u0348LL\200LLL\200LLL\200\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\253\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\253\u0348\u0346\u0346!");
    }

    @Test
    public void test12983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12983");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276`\275\275\276`\275\275\276`\275\275\276`\275\275\276`\275\275\276`\275\275\276`\275\275\276`\275\275!", "UUXXUUXXXXUUXXUUXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276`\275\275\276`\275\275\276`\275\275\276`\275\275\276`\275\275\276`\275\275\276`\275\275\276`\275\275!" + "'", str2, "\276`\275\275\276`\275\275\276`\275\275\276`\275\275\276`\275\275\276`\275\275\276`\275\275\276`\275\275!");
    }

    @Test
    public void test12984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12984");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``!", "MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!``!null!!!null!!!``null!!!null!!!``null!!!null!!!``!null!!!null!!!``null!!!null!!!``null!!!null!!!``!null!!!null!!!``null!!!null!!!``null!!!null!!!``!null!!!null!!!``null!!!null!!!``null!!!null!!!``!null!!!null!!!``null!!!null!!!``null!!!null!!!``!null!!!null!!!``null!!!null!!!``null!!!null!!!``!null!!!null!!!``null!!!null!!!``null!!!null!!!``!null!!!null!!!``null!!!null!!!``!" + "'", str2, "null!!!null!!!``!null!!!null!!!``null!!!null!!!``null!!!null!!!``!null!!!null!!!``null!!!null!!!``null!!!null!!!``!null!!!null!!!``null!!!null!!!``null!!!null!!!``!null!!!null!!!``null!!!null!!!``null!!!null!!!``!null!!!null!!!``null!!!null!!!``null!!!null!!!``!null!!!null!!!``null!!!null!!!``null!!!null!!!``!null!!!null!!!``null!!!null!!!``null!!!null!!!``!null!!!null!!!``null!!!null!!!``!");
    }

    @Test
    public void test12985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12985");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!LNNNLNNNLNNNLNNN!", "\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016dnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0170\u016c\u016c\u016c\u0170\u016c\u016c\u016c\u0170\u016c\u016c\u016c\u0170\u016c\u016c\u016c!" + "'", str2, "\u0170\u016c\u016c\u016c\u0170\u016c\u016c\u016c\u0170\u016c\u016c\u016c\u0170\u016c\u016c\u016c!");
    }

    @Test
    public void test12986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12986");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230\200}}`UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230]]!", "!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!!!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230\200}}`!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230]]!" + "'", str2, "!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230\200}}`!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230]]!");
    }

    @Test
    public void test12987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12987");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!" + "'", str2, "!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!");
    }

    @Test
    public void test12988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12988");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("fehhfehhfehhfehhfehhfehhfehhfehh!", "!\274\274\274\274\274\274\274\274\274\274\274\274\274\274\274\274!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test12989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12989");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("U}}}U}}}U}}}U}}}~U}}}U}}}U}}}U}}}U}}}U}}}~U}}}U}}}!!U}}}U}}}U}}}U}}}~U}}}U}}}U}}}U}}}U}}}U}}}~U}}}U}}}!!U}}}U}}}U}}}U}}}~U}}}U}}}U}}}U}}}U}}}U}}}~U}}}U}}}U}}}U}}}U}}}U}}}~U}}}U}}}U}}}U}}}U}}}U}}}~U}}}U}}}!!U}}}U}}}U}}}U}}}~U}}}U}}}U}}}U}}}U}}}U}}}~U}}}U}}}!!U}}}U}}}U}}}U}}}~U}}}U}}}U}}}U}}}U}}}U}}}~U}}}U}}}!", "!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null}}}null}}}null}}}null}}}~null}}}null}}}null}}}null}}}null}}}null}}}~null}}}null}}}!!null}}}null}}}null}}}null}}}~null}}}null}}}null}}}null}}}null}}}null}}}~null}}}null}}}!!null}}}null}}}null}}}null}}}~null}}}null}}}null}}}null}}}null}}}null}}}~null}}}null}}}null}}}null}}}null}}}null}}}~null}}}null}}}null}}}null}}}null}}}null}}}~null}}}null}}}!!null}}}null}}}null}}}null}}}~null}}}null}}}null}}}null}}}null}}}null}}}~null}}}null}}}!!null}}}null}}}null}}}null}}}~null}}}null}}}null}}}null}}}null}}}null}}}~null}}}null}}}!" + "'", str2, "null}}}null}}}null}}}null}}}~null}}}null}}}null}}}null}}}null}}}null}}}~null}}}null}}}!!null}}}null}}}null}}}null}}}~null}}}null}}}null}}}null}}}null}}}null}}}~null}}}null}}}!!null}}}null}}}null}}}null}}}~null}}}null}}}null}}}null}}}null}}}null}}}~null}}}null}}}null}}}null}}}null}}}null}}}~null}}}null}}}null}}}null}}}null}}}null}}}~null}}}null}}}!!null}}}null}}}null}}}null}}}~null}}}null}}}null}}}null}}}null}}}null}}}~null}}}null}}}!!null}}}null}}}null}}}null}}}~null}}}null}}}null}}}null}}}null}}}null}}}~null}}}null}}}!");
    }

    @Test
    public void test12990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12990");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!", "U!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!" + "'", str2, "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!");
    }

    @Test
    public void test12991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12991");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!", "\276\u022enullnull\266\266\u022e\u022enullnull\276\u022enullnull\266\266\u022e\u022enullnull!!\276\u022enullnull\266\266\u022e\u022enullnull\276\u022enullnull\266\266\u022e\u022enullnull!!\276\u022enullnull\266\266\u022e\u022enullnull\276\u022enullnull\266\266\u022e\u022enullnull\276\u022enullnull\266\266\u022e\u022enullnull\276\u022enullnull\266\266\u022e\u022enullnull!!\276\u022enullnull\266\266\u022e\u022enullnull\276\u022enullnull\266\266\u022e\u022enullnull!!\276\u022enullnull\266\266\u022e\u022enullnull\276\u022enullnull\266\266\u022e\u022enullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test12992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12992");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^``!", "nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^``!" + "'", str2, "`^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^``!");
    }

    @Test
    public void test12993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12993");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\200\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106]]!", "\u0366\u0365\u0368\u0368!\253\256\256\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test12994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12994");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]U!!]U!!!!]U!!]U!!!!]U!!]U!!]U!!]U!!!!]U!!]U!!!!]U!!]U!!!", "\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]null!!]null!!!!]null!!]null!!!!]null!!]null!!]null!!]null!!!!]null!!]null!!!!]null!!]null!!!" + "'", str2, "]null!!]null!!!!]null!!]null!!!!]null!!]null!!]null!!]null!!!!]null!!]null!!!!]null!!]null!!!");
    }

    @Test
    public void test12995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12995");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12996");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL\275\275LL\275\275!!LL\275\275LL\275\275!!LL\275\275LL\275\275!!LL\275\275LL\275\275!!LL\275\275LL\275\275!!LL\275\275LL\275\275!!LL\275\275LL\275\275!!LL\275\275LL\275\275!!!", "^```^```^```^```^```^```^```^```^```^```HHHHHHHH\225\225HHHHHHHH\225\225^```^```HHHHHHHH\225\225HHHHHHHH\225\225^```^```^```^```^```^```^```^```^```^```HHHHHHHH\225\225HHHHHHHH\225\225^```^```HHHHHHHH\225\225HHHHHHHH\225\225^```^```^```^```^```^```^```^```^```^```HHHHHHHH\225\225HHHHHHHH\225\225^```^```HHHHHHHH\225\225HHHHHHHH\225\225^```^```^```^```^```^```^```^```^```^```HHHHHHHH\225\225HHHHHHHH\225\225^```^```HHHHHHHH\225\225HHHHHHHH\225\225^```^```^```^```^```^```^```^```^```^```HHHHHHHH\225\225HHHHHHHH\225\225^```^```HHHHHHHH\225\225HHHHHHHH\225\225^```^```^```^```^```^```^```^```^```^```HHHHHHHH\225\225HHHHHHHH\225\225^```^```HHHHHHHH\225\225HHHHHHHH\225\225^```^```^```^```^```^```^```^```^```^```HHHHHHHH\225\225HHHHHHHH\225\225^```^```HHHHHHHH\225\225HHHHHHHH\225\225^```^```^```^```^```^```^```^```^```^```HHHHHHHH\225\225HHHHHHHH\225\225^```^```HHHHHHHH\225\225HHHHHHHH\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``\275\275``\275\275!!``\275\275``\275\275!!``\275\275``\275\275!!``\275\275``\275\275!!``\275\275``\275\275!!``\275\275``\275\275!!``\275\275``\275\275!!``\275\275``\275\275!!!" + "'", str2, "``\275\275``\275\275!!``\275\275``\275\275!!``\275\275``\275\275!!``\275\275``\275\275!!``\275\275``\275\275!!``\275\275``\275\275!!``\275\275``\275\275!!``\275\275``\275\275!!!");
    }

    @Test
    public void test12997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12997");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!", "}\200\200\200\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320}\200\200\200\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320}\200\200\200\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320}\200\200\200\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320}\200\200\200\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320}\200\200\200\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320}\200\200\200\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320}\200\200\200\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d!!!!" + "'", str2, "\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d\u031d!!!!");
    }

    @Test
    public void test12998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12998");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014enullnull!", "]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256!!]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256!!]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256!!]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256!!]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256!!]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256!!]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256!!]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~\256]\253\253\256]\253\253~~\256]\253\253\256]\253\253~~\256]\253\253\256]\253\253~~\256]\253\253\256]\253\253~~\256]\253\253\256]\253\253~~\256]\253\253\256]\253\253~~\256]\253\253\256]\253\253~~\256]\253\253\256]\253\253!" + "'", str2, "~~\256]\253\253\256]\253\253~~\256]\253\253\256]\253\253~~\256]\253\253\256]\253\253~~\256]\253\253\256]\253\253~~\256]\253\253\256]\253\253~~\256]\253\253\256]\253\253~~\256]\253\253\256]\253\253~~\256]\253\253\256]\253\253!");
    }

    @Test
    public void test12999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12999");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull!", "\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test13000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test13000");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\275LL\276\275LL\214\214\276\275LL\276\275LL\214\214\276\275LL\276\275LL\214\214\276\275LL\276\275LL\214\214\276\275LL\276\275LL\214\214\276\275LL\276\275LL\214\214\276\275LL\276\275LL\214\214\276\275LL\276\275LL\214\214!", "ORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\275nullnull\276\275nullnull\214\214\276\275nullnull\276\275nullnull\214\214\276\275nullnull\276\275nullnull\214\214\276\275nullnull\276\275nullnull\214\214\276\275nullnull\276\275nullnull\214\214\276\275nullnull\276\275nullnull\214\214\276\275nullnull\276\275nullnull\214\214\276\275nullnull\276\275nullnull\214\214!" + "'", str2, "\276\275nullnull\276\275nullnull\214\214\276\275nullnull\276\275nullnull\214\214\276\275nullnull\276\275nullnull\214\214\276\275nullnull\276\275nullnull\214\214\276\275nullnull\276\275nullnull\214\214\276\275nullnull\276\275nullnull\214\214\276\275nullnull\276\275nullnull\214\214\276\275nullnull\276\275nullnull\214\214!");
    }
}
